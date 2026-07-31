package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lَؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10096l {
    public static final C10096l billing = new C10096l(0, new int[0], new Object[0], false);
    public int amazon = -1;
    public Object[] crashlytics;
    public int[] loadAd;
    public boolean purchase;
    public int yandex;

    public C10096l(int i, int[] iArr, Object[] objArr, boolean z) {
        this.yandex = i;
        this.loadAd = iArr;
        this.crashlytics = objArr;
        this.purchase = z;
    }

    public static C10096l yandex() {
        return new C10096l(0, new int[8], new Object[8], true);
    }

    public final void amazon(int i, Object obj) {
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

    public final int crashlytics() {
        int iYandex;
        int iLoadAd;
        int iYandex2;
        int i = this.amazon;
        if (i != -1) {
            return i;
        }
        int iSubs = 0;
        for (int i2 = 0; i2 < this.yandex; i2++) {
            int i3 = this.loadAd[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        AbstractC15619l abstractC15619l = (AbstractC15619l) this.crashlytics[i2];
                        int iYandex3 = AbstractC10908l.yandex(i6);
                        int iBilling = abstractC15619l.billing();
                        iSubs = AbstractC9029l.subs(iBilling, iBilling, iYandex3, iSubs);
                    } else if (i5 == 3) {
                        int iYandex4 = AbstractC10908l.yandex(i4 << 3);
                        iYandex = iYandex4 + iYandex4;
                        iLoadAd = ((C10096l) this.crashlytics[i2]).crashlytics();
                    } else {
                        if (i5 != 5) {
                            C11983l.ads(new C13529l());
                            return 0;
                        }
                        ((Integer) this.crashlytics[i2]).getClass();
                        iYandex2 = AbstractC10908l.yandex(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.crashlytics[i2]).getClass();
                    iYandex2 = AbstractC10908l.yandex(i4 << 3) + 8;
                }
                iSubs = iYandex2 + iSubs;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.crashlytics[i2]).longValue();
                iYandex = AbstractC10908l.yandex(i7);
                iLoadAd = AbstractC10908l.loadAd(jLongValue);
            }
            iSubs = iLoadAd + iYandex + iSubs;
        }
        this.amazon = iSubs;
        return iSubs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C10096l)) {
            C10096l c10096l = (C10096l) obj;
            int i = this.yandex;
            if (i == c10096l.yandex) {
                int[] iArr = this.loadAd;
                int[] iArr2 = c10096l.loadAd;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.crashlytics;
                Object[] objArr2 = c10096l.crashlytics;
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

    public final void loadAd(C15714l c15714l) {
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        if (this.yandex != 0) {
            for (int i = 0; i < this.yandex; i++) {
                int i2 = this.loadAd[i];
                Object obj = this.crashlytics[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    abstractC10908l.admob(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    abstractC10908l.subs(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    abstractC10908l.smaato(i4, (AbstractC15619l) obj);
                } else if (i3 == 3) {
                    abstractC10908l.amazon(i4, 3);
                    ((C10096l) obj).loadAd(c15714l);
                    abstractC10908l.amazon(i4, 4);
                } else {
                    if (i3 != 5) {
                        C11467l.metrica(new C13529l());
                        return;
                    }
                    abstractC10908l.mopub(i4, ((Integer) obj).intValue());
                }
            }
        }
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
}
