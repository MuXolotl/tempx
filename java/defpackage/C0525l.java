package defpackage;

/* JADX INFO: renamed from: lؑۗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0525l implements InterfaceC2077l {
    public final /* synthetic */ boolean loadAd;
    public final /* synthetic */ C16173l yandex;

    public C0525l(C16173l c16173l, boolean z) {
        this.yandex = c16173l;
        this.loadAd = z;
    }

    @Override // defpackage.InterfaceC2077l
    public final void amazon() {
        C11224l c11224lAmazon;
        boolean z = this.loadAd;
        EnumC1826l enumC1826l = z ? EnumC1826l.f4234l : EnumC1826l.f4233l;
        C16173l c16173l = this.yandex;
        c16173l.adcel.setValue(enumC1826l);
        long jYandex = AbstractC1848l.yandex(c16173l.smaato(z));
        C17812l c17812l = c16173l.amazon;
        if (c17812l == null || (c11224lAmazon = c17812l.amazon()) == null) {
            return;
        }
        long jPurchase = c11224lAmazon.purchase(jYandex);
        c16173l.vip = jPurchase;
        c16173l.ads.setValue(new C1187l(jPurchase));
        c16173l.startapp = 0L;
        c16173l.subscription = -1;
        C17812l c17812l2 = c16173l.amazon;
        if (c17812l2 != null) {
            c17812l2.adcel.setValue(Boolean.TRUE);
        }
        c16173l.tapsense(false);
    }

    @Override // defpackage.InterfaceC2077l
    public final void crashlytics() {
        C16173l c16173l = this.yandex;
        c16173l.adcel.setValue(null);
        c16173l.ads.setValue(null);
        c16173l.tapsense(true);
    }

    @Override // defpackage.InterfaceC2077l
    public final void loadAd() {
        C16173l c16173l = this.yandex;
        c16173l.adcel.setValue(null);
        c16173l.ads.setValue(null);
        c16173l.tapsense(true);
    }

    @Override // defpackage.InterfaceC2077l
    public final void purchase(long j) {
        C16173l c16173l = this.yandex;
        long jSubs = C1187l.subs(c16173l.startapp, j);
        c16173l.startapp = jSubs;
        c16173l.ads.setValue(new C1187l(C1187l.subs(c16173l.vip, jSubs)));
        C16173l.crashlytics(c16173l, c16173l.vip(), c16173l.subs().yandex, false, this.loadAd, C1461l.f3660l, true, new C14797l(9));
        c16173l.tapsense(false);
    }

    @Override // defpackage.InterfaceC2077l
    public final void onCancel() {
    }

    @Override // defpackage.InterfaceC2077l
    public final void yandex(long j, C11379l c11379l) {
    }
}
