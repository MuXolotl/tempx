package defpackage;

/* JADX INFO: renamed from: lؖۤۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4494l implements InterfaceC5475l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C4494l(String str, String str2, String str3, String str4) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4494l)) {
            return false;
        }
        C4494l c4494l = (C4494l) obj;
        return this.yandex.equals(c4494l.yandex) && this.loadAd.equals(c4494l.loadAd) && this.crashlytics.equals(c4494l.crashlytics) && this.amazon.equals(c4494l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceholderWeb(iconUrl=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", text=");
        sb.append(this.crashlytics);
        sb.append(", reload=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }
}
