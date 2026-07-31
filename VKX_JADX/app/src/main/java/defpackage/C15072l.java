package defpackage;

/* JADX INFO: renamed from: lٟٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15072l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C15072l yandex;

    static {
        C15072l c15072l = new C15072l();
        yandex = c15072l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.apps.AppsScopeDto", c15072l, 3);
        c13637l.smaato("name", false);
        c13637l.smaato("title", true);
        c13637l.smaato("description", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{C0137l.amazon[0].getValue(), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C0137l c0137l = (C0137l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) C0137l.amazon[0].getValue();
        EnumC18732l enumC18732l = c0137l.yandex;
        String str = c0137l.crashlytics;
        String str2 = c0137l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, interfaceC16588l, enumC18732l);
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C0137l.amazon;
        boolean z = true;
        int i = 0;
        EnumC18732l enumC18732l = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                enumC18732l = (EnumC18732l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC18732l);
                i |= 1;
            } else if (iAdmob == 1) {
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C0137l(i, enumC18732l, str, str2);
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
