package defpackage;

/* JADX INFO: renamed from: lٌؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2918l implements InterfaceC18528l {
    public static final C2918l yandex = new C2918l();
    public static final C3537l loadAd = C3537l.crashlytics("threads");
    public static final C3537l crashlytics = C3537l.crashlytics("exception");
    public static final C3537l amazon = C3537l.crashlytics("appExitInfo");
    public static final C3537l purchase = C3537l.crashlytics("signal");
    public static final C3537l billing = C3537l.crashlytics("binaries");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC10102l abstractC10102l = (AbstractC10102l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C0139l) abstractC10102l).yandex);
        C0139l c0139l = (C0139l) abstractC10102l;
        interfaceC14185l.yandex(crashlytics, c0139l.loadAd);
        interfaceC14185l.yandex(amazon, c0139l.crashlytics);
        interfaceC14185l.yandex(purchase, c0139l.amazon);
        interfaceC14185l.yandex(billing, c0139l.purchase);
    }
}
