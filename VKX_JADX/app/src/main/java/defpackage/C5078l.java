package defpackage;

/* JADX INFO: renamed from: lٌؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5078l {
    public final C15578l loadAd;
    public final Object yandex;

    public C5078l(C15851l c15851l, C15578l c15578l) {
        this.yandex = c15851l;
        this.loadAd = c15578l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5078l) {
            C5078l c5078l = (C5078l) obj;
            return AbstractC8576l.yandex(this.yandex, c5078l.yandex) && this.loadAd == c5078l.loadAd;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.yandex;
        return this.loadAd.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.yandex + ", transition=" + this.loadAd + ")";
    }
}
