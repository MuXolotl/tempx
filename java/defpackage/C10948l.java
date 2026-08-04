package defpackage;

import java.math.RoundingMode;

/* JADX INFO: renamed from: lَُؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10948l implements InterfaceC12703l {
    public final long amazon;
    public final long crashlytics;
    public final int loadAd;
    public final long purchase;
    public final C7200l yandex;

    public C10948l(C7200l c7200l, int i, long j, long j2) {
        this.yandex = c7200l;
        this.loadAd = i;
        this.crashlytics = j;
        long j3 = (j2 - j) / ((long) c7200l.crashlytics);
        this.amazon = j3;
        this.purchase = admob(j3);
    }

    public final long admob(long j) {
        long j2 = j * ((long) this.loadAd);
        long j3 = this.yandex.loadAd;
        String str = AbstractC15323l.yandex;
        return AbstractC15323l.m3970import(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        C7200l c7200l = this.yandex;
        long j2 = (((long) c7200l.loadAd) * j) / (((long) this.loadAd) * 1000000);
        long j3 = this.amazon - 1;
        long jFirebase = AbstractC15323l.firebase(j2, 0L, j3);
        int i = c7200l.crashlytics;
        long j4 = this.crashlytics;
        long jAdmob = admob(jFirebase);
        C4304l c4304l = new C4304l(jAdmob, (((long) i) * jFirebase) + j4);
        if (jAdmob >= j || jFirebase == j3) {
            return new C15528l(c4304l, c4304l);
        }
        long j5 = jFirebase + 1;
        return new C15528l(c4304l, new C4304l(admob(j5), (((long) i) * j5) + j4));
    }
}
