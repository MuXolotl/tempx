package defpackage;

/* JADX INFO: renamed from: lؚؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1697l implements InterfaceC18528l {
    public static final C1697l yandex = new C1697l();
    public static final C3537l loadAd = C3537l.crashlytics("arch");
    public static final C3537l crashlytics = C3537l.crashlytics("model");
    public static final C3537l amazon = C3537l.crashlytics("cores");
    public static final C3537l purchase = C3537l.crashlytics("ram");
    public static final C3537l billing = C3537l.crashlytics("diskSpace");
    public static final C3537l mopub = C3537l.crashlytics("simulator");
    public static final C3537l admob = C3537l.crashlytics("state");
    public static final C3537l subs = C3537l.crashlytics("manufacturer");
    public static final C3537l isPro = C3537l.crashlytics("modelClass");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC8314l abstractC8314l = (AbstractC8314l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.purchase(loadAd, ((C8997l) abstractC8314l).yandex);
        C8997l c8997l = (C8997l) abstractC8314l;
        interfaceC14185l.yandex(crashlytics, c8997l.loadAd);
        interfaceC14185l.purchase(amazon, c8997l.crashlytics);
        interfaceC14185l.mopub(purchase, c8997l.amazon);
        interfaceC14185l.mopub(billing, c8997l.purchase);
        interfaceC14185l.amazon(mopub, c8997l.billing);
        interfaceC14185l.purchase(admob, c8997l.mopub);
        interfaceC14185l.yandex(subs, c8997l.admob);
        interfaceC14185l.yandex(isPro, c8997l.subs);
    }
}
