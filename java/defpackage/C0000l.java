package defpackage;

/* JADX INFO: renamed from: lؑؐؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0000l implements InterfaceC2077l {
    public final /* synthetic */ C16173l yandex;

    public C0000l(C16173l c16173l) {
        this.yandex = c16173l;
    }

    @Override // defpackage.InterfaceC2077l
    public final void crashlytics() {
        C16173l c16173l = this.yandex;
        c16173l.adcel.setValue(null);
        c16173l.ads.setValue(null);
    }

    @Override // defpackage.InterfaceC2077l
    public final void loadAd() {
        C16173l c16173l = this.yandex;
        c16173l.adcel.setValue(null);
        c16173l.ads.setValue(null);
    }

    @Override // defpackage.InterfaceC2077l
    public final void purchase(long j) {
        C11224l c11224lAmazon;
        InterfaceC1234l interfaceC1234l;
        C16173l c16173l = this.yandex;
        c16173l.startapp = C1187l.subs(c16173l.startapp, j);
        C17812l c17812l = c16173l.amazon;
        if (c17812l == null || (c11224lAmazon = c17812l.amazon()) == null) {
            return;
        }
        c16173l.ads.setValue(new C1187l(C1187l.subs(c16173l.vip, c16173l.startapp)));
        int iAmazon = c16173l.loadAd.amazon(c11224lAmazon.loadAd(c16173l.subs().yandex, true));
        long jLoadAd = AbstractC2296l.loadAd(iAmazon, iAmazon);
        if (C12814l.crashlytics(jLoadAd, c16173l.vip().loadAd)) {
            return;
        }
        C17812l c17812l2 = c16173l.amazon;
        if ((c17812l2 == null || ((Boolean) c17812l2.adcel.getValue()).booleanValue()) && (interfaceC1234l = c16173l.isPro) != null) {
            ((C9421l) interfaceC1234l).yandex(9);
        }
        c16173l.crashlytics.invoke(C16173l.purchase(c16173l.vip().yandex, jLoadAd));
        c16173l.license = new C12814l(jLoadAd);
    }

    @Override // defpackage.InterfaceC2077l
    public final void yandex(long j, C11379l c11379l) {
        C11224l c11224lAmazon;
        C16173l c16173l = this.yandex;
        long jYandex = AbstractC1848l.yandex(c16173l.smaato(true));
        C17812l c17812l = c16173l.amazon;
        if (c17812l == null || (c11224lAmazon = c17812l.amazon()) == null) {
            return;
        }
        long jPurchase = c11224lAmazon.purchase(jYandex);
        c16173l.vip = jPurchase;
        c16173l.ads.setValue(new C1187l(jPurchase));
        c16173l.startapp = 0L;
        c16173l.adcel.setValue(EnumC1826l.f4235l);
        c16173l.tapsense(false);
    }

    @Override // defpackage.InterfaceC2077l
    public final void amazon() {
    }

    @Override // defpackage.InterfaceC2077l
    public final void onCancel() {
    }
}
