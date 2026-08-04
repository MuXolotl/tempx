package defpackage;

/* JADX INFO: renamed from: lٕ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15982l implements InterfaceC18528l {
    public static final C15982l yandex = new C15982l();
    public static final C3537l loadAd = new C3537l("window", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(1))));
    public static final C3537l crashlytics = new C3537l("logSourceMetrics", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(2))));
    public static final C3537l amazon = new C3537l("globalMetrics", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(3))));
    public static final C3537l purchase = new C3537l("appNamespace", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(4))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C8724l c8724l = (C8724l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c8724l.yandex);
        interfaceC14185l.yandex(crashlytics, c8724l.loadAd);
        interfaceC14185l.yandex(amazon, c8724l.crashlytics);
        interfaceC14185l.yandex(purchase, c8724l.amazon);
    }
}
