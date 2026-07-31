package defpackage;

/* JADX INFO: renamed from: lًََ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10206l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10206l yandex;

    static {
        C10206l c10206l = new C10206l();
        yandex = c10206l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.RequestTokenResponse.CaptchaRequired", c10206l, 6);
        c13637l.smaato("captcha_sid", true);
        c13637l.smaato("captcha_img", true);
        c13637l.smaato("captcha_ts", true);
        c13637l.smaato("captcha_ratio", true);
        c13637l.smaato("captcha_attempt", true);
        c13637l.smaato("redirect_uri", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        C7872l c7872l = C7872l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, c7872l, c7872l, C1313l.yandex, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C9923l c9923l = (C9923l) obj;
        String str = c9923l.billing;
        int i = c9923l.purchase;
        double d = c9923l.amazon;
        double d2 = c9923l.crashlytics;
        String str2 = c9923l.loadAd;
        String str3 = c9923l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str3, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 0, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str2, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 1, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || Double.compare(d2, 0.0d) != 0) {
            AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
            abstractC4072l.advert(interfaceC18035l, 2);
            abstractC4072l.billing(d2);
        }
        if (interfaceC0039lCrashlytics.ads() || Double.compare(d, 0.0d) != 0) {
            AbstractC4072l abstractC4072l2 = (AbstractC4072l) interfaceC0039lCrashlytics;
            abstractC4072l2.advert(interfaceC18035l, 3);
            abstractC4072l2.billing(d);
        }
        if (interfaceC0039lCrashlytics.ads() || i != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(4, i, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 5, str);
        }
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
        String strRemoteconfig3 = null;
        double dPremium = 0.0d;
        double dPremium2 = 0.0d;
        boolean z = true;
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
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    dPremium = interfaceC14988lCrashlytics.premium(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    dPremium2 = interfaceC14988lCrashlytics.premium(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 5);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C9923l(i, strRemoteconfig, strRemoteconfig2, dPremium, dPremium2, iSubscription, strRemoteconfig3);
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
