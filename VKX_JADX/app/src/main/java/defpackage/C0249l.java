package defpackage;

/* JADX INFO: renamed from: lُؑۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0249l {
    public static final C12260l Companion = new C12260l();
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C0249l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C14977l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0249l)) {
            return false;
        }
        C0249l c0249l = (C0249l) obj;
        return this.yandex == c0249l.yandex && AbstractC8576l.yandex(this.loadAd, c0249l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksGenreDto(id=");
        sb.append(this.yandex);
        sb.append(", name=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
