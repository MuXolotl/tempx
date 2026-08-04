package defpackage;

/* JADX INFO: renamed from: lٌِؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8516l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C8516l yandex;

    static {
        C8516l c8516l = new C8516l();
        yandex = c8516l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthGetAuthCodeStatusResponseDto", c8516l, 4);
        c13637l.smaato("status", false);
        c13637l.smaato("expires_in", true);
        c13637l.smaato("user_id", true);
        c13637l.smaato("access_token", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c1313l, c1313l, C2010l.yandex, C0194l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C7220l c7220l = (C7220l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        int i = c7220l.yandex;
        String str = c7220l.amazon;
        long j = c7220l.crashlytics;
        int i2 = c7220l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        if (abstractC4072l.ads() || i2 != 0) {
            abstractC4072l.signatures(1, i2, interfaceC18035l);
        }
        if (abstractC4072l.ads() || j != 0) {
            abstractC4072l.premium(interfaceC18035l, 2, j);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 3, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        long jInmobi = 0;
        String strRemoteconfig = null;
        boolean z = true;
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
                jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 2);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C7220l(i, iSubscription, iSubscription2, jInmobi, strRemoteconfig);
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
