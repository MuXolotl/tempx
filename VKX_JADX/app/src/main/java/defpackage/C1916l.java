package defpackage;

/* JADX INFO: renamed from: lۣؓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1916l {
    public final InterfaceC18514l loadAd;
    public final String yandex;

    public C1916l(String str, InterfaceC18514l interfaceC18514l) {
        this.yandex = str;
        this.loadAd = interfaceC18514l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1916l)) {
            return false;
        }
        C1916l c1916l = (C1916l) obj;
        return AbstractC8576l.yandex(this.yandex, c1916l.yandex) && this.loadAd.equals(c1916l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "WrappedCatalogHorizontalItem(id=" + this.yandex + ", entry=" + this.loadAd + ')';
    }
}
