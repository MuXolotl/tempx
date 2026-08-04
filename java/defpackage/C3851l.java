package defpackage;

/* JADX INFO: renamed from: lُؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3851l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C3851l yandex;

    static {
        C3851l c3851l = new C3851l();
        yandex = c3851l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.ecosystem.EcosystemSendOtpResponseDto", c3851l, 4);
        c13637l.smaato("status", false);
        c13637l.smaato("sid", false);
        c13637l.smaato("code_length", false);
        c13637l.smaato("info", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C1313l c1313l = C1313l.yandex;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c1313l, c0194l, c1313l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C7906l c7906l = (C7906l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, c7906l.yandex, interfaceC18035l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c7906l.loadAd);
        abstractC4072l.signatures(2, c7906l.crashlytics, interfaceC18035l);
        abstractC4072l.appmetrica(interfaceC18035l, 3, c7906l.amazon);
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
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            } else if (iAdmob == 2) {
                iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 2);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C7906l(i, iSubscription, iSubscription2, strRemoteconfig, strRemoteconfig2);
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
