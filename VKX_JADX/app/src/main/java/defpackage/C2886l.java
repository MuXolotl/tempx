package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؔۚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2886l {
    public static final C2886l billing = new C2886l(0, new int[0], new Object[0], false);
    public int amazon = -1;
    public Object[] crashlytics;
    public int[] loadAd;
    public boolean purchase;
    public int yandex;

    public C2886l(int i, int[] iArr, Object[] objArr, boolean z) {
        this.yandex = i;
        this.loadAd = iArr;
        this.crashlytics = objArr;
        this.purchase = z;
    }

    public static C2886l loadAd() {
        return new C2886l(0, new int[8], new Object[8], true);
    }

    public final void amazon(C0770l c0770l) {
        if (this.yandex != 0) {
            for (int i = 0; i < this.yandex; i++) {
                int i2 = this.loadAd[i];
                Object obj = this.crashlytics[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    c0770l.yandex.startapp(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    c0770l.yandex.admob(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    c0770l.yandex.purchase(i4, (AbstractC1096l) obj);
                } else if (i3 == 3) {
                    c0770l.yandex.remoteconfig(i4, 3);
                    ((C2886l) obj).amazon(c0770l);
                    c0770l.yandex.remoteconfig(i4, 4);
                } else {
                    if (i3 != 5) {
                        C11467l.metrica(new C6800l());
                        return;
                    }
                    c0770l.yandex.billing(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void crashlytics(int i, Object obj) {
        if (!this.purchase) {
            C3010l.mopub();
            return;
        }
        purchase(this.yandex + 1);
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
        if (obj != null && (obj instanceof C2886l)) {
            C2886l c2886l = (C2886l) obj;
            int i = this.yandex;
            if (i == c2886l.yandex) {
                int[] iArr = this.loadAd;
                int[] iArr2 = c2886l.loadAd;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.crashlytics;
                Object[] objArr2 = c2886l.crashlytics;
                int i3 = this.yandex;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.yandex;
        int i2 = i + 527;
        int[] iArr = this.loadAd;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.crashlytics;
        int i6 = this.yandex;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void purchase(int i) {
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

    public final int yandex() {
        int iYandex;
        int iLoadAd;
        int iYandex2;
        int i = this.amazon;
        if (i != -1) {
            return i;
        }
        int iSignatures = 0;
        for (int i2 = 0; i2 < this.yandex; i2++) {
            int i3 = this.loadAd[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        AbstractC1096l abstractC1096l = (AbstractC1096l) this.crashlytics[i2];
                        int iYandex3 = C9747l.yandex(i6);
                        int iAdmob = abstractC1096l.admob();
                        iSignatures = AbstractC9029l.signatures(iAdmob, iAdmob, iYandex3, iSignatures);
                    } else if (i5 == 3) {
                        int iYandex4 = C9747l.yandex(i4 << 3);
                        iYandex = iYandex4 + iYandex4;
                        iLoadAd = ((C2886l) this.crashlytics[i2]).yandex();
                    } else {
                        if (i5 != 5) {
                            C11983l.ads(new C6800l());
                            return 0;
                        }
                        ((Integer) this.crashlytics[i2]).getClass();
                        iYandex2 = C9747l.yandex(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.crashlytics[i2]).getClass();
                    iYandex2 = C9747l.yandex(i4 << 3) + 8;
                }
                iSignatures = iYandex2 + iSignatures;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.crashlytics[i2]).longValue();
                iYandex = C9747l.yandex(i7);
                iLoadAd = C9747l.loadAd(jLongValue);
            }
            iSignatures = iLoadAd + iYandex + iSignatures;
        }
        this.amazon = iSignatures;
        return iSignatures;
    }
}
