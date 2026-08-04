package defpackage;

/* JADX INFO: renamed from: lؓۗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C2060l {
    public static final C14982l Companion = new C14982l();
    public final C17462l yandex;

    public C2060l(int i, C17462l c17462l) {
        if (1 == (i & 1)) {
            this.yandex = c17462l;
        } else {
            AbstractC11036l.isPro(i, 1, C2206l.loadAd);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2060l) && AbstractC8576l.yandex(this.yandex, ((C2060l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.yandex + ')';
    }

    public C2060l(C4058l c4058l) {
        this.yandex = new C17462l(c4058l.f8353l, c4058l.f8352l);
    }
}
