package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11788l {
    public static final C11788l billing = new C11788l(0, new int[0], new Object[0], false);
    public int amazon = -1;
    public Object[] crashlytics;
    public int[] loadAd;
    public boolean purchase;
    public int yandex;

    public C11788l(int i, int[] iArr, Object[] objArr, boolean z) {
        this.yandex = i;
        this.loadAd = iArr;
        this.crashlytics = objArr;
        this.purchase = z;
    }

    public static C11788l crashlytics() {
        return new C11788l(0, new int[8], new Object[8], true);
    }

    public final void amazon(int i, Object obj) {
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
        if (obj == null || !(obj instanceof C11788l)) {
            return false;
        }
        C11788l c11788l = (C11788l) obj;
        int i = this.yandex;
        if (i == c11788l.yandex) {
            int[] iArr = this.loadAd;
            int[] iArr2 = c11788l.loadAd;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.crashlytics;
            Object[] objArr2 = c11788l.crashlytics;
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
        int iPurchase;
        int iMopub;
        int iPurchase2;
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
                    iPurchase2 = AbstractC11078l.purchase(i5) + 8;
                } else if (i6 == 2) {
                    iPurchase2 = AbstractC11078l.yandex(i5, (AbstractC16071l) this.crashlytics[i3]);
                } else if (i6 == 3) {
                    iPurchase = AbstractC11078l.purchase(i5) * 2;
                    iMopub = ((C11788l) this.crashlytics[i3]).loadAd();
                } else {
                    if (i6 != 5) {
                        C11983l.ads(C0803l.crashlytics());
                        return 0;
                    }
                    ((Integer) this.crashlytics[i3]).getClass();
                    iPurchase2 = AbstractC11078l.purchase(i5) + 4;
                }
                i2 = iPurchase2 + i2;
            } else {
                long jLongValue = ((Long) this.crashlytics[i3]).longValue();
                iPurchase = AbstractC11078l.purchase(i5);
                iMopub = AbstractC11078l.mopub(jLongValue);
            }
            i2 = iMopub + iPurchase + i2;
        }
        this.amazon = i2;
        return i2;
    }

    public final void purchase(C13161l c13161l) {
        if (this.yandex == 0) {
            return;
        }
        c13161l.getClass();
        for (int i = 0; i < this.yandex; i++) {
            int i2 = this.loadAd[i];
            Object obj = this.crashlytics[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((AbstractC11078l) c13161l.f25776l).ad(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((AbstractC11078l) c13161l.f25776l).vip(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((AbstractC11078l) c13161l.f25776l).firebase(i3, (AbstractC16071l) obj);
            } else if (i4 == 3) {
                AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
                abstractC11078l.Signature(i3, 3);
                ((C11788l) obj).purchase(c13161l);
                abstractC11078l.Signature(i3, 4);
            } else {
                if (i4 != 5) {
                    C11467l.metrica(C0803l.crashlytics());
                    return;
                }
                ((AbstractC11078l) c13161l.f25776l).smaato(i3, ((Integer) obj).intValue());
            }
        }
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
