package defpackage;

/* JADX INFO: renamed from: lّ۟ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12883l implements InterfaceC18528l {
    public static final C12883l yandex = new C12883l();
    public static final C3537l loadAd = new C3537l("imageFormat", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("originalImageSize", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("compressedImageSize", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l purchase = new C3537l("isOdmlImage", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C8273l c8273l = (C8273l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c8273l.yandex);
        interfaceC14185l.yandex(crashlytics, c8273l.loadAd);
        interfaceC14185l.yandex(amazon, null);
        interfaceC14185l.yandex(purchase, null);
    }
}
