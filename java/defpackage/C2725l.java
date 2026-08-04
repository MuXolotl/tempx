package defpackage;

/* JADX INFO: renamed from: lًؔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2725l implements InterfaceC18528l {
    public static final C2725l yandex = new C2725l();
    public static final C3537l loadAd = C3537l.crashlytics("pc");
    public static final C3537l crashlytics = C3537l.crashlytics("symbol");
    public static final C3537l amazon = C3537l.crashlytics("file");
    public static final C3537l purchase = C3537l.crashlytics("offset");
    public static final C3537l billing = C3537l.crashlytics("importance");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC15403l abstractC15403l = (AbstractC15403l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.mopub(loadAd, ((C7422l) abstractC15403l).yandex);
        C7422l c7422l = (C7422l) abstractC15403l;
        interfaceC14185l.yandex(crashlytics, c7422l.loadAd);
        interfaceC14185l.yandex(amazon, c7422l.crashlytics);
        interfaceC14185l.mopub(purchase, c7422l.amazon);
        interfaceC14185l.purchase(billing, c7422l.purchase);
    }
}
