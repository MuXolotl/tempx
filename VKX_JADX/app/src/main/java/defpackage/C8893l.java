package defpackage;

/* JADX INFO: renamed from: lٌٜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8893l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C8893l yandex;

    static {
        C8893l c8893l = new C8893l();
        yandex = c8893l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.ecosystem.EcosystemVerificationMethodDto", c8893l, 5);
        c13637l.smaato("name", true);
        c13637l.smaato("priority", true);
        c13637l.smaato("timeout", true);
        c13637l.smaato("info", true);
        c13637l.smaato("can_fallback", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics((InterfaceC16588l) C4530l.billing[0].getValue());
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{interfaceC16588lCrashlytics, AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(C0194l.yandex), AbstractC7303l.crashlytics(C2796l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C4530l c4530l = (C4530l) obj;
        Boolean bool = c4530l.purchase;
        String str = c4530l.amazon;
        Integer num = c4530l.crashlytics;
        Integer num2 = c4530l.loadAd;
        EnumC11781l enumC11781l = c4530l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4530l.billing;
        if (interfaceC0039lCrashlytics.ads() || enumC11781l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC11781l);
        }
        if (interfaceC0039lCrashlytics.ads() || num2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C1313l.yandex, num2);
        }
        if (interfaceC0039lCrashlytics.ads() || num != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C1313l.yandex, num);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, C0194l.yandex, str);
        }
        if (interfaceC0039lCrashlytics.ads() || bool != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C2796l.yandex, bool);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4530l.billing;
        boolean z = true;
        int i = 0;
        EnumC11781l enumC11781l = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                enumC11781l = (EnumC11781l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC11781l);
                i |= 1;
            } else if (iAdmob == 1) {
                num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C1313l.yandex, num);
                i |= 2;
            } else if (iAdmob == 2) {
                num2 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C1313l.yandex, num2);
                i |= 4;
            } else if (iAdmob == 3) {
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C2796l.yandex, bool);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C4530l(i, enumC11781l, num, num2, str, bool);
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
