package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC5998l;
import defpackage.C0869l;
import defpackage.C11467l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C5299l;
import defpackage.C6036l;
import defpackage.C6356l;
import defpackage.EnumC14098l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class PartOfSet extends AbstractString {
    public PartOfSet(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PartOfSet) {
            return AbstractC5998l.billing(this.value, ((PartOfSet) obj).value);
        }
        return false;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) throws C5299l {
        try {
            PartOfSetValue partOfSetValue = new PartOfSetValue(c0869l.mo712l(i, getTextEncodingCharSet()));
            this.value = partOfSetValue;
            setSize(partOfSetValue.toString().length());
        } catch (C6036l e) {
            throw new C5299l("Bad charset Id", e);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i2 = C17500l.yandex;
        CharsetDecoder charsetDecoderNewDecoder = getTextEncodingCharSet().newDecoder();
        ByteBuffer byteBufferSlice = ByteBuffer.wrap(bArr, i, bArr.length - i).slice();
        CharBuffer charBufferAllocate = CharBuffer.allocate(bArr.length - i);
        charsetDecoderNewDecoder.reset();
        if (charsetDecoderNewDecoder.decode(byteBufferSlice, charBufferAllocate, true).isError()) {
            ((C13975l) AbstractDataType.LOG).getClass();
        }
        charsetDecoderNewDecoder.flush(charBufferAllocate);
        charBufferAllocate.flip();
        this.value = new PartOfSetValue(charBufferAllocate.toString());
        setSize(bArr.length - i);
        ((C13975l) AbstractDataType.LOG).getClass();
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public String toString() {
        Object obj = this.value;
        return obj == null ? "" : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        CharsetEncoder charsetEncoderNewEncoder;
        String string = getValue().toString();
        try {
            if (C6356l.amazon().remoteconfig && string.length() > 0 && string.charAt(string.length() - 1) == 0) {
                string = string.substring(0, string.length() - 1);
            }
            Charset textEncodingCharSet = getTextEncodingCharSet();
            if (AbstractC12379l.billing.equals(textEncodingCharSet)) {
                charsetEncoderNewEncoder = AbstractC12379l.purchase.newEncoder();
                string = "\ufeff" + string;
            } else {
                charsetEncoderNewEncoder = textEncodingCharSet.newEncoder();
            }
            CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
            charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
            charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction);
            ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap(string));
            int iLimit = byteBufferEncode.limit();
            byte[] bArr = new byte[iLimit];
            byteBufferEncode.get(bArr, 0, byteBufferEncode.limit());
            setSize(iLimit);
            return bArr;
        } catch (CharacterCodingException e) {
            InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l).getClass();
            int i = C17500l.yandex;
            C11467l.metrica(e);
            return null;
        }
    }

    public PartOfSet(PartOfSet partOfSet) {
        super(partOfSet);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public PartOfSetValue getValue() {
        return (PartOfSetValue) this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class PartOfSetValue {
        private static final String SEPARATOR = "/";
        private Integer count;
        private String extra;
        private String rawCount;
        private String rawText;
        private String rawTotal;
        private Integer total;
        private static final Pattern trackNoPatternWithTotalCount = Pattern.compile("([0-9]+)/([0-9]+)(.*)", 2);
        private static final Pattern trackNoPattern = Pattern.compile("([0-9]+)(.*)", 2);

        public PartOfSetValue(Integer num, Integer num2) {
            this.count = num;
            this.rawCount = num.toString();
            this.total = num2;
            this.rawTotal = num2.toString();
            resetValueFromCounts();
        }

        private void initFromValue(String str) {
            try {
                Matcher matcher = trackNoPatternWithTotalCount.matcher(str);
                if (matcher.matches()) {
                    this.extra = matcher.group(3);
                    this.count = Integer.valueOf(Integer.parseInt(matcher.group(1)));
                    this.rawCount = matcher.group(1);
                    this.total = Integer.valueOf(Integer.parseInt(matcher.group(2)));
                    this.rawTotal = matcher.group(2);
                    return;
                }
                Matcher matcher2 = trackNoPattern.matcher(str);
                if (matcher2.matches()) {
                    this.extra = matcher2.group(2);
                    this.count = Integer.valueOf(Integer.parseInt(matcher2.group(1)));
                    this.rawCount = matcher2.group(1);
                }
            } catch (NumberFormatException unused) {
                this.count = 0;
            }
        }

        private void padNumber(StringBuilder sb, Integer num, EnumC14098l enumC14098l) {
            if (num != null) {
                if (enumC14098l == EnumC14098l.f27458l) {
                    if (num.intValue() <= 0 || num.intValue() >= 10) {
                        sb.append(num.intValue());
                        return;
                    } else {
                        sb.append("0");
                        sb.append(num);
                        return;
                    }
                }
                if (enumC14098l == EnumC14098l.f27457l) {
                    if (num.intValue() > 0 && num.intValue() < 10) {
                        sb.append("00");
                        sb.append(num);
                        return;
                    } else if (num.intValue() <= 9 || num.intValue() >= 100) {
                        sb.append(num.intValue());
                        return;
                    } else {
                        sb.append("0");
                        sb.append(num);
                        return;
                    }
                }
                if (enumC14098l == EnumC14098l.f27456l) {
                    if (num.intValue() > 0 && num.intValue() < 10) {
                        sb.append("000");
                        sb.append(num);
                        return;
                    }
                    if (num.intValue() > 9 && num.intValue() < 100) {
                        sb.append("00");
                        sb.append(num);
                    } else if (num.intValue() <= 99 || num.intValue() >= 1000) {
                        sb.append(num.intValue());
                    } else {
                        sb.append("0");
                        sb.append(num);
                    }
                }
            }
        }

        private void resetValueFromCounts() {
            StringBuilder sb = new StringBuilder();
            String str = this.rawCount;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0");
            }
            if (this.rawTotal != null) {
                sb.append(SEPARATOR);
                sb.append(this.rawTotal);
            }
            String str2 = this.extra;
            if (str2 != null) {
                sb.append(str2);
            }
            this.rawText = sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PartOfSetValue)) {
                return false;
            }
            PartOfSetValue partOfSetValue = (PartOfSetValue) obj;
            return AbstractC5998l.billing(getCount(), partOfSetValue.getCount()) && AbstractC5998l.billing(getTotal(), partOfSetValue.getTotal());
        }

        public Integer getCount() {
            return this.count;
        }

        public String getCountAsText() {
            C6356l.amazon();
            return this.rawCount;
        }

        public String getRawValue() {
            return this.rawText;
        }

        public Integer getTotal() {
            return this.total;
        }

        public String getTotalAsText() {
            C6356l.amazon();
            return this.rawTotal;
        }

        public void setCount(String str) {
            try {
                this.count = Integer.valueOf(Integer.parseInt(str));
                this.rawCount = str;
                resetValueFromCounts();
            } catch (NumberFormatException unused) {
            }
        }

        public void setRawValue(String str) {
            this.rawText = str;
            initFromValue(str);
        }

        public void setTotal(String str) {
            try {
                this.total = Integer.valueOf(Integer.parseInt(str));
                this.rawTotal = str;
                resetValueFromCounts();
            } catch (NumberFormatException unused) {
            }
        }

        public String toString() {
            C6356l.amazon();
            return this.rawText;
        }

        public void setCount(Integer num) {
            this.count = num;
            this.rawCount = num.toString();
            resetValueFromCounts();
        }

        public void setTotal(Integer num) {
            this.total = num;
            this.rawTotal = num.toString();
            resetValueFromCounts();
        }

        public PartOfSetValue(String str) {
            this.rawText = str;
            initFromValue(str);
        }

        public PartOfSetValue() {
            this.rawText = "";
        }
    }
}
