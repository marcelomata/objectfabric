
package com.objectfabric.examples.indexes.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class ObjectModel extends com.objectfabric.ObjectModel {

    private static final byte[] UID = { -77, -46, 93, 51, 10, -38, -13, -117, 120, 107, 112, -94, -124, -16, 108, 17 };

    private static volatile ObjectModel _instance;

    private static final Object _lock = new Object();

    protected ObjectModel(com.objectfabric.TObject.Version shared) {
        super(shared);
    }

    protected ObjectModel() {
        this(new Version(null));
    }

    public static ObjectModel getInstance() {
        if (_instance == null) {
            synchronized (_lock) {
                if (_instance == null)
                    _instance = new ObjectModel();
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
    public static void registerOverridenModel(ObjectModel model) {
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

    public static final int CLASS_COUNT = 1;

    public static final int COM_OBJECTFABRIC_EXAMPLES_INDEXES_GENERATED_STOREDCLASS_CLASS_ID = 0;

    public static final int METHOD_COUNT = 0;

    @Override
    protected java.lang.Class getClass(int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case COM_OBJECTFABRIC_EXAMPLES_INDEXES_GENERATED_STOREDCLASS_CLASS_ID:
                return com.objectfabric.examples.indexes.generated.StoredClass.class;
        }

        return super.getClass(classId, genericParameters);
    }

    @Override
    protected com.objectfabric.TObject.UserTObject createInstance(com.objectfabric.Transaction trunk, int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case COM_OBJECTFABRIC_EXAMPLES_INDEXES_GENERATED_STOREDCLASS_CLASS_ID:
                return new com.objectfabric.examples.indexes.generated.StoredClass(trunk);
        }

        return super.createInstance(trunk, classId, genericParameters);
    }

    protected static final class Version extends com.objectfabric.ObjectModel.Version {

        public Version(com.objectfabric.ObjectModel.Version shared) {
            super(shared);
        }

        @Override
        public byte[] getUID() {
            return ObjectModel.UID;
        }
    }
}
