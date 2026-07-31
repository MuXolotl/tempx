package defpackage;

/* JADX INFO: renamed from: lَؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10073l implements InterfaceC2077l {
    public final /* synthetic */ C16173l amazon;
    public C12814l loadAd;
    public boolean yandex = true;
    public C11379l crashlytics = C1461l.f3667l;

    public C10073l(C16173l c16173l) {
        this.amazon = c16173l;
    }

    public final void billing() {
        C16173l c16173l = this.amazon;
        c16173l.adcel.setValue(null);
        c16173l.ads.setValue(null);
        this.crashlytics = C1461l.f3667l;
        c16173l.tapsense(true);
        C12814l c12814l = this.loadAd;
        boolean zAmazon = C12814l.amazon(c12814l != null ? c12814l.yandex : c16173l.vip().loadAd);
        c16173l.adcel(zAmazon ? EnumC7170l.f15002l : EnumC7170l.f15003l);
        C17812l c17812l = c16173l.amazon;
        if (c17812l != null) {
            c17812l.remoteconfig.setValue(Boolean.valueOf(!zAmazon && AbstractC9033l.mopub(c16173l, true)));
        }
        C17812l c17812l2 = c16173l.amazon;
        if (c17812l2 != null) {
            c17812l2.vip.setValue(Boolean.valueOf(!zAmazon && AbstractC9033l.mopub(c16173l, false)));
        }
        C17812l c17812l3 = c16173l.amazon;
        if (c17812l3 != null) {
            c17812l3.metrica.setValue(Boolean.valueOf(zAmazon && AbstractC9033l.mopub(c16173l, true)));
        }
        if (this.yandex) {
            C16173l.loadAd(c16173l, c16173l.metrica);
        }
        c16173l.metrica = null;
    }

    @Override // defpackage.InterfaceC2077l
    public final void loadAd() {
        billing();
    }

    @Override // defpackage.InterfaceC2077l
    public final void onCancel() {
        billing();
    }

    @Override // defpackage.InterfaceC2077l
    public final void purchase(long j) {
        C11224l c11224lAmazon;
        long jCrashlytics;
        C16173l c16173l = this.amazon;
        if (!c16173l.firebase() || c16173l.vip().yandex.f7563l.length() == 0) {
            return;
        }
        c16173l.startapp = C1187l.subs(c16173l.startapp, j);
        C17812l c17812l = c16173l.amazon;
        if (c17812l != null && (c11224lAmazon = c17812l.amazon()) != null) {
            c16173l.ads.setValue(new C1187l(C1187l.subs(c16173l.vip, c16173l.startapp)));
            if (c16173l.metrica != null || c11224lAmazon.crashlytics(c16173l.subs().yandex)) {
                C12814l c12814l = c16173l.metrica;
                int iLoadAd = c12814l != null ? (int) (c12814l.yandex >> 32) : c11224lAmazon.loadAd(c16173l.vip, false);
                int iLoadAd2 = c11224lAmazon.loadAd(c16173l.subs().yandex, false);
                if (c16173l.metrica == null && iLoadAd == iLoadAd2) {
                    return;
                } else {
                    jCrashlytics = C16173l.crashlytics(c16173l, c16173l.vip(), c16173l.subs().yandex, false, false, this.crashlytics, true, new C14797l(9));
                }
            } else {
                jCrashlytics = C16173l.crashlytics(c16173l, c16173l.vip(), c16173l.subs().yandex, false, false, c16173l.loadAd.amazon(c11224lAmazon.loadAd(c16173l.vip, true)) == c16173l.loadAd.amazon(c11224lAmazon.loadAd(c16173l.subs().yandex, true)) ? C1461l.f3667l : C1461l.f3646l, true, new C14797l(9));
            }
            this.loadAd = new C12814l(jCrashlytics);
            if (!C12814l.loadAd(jCrashlytics, c16173l.metrica)) {
                this.yandex = false;
            }
        }
        c16173l.tapsense(false);
    }

    @Override // defpackage.InterfaceC2077l
    public final void yandex(long j, C11379l c11379l) {
        long j2;
        C11224l c11224lAmazon;
        C11224l c11224lAmazon2;
        C16173l c16173l = this.amazon;
        C10086l c10086l = c16173l.adcel;
        if (c16173l.firebase() && ((EnumC1826l) c10086l.getValue()) == null) {
            c10086l.setValue(EnumC1826l.f4233l);
            c16173l.subscription = -1;
            this.yandex = true;
            this.crashlytics = c11379l;
            c16173l.metrica();
            C17812l c17812l = c16173l.amazon;
            if (c17812l == null || (c11224lAmazon2 = c17812l.amazon()) == null || !c11224lAmazon2.crashlytics(j)) {
                j2 = j;
                C17812l c17812l2 = c16173l.amazon;
                if (c17812l2 != null && (c11224lAmazon = c17812l2.amazon()) != null) {
                    int iAmazon = c16173l.loadAd.amazon(c11224lAmazon.loadAd(j2, true));
                    C0639l c0639lPurchase = C16173l.purchase(c16173l.vip().yandex, AbstractC2296l.loadAd(iAmazon, iAmazon));
                    c16173l.admob(false);
                    InterfaceC1234l interfaceC1234l = c16173l.isPro;
                    if (interfaceC1234l != null) {
                        ((C9421l) interfaceC1234l).yandex(0);
                    }
                    c16173l.crashlytics.invoke(c0639lPurchase);
                    c16173l.license = new C12814l(c0639lPurchase.loadAd);
                }
                this.yandex = false;
            } else {
                if (c16173l.vip().yandex.f7563l.length() == 0) {
                    return;
                }
                c16173l.admob(false);
                long jCrashlytics = C16173l.crashlytics(c16173l, C0639l.yandex(c16173l.vip(), null, C12814l.loadAd, 5), j, true, false, this.crashlytics, true, new C14797l(0));
                j2 = j;
                c16173l.metrica = new C12814l(jCrashlytics);
                this.loadAd = new C12814l(jCrashlytics);
            }
            c16173l.adcel(EnumC7170l.f15004l);
            c16173l.vip = j2;
            c16173l.ads.setValue(new C1187l(j2));
            c16173l.startapp = 0L;
        }
    }

    @Override // defpackage.InterfaceC2077l
    public final void amazon() {
    }

    @Override // defpackage.InterfaceC2077l
    public final void crashlytics() {
    }
}
