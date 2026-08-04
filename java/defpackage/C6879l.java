package defpackage;

/* JADX INFO: renamed from: lؙۥۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6879l {
    public final long yandex;

    public static int loadAd(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final int yandex(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6879l) {
            return this.yandex == ((C6879l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return loadAd(this.yandex);
    }

    public final String toString() {
        return "DurationNs(value=" + this.yandex + ')';
    }
}
