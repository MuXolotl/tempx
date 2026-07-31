package defpackage;

/* JADX INFO: renamed from: lٍؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0942l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C0942l yandex;

    static {
        C0942l c0942l = new C0942l();
        yandex = c0942l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthUserDto", c0942l, 8);
        c13637l.smaato("first_name", false);
        c13637l.smaato("has_2fa", false);
        c13637l.smaato("last_name", false);
        c13637l.smaato("photo_200", false);
        c13637l.smaato("deactivated", true);
        c13637l.smaato("phone", true);
        c13637l.smaato("has_password", true);
        c13637l.smaato("can_unbind_phone", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{c0194l, c2796l, c0194l, c0194l, AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C8768l c8768l = (C8768l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        String str = c8768l.yandex;
        Boolean bool = c8768l.admob;
        Boolean bool2 = c8768l.mopub;
        String str2 = c8768l.billing;
        String str3 = c8768l.purchase;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        abstractC4072l.ad(interfaceC18035l, 1, c8768l.loadAd);
        abstractC4072l.appmetrica(interfaceC18035l, 2, c8768l.crashlytics);
        abstractC4072l.appmetrica(interfaceC18035l, 3, c8768l.amazon);
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || bool2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C2796l.yandex, bool2);
        }
        if (abstractC4072l.ads() || bool != null) {
            abstractC4072l.startapp(interfaceC18035l, 7, C2796l.yandex, bool);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zIsVip = false;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str2);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C2796l.yandex, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C2796l.yandex, bool2);
                    i |= 128;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C8768l(i, strRemoteconfig, zIsVip, strRemoteconfig2, strRemoteconfig3, str, str2, bool, bool2);
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
