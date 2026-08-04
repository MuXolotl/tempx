package defpackage;

/* JADX INFO: renamed from: lؚۚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7507l {
    public final long amazon;
    public final int billing;
    public final long crashlytics;
    public final String loadAd;
    public final boolean mopub;
    public final long purchase;
    public final String yandex;

    public C7507l(String str, String str2, long j, long j2, long j3, int i) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = j3;
        this.billing = i;
        this.mopub = (i & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7507l) {
            C7507l c7507l = (C7507l) obj;
            if (this.yandex.equals(c7507l.yandex) && this.loadAd.equals(c7507l.loadAd) && this.crashlytics == c7507l.crashlytics && this.amazon == c7507l.amazon && this.purchase == c7507l.purchase && this.billing == c7507l.billing) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        long j = this.crashlytics;
        int i = (iAdvert + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.amazon;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.purchase;
        return ((((int) (j3 ^ (j3 >>> 32))) + i2) * 31) + this.billing;
    }

    public final String toString() {
        String strYandex = C6918l.yandex(this.purchase);
        StringBuilder sbLicense = AbstractC14814l.license("ClassInfo(name=", this.yandex, ", primaryKey=", this.loadAd, ", numProperties=");
        sbLicense.append(this.crashlytics);
        sbLicense.append(", numComputedProperties=");
        sbLicense.append(this.amazon);
        sbLicense.append(", key=");
        sbLicense.append(strYandex);
        sbLicense.append(", flags=");
        sbLicense.append(this.billing);
        sbLicense.append(")");
        return sbLicense.toString();
    }
}
