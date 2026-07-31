package defpackage;

/* JADX INFO: renamed from: lّؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1999l implements InterfaceC5965l {
    public final C5008l yandex;

    public C1999l(C5008l c5008l) {
        this.yandex = c5008l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1999l) && this.yandex == ((C1999l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.yandex + ')';
    }
}
