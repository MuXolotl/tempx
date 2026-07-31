package defpackage;

/* JADX INFO: renamed from: lٗۨؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17572l {
    public final int crashlytics;
    public final String loadAd;
    public final String yandex;

    public C17572l(String str, int i, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17572l)) {
            return false;
        }
        C17572l c17572l = (C17572l) obj;
        return AbstractC8576l.yandex(this.yandex, c17572l.yandex) && this.loadAd.equals(c17572l.loadAd) && this.crashlytics == c17572l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NextDockItem(id=");
        sb.append(this.yandex);
        sb.append(", text=");
        sb.append(this.loadAd);
        sb.append(", iconRes=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
