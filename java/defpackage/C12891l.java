package defpackage;

/* JADX INFO: renamed from: lّ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C12891l {
    public static final C8819l Companion = new C8819l();
    public final C1582l yandex;

    public C12891l(C4744l c4744l) {
        long j = c4744l.f9769l;
        this.yandex = new C1582l((int) (j >> 32), (int) j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12891l) && AbstractC8576l.yandex(this.yandex, ((C12891l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.yandex + ')';
    }

    public C12891l(int i, C1582l c1582l) {
        if (1 == (i & 1)) {
            this.yandex = c1582l;
        } else {
            AbstractC11036l.isPro(i, 1, C17234l.loadAd);
            throw null;
        }
    }
}
