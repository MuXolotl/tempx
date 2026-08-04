package defpackage;

/* JADX INFO: renamed from: lؗ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5185l implements InterfaceC10807l {
    public final C4964l yandex;

    public C5185l(C4964l c4964l) {
        this.yandex = c4964l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5185l) && AbstractC8576l.yandex(this.yandex, ((C5185l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Available(profile=" + this.yandex + ')';
    }
}
