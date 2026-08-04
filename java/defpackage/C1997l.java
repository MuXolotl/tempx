package defpackage;

/* JADX INFO: renamed from: lٌؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1997l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C1997l yandex;

    static {
        C1997l c1997l = new C1997l();
        yandex = c1997l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthCodeAuthInfoDto", c1997l, 6);
        c13637l.smaato("auth_id", false);
        c13637l.smaato("client_info", false);
        c13637l.smaato("device_info", false);
        c13637l.smaato("domain", true);
        c13637l.smaato("expires_in", false);
        c13637l.smaato("flow_type", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c0194l, C14557l.yandex, C5623l.yandex, c0194l, c1313l, c1313l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C9806l c9806l = (C9806l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        String str = c9806l.yandex;
        String str2 = c9806l.amazon;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        abstractC4072l.applovin(interfaceC18035l, 1, C14557l.yandex, c9806l.loadAd);
        abstractC4072l.applovin(interfaceC18035l, 2, C5623l.yandex, c9806l.crashlytics);
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str2, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 3, str2);
        }
        abstractC4072l.signatures(4, c9806l.purchase, interfaceC18035l);
        abstractC4072l.signatures(5, c9806l.billing, interfaceC18035l);
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
        C13892l c13892l = null;
        C10399l c10399l = null;
        String strRemoteconfig2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    c13892l = (C13892l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, C14557l.yandex, c13892l);
                    i |= 2;
                    break;
                case 2:
                    c10399l = (C10399l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, C5623l.yandex, c10399l);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 5);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C9806l(i, strRemoteconfig, c13892l, c10399l, strRemoteconfig2, iSubscription, iSubscription2);
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
