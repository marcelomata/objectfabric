
package finance.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access", "unused" })
public class Instrument extends com.objectfabric.TGeneratedFields32 {

    public Instrument() {
        this(com.objectfabric.Transaction.getDefaultTrunk());
    }

    public Instrument(com.objectfabric.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected Instrument(com.objectfabric.TObject.Version shared, com.objectfabric.Transaction trunk) {
        super(shared, trunk);
    }

    public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(finance.generated.ObjectModel.getInstance(), finance.generated.ObjectModel.FINANCE_GENERATED_INSTRUMENT_CLASS_ID);

    public final java.lang.String getName() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, NAME_INDEX);
        java.lang.String value = v != null ? v._name : null;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setName(java.lang.String value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._name = value;
        v.setBit(NAME_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public final java.lang.String getCUSIP() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, C_U_S_I_P_INDEX);
        java.lang.String value = v != null ? v._CUSIP : null;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setCUSIP(java.lang.String value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._CUSIP = value;
        v.setBit(C_U_S_I_P_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public static final int NAME_INDEX = 0;

    public static final java.lang.String NAME_NAME = "name";

    public static final com.objectfabric.TType NAME_TYPE = com.objectfabric.ImmutableClass.STRING.getType();

    public static final int C_U_S_I_P_INDEX = 1;

    public static final java.lang.String C_U_S_I_P_NAME = "CUSIP";

    public static final com.objectfabric.TType C_U_S_I_P_TYPE = com.objectfabric.ImmutableClass.STRING.getType();

    public static final int FIELD_COUNT = 2;

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
            case NAME_INDEX:
                return NAME_NAME;
            case C_U_S_I_P_INDEX:
                return C_U_S_I_P_NAME;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public  com.objectfabric.TType getFieldType(int index) {
        return getFieldTypeStatic(index);
    }

    @SuppressWarnings("static-access")
    public static com.objectfabric.TType getFieldTypeStatic(int index) {
        switch (index) {
            case NAME_INDEX:
                return NAME_TYPE;
            case C_U_S_I_P_INDEX:
                return C_U_S_I_P_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends com.objectfabric.TGeneratedFields32.Version {

        public java.lang.String _name;

        public java.lang.String _CUSIP;

        static {
        }

        public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case NAME_INDEX:
                    return _name;
                case C_U_S_I_P_INDEX:
                    return _CUSIP;
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case NAME_INDEX:
                    _name = (java.lang.String) value;
                    break;
                case C_U_S_I_P_INDEX:
                    _CUSIP = (java.lang.String) value;
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
            Instrument.Version source = (Instrument.Version) next;
            Instrument.Version merged = (Instrument.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(NAME_INDEX))
                    merged._name = source._name;

                if (source.getBit(C_U_S_I_P_INDEX))
                    merged._CUSIP = source._CUSIP;
            }

            return merged;
        }

        @Override
        public void writeWrite(com.objectfabric.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                case NAME_INDEX: {
                    writer.writeString(_name);

                    if (writer.interrupted()) {
                        writer.interrupt(null);
                        return;
                    }
                    break;
                }
                case C_U_S_I_P_INDEX: {
                    writer.writeString(_CUSIP);

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
                case NAME_INDEX: {
                    _name = reader.readString();

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }
                    break;
                }
                case C_U_S_I_P_INDEX: {
                    _CUSIP = reader.readString();

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
            return new Instrument.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return finance.generated.ObjectModel.FINANCE_GENERATED_INSTRUMENT_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public com.objectfabric.ObjectModel getObjectModel() {
            return finance.generated.ObjectModel.getInstance();
        }
    }
}