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

package of4gwt;

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
public class TArrayString extends TIndexed implements Iterable<java.lang.String> {

    @SuppressWarnings("hiding")
    public static final TType TYPE = new TType(DefaultObjectModel.getInstance(), -1, new TType(ImmutableClass.STRING));

    private final int _length;

    private static final boolean IS_TOBJECT = false;

    private static final boolean CAN_BE_TOBJECT = false;

    public TArrayString(int length) {
        this(Transaction.getDefaultTrunk(), length);
    }

    public TArrayString(Transaction trunk, int length) {
        super(new TArrayVersionString(null, length), trunk);

        _length = length;
    }

    /**
     * This constructor is only useful if the object might get replicated to a .NET
     * process, to specify which type would be instantiated by the remote runtime.
     */
    /* generic start public TArrayString(Transaction trunk, int length, TType genericParam) {
        this(trunk, length);

        if (genericParam != null) {
            if (genericParam.getObjectModel() == null)
                throw new IllegalArgumentException("Generic parameter must be a transactional object.");

            ((TArrayVersionString) getSharedVersion_objectfabric())._genericParameters = new TType[] { genericParam };
        }
    } generic end */

    public final int length() {
        return _length;
    }

    @SuppressWarnings("cast")
    public final java.lang.String get(int index) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startRead(outer, this);
        java.lang.String value;

        if (IS_TOBJECT) {
            TArrayVersionTObject version = (TArrayVersionTObject ) getTIndexedNVersion_objectfabric(inner, index);
            value = (java.lang.String) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersion version = (TArrayVersion ) getTIndexedNVersion_objectfabric(inner, index);
            value = (java.lang.String) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else {
            TArrayVersionString version = (TArrayVersionString) getTIndexedNVersion_objectfabric(inner, index);
            value = version != null ? (java.lang.String) version.get(index) : null;
        }

        Transaction.endRead(outer, inner, this);
        return value;
    }

    /**
     * Return the field as it was when the current transaction started.
     */
    @SuppressWarnings("cast")
    public final java.lang.String getPrevious(int index) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startRead(outer, this);
        java.lang.String value;

        if (IS_TOBJECT) {
            TArrayVersionTObject version = (TArrayVersionTObject ) findTIndexedNPublicVersion(inner, index);
            value = (java.lang.String) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersion version = (TArrayVersion ) findTIndexedNPublicVersion(inner, index);
            value = (java.lang.String) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else {
            TArrayVersionString version = (TArrayVersionString) findTIndexedNPublicVersion(inner, index);
            value = version != null ? (java.lang.String) version.get(index) : null;
        }

        Transaction.endRead(outer, inner, this);
        return value;
    }

    @SuppressWarnings("cast")
    public final void set(int index, java.lang.String value) {
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
            TArrayVersionString version = (TArrayVersionString) getOrCreateVersion_objectfabric(inner);
            version.setBit(index);
            version.set(index, value);
        }

        Transaction.endWrite(outer, inner);
    }

    /* iterator start */

    public final java.util.Iterator<java.lang.String> iterator() {
        return new IteratorImpl();
    }

    private final class IteratorImpl implements java.util.Iterator<java.lang.String> {

        private int _cursor = 0;

        public boolean hasNext() {
            return _cursor != _length;
        }

        public java.lang.String next() {
            java.lang.String value = get(_cursor++);
            return value;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* iterator end */
}
// End (for .NET)
