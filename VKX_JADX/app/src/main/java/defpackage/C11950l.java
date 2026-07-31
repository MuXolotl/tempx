package defpackage;

/* JADX INFO: renamed from: lِٚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C11950l {
    public static final C7875l Companion = new C7875l();
    public final C14705l loadAd;
    public final String yandex;

    public C11950l(int i, String str, C14705l c14705l) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C9942l.loadAd);
            throw null;
        }
        this.yandex = str;
        this.loadAd = c14705l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11950l)) {
            return false;
        }
        C11950l c11950l = (C11950l) obj;
        return AbstractC8576l.yandex(this.yandex, c11950l.yandex) && AbstractC8576l.yandex(this.loadAd, c11950l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.f28763l.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "BsonValueJson(code=" + this.yandex + ", scope=" + this.loadAd + ')';
    }

    public C11950l(C12439l c12439l) {
        String str = c12439l.f24552l;
        C14705l c14705l = c12439l.f24551l;
        this.yandex = str;
        this.loadAd = c14705l;
    }
}
