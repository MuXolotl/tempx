package defpackage;

/* JADX INFO: renamed from: lٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14174l {
    public final long yandex;

    public /* synthetic */ C14174l(long j) {
        this.yandex = j;
    }

    public static final long admob(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final float amazon(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float billing(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float crashlytics(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean loadAd(long j, long j2) {
        return j == j2;
    }

    public static final boolean mopub(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final float purchase(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static String subs(long j) {
        return j != 9205357640488583168L ? AbstractC14814l.ads("Size(", AbstractC4447l.crashlytics(Float.intBitsToFloat((int) (j >> 32))), ", ", AbstractC4447l.crashlytics(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Size.Unspecified";
    }

    public static long yandex(float f, long j) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14174l) {
            return this.yandex == ((C14174l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return subs(this.yandex);
    }
}
