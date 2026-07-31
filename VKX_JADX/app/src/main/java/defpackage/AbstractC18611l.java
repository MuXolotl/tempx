package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* JADX INFO: renamed from: l۠ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18611l {
    public static final RectF yandex = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Size admob(int i, Size size) {
        AbstractC5641l.loadAd(i % 90 == 0, "Invalid rotation degrees: " + i);
        return crashlytics(isPro(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static boolean amazon(Size size, boolean z, Size size2) {
        float width;
        float width2;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    public static Size billing(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static boolean crashlytics(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Invalid rotation degrees: "));
        return false;
    }

    public static int isPro(int i) {
        return ((i % 360) + 360) % 360;
    }

    public static int loadAd(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return isPro((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static String mopub(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static boolean purchase(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        return ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > 0.0f;
    }

    public static RectF subs(Size size) {
        return new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
    }

    public static Matrix yandex(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = yandex;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }
}
