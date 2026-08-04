package defpackage;

/* JADX INFO: renamed from: lؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5696l implements InterfaceC18528l {
    public static final C5696l yandex = new C5696l();
    public static final C3537l loadAd = C3537l.crashlytics("generator");
    public static final C3537l crashlytics = C3537l.crashlytics("identifier");
    public static final C3537l amazon = C3537l.crashlytics("appQualitySessionId");
    public static final C3537l purchase = C3537l.crashlytics("startedAt");
    public static final C3537l billing = C3537l.crashlytics("endedAt");
    public static final C3537l mopub = C3537l.crashlytics("crashed");
    public static final C3537l admob = C3537l.crashlytics("app");
    public static final C3537l subs = C3537l.crashlytics("user");
    public static final C3537l isPro = C3537l.crashlytics("os");
    public static final C3537l firebase = C3537l.crashlytics("device");
    public static final C3537l smaato = C3537l.crashlytics("events");
    public static final C3537l remoteconfig = C3537l.crashlytics("generatorType");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC5638l abstractC5638l = (AbstractC5638l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C9428l) abstractC5638l).yandex);
        C9428l c9428l = (C9428l) abstractC5638l;
        interfaceC14185l.yandex(crashlytics, c9428l.loadAd.getBytes(AbstractC2236l.yandex));
        interfaceC14185l.yandex(amazon, c9428l.crashlytics);
        interfaceC14185l.mopub(purchase, c9428l.amazon);
        interfaceC14185l.yandex(billing, c9428l.purchase);
        interfaceC14185l.amazon(mopub, c9428l.billing);
        interfaceC14185l.yandex(admob, c9428l.mopub);
        interfaceC14185l.yandex(subs, c9428l.admob);
        interfaceC14185l.yandex(isPro, c9428l.subs);
        interfaceC14185l.yandex(firebase, c9428l.isPro);
        interfaceC14185l.yandex(smaato, c9428l.firebase);
        interfaceC14185l.purchase(remoteconfig, c9428l.smaato);
    }
}
