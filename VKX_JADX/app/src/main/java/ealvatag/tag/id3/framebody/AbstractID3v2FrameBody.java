package ealvatag.tag.id3.framebody;

import defpackage.AbstractC15690l;
import defpackage.AbstractC16446l;
import defpackage.C0869l;
import defpackage.C11399l;
import defpackage.C11467l;
import defpackage.C13975l;
import defpackage.C17436l;
import defpackage.C17500l;
import defpackage.C5299l;
import defpackage.C8014l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import ealvatag.tag.datatype.AbstractDataType;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractID3v2FrameBody extends AbstractC16446l {
    private static final InterfaceC15756l LOG;
    private static final String TYPE_BODY = "body";
    private int size;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        LOG = new C13975l(4);
    }

    public AbstractID3v2FrameBody(ByteBuffer byteBuffer, int i) throws C5299l, C11399l {
        setSize(i);
        read(byteBuffer);
    }

    private void setSize() {
        this.size = 0;
        List<AbstractDataType> dataTypeList = getDataTypeList();
        int size = dataTypeList.size();
        for (int i = 0; i < size; i++) {
            this.size = dataTypeList.get(i).getSize() + this.size;
        }
    }

    public void createStructure() {
        C13975l c13975l = C8014l.mopub;
        throw null;
    }

    @Override // defpackage.AbstractC16446l
    public boolean equals(Object obj) {
        return (obj instanceof AbstractID3v2FrameBody) && super.equals(obj);
    }

    public abstract String getIdentifier();

    @Override // defpackage.AbstractC18219l
    public int getSize() {
        return this.size;
    }

    public void read(C0869l c0869l) throws C17436l {
        String identifier = getIdentifier();
        AbstractDataType abstractDataType = null;
        try {
            int size = getSize();
            List<AbstractDataType> dataTypeList = getDataTypeList();
            int size2 = dataTypeList.size();
            int i = 0;
            while (i < size2) {
                AbstractDataType abstractDataType2 = dataTypeList.get(i);
                try {
                    abstractDataType2.read(c0869l, size);
                    size -= abstractDataType2.getSize();
                    i++;
                    abstractDataType = abstractDataType2;
                } catch (EOFException | ArrayIndexOutOfBoundsException e) {
                    e = e;
                    abstractDataType = abstractDataType2;
                }
            }
            if (size >= 0) {
                return;
            }
            Locale.getDefault();
            throw new C17436l("Problem reading Past last in " + identifier + ". Not enough data. Maybe previous data type read past it's size");
        } catch (EOFException e2) {
            e = e2;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
        }
        throw new C17436l(String.format(Locale.getDefault(), "Problem reading %s in %s. %s", abstractDataType != null ? abstractDataType.getClass() : "Unknown", identifier, e.getMessage()), e);
    }

    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        InterfaceC15756l interfaceC15756l = LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        getIdentifier();
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        List<AbstractDataType> dataTypeList = getDataTypeList();
        int size = dataTypeList.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte[] bArrWriteByteArray = dataTypeList.get(i2).writeByteArray();
            if (bArrWriteByteArray != null) {
                try {
                    byteArrayOutputStream.write(bArrWriteByteArray);
                } catch (IOException e) {
                    C11467l.metrica(e);
                    return;
                }
            }
        }
        setSize();
        InterfaceC15756l interfaceC15756l2 = LOG;
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        getIdentifier();
        ((C13975l) interfaceC15756l2).getClass();
        int i3 = C17500l.yandex;
    }

    public AbstractID3v2FrameBody(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        super(abstractID3v2FrameBody);
    }

    public AbstractID3v2FrameBody() {
    }

    public AbstractID3v2FrameBody(C0869l c0869l, int i) throws C17436l {
        setSize(i);
        read(c0869l);
    }

    public void setSize(int i) {
        this.size = i;
    }

    @Override // defpackage.AbstractC18219l
    public void read(ByteBuffer byteBuffer) throws C5299l, C11399l {
        int size = getSize();
        InterfaceC15756l interfaceC15756l = LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        getIdentifier();
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        byte[] bArr = new byte[size];
        byteBuffer.get(bArr);
        int size2 = getDataTypeList().size();
        int size3 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractDataType abstractDataType = getDataTypeList().get(i2);
            InterfaceC15756l interfaceC15756l2 = LOG;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            C13975l c13975l = (C13975l) interfaceC15756l2;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            if (size3 <= size) {
                try {
                    abstractDataType.readByteArray(bArr, size3);
                    size3 += abstractDataType.getSize();
                } catch (C5299l e) {
                    InterfaceC15756l interfaceC15756l3 = LOG;
                    EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                    ((C13975l) interfaceC15756l3).getClass();
                    int i4 = C17500l.yandex;
                    throw e;
                }
            } else {
                c13975l.getClass();
                throw new C11399l("Invalid size for Frame Body");
            }
        }
    }
}
