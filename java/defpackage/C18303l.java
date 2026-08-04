package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lۣٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18303l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C18303l yandex;

    static {
        C18303l c18303l = new C18303l();
        yandex = c18303l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.orbitnetworking.proxy.VkConfigNetworkProxyProduct.VkConfigNetworkProxy", c18303l, 3);
        c13637l.smaato("ip", true);
        c13637l.smaato("weight", true);
        c13637l.smaato("domains", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C4803l.amazon;
        return new InterfaceC16588l[]{interfaceC1220lArr[0].getValue(), interfaceC1220lArr[1].getValue(), interfaceC1220lArr[2].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C4803l c4803l = (C4803l) obj;
        List list = c4803l.crashlytics;
        List list2 = c4803l.loadAd;
        List list3 = c4803l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4803l.amazon;
        boolean zAds = interfaceC0039lCrashlytics.ads();
        C2580l c2580l = C2580l.f5619l;
        if (zAds || !AbstractC8576l.yandex(list3, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list2, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), list2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4803l.amazon;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list);
                i |= 1;
            } else if (iAdmob == 1) {
                list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list3 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list3);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C4803l(i, list, list2, list3);
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
