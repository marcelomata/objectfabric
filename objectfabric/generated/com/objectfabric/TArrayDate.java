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

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                        
//                                                                              
//==============================================================================

/**
 * Transactional array. ObjectFabric generates specialized implementations for every
 * supported immutable type (C.f. <code>ImmutableClass</code>) and TObjects for faster
 * serialization, to avoid boxing for primitive types, and for easier interoperability
 * with .NET generics which require a type at runtime.
 */
@SuppressWarnings("unchecked")
public class TArrayDate extends TIndexed implements Iterable<java.util.Date> {

    @SuppressWarnings("hiding")
    public static final TType TYPE = new TType(DefaultObjectModel.getInstance(), -1, new TType(ImmutableClass.DATE));

    private final int _length;

    private static final boolean IS_TOBJECT = false;

    private static final boolean CAN_BE_TOBJECT = false;

    public TArrayDate(int length) {
        this(Transaction.getDefaultTrunk(), length);
    }

    public TArrayDate(Transaction trunk, int length) {
        super(new TArrayVersionDate(null, length), trunk);

        _length = length;
    }

    /**
     * This constructor is only useful if the object might get replicated to a .NET
     * process, to specify which type would be instantiated by the remote runtime.
     */
    /* generic start public TArrayDate(Transaction trunk, int length, TType genericParam) {
        this(trunk, length);

        if (genericParam != null) {
            if (genericParam.getObjectModel() == null)
                throw new IllegalArgumentException("Generic parameter must be a transactional object.");

            ((TArrayVersionDate) getSharedVersion_objectfabric())._genericParameters = new TType[] { genericParam };
        }
    } generic end */

    public final int length() {
        return _length;
    }

    @SuppressWarnings("cast")
    public final java.util.Date get(int index) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startRead(outer, this);
        java.util.Date value;

        if (IS_TOBJECT) {
            TArrayVersionTObject version = (TArrayVersionTObject ) getTIndexedNVersion_objectfabric(inner, index);
            value = (java.util.Date) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersion version = (TArrayVersion ) getTIndexedNVersion_objectfabric(inner, index);
            value = (java.util.Date) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else {
            TArrayVersionDate version = (TArrayVersionDate) getTIndexedNVersion_objectfabric(inner, index);
            value = version != null ? (java.util.Date) version.get(index) : null;
        }

        Transaction.endRead(outer, inner, this);
        return value;
    }

    /**
     * Return the field as it was when the current transaction started.
     */
    @SuppressWarnings("cast")
    public final java.util.Date getPrevious(int index) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startRead(outer, this);
        java.util.Date value;

        if (IS_TOBJECT) {
            TArrayVersionTObject version = (TArrayVersionTObject ) findTIndexedNPublicVersion(inner, index);
            value = (java.util.Date) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersion version = (TArrayVersion ) findTIndexedNPublicVersion(inner, index);
            value = (java.util.Date) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else {
            TArrayVersionDate version = (TArrayVersionDate) findTIndexedNPublicVersion(inner, index);
            value = version != null ? (java.util.Date) version.get(index) : null;
        }

        Transaction.endRead(outer, inner, this);
        return value;
    }

    @SuppressWarnings("cast")
    public final void set(int index, java.util.Date value) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startWrite(outer, this);

        if (IS_TOBJECT) {
            TArrayVersionTObject version = (TArrayVersionTObject ) getOrCreateVersion_objectfabric(inner);
            version.setBit(index);
            version.setAsObject(index, value);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersion version = (TArrayVersion ) getOrCreateVersion_objectfabric(inner);
            version.setBit(index);
            version.set(index, value);
        } else {
            TArrayVersionDate version = (TArrayVersionDate) getOrCreateVersion_objectfabric(inner);
            version.setBit(index);
            version.set(index, value);
        }

        Transaction.endWrite(outer, inner);
    }

    /* iterator start */

    public final java.util.Iterator<java.util.Date> iterator() {
        return new IteratorImpl();
    }

    private final class IteratorImpl implements java.util.Iterator<java.util.Date> {

        private int _cursor = 0;

        public boolean hasNext() {
            return _cursor != _length;
        }

        public java.util.Date next() {
            java.util.Date value = get(_cursor++);
            return value;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* iterator end */
}
// End (for .NET)
