package defpackage;

/* JADX INFO: renamed from: lؑؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0083l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C0083l yandex;

    static {
        C0083l c0083l = new C0083l();
        yandex = c0083l;
        C13637l c13637l = new C13637l("com.google.firebase.sessions.SessionDetails", c0083l, 4);
        c13637l.smaato("sessionId", false);
        c13637l.smaato("firstSessionId", false);
        c13637l.smaato("sessionIndex", false);
        c13637l.smaato("sessionStartTimestampUs", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, C1313l.yandex, C2010l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C18067l c18067l = (C18067l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, c18067l.yandex);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c18067l.loadAd);
        abstractC4072l.signatures(2, c18067l.crashlytics, interfaceC18035l);
        abstractC4072l.premium(interfaceC18035l, 3, c18067l.amazon);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        int iSubscription = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        long jInmobi = 0;
        boolean z = true;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            } else if (iAdmob == 2) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 2);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 3);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C18067l(i, iSubscription, jInmobi, strRemoteconfig, strRemoteconfig2);
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
