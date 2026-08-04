package defpackage;

/* JADX INFO: renamed from: lٜؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1187l {
    public final long yandex;

    public /* synthetic */ C1187l(long j) {
        this.yandex = j;
    }

    public static final long admob(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final float amazon(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    public static final float billing(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float crashlytics(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static String firebase(long j) {
        return (9223372034707292159L & j) != 9205357640488583168L ? AbstractC14814l.ads("Offset(", AbstractC4447l.crashlytics(Float.intBitsToFloat((int) (j >> 32))), ", ", AbstractC4447l.crashlytics(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Offset.Unspecified";
    }

    public static final long isPro(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final boolean loadAd(long j, long j2) {
        return j == j2;
    }

    public static int mopub(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final float purchase(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final long subs(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static long yandex(float f, int i, long j) {
        float fIntBitsToFloat = (i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1187l) {
            return this.yandex == ((C1187l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return mopub(this.yandex);
    }

    public final String toString() {
        return firebase(this.yandex);
    }
}
