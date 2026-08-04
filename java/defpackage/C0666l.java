package defpackage;

/* JADX INFO: renamed from: lؚۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0666l implements InterfaceC18528l {
    public static final C0666l yandex = new C0666l();
    public static final C3537l loadAd = C3537l.crashlytics("execution");
    public static final C3537l crashlytics = C3537l.crashlytics("customAttributes");
    public static final C3537l amazon = C3537l.crashlytics("internalKeys");
    public static final C3537l purchase = C3537l.crashlytics("background");
    public static final C3537l billing = C3537l.crashlytics("currentProcessDetails");
    public static final C3537l mopub = C3537l.crashlytics("appProcessDetails");
    public static final C3537l admob = C3537l.crashlytics("uiOrientation");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC5909l abstractC5909l = (AbstractC5909l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C5161l) abstractC5909l).yandex);
        C5161l c5161l = (C5161l) abstractC5909l;
        interfaceC14185l.yandex(crashlytics, c5161l.loadAd);
        interfaceC14185l.yandex(amazon, c5161l.crashlytics);
        interfaceC14185l.yandex(purchase, c5161l.amazon);
        interfaceC14185l.yandex(billing, c5161l.purchase);
        interfaceC14185l.yandex(mopub, c5161l.billing);
        interfaceC14185l.purchase(admob, c5161l.mopub);
    }
}
