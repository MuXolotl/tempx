package ealvatag.tag.datatype;

import defpackage.AbstractC16446l;
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
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class MultipleTextEncodedStringNullTerminated extends AbstractDataType {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class Values {
        private List<String> valueList = new ArrayList();

        public void add(String str) {
            this.valueList.add(str);
        }

        public List<String> getList() {
            return this.valueList;
        }

        public int getNumberOfValues() {
            return this.valueList.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListIterator<String> listIterator = this.valueList.listIterator();
            while (listIterator.hasNext()) {
                sb.append(listIterator.next());
                if (listIterator.hasNext()) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    public MultipleTextEncodedStringNullTerminated(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        this.value = new Values();
    }

    public boolean canBeEncoded() {
        Object obj = this.value;
        if (obj == null) {
            return false;
        }
        List<String> list = ((Values) obj).getList();
        if (list.isEmpty()) {
            return false;
        }
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (!new TextEncodedStringNullTerminated(this.identifier, this.frameBody, listIterator.next()).canBeEncoded()) {
                return false;
            }
        }
        return true;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof MultipleTextEncodedStringNullTerminated) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        int size = getSize();
        while (size > 0) {
            TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
            if (textEncodedStringNullTerminated.getSize() == 0) {
                return;
            }
            Object obj = this.value;
            if (obj != null) {
                ((Values) obj).add((String) textEncodedStringNullTerminated.getValue());
                size -= textEncodedStringNullTerminated.getSize();
            } else {
                InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                ((C13975l) interfaceC15756l).getClass();
                int i2 = C17500l.yandex;
            }
        }
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
                if (textEncodedStringNullTerminated.getSize() == 0) {
                    InterfaceC15756l interfaceC15756l2 = AbstractDataType.LOG;
                    EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                    ((C13975l) interfaceC15756l2).getClass();
                    int i3 = C17500l.yandex;
                    return;
                }
                Object obj = this.value;
                if (obj != null) {
                    ((Values) obj).add((String) textEncodedStringNullTerminated.getValue());
                    this.size += textEncodedStringNullTerminated.getSize();
                    i += textEncodedStringNullTerminated.getSize();
                } else {
                    InterfaceC15756l interfaceC15756l3 = AbstractDataType.LOG;
                    EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                    ((C13975l) interfaceC15756l3).getClass();
                    int i4 = C17500l.yandex;
                }
            } catch (C5299l unused) {
            }
        } while (this.size != 0);
        InterfaceC15756l interfaceC15756l4 = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l4).getClass();
        int i5 = C17500l.yandex;
        throw new C5299l("No null terminated Strings found");
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Object obj = this.value;
            if (obj == null) {
                ((C13975l) AbstractDataType.LOG).getClass();
                return EMPTY_BYTE_ARRAY;
            }
            ListIterator<String> listIterator = ((Values) obj).getList().listIterator();
            int size = 0;
            while (listIterator.hasNext()) {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody, listIterator.next());
                byteArrayOutputStream.write(textEncodedStringNullTerminated.writeByteArray());
                size += textEncodedStringNullTerminated.getSize();
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

    public MultipleTextEncodedStringNullTerminated(TextEncodedStringSizeTerminated textEncodedStringSizeTerminated) {
        super(textEncodedStringSizeTerminated);
        this.value = new Values();
    }

    public MultipleTextEncodedStringNullTerminated(MultipleTextEncodedStringNullTerminated multipleTextEncodedStringNullTerminated) {
        super(multipleTextEncodedStringNullTerminated);
    }
}
