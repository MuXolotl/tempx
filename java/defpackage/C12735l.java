package defpackage;

/* JADX INFO: renamed from: lّٝٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12735l {
    public final long yandex;

    public static String loadAd(long j) {
        if (yandex(j, 0L)) {
            return "Unspecified";
        }
        if (yandex(j, 4294967296L)) {
            return "Sp";
        }
        return yandex(j, 8589934592L) ? "Em" : "Invalid";
    }

    public static final boolean yandex(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12735l) {
            return this.yandex == ((C12735l) obj).yandex;
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
