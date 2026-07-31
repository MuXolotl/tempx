package ealvatag.tag.datatype;

import defpackage.AbstractC1163l;
import defpackage.AbstractC12442l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC2812l;
import defpackage.C0869l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C18262l;
import defpackage.C5299l;
import defpackage.C6541l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class NumberFixedLength extends AbstractDataType {
    public NumberFixedLength(String str, AbstractC16446l abstractC16446l, int i) {
        super(str, abstractC16446l);
        AbstractC12442l.admob(i >= 0);
        this.size = i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof NumberFixedLength) && this.size == ((NumberFixedLength) obj).size && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        long j = 0;
        for (int i2 = 0; i2 < this.size; i2++) {
            j = (j << 8) + ((long) (c0869l.readByte() & 255));
        }
        this.value = Long.valueOf(j);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            C6541l.subs("Byte array is null");
            return;
        }
        if (i < 0 || i >= bArr.length) {
            StringBuilder sbSignature = AbstractC2812l.Signature("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            sbSignature.append(bArr.length);
            throw new C5299l(sbSignature.toString());
        }
        if (this.size + i > bArr.length) {
            StringBuilder sbSignature2 = AbstractC2812l.Signature("Offset plus size to byte array is out of bounds: offset = ", i, ", size = ");
            sbSignature2.append(this.size);
            sbSignature2.append(" + array.length ");
            sbSignature2.append(bArr.length);
            throw new C5299l(sbSignature2.toString());
        }
        long j = 0;
        for (int i2 = i; i2 < this.size + i; i2++) {
            j = (j << 8) + ((long) (bArr[i2] & 255));
        }
        this.value = Long.valueOf(j);
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i3 = C17500l.yandex;
    }

    public void setSize(int i) {
        if (i > 0) {
            this.size = i;
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (obj instanceof Number) {
            super.setValue(obj);
        } else {
            C18262l.startapp(obj.getClass(), "Invalid value type for NumberFixedLength:");
        }
    }

    public String toString() {
        Object obj = this.value;
        return obj == null ? "" : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[this.size];
        Object obj = this.value;
        if (obj != null) {
            long jAmazon = AbstractC1163l.amazon(obj);
            for (int i = this.size - 1; i >= 0; i--) {
                bArr[i] = (byte) (255 & jAmazon);
                jAmazon >>= 8;
            }
        }
        return bArr;
    }

    public NumberFixedLength(NumberFixedLength numberFixedLength) {
        super(numberFixedLength);
        this.size = numberFixedLength.size;
    }
}
