package defpackage;

/* JADX INFO: renamed from: lْٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14288l {
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C14288l(String str, String str2, String str3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14288l)) {
            return false;
        }
        C14288l c14288l = (C14288l) obj;
        return AbstractC8576l.yandex(this.yandex, c14288l.yandex) && this.loadAd.equals(c14288l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14288l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountUiState(name=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", avatar=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
