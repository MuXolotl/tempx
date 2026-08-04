package defpackage;

/* JADX INFO: renamed from: lؚۛؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7510l implements InterfaceC18528l {
    public static final C7510l yandex = new C7510l();
    public static final C3537l loadAd = new C3537l("appName", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("sessionId", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("startZoomLevel", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l purchase = new C3537l("endZoomLevel", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));
    public static final C3537l billing = new C3537l("durationMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(5))));
    public static final C3537l mopub = new C3537l("predictedArea", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(6))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        ((AbstractC2897l) obj).getClass();
        interfaceC14185l.yandex(loadAd, null);
        interfaceC14185l.yandex(crashlytics, null);
        interfaceC14185l.yandex(amazon, null);
        interfaceC14185l.yandex(purchase, null);
        interfaceC14185l.yandex(billing, null);
        interfaceC14185l.yandex(mopub, null);
    }
}
