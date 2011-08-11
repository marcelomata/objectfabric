/**
 * Copyright (c) ObjectFabric Inc. All rights reserved.
 *
 * This file is part of ObjectFabric (objectfabric.com).
 *
 * ObjectFabric is licensed under the Apache License, Version 2.0, the terms
 * of which may be found at http://www.apache.org/licenses/LICENSE-2.0.html.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.objectfabric;

import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;

import com.objectfabric.TObject.UserTObject;
import com.objectfabric.TObject.UserTObject.LocalMethodCall;
import com.objectfabric.TObject.UserTObject.Method;
import com.objectfabric.TObject.Version;
import com.objectfabric.Transaction.CommitStatus;
import com.objectfabric.misc.Debug;
import com.objectfabric.misc.List;
import com.objectfabric.misc.PlatformThreadLocal;
import com.objectfabric.misc.RuntimeIOException;
import com.objectfabric.misc.RuntimeIOException.StoreCloseException;
import com.objectfabric.misc.ThreadAssert;

/**
 * Handy for setting a filter on Exception Breakpoints so they don't stop on exceptions
 * thrown from here. Also contains blocks with finally as Eclipse stops on finally when
 * exceptions are re-thrown.
 */
final class ExpectedExceptionThrower {

    private static final PlatformThreadLocal<Integer> _expectedExceptions;

    private static volatile boolean _disabled;

    static {
        if (Debug.ENABLED)
            _expectedExceptions = new PlatformThreadLocal<Integer>();
        else
            _expectedExceptions = null;
    }

    private ExpectedExceptionThrower() {
    }

    public static final void disableCounter() {
        if (Debug.ENABLED)
            _disabled = true;
    }

    public static final void enableCounter() {
        if (Debug.ENABLED)
            _disabled = false;
    }

    public static final void expectException() {
        if (Debug.ENABLED) {
            if (!_disabled) {
                Integer value = _expectedExceptions.get();
                _expectedExceptions.set(value != null ? value + 1 : 1);
            }
        }
    }

    private static void onException() {
        if (Debug.ENABLED) {
            if (!_disabled) {
                Integer value = _expectedExceptions.get();
                Debug.assertion(value != null && value > 0);

                if (value != null)
                    _expectedExceptions.set(value - 1);
            }
        }
    }

    public static final void throwUnsupportedOperationException() {
        onException();
        throw new UnsupportedOperationException();
    }

    public static final void throwNoSuchElementException() {
        onException();
        throw new NoSuchElementException();
    }

    public static final void throwNullPointerException() {
        onException();
        throw new NullPointerException();
    }

    public static final void throwIndexOutOfBoundsException() {
        onException();
        throw new IndexOutOfBoundsException();
    }

    public static final void throwRuntimeException(Throwable t) {
        onException();
        throw new RuntimeException(t);
    }

    public static final void throwRuntimeException(String message) {
        onException();
        throw new RuntimeException(message);
    }

    public static final void throwRuntimeIOException() {
        onException();
        throw new RuntimeIOException();
    }

    public static final void throwStoreCloseException() {
        onException();
        throw new StoreCloseException();
    }

    //

    public static final CommitStatus executeTransactionRunnable(Runnable runnable, Transaction transaction) {
        CommitStatus result;
        boolean ok = false;

        try {
            runnable.run();
            ok = true;
        } finally {
            if (ok)
                result = transaction.commit();
            else {
                Transaction.abortsAfterException(transaction);
                result = CommitStatus.ABORT;
            }
        }

        return result;
    }

    public static final Object getCallResult(LocalMethodCall call) throws java.lang.InterruptedException, ExecutionException {
        try {
            Object result = call.superDotGet();
            return result;
        } finally {
            if (Debug.THREADS)
                ThreadAssert.exchangeTake(call);

            if (Debug.ENABLED)
                Debug.assertion(Transaction.getCurrent() == null);

            if (call.getTransaction() != null)
                Transaction.setCurrentUnsafe(call.getTransaction());
        }
    }

    public static final void validateRead(Validator validator, TObject object) {
        try {
            validator.validateRead(object);
        } finally {
            OF.updateAsync();
        }
    }

    public static final void validateWrite(Validator validator, Version[] versions) {
        try {
            for (int i = 0; i < versions.length; i++)
                if (versions[i] != null)
                    validateWrite(validator, versions[i]);
        } finally {
            OF.updateAsync();
        }
    }

    public static final void validateWrite(Validator validator, List<Version> versions) {
        try {
            for (int i = 0; i < versions.size(); i++)
                validateWrite(validator, versions.get(i));
        } finally {
            OF.updateAsync();
        }
    }

    private static final void validateWrite(Validator validator, Version version) {
        if (!(version.getShared().getReference().get() instanceof Method)) {
            UserTObject object = version.getShared().getOrRecreateTObject();
            validator.validateWrite(object);
        }
    }

    public static final void validateCall(Validator validator, UserTObject target, UserTObject method) {
        try {
            validator.validateMethodCall(target, ((Method) method).getName());
        } finally {
            OF.updateAsync();
        }
    }
}