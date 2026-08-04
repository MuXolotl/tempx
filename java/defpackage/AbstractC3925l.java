package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِؖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3925l {
    public static final C15578l yandex = new C15578l(-748275801, false, new C8337l(7));
    public static final C15578l loadAd = new C15578l(-1512895480, false, new C8337l(8));

    public static C6286l crashlytics(String str, C7972l c7972l, C8046l c8046l, int i) {
        if ((i & 2) != 0) {
            c7972l = null;
        }
        int i2 = 4;
        Function1 c4741l = c8046l;
        if ((i & 4) != 0) {
            c4741l = new C4741l(i2);
        }
        C16552l c16552l = AbstractC11463l.yandex;
        return new C6286l(str, c7972l, c4741l, AbstractC11990l.yandex(AbstractC10586l.billing(ExecutorC6708l.f14063l, AbstractC1295l.crashlytics())));
    }

    public static boolean loadAd(byte b) {
        return b > -65;
    }

    public static C14115l yandex(int i, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        C0777l c0777l = C3955l.purchase;
        Bitmap.Config configM1882const = AbstractC5941l.m1882const(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = AbstractC5941l.isPro(i, i2, i3, c0777l);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM1882const);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C14115l(bitmapCreateBitmap);
    }
}
