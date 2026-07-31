package ealvatag.tag.datatype;

import defpackage.AbstractC16446l;
import defpackage.AbstractC5998l;
import defpackage.C0869l;
import defpackage.C11467l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C5299l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class PairedTextEncodedStringNullTerminated extends AbstractDataType {
    public PairedTextEncodedStringNullTerminated(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        this.value = new ValuePairs();
    }

    public boolean canBeEncoded() {
        Object obj = this.value;
        if (obj == null) {
            InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l).getClass();
            int i = C17500l.yandex;
            return false;
        }
        Iterator it = ((ValuePairs) obj).mapping.iterator();
        while (it.hasNext()) {
            if (!new TextEncodedStringNullTerminated(this.identifier, this.frameBody, ((Pair) it.next()).getValue()).canBeEncoded()) {
                return false;
            }
        }
        return true;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PairedTextEncodedStringNullTerminated) {
            return AbstractC5998l.billing(this.value, ((PairedTextEncodedStringNullTerminated) obj).value);
        }
        return false;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) throws C5299l {
        int i2 = i;
        while (i2 > 0) {
            TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
            textEncodedStringNullTerminated.read(c0869l, i2);
            int size = textEncodedStringNullTerminated.getSize();
            if (size == 0) {
                break;
            }
            this.size += size;
            int i3 = i2 - size;
            try {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated2 = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
                textEncodedStringNullTerminated2.read(c0869l.clone(), i);
                int size2 = textEncodedStringNullTerminated2.getSize();
                c0869l.skip(size2);
                this.size += size2;
                i2 = i3 - size2;
                if (size2 == 0) {
                    break;
                }
                ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringNullTerminated2.getValue());
                if (this.size == 0) {
                    InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
                    EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                    ((C13975l) interfaceC15756l).getClass();
                    int i4 = C17500l.yandex;
                    throw new C5299l("No null terminated Strings found");
                }
            } catch (C5299l unused) {
                TextEncodedStringSizeTerminated textEncodedStringSizeTerminated = new TextEncodedStringSizeTerminated(this.identifier, this.frameBody);
                textEncodedStringSizeTerminated.read(c0869l, i);
                int size3 = textEncodedStringSizeTerminated.getSize();
                this.size += size3;
                if (size3 != 0) {
                    ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringSizeTerminated.getValue());
                }
            }
        }
        InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l2).getClass();
        int i5 = C17500l.yandex;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) throws C5299l {
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i2 = C17500l.yandex;
        do {
            try {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
                textEncodedStringNullTerminated.readByteArray(bArr, i);
                this.size += textEncodedStringNullTerminated.getSize();
                i += textEncodedStringNullTerminated.getSize();
                if (textEncodedStringNullTerminated.getSize() != 0) {
                    try {
                        TextEncodedStringNullTerminated textEncodedStringNullTerminated2 = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
                        textEncodedStringNullTerminated2.readByteArray(bArr, i);
                        this.size += textEncodedStringNullTerminated2.getSize();
                        i += textEncodedStringNullTerminated2.getSize();
                        if (textEncodedStringNullTerminated2.getSize() != 0) {
                            ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringNullTerminated2.getValue());
                        }
                    } catch (C5299l unused) {
                        if (i < bArr.length) {
                            TextEncodedStringSizeTerminated textEncodedStringSizeTerminated = new TextEncodedStringSizeTerminated(this.identifier, this.frameBody);
                            textEncodedStringSizeTerminated.readByteArray(bArr, i);
                            this.size += textEncodedStringSizeTerminated.getSize();
                            textEncodedStringSizeTerminated.getSize();
                            if (textEncodedStringSizeTerminated.getSize() != 0) {
                                ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringSizeTerminated.getValue());
                            }
                        }
                    }
                }
            } catch (C5299l unused2) {
            }
            InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l2).getClass();
            int i3 = C17500l.yandex;
            return;
        } while (this.size != 0);
        InterfaceC15756l interfaceC15756l3 = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l3).getClass();
        int i4 = C17500l.yandex;
        throw new C5299l("No null terminated Strings found");
    }

    public String toString() {
        return this.value.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int size = 0;
            for (Pair pair : ((ValuePairs) this.value).mapping) {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody, pair.getKey());
                byteArrayOutputStream.write(textEncodedStringNullTerminated.writeByteArray());
                int size2 = size + textEncodedStringNullTerminated.getSize();
                TextEncodedStringNullTerminated textEncodedStringNullTerminated2 = new TextEncodedStringNullTerminated(this.identifier, this.frameBody, pair.getValue());
                byteArrayOutputStream.write(textEncodedStringNullTerminated2.writeByteArray());
                size = size2 + textEncodedStringNullTerminated2.getSize();
            }
            this.size = size;
            InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l2).getClass();
            int i2 = C17500l.yandex;
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            InterfaceC15756l interfaceC15756l3 = AbstractDataType.LOG;
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l3).getClass();
            int i3 = C17500l.yandex;
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public ValuePairs getValue() {
        return (ValuePairs) this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class ValuePairs {
        private List<Pair> mapping = new ArrayList();

        public void add(String str, String str2) {
            this.mapping.add(new Pair(str, str2));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ValuePairs) && ((long) getNumberOfValues()) == ((long) ((ValuePairs) obj).getNumberOfValues());
        }

        public List<Pair> getMapping() {
            return this.mapping;
        }

        public int getNumberOfPairs() {
            return this.mapping.size();
        }

        public int getNumberOfValues() {
            return this.mapping.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Pair pair : this.mapping) {
                sb.append(pair.getKey());
                sb.append(':');
                sb.append(pair.getValue());
                sb.append(',');
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }

        public void add(Pair pair) {
            this.mapping.add(pair);
        }
    }

    public PairedTextEncodedStringNullTerminated(TextEncodedStringSizeTerminated textEncodedStringSizeTerminated) {
        super(textEncodedStringSizeTerminated);
        this.value = new ValuePairs();
    }

    public PairedTextEncodedStringNullTerminated(PairedTextEncodedStringNullTerminated pairedTextEncodedStringNullTerminated) {
        super(pairedTextEncodedStringNullTerminated);
    }
}
