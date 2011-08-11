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
 * Sparse array to avoid allocating a new array the same length as the TArray each time an
 * update is done to it.
 */
class TArrayVersionFloat extends TIndexedNVersion {

    private float[][] _values;

    private static final TType[] _genericParameters = new TType[] { new TType(ImmutableClass.FLOAT) };

    private static final boolean CAN_BE_TOBJECT = false;

    public TArrayVersionFloat(TObject.Version shared, int length) {
        super(shared, length);

        if (shared == null) {
            // Preallocate (C.f. TIndexedNVersion._writes)
            int arrayLength = getBits().length;
            _values = new float[arrayLength][];
        }
    }

    public final float[][] getValues() {
        return _values;
    }

    public final void setValues(float[][] value) {
        _values = value;
    }

    @Override
    public final TType[] getGenericParameters() {
        return _genericParameters;
    }

    public final float get(int index) {
        if (_values != null) {
            int foldedIndex = com.objectfabric.misc.Bits.getFoldedIntIndexFromIndex(getBits(), index);

            if (foldedIndex >= 0) {
                float[] current = _values[foldedIndex];

                if (current != null)
                    return current[index & com.objectfabric.misc.Bits.BIT_INDEX_MASK];
            }
        }

        return 0;
    }

    @Override
    public final Object getAsObject(int index) {
        return get(index);
    }

    public final void set(int index, float value) {
        if (_values == null) {
            if (value != 0) {
                int arrayLength = getBits().length;
                _values = new float[arrayLength][];
            }
        } else {
            if (com.objectfabric.misc.Debug.ENABLED)
                com.objectfabric.misc.Debug.assertion(_values.length == getBits().length);
        }

        if (_values != null) {
            int folded = com.objectfabric.misc.Bits.getFoldedIntIndexFromIndex(getBits(), index);

            if (_values[folded] == null) {
                if (value != 0) {
                    int arrayLength = com.objectfabric.misc.Bits.BITS_PER_UNIT;
                    _values[folded] = new float[arrayLength];
                }
            }

            if (_values[folded] != null)
                _values[folded][index & com.objectfabric.misc.Bits.BIT_INDEX_MASK] = value;
        }
    }

    @SuppressWarnings("cast")
    @Override
    public final void setAsObject(int index, Object value) {
        set(index, (Float) value);
    }

    @Override
    public final void reindexed(com.objectfabric.misc.Bits.Entry[] old) {
        if (_values != null) {
            float[][] oldValues = _values;
            int arrayLength = getBits().length;
            _values = new float[arrayLength][];

            for (int i = old.length - 1; i >= 0; i--) {
                if (old[i] != null) {
                    int intIndex = old[i].IntIndex;
                    int folded = com.objectfabric.misc.Bits.getFoldedIntIndexFromIntIndex(getBits(), intIndex);

                    if (com.objectfabric.misc.Debug.ENABLED)
                        com.objectfabric.misc.Debug.assertion(_values[folded] == null);

                    _values[folded] = oldValues[i];
                }
            }
        }
    }

    @Override
    public TObject.Version merge(TObject.Version target, TObject.Version next, int flags) {
        com.objectfabric.misc.Bits.Entry[] debug = getBits();

        TArrayVersionFloat source = (TArrayVersionFloat) next;
        TArrayVersionFloat merged = (TArrayVersionFloat) super.merge(target, next, flags);

        if (com.objectfabric.misc.Debug.ENABLED)
            if (getBits() != debug && getBits() != source.getBits())
                if ((flags & MERGE_FLAG_BY_COPY) == 0)
                    com.objectfabric.misc.Debug.assertion(merged != target);

        merged.merge(source, flags);
        return merged;
    }

    @SuppressWarnings("cast")
    private final void merge(TArrayVersionFloat source, int flags) {
        boolean skip1 = !(CAN_BE_TOBJECT && isShared()) && _values == null;

        if (skip1)
            if (getBits() != null && source.getBits() != null)
                if (getBits().length != source.getBits().length)
                    skip1 = false;

        if (skip1)
            _values = source._values;
        else {
            com.objectfabric.misc.Bits.Entry[] writes = source.getBits();

            if (writes != null) {
                for (int i = writes.length - 1; i >= 0; i--) {
                    if (writes[i] != null && writes[i].Value != 0) {
                        if (_values == null) {
                            int arrayLength = getBits().length;
                            _values = new float[arrayLength][];
                        }

                        int folded = com.objectfabric.misc.Bits.getFoldedIntIndexFromIntIndex(getBits(), writes[i].IntIndex);

                        if (CAN_BE_TOBJECT && isShared()) {
                            if (_values[folded] == null) {
                                int arrayLength = com.objectfabric.misc.Bits.BITS_PER_UNIT;
                                _values[folded] = new float[arrayLength];
                            }

                            Object[] m = (Object[]) (Object) _values[folded];
                            Object[] s = (Object[]) (Object) (source._values != null ? source._values[i] : null);
                            mergeObjects(m, writes[i], s);
                        } else {
                            boolean skip2 = false;

                            if ((flags & MERGE_FLAG_BY_COPY) == 0) {
                                skip2 = _values[folded] == null;

                                if (!skip2) // All overwritten
                                    skip2 = writes[i].Value == -1 && source._values != null && source._values[i] != null;
                            } else if (_values[folded] == null) {
                                int arrayLength = com.objectfabric.misc.Bits.BITS_PER_UNIT;
                                _values[folded] = new float[arrayLength];
                            }

                            if (skip2)
                                _values[folded] = source._values != null ? source._values[i] : null;
                            else
                                merge(_values[folded], writes[i], source._values != null ? source._values[i] : null);
                        }
                    }
                }
            }
        }

        if (com.objectfabric.misc.Debug.ENABLED)
            checkInvariants();
    }

    private final void merge(float[] merged, com.objectfabric.misc.Bits.Entry writes, float[] source) {
        for (int i = com.objectfabric.misc.Bits.BITS_PER_UNIT - 1; i >= 0; i--)
            if (com.objectfabric.misc.Bits.get(writes.Value, i))
                merged[i] = source != null ? source[i] : 0;
    }

    //

    @Override
    public final void writeWrite(Writer writer, int index) {
        if (writer.interrupted())
            writer.resume();

        writer.writeFloat(get(index));

        if (writer.interrupted()) {
            writer.interrupt(null);
            return;
        }
    }

    @Override
    public final void readWrite(Reader reader, int index) {
        if (reader.interrupted())
            reader.resume();

        set(index, reader.readFloat());

        if (reader.interrupted()) {
            reader.interrupt(null);
            return;
        }
    }

    //

    @Override
    public TObject.Version createVersion() {
        return new TArrayVersionFloat(this, length());
    }

    @Override
    public int getClassId() {
        if (com.objectfabric.misc.Debug.ENABLED)
            com.objectfabric.misc.Debug.assertion(length() >= 0);

        return -length() - 1;
    }

    //

    @SuppressWarnings("cast")
    @Override
    public void checkInvariants_() {
        super.checkInvariants_();

        if (getValues() != null) {
            com.objectfabric.misc.Debug.assertion(getValues().length == getBits().length);

            for (int i = 0; i < getValues().length; i++) {
                if (getValues()[i] != null) {
                    for (int t = 0; t < getValues()[i].length; t++) {
                        float value = getValues()[i][t];

                        if (value != 0) {
                            com.objectfabric.misc.Debug.assertion(com.objectfabric.misc.Bits.get(getBits()[i].Value, t));

                            if (isShared())
                                com.objectfabric.misc.Debug.assertion(!(((Object) value) instanceof UserTObject));
                            else
                                com.objectfabric.misc.Debug.assertion(!(((Object) value) instanceof TObject.Version));
                        }
                    }
                }
            }
        }
    }
}
// End (for .NET)
