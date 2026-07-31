package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7717l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C7717l yandex;

    static {
        C7717l c7717l = new C7717l();
        yandex = c7717l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioStreamMixSettingsCategoryDto", c7717l, 4);
        c13637l.smaato("id", false);
        c13637l.smaato("title", false);
        c13637l.smaato("type", false);
        c13637l.smaato("options", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C1820l.purchase;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, c0194l, interfaceC1220lArr[3].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C1820l c1820l = (C1820l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C1820l.purchase;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, c1820l.yandex);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c1820l.loadAd);
        abstractC4072l.appmetrica(interfaceC18035l, 2, c1820l.crashlytics);
        abstractC4072l.applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), c1820l.amazon);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C1820l.purchase;
        boolean z = true;
        int i = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        List list = null;
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
                strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C1820l(i, strRemoteconfig, strRemoteconfig2, strRemoteconfig3, list);
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
