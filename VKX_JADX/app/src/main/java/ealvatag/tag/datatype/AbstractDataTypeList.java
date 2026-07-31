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
import ealvatag.tag.datatype.AbstractDataType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDataTypeList<T extends AbstractDataType> extends AbstractDataType {
    public AbstractDataTypeList(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        setValue((List) new ArrayList());
    }

    public abstract T createListElement();

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Iterator<T> it = getValue().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return size;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public List<T> getValue() {
        return (List) super.getValue();
    }

    public int hashCode() {
        if (getValue() != null) {
            return getValue().hashCode();
        }
        return 0;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        int i2 = (int) c0869l.f2526l;
        if (i2 == 0) {
            getValue().clear();
            return;
        }
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            AbstractDataType abstractDataTypeCreateListElement = createListElement();
            abstractDataTypeCreateListElement.read(c0869l, i);
            abstractDataTypeCreateListElement.setBody(this.frameBody);
            getValue().add(abstractDataTypeCreateListElement);
            iMin -= abstractDataTypeCreateListElement.getSize();
        }
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
                getValue().clear();
                return;
            }
            while (i < bArr.length) {
                AbstractDataType abstractDataTypeCreateListElement = createListElement();
                abstractDataTypeCreateListElement.readByteArray(bArr, i);
                abstractDataTypeCreateListElement.setBody(this.frameBody);
                getValue().add(abstractDataTypeCreateListElement);
                i += abstractDataTypeCreateListElement.getSize();
            }
        }
    }

    public void setValue(List<T> list) {
        super.setValue((Object) (list == null ? new ArrayList() : new ArrayList(list)));
    }

    public String toString() {
        return getValue() != null ? getValue().toString() : "%s";
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        getIdentifier();
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        byte[] bArr = new byte[getSize()];
        Iterator<T> it = getValue().iterator();
        int length = 0;
        while (it.hasNext()) {
            byte[] bArrWriteByteArray = it.next().writeByteArray();
            System.arraycopy(bArrWriteByteArray, 0, bArr, length, bArrWriteByteArray.length);
            length += bArrWriteByteArray.length;
        }
        return bArr;
    }

    public AbstractDataTypeList(AbstractDataTypeList<T> abstractDataTypeList) {
        super(abstractDataTypeList);
    }
}
