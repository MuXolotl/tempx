package defpackage;

/* JADX INFO: renamed from: l٘ٞٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18087l implements InterfaceC16831l {
    public final C12985l yandex;

    public C18087l(C12985l c12985l) {
        this.yandex = c12985l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18087l) && this.yandex.equals(((C18087l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Result(response=" + this.yandex + ')';
    }
}
