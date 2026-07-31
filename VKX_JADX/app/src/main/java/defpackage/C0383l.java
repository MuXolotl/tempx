package defpackage;

/* JADX INFO: renamed from: lؑ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0383l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final String yandex;

    public C0383l(String str, String str2, String str3, String str4, String str5) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0383l)) {
            return false;
        }
        C0383l c0383l = (C0383l) obj;
        return this.yandex.equals(c0383l.yandex) && AbstractC8576l.yandex(this.loadAd, c0383l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c0383l.crashlytics) && AbstractC8576l.yandex(this.amazon, c0383l.amazon) && AbstractC8576l.yandex(this.purchase, c0383l.purchase);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
        String str = this.amazon;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.purchase;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetTrack(id=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", artist=");
        sb.append(this.crashlytics);
        sb.append(", coverUrl=");
        sb.append(this.amazon);
        sb.append(", url=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
