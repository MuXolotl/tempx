package defpackage;

/* JADX INFO: renamed from: lّ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17877l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C17877l yandex;

    static {
        C17877l c17877l = new C17877l();
        yandex = c17877l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountNextStepDto", c17877l, 4);
        c13637l.smaato("verification_method", true);
        c13637l.smaato("has_another_verification_methods", true);
        c13637l.smaato("external_id", true);
        c13637l.smaato("service_code", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C8487l.purchase;
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[0].getValue()), AbstractC7303l.crashlytics(C2796l.yandex), AbstractC7303l.crashlytics(C0194l.yandex), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[3].getValue())};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C8487l c8487l = (C8487l) obj;
        EnumC10215l enumC10215l = c8487l.amazon;
        String str = c8487l.crashlytics;
        Boolean bool = c8487l.loadAd;
        EnumC11781l enumC11781l = c8487l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C8487l.purchase;
        if (interfaceC0039lCrashlytics.ads() || enumC11781l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC11781l);
        }
        if (interfaceC0039lCrashlytics.ads() || bool != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C2796l.yandex, bool);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C0194l.yandex, str);
        }
        if (interfaceC0039lCrashlytics.ads() || enumC10215l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), enumC10215l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C8487l.purchase;
        boolean z = true;
        int i = 0;
        EnumC11781l enumC11781l = null;
        Boolean bool = null;
        String str = null;
        EnumC10215l enumC10215l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                enumC11781l = (EnumC11781l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC11781l);
                i |= 1;
            } else if (iAdmob == 1) {
                bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C2796l.yandex, bool);
                i |= 2;
            } else if (iAdmob == 2) {
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                enumC10215l = (EnumC10215l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), enumC10215l);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C8487l(i, enumC11781l, bool, str, enumC10215l);
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
