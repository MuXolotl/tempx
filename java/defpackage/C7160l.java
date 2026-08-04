package defpackage;

/* JADX INFO: renamed from: lٍؚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7160l implements InterfaceC18528l {
    public static final C7160l yandex = new C7160l();
    public static final C3537l loadAd = new C3537l("logSource", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(1))));
    public static final C3537l crashlytics = new C3537l("logEventDropped", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(2))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C9291l c9291l = (C9291l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c9291l.yandex);
        interfaceC14185l.yandex(crashlytics, c9291l.loadAd);
    }
}
