package defpackage;

/* JADX INFO: renamed from: lًؙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6709l {
    public long amazon;
    public long billing;
    public long crashlytics;
    public C6606l loadAd;
    public float[] mopub;
    public long purchase;
    public final C16977l yandex;

    public C6709l() {
        C16977l c16977l = AbstractC6903l.yandex;
        this.yandex = new C16977l();
        this.crashlytics = -1L;
        this.amazon = 0L;
        this.purchase = 0L;
    }

    public static long yandex(C6606l c6606l, long j, long j2, float[] fArr, long j3, long j4) {
        long j5 = c6606l.crashlytics;
        if (j5 > 0) {
            long j6 = c6606l.isPro;
            if (j6 > 0) {
                if (j3 - j6 < j5) {
                    return Math.min(j4, j6 + j5);
                }
                c6606l.subs = j3;
                c6606l.isPro = -1L;
                c6606l.yandex(c6606l.mopub, c6606l.admob, j, j2, fArr);
                return j4;
            }
        }
        return j4;
    }

    public final boolean crashlytics(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (C5177l.loadAd(j2, this.amazon)) {
            z = false;
        } else {
            this.amazon = j2;
            z = true;
        }
        if (!C5177l.loadAd(j, this.purchase)) {
            this.purchase = j;
            z = true;
        }
        if (fArr != null) {
            this.mopub = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.billing) {
            return z;
        }
        this.billing = j3;
        return true;
    }

    public final void loadAd(C6606l c6606l, long j, long j2, float[] fArr, long j3) {
        long j4 = c6606l.subs;
        long j5 = c6606l.crashlytics;
        boolean z = j3 - j4 > c6606l.loadAd || j4 == Long.MIN_VALUE;
        boolean z2 = j5 == 0;
        c6606l.isPro = j3;
        if (z && z2) {
            c6606l.subs = j3;
            c6606l.yandex(c6606l.mopub, c6606l.admob, j, j2, fArr);
        }
        if (z2) {
            return;
        }
        long j6 = this.crashlytics;
        long j7 = j3 + j5;
        if (j6 <= 0 || j7 >= j6) {
            return;
        }
        this.crashlytics = j6;
    }
}
