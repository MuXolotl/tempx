package defpackage;

/* JADX INFO: renamed from: lٌؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8500l implements InterfaceC18528l {
    public static final C8500l yandex = new C8500l();
    public static final C3537l loadAd = new C3537l("appId", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(1))));
    public static final C3537l crashlytics = new C3537l("appVersion", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(2))));
    public static final C3537l amazon = new C3537l("firebaseProjectId", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(3))));
    public static final C3537l purchase = new C3537l("mlSdkVersion", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(4))));
    public static final C3537l billing = new C3537l("tfliteSchemaVersion", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(5))));
    public static final C3537l mopub = new C3537l("gcmSenderId", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(6))));
    public static final C3537l admob = new C3537l("apiKey", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(7))));
    public static final C3537l subs = new C3537l("languages", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(8))));
    public static final C3537l isPro = new C3537l("mlSdkInstanceId", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(9))));
    public static final C3537l firebase = new C3537l("isClearcutClient", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(10))));
    public static final C3537l smaato = new C3537l("isStandaloneMlkit", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(11))));
    public static final C3537l remoteconfig = new C3537l("isJsonLogging", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(12))));
    public static final C3537l vip = new C3537l("buildLevel", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(13))));
    public static final C3537l metrica = new C3537l("optionalModuleVersion", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(14))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C2681l c2681l = (C2681l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c2681l.yandex);
        interfaceC14185l.yandex(crashlytics, c2681l.loadAd);
        interfaceC14185l.yandex(amazon, null);
        interfaceC14185l.yandex(purchase, c2681l.crashlytics);
        interfaceC14185l.yandex(billing, c2681l.amazon);
        interfaceC14185l.yandex(mopub, null);
        interfaceC14185l.yandex(admob, null);
        interfaceC14185l.yandex(subs, c2681l.purchase);
        interfaceC14185l.yandex(isPro, c2681l.billing);
        interfaceC14185l.yandex(firebase, c2681l.mopub);
        interfaceC14185l.yandex(smaato, c2681l.admob);
        interfaceC14185l.yandex(remoteconfig, c2681l.subs);
        interfaceC14185l.yandex(vip, c2681l.isPro);
        interfaceC14185l.yandex(metrica, c2681l.firebase);
    }
}
