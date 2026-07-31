package defpackage;

/* JADX INFO: renamed from: lؙٜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6595l implements InterfaceC1584l {
    public final long amazon;
    public final long crashlytics;
    public final long[] loadAd;
    public final int purchase;
    public final long[] yandex;

    public C6595l(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.yandex = jArr;
        this.loadAd = jArr2;
        this.crashlytics = j;
        this.amazon = j3;
        this.purchase = i;
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC1584l
    public final int billing() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC1584l
    public final long crashlytics(long j) {
        return this.yandex[AbstractC15323l.billing(this.loadAd, j, true)];
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        long[] jArr = this.yandex;
        int iBilling = AbstractC15323l.billing(jArr, j, true);
        long j2 = jArr[iBilling];
        long[] jArr2 = this.loadAd;
        C4304l c4304l = new C4304l(j2, jArr2[iBilling]);
        if (j2 >= j || iBilling == jArr.length - 1) {
            return new C15528l(c4304l, c4304l);
        }
        int i = iBilling + 1;
        return new C15528l(c4304l, new C4304l(jArr[i], jArr2[i]));
    }

    @Override // defpackage.InterfaceC1584l
    public final long yandex() {
        return this.amazon;
    }
}
