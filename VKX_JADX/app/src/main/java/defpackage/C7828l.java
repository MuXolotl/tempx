package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lًؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7828l {
    public static final String admob;
    public static final C7828l billing = new C7828l(new C2410l());
    public static final String firebase;
    public static final String isPro;
    public static final String mopub;
    public static final String subs;
    public final float amazon;
    public final long crashlytics;
    public final long loadAd;
    public final float purchase;
    public final long yandex;

    static {
        String str = AbstractC15323l.yandex;
        mopub = Integer.toString(0, 36);
        admob = Integer.toString(1, 36);
        subs = Integer.toString(2, 36);
        isPro = Integer.toString(3, 36);
        firebase = Integer.toString(4, 36);
    }

    public C7828l(C2410l c2410l) {
        long j = c2410l.yandex;
        long j2 = c2410l.loadAd;
        long j3 = c2410l.crashlytics;
        float f = c2410l.amazon;
        float f2 = c2410l.purchase;
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = f;
        this.purchase = f2;
    }

    public static C7828l loadAd(Bundle bundle) {
        C2410l c2410l = new C2410l();
        C7828l c7828l = billing;
        c2410l.yandex = bundle.getLong(mopub, c7828l.yandex);
        c2410l.loadAd = bundle.getLong(admob, c7828l.loadAd);
        c2410l.crashlytics = bundle.getLong(subs, c7828l.crashlytics);
        c2410l.amazon = bundle.getFloat(isPro, c7828l.amazon);
        c2410l.purchase = bundle.getFloat(firebase, c7828l.purchase);
        return new C7828l(c2410l);
    }

    public final Bundle crashlytics() {
        Bundle bundle = new Bundle();
        C7828l c7828l = billing;
        long j = c7828l.yandex;
        long j2 = this.yandex;
        if (j2 != j) {
            bundle.putLong(mopub, j2);
        }
        long j3 = c7828l.loadAd;
        long j4 = this.loadAd;
        if (j4 != j3) {
            bundle.putLong(admob, j4);
        }
        long j5 = c7828l.crashlytics;
        long j6 = this.crashlytics;
        if (j6 != j5) {
            bundle.putLong(subs, j6);
        }
        float f = c7828l.amazon;
        float f2 = this.amazon;
        if (f2 != f) {
            bundle.putFloat(isPro, f2);
        }
        float f3 = c7828l.purchase;
        float f4 = this.purchase;
        if (f4 != f3) {
            bundle.putFloat(firebase, f4);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7828l)) {
            return false;
        }
        C7828l c7828l = (C7828l) obj;
        return this.yandex == c7828l.yandex && this.loadAd == c7828l.loadAd && this.crashlytics == c7828l.crashlytics && this.amazon == c7828l.amazon && this.purchase == c7828l.purchase;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.crashlytics;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.amazon;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.purchase;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public final C2410l yandex() {
        C2410l c2410l = new C2410l();
        c2410l.yandex = this.yandex;
        c2410l.loadAd = this.loadAd;
        c2410l.crashlytics = this.crashlytics;
        c2410l.amazon = this.amazon;
        c2410l.purchase = this.purchase;
        return c2410l;
    }
}
