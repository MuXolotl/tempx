package defpackage;

/* JADX INFO: renamed from: lؖٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4114l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C4114l yandex;

    static {
        C4114l c4114l = new C4114l();
        yandex = c4114l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonActionDto", c4114l, 3);
        c13637l.smaato("type", false);
        c13637l.smaato("target", true);
        c13637l.smaato("url", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C17346l.amazon;
        return new InterfaceC16588l[]{interfaceC1220lArr[0].getValue(), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[1].getValue()), AbstractC7303l.crashlytics(C0194l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C17346l c17346l = (C17346l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C17346l.amazon;
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) interfaceC1220lArr[0].getValue();
        EnumC6525l enumC6525l = c17346l.yandex;
        String str = c17346l.crashlytics;
        EnumC15420l enumC15420l = c17346l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, interfaceC16588l, enumC6525l);
        if (abstractC4072l.ads() || enumC15420l != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC15420l);
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
        InterfaceC1220l[] interfaceC1220lArr = C17346l.amazon;
        boolean z = true;
        int i = 0;
        EnumC6525l enumC6525l = null;
        EnumC15420l enumC15420l = null;
        String str = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                enumC6525l = (EnumC6525l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC6525l);
                i |= 1;
            } else if (iAdmob == 1) {
                enumC15420l = (EnumC15420l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC15420l);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C17346l(i, enumC6525l, enumC15420l, str);
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
