package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: renamed from: lؖٚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4218l {
    public static final Matrix yandex = new Matrix();
    public static final C17548l loadAd = new C17548l(11);
    public static final C17548l crashlytics = new C17548l(12);
    public static final C17548l amazon = new C17548l(13);
    public static final C17548l purchase = new C17548l(14);
    public static final float billing = (float) (Math.sqrt(2.0d) / 2.0d);

    public static Bitmap amazon(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static float crashlytics() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static void loadAd(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static void yandex(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) loadAd.get();
        Path path2 = (Path) crashlytics.get();
        Path path3 = (Path) amazon.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = AbstractC7484l.amazon(fMin, length);
                fMax = AbstractC7484l.amazon(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = AbstractC7484l.amazon(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = AbstractC7484l.amazon(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }
}
