package defpackage;

/* JADX INFO: renamed from: lؘۗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5892l {
    public static final C12205l Companion = new C12205l();
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C5892l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C11458l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5892l)) {
            return false;
        }
        C5892l c5892l = (C5892l) obj;
        return AbstractC8576l.yandex(this.yandex, c5892l.yandex) && this.loadAd == c5892l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshWebviewRefreshTokenDto(token=");
        sb.append(this.yandex);
        sb.append(", expiresIn=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
