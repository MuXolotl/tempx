package defpackage;

/* JADX INFO: renamed from: lٔۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15248l {
    public static final float amazon;
    public static final float crashlytics;
    public static final float loadAd;
    public final float yandex;

    static {
        yandex(0.0f);
        yandex(0.5f);
        loadAd = 0.5f;
        yandex(-1.0f);
        crashlytics = -1.0f;
        yandex(1.0f);
        amazon = 1.0f;
    }

    public static String loadAd(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == loadAd) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == crashlytics) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        return f == amazon ? "LineHeightStyle.Alignment.Bottom" : AbstractC4582l.loadAd("LineHeightStyle.Alignment(topPercentage = ", f, ")");
    }

    public static void yandex(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            AbstractC1786l.loadAd("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15248l) {
            return Float.compare(this.yandex, ((C15248l) obj).yandex) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    public final String toString() {
        return loadAd(this.yandex);
    }
}
