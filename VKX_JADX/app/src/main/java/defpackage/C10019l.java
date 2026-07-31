package defpackage;

/* JADX INFO: renamed from: lَؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10019l {
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C10019l(String str, String str2, String str3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10019l)) {
            return false;
        }
        C10019l c10019l = (C10019l) obj;
        return this.yandex.equals(c10019l.yandex) && AbstractC8576l.yandex(this.loadAd, c10019l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c10019l.crashlytics);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        String str = this.crashlytics;
        return iAdvert + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackUrl(provider=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", hint=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
