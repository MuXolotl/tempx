package defpackage;

/* JADX INFO: renamed from: lؘْ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13174l {
    public String loadAd;
    public final String yandex;
    public boolean crashlytics = false;
    public C16836l amazon = null;

    public C13174l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13174l)) {
            return false;
        }
        C13174l c13174l = (C13174l) obj;
        return AbstractC8576l.yandex(this.yandex, c13174l.yandex) && AbstractC8576l.yandex(this.loadAd, c13174l.loadAd) && this.crashlytics == c13174l.crashlytics && AbstractC8576l.yandex(this.amazon, c13174l.amazon);
    }

    public final int hashCode() {
        int iAdvert = (AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + (this.crashlytics ? 1231 : 1237)) * 31;
        C16836l c16836l = this.amazon;
        return iAdvert + (c16836l == null ? 0 : c16836l.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.amazon + ", isShowingSubstitution=" + this.crashlytics + ")";
    }
}
