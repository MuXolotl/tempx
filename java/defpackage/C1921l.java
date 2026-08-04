package defpackage;

/* JADX INFO: renamed from: lؙؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1921l {
    public final EnumC12999l loadAd;
    public final AbstractC18643l yandex;

    public C1921l(AbstractC18643l abstractC18643l, EnumC12999l enumC12999l) {
        this.yandex = abstractC18643l;
        this.loadAd = enumC12999l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1921l)) {
            return false;
        }
        C1921l c1921l = (C1921l) obj;
        return AbstractC8576l.yandex(this.yandex, c1921l.yandex) && this.loadAd == c1921l.loadAd;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        EnumC12999l enumC12999l = this.loadAd;
        return iHashCode + (enumC12999l == null ? 0 : enumC12999l.hashCode());
    }

    public final String toString() {
        return "TrackWithProvider(track=" + this.yandex + ", provider=" + this.loadAd + ')';
    }
}
