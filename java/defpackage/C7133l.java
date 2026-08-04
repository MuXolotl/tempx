package defpackage;

/* JADX INFO: renamed from: lًؚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7133l {
    public static final C13498l Companion = new C13498l();
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C7133l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C8262l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7133l)) {
            return false;
        }
        C7133l c7133l = (C7133l) obj;
        return AbstractC8576l.yandex(this.yandex, c7133l.yandex) && this.loadAd == c7133l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshWebviewAccessTokenDto(token=");
        sb.append(this.yandex);
        sb.append(", expiresIn=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
