package defpackage;

/* JADX INFO: renamed from: lؚٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15545l {
    public final InterfaceC4945l loadAd;
    public final String yandex;

    public C15545l(String str, InterfaceC4945l interfaceC4945l) {
        this.yandex = str;
        this.loadAd = interfaceC4945l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15545l)) {
            return false;
        }
        C15545l c15545l = (C15545l) obj;
        return AbstractC8576l.yandex(this.yandex, c15545l.yandex) && this.loadAd.equals(c15545l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "WrappedTvCatalogEntry(id=" + this.yandex + ", entry=" + this.loadAd + ')';
    }
}
