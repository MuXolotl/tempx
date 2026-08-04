package defpackage;

/* JADX INFO: renamed from: lْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C13441l {
    public static final C0668l Companion = new C0668l();
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C13441l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C12449l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13441l)) {
            return false;
        }
        C13441l c13441l = (C13441l) obj;
        return this.yandex == c13441l.yandex && AbstractC8576l.yandex(this.loadAd, c13441l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthExchangeTokenDto(tier=");
        sb.append(this.yandex);
        sb.append(", token=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
