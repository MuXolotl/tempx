package defpackage;

/* JADX INFO: renamed from: lُؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10770l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10770l yandex;

    static {
        C10770l c10770l = new C10770l();
        yandex = c10770l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkx.theming.catalog.model.EngineAccent", c10770l, 3);
        c13637l.smaato("id", false);
        c13637l.smaato("name", false);
        c13637l.smaato("hex", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{C1313l.yandex, c0194l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C9894l c9894l = (C9894l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, c9894l.yandex, interfaceC18035l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c9894l.loadAd);
        abstractC4072l.appmetrica(interfaceC18035l, 2, c9894l.crashlytics);
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
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C9894l(i, iSubscription, strRemoteconfig, strRemoteconfig2);
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
