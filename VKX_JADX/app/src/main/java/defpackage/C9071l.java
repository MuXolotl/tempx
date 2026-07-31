package defpackage;

/* JADX INFO: renamed from: lٌ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9071l implements InterfaceC12703l {
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long purchase;
    public final InterfaceC12101l yandex;

    public C9071l(InterfaceC12101l interfaceC12101l, long j, long j2, long j3, long j4, long j5) {
        this.yandex = interfaceC12101l;
        this.loadAd = j;
        this.crashlytics = j2;
        this.amazon = j3;
        this.purchase = j4;
        this.billing = j5;
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
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        C4304l c4304l = new C4304l(j, C14124l.yandex(this.yandex.applovin(j), 0L, this.crashlytics, this.amazon, this.purchase, this.billing));
        return new C15528l(c4304l, c4304l);
    }
}
