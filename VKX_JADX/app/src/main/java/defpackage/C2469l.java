package defpackage;

/* JADX INFO: renamed from: lؚؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2469l {
    public final InterfaceC8097l loadAd;
    public final AbstractC2249l yandex;

    public C2469l(AbstractC2249l abstractC2249l, InterfaceC8097l interfaceC8097l) {
        this.yandex = abstractC2249l;
        this.loadAd = interfaceC8097l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2469l)) {
            return false;
        }
        C2469l c2469l = (C2469l) obj;
        return AbstractC8576l.yandex(this.yandex, c2469l.yandex) && AbstractC8576l.yandex(this.loadAd, c2469l.loadAd);
    }

    public final int hashCode() {
        return (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.yandex + ", easing=" + this.loadAd + ", arcMode=ArcMode(value=0))";
    }
}
