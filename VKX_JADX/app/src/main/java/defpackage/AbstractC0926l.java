package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: lًٌؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0926l {
    public static final LinearInterpolator yandex = new LinearInterpolator();
    public static final InterpolatorC3577l loadAd = new InterpolatorC3577l(1);
    public static final InterpolatorC3577l crashlytics = new InterpolatorC3577l(0);
    public static final InterpolatorC3577l amazon = new InterpolatorC3577l(InterpolatorC3577l.purchase);
    public static final DecelerateInterpolator purchase = new DecelerateInterpolator();

    public static int crashlytics(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float loadAd(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : yandex(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static float yandex(float f, float f2, float f3) {
        return AbstractC4338l.Signature(f2, f, f3, f);
    }
}
