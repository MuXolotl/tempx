package defpackage;

/* JADX INFO: renamed from: lًٍٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9401l {
    public final boolean loadAd;
    public final boolean yandex;

    public C9401l(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.yandex = z;
        this.loadAd = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9401l)) {
            return false;
        }
        C9401l c9401l = (C9401l) obj;
        return this.yandex == c9401l.yandex && this.loadAd == c9401l.loadAd;
    }

    public final int hashCode() {
        return (((((((AbstractC5020l.inmobi(1) + ((((this.yandex ? 1231 : 1237) * 31) + (this.loadAd ? 1231 : 1237)) * 31)) * 31) + 1231) * 31) + 1231) * 31) + 2) * 31;
    }
}
