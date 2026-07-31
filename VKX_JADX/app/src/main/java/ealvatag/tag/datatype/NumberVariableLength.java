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
public class NumberVariableLength extends AbstractDataType {
    private static final int MAXIMUM_NO_OF_DIGITS = 8;
    private static final int MINIMUM_NO_OF_DIGITS = 1;
    int minLength;

    public NumberVariableLength(NumberVariableLength numberVariableLength) {
        super(numberVariableLength);
        this.minLength = 1;
        this.minLength = numberVariableLength.minLength;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof NumberVariableLength) && this.minLength == ((NumberVariableLength) obj).minLength && super.equals(obj);
    }

    public int getMaximumLenth() {
        return 8;
    }

    public int getMinimumLength() {
        return this.minLength;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Object obj = this.value;
        int i = 0;
        if (obj == null) {
            return 0;
        }
        long jAmazon = AbstractC1163l.amazon(obj);
        for (int i2 = 1; i2 <= 8; i2++) {
            if ((((byte) jAmazon) & 255) != 0) {
                i = i2;
            }
            jAmazon >>= 8;
        }
        int i3 = this.minLength;
        return i3 > i ? i3 : i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) throws C5299l {
        long j = c0869l.f2526l;
        long j2 = 0;
        if (j == 0) {
            if (this.minLength != 0) {
                throw new C5299l("No data for value");
            }
            this.value = 0L;
        } else {
            int iMin = (int) Math.min(i, j);
            int i2 = 0;
            while (i2 < iMin) {
                i2++;
                j2 = (j2 << 8) + ((long) (c0869l.readByte() & 255));
            }
            this.value = Long.valueOf(j2);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) throws C5299l {
        if (bArr == null) {
            C6541l.subs("Byte array is null");
            return;
        }
        if (i < 0) {
            C8339l.metrica(AbstractC0653l.vip(i, "negativer offset into an array offset:"));
            return;
        }
        long j = 0;
        if (i >= bArr.length) {
            if (this.minLength == 0) {
                this.value = 0L;
                return;
            } else {
                StringBuilder sbSignature = AbstractC2812l.Signature("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
                sbSignature.append(bArr.length);
                throw new C5299l(sbSignature.toString());
            }
        }
        while (i < bArr.length) {
            long j2 = (j << 8) + ((long) (bArr[i] & 255));
            i++;
            j = j2;
        }
        this.value = Long.valueOf(j);
    }

    public void setMinimumSize(int i) {
        if (i > 0) {
            this.minLength = i;
        }
    }

    public String toString() {
        Object obj = this.value;
        return obj == null ? "" : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        int size = getSize();
        if (size == 0) {
            return new byte[0];
        }
        long jAmazon = AbstractC1163l.amazon(this.value);
        byte[] bArr = new byte[size];
        for (int i = size - 1; i >= 0; i--) {
            bArr[i] = (byte) (255 & jAmazon);
            jAmazon >>= 8;
        }
        return bArr;
    }

    public NumberVariableLength(String str, AbstractC16446l abstractC16446l, int i) {
        super(str, abstractC16446l);
        this.minLength = i;
    }
}
