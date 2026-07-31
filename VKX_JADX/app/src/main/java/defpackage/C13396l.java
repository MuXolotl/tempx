package defpackage;

/* JADX INFO: renamed from: lْٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13396l implements InterfaceC18528l {
    public static final C13396l yandex = new C13396l();
    public static final C3537l loadAd = C3537l.crashlytics("requestTimeMs");
    public static final C3537l crashlytics = C3537l.crashlytics("requestUptimeMs");
    public static final C3537l amazon = C3537l.crashlytics("clientInfo");
    public static final C3537l purchase = C3537l.crashlytics("logSource");
    public static final C3537l billing = C3537l.crashlytics("logSourceName");
    public static final C3537l mopub = C3537l.crashlytics("logEvent");
    public static final C3537l admob = C3537l.crashlytics("qosTier");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC4637l abstractC4637l = (AbstractC4637l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.mopub(loadAd, ((C12560l) abstractC4637l).yandex);
        C12560l c12560l = (C12560l) abstractC4637l;
        interfaceC14185l.mopub(crashlytics, c12560l.loadAd);
        interfaceC14185l.yandex(amazon, c12560l.crashlytics);
        interfaceC14185l.yandex(purchase, c12560l.amazon);
        interfaceC14185l.yandex(billing, c12560l.purchase);
        interfaceC14185l.yandex(mopub, c12560l.billing);
        interfaceC14185l.yandex(admob, EnumC16883l.f32935l);
    }
}
