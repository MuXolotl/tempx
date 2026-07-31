package defpackage;

/* JADX INFO: renamed from: lٌّۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12481l {
    public static final long yandex = C9699l.yandex(0.0f, 0.0f);
    public static final float loadAd = 3.1415927f;

    public static long amazon(float f, float f2) {
        double d = f2;
        return AbstractC10433l.firebase(AbstractC10433l.remoteconfig(f, C9699l.yandex((float) Math.cos(d), (float) Math.sin(d))), yandex);
    }

    public static final float crashlytics(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }

    public static final float loadAd(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final long yandex(float f, float f2) {
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (fSqrt > 0.0f) {
            return C9699l.yandex(f / fSqrt, f2 / fSqrt);
        }
        C8339l.metrica("Required distance greater than zero");
        return 0L;
    }
}
