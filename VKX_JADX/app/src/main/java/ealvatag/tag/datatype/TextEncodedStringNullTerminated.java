package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.C0869l;
import defpackage.C11467l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C5299l;
import defpackage.C6036l;
import defpackage.C6356l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class TextEncodedStringNullTerminated extends AbstractString {
    private static final byte NULL_BYTE = 0;

    public TextEncodedStringNullTerminated(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    private static long getNullEvenIndex(C0869l c0869l, long j) {
        long jIsVip = c0869l.isVip((byte) 0, j, Long.MAX_VALUE);
        while (-1 != jIsVip && !isEven(jIsVip)) {
            jIsVip = c0869l.isVip((byte) 0, jIsVip + 1, Long.MAX_VALUE);
        }
        return jIsVip;
    }

    public static int getNullIndex(C0869l c0869l, boolean z) {
        try {
            if (z) {
                return (int) c0869l.isVip((byte) 0, 0L, Long.MAX_VALUE);
            }
            long nullEvenIndex = getNullEvenIndex(c0869l, 0L);
            long j = -1;
            while (-1 == j && -1 != nullEvenIndex) {
                long j2 = 1 + nullEvenIndex;
                if (c0869l.ads(j2) == 0) {
                    j = j2;
                } else {
                    nullEvenIndex = getNullEvenIndex(c0869l, nullEvenIndex + 2);
                }
            }
            return (int) j;
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    private static boolean isEven(long j) {
        return j % 2 == 0;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof TextEncodedStringNullTerminated) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) throws C5299l {
        try {
            Charset textEncodingCharSet = getTextEncodingCharSet();
            boolean z = AbstractC12379l.loadAd == textEncodingCharSet || AbstractC12379l.crashlytics == textEncodingCharSet;
            int nullIndex = getNullIndex(c0869l, z);
            if (nullIndex < 0) {
                throw new C5299l("Can't find null string terminator");
            }
            setSize(nullIndex + 1);
            if (!z) {
                nullIndex--;
            }
            this.value = c0869l.mo712l(nullIndex, textEncodingCharSet);
            c0869l.readByte();
            if (z) {
                return;
            }
            c0869l.readByte();
        } catch (C6036l e) {
            throw new C5299l("Bad charset Id", e);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) throws C5299l {
        int i2;
        int iPosition;
        if (i >= bArr.length) {
            throw new C5299l("Unable to find null terminated string");
        }
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i3 = C17500l.yandex;
        Charset textEncodingCharSet = getTextEncodingCharSet();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, bArr.length - i);
        boolean z = false;
        boolean z2 = AbstractC12379l.loadAd == textEncodingCharSet || AbstractC12379l.crashlytics == textEncodingCharSet;
        while (true) {
            if (!byteBufferWrap.hasRemaining()) {
                i2 = 0;
                break;
            }
            if (byteBufferWrap.get() == 0) {
                if (z2) {
                    byteBufferWrap.mark();
                    byteBufferWrap.reset();
                    iPosition = byteBufferWrap.position() - 1;
                    InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
                    EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                    ((C13975l) interfaceC15756l2).getClass();
                    int i4 = C17500l.yandex;
                } else if (!byteBufferWrap.hasRemaining()) {
                    byteBufferWrap.mark();
                    byteBufferWrap.reset();
                    iPosition = byteBufferWrap.position() - 1;
                    InterfaceC15756l interfaceC15756l3 = AbstractDataType.LOG;
                    EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                    ((C13975l) interfaceC15756l3).getClass();
                    int i5 = C17500l.yandex;
                } else if (byteBufferWrap.get() == 0) {
                    byteBufferWrap.mark();
                    byteBufferWrap.reset();
                    iPosition = byteBufferWrap.position() - 2;
                    InterfaceC15756l interfaceC15756l4 = AbstractDataType.LOG;
                    EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                    ((C13975l) interfaceC15756l4).getClass();
                    int i6 = C17500l.yandex;
                }
                i2 = iPosition;
                z = true;
                break;
            }
            if (!z2 && byteBufferWrap.hasRemaining()) {
                byteBufferWrap.get();
            }
        }
        if (!z) {
            throw new C5299l("Unable to find null terminated string");
        }
        InterfaceC15756l interfaceC15756l5 = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l5).getClass();
        int i7 = C17500l.yandex;
        int i8 = i2 - i;
        int i9 = i8 + 1;
        if (!z2) {
            i9 = i8 + 2;
        }
        setSize(i9);
        ((C13975l) AbstractDataType.LOG).getClass();
        if (i8 == 0) {
            this.value = "";
        } else {
            ByteBuffer byteBufferSlice = ByteBuffer.wrap(bArr, i, i8).slice();
            CharBuffer charBufferAllocate = CharBuffer.allocate(i8);
            CharsetDecoder correctDecoder = getCorrectDecoder(byteBufferSlice);
            CoderResult coderResultDecode = correctDecoder.decode(byteBufferSlice, charBufferAllocate, true);
            if (coderResultDecode.isError()) {
                InterfaceC15756l interfaceC15756l6 = AbstractDataType.LOG;
                coderResultDecode.toString();
                ((C13975l) interfaceC15756l6).getClass();
            }
            correctDecoder.flush(charBufferAllocate);
            charBufferAllocate.flip();
            this.value = charBufferAllocate.toString();
        }
        ((C13975l) AbstractDataType.LOG).getClass();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr;
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        Charset textEncodingCharSet = getTextEncodingCharSet();
        try {
            if (!AbstractC12379l.billing.equals(textEncodingCharSet)) {
                CharsetEncoder charsetEncoderNewEncoder = textEncodingCharSet.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
                charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
                charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction);
                ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap(((String) this.value) + (char) 0));
                bArr = new byte[byteBufferEncode.limit()];
                byteBufferEncode.get(bArr, 0, byteBufferEncode.limit());
            } else if (C6356l.amazon().startapp) {
                CharsetEncoder charsetEncoderNewEncoder2 = AbstractC12379l.purchase.newEncoder();
                CodingErrorAction codingErrorAction2 = CodingErrorAction.IGNORE;
                charsetEncoderNewEncoder2.onMalformedInput(codingErrorAction2);
                charsetEncoderNewEncoder2.onUnmappableCharacter(codingErrorAction2);
                ByteBuffer byteBufferEncode2 = charsetEncoderNewEncoder2.encode(CharBuffer.wrap("\ufeff" + ((String) this.value) + (char) 0));
                bArr = new byte[byteBufferEncode2.limit()];
                byteBufferEncode2.get(bArr, 0, byteBufferEncode2.limit());
            } else {
                CharsetEncoder charsetEncoderNewEncoder3 = AbstractC12379l.amazon.newEncoder();
                CodingErrorAction codingErrorAction3 = CodingErrorAction.IGNORE;
                charsetEncoderNewEncoder3.onMalformedInput(codingErrorAction3);
                charsetEncoderNewEncoder3.onUnmappableCharacter(codingErrorAction3);
                ByteBuffer byteBufferEncode3 = charsetEncoderNewEncoder3.encode(CharBuffer.wrap("\ufeff" + ((String) this.value) + (char) 0));
                bArr = new byte[byteBufferEncode3.limit()];
                byteBufferEncode3.get(bArr, 0, byteBufferEncode3.limit());
            }
            setSize(bArr.length);
            return bArr;
        } catch (CharacterCodingException e) {
            InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l2).getClass();
            int i2 = C17500l.yandex;
            C11467l.metrica(e);
            return null;
        }
    }

    public TextEncodedStringNullTerminated(String str, AbstractC16446l abstractC16446l, String str2) {
        super(str, abstractC16446l, str2);
    }

    public TextEncodedStringNullTerminated(TextEncodedStringNullTerminated textEncodedStringNullTerminated) {
        super(textEncodedStringNullTerminated);
    }
}
