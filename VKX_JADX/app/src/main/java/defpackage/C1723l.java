package defpackage;

/* JADX INFO: renamed from: lٌٟؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1723l {
    public static final /* synthetic */ int crashlytics = 0;
    public static final long loadAd = AbstractC5518l.yandex(0.5f, 0.5f);
    public final long yandex;

    public static String loadAd(long j) {
        return AbstractC2812l.subscription(j, "TransformOrigin(packedValue=", ")");
    }

    public static final boolean yandex(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1723l) {
            return this.yandex == ((C1723l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return loadAd(this.yandex);
    }
}
