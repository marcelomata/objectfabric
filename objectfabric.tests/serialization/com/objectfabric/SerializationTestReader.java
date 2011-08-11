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

public class SerializationTestReader extends com.objectfabric.SerializationTest.TestReader {

    private int _index;

    @Override
    public void run() {
        for (;;) {
            switch (_index) {
                case 0: {
                    if (!canReadBoolean())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readBoolean()) == (false));
                    break;
                }
                case 1: {
                    if (!canReadBoolean())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readBoolean()) == (true));
                    break;
                }
                case 2: {
                    if (!canReadBooleanBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readBooleanBoxed()) == (null));
                    break;
                }
                case 3: {
                    if (!canReadBooleanBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readBooleanBoxed()).equals(Boolean.TRUE));
                    break;
                }
                case 4: {
                    if (!canReadBooleanBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readBooleanBoxed()).equals(Boolean.FALSE));
                    break;
                }
                case 5: {
                    if (!canReadByte())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readByte()) == (((byte) 0)));
                    break;
                }
                case 6: {
                    if (!canReadByte())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readByte()) == (java.lang.Byte.MAX_VALUE));
                    break;
                }
                case 7: {
                    if (!canReadByte())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readByte()) == (java.lang.Byte.MIN_VALUE));
                    break;
                }
                case 8: {
                    if (!canReadByteBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readByteBoxed()) == (null));
                    break;
                }
                case 9: {
                    if (!canReadCharacter())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readCharacter()) == ('\0'));
                    break;
                }
                case 10: {
                    if (!canReadCharacter())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readCharacter()) == (java.lang.Character.MAX_VALUE));
                    break;
                }
                case 11: {
                    if (!canReadCharacter())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readCharacter()) == (java.lang.Character.MIN_VALUE));
                    break;
                }
                case 12: {
                    if (!canReadCharacterBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readCharacterBoxed()) == (null));
                    break;
                }
                case 13: {
                    if (!canReadShort())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readShort()) == (((short) 0)));
                    break;
                }
                case 14: {
                    if (!canReadShort())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readShort()) == (java.lang.Short.MAX_VALUE));
                    break;
                }
                case 15: {
                    if (!canReadShort())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readShort()) == (java.lang.Short.MIN_VALUE));
                    break;
                }
                case 16: {
                    if (!canReadShortBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readShortBoxed()) == (null));
                    break;
                }
                case 17: {
                    if (!canReadInteger())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readInteger()) == (0));
                    break;
                }
                case 18: {
                    if (!canReadInteger())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readInteger()) == (java.lang.Integer.MAX_VALUE));
                    break;
                }
                case 19: {
                    if (!canReadInteger())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readInteger()) == (java.lang.Integer.MIN_VALUE));
                    break;
                }
                case 20: {
                    if (!canReadIntegerBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readIntegerBoxed()) == (null));
                    break;
                }
                case 21: {
                    if (!canReadLong())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readLong()) == (0));
                    break;
                }
                case 22: {
                    if (!canReadLong())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readLong()) == (java.lang.Long.MAX_VALUE));
                    break;
                }
                case 23: {
                    if (!canReadLong())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readLong()) == (java.lang.Long.MIN_VALUE));
                    break;
                }
                case 24: {
                    if (!canReadLongBoxed())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readLongBoxed()) == (null));
                    break;
                }
                case 25: {
                    float value = readFloat();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (0));
                    break;
                }
                case 26: {
                    float value = readFloat();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (java.lang.Float.MAX_VALUE));
                    break;
                }
                case 27: {
                    float value = readFloat();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (java.lang.Float.MIN_VALUE));
                    break;
                }
                case 28: {
                    java.lang.Float value = readFloatBoxed();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (null));
                    break;
                }
                case 29: {
                    double value = readDouble();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (0));
                    break;
                }
                case 30: {
                    double value = readDouble();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (java.lang.Double.MAX_VALUE));
                    break;
                }
                case 31: {
                    double value = readDouble();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (java.lang.Double.MIN_VALUE));
                    break;
                }
                case 32: {
                    java.lang.Double value = readDoubleBoxed();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (null));
                    break;
                }
                case 33: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (null));
                    break;
                }
                case 34: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(""));
                    break;
                }
                case 35: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals("\u0000"));
                    break;
                }
                case 36: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals("\u00FF"));
                    break;
                }
                case 37: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals("\u0AFF"));
                    break;
                }
                case 38: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals("\u7FFF"));
                    break;
                }
                case 39: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals("\uFFFF"));
                    break;
                }
                case 40: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals("$^%���%��%���%�"));
                    break;
                }
                case 41: {
                    java.lang.String value = readString();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals("ffqsdfqfezghrtghrgrfgzefzeqfzeqfqzefqzefqzefqzeefqzefqzefsdqfsdghfgzegqzefqsdfqzefqezfqzefqze'"));
                    break;
                }
                case 42: {
                    if (!canReadDate())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readDate()) == (null));
                    break;
                }
                case 43: {
                    if (!canReadDate())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readDate()).equals(new java.util.Date(4558621531843L)));
                    break;
                }
                case 44: {
                    if (!canReadDate())
                        return;

                    com.objectfabric.misc.Debug.assertAlways((readDate()).equals(new java.util.Date(0)));
                    break;
                }
                case 45: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (null));
                    break;
                }
                case 46: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("0")));
                    break;
                }
                case 47: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("-0")));
                    break;
                }
                case 48: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("45")));
                    break;
                }
                case 49: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("-45")));
                    break;
                }
                case 50: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("1237987")));
                    break;
                }
                case 51: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("-1237987")));
                    break;
                }
                case 52: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("1237987898798797464864181688684513518313131813113513")));
                    break;
                }
                case 53: {
                    java.math.BigInteger value = readBigInteger();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigInteger("-1237987898798797464864181688684513518313131813113513")));
                    break;
                }
                case 54: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value == (null));
                    break;
                }
                case 55: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "0")));
                    break;
                }
                case 56: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "-0")));
                    break;
                }
                case 57: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "45")));
                    break;
                }
                case 58: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "-45")));
                    break;
                }
                case 59: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "123798789879879.456464")));
                    break;
                }
                case 60: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "-123798789879879.456464")));
                    break;
                }
                case 61: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "0.000000000000078")));
                    break;
                }
                case 62: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "-0.000000000000078")));
                    break;
                }
                case 63: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "2.0e5")));
                    break;
                }
                case 64: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "-2.0e5")));
                    break;
                }
                case 65: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "789.046544654846468789486e13")));
                    break;
                }
                case 66: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "-789.046544654846468789486e13")));
                    break;
                }
                case 67: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "789.046544654846468789486e-13")));
                    break;
                }
                case 68: {
                    java.math.BigDecimal value = readDecimal();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(value.equals(new java.math.BigDecimal( "-789.046544654846468789486e-13")));
                    break;
                }
                case 69: {
                    byte[] value = readBinary();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(java.util.Arrays.equals(value, null));
                    break;
                }
                case 70: {
                    byte[] value = readBinary();

                    if (interrupted())
                        return;

                    com.objectfabric.misc.Debug.assertAlways(java.util.Arrays.equals(value, new byte[] { 45, 88 }));
                    break;
                }
                default:
                    return;
            }

            _index++;
        }
    }

    @Override
    public boolean isDone() {
        return _index == 71;
    }
}
