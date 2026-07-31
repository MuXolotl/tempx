package defpackage;

/* JADX INFO: renamed from: lؗؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4587l {
    public final boolean amazon;
    public final String crashlytics;
    public final String loadAd;
    public final Object yandex;

    public C4587l(Object obj, String str, String str2, boolean z) {
        this.yandex = obj;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4587l)) {
            return false;
        }
        C4587l c4587l = (C4587l) obj;
        return AbstractC8576l.yandex(this.yandex, c4587l.yandex) && AbstractC8576l.yandex(this.loadAd, c4587l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c4587l.crashlytics) && this.amazon == c4587l.amazon;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        String str = this.crashlytics;
        return ((iAdvert + (str == null ? 0 : str.hashCode())) * 31) + (this.amazon ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(imageUrlModel=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", subtitle=");
        sb.append(this.crashlytics);
        sb.append(", roundImage=");
        return AbstractC0653l.tapsense(sb, this.amazon, ')');
    }
}
