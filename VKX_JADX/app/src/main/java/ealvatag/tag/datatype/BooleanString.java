package ealvatag.tag.datatype;

import defpackage.AbstractC16446l;
import defpackage.C0869l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class BooleanString extends AbstractDataType {
    public BooleanString(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof BooleanString) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return 1;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        this.value = Boolean.valueOf(48 != c0869l.readByte());
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        this.value = Boolean.valueOf(bArr[i] != 48);
    }

    public String toString() {
        return "" + this.value;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[1];
        Object obj = this.value;
        if (obj == null) {
            bArr[0] = 48;
            return bArr;
        }
        if (((Boolean) obj).booleanValue()) {
            bArr[0] = 48;
            return bArr;
        }
        bArr[0] = 49;
        return bArr;
    }

    public BooleanString(BooleanString booleanString) {
        super(booleanString);
    }
}
