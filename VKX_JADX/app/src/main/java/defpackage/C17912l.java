package defpackage;

/* JADX INFO: renamed from: l٘ٓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17912l implements InterfaceC18528l {
    public static final C17912l yandex = new C17912l();
    public static final C3537l loadAd = C3537l.crashlytics("sdkVersion");
    public static final C3537l crashlytics = C3537l.crashlytics("gmpAppId");
    public static final C3537l amazon = C3537l.crashlytics("platform");
    public static final C3537l purchase = C3537l.crashlytics("installationUuid");
    public static final C3537l billing = C3537l.crashlytics("firebaseInstallationId");
    public static final C3537l mopub = C3537l.crashlytics("firebaseAuthenticationToken");
    public static final C3537l admob = C3537l.crashlytics("appQualitySessionId");
    public static final C3537l subs = C3537l.crashlytics("buildVersion");
    public static final C3537l isPro = C3537l.crashlytics("displayVersion");
    public static final C3537l firebase = C3537l.crashlytics("session");
    public static final C3537l smaato = C3537l.crashlytics("ndkPayload");
    public static final C3537l remoteconfig = C3537l.crashlytics("appExitInfo");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC2236l abstractC2236l = (AbstractC2236l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C11091l) abstractC2236l).loadAd);
        C11091l c11091l = (C11091l) abstractC2236l;
        interfaceC14185l.yandex(crashlytics, c11091l.crashlytics);
        interfaceC14185l.purchase(amazon, c11091l.amazon);
        interfaceC14185l.yandex(purchase, c11091l.purchase);
        interfaceC14185l.yandex(billing, c11091l.billing);
        interfaceC14185l.yandex(mopub, c11091l.mopub);
        interfaceC14185l.yandex(admob, c11091l.admob);
        interfaceC14185l.yandex(subs, c11091l.subs);
        interfaceC14185l.yandex(isPro, c11091l.isPro);
        interfaceC14185l.yandex(firebase, c11091l.firebase);
        interfaceC14185l.yandex(smaato, c11091l.smaato);
        interfaceC14185l.yandex(remoteconfig, c11091l.remoteconfig);
    }
}
