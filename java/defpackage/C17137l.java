package defpackage;

/* JADX INFO: renamed from: lٗٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17137l {
    public InterfaceC8097l loadAd;
    public final Float yandex;

    public C17137l(Float f, InterfaceC8097l interfaceC8097l) {
        this.yandex = f;
        this.loadAd = interfaceC8097l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17137l)) {
            return false;
        }
        C17137l c17137l = (C17137l) obj;
        return c17137l.yandex.equals(this.yandex) && AbstractC8576l.yandex(c17137l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 961);
    }
}
