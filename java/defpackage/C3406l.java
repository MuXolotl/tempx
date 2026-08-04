package defpackage;

/* JADX INFO: renamed from: lٍٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3406l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C3406l yandex;

    static {
        C3406l c3406l = new C3406l();
        yandex = c3406l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthSignupFieldsValuesDto", c3406l, 6);
        c13637l.smaato("first_name", true);
        c13637l.smaato("last_name", true);
        c13637l.smaato("middle_name", true);
        c13637l.smaato("gender", true);
        c13637l.smaato("birthday", true);
        c13637l.smaato("avatar", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C17533l.mopub;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[3].getValue()), AbstractC7303l.crashlytics(C13383l.yandex), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C17533l c17533l = (C17533l) obj;
        String str = c17533l.billing;
        C11555l c11555l = c17533l.purchase;
        EnumC8967l enumC8967l = c17533l.amazon;
        String str2 = c17533l.crashlytics;
        String str3 = c17533l.loadAd;
        String str4 = c17533l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C17533l.mopub;
        if (interfaceC0039lCrashlytics.ads() || str4 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C0194l.yandex, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || str3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C0194l.yandex, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || enumC8967l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), enumC8967l);
        }
        if (interfaceC0039lCrashlytics.ads() || c11555l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C13383l.yandex, c11555l);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C17533l.mopub;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        EnumC8967l enumC8967l = null;
        C11555l c11555l = null;
        String str4 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C0194l.yandex, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str3);
                    i |= 4;
                    break;
                case 3:
                    enumC8967l = (EnumC8967l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), enumC8967l);
                    i |= 8;
                    break;
                case 4:
                    c11555l = (C11555l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C13383l.yandex, c11555l);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str4);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C17533l(i, str, str2, str3, enumC8967l, c11555l, str4);
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
