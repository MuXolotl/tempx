package defpackage;

/* JADX INFO: renamed from: lَٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17034l implements InterfaceC18528l {
    public static final C17034l yandex = new C17034l();
    public static final C3537l loadAd = C3537l.crashlytics("sdkVersion");
    public static final C3537l crashlytics = C3537l.crashlytics("model");
    public static final C3537l amazon = C3537l.crashlytics("hardware");
    public static final C3537l purchase = C3537l.crashlytics("device");
    public static final C3537l billing = C3537l.crashlytics("product");
    public static final C3537l mopub = C3537l.crashlytics("osBuild");
    public static final C3537l admob = C3537l.crashlytics("manufacturer");
    public static final C3537l subs = C3537l.crashlytics("fingerprint");
    public static final C3537l isPro = C3537l.crashlytics("locale");
    public static final C3537l firebase = C3537l.crashlytics("country");
    public static final C3537l smaato = C3537l.crashlytics("mccMnc");
    public static final C3537l remoteconfig = C3537l.crashlytics("applicationBuild");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC3188l abstractC3188l = (AbstractC3188l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C11398l) abstractC3188l).yandex);
        C11398l c11398l = (C11398l) abstractC3188l;
        interfaceC14185l.yandex(crashlytics, c11398l.loadAd);
        interfaceC14185l.yandex(amazon, c11398l.crashlytics);
        interfaceC14185l.yandex(purchase, c11398l.amazon);
        interfaceC14185l.yandex(billing, c11398l.purchase);
        interfaceC14185l.yandex(mopub, c11398l.billing);
        interfaceC14185l.yandex(admob, c11398l.mopub);
        interfaceC14185l.yandex(subs, c11398l.admob);
        interfaceC14185l.yandex(isPro, c11398l.subs);
        interfaceC14185l.yandex(firebase, c11398l.isPro);
        interfaceC14185l.yandex(smaato, c11398l.firebase);
        interfaceC14185l.yandex(remoteconfig, c11398l.smaato);
    }
}
