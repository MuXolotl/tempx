package defpackage;

/* JADX INFO: renamed from: lِؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0989l implements InterfaceC18528l {
    public static final C0989l yandex = new C0989l();
    public static final C3537l loadAd = C3537l.crashlytics("platform");
    public static final C3537l crashlytics = C3537l.crashlytics("version");
    public static final C3537l amazon = C3537l.crashlytics("buildVersion");
    public static final C3537l purchase = C3537l.crashlytics("jailbroken");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC17613l abstractC17613l = (AbstractC17613l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.purchase(loadAd, ((C1006l) abstractC17613l).yandex);
        C1006l c1006l = (C1006l) abstractC17613l;
        interfaceC14185l.yandex(crashlytics, c1006l.loadAd);
        interfaceC14185l.yandex(amazon, c1006l.crashlytics);
        interfaceC14185l.amazon(purchase, c1006l.amazon);
    }
}
