package defpackage;

/* JADX INFO: renamed from: lٔٙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14974l {
    public final String amazon;
    public final Boolean billing;
    public final String crashlytics;
    public final String loadAd;
    public final Boolean mopub;
    public final boolean purchase;
    public final String yandex;

    public C14974l(String str, String str2, String str3, String str4, boolean z, Boolean bool, Boolean bool2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = z;
        this.billing = bool;
        this.mopub = bool2;
    }

    public static C14974l yandex(C14974l c14974l, Boolean bool, Boolean bool2, int i) {
        String str = c14974l.yandex;
        String str2 = c14974l.loadAd;
        String str3 = c14974l.crashlytics;
        String str4 = c14974l.amazon;
        boolean z = c14974l.purchase;
        if ((i & 32) != 0) {
            bool = c14974l.billing;
        }
        Boolean bool3 = bool;
        if ((i & 64) != 0) {
            bool2 = c14974l.mopub;
        }
        return new C14974l(str, str2, str3, str4, z, bool3, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14974l)) {
            return false;
        }
        C14974l c14974l = (C14974l) obj;
        return this.yandex.equals(c14974l.yandex) && AbstractC8576l.yandex(this.loadAd, c14974l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14974l.crashlytics) && AbstractC8576l.yandex(this.amazon, c14974l.amazon) && this.purchase == c14974l.purchase && AbstractC8576l.yandex(this.billing, c14974l.billing) && AbstractC8576l.yandex(this.mopub, c14974l.mopub);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        String str = this.crashlytics;
        int iAdvert2 = (AbstractC12589l.advert((iAdvert + (str == null ? 0 : str.hashCode())) * 31, 31, this.amazon) + (this.purchase ? 1231 : 1237)) * 31;
        Boolean bool = this.billing;
        int iHashCode = (iAdvert2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.mopub;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "TrackMetadata(id=" + this.yandex + ", title=" + this.loadAd + ", subtitle=" + this.crashlytics + ", artist=" + this.amazon + ", isExplicit=" + this.purchase + ", liked=" + this.billing + ", disliked=" + this.mopub + ')';
    }
}
