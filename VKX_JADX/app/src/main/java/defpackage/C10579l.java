package defpackage;

/* JADX INFO: renamed from: lَۣۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10579l implements InterfaceC18528l {
    public static final C10579l yandex = new C10579l();
    public static final C3537l loadAd = C3537l.crashlytics("batteryLevel");
    public static final C3537l crashlytics = C3537l.crashlytics("batteryVelocity");
    public static final C3537l amazon = C3537l.crashlytics("proximityOn");
    public static final C3537l purchase = C3537l.crashlytics("orientation");
    public static final C3537l billing = C3537l.crashlytics("ramUsed");
    public static final C3537l mopub = C3537l.crashlytics("diskUsed");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC3394l abstractC3394l = (AbstractC3394l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C9947l) abstractC3394l).yandex);
        C9947l c9947l = (C9947l) abstractC3394l;
        interfaceC14185l.purchase(crashlytics, c9947l.loadAd);
        interfaceC14185l.amazon(amazon, c9947l.crashlytics);
        interfaceC14185l.purchase(purchase, c9947l.amazon);
        interfaceC14185l.mopub(billing, c9947l.purchase);
        interfaceC14185l.mopub(mopub, c9947l.billing);
    }
}
