package defpackage;

/* JADX INFO: renamed from: lٌۦَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9193l {
    public final double amazon;
    public final double crashlytics;
    public final double loadAd;
    public final double yandex;

    public C9193l(double d, double d2, double d3, double d4) {
        this.yandex = d;
        this.loadAd = d2;
        this.crashlytics = d3;
        this.amazon = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9193l)) {
            return false;
        }
        C9193l c9193l = (C9193l) obj;
        return Double.compare(this.yandex, c9193l.yandex) == 0 && Double.compare(this.loadAd, c9193l.loadAd) == 0 && Double.compare(this.crashlytics, c9193l.crashlytics) == 0 && Double.compare(this.amazon, c9193l.amazon) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.yandex);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.loadAd);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.crashlytics);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.amazon);
        return i2 + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4));
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.yandex + ", normal=" + this.loadAd + ", medium=" + this.crashlytics + ", high=" + this.amazon + ")";
    }

    public final double yandex(double d) {
        double d2;
        double d3;
        double d4 = this.yandex;
        if (d <= -1.0d) {
            return d4;
        }
        double d5 = this.loadAd;
        if (d < 0.0d) {
            double d6 = (d - (-1.0d)) / 1.0d;
            d2 = (1.0d - d6) * d4;
            d3 = d6 * d5;
        } else {
            double d7 = this.crashlytics;
            if (d < 0.5d) {
                double d8 = (d - 0.0d) / 0.5d;
                d2 = (1.0d - d8) * d5;
                d3 = d8 * d7;
            } else {
                double d9 = this.amazon;
                if (d >= 1.0d) {
                    return d9;
                }
                double d10 = (d - 0.5d) / 0.5d;
                d2 = (1.0d - d10) * d7;
                d3 = d10 * d9;
            }
        }
        return d3 + d2;
    }
}
