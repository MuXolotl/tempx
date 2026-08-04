package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؒؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0774l {
    public static final C0774l billing = new C0774l(0, new int[0], new Object[0], false);
    public int amazon = -1;
    public Object[] crashlytics;
    public int[] loadAd;
    public boolean purchase;
    public int yandex;

    public C0774l(int i, int[] iArr, Object[] objArr, boolean z) {
        this.yandex = i;
        this.loadAd = iArr;
        this.crashlytics = objArr;
        this.purchase = z;
    }

    public final void amazon(C7972l c7972l) {
        if (this.yandex == 0) {
            return;
        }
        for (int i = 0; i < this.yandex; i++) {
            int i2 = this.loadAd[i];
            Object obj = this.crashlytics[i];
            C10107l c10107l = (C10107l) c7972l.f16631l;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c10107l.appmetrica(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c10107l.tapsense(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c10107l.startapp(i3, (C4966l) obj);
            } else if (i4 == 3) {
                c10107l.signatures(i3, 3);
                ((C0774l) obj).amazon(c7972l);
                c10107l.signatures(i3, 4);
            } else {
                if (i4 != 5) {
                    C11467l.metrica(C5957l.loadAd());
                    return;
                }
                c10107l.ads(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final void crashlytics(int i, Object obj) {
        if (!this.purchase) {
            C3010l.mopub();
            return;
        }
        yandex(this.yandex + 1);
        int[] iArr = this.loadAd;
        int i2 = this.yandex;
        iArr[i2] = i;
        this.crashlytics[i2] = obj;
        this.yandex = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0774l)) {
            return false;
        }
        C0774l c0774l = (C0774l) obj;
        int i = this.yandex;
        if (i == c0774l.yandex) {
            int[] iArr = this.loadAd;
            int[] iArr2 = c0774l.loadAd;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.crashlytics;
            Object[] objArr2 = c0774l.crashlytics;
            int i3 = this.yandex;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.yandex;
        int i2 = (527 + i) * 31;
        int[] iArr = this.loadAd;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.crashlytics;
        int i6 = this.yandex;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int loadAd() {
        int iAdmob;
        int iIsPro;
        int iAdmob2;
        int i = this.amazon;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.yandex; i3++) {
            int i4 = this.loadAd[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.crashlytics[i3]).getClass();
                    iAdmob2 = C10107l.admob(i5) + 8;
                } else if (i6 == 2) {
                    iAdmob2 = C10107l.billing(i5, (C4966l) this.crashlytics[i3]);
                } else if (i6 == 3) {
                    iAdmob = C10107l.admob(i5) * 2;
                    iIsPro = ((C0774l) this.crashlytics[i3]).loadAd();
                } else {
                    if (i6 != 5) {
                        C11983l.ads(C5957l.loadAd());
                        return 0;
                    }
                    ((Integer) this.crashlytics[i3]).getClass();
                    iAdmob2 = C10107l.admob(i5) + 4;
                }
                i2 = iAdmob2 + i2;
            } else {
                long jLongValue = ((Long) this.crashlytics[i3]).longValue();
                iAdmob = C10107l.admob(i5);
                iIsPro = C10107l.isPro(jLongValue);
            }
            i2 = iIsPro + iAdmob + i2;
        }
        this.amazon = i2;
        return i2;
    }

    public final void yandex(int i) {
        int[] iArr = this.loadAd;
        if (i > iArr.length) {
            int i2 = this.yandex;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.loadAd = Arrays.copyOf(iArr, i);
            this.crashlytics = Arrays.copyOf(this.crashlytics, i);
        }
    }
}
