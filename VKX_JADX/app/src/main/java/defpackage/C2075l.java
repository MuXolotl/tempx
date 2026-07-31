package defpackage;

/* JADX INFO: renamed from: lؓۙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2075l implements InterfaceC18528l {
    public static final C2075l yandex = new C2075l();
    public static final C3537l loadAd = new C3537l("maxMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("minMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("avgMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l purchase = new C3537l("firstQuartileMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));
    public static final C3537l billing = new C3537l("medianMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(5))));
    public static final C3537l mopub = new C3537l("thirdQuartileMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(6))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C6859l c6859l = (C6859l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c6859l.yandex);
        interfaceC14185l.yandex(crashlytics, c6859l.loadAd);
        interfaceC14185l.yandex(amazon, c6859l.crashlytics);
        interfaceC14185l.yandex(purchase, c6859l.amazon);
        interfaceC14185l.yandex(billing, c6859l.purchase);
        interfaceC14185l.yandex(mopub, c6859l.billing);
    }
}
