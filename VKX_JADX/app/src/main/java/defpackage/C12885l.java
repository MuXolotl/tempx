package defpackage;

/* JADX INFO: renamed from: lُّ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12885l {
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public C12885l(String str, int i, String str2) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12885l)) {
            return false;
        }
        C12885l c12885l = (C12885l) obj;
        return this.yandex == c12885l.yandex && AbstractC8576l.yandex(this.loadAd, c12885l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12885l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12589l.advert(AbstractC5020l.inmobi(this.yandex) * 31, 31, this.loadAd);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Mix(type=");
        int i = this.yandex;
        if (i == 1) {
            str = "ByAlbum";
        } else if (i == 2) {
            str = "ByPlaylist";
        } else if (i != 3) {
            str = i != 4 ? "null" : "ByArtist";
        } else {
            str = "ByTrack";
        }
        sb.append(str);
        sb.append(", name=");
        sb.append(this.loadAd);
        sb.append(", internalApiId=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
