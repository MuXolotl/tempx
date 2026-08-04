package defpackage;

/* JADX INFO: renamed from: lْ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13447l implements InterfaceC15066l {
    public final C12151l yandex;

    public C13447l(C12151l c12151l) {
        this.yandex = c12151l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13447l) && this.yandex == ((C13447l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Success(activeCamera=" + this.yandex + ')';
    }
}
