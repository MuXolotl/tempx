package defpackage;

import android.util.Rational;
import android.util.Size;

/* JADX INFO: renamed from: lُٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14608l {
    public static final Rational yandex = new Rational(4, 3);
    public static final Rational loadAd = new Rational(3, 4);
    public static final Rational crashlytics = new Rational(16, 9);
    public static final Rational amazon = new Rational(9, 16);

    public static boolean loadAd(int i, int i2, Rational rational) {
        AbstractC5641l.yandex(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    public static boolean yandex(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = AbstractC5513l.yandex;
        if (size.getHeight() * size.getWidth() >= AbstractC5513l.yandex(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (loadAd(Math.max(0, height - 16), width, rational) || loadAd(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i == 0) {
                    return loadAd(height, width, rational);
                }
                if (height % 16 == 0) {
                    return loadAd(width, height, rational2);
                }
            }
        }
        return false;
    }
}
