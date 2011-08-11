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

package com.objectfabric.misc;

import java.util.concurrent.atomic.AtomicReference;

public final class ConcurrentStack<E> {

    private static final class Element {

        public Object Value;

        public Element Next;
    }

    private final AtomicReference<Element> _head = new AtomicReference<Element>();

    public void push(E e) {
        Element element = new Element();
        element.Value = e;

        for (;;) {
            Element current = _head.get();
            element.Next = current;

            if (_head.compareAndSet(current, element))
                return;
        }
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        for (;;) {
            Element current = _head.get();

            if (current == null)
                return null;

            if (_head.compareAndSet(current, current.Next))
                return (E) current.Value;
        }
    }
}
