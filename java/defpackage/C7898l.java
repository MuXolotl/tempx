package defpackage;

/* JADX INFO: renamed from: lًٍۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7898l implements InterfaceC18528l {
    public static final C7898l yandex = new C7898l();
    public static final C3537l loadAd = new C3537l("appId", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("appVersion", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("firebaseProjectId", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l purchase = new C3537l("mlSdkVersion", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));
    public static final C3537l billing = new C3537l("tfliteSchemaVersion", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(5))));
    public static final C3537l mopub = new C3537l("gcmSenderId", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(6))));
    public static final C3537l admob = new C3537l("apiKey", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(7))));
    public static final C3537l subs = new C3537l("languages", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(8))));
    public static final C3537l isPro = new C3537l("mlSdkInstanceId", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(9))));
    public static final C3537l firebase = new C3537l("isClearcutClient", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(10))));
    public static final C3537l smaato = new C3537l("isStandaloneMlkit", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(11))));
    public static final C3537l remoteconfig = new C3537l("isJsonLogging", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(12))));
    public static final C3537l vip = new C3537l("buildLevel", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(13))));
    public static final C3537l metrica = new C3537l("optionalModuleVersion", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(14))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C14867l c14867l = (C14867l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c14867l.yandex);
        interfaceC14185l.yandex(crashlytics, c14867l.loadAd);
        interfaceC14185l.yandex(amazon, null);
        interfaceC14185l.yandex(purchase, c14867l.crashlytics);
        interfaceC14185l.yandex(billing, c14867l.amazon);
        interfaceC14185l.yandex(mopub, null);
        interfaceC14185l.yandex(admob, null);
        interfaceC14185l.yandex(subs, c14867l.purchase);
        interfaceC14185l.yandex(isPro, c14867l.billing);
        interfaceC14185l.yandex(firebase, c14867l.mopub);
        interfaceC14185l.yandex(smaato, c14867l.admob);
        interfaceC14185l.yandex(remoteconfig, c14867l.subs);
        interfaceC14185l.yandex(vip, c14867l.isPro);
        interfaceC14185l.yandex(metrica, c14867l.firebase);
    }
}
