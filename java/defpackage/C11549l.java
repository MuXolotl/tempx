package defpackage;

/* JADX INFO: renamed from: lِؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C11549l {
    public static final C13125l Companion = new C13125l();
    public final String yandex;

    public C11549l(int i, String str) {
        if (1 == (i & 1)) {
            this.yandex = str;
        } else {
            AbstractC11036l.isPro(i, 1, C6026l.loadAd);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11549l) && AbstractC8576l.yandex(this.yandex, ((C11549l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("BsonValueJson(data="), this.yandex, ')');
    }

    public C11549l(C0873l c0873l) {
        this.yandex = c0873l.f2528l;
    }
}
