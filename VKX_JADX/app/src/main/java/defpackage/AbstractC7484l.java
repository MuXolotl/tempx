package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: lؚۘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7484l {
    public static final PointF yandex = new PointF();

    public static int amazon(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static int crashlytics(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static float loadAd(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static float purchase(float f, float f2, float f3) {
        return AbstractC4338l.Signature(f2, f, f3, f);
    }

    public static PointF yandex(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
}
