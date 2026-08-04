package defpackage;

/* JADX INFO: renamed from: lٍْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9532l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C9532l yandex;

    static {
        C9532l c9532l = new C9532l();
        yandex = c9532l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.RequestTokenResponse.TwoFactorRequired", c9532l, 6);
        c13637l.smaato("validation_type", false);
        c13637l.smaato("phone_mask", true);
        c13637l.smaato("masked_email", true);
        c13637l.smaato("code_length", true);
        c13637l.smaato("device_name", true);
        c13637l.smaato("validation_sid", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{C12462l.mopub[0].getValue(), c0194l, c0194l, C1313l.yandex, c0194l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C12462l c12462l = (C12462l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) C12462l.mopub[0].getValue();
        EnumC9763l enumC9763l = c12462l.yandex;
        String str = c12462l.billing;
        String str2 = c12462l.purchase;
        int i = c12462l.amazon;
        String str3 = c12462l.crashlytics;
        String str4 = c12462l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, interfaceC16588l, enumC9763l);
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str4, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 1, str4);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str3, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 2, str3);
        }
        if (abstractC4072l.ads() || i != 4) {
            abstractC4072l.signatures(3, i, interfaceC18035l);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str2, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 4, str2);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 5, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C12462l.mopub;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        EnumC9763l enumC9763l = null;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        String strRemoteconfig4 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    enumC9763l = (EnumC9763l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC9763l);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    strRemoteconfig4 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 5);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C12462l(i, enumC9763l, strRemoteconfig, strRemoteconfig2, iSubscription, strRemoteconfig3, strRemoteconfig4);
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
