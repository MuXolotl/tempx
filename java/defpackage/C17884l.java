package defpackage;

/* JADX INFO: renamed from: lّ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17884l {
    public static final C6651l Companion = new C6651l();
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C17884l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C13667l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17884l)) {
            return false;
        }
        C17884l c17884l = (C17884l) obj;
        return AbstractC8576l.yandex(this.yandex, c17884l.yandex) && this.loadAd == c17884l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshAccessTokenDto(token=");
        sb.append(this.yandex);
        sb.append(", expiresIn=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
