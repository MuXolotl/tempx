package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: renamed from: lٌؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3286l {
    public Rational yandex;

    public final C5071l yandex(float f, float f2, float f3) {
        PointF pointF;
        C14212l c14212l = (C14212l) this;
        float[] fArr = {f, f2};
        synchronized (c14212l) {
            try {
                Matrix matrix = c14212l.amazon;
                if (matrix == null) {
                    pointF = C14212l.purchase;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.yandex;
        C5071l c5071l = new C5071l();
        c5071l.yandex = f4;
        c5071l.loadAd = f5;
        c5071l.crashlytics = f3;
        c5071l.amazon = rational;
        return c5071l;
    }
}
