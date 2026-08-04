package defpackage;

/* JADX INFO: renamed from: lؚ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17654l {
    public static final C17654l amazon;
    public static final C17654l crashlytics;
    public final long loadAd;
    public final long yandex;

    static {
        C17654l c17654l = new C17654l(0L, 0L);
        new C17654l(Long.MAX_VALUE, Long.MAX_VALUE);
        crashlytics = new C17654l(Long.MAX_VALUE, 0L);
        new C17654l(0L, Long.MAX_VALUE);
        amazon = c17654l;
    }

    public C17654l(long j, long j2) {
        AbstractC12442l.admob(j >= 0);
        AbstractC12442l.admob(j2 >= 0);
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17654l.class == obj.getClass()) {
            C17654l c17654l = (C17654l) obj;
            if (this.yandex == c17654l.yandex && this.loadAd == c17654l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.yandex) * 31) + ((int) this.loadAd);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[RETURN] */
    public final long yandex(long j, long j2, long j3) {
        long j4 = this.yandex;
        long j5 = this.loadAd;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = AbstractC15323l.yandex;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long jYandex = AbstractC15323l.yandex(j, j5);
        boolean z = j7 <= j2 && j2 <= jYandex;
        boolean z2 = j7 <= j3 && j3 <= jYandex;
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j7;
        }
        return j2;
    }
}
