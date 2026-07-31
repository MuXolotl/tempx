package ealvatag.tag.datatype;

import defpackage.AbstractC0653l;
import defpackage.AbstractC1163l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC2812l;
import defpackage.C0869l;
import defpackage.C5299l;
import defpackage.C6541l;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class TempoCode extends AbstractDataType {
    private static final int MAXIMUM_NO_OF_DIGITS = 2;
    private static final int MINIMUM_NO_OF_DIGITS = 1;

    public TempoCode(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l, 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof TempoCode) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return AbstractC1163l.amazon(obj) < 255 ? 1 : 2;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        long j = c0869l.readByte() & 255;
        if (j == 255) {
            j += (long) (c0869l.readByte() & 255);
        }
        this.value = Long.valueOf(j);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) throws C5299l {
        if (bArr == null) {
            C6541l.subs("Byte array is null");
            return;
        }
        if (i < 0) {
            C8339l.metrica(AbstractC0653l.vip(i, "negative offset into an array offset:"));
            return;
        }
        if (i >= bArr.length) {
            StringBuilder sbSignature = AbstractC2812l.Signature("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            sbSignature.append(bArr.length);
            throw new C5299l(sbSignature.toString());
        }
        long j = bArr[i] & 255;
        if (j == 255) {
            j += (long) (bArr[i + 1] & 255);
        }
        this.value = Long.valueOf(j);
    }

    public String toString() {
        Object obj = this.value;
        return obj == null ? "" : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[getSize()];
        long jAmazon = AbstractC1163l.amazon(this.value);
        char c = 0;
        if (jAmazon >= 255) {
            bArr[0] = -1;
            jAmazon -= 255;
            c = 1;
        }
        bArr[c] = (byte) (jAmazon & 255);
        return bArr;
    }

    public TempoCode(TempoCode tempoCode) {
        super(tempoCode);
    }

    public TempoCode(String str, AbstractC16446l abstractC16446l, Object obj) {
        super(str, abstractC16446l, obj);
    }
}
