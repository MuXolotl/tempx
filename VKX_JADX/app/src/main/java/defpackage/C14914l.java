package defpackage;

/* JADX INFO: renamed from: lٕٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14914l implements InterfaceC18528l {
    public static final C14914l yandex = new C14914l();
    public static final C3537l loadAd = new C3537l("logEventKey", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("eventCount", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("inferenceDurationStats", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C17342l c17342l = (C17342l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c17342l.yandex);
        interfaceC14185l.yandex(crashlytics, c17342l.loadAd);
        interfaceC14185l.yandex(amazon, c17342l.crashlytics);
    }
}
