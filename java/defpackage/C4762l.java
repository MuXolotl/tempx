package defpackage;

/* JADX INFO: renamed from: lٌٍؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4762l implements InterfaceC18528l {
    public static final C4762l yandex = new C4762l();
    public static final C3537l loadAd = C3537l.crashlytics("processName");
    public static final C3537l crashlytics = C3537l.crashlytics("pid");
    public static final C3537l amazon = C3537l.crashlytics("importance");
    public static final C3537l purchase = C3537l.crashlytics("defaultProcess");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C1410l c1410l = (C1410l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c1410l.yandex);
        interfaceC14185l.purchase(crashlytics, c1410l.loadAd);
        interfaceC14185l.purchase(amazon, c1410l.crashlytics);
        interfaceC14185l.amazon(purchase, c1410l.amazon);
    }
}
