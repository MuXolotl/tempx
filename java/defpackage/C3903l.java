package defpackage;

/* JADX INFO: renamed from: lؖؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3903l {
    public final long admob;
    public final float amazon;
    public final long billing;
    public final float crashlytics;
    public final float loadAd;
    public final long mopub;
    public final long purchase;
    public final float yandex;

    static {
        AbstractC8238l.yandex(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C3903l(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        this.purchase = j;
        this.billing = j2;
        this.mopub = j3;
        this.admob = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3903l)) {
            return false;
        }
        C3903l c3903l = (C3903l) obj;
        return Float.compare(this.yandex, c3903l.yandex) == 0 && Float.compare(this.loadAd, c3903l.loadAd) == 0 && Float.compare(this.crashlytics, c3903l.crashlytics) == 0 && Float.compare(this.amazon, c3903l.amazon) == 0 && AbstractC11994l.purchase(this.purchase, c3903l.purchase) && AbstractC11994l.purchase(this.billing, c3903l.billing) && AbstractC11994l.purchase(this.mopub, c3903l.mopub) && AbstractC11994l.purchase(this.admob, c3903l.admob);
    }

    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31);
        long j = this.purchase;
        long j2 = this.billing;
        int i = (((int) (j2 ^ (j2 >>> 32))) + ((((int) (j ^ (j >>> 32))) + iMopub) * 31)) * 31;
        long j3 = this.mopub;
        int i2 = (((int) (j3 ^ (j3 >>> 32))) + i) * 31;
        long j4 = this.admob;
        return ((int) (j4 ^ (j4 >>> 32))) + i2;
    }

    public final float loadAd() {
        return this.crashlytics - this.yandex;
    }

    public final String toString() {
        String strCrashlytics = AbstractC4447l.crashlytics(this.yandex);
        String strCrashlytics2 = AbstractC4447l.crashlytics(this.loadAd);
        String strCrashlytics3 = AbstractC4447l.crashlytics(this.crashlytics);
        String strCrashlytics4 = AbstractC4447l.crashlytics(this.amazon);
        StringBuilder sb = new StringBuilder();
        sb.append(strCrashlytics);
        sb.append(", ");
        sb.append(strCrashlytics2);
        sb.append(", ");
        sb.append(strCrashlytics3);
        String strAds = AbstractC0653l.ads(sb, ", ", strCrashlytics4);
        long j = this.purchase;
        long j2 = this.billing;
        boolean zPurchase = AbstractC11994l.purchase(j, j2);
        long j3 = this.mopub;
        long j4 = this.admob;
        if (zPurchase && AbstractC11994l.purchase(j2, j3) && AbstractC11994l.purchase(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return AbstractC14814l.ads("RoundRect(rect=", strAds, ", radius=", AbstractC4447l.crashlytics(Float.intBitsToFloat(i)), ")");
            }
            String strCrashlytics5 = AbstractC4447l.crashlytics(Float.intBitsToFloat(i));
            return AbstractC0653l.ads(AbstractC14814l.license("RoundRect(rect=", strAds, ", x=", strCrashlytics5, ", y="), AbstractC4447l.crashlytics(Float.intBitsToFloat(i2)), ")");
        }
        String strVip = AbstractC11994l.vip(j);
        String strVip2 = AbstractC11994l.vip(j2);
        String strVip3 = AbstractC11994l.vip(j3);
        String strVip4 = AbstractC11994l.vip(j4);
        StringBuilder sbLicense = AbstractC14814l.license("RoundRect(rect=", strAds, ", topLeft=", strVip, ", topRight=");
        AbstractC9361l.appmetrica(sbLicense, strVip2, ", bottomRight=", strVip3, ", bottomLeft=");
        return AbstractC0653l.ads(sbLicense, strVip4, ")");
    }

    public final float yandex() {
        return this.amazon - this.loadAd;
    }
}
