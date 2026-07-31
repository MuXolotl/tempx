package defpackage;

/* JADX INFO: renamed from: lَؚٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10472l {
    public static final C10472l firebase;
    public final double admob;
    public final double amazon;
    public final double billing;
    public final double crashlytics;
    public final double isPro;
    public final double loadAd;
    public final double[] mopub;
    public final double purchase;
    public final double subs;
    public final double yandex;

    static {
        double dMax = Math.max(0.1d, 50.0d);
        double[][] dArr = AbstractC6873l.yandex;
        double[] dArr2 = AbstractC2533l.loadAd;
        double d = dArr2[0];
        double[] dArr3 = dArr[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr2[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr2[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dCrashlytics = AbstractC8576l.crashlytics((1.0d - (Math.exp(-0.5839747603136626d) * 0.2777777777777778d)) * 1.0d, 0.0d, 1.0d);
        double[] dArr6 = {(((100.0d / d6) * dCrashlytics) + 1.0d) - dCrashlytics, (((100.0d / d7) * dCrashlytics) + 1.0d) - dCrashlytics, (((100.0d / d8) * dCrashlytics) + 1.0d) - dCrashlytics};
        double dCbrt = (Math.cbrt(58.62838974428476d) * 0.09999998417959298d) + 9.275250255162799E-7d;
        double d9 = (dMax + 16.0d) / 116.0d;
        double d10 = d9 * d9 * d9;
        if (d10 <= 0.008856451679035631d) {
            d10 = ((116.0d * d9) - 16.0d) / 903.2962962962963d;
        }
        double d11 = (d10 * 100.0d) / dArr2[1];
        double dSqrt = Math.sqrt(d11) + 1.48d;
        double dPow = 0.725d / Math.pow(d11, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d6) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d8) / 100.0d, 0.42d)};
        double d12 = dArr7[0];
        double d13 = (d12 * 400.0d) / (d12 + 27.13d);
        double d14 = dArr7[1];
        double d15 = (d14 * 400.0d) / (d14 + 27.13d);
        double d16 = dArr7[2];
        double[] dArr8 = {d13, d15, (400.0d * d16) / (d16 + 27.13d)};
        firebase = new C10472l(d11, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow, dPow, dPow, 0.69d, 1.0d, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public C10472l(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.yandex = d;
        this.loadAd = d2;
        this.crashlytics = d3;
        this.amazon = d4;
        this.purchase = d5;
        this.billing = d6;
        this.mopub = dArr;
        this.admob = d7;
        this.subs = d8;
        this.isPro = d9;
    }
}
