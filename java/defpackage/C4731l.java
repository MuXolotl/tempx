package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؚؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4731l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C4731l yandex;

    static {
        C4731l c4731l = new C4731l();
        yandex = c4731l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkx.theming.catalog.model.EngineTheme", c4731l, 6);
        c13637l.smaato("id", false);
        c13637l.smaato("name", false);
        c13637l.smaato("author", true);
        c13637l.smaato("light", true);
        c13637l.smaato("assoc_accent", true);
        c13637l.smaato("theme_attrs", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C6417l.mopub;
        C1313l c1313l = C1313l.yandex;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c1313l, c0194l, AbstractC7303l.crashlytics(c0194l), C2796l.yandex, c1313l, interfaceC1220lArr[5].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C6417l c6417l = (C6417l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6417l.mopub;
        int i = c6417l.yandex;
        int i2 = c6417l.purchase;
        boolean z = c6417l.amazon;
        String str = c6417l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c6417l.loadAd);
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0194l.yandex, str);
        }
        if (abstractC4072l.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 3, z);
        }
        if (abstractC4072l.ads() || i2 != 0) {
            abstractC4072l.signatures(4, i2, interfaceC18035l);
        }
        abstractC4072l.applovin(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), c6417l.billing);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6417l.mopub;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        boolean zIsVip = false;
        int iSubscription2 = 0;
        String strRemoteconfig = null;
        String str = null;
        Map map = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str);
                    i |= 4;
                    break;
                case 3:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) interfaceC14988lCrashlytics.ads(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), map);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C6417l(i, iSubscription, strRemoteconfig, str, zIsVip, iSubscription2, map);
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
