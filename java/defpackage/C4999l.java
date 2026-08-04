package defpackage;

/* JADX INFO: renamed from: lؗٛٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4999l {
    public final long yandex;

    public static String crashlytics(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static final boolean loadAd(long j, long j2) {
        return j == j2;
    }

    public static boolean yandex(long j, Object obj) {
        return (obj instanceof C4999l) && j == ((C4999l) obj).yandex;
    }

    public final boolean equals(Object obj) {
        return yandex(this.yandex, obj);
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return crashlytics(this.yandex);
    }
}
