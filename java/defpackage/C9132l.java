package defpackage;

/* JADX INFO: renamed from: lٌٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9132l implements InterfaceC18528l {
    public static final C9132l yandex = new C9132l();
    public static final C3537l loadAd = C3537l.crashlytics("rolloutId");
    public static final C3537l crashlytics = C3537l.crashlytics("variantId");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC13583l abstractC13583l = (AbstractC13583l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C9895l) abstractC13583l).yandex);
        interfaceC14185l.yandex(crashlytics, ((C9895l) abstractC13583l).loadAd);
    }
}
