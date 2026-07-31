package defpackage;

/* JADX INFO: renamed from: lٕؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0343l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C0343l yandex;

    static {
        C0343l c0343l = new C0343l();
        yandex = c0343l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.orbitnetworking.proxy.VkConfigNetworkProxyProduct", c0343l, 3);
        c13637l.smaato("product", true);
        c13637l.smaato("version", true);
        c13637l.smaato("data", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C0194l.yandex, C1313l.yandex, C18303l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C13785l c13785l = (C13785l) obj;
        C4803l c4803l = c13785l.crashlytics;
        int i = c13785l.loadAd;
        String str = c13785l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 0, str);
        }
        if (interfaceC0039lCrashlytics.ads() || i != 1) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(1, i, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c4803l, new C4803l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 2, C18303l.yandex, c4803l);
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
        String strRemoteconfig = null;
        C4803l c4803l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                c4803l = (C4803l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, C18303l.yandex, c4803l);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C13785l(i, strRemoteconfig, iSubscription, c4803l);
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
