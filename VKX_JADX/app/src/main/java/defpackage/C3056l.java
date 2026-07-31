package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؔۦۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3056l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C3056l yandex;

    static {
        C3056l c3056l = new C3056l();
        yandex = c3056l;
        C13637l c13637l = new C13637l("synchronized", c3056l, 2);
        c13637l.smaato("lines", true);
        c13637l.smaato("credits", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C16016l.crashlytics[0].getValue(), AbstractC7303l.crashlytics(C0194l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C16016l c16016l = (C16016l) obj;
        String str = c16016l.loadAd;
        List list = c16016l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C16016l.crashlytics;
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, C2580l.f5619l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C16016l.crashlytics;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C16016l(i, str, list);
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
