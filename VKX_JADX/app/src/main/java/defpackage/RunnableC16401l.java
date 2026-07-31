package defpackage;

/* JADX INFO: renamed from: lٖٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC16401l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11885l f32099l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13281l f32100l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32101l;

    public /* synthetic */ RunnableC16401l(C13281l c13281l, InterfaceC11885l interfaceC11885l, int i) {
        this.f32101l = i;
        this.f32100l = c13281l;
        this.f32099l = interfaceC11885l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f32101l;
        InterfaceC11885l interfaceC11885l = this.f32099l;
        C13281l c13281l = this.f32100l;
        switch (i) {
            case 0:
                interfaceC11885l.mo2164throw(c13281l.yandex, c13281l.loadAd);
                break;
            default:
                interfaceC11885l.isVip(c13281l.yandex, c13281l.loadAd);
                break;
        }
    }
}
