package defpackage;

/* JADX INFO: renamed from: lْٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14124l {
    public long admob;
    public long amazon = 0;
    public long billing;
    public final long crashlytics;
    public final long loadAd;
    public long mopub;
    public long purchase;
    public final long yandex;

    public C14124l(long j, long j2, long j3, long j4, long j5, long j6) {
        this.yandex = j;
        this.loadAd = j2;
        this.purchase = j3;
        this.billing = j4;
        this.mopub = j5;
        this.crashlytics = j6;
        this.admob = yandex(j2, 0L, j3, j4, j5, j6);
    }

    public static long yandex(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return AbstractC15323l.firebase(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
