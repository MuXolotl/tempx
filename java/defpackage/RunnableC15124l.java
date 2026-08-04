package defpackage;

/* JADX INFO: renamed from: lٔۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC15124l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f29673l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2934l f29674l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29675l;

    public /* synthetic */ RunnableC15124l(C2934l c2934l, int i, int i2) {
        this.f29675l = i2;
        this.f29674l = c2934l;
        this.f29673l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC16531l abstractC16531lBilling;
        int i = this.f29675l;
        int i2 = this.f29673l;
        C2934l c2934l = this.f29674l;
        switch (i) {
            case 0:
                C12736l c12736l = ((C17646l) ((C0554l) c2934l.f6385l).f1956l).amazon;
                if (c12736l != null) {
                    C9961l.loadAd();
                    C17646l c17646lCrashlytics = C9961l.crashlytics();
                    int iMin = Math.min(c12736l.adcel, Math.max(0, i2));
                    AbstractC16531l abstractC16531lBilling2 = c17646lCrashlytics.billing(c12736l);
                    if (abstractC16531lBilling2 != null) {
                        abstractC16531lBilling2.billing(iMin);
                    }
                }
                break;
            default:
                C12736l c12736l2 = ((C17646l) ((C0554l) c2934l.f6385l).f1956l).amazon;
                if (c12736l2 != null) {
                    C9961l.loadAd();
                    if (i2 != 0 && (abstractC16531lBilling = C9961l.crashlytics().billing(c12736l2)) != null) {
                        abstractC16531lBilling.subs(i2);
                        break;
                    }
                }
                break;
        }
    }
}
