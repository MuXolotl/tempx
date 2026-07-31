package defpackage;

/* JADX INFO: renamed from: lؚۨۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7687l {
    public final InterfaceC3841l yandex;

    public C7687l(InterfaceC3841l interfaceC3841l) {
        this.yandex = interfaceC3841l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7687l) {
            return AbstractC8576l.yandex(((C7687l) obj).yandex, this.yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }
}
