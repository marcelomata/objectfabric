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

package com.objectfabric.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class LimitsObjectModel extends com.objectfabric.ObjectModel {

    private static final byte[] UID = { 6, -117, 26, -54, -110, -5, 55, 122, 9, 114, -89, -113, -15, 115, 42, 68 };

    private static volatile LimitsObjectModel _instance;

    private static final Object _lock = new Object();

    protected LimitsObjectModel(com.objectfabric.TObject.Version shared) {
        super(shared);
    }

    protected LimitsObjectModel() {
        this(new Version(null));
    }

    public static LimitsObjectModel getInstance() {
        if (_instance == null) {
            synchronized (_lock) {
                if (_instance == null)
                    _instance = new LimitsObjectModel();
            }
        }

        return _instance;
    }

    public static byte[] getUID() {
        byte[] copy = new byte[UID.length];
        com.objectfabric.misc.PlatformAdapter.arraycopy(UID, 0, copy, 0, copy.length);
        return copy;
    }

    /**
     * Registers this object model so that its classes can be serialized by the
     * system.
     */
    public static void register() {
        register(getInstance());
    }

    /**
     * Registers an object model which can override <code>createInstance</code>
     * to let the system use your own derived classes. This is necessary e.g. to
     * implement remote methods on transactional objects.
     */
    public static void registerOverridenModel(LimitsObjectModel model) {
        synchronized (_lock) {
            if (_instance != null)
                throw new RuntimeException("Object model has already been registered. This method can only be called at program startup.");

            _instance = model;
        }

        register(model);
    }

    @Override
    protected java.lang.String getObjectFabricVersion() {
        return "0.8";
    }

    public static final int CLASS_COUNT = 4;

    public static final int COM_OBJECTFABRIC_GENERATED_LIMIT32_CLASS_ID = 0;

    public static final int COM_OBJECTFABRIC_GENERATED_LIMIT32_MAX_CLASS_ID = 1;

    public static final int COM_OBJECTFABRIC_GENERATED_LIMITN_CLASS_ID = 2;

    public static final int COM_OBJECTFABRIC_GENERATED_LIMITN_MIN_CLASS_ID = 3;

    public static final int METHOD_COUNT = 0;

    @Override
    protected java.lang.Class getClass(int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case COM_OBJECTFABRIC_GENERATED_LIMIT32_CLASS_ID:
                return com.objectfabric.generated.Limit32.class;
            case COM_OBJECTFABRIC_GENERATED_LIMIT32_MAX_CLASS_ID:
                return com.objectfabric.generated.Limit32_max.class;
            case COM_OBJECTFABRIC_GENERATED_LIMITN_CLASS_ID:
                return com.objectfabric.generated.LimitN.class;
            case COM_OBJECTFABRIC_GENERATED_LIMITN_MIN_CLASS_ID:
                return com.objectfabric.generated.LimitN_min.class;
        }

        return super.getClass(classId, genericParameters);
    }

    @Override
    protected com.objectfabric.TObject.UserTObject createInstance(com.objectfabric.Transaction trunk, int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case COM_OBJECTFABRIC_GENERATED_LIMIT32_CLASS_ID:
                return new com.objectfabric.generated.Limit32(trunk);
            case COM_OBJECTFABRIC_GENERATED_LIMIT32_MAX_CLASS_ID:
                return new com.objectfabric.generated.Limit32_max(trunk);
            case COM_OBJECTFABRIC_GENERATED_LIMITN_CLASS_ID:
                return new com.objectfabric.generated.LimitN(trunk);
            case COM_OBJECTFABRIC_GENERATED_LIMITN_MIN_CLASS_ID:
                return new com.objectfabric.generated.LimitN_min(trunk);
        }

        return super.createInstance(trunk, classId, genericParameters);
    }

    protected static final class Version extends com.objectfabric.ObjectModel.Version {

        public Version(com.objectfabric.ObjectModel.Version shared) {
            super(shared);
        }

        @Override
        public byte[] getUID() {
            return LimitsObjectModel.UID;
        }
    }
}
