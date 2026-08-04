package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16454l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C16454l yandex;

    static {
        C16454l c16454l = new C16454l();
        yandex = c16454l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.playback.dsp.DspStoredPreset", c16454l, 5);
        c13637l.smaato("id", false);
        c13637l.smaato("name", false);
        c13637l.smaato("default", true);
        c13637l.smaato("bands", false);
        c13637l.smaato("gains", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C11359l.billing;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, C2796l.yandex, interfaceC1220lArr[3].getValue(), interfaceC1220lArr[4].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C11359l c11359l = (C11359l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C11359l.billing;
        String str = c11359l.yandex;
        boolean z = c11359l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c11359l.loadAd);
        if (abstractC4072l.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 2, z);
        }
        abstractC4072l.applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), c11359l.amazon);
        abstractC4072l.applovin(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), c11359l.purchase);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C11359l.billing;
        boolean z = true;
        int i = 0;
        boolean zIsVip = false;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        List list = null;
        List list2 = null;
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
                zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list2);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C11359l(i, strRemoteconfig, strRemoteconfig2, zIsVip, list, list2);
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
