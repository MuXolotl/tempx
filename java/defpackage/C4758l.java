package defpackage;

/* JADX INFO: renamed from: lًؗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4758l implements InterfaceC8289l {
    public final C2391l yandex;

    public C4758l(C2391l c2391l) {
        this.yandex = c2391l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4758l) && AbstractC8576l.yandex(this.yandex, ((C4758l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Ready(book=" + this.yandex + ')';
    }
}
