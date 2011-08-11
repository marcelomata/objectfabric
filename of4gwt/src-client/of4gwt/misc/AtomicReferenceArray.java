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

package of4gwt.misc;

public final class AtomicReferenceArray<T> {

    private T[] _array;

    @SuppressWarnings("unchecked")
    public AtomicReferenceArray(int length) {
        _array = (T[]) new Object[length];
    }

    public int length() {
        return _array.length;
    }

    public T get(int index) {
        return _array[index];
    }

    public void set(int index, T value) {
        _array[index] = value;
    }

    public boolean compareAndSet(int index, T expect, T update) {
        if (_array[index] != expect)
            return false;

        _array[index] = update;
        return true;
    }
}
