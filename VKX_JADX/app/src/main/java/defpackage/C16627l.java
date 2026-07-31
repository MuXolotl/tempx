package defpackage;

/* JADX INFO: renamed from: lٖۛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16627l {
    public final int amazon;
    public final int crashlytics;
    public final C6886l loadAd;
    public final Object purchase;
    public final AbstractC17569l yandex;

    public C16627l(AbstractC17569l abstractC17569l, C6886l c6886l, int i, int i2, Object obj) {
        this.yandex = abstractC17569l;
        this.loadAd = c6886l;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16627l)) {
            return false;
        }
        C16627l c16627l = (C16627l) obj;
        return AbstractC8576l.yandex(this.yandex, c16627l.yandex) && AbstractC8576l.yandex(this.loadAd, c16627l.loadAd) && this.crashlytics == c16627l.crashlytics && this.amazon == c16627l.amazon && AbstractC8576l.yandex(this.purchase, c16627l.purchase);
    }

    public final int hashCode() {
        AbstractC17569l abstractC17569l = this.yandex;
        int iHashCode = (((((((abstractC17569l == null ? 0 : abstractC17569l.hashCode()) * 31) + this.loadAd.f14426l) * 31) + this.crashlytics) * 31) + this.amazon) * 31;
        Object obj = this.purchase;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.crashlytics;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.amazon;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.yandex);
        sb.append(", fontWeight=");
        sb.append(this.loadAd);
        sb.append(", fontStyle=");
        AbstractC9361l.appmetrica(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.purchase);
        sb.append(")");
        return sb.toString();
    }
}
