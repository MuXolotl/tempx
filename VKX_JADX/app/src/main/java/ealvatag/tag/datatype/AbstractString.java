package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.C0869l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C5501l;
import defpackage.C6036l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractString extends AbstractDataType {
    public AbstractString(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    private int getShort(C0869l c0869l) {
        return ((c0869l.ads(0L) & 255) << 8) | (c0869l.ads(1L) & 255);
    }

    public boolean canBeEncoded() {
        if (C5501l.m1808l().m1819l(getBody().getTextEncoding()).newEncoder().canEncode((String) this.value)) {
            return true;
        }
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        return false;
    }

    public CharsetDecoder getCorrectDecoder(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 2) {
            CharsetDecoder charsetDecoderNewDecoder = getTextEncodingCharSet().newDecoder();
            charsetDecoderNewDecoder.reset();
            return charsetDecoderNewDecoder;
        }
        if (getTextEncodingCharSet() != AbstractC12379l.billing) {
            CharsetDecoder charsetDecoderNewDecoder2 = getTextEncodingCharSet().newDecoder();
            charsetDecoderNewDecoder2.reset();
            return charsetDecoderNewDecoder2;
        }
        if (byteBuffer.getChar(0) == 65534 || byteBuffer.getChar(0) == 65279) {
            CharsetDecoder charsetDecoderNewDecoder3 = getTextEncodingCharSet().newDecoder();
            charsetDecoderNewDecoder3.reset();
            return charsetDecoderNewDecoder3;
        }
        if (byteBuffer.get(0) == 0) {
            CharsetDecoder charsetDecoderNewDecoder4 = AbstractC12379l.amazon.newDecoder();
            charsetDecoderNewDecoder4.reset();
            return charsetDecoderNewDecoder4;
        }
        CharsetDecoder charsetDecoderNewDecoder5 = AbstractC12379l.purchase.newDecoder();
        charsetDecoderNewDecoder5.reset();
        return charsetDecoderNewDecoder5;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    public Charset getTextEncodingCharSet() {
        try {
            return C5501l.m1808l().m1819l(getBody().getTextEncoding());
        } catch (NoSuchElementException e) {
            throw new C6036l("Bad Charset Id ", e);
        }
    }

    public Charset peekCorrectDecoder(C0869l c0869l) {
        Charset charset;
        Charset textEncodingCharSet = getTextEncodingCharSet();
        if (c0869l.f2526l <= 2 || textEncodingCharSet != (charset = AbstractC12379l.billing)) {
            return textEncodingCharSet;
        }
        int i = getShort(c0869l);
        if (i == 65534 || i == 65279) {
            return charset;
        }
        return c0869l.ads(0L) == 0 ? AbstractC12379l.amazon : AbstractC12379l.purchase;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public String toString() {
        return (String) this.value;
    }

    public AbstractString(String str, AbstractC16446l abstractC16446l, String str2) {
        super(str, abstractC16446l, str2);
    }

    public AbstractString(AbstractString abstractString) {
        super(abstractString);
    }
}
