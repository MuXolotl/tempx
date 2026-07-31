package defpackage;

/* JADX INFO: renamed from: lَٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10309l implements InterfaceC18528l {
    public static final C10309l yandex = new C10309l();
    public static final C3537l loadAd = C3537l.crashlytics("identifier");
    public static final C3537l crashlytics = C3537l.crashlytics("version");
    public static final C3537l amazon = C3537l.crashlytics("displayVersion");
    public static final C3537l purchase = C3537l.crashlytics("organization");
    public static final C3537l billing = C3537l.crashlytics("installationUuid");
    public static final C3537l mopub = C3537l.crashlytics("developmentPlatform");
    public static final C3537l admob = C3537l.crashlytics("developmentPlatformVersion");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC9034l abstractC9034l = (AbstractC9034l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C4463l) abstractC9034l).yandex);
        C4463l c4463l = (C4463l) abstractC9034l;
        interfaceC14185l.yandex(crashlytics, c4463l.loadAd);
        interfaceC14185l.yandex(amazon, c4463l.crashlytics);
        interfaceC14185l.yandex(purchase, null);
        interfaceC14185l.yandex(billing, c4463l.amazon);
        interfaceC14185l.yandex(mopub, c4463l.purchase);
        interfaceC14185l.yandex(admob, c4463l.billing);
    }
}
