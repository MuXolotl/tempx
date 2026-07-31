package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC1757l;
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
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class TextEncodedStringSizeTerminated extends AbstractString {
    public TextEncodedStringSizeTerminated(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    public static List<String> splitByNullSeperator(String str) {
        List<String> listAsList = Arrays.asList(str.split("\\u0000"));
        if (listAsList.size() != 0) {
            return listAsList;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("");
        return arrayList;
    }

    public void addValue(String str) {
        setValue(this.value + "\u0000" + str);
    }

    public void checkTrailingNull(List<String> list, String str) {
        if (C6356l.amazon().remoteconfig || str.length() <= 0 || str.charAt(str.length() - 1) != 0) {
            return;
        }
        list.set(list.size() - 1, list.get(list.size() - 1) + (char) 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextEncodedStringSizeTerminated) && super.equals(obj);
    }

    public int getNumberOfValues() {
        return splitByNullSeperator((String) this.value).size();
    }

    public String getValueAtIndex(int i) {
        return splitByNullSeperator((String) this.value).get(i);
    }

    public String getValueWithoutTrailingNull() {
        Object obj = this.value;
        if (obj == null) {
            InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l).getClass();
            int i = C17500l.yandex;
            return "";
        }
        List<String> listSplitByNullSeperator = splitByNullSeperator((String) obj);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < listSplitByNullSeperator.size(); i2++) {
            if (i2 != 0) {
                sb.append("\u0000");
            }
            sb.append(listSplitByNullSeperator.get(i2));
        }
        return sb.toString();
    }

    public List<String> getValues() {
        return splitByNullSeperator((String) this.value);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) throws C5299l {
        try {
            long j = c0869l.f2526l;
            String strMo712l = c0869l.mo712l(i, peekCorrectDecoder(c0869l));
            if (AbstractC12379l.billing.equals(getTextEncodingCharSet())) {
                this.value = strMo712l.replace("\ufeff", "").replace("\ufffe", "");
            } else {
                this.value = strMo712l;
            }
            setSize((int) (j - c0869l.f2526l));
        } catch (C6036l e) {
            throw new C5299l("Bad charset id", e);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        ByteBuffer byteBufferSlice;
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i2 = C17500l.yandex;
        if (C6356l.amazon().metrica) {
            int length = bArr.length - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            byteBufferSlice = ByteBuffer.wrap(bArr2);
        } else {
            byteBufferSlice = ByteBuffer.wrap(bArr, i, bArr.length - i).slice();
        }
        CharBuffer charBufferAllocate = CharBuffer.allocate(bArr.length - i);
        CharsetDecoder correctDecoder = getCorrectDecoder(byteBufferSlice);
        if (correctDecoder.decode(byteBufferSlice, charBufferAllocate, true).isError()) {
            ((C13975l) AbstractDataType.LOG).getClass();
        }
        correctDecoder.flush(charBufferAllocate);
        charBufferAllocate.flip();
        if (AbstractC12379l.billing.equals(getTextEncodingCharSet())) {
            this.value = charBufferAllocate.toString().replace("\ufeff", "").replace("\ufffe", "");
        } else {
            this.value = charBufferAllocate.toString();
        }
        setSize(bArr.length - i);
        ((C13975l) AbstractDataType.LOG).getClass();
    }

    public void stripTrailingNull() {
        if (C6356l.amazon().remoteconfig) {
            String str = (String) this.value;
            if (str.length() <= 0 || str.charAt(str.length() - 1) != 0) {
                return;
            }
            this.value = AbstractC1757l.m1035native(1, 0, str);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        Charset textEncodingCharSet = getTextEncodingCharSet();
        try {
            stripTrailingNull();
            String str = (String) this.value;
            Charset charset = AbstractC12379l.billing.equals(textEncodingCharSet) ? C6356l.amazon().startapp ? AbstractC12379l.purchase : AbstractC12379l.amazon : null;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((str.length() + 3) * 3);
            List<String> listSplitByNullSeperator = splitByNullSeperator(str);
            checkTrailingNull(listSplitByNullSeperator, str);
            for (int i = 0; i < listSplitByNullSeperator.size(); i++) {
                String str2 = listSplitByNullSeperator.get(i);
                if (AbstractC12379l.purchase.equals(charset)) {
                    byteBufferAllocate.put(writeStringUTF16LEBOM(str2, i, listSplitByNullSeperator.size()));
                } else if (AbstractC12379l.amazon.equals(charset)) {
                    byteBufferAllocate.put(writeStringUTF16BEBOM(str2, i, listSplitByNullSeperator.size()));
                } else {
                    CharsetEncoder charsetEncoderNewEncoder = textEncodingCharSet.newEncoder();
                    CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
                    charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
                    charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction);
                    byteBufferAllocate.put(writeString(charsetEncoderNewEncoder, str2, i, listSplitByNullSeperator.size()));
                }
            }
            byteBufferAllocate.flip();
            int iLimit = byteBufferAllocate.limit();
            byte[] bArr = new byte[iLimit];
            byteBufferAllocate.rewind();
            byteBufferAllocate.get(bArr, 0, byteBufferAllocate.limit());
            setSize(iLimit);
            return bArr;
        } catch (CharacterCodingException e) {
            InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l).getClass();
            int i2 = C17500l.yandex;
            C11467l.metrica(e);
            return null;
        }
    }

    public ByteBuffer writeString(CharsetEncoder charsetEncoder, String str, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBufferEncode;
        if (i + 1 == i2) {
            byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(str));
        } else {
            byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(str + (char) 0));
        }
        byteBufferEncode.rewind();
        return byteBufferEncode;
    }

    public ByteBuffer writeStringUTF16BEBOM(String str, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBufferEncode;
        CharsetEncoder charsetEncoderNewEncoder = AbstractC12379l.amazon.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
        charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
        charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction);
        if (i + 1 == i2) {
            byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap("\ufeff" + str));
        } else {
            byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap("\ufeff" + str + (char) 0));
        }
        byteBufferEncode.rewind();
        return byteBufferEncode;
    }

    public ByteBuffer writeStringUTF16LEBOM(String str, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBufferEncode;
        CharsetEncoder charsetEncoderNewEncoder = AbstractC12379l.purchase.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
        charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
        charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction);
        if (i + 1 == i2) {
            byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap("\ufeff" + str));
        } else {
            byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap("\ufeff" + str + (char) 0));
        }
        byteBufferEncode.rewind();
        return byteBufferEncode;
    }

    public TextEncodedStringSizeTerminated(TextEncodedStringSizeTerminated textEncodedStringSizeTerminated) {
        super(textEncodedStringSizeTerminated);
    }
}
