package defpackage;

/* JADX INFO: renamed from: lؒۧٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1495l implements InterfaceC18528l {
    public static final C1495l yandex = new C1495l();
    public static final C3537l loadAd = C3537l.crashlytics("type");
    public static final C3537l crashlytics = C3537l.crashlytics("reason");
    public static final C3537l amazon = C3537l.crashlytics("frames");
    public static final C3537l purchase = C3537l.crashlytics("causedBy");
    public static final C3537l billing = C3537l.crashlytics("overflowCount");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC1377l abstractC1377l = (AbstractC1377l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C16172l) abstractC1377l).yandex);
        C16172l c16172l = (C16172l) abstractC1377l;
        interfaceC14185l.yandex(crashlytics, c16172l.loadAd);
        interfaceC14185l.yandex(amazon, c16172l.crashlytics);
        interfaceC14185l.yandex(purchase, c16172l.amazon);
        interfaceC14185l.purchase(billing, c16172l.purchase);
    }
}
