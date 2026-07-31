package defpackage;

/* JADX INFO: renamed from: lؙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0881l implements InterfaceC18528l {
    public static final C0881l yandex = new C0881l();
    public static final C3537l loadAd = new C3537l("inferenceCommonLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("options", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("detectedBarcodeFormats", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l purchase = new C3537l("detectedBarcodeValueTypes", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));
    public static final C3537l billing = new C3537l("imageInfo", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(5))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C3246l c3246l = (C3246l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c3246l.yandex);
        interfaceC14185l.yandex(crashlytics, c3246l.loadAd);
        interfaceC14185l.yandex(amazon, c3246l.crashlytics);
        interfaceC14185l.yandex(purchase, c3246l.amazon);
        interfaceC14185l.yandex(billing, c3246l.purchase);
    }
}
