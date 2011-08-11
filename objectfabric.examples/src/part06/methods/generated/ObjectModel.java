
package part06.methods.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class ObjectModel extends com.objectfabric.ObjectModel {

    private static final byte[] UID = { -101, 21, 77, 5, 95, 29, -122, 104, 109, -106, 121, -29, -126, -107, 36, 98 };

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

    public static final int PART06_METHODS_GENERATED_MYCLASS_CLASS_ID = 0;

    public static final int METHOD_COUNT = 2;

    public static final int PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_0_ID = 1;

    public static final int PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_1_ID = 2;

    @Override
    protected java.lang.Class getClass(int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case PART06_METHODS_GENERATED_MYCLASS_CLASS_ID:
                return part06.methods.generated.MyClass.class;
            case PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_0_ID:
                return Method0.class;
            case PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_1_ID:
                return Method1.class;
        }

        return super.getClass(classId, genericParameters);
    }

    @Override
    protected com.objectfabric.TObject.UserTObject createInstance(com.objectfabric.Transaction trunk, int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case PART06_METHODS_GENERATED_MYCLASS_CLASS_ID:
                return new part06.methods.generated.MyClass(trunk);
            case PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_0_ID:
                return Method0.INSTANCE;
            case PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_1_ID:
                return Method1.INSTANCE;
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

    public static class Method0 extends com.objectfabric.TGeneratedFields32 implements com.objectfabric.TObject.UserTObject.Method {

        public static final Method0 INSTANCE = new Method0(com.objectfabric.Site.getLocal().getTrunk());

        private Method0(com.objectfabric.Transaction trunk) {
            super(new Version(null, FIELD_COUNT), trunk);
        }

        public String getName() {
            return "start";
        }

        public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(part06.methods.generated.ObjectModel.getInstance(), part06.methods.generated.ObjectModel.PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_0_ID);

        public static final int TEXT_INDEX = 0;

        public static final java.lang.String TEXT_NAME = "text";

        public static final java.lang.Class TEXT_CLASS = java.lang.String.class;

        public static final int RETURN_OBJECTFABRIC_INDEX = 1;

        public static final java.lang.String RETURN_OBJECTFABRIC_NAME = "return_objectfabric";

        public static final java.lang.Class RETURN_OBJECTFABRIC_CLASS = int.class;

        public static final int ERROR_OBJECTFABRIC_INDEX = 2;

        public static final java.lang.String ERROR_OBJECTFABRIC_NAME = "error_objectfabric";

        public static final java.lang.Class ERROR_OBJECTFABRIC_CLASS = java.lang.String.class;

        public static final int FIELD_COUNT = 3;

        @Override
        public int getFieldCount() {
            return FIELD_COUNT;
        }

        @Override
        public java.lang.String getFieldName(int index) {
            return getFieldNameStatic(index);
        }

        @SuppressWarnings("static-access")
        public static java.lang.String getFieldNameStatic(int index) {
            switch (index) {
                case TEXT_INDEX:
                    return TEXT_NAME;
                case RETURN_OBJECTFABRIC_INDEX:
                    return RETURN_OBJECTFABRIC_NAME;
                case ERROR_OBJECTFABRIC_INDEX:
                    return ERROR_OBJECTFABRIC_NAME;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override
        public java.lang.Class getFieldClass(int index) {
            return getFieldClassStatic(index);
        }

        @SuppressWarnings("static-access")
        public static java.lang.Class getFieldClassStatic(int index) {
            switch (index) {
                case TEXT_INDEX:
                    return TEXT_CLASS;
                case RETURN_OBJECTFABRIC_INDEX:
                    return RETURN_OBJECTFABRIC_CLASS;
                case ERROR_OBJECTFABRIC_INDEX:
                    return ERROR_OBJECTFABRIC_CLASS;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public static class Version extends com.objectfabric.TGeneratedFields32.Version {

            public java.lang.String _text;

            public int _return_objectfabric;

            public java.lang.String _error_objectfabric;

            public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
                super(shared, length);
            }

            @Override
            public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
                Method0.Version source = (Method0.Version) next;
                Method0.Version merged = (Method0.Version) super.merge(target, next, flags);

                if (source.hasBits()) {
                    if (source.getBit(TEXT_INDEX))
                        merged._text = source._text;

                    if (source.getBit(RETURN_OBJECTFABRIC_INDEX))
                        merged._return_objectfabric = source._return_objectfabric;

                    if (source.getBit(ERROR_OBJECTFABRIC_INDEX))
                        merged._error_objectfabric = source._error_objectfabric;
                }

                return merged;
            }

            @Override
            public void writeWrite(com.objectfabric.Writer writer, int index) {
                if (writer.interrupted())
                    writer.resume();

                switch (index) {
                    case TEXT_INDEX: {
                        writer.writeString(_text);

                        if (writer.interrupted()) {
                            writer.interrupt(null);
                            return;
                        }
                        break;
                    }
                    case RETURN_OBJECTFABRIC_INDEX: {
                        if (!writer.canWriteInteger()) {
                            writer.interrupt(null);
                            return;
                        }

                        writer.writeInteger(_return_objectfabric);
                        break;
                    }
                    case ERROR_OBJECTFABRIC_INDEX: {
                        writer.writeString(_error_objectfabric);

                        if (writer.interrupted()) {
                            writer.interrupt(null);
                            return;
                        }
                        break;
                    }
                    default: {
                        super.writeWrite(writer, index);

                        if (writer.interrupted()) {
                            writer.interrupt(null);
                            return;
                        }
                        break;
                    }
                }
            }

            @Override
            public void readWrite(com.objectfabric.Reader reader, int index) {
                if (reader.interrupted())
                    reader.resume();

                switch (index) {
                    case TEXT_INDEX: {
                        _text = reader.readString();

                        if (reader.interrupted()) {
                            reader.interrupt(null);
                            return;
                        }
                        break;
                    }
                    case RETURN_OBJECTFABRIC_INDEX: {
                        if (!reader.canReadInteger()) {
                            reader.interrupt(null);
                            return;
                        }

                        _return_objectfabric = reader.readInteger();
                        break;
                    }
                    case ERROR_OBJECTFABRIC_INDEX: {
                        _error_objectfabric = reader.readString();

                        if (reader.interrupted()) {
                            reader.interrupt(null);
                            return;
                        }
                        break;
                    }
                    default: {
                        super.readWrite(reader, index);

                        if (reader.interrupted()) {
                            reader.interrupt(null);
                            return;
                        }
                        break;
                    }
                }
            }

            @Override
            public com.objectfabric.TObject.Version createRead() {
                return null;
            }

            @Override
            public com.objectfabric.TObject.Version createVersion() {
                return new Method0.Version(this, FIELD_COUNT);
            }

            @Override
            public int getClassId() {
                return part06.methods.generated.ObjectModel.PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_0_ID;
            }

            @SuppressWarnings("static-access")
            @Override
            public com.objectfabric.ObjectModel getObjectModel() {
                return part06.methods.generated.ObjectModel.getInstance();
            }
        }
    }

    public static class Method1 extends com.objectfabric.TGeneratedFields32 implements com.objectfabric.TObject.UserTObject.Method {

        public static final Method1 INSTANCE = new Method1(com.objectfabric.Site.getLocal().getTrunk());

        private Method1(com.objectfabric.Transaction trunk) {
            super(new Version(null, FIELD_COUNT), trunk);
        }

        public String getName() {
            return "stop";
        }

        public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(part06.methods.generated.ObjectModel.getInstance(), part06.methods.generated.ObjectModel.PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_1_ID);

        public static final int ERROR_OBJECTFABRIC_INDEX = 0;

        public static final java.lang.String ERROR_OBJECTFABRIC_NAME = "error_objectfabric";

        public static final java.lang.Class ERROR_OBJECTFABRIC_CLASS = java.lang.String.class;

        public static final int FIELD_COUNT = 1;

        @Override
        public int getFieldCount() {
            return FIELD_COUNT;
        }

        @Override
        public java.lang.String getFieldName(int index) {
            return getFieldNameStatic(index);
        }

        @SuppressWarnings("static-access")
        public static java.lang.String getFieldNameStatic(int index) {
            switch (index) {
                case ERROR_OBJECTFABRIC_INDEX:
                    return ERROR_OBJECTFABRIC_NAME;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override
        public java.lang.Class getFieldClass(int index) {
            return getFieldClassStatic(index);
        }

        @SuppressWarnings("static-access")
        public static java.lang.Class getFieldClassStatic(int index) {
            switch (index) {
                case ERROR_OBJECTFABRIC_INDEX:
                    return ERROR_OBJECTFABRIC_CLASS;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public static class Version extends com.objectfabric.TGeneratedFields32.Version {

            public java.lang.String _error_objectfabric;

            public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
                super(shared, length);
            }

            @Override
            public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
                Method1.Version source = (Method1.Version) next;
                Method1.Version merged = (Method1.Version) super.merge(target, next, flags);

                if (source.hasBits()) {
                    if (source.getBit(ERROR_OBJECTFABRIC_INDEX))
                        merged._error_objectfabric = source._error_objectfabric;
                }

                return merged;
            }

            @Override
            public void writeWrite(com.objectfabric.Writer writer, int index) {
                if (writer.interrupted())
                    writer.resume();

                switch (index) {
                    case ERROR_OBJECTFABRIC_INDEX: {
                        writer.writeString(_error_objectfabric);

                        if (writer.interrupted()) {
                            writer.interrupt(null);
                            return;
                        }
                        break;
                    }
                    default: {
                        super.writeWrite(writer, index);

                        if (writer.interrupted()) {
                            writer.interrupt(null);
                            return;
                        }
                        break;
                    }
                }
            }

            @Override
            public void readWrite(com.objectfabric.Reader reader, int index) {
                if (reader.interrupted())
                    reader.resume();

                switch (index) {
                    case ERROR_OBJECTFABRIC_INDEX: {
                        _error_objectfabric = reader.readString();

                        if (reader.interrupted()) {
                            reader.interrupt(null);
                            return;
                        }
                        break;
                    }
                    default: {
                        super.readWrite(reader, index);

                        if (reader.interrupted()) {
                            reader.interrupt(null);
                            return;
                        }
                        break;
                    }
                }
            }

            @Override
            public com.objectfabric.TObject.Version createRead() {
                return null;
            }

            @Override
            public com.objectfabric.TObject.Version createVersion() {
                return new Method1.Version(this, FIELD_COUNT);
            }

            @Override
            public int getClassId() {
                return part06.methods.generated.ObjectModel.PART06_METHODS_GENERATED_OBJECTMODEL_METHOD_1_ID;
            }

            @SuppressWarnings("static-access")
            @Override
            public com.objectfabric.ObjectModel getObjectModel() {
                return part06.methods.generated.ObjectModel.getInstance();
            }
        }
    }
}
