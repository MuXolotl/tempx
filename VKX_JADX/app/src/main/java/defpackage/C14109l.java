package defpackage;

/* JADX INFO: renamed from: lّٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14109l implements InterfaceC5965l {
    public final AbstractC6896l yandex;

    public C14109l(AbstractC6896l abstractC6896l) {
        this.yandex = abstractC6896l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14109l) && this.yandex.equals(((C14109l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.yandex + ')';
    }
}
