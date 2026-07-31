package defpackage;

/* JADX INFO: renamed from: lٜ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C18046l implements InterfaceC0564l {
    public static final C2487l Companion = new C2487l();
    public final String yandex;

    public /* synthetic */ C18046l(int i, String str) {
        if (1 == (i & 1)) {
            this.yandex = str;
        } else {
            AbstractC11036l.isPro(i, 1, C12255l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18046l) && AbstractC8576l.yandex(this.yandex, ((C18046l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("CatalogSection(id="), this.yandex, ')');
    }

    public C18046l(String str) {
        this.yandex = str;
    }
}
