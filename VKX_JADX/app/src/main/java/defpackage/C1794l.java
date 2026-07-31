package defpackage;

/* JADX INFO: renamed from: lِؓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1794l {
    public final long yandex;
    public static final C12735l[] loadAd = {new C12735l(0), new C12735l(4294967296L), new C12735l(8589934592L)};
    public static final long crashlytics = AbstractC7039l.firebase(Float.NaN, 0);

    public static int amazon(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final float crashlytics(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long loadAd(long j) {
        return loadAd[(int) ((j & 1095216660480L) >>> 32)].yandex;
    }

    public static String purchase(long j) {
        long jLoadAd = loadAd(j);
        if (C12735l.yandex(jLoadAd, 0L)) {
            return "Unspecified";
        }
        if (C12735l.yandex(jLoadAd, 4294967296L)) {
            return crashlytics(j) + ".sp";
        }
        if (!C12735l.yandex(jLoadAd, 8589934592L)) {
            return "Invalid";
        }
        return crashlytics(j) + ".em";
    }

    public static final boolean yandex(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1794l) {
            return this.yandex == ((C1794l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return amazon(this.yandex);
    }

    public final String toString() {
        return purchase(this.yandex);
    }
}
