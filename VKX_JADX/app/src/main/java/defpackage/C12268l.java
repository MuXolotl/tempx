package defpackage;

/* JADX INFO: renamed from: lِۧۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12268l {
    public final C2494l loadAd;
    public final C18031l yandex;

    public C12268l(C18031l c18031l, C2494l c2494l) {
        this.yandex = c18031l;
        this.loadAd = c2494l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12268l) {
            C12268l c12268l = (C12268l) obj;
            return AbstractC8576l.yandex(this.yandex, c12268l.yandex) && this.loadAd == c12268l.loadAd;
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "IacAuthSession(tag=" + this.yandex + ", handle=" + this.loadAd + ')';
    }
}
