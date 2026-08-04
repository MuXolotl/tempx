package defpackage;

/* JADX INFO: renamed from: lؓۙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2084l implements InterfaceC2077l {
    public final /* synthetic */ C0205l amazon;
    public final /* synthetic */ boolean crashlytics;
    public long yandex = 9205357640488583168L;
    public long loadAd = 0;

    public C2084l(boolean z, C0205l c0205l) {
        this.crashlytics = z;
        this.amazon = c0205l;
    }

    @Override // defpackage.InterfaceC2077l
    public final void amazon() {
        C3242l c3242lSubs;
        InterfaceC18212l interfaceC18212lCrashlytics;
        boolean z = this.crashlytics;
        C0205l c0205l = this.amazon;
        if ((z ? (C1187l) c0205l.f1174l.getValue() : (C1187l) c0205l.f1167l.getValue()) == null || (c3242lSubs = c0205l.subs()) == null) {
            return;
        }
        C18329l c18329lBilling = c0205l.billing(z ? c3242lSubs.yandex : c3242lSubs.loadAd);
        if (c18329lBilling == null || (interfaceC18212lCrashlytics = c18329lBilling.crashlytics()) == null) {
            return;
        }
        long jYandex = c18329lBilling.yandex(c3242lSubs, z);
        if ((9223372034707292159L & jYandex) == 9205357640488583168L) {
            return;
        }
        c0205l.f1165l.setValue(new C1187l(c0205l.remoteconfig().mo2593throws(interfaceC18212lCrashlytics, AbstractC1848l.yandex(jYandex))));
        c0205l.f1161l.setValue(z ? EnumC1826l.f4234l : EnumC1826l.f4233l);
        c0205l.startapp(false);
    }

    @Override // defpackage.InterfaceC2077l
    public final void crashlytics() {
        C0205l c0205l = this.amazon;
        c0205l.startapp(true);
        c0205l.f1161l.setValue(null);
        c0205l.f1165l.setValue(null);
    }

    @Override // defpackage.InterfaceC2077l
    public final void loadAd() {
        C0205l c0205l = this.amazon;
        c0205l.startapp(true);
        c0205l.f1161l.setValue(null);
        c0205l.f1165l.setValue(null);
    }

    @Override // defpackage.InterfaceC2077l
    public final void onCancel() {
        C0205l c0205l = this.amazon;
        c0205l.startapp(true);
        c0205l.f1161l.setValue(null);
        c0205l.f1165l.setValue(null);
    }

    @Override // defpackage.InterfaceC2077l
    public final void purchase(long j) {
        C0205l c0205l = this.amazon;
        if (c0205l.admob() == null) {
            return;
        }
        long jSubs = C1187l.subs(this.loadAd, j);
        this.loadAd = jSubs;
        long jSubs2 = C1187l.subs(this.yandex, jSubs);
        if (c0205l.subscription(jSubs2, this.yandex, this.crashlytics, C1461l.f3660l)) {
            this.yandex = jSubs2;
            this.loadAd = 0L;
        }
    }

    @Override // defpackage.InterfaceC2077l
    public final void yandex(long j, C11379l c11379l) {
        C0205l c0205l = this.amazon;
        if (c0205l.admob() == null) {
            return;
        }
        C3242l c3242lSubs = c0205l.subs();
        boolean z = this.crashlytics;
        Object objPurchase = c0205l.f1163l.crashlytics.purchase((z ? c3242lSubs.yandex : c3242lSubs.loadAd).crashlytics);
        if (objPurchase == null) {
            AbstractC14825l.amazon("SelectionRegistrar should contain the current selection's selectableIds");
            C17132l.firebase();
            return;
        }
        C18329l c18329l = (C18329l) objPurchase;
        InterfaceC18212l interfaceC18212lCrashlytics = c18329l.crashlytics();
        if (interfaceC18212lCrashlytics == null) {
            AbstractC14825l.amazon("Current selectable should have layout coordinates.");
            C17132l.firebase();
            return;
        }
        long jYandex = c18329l.yandex(c3242lSubs, z);
        if ((9223372034707292159L & jYandex) == 9205357640488583168L) {
            return;
        }
        this.yandex = c0205l.remoteconfig().mo2593throws(interfaceC18212lCrashlytics, AbstractC1848l.yandex(jYandex));
        this.loadAd = 0L;
    }
}
