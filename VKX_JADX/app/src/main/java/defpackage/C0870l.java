package defpackage;

/* JADX INFO: renamed from: lؘٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0870l implements InterfaceC1584l {
    public final int amazon;
    public final long billing;
    public final long crashlytics;
    public final int loadAd;
    public final long[] mopub;
    public final long purchase;
    public final long yandex;

    public C0870l(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.yandex = j;
        this.loadAd = i;
        this.crashlytics = j2;
        this.amazon = i2;
        this.purchase = j3;
        this.mopub = jArr;
        this.billing = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC1584l
    public final int billing() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC1584l
    public final long crashlytics(long j) {
        long j2 = j - this.yandex;
        if (!loadAd() || j2 <= this.loadAd) {
            return 0L;
        }
        long[] jArr = this.mopub;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.purchase;
        int iBilling = AbstractC15323l.billing(jArr, (long) d, true);
        long j3 = this.crashlytics;
        long j4 = (((long) iBilling) * j3) / 100;
        long j5 = jArr[iBilling];
        int i = iBilling + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iBilling == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return this.mopub != null;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        double d;
        double d2;
        boolean zLoadAd = loadAd();
        int i = this.loadAd;
        long j2 = this.yandex;
        if (!zLoadAd) {
            C4304l c4304l = new C4304l(0L, j2 + ((long) i));
            return new C15528l(c4304l, c4304l);
        }
        long jFirebase = AbstractC15323l.firebase(j, 0L, this.crashlytics);
        double d3 = (jFirebase * 100.0d) / this.crashlytics;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.mopub;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.purchase;
        C4304l c4304l2 = new C4304l(jFirebase, j2 + AbstractC15323l.firebase(Math.round((d4 / d) * j3), i, j3 - 1));
        return new C15528l(c4304l2, c4304l2);
    }

    @Override // defpackage.InterfaceC1584l
    public final long yandex() {
        return this.billing;
    }
}
