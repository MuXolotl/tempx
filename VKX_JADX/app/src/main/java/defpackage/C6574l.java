package defpackage;

/* JADX INFO: renamed from: lؙٛؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6574l implements InterfaceC18528l {
    public static final C6574l yandex = new C6574l();
    public static final C3537l loadAd = new C3537l("durationMs", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("errorCode", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("isColdCall", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l purchase = new C3537l("autoManageModelOnBackground", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));
    public static final C3537l billing = new C3537l("autoManageModelOnLowMemory", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(5))));
    public static final C3537l mopub = new C3537l("isNnApiEnabled", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(6))));
    public static final C3537l admob = new C3537l("eventsCount", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(7))));
    public static final C3537l subs = new C3537l("otherErrors", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(8))));
    public static final C3537l isPro = new C3537l("remoteConfigValueForAcceleration", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(9))));
    public static final C3537l firebase = new C3537l("isAccelerated", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(10))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C14215l c14215l = (C14215l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c14215l.yandex);
        interfaceC14185l.yandex(crashlytics, c14215l.loadAd);
        interfaceC14185l.yandex(amazon, c14215l.crashlytics);
        interfaceC14185l.yandex(purchase, c14215l.amazon);
        interfaceC14185l.yandex(billing, c14215l.purchase);
        interfaceC14185l.yandex(mopub, null);
        interfaceC14185l.yandex(admob, null);
        interfaceC14185l.yandex(subs, null);
        interfaceC14185l.yandex(isPro, null);
        interfaceC14185l.yandex(firebase, null);
    }
}
