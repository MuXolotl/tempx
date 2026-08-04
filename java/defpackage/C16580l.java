package defpackage;

/* JADX INFO: renamed from: lٖۗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16580l implements InterfaceC18528l {
    public static final C16580l yandex = new C16580l();
    public static final C3537l loadAd = C3537l.crashlytics("privacyContext");
    public static final C3537l crashlytics = C3537l.crashlytics("productIdOrigin");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C3252l) ((AbstractC12734l) obj)).yandex);
        interfaceC14185l.yandex(crashlytics, EnumC18077l.f35371l);
    }
}
