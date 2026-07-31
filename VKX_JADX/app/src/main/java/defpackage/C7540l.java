package defpackage;

/* JADX INFO: renamed from: lؚ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C7540l {
    public static final C6066l Companion = new C6066l();
    public final C13740l yandex;

    public C7540l(int i, C13740l c13740l) {
        if (1 == (i & 1)) {
            this.yandex = c13740l;
        } else {
            AbstractC11036l.isPro(i, 1, C16804l.loadAd);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7540l) && AbstractC8576l.yandex(this.yandex, ((C7540l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.yandex + ')';
    }

    public C7540l(C2271l c2271l) {
        this.yandex = new C13740l(c2271l.f4959l, c2271l.f4958l);
    }
}
