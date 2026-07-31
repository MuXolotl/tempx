package defpackage;

/* JADX INFO: renamed from: lؚؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3966l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C3966l yandex;

    static {
        C3966l c3966l = new C3966l();
        yandex = c3966l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.internal.VkErrorDetails.KeyValue", c3966l, 2);
        c13637l.smaato("key", false);
        c13637l.smaato("value", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C11712l c11712l = (C11712l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, c11712l.yandex);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c11712l.loadAd);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C11712l(strRemoteconfig, i, strRemoteconfig2);
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
