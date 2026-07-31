package defpackage;

/* JADX INFO: renamed from: lَۙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10544l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10544l yandex;

    static {
        C10544l c10544l = new C10544l();
        yandex = c10544l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthSetAuthCodeStatusResponseDto", c10544l, 5);
        c13637l.smaato("status", false);
        c13637l.smaato("expires_in", true);
        c13637l.smaato("polling_delay", true);
        c13637l.smaato("faq_url", true);
        c13637l.smaato("domain", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C1313l c1313l = C1313l.yandex;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c1313l, c1313l, c1313l, c0194l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C14578l c14578l = (C14578l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        int i = c14578l.yandex;
        String str = c14578l.purchase;
        String str2 = c14578l.amazon;
        int i2 = c14578l.crashlytics;
        int i3 = c14578l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        if (abstractC4072l.ads() || i3 != 0) {
            abstractC4072l.signatures(1, i3, interfaceC18035l);
        }
        if (abstractC4072l.ads() || i2 != 0) {
            abstractC4072l.signatures(2, i2, interfaceC18035l);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str2, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 3, str2);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 4, str);
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
        int iSubscription2 = 0;
        int iSubscription3 = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                i |= 2;
            } else if (iAdmob == 2) {
                iSubscription3 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 4);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C14578l(i, iSubscription, iSubscription2, iSubscription3, strRemoteconfig, strRemoteconfig2);
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
