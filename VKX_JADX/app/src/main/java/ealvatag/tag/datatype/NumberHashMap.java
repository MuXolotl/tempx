package ealvatag.tag.datatype;

import defpackage.AbstractC16446l;
import defpackage.AbstractC5998l;
import defpackage.C10975l;
import defpackage.C11440l;
import defpackage.C11570l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C1770l;
import defpackage.C3316l;
import defpackage.C5299l;
import defpackage.C5501l;
import defpackage.C6180l;
import defpackage.C7026l;
import defpackage.C8339l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import defpackage.InterfaceC5457l;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class NumberHashMap extends NumberFixedLength {
    private boolean hasEmptyValue;
    private final InterfaceC5457l simpleIntStringMap;

    public NumberHashMap(String str, AbstractC16446l abstractC16446l, int i) {
        super(str, abstractC16446l, i);
        byte b = 0;
        this.hasEmptyValue = false;
        str.getClass();
        switch (str.hashCode()) {
            case -1181694867:
                if (!str.equals(DataTypes.OBJ_TIME_STAMP_FORMAT)) {
                    b = -1;
                }
                break;
            case -389131437:
                b = !str.equals(DataTypes.OBJ_CONTENT_TYPE) ? (byte) -1 : (byte) 1;
                break;
            case 395270456:
                b = !str.equals(DataTypes.OBJ_PICTURE_TYPE) ? (byte) -1 : (byte) 2;
                break;
            case 521623794:
                b = !str.equals(DataTypes.OBJ_TYPE_OF_CHANNEL) ? (byte) -1 : (byte) 3;
                break;
            case 816217673:
                b = !str.equals(DataTypes.OBJ_TYPE_OF_EVENT) ? (byte) -1 : (byte) 4;
                break;
            case 1343251611:
                b = !str.equals(DataTypes.OBJ_RECIEVED_AS) ? (byte) -1 : (byte) 5;
                break;
            case 1607314880:
                b = !str.equals(DataTypes.OBJ_TEXT_ENCODING) ? (byte) -1 : (byte) 6;
                break;
            case 1627681669:
                b = !str.equals(DataTypes.OBJ_INTERPOLATION_METHOD) ? (byte) -1 : (byte) 7;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.simpleIntStringMap = C11570l.yandex();
                return;
            case 1:
                this.simpleIntStringMap = C3316l.remoteconfig();
                return;
            case 2:
                this.simpleIntStringMap = C10975l.premium();
                this.hasEmptyValue = true;
                return;
            case 3:
                this.simpleIntStringMap = C7026l.tapsense();
                return;
            case 4:
                this.simpleIntStringMap = C6180l.yandex();
                return;
            case 5:
                this.simpleIntStringMap = C1770l.isPro();
                return;
            case 6:
                this.simpleIntStringMap = C5501l.m1808l();
                return;
            case 7:
                if (C11440l.f23022l == null) {
                    synchronized (C11440l.class) {
                        try {
                            if (C11440l.f23022l == null) {
                                C11440l.f23022l = new C11440l();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                this.simpleIntStringMap = C11440l.f23022l;
                return;
            default:
                C8339l.metrica("Hashmap identifier not defined in this class: ".concat(str));
                throw null;
        }
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NumberHashMap)) {
            return false;
        }
        NumberHashMap numberHashMap = (NumberHashMap) obj;
        return this.hasEmptyValue == numberHashMap.hasEmptyValue && AbstractC5998l.billing(this.simpleIntStringMap, numberHashMap.simpleIntStringMap) && super.equals(numberHashMap);
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength, ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) throws C5299l {
        super.readByteArray(bArr, i);
        int iIntValue = ((Number) this.value).intValue();
        if (this.simpleIntStringMap.mo1044goto(iIntValue)) {
            return;
        }
        if (this.hasEmptyValue) {
            if (this.identifier.equals(DataTypes.OBJ_PICTURE_TYPE)) {
                InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                ((C13975l) interfaceC15756l).getClass();
                int i2 = C17500l.yandex;
                return;
            }
            return;
        }
        String str = this.identifier;
        Locale.getDefault();
        throw new C5299l(str + ":No key could be found with the value of:" + iIntValue);
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength, ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (obj instanceof Byte) {
            this.value = Long.valueOf(((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Short) {
            this.value = Long.valueOf(((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            this.value = Long.valueOf(((Integer) obj).intValue());
        } else {
            this.value = obj;
        }
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength
    public String toString() {
        Object obj = this.value;
        return obj == null ? "" : this.simpleIntStringMap.getValue(((Number) obj).intValue());
    }

    public NumberHashMap(NumberHashMap numberHashMap) {
        super(numberHashMap);
        this.hasEmptyValue = false;
        this.hasEmptyValue = numberHashMap.hasEmptyValue;
        this.simpleIntStringMap = numberHashMap.simpleIntStringMap;
    }
}
