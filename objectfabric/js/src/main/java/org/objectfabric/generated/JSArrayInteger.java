/**
 * This file is part of ObjectFabric (http://objectfabric.org).
 *
 * ObjectFabric is licensed under the Apache License, Version 2.0, the terms
 * of which may be found at http://www.apache.org/licenses/LICENSE-2.0.html.
 * 
 * Copyright ObjectFabric Inc.
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package org.objectfabric.generated;

import org.objectfabric.IndexListener;
import org.objectfabric.JS.Closure;
import org.objectfabric.JS.External;
import org.objectfabric.JS.Internal;
import org.objectfabric.JSResource;
import org.objectfabric.Resource;
import org.objectfabric.TArrayInteger;
import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportPackage;

//==============================================================================
//
//THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                        
//
//==============================================================================

@Export("arrayInteger")
@ExportPackage("org.objectfabric")
public class JSArrayInteger implements External {

    // TODO back with JS typed arrays?
    public static final class ArrayInternal extends TArrayInteger implements Internal {

        JSArrayInteger _js;

        public ArrayInternal(Resource resource, int length) {
            super(resource, length);
        }

        @Override
        public External external() {
            if (_js == null) {
                _js = new JSArrayInteger();
                _js._internal = this;
            }

            return _js;
        }
    }

    private ArrayInternal _internal;

    public JSArrayInteger(JSResource resource, int length) {
        _internal = new ArrayInternal((Resource) resource.internal(), length);
    }

    private JSArrayInteger() {
    }

    @Override
    public Internal internal() {
        return _internal;
    }

    public int get(int index) {
        return _internal.get(index);
    }

    public int length() {
        return _internal.length();
    }

    public void set(int index, int value) {
        _internal.set(index, value);
    }

    public void onset(final Closure closure) {
        _internal.addListener(new IndexListener() {

            @Override
            public void onSet(int index) {
                closure.runImmutable(index);
            }
        });
    }
}
