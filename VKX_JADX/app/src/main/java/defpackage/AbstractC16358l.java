package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16358l {
    public static final C1025l yandex = new C1025l(false);

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public static String amazon() {
        C2462l c2462l;
        if (Build.VERSION.SDK_INT >= 33) {
            Object objCrashlytics = AbstractC10242l.crashlytics();
            if (objCrashlytics != null) {
                c2462l = new C2462l(new C15621l(AbstractC3962l.yandex(objCrashlytics)));
            } else {
                c2462l = C2462l.loadAd;
            }
        } else {
            c2462l = AbstractC10242l.f20857l;
            if (c2462l == null) {
                c2462l = C2462l.loadAd;
            }
        }
        return c2462l.yandex.isEmpty() ? "" : (String) AbstractC16901l.m4231native(AbstractC12024l.m3338public((CharSequence) AbstractC16901l.m4231native(AbstractC12024l.m3338public(c2462l.yandex.yandex(), new String[]{","}, 6)), new String[]{"-"}, 6));
    }

    public static final double billing(double d, double d2) {
        return Math.copySign(Math.pow(Math.abs(d), d2), d);
    }

    public static final float crashlytics(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void loadAd(C5321l c5321l, C15730l c15730l) {
        C8043l c8043l = (C8043l) c5321l.f11449l;
        c8043l.getClass();
        C13507l c13507l = (C13507l) c8043l.f16741l;
        C13507l c13507l2 = (C13507l) c8043l.f16742l;
        boolean zAmazon = AbstractC3474l.amazon(c15730l);
        long j = c15730l.loadAd;
        if (zAmazon) {
            AbstractC8669l.m2414strictfp(c13507l2.amazon, null);
            c13507l2.purchase = 0;
            AbstractC8669l.m2414strictfp(c13507l.amazon, null);
            c13507l.purchase = 0;
            c8043l.f16743l = 0L;
        }
        if (!AbstractC3474l.billing(c15730l)) {
            List listLoadAd = c15730l.loadAd();
            int size = listLoadAd.size();
            for (int i = 0; i < size; i++) {
                C6624l c6624l = (C6624l) listLoadAd.get(i);
                c8043l.billing(c6624l.yandex, C1187l.subs(c6624l.purchase, 0L));
            }
            c8043l.billing(j, C1187l.subs(c15730l.vip, 0L));
        }
        if (AbstractC3474l.billing(c15730l) && j - c8043l.f16743l > 40) {
            AbstractC8669l.m2414strictfp(c13507l2.amazon, null);
            c13507l2.purchase = 0;
            AbstractC8669l.m2414strictfp(c13507l.amazon, null);
            c13507l.purchase = 0;
            c8043l.f16743l = 0L;
        }
        c8043l.f16743l = j;
    }

    public static final void purchase(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            AbstractC0081l.yandex("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            System.arraycopy(fArr4[i9], 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float fCrashlytics = crashlytics(fArr7, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr8[i11] * fCrashlytics);
                }
            }
            float fSqrt = (float) Math.sqrt(crashlytics(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? 0.0f : crashlytics(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fCrashlytics2 = crashlytics(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fCrashlytics2 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fCrashlytics2 / fArr10[i14];
        }
    }

    public static final void yandex(C1812l c1812l, Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(1149221023);
        int i2 = (c6956l.admob(c1812l) ? 4 : 2) | i | (c6956l.admob(function1) ? 32 : 16);
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3383l.yandex(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.amazon, null, null, null, AbstractC14566l.amazon(-2027638895, new C3091l(c1812l, function1, i3), c6956l), c6956l, 196614, 28);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(c1812l, function1, i, 5);
        }
    }
}
