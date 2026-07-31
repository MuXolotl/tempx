package defpackage;

/* JADX INFO: renamed from: lِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18459l extends AbstractC5729l {
    public final C12151l yandex;

    public C18459l(C12151l c12151l) {
        this.yandex = c12151l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18459l) && AbstractC8576l.yandex(this.yandex, ((C18459l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.yandex + ')';
    }
}
