package defpackage;

/* JADX INFO: renamed from: lٔٚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14997l {
    public final double amazon;
    public final double crashlytics;
    public final double loadAd;
    public final int yandex;

    public C14997l(int i) {
        this.yandex = i;
        C10472l c10472l = C10472l.firebase;
        int i2 = i & 255;
        double dPurchase = AbstractC2533l.purchase((16711680 & i) >> 16);
        double dPurchase2 = AbstractC2533l.purchase((65280 & i) >> 8);
        double dPurchase3 = AbstractC2533l.purchase(i2);
        double d = (0.18051042d * dPurchase3) + (0.35762064d * dPurchase2) + (0.41233895d * dPurchase);
        double d2 = (0.0722d * dPurchase3) + (0.7152d * dPurchase2) + (0.2126d * dPurchase);
        double d3 = (dPurchase3 * 0.95034478d) + (dPurchase2 * 0.11916382d) + (dPurchase * 0.01932141d);
        double d4 = c10472l.subs;
        double d5 = c10472l.purchase;
        double d6 = c10472l.loadAd;
        double[][] dArr = AbstractC6873l.yandex;
        double[] dArr2 = dArr[0];
        double d7 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d8 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        double d9 = (d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]);
        double[] dArr5 = c10472l.mopub;
        double d10 = dArr5[0] * d7;
        double d11 = dArr5[1] * d8;
        double d12 = dArr5[2] * d9;
        double d13 = c10472l.admob;
        double dPow = Math.pow((Math.abs(d10) * d13) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d11) * d13) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d12) * d13) / 100.0d, 0.42d);
        double d14 = ((((double) (d10 < 0.0d ? -1 : d10 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
        double d15 = ((((double) (d11 < 0.0d ? -1 : d11 == 0.0d ? 0 : 1)) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double d16 = ((((double) (d12 >= r7 ? d12 == r7 ? 0 : 1 : -1)) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d17 = ((((-12.0d) * d15) + (d14 * 11.0d)) + d16) / 11.0d;
        double d18 = ((d14 + d15) - (d16 * 2.0d)) / 9.0d;
        double d19 = d15 * 20.0d;
        double d20 = ((21.0d * d16) + ((d14 * 20.0d) + d19)) / 20.0d;
        double d21 = (((d14 * 40.0d) + d19) + d16) / 20.0d;
        double dAtan2 = (Math.atan2(d18, d17) * 57.29577951308232d) % 360.0d;
        dAtan2 = dAtan2 < 0 ? dAtan2 + 360.0d : dAtan2;
        double d22 = dAtan2 * 0.017453292519943295d;
        double dPow4 = (Math.pow((d21 * c10472l.crashlytics) / d6, c10472l.isPro * d5) * 100.0d) / 100.0d;
        Math.sqrt(dPow4);
        double d23 = d6 + 4.0d;
        double dPow5 = Math.pow((Math.hypot(d17, d18) * (((((Math.cos(((dAtan2 < 20.14d ? dAtan2 + 360.0d : dAtan2) * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * c10472l.billing) * c10472l.amazon)) / (d20 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, c10472l.yandex), 0.73d);
        double dSqrt = Math.sqrt(dPow4) * dPow5;
        Math.sqrt((dPow5 * d5) / d23);
        Math.log1p(dSqrt * d4 * 0.0228d);
        Math.cos(d22);
        Math.sin(d22);
        this.loadAd = dAtan2;
        this.crashlytics = dSqrt;
        this.amazon = (AbstractC2533l.amazon(AbstractC9151l.isPro(new double[]{AbstractC2533l.purchase((i >> 16) & 255), AbstractC2533l.purchase((i >> 8) & 255), AbstractC2533l.purchase(i2)}, AbstractC2533l.yandex)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14997l) && this.yandex == ((C14997l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final boolean loadAd() {
        double d = this.loadAd;
        return d >= 105.0d && d < 125.0d;
    }

    public final String toString() {
        return AbstractC15560l.tapsense("Hct(argb=", this.yandex, ")");
    }

    public final boolean yandex() {
        double d = this.loadAd;
        return d >= 170.0d && d < 207.0d;
    }
}
