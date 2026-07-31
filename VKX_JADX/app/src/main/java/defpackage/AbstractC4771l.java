package defpackage;

import java.math.RoundingMode;

/* JADX INFO: renamed from: lٌؗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4771l {
    public static final /* synthetic */ int yandex = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int crashlytics(double d) {
        boolean zLoadAd;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z = false;
        AbstractC12442l.subs(d > 0.0d && AbstractC5006l.billing(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return crashlytics(d * 4.503599627370496E15d) - 52;
        }
        switch (AbstractC11276l.yandex[roundingMode.ordinal()]) {
            case 1:
                AbstractC9464l.admob(loadAd(d));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !loadAd(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zLoadAd = loadAd(d);
                z &= !zLoadAd;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zLoadAd = loadAd(d);
                z &= !zLoadAd;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                C11586l.yandex();
                return 0;
        }
    }

    public static boolean loadAd(double d) {
        if (d > 0.0d && AbstractC5006l.billing(d)) {
            long jPurchase = AbstractC5006l.purchase(d);
            if ((jPurchase & (jPurchase - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean yandex(double d) {
        if (AbstractC5006l.billing(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC5006l.purchase(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
