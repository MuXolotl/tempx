package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: renamed from: lَؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1036l extends AbstractC5030l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f2875l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object[] f2876l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object[] f2877l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f2878l;

    public C1036l(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f2877l = objArr;
        this.f2876l = objArr2;
        this.f2875l = i;
        this.f2878l = i2;
        if (!(pro() > 32)) {
            AbstractC5363l.yandex("Trie-based persistent vector should have at least 33 elements, got " + pro());
        }
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static Object[] m769extends(Object[] objArr, int i, int i2, Object obj) {
        int iCrashlytics = AbstractC14707l.crashlytics(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iCrashlytics] = obj;
            return objArrCopyOf;
        }
        objArrCopyOf[iCrashlytics] = m769extends((Object[]) objArrCopyOf[iCrashlytics], i - 5, i2, obj);
        return objArrCopyOf;
    }

    public static Object[] inmobi(Object[] objArr, int i, int i2, Object obj, C0656l c0656l) {
        int iCrashlytics = AbstractC14707l.crashlytics(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iCrashlytics == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC8669l.pro(iCrashlytics + 1, iCrashlytics, 31, objArr, objArrCopyOf);
            c0656l.f2129l = objArr[31];
            objArrCopyOf[iCrashlytics] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        objArrCopyOf2[iCrashlytics] = inmobi((Object[]) objArr[iCrashlytics], i3, i2, obj, c0656l);
        while (true) {
            iCrashlytics++;
            if (iCrashlytics >= 32 || objArrCopyOf2[iCrashlytics] == null) {
                break;
            }
            objArrCopyOf2[iCrashlytics] = inmobi((Object[]) objArr[iCrashlytics], i3, 0, c0656l.f2129l, c0656l);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static Object[] m770package(Object[] objArr, int i, int i2, C0656l c0656l) {
        Object[] objArrM770package;
        int iCrashlytics = AbstractC14707l.crashlytics(i2, i);
        if (i == 5) {
            c0656l.f2129l = objArr[iCrashlytics];
            objArrM770package = null;
        } else {
            objArrM770package = m770package((Object[]) objArr[iCrashlytics], i - 5, i2, c0656l);
        }
        if (objArrM770package == null && iCrashlytics == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iCrashlytics] = objArrM770package;
        return objArrCopyOf;
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l ad(int i, Object obj) {
        int i2 = this.f2875l;
        AbstractC6900l.loadAd(i, i2);
        if (i == i2) {
            return advert(obj);
        }
        int iM772private = m772private();
        Object[] objArr = this.f2877l;
        if (i >= iM772private) {
            return m775throws(i - iM772private, obj, objArr);
        }
        C0656l c0656l = new C0656l(null);
        return m775throws(0, c0656l.f2129l, inmobi(objArr, this.f2878l, i, obj, c0656l));
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l advert(Object obj) {
        int iM772private = m772private();
        int i = this.f2875l;
        int i2 = i - iM772private;
        Object[] objArr = this.f2877l;
        Object[] objArr2 = this.f2876l;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new C1036l(objArr, objArrCopyOf, i + 1, this.f2878l);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m774synchronized(objArr, objArr2, objArr3);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l applovin(int i) {
        AbstractC6900l.yandex(i, this.f2875l);
        int iM772private = m772private();
        int i2 = this.f2878l;
        Object[] objArr = this.f2877l;
        return i >= iM772private ? m771native(objArr, iM772private, i2, i - iM772private) : m771native(m776volatile(objArr, i2, i, new C0656l(this.f2876l[0])), iM772private, i2, 0);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l appmetrica(int i, Object obj) {
        int i2 = this.f2875l;
        AbstractC6900l.yandex(i, i2);
        int iM772private = m772private();
        Object[] objArr = this.f2877l;
        Object[] objArr2 = this.f2876l;
        int i3 = this.f2878l;
        if (iM772private > i) {
            return new C1036l(m769extends(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new C1036l(objArr, objArrCopyOf, i2, i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC6900l.yandex(i, pro());
        if (m772private() <= i) {
            objArr = this.f2876l;
        } else {
            Object[] objArr2 = this.f2877l;
            for (int i2 = this.f2878l; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[AbstractC14707l.crashlytics(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC6900l.loadAd(i, this.f2875l);
        return new C18418l(i, this.f2875l, (this.f2878l / 5) + 1, this.f2877l, this.f2876l);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final AbstractC5030l m771native(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f2875l - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f2876l;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC8669l.pro(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new C1036l(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C3451l(objArr);
        }
        C0656l c0656l = new C0656l(null);
        Object[] objArrM770package = m770package(objArr, i2, i - 1, c0656l);
        Object[] objArr3 = (Object[]) c0656l.f2129l;
        return objArrM770package[1] == null ? new C1036l((Object[]) objArrM770package[0], objArr3, i, i2 - 5) : new C1036l(objArrM770package, objArr3, i, i2);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l premium(C1195l c1195l) {
        C0266l c0266l = new C0266l(this, this.f2877l, this.f2876l, this.f2878l);
        c0266l.m372continue(c1195l);
        return c0266l.advert();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int m772private() {
        return (this.f2875l - 1) & (-32);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f2875l;
    }

    @Override // defpackage.AbstractC5030l
    public final C0266l signatures() {
        return new C0266l(this, this.f2877l, this.f2876l, this.f2878l);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final Object[] m773strictfp(int i, Object[] objArr, Object[] objArr2) {
        int iCrashlytics = AbstractC14707l.crashlytics(pro() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iCrashlytics] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iCrashlytics] = m773strictfp(i - 5, (Object[]) objArrCopyOf[iCrashlytics], objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C1036l m774synchronized(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f2875l;
        int i2 = i >> 5;
        int i3 = this.f2878l;
        if (i2 <= (1 << i3)) {
            return new C1036l(m773strictfp(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new C1036l(m773strictfp(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C1036l m775throws(int i, Object obj, Object[] objArr) {
        int iM772private = m772private();
        int i2 = this.f2875l;
        int i3 = i2 - iM772private;
        Object[] objArr2 = this.f2876l;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            AbstractC8669l.pro(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new C1036l(objArr, objArrCopyOf, i2 + 1, this.f2878l);
        }
        Object obj2 = objArr2[31];
        AbstractC8669l.pro(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m774synchronized(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Object[] m776volatile(Object[] objArr, int i, int i2, C0656l c0656l) {
        int iCrashlytics = AbstractC14707l.crashlytics(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iCrashlytics == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC8669l.pro(iCrashlytics, iCrashlytics + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c0656l.f2129l;
            c0656l.f2129l = objArr[iCrashlytics];
            return objArrCopyOf;
        }
        int iCrashlytics2 = objArr[31] == null ? AbstractC14707l.crashlytics(m772private() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iCrashlytics + 1;
        if (i4 <= iCrashlytics2) {
            while (true) {
                objArrCopyOf2[iCrashlytics2] = m776volatile((Object[]) objArrCopyOf2[iCrashlytics2], i3, 0, c0656l);
                if (iCrashlytics2 == i4) {
                    break;
                }
                iCrashlytics2--;
            }
        }
        objArrCopyOf2[iCrashlytics] = m776volatile((Object[]) objArrCopyOf2[iCrashlytics], i3, i2, c0656l);
        return objArrCopyOf2;
    }
}
