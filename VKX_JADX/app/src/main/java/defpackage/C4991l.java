package defpackage;

/* JADX INFO: renamed from: lؗٚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4991l {
    public final InterfaceC4005l loadAd;
    public final C3625l yandex;

    public C4991l(C3625l c3625l, InterfaceC4005l interfaceC4005l) {
        this.yandex = c3625l;
        this.loadAd = interfaceC4005l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4991l)) {
            return false;
        }
        C4991l c4991l = (C4991l) obj;
        return AbstractC8576l.yandex(this.yandex, c4991l.yandex) && this.loadAd.equals(c4991l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.yandex) + ", offsetMapping=" + this.loadAd + ")";
    }
}
