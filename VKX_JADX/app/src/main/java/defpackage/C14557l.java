package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٓۦ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14557l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C14557l yandex;

    static {
        C14557l c14557l = new C14557l();
        yandex = c14557l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthCodeAuthClientInfoDto", c14557l, 7);
        c13637l.smaato("agreements", true);
        c13637l.smaato("icon_150", true);
        c13637l.smaato("icon_75", true);
        c13637l.smaato("id", false);
        c13637l.smaato("is_official", true);
        c13637l.smaato("name", false);
        c13637l.smaato("scopes", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C13892l.admob;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{interfaceC1220lArr[0].getValue(), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), C1313l.yandex, C2796l.yandex, c0194l, interfaceC1220lArr[6].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C13892l c13892l = (C13892l) obj;
        String str = c13892l.crashlytics;
        String str2 = c13892l.loadAd;
        List list = c13892l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C13892l.admob;
        boolean zAds = interfaceC0039lCrashlytics.ads();
        C2580l c2580l = C2580l.f5619l;
        if (zAds || !AbstractC8576l.yandex(list, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C0194l.yandex, str);
        }
        int i = c13892l.amazon;
        List list2 = c13892l.mopub;
        boolean z = c13892l.purchase;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(3, i, interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 4, z);
        }
        abstractC4072l.appmetrica(interfaceC18035l, 5, c13892l.billing);
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list2, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list2);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C13892l.admob;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        boolean zIsVip = false;
        List list = null;
        String str = null;
        String str2 = null;
        String strRemoteconfig = null;
        List list2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str2);
                    i |= 4;
                    break;
                case 3:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 5);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C13892l(i, list, str, str2, iSubscription, zIsVip, strRemoteconfig, list2);
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
