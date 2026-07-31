package defpackage;

/* JADX INFO: renamed from: lٗۡٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C17469l {
    public static final C15361l Companion = new C15361l();
    public final boolean yandex;

    public C17469l(int i, boolean z) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C9158l.loadAd);
            throw null;
        }
        this.yandex = z;
        if (z) {
            return;
        }
        C8339l.metrica("Undefined must equal true");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17469l) && this.yandex == ((C17469l) obj).yandex;
    }

    public final int hashCode() {
        boolean z = this.yandex;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return AbstractC0653l.tapsense(new StringBuilder("BsonValueJson(data="), this.yandex, ')');
    }

    public C17469l() {
        this.yandex = true;
    }
}
