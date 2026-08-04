package defpackage;

/* JADX INFO: renamed from: lۢۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18651l implements InterfaceC4497l, InterfaceC12650l, InterfaceC7697l {
    public final C16089l loadAd;
    public final C0852l yandex;

    public C18651l(C0852l c0852l, C16089l c16089l) {
        this.yandex = c0852l;
        this.loadAd = c16089l;
    }

    @Override // defpackage.InterfaceC4497l
    public final Integer admob() {
        return this.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC12650l
    public final Integer amazon() {
        return this.loadAd.amazon;
    }

    @Override // defpackage.InterfaceC11068l
    public final Integer billing() {
        return this.yandex.yandex.yandex;
    }

    @Override // defpackage.InterfaceC11068l
    public final void crashlytics(Integer num) {
        this.yandex.yandex.loadAd = num;
    }

    @Override // defpackage.InterfaceC11068l
    public final Integer firebase() {
        return this.yandex.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC11068l
    public final void isPro(Integer num) {
        this.yandex.yandex.yandex = num;
    }

    @Override // defpackage.InterfaceC12650l
    public final void loadAd(C17707l c17707l) {
        this.loadAd.loadAd(c17707l);
    }

    @Override // defpackage.InterfaceC12650l
    public final void metrica(Integer num) {
        this.loadAd.purchase = num;
    }

    @Override // defpackage.InterfaceC12650l
    public final C17707l mopub() {
        return this.loadAd.mopub();
    }

    @Override // defpackage.InterfaceC12650l
    public final void purchase(Integer num) {
        this.loadAd.amazon = num;
    }

    @Override // defpackage.InterfaceC12650l
    public final Integer remoteconfig() {
        return this.loadAd.yandex;
    }

    @Override // defpackage.InterfaceC12650l
    public final void smaato(Integer num) {
        this.loadAd.yandex = num;
    }

    @Override // defpackage.InterfaceC4497l
    public final void subs(Integer num) {
        this.yandex.loadAd = num;
    }

    @Override // defpackage.InterfaceC12650l
    public final Integer vip() {
        return this.loadAd.purchase;
    }

    @Override // defpackage.InterfaceC7697l
    public final Object yandex() {
        C0852l c0852l = this.yandex;
        C1822l c1822l = c0852l.yandex;
        C0852l c0852l2 = new C0852l(new C1822l(c1822l.yandex, c1822l.loadAd), c0852l.loadAd, c0852l.crashlytics, c0852l.amazon);
        C16089l c16089l = this.loadAd;
        return new C18651l(c0852l2, new C16089l(c16089l.yandex, c16089l.loadAd, c16089l.crashlytics, c16089l.amazon, c16089l.purchase, c16089l.billing));
    }
}
