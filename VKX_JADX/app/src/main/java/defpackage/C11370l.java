package defpackage;

/* JADX INFO: renamed from: lُ۟ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C11370l {
    public static final C2727l Companion = new C2727l();
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C11370l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C4144l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11370l)) {
            return false;
        }
        C11370l c11370l = (C11370l) obj;
        return this.yandex == c11370l.yandex && AbstractC8576l.yandex(this.loadAd, c11370l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGenreDto(id=");
        sb.append(this.yandex);
        sb.append(", name=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
