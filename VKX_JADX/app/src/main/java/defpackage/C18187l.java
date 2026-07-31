package defpackage;

/* JADX INFO: renamed from: l٘ۚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18187l {
    public final C6822l loadAd;
    public final C6822l yandex;

    public C18187l(C6822l c6822l, C6822l c6822l2) {
        this.yandex = c6822l;
        this.loadAd = c6822l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18187l)) {
            return false;
        }
        C18187l c18187l = (C18187l) obj;
        return this.yandex.equals(c18187l.yandex) && this.loadAd.equals(c18187l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.yandex + ", secondaryOutConfig=" + this.loadAd + "}";
    }
}
