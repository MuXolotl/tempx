package defpackage;

/* JADX INFO: renamed from: lؘؗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4705l {
    public final long loadAd;
    public final long yandex;
    public long crashlytics = -9223372036854775807L;
    public long amazon = -9223372036854775807L;
    public long billing = -9223372036854775807L;
    public long mopub = -9223372036854775807L;
    public float isPro = 0.97f;
    public float subs = 1.03f;
    public float firebase = 1.0f;
    public long smaato = -9223372036854775807L;
    public long purchase = -9223372036854775807L;
    public long admob = -9223372036854775807L;
    public long remoteconfig = -9223372036854775807L;
    public long vip = -9223372036854775807L;

    public C4705l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final void yandex() {
        long j;
        long j2 = this.crashlytics;
        if (j2 != -9223372036854775807L) {
            j = this.amazon;
            if (j == -9223372036854775807L) {
                long j3 = this.billing;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.mopub;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.purchase == j) {
            return;
        }
        this.purchase = j;
        this.admob = j;
        this.remoteconfig = -9223372036854775807L;
        this.vip = -9223372036854775807L;
        this.smaato = -9223372036854775807L;
    }
}
