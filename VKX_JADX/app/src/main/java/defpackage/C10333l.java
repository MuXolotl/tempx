package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10333l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10333l yandex;

    static {
        C10333l c10333l = new C10333l();
        yandex = c10333l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkx.theming.catalog.model.RootThemeGroup", c10333l, 2);
        c13637l.smaato("name", false);
        c13637l.smaato("themes", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C0194l.yandex, C6270l.crashlytics[1].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C6270l c6270l = (C6270l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6270l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, c6270l.yandex);
        abstractC4072l.applovin(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), c6270l.loadAd);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6270l.crashlytics;
        boolean z = true;
        int i = 0;
        String strRemoteconfig = null;
        List list = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), list);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C6270l(i, strRemoteconfig, list);
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
