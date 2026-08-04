package defpackage;

/* JADX INFO: renamed from: lؙٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15524l {
    public final double loadAd;
    public final C5254l yandex;

    public C15524l(C5254l c5254l, double d) {
        this.yandex = c5254l;
        this.loadAd = d;
        if (0.0d > d || d > 1.0d) {
            throw new IllegalArgumentException(("Quality should be in range [0, 1]: " + d).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15524l)) {
            return false;
        }
        C15524l c15524l = (C15524l) obj;
        return AbstractC8576l.yandex(this.yandex, c15524l.yandex) && Double.compare(this.loadAd, c15524l.loadAd) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.loadAd);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "ContentTypeWithQuality(contentType=" + this.yandex + ", quality=" + this.loadAd + ')';
    }
}
