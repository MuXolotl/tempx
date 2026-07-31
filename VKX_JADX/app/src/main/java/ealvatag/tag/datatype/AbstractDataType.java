package ealvatag.tag.datatype;

import defpackage.AbstractC15690l;
import defpackage.AbstractC16446l;
import defpackage.C0869l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C8014l;
import defpackage.InterfaceC15756l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDataType {
    protected static InterfaceC15756l LOG;
    protected AbstractC16446l frameBody;
    protected String identifier;
    protected int size;
    protected Object value;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        LOG = new C13975l(4);
    }

    public AbstractDataType(AbstractDataType abstractDataType) {
        this.value = null;
        this.identifier = "";
        this.frameBody = null;
        this.identifier = abstractDataType.identifier;
        Object obj = abstractDataType.value;
        if (obj == null) {
            this.value = null;
            return;
        }
        if (obj instanceof String) {
            this.value = obj;
            return;
        }
        if (obj instanceof Boolean) {
            this.value = obj;
            return;
        }
        if (obj instanceof Byte) {
            this.value = obj;
            return;
        }
        if (obj instanceof Character) {
            this.value = obj;
            return;
        }
        if (obj instanceof Double) {
            this.value = obj;
            return;
        }
        if (obj instanceof Float) {
            this.value = obj;
            return;
        }
        if (obj instanceof Integer) {
            this.value = obj;
            return;
        }
        if (obj instanceof Long) {
            this.value = obj;
            return;
        }
        if (obj instanceof Short) {
            this.value = obj;
            return;
        }
        if (obj instanceof MultipleTextEncodedStringNullTerminated.Values) {
            this.value = obj;
            return;
        }
        if (obj instanceof PairedTextEncodedStringNullTerminated.ValuePairs) {
            this.value = obj;
            return;
        }
        if (obj instanceof PartOfSet.PartOfSetValue) {
            this.value = obj;
            return;
        }
        if (obj instanceof boolean[]) {
            this.value = ((boolean[]) obj).clone();
            return;
        }
        if (obj instanceof byte[]) {
            this.value = ((byte[]) obj).clone();
            return;
        }
        if (obj instanceof char[]) {
            this.value = ((char[]) obj).clone();
            return;
        }
        if (obj instanceof double[]) {
            this.value = ((double[]) obj).clone();
            return;
        }
        if (obj instanceof float[]) {
            this.value = ((float[]) obj).clone();
            return;
        }
        if (obj instanceof int[]) {
            this.value = ((int[]) obj).clone();
            return;
        }
        if (obj instanceof long[]) {
            this.value = ((long[]) obj).clone();
            return;
        }
        if (obj instanceof short[]) {
            this.value = ((short[]) obj).clone();
            return;
        }
        if (obj instanceof Object[]) {
            this.value = ((Object[]) obj).clone();
            return;
        }
        if (obj instanceof ArrayList) {
            this.value = ((ArrayList) obj).clone();
        } else {
            if (obj instanceof LinkedList) {
                this.value = ((LinkedList) obj).clone();
                return;
            }
            throw new UnsupportedOperationException("Unable to create copy of class " + abstractDataType.getClass());
        }
    }

    public void createStructure() {
        C13975l c13975l = C8014l.mopub;
        getValue().toString();
        throw null;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractDataType)) {
            return false;
        }
        AbstractDataType abstractDataType = (AbstractDataType) obj;
        if (!this.identifier.equals(abstractDataType.identifier)) {
            return false;
        }
        Object obj3 = this.value;
        if (obj3 == null && abstractDataType.value == null) {
            return true;
        }
        if (obj3 == null || (obj2 = abstractDataType.value) == null) {
            return false;
        }
        if ((obj3 instanceof boolean[]) && (obj2 instanceof boolean[])) {
            if (!Arrays.equals((boolean[]) obj3, (boolean[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof byte[]) && (obj2 instanceof byte[])) {
            if (!Arrays.equals((byte[]) obj3, (byte[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof char[]) && (obj2 instanceof char[])) {
            if (!Arrays.equals((char[]) obj3, (char[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof double[]) && (obj2 instanceof double[])) {
            if (!Arrays.equals((double[]) obj3, (double[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof float[]) && (obj2 instanceof float[])) {
            if (!Arrays.equals((float[]) obj3, (float[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof int[]) && (obj2 instanceof int[])) {
            if (!Arrays.equals((int[]) obj3, (int[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof long[]) && (obj2 instanceof long[])) {
            if (!Arrays.equals((long[]) obj3, (long[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof Object[]) && (obj2 instanceof Object[])) {
            if (!Arrays.equals((Object[]) obj3, (Object[]) obj2)) {
                return false;
            }
        } else if ((obj3 instanceof short[]) && (obj2 instanceof short[])) {
            if (!Arrays.equals((short[]) obj3, (short[]) obj2)) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public AbstractC16446l getBody() {
        return this.frameBody;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public abstract int getSize();

    public Object getValue() {
        return this.value;
    }

    public abstract void read(C0869l c0869l, int i);

    public final void readByteArray(byte[] bArr) {
        readByteArray(bArr, 0);
    }

    public abstract void readByteArray(byte[] bArr, int i);

    public void setBody(AbstractC16446l abstractC16446l) {
        this.frameBody = abstractC16446l;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }

    public abstract byte[] writeByteArray();

    public AbstractDataType(String str, AbstractC16446l abstractC16446l, Object obj) {
        this.value = null;
        this.identifier = str;
        this.frameBody = abstractC16446l;
        setValue(obj);
    }

    public AbstractDataType(String str, AbstractC16446l abstractC16446l) {
        this.value = null;
        this.identifier = str;
        this.frameBody = abstractC16446l;
    }
}
