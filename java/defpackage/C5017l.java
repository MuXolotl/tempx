package defpackage;

/* JADX INFO: renamed from: lٜؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C5017l implements InterfaceC0564l {
    public static final C5624l Companion = new C5624l();
    public final C0523l yandex;

    public /* synthetic */ C5017l(int i, C0523l c0523l) {
        if (1 == (i & 1)) {
            this.yandex = c0523l;
        } else {
            AbstractC11036l.isPro(i, 1, C2776l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5017l) && AbstractC8576l.yandex(this.yandex, ((C5017l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Playlist(args=" + this.yandex + ')';
    }

    public C5017l(C0523l c0523l) {
        this.yandex = c0523l;
    }
}
