package defpackage;

/* JADX INFO: renamed from: lّۦؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12988l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C12988l yandex;

    static {
        C12988l c12988l = new C12988l();
        yandex = c12988l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthRefreshTokenDto", c12988l, 7);
        c13637l.smaato("index", false);
        c13637l.smaato("user_id", false);
        c13637l.smaato("banned", false);
        c13637l.smaato("access_token", true);
        c13637l.smaato("webview_access_token", true);
        c13637l.smaato("webview_refresh_token", true);
        c13637l.smaato("silent_token", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C1313l.yandex, C11363l.yandex, C2796l.yandex, AbstractC7303l.crashlytics(C13667l.yandex), AbstractC7303l.crashlytics(C8262l.yandex), AbstractC7303l.crashlytics(C11458l.yandex), AbstractC7303l.crashlytics(C9727l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C9617l c9617l = (C9617l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        int i = c9617l.yandex;
        C15793l c15793l = c9617l.mopub;
        C5892l c5892l = c9617l.billing;
        C7133l c7133l = c9617l.purchase;
        C17884l c17884l = c9617l.amazon;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 1, C11363l.yandex, new C10877l(c9617l.loadAd));
        abstractC4072l.ad(interfaceC18035l, 2, c9617l.crashlytics);
        if (abstractC4072l.ads() || c17884l != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C13667l.yandex, c17884l);
        }
        if (abstractC4072l.ads() || c7133l != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C8262l.yandex, c7133l);
        }
        if (abstractC4072l.ads() || c5892l != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C11458l.yandex, c5892l);
        }
        if (abstractC4072l.ads() || c15793l != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C9727l.yandex, c15793l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        boolean zIsVip = false;
        C10877l c10877l = null;
        C17884l c17884l = null;
        C7133l c7133l = null;
        C5892l c5892l = null;
        C15793l c15793l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    c10877l = (C10877l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, C11363l.yandex, c10877l);
                    i |= 2;
                    break;
                case 2:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    c17884l = (C17884l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C13667l.yandex, c17884l);
                    i |= 8;
                    break;
                case 4:
                    c7133l = (C7133l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C8262l.yandex, c7133l);
                    i |= 16;
                    break;
                case 5:
                    c5892l = (C5892l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C11458l.yandex, c5892l);
                    i |= 32;
                    break;
                case 6:
                    c15793l = (C15793l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C9727l.yandex, c15793l);
                    i |= 64;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C9617l(i, iSubscription, c10877l, zIsVip, c17884l, c7133l, c5892l, c15793l);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
