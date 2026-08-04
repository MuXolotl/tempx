package defpackage;

/* JADX INFO: renamed from: lؓٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1839l implements InterfaceC18528l {
    public static final C1839l yandex = new C1839l();
    public static final C3537l loadAd = C3537l.crashlytics("networkType");
    public static final C3537l crashlytics = C3537l.crashlytics("mobileSubtype");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC9941l abstractC9941l = (AbstractC9941l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C12088l) abstractC9941l).yandex);
        interfaceC14185l.yandex(crashlytics, ((C12088l) abstractC9941l).loadAd);
    }
}
