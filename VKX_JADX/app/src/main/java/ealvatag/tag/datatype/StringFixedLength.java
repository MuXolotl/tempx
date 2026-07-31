package ealvatag.tag.datatype;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.C0869l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C5299l;
import defpackage.C6036l;
import defpackage.C8339l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class StringFixedLength extends AbstractString {
    public StringFixedLength(String str, AbstractC16446l abstractC16446l, int i) {
        super(str, abstractC16446l);
        if (i >= 0) {
            setSize(i);
        } else {
            C8339l.metrica(AbstractC0653l.vip(i, "size is less than zero: "));
            throw null;
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof StringFixedLength) && this.size == ((StringFixedLength) obj).size && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) throws C5299l {
        try {
            this.value = c0869l.mo712l(this.size, getTextEncodingCharSet());
        } catch (C6036l e) {
            throw new C5299l("Bad charset Id", e);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) throws C5299l {
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i2 = C17500l.yandex;
        try {
            CharsetDecoder charsetDecoderNewDecoder = getTextEncodingCharSet().newDecoder();
            InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
            int length = bArr.length;
            ((C13975l) interfaceC15756l2).getClass();
            int length2 = bArr.length - i;
            int i3 = this.size;
            if (length2 >= i3) {
                this.value = charsetDecoderNewDecoder.decode(ByteBuffer.wrap(bArr, i, i3)).toString();
                ((C13975l) AbstractDataType.LOG).getClass();
            } else {
                throw new C5299l("byte array is to small to retrieve string of declared length:" + this.size);
            }
        } catch (CharacterCodingException unused) {
            InterfaceC15756l interfaceC15756l3 = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l3).getClass();
            int i4 = C17500l.yandex;
            this.value = "";
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        int i = 0;
        if (this.value == null) {
            InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l).getClass();
            int i2 = C17500l.yandex;
            byte[] bArr = new byte[this.size];
            while (i < this.size) {
                bArr[i] = 32;
                i++;
            }
            return bArr;
        }
        try {
            Charset textEncodingCharSet = getTextEncodingCharSet();
            ByteBuffer byteBufferEncode = AbstractC12379l.billing.equals(textEncodingCharSet) ? AbstractC12379l.purchase.newEncoder().encode(CharBuffer.wrap("\ufeff" + ((String) this.value))) : textEncodingCharSet.newEncoder().encode(CharBuffer.wrap((String) this.value));
            if (byteBufferEncode == null) {
                InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                ((C13975l) interfaceC15756l2).getClass();
                int i3 = C17500l.yandex;
                byte[] bArr2 = new byte[this.size];
                while (i < this.size) {
                    bArr2[i] = 32;
                    i++;
                }
                return bArr2;
            }
            if (byteBufferEncode.limit() == this.size) {
                byte[] bArr3 = new byte[byteBufferEncode.limit()];
                byteBufferEncode.get(bArr3, 0, byteBufferEncode.limit());
                return bArr3;
            }
            if (byteBufferEncode.limit() > this.size) {
                InterfaceC15756l interfaceC15756l3 = AbstractDataType.LOG;
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                byteBufferEncode.limit();
                ((C13975l) interfaceC15756l3).getClass();
                int i4 = C17500l.yandex;
                int i5 = this.size;
                byte[] bArr4 = new byte[i5];
                byteBufferEncode.get(bArr4, 0, i5);
                return bArr4;
            }
            InterfaceC15756l interfaceC15756l4 = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            byteBufferEncode.limit();
            ((C13975l) interfaceC15756l4).getClass();
            int i6 = C17500l.yandex;
            byte[] bArr5 = new byte[this.size];
            byteBufferEncode.get(bArr5, 0, byteBufferEncode.limit());
            for (int iLimit = byteBufferEncode.limit(); iLimit < this.size; iLimit++) {
                bArr5[iLimit] = 32;
            }
            return bArr5;
        } catch (CharacterCodingException unused) {
            InterfaceC15756l interfaceC15756l5 = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l5).getClass();
            int i7 = C17500l.yandex;
            byte[] bArr6 = new byte[this.size];
            while (i < this.size) {
                bArr6[i] = 32;
                i++;
            }
            return bArr6;
        }
    }

    public StringFixedLength(StringFixedLength stringFixedLength) {
        super(stringFixedLength);
        this.size = stringFixedLength.size;
    }
}
