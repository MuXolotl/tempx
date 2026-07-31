package defpackage;

/* JADX INFO: renamed from: l٘ؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17631l implements InterfaceC18528l {
    public static final C17631l yandex = new C17631l();
    public static final C3537l loadAd = C3537l.crashlytics("clearBlob");
    public static final C3537l crashlytics = C3537l.crashlytics("encryptedBlob");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC11217l abstractC11217l = (AbstractC11217l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C12281l) abstractC11217l).yandex);
        interfaceC14185l.yandex(crashlytics, ((C12281l) abstractC11217l).loadAd);
    }
}
