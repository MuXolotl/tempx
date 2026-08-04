package defpackage;

/* JADX INFO: renamed from: lِۘؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12060l implements InterfaceC1584l, InterfaceC12703l {
    public final boolean admob;
    public final long amazon;
    public final long billing;
    public final int crashlytics;
    public final int firebase;
    public final int isPro;
    public final long loadAd;
    public final boolean mopub;
    public final int purchase;
    public final long remoteconfig;
    public final boolean smaato;
    public final long subs;
    public final long yandex;

    public C12060l(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = i2 == -1 ? 1 : i2;
        this.purchase = i;
        this.mopub = z;
        this.admob = z2;
        if (j == -1) {
            this.amazon = -1L;
            this.billing = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.amazon = j3;
            this.billing = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.subs = j2;
        this.isPro = i;
        this.firebase = i2;
        this.smaato = z;
        this.remoteconfig = j == -1 ? -1L : j;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean amazon() {
        return this.admob;
    }

    @Override // defpackage.InterfaceC1584l
    public final int billing() {
        return this.isPro;
    }

    @Override // defpackage.InterfaceC1584l
    public final long crashlytics(long j) {
        return (Math.max(0L, j - this.loadAd) * 8000000) / ((long) this.purchase);
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return this.amazon != -1 || this.mopub;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        long j2 = this.amazon;
        long j3 = this.loadAd;
        if (j2 == -1 && !this.mopub) {
            C4304l c4304l = new C4304l(0L, j3);
            return new C15528l(c4304l, c4304l);
        }
        int i = this.purchase;
        long j4 = this.crashlytics;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        C4304l c4304l2 = new C4304l(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.yandex) {
                return new C15528l(c4304l2, new C4304l((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new C15528l(c4304l2, c4304l2);
    }

    @Override // defpackage.InterfaceC1584l
    public final long yandex() {
        return this.remoteconfig;
    }
}
