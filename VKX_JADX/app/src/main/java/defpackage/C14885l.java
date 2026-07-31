package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٔٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14885l extends AbstractC6140l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C14885l f29271l = new C14885l(0, null, new Object[0]);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f29272l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient Object f29273l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient Object[] f29274l;

    public C14885l(int i, Object obj, Object[] objArr) {
        super(1);
        this.f29273l = obj;
        this.f29274l = objArr;
        this.f29272l = i;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // defpackage.AbstractC6140l, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.f29272l;
            Object[] objArr = this.f29274l;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f29273l;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iMopub = AbstractC2021l.mopub(obj.hashCode());
                    while (true) {
                        int i2 = iMopub & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iMopub = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iMopub2 = AbstractC2021l.mopub(obj.hashCode());
                    while (true) {
                        int i4 = iMopub2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iMopub2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iMopub3 = AbstractC2021l.mopub(obj.hashCode());
                    while (true) {
                        int i5 = iMopub3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iMopub3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f29272l;
    }
}
