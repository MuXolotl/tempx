package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٓؐؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13839l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13839l yandex;

    static {
        C13839l c13839l = new C13839l();
        yandex = c13839l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkx.theming.catalog.model.RootThemeCatalog", c13839l, 4);
        c13637l.smaato("default_theme_id", false);
        c13637l.smaato("default_accent_id", false);
        c13637l.smaato("catalog_themes", false);
        c13637l.smaato("catalog_accents", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C4757l.purchase;
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c1313l, c1313l, interfaceC1220lArr[2].getValue(), interfaceC1220lArr[3].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C4757l c4757l = (C4757l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4757l.purchase;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, c4757l.yandex, interfaceC18035l);
        abstractC4072l.signatures(1, c4757l.loadAd, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), c4757l.crashlytics);
        abstractC4072l.applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), c4757l.amazon);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4757l.purchase;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        List list = null;
        List list2 = null;
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
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list2);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C4757l(i, iSubscription, iSubscription2, list, list2);
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
