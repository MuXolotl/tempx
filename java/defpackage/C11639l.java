package defpackage;

/* JADX INFO: renamed from: lِؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11639l implements InterfaceC18528l {
    public static final C11639l yandex = new C11639l();
    public static final C3537l loadAd = new C3537l("currentCacheSizeBytes", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(1))));
    public static final C3537l crashlytics = new C3537l("maxCacheSizeBytes", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(2))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C5677l c5677l = (C5677l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.mopub(loadAd, c5677l.yandex);
        interfaceC14185l.mopub(crashlytics, c5677l.loadAd);
    }
}
