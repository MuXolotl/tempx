package defpackage;

/* JADX INFO: renamed from: lَۙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10543l implements InterfaceC5475l {
    public final int amazon;
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public C10543l(int i, int i2, String str, String str2) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10543l)) {
            return false;
        }
        C10543l c10543l = (C10543l) obj;
        return this.yandex == c10543l.yandex && this.loadAd.equals(c10543l.loadAd) && this.crashlytics.equals(c10543l.crashlytics) && this.amazon == c10543l.amazon;
    }

    public final int hashCode() {
        return AbstractC12589l.advert(AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd), 31, this.crashlytics) + this.amazon;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(iconRes=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", text=");
        sb.append(this.crashlytics);
        sb.append(", reloadButtonRes=");
        return AbstractC0653l.adcel(sb, this.amazon, ')');
    }
}
