package defpackage;

/* JADX INFO: renamed from: lؒۖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C1245l implements InterfaceC7493l {
    public static final C16039l Companion = new C16039l();
    public final C4513l yandex;

    public /* synthetic */ C1245l(int i, C4513l c4513l) {
        if (1 == (i & 1)) {
            this.yandex = c4513l;
        } else {
            AbstractC11036l.isPro(i, 1, C16823l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1245l) && AbstractC8576l.yandex(this.yandex, ((C1245l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "NestedApiError(error=" + this.yandex + ')';
    }
}
