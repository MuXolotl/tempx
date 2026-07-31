package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: renamed from: lٔۧۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15333l extends AbstractC13675l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C15333l f29966l = new C15333l(0, null, new Object[0]);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient Object[] f29967l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Object f29968l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f29969l;

    public C15333l(int i, Object obj, Object[] objArr) {
        this.f29968l = obj;
        this.f29967l = objArr;
        this.f29969l = i;
    }

    public static C15333l admob(int i, Object[] objArr, C13698l c13698l) {
        if (i == 0) {
            return f29966l;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new C15333l(1, null, objArr);
        }
        AbstractC12442l.startapp(i, objArr.length >> 1);
        Object objSubs = subs(objArr, i, AbstractC8481l.vip(i), 0);
        if (objSubs instanceof Object[]) {
            Object[] objArr2 = (Object[]) objSubs;
            C2164l c2164l = (C2164l) objArr2[2];
            if (c13698l == null) {
                throw c2164l.yandex();
            }
            c13698l.f26746l = c2164l;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objSubs = obj;
            i = iIntValue;
        }
        return new C15333l(i, objSubs, objArr);
    }

    public static Object isPro(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iCrashlytics = AbstractC12027l.crashlytics(obj2.hashCode());
            while (true) {
                int i3 = iCrashlytics & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iCrashlytics = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iCrashlytics2 = AbstractC12027l.crashlytics(obj2.hashCode());
            while (true) {
                int i5 = iCrashlytics2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iCrashlytics2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iCrashlytics3 = AbstractC12027l.crashlytics(obj2.hashCode());
            while (true) {
                int i7 = iCrashlytics3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iCrashlytics3 = i7 + 1;
            }
        }
    }

    public static Object subs(Object[] objArr, int i, int i2, int i3) {
        int i4;
        C2164l c2164l = null;
        int i5 = 1;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 * 2) + i3;
                int i10 = (i7 * 2) + i3;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 ^ 1];
                Objects.requireNonNull(obj2);
                int iCrashlytics = AbstractC12027l.crashlytics(obj.hashCode());
                while (true) {
                    int i11 = iCrashlytics & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i7++;
                        break;
                    }
                    if (obj.equals(objArr[i12])) {
                        int i13 = i12 ^ 1;
                        Object obj3 = objArr[i13];
                        Objects.requireNonNull(obj3);
                        c2164l = new C2164l(obj, obj2, obj3);
                        objArr[i13] = obj2;
                        break;
                    }
                    iCrashlytics = i11 + 1;
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), c2164l};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 * 2) + i3;
                int i17 = (i14 * 2) + i3;
                Object obj4 = objArr[i16];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj5);
                int iCrashlytics2 = AbstractC12027l.crashlytics(obj4.hashCode());
                while (true) {
                    int i18 = iCrashlytics2 & i6;
                    int i19 = sArr[i18] & 65535;
                    if (i19 == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj4;
                            objArr[i17 ^ 1] = obj5;
                        }
                        i14++;
                        break;
                    }
                    if (obj4.equals(objArr[i19])) {
                        int i20 = i19 ^ 1;
                        Object obj6 = objArr[i20];
                        Objects.requireNonNull(obj6);
                        c2164l = new C2164l(obj4, obj5, obj6);
                        objArr[i20] = obj5;
                        break;
                    }
                    iCrashlytics2 = i18 + 1;
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), c2164l};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i21 = 0;
        int i22 = 0;
        while (i21 < i) {
            int i23 = (i21 * 2) + i3;
            int i24 = (i22 * 2) + i3;
            Object obj7 = objArr[i23];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i23 ^ i5];
            Objects.requireNonNull(obj8);
            int iCrashlytics3 = AbstractC12027l.crashlytics(obj7.hashCode());
            while (true) {
                int i25 = iCrashlytics3 & i6;
                int i26 = iArr[i25];
                if (i26 == -1) {
                    iArr[i25] = i24;
                    if (i22 < i21) {
                        objArr[i24] = obj7;
                        objArr[i24 ^ 1] = obj8;
                    }
                    i22++;
                    i4 = i5;
                    break;
                }
                i4 = i5;
                if (obj7.equals(objArr[i26])) {
                    int i27 = i26 ^ 1;
                    Object obj9 = objArr[i27];
                    Objects.requireNonNull(obj9);
                    c2164l = new C2164l(obj7, obj8, obj9);
                    objArr[i27] = obj8;
                    break;
                }
                iCrashlytics3 = i25 + 1;
                i5 = i4;
            }
            i21++;
            i5 = i4;
        }
        int i28 = i5;
        if (i22 == i) {
            return iArr;
        }
        Integer numValueOf = Integer.valueOf(i22);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i28] = numValueOf;
        objArr2[2] = c2164l;
        return objArr2;
    }

    @Override // defpackage.AbstractC13675l
    public final C5179l amazon() {
        return new C5179l(this, new C3965l(0, this.f29969l, this.f29967l));
    }

    @Override // defpackage.AbstractC13675l
    public final C0547l crashlytics() {
        return new C0547l(this, this.f29967l, 0, this.f29969l);
    }

    @Override // defpackage.AbstractC13675l, java.util.Map
    public final Object get(Object obj) {
        Object objIsPro = isPro(this.f29968l, this.f29967l, this.f29969l, 0, obj);
        if (objIsPro == null) {
            return null;
        }
        return objIsPro;
    }

    @Override // defpackage.AbstractC13675l
    public final AbstractC5511l purchase() {
        return new C3965l(1, this.f29969l, this.f29967l);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f29969l;
    }
}
