package defpackage;

/* JADX INFO: renamed from: lً٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8061l {
    public final String amazon;
    public final C10023l billing;
    public final String crashlytics;
    public final String loadAd;
    public final int purchase;
    public final String yandex;

    public C8061l(String str, String str2, String str3, String str4, int i, C10023l c10023l) {
        if (str == null) {
            C6541l.subs("Null appIdentifier");
            throw null;
        }
        this.yandex = str;
        if (str2 == null) {
            C6541l.subs("Null versionCode");
            throw null;
        }
        this.loadAd = str2;
        if (str3 == null) {
            C6541l.subs("Null versionName");
            throw null;
        }
        this.crashlytics = str3;
        if (str4 == null) {
            C6541l.subs("Null installUuid");
            throw null;
        }
        this.amazon = str4;
        this.purchase = i;
        this.billing = c10023l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8061l) {
            C8061l c8061l = (C8061l) obj;
            return this.yandex.equals(c8061l.yandex) && this.loadAd.equals(c8061l.loadAd) && this.crashlytics.equals(c8061l.crashlytics) && this.amazon.equals(c8061l.amazon) && this.purchase == c8061l.purchase && this.billing == c8061l.billing;
        }
        return false;
    }

    public final int hashCode() {
        return this.billing.hashCode() ^ ((((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003) ^ this.purchase) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.yandex + ", versionCode=" + this.loadAd + ", versionName=" + this.crashlytics + ", installUuid=" + this.amazon + ", deliveryMechanism=" + this.purchase + ", developmentPlatformProvider=" + this.billing + "}";
    }
}
