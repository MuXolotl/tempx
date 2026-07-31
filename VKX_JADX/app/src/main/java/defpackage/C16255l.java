package defpackage;

/* JADX INFO: renamed from: lًٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16255l implements InterfaceC18528l {
    public static final C16255l yandex = new C16255l();
    public static final C3537l loadAd = new C3537l("errorCode", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("hasResult", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("isColdCall", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l purchase = new C3537l("imageInfo", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));
    public static final C3537l billing = new C3537l("options", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(5))));
    public static final C3537l mopub = new C3537l("detectedBarcodeFormats", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(6))));
    public static final C3537l admob = new C3537l("detectedBarcodeValueTypes", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(7))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C15131l c15131l = (C15131l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c15131l.yandex);
        interfaceC14185l.yandex(crashlytics, null);
        interfaceC14185l.yandex(amazon, c15131l.loadAd);
        interfaceC14185l.yandex(purchase, null);
        interfaceC14185l.yandex(billing, c15131l.crashlytics);
        interfaceC14185l.yandex(mopub, c15131l.amazon);
        interfaceC14185l.yandex(admob, c15131l.purchase);
    }
}
