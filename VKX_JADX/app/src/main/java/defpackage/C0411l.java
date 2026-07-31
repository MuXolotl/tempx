package defpackage;

/* JADX INFO: renamed from: lِؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0411l {
    public final double amazon;
    public final double billing;
    public final double crashlytics;
    public final double loadAd;
    public final double mopub;
    public final double purchase;
    public final double yandex;

    public C0411l(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.yandex = d;
        this.loadAd = d2;
        this.crashlytics = d3;
        this.amazon = d4;
        this.purchase = d5;
        this.billing = d6;
        this.mopub = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C8339l.metrica("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C8339l.metrica("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C8339l.metrica("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C8339l.metrica("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C8339l.metrica("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C8339l.metrica("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0411l)) {
            return false;
        }
        C0411l c0411l = (C0411l) obj;
        return Double.compare(this.yandex, c0411l.yandex) == 0 && Double.compare(this.loadAd, c0411l.loadAd) == 0 && Double.compare(this.crashlytics, c0411l.crashlytics) == 0 && Double.compare(this.amazon, c0411l.amazon) == 0 && Double.compare(this.purchase, c0411l.purchase) == 0 && Double.compare(this.billing, c0411l.billing) == 0 && Double.compare(this.mopub, c0411l.mopub) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.yandex);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.loadAd);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.crashlytics);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.amazon);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.purchase);
        int i4 = (i3 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.billing);
        int i5 = (i4 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.mopub);
        return i5 + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.yandex + ", a=" + this.loadAd + ", b=" + this.crashlytics + ", c=" + this.amazon + ", d=" + this.purchase + ", e=" + this.billing + ", f=" + this.mopub + ")";
    }

    public /* synthetic */ C0411l(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
