
package com.objectfabric.vm.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class MethodRef extends com.objectfabric.TGeneratedFields32 {

    public MethodRef() {
        this(com.objectfabric.Transaction.getDefaultTrunk());
    }

    public MethodRef(com.objectfabric.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected MethodRef(com.objectfabric.TObject.Version shared, com.objectfabric.Transaction trunk) {
        super(shared, trunk);
    }

    public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(com.objectfabric.vm.generated.MethodsObjectModel.getInstance(), com.objectfabric.vm.generated.MethodsObjectModel.COM_OBJECTFABRIC_VM_GENERATED_METHODREF_CLASS_ID);

    public final java.lang.String getText() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, TEXT_INDEX);
        java.lang.String value = v != null ? v._text : null;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setText(java.lang.String value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._text = value;
        v.setBit(TEXT_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public static final int TEXT_INDEX = 0;

    public static final java.lang.String TEXT_NAME = "text";

    public static final java.lang.Class TEXT_CLASS = java.lang.String.class;

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
            case TEXT_INDEX:
                return TEXT_NAME;
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
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends com.objectfabric.TGeneratedFields32.Version {

        public java.lang.String _text;

        static {
        }

        public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case TEXT_INDEX:
                    return _text;
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case TEXT_INDEX:
                    _text = (java.lang.String) value;
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
            MethodRef.Version source = (MethodRef.Version) next;
            MethodRef.Version merged = (MethodRef.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(TEXT_INDEX))
                    merged._text = source._text;
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
        public com.objectfabric.TObject.Version createVersion() {
            return new MethodRef.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return com.objectfabric.vm.generated.MethodsObjectModel.COM_OBJECTFABRIC_VM_GENERATED_METHODREF_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public com.objectfabric.ObjectModel getObjectModel() {
            return com.objectfabric.vm.generated.MethodsObjectModel.getInstance();
        }
    }
}
