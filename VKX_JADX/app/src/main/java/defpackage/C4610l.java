package defpackage;

/* JADX INFO: renamed from: lؗؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4610l {
    public final InterfaceC17807l yandex;

    public C4610l(InterfaceC17807l interfaceC17807l) {
        this.yandex = interfaceC17807l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4610l) {
            return Float.compare(0.0f, 0.0f) == 0 && AbstractC8576l.yandex(this.yandex, ((C4610l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.yandex + ")";
    }
}
