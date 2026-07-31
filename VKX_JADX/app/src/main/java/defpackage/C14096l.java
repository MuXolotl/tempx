package defpackage;

/* JADX INFO: renamed from: lّٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C14096l {
    public static final C16799l Companion = new C16799l();
    public final C17415l yandex;

    public C14096l(int i, C17415l c17415l) {
        if (1 == (i & 1)) {
            this.yandex = c17415l;
        } else {
            AbstractC11036l.isPro(i, 1, C17561l.loadAd);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14096l) && AbstractC8576l.yandex(this.yandex, ((C14096l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.yandex.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.yandex + ')';
    }

    public C14096l(C2412l c2412l) {
        this.yandex = new C17415l(String.valueOf(c2412l.f5174l));
    }
}
