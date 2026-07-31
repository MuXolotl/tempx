package defpackage;

/* JADX INFO: renamed from: lؚٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7279l {
    public final InterfaceC1388l yandex;

    public C7279l(InterfaceC1388l interfaceC1388l) {
        this.yandex = interfaceC1388l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7279l) {
            return AbstractC8576l.yandex(this.yandex, ((C7279l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return ((InterfaceC13937l) this.yandex).mo1730private().getName();
    }
}
