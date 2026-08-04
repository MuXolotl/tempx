package defpackage;

/* JADX INFO: renamed from: lٖؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4911l implements InterfaceC2077l {
    public final /* synthetic */ C6205l billing;
    public final /* synthetic */ C11611l mopub;
    public final /* synthetic */ C6205l purchase;
    public long yandex = 9205357640488583168L;
    public long loadAd = 9205357640488583168L;
    public long crashlytics = 0;
    public C11379l amazon = C1461l.f3667l;

    public C4911l(C6205l c6205l, C6205l c6205l2, C11611l c11611l) {
        this.purchase = c6205l;
        this.billing = c6205l2;
        this.mopub = c11611l;
    }

    @Override // defpackage.InterfaceC2077l
    public final void loadAd() {
        long jLongValue = ((Number) this.purchase.invoke()).longValue();
        C11611l c11611l = this.mopub;
        if (AbstractC8548l.yandex(c11611l, jLongValue)) {
            c11611l.crashlytics();
        }
        this.yandex = 9205357640488583168L;
        this.loadAd = 9205357640488583168L;
    }

    @Override // defpackage.InterfaceC2077l
    public final void onCancel() {
        long jLongValue = ((Number) this.purchase.invoke()).longValue();
        C11611l c11611l = this.mopub;
        if (AbstractC8548l.yandex(c11611l, jLongValue)) {
            c11611l.crashlytics();
        }
        this.yandex = 9205357640488583168L;
        this.loadAd = 9205357640488583168L;
    }

    @Override // defpackage.InterfaceC2077l
    public final void purchase(long j) {
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.billing.invoke();
        if (interfaceC18212l == null || !interfaceC18212l.mopub()) {
            return;
        }
        long jLongValue = ((Number) this.purchase.invoke()).longValue();
        C11611l c11611l = this.mopub;
        if (AbstractC8548l.yandex(c11611l, jLongValue)) {
            this.crashlytics = C1187l.subs(this.crashlytics, j);
            long jAdmob = C1187l.admob(C1187l.subs(this.yandex, this.crashlytics), C1187l.admob(interfaceC18212l.mo2591strictfp(0L), this.loadAd));
            if (c11611l.loadAd(interfaceC18212l, jAdmob, this.yandex, this.amazon, true)) {
                this.yandex = jAdmob;
                this.loadAd = interfaceC18212l.mo2591strictfp(0L);
                this.crashlytics = 0L;
            }
        }
    }

    @Override // defpackage.InterfaceC2077l
    public final void yandex(long j, C11379l c11379l) {
        this.amazon = c11379l;
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.billing.invoke();
        C11611l c11611l = this.mopub;
        if (interfaceC18212l != null) {
            if (!interfaceC18212l.mopub()) {
                return;
            }
            c11611l.amazon(interfaceC18212l, j, this.amazon, true);
            this.yandex = j;
            this.loadAd = interfaceC18212l.mo2591strictfp(0L);
        }
        if (AbstractC8548l.yandex(c11611l, ((Number) this.purchase.invoke()).longValue())) {
            this.crashlytics = 0L;
        }
    }

    @Override // defpackage.InterfaceC2077l
    public final void amazon() {
    }

    @Override // defpackage.InterfaceC2077l
    public final void crashlytics() {
    }
}
