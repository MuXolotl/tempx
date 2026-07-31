package ealvatag.tag.datatype;

import defpackage.AbstractC0653l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC2812l;
import defpackage.C0869l;
import defpackage.C11983l;
import defpackage.C18262l;
import defpackage.C6541l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class BooleanByte extends AbstractDataType {
    private int bitPosition;

    public BooleanByte(String str, AbstractC16446l abstractC16446l, int i) {
        super(str, abstractC16446l);
        this.bitPosition = -1;
        if (i < 0 || i > 7) {
            C18262l.adcel(AbstractC0653l.vip(i, "Bit position needs to be from 0 - 7 : "));
            throw null;
        }
        this.bitPosition = i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof BooleanByte) && this.bitPosition == ((BooleanByte) obj).bitPosition && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return 1;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        this.value = Boolean.valueOf(((byte) (((byte) (c0869l.readByte() >> this.bitPosition)) & 1)) == 1);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            C6541l.subs("Byte array is null");
        } else if (i < 0 || i >= bArr.length) {
            C11983l.mopub(bArr.length, AbstractC2812l.Signature("Offset to byte array is out of bounds: offset = ", i, ", array.length = "));
        } else {
            this.value = Boolean.valueOf(((byte) (((byte) (bArr[i] >> this.bitPosition)) & 1)) == 1);
        }
    }

    public String toString() {
        return "" + this.value;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[1];
        Object obj = this.value;
        if (obj != null) {
            byte b = ((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0;
            bArr[0] = b;
            bArr[0] = (byte) (b << this.bitPosition);
        }
        return bArr;
    }
}
