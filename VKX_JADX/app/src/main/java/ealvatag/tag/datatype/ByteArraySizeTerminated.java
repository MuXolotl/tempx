package ealvatag.tag.datatype;

import defpackage.AbstractC16446l;
import defpackage.AbstractC2812l;
import defpackage.C0869l;
import defpackage.C11983l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C6541l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class ByteArraySizeTerminated extends AbstractDataType {
    public ByteArraySizeTerminated(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof ByteArraySizeTerminated) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Object obj = this.value;
        if (obj != null) {
            return ((byte[]) obj).length;
        }
        return 0;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        this.value = c0869l.m725package(i);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            C6541l.subs("Byte array is null");
            return;
        }
        if (i < 0) {
            C11983l.mopub(bArr.length, AbstractC2812l.Signature("Offset to byte array is out of bounds: offset = ", i, ", array.length = "));
        } else {
            if (i >= bArr.length) {
                this.value = null;
                return;
            }
            int length = bArr.length - i;
            byte[] bArr2 = new byte[length];
            this.value = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, length);
        }
    }

    public String toString() {
        return getSize() + " bytes";
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        getIdentifier();
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        return (byte[]) this.value;
    }

    public ByteArraySizeTerminated(ByteArraySizeTerminated byteArraySizeTerminated) {
        super(byteArraySizeTerminated);
    }
}
