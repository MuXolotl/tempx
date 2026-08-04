package defpackage;

/* JADX INFO: renamed from: lٕۙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15914l implements InterfaceC18528l {
    public static final C15914l yandex = new C15914l();
    public static final C3537l loadAd = C3537l.crashlytics("timestamp");
    public static final C3537l crashlytics = C3537l.crashlytics("type");
    public static final C3537l amazon = C3537l.crashlytics("app");
    public static final C3537l purchase = C3537l.crashlytics("device");
    public static final C3537l billing = C3537l.crashlytics("log");
    public static final C3537l mopub = C3537l.crashlytics("rollouts");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC2883l abstractC2883l = (AbstractC2883l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.mopub(loadAd, ((C17358l) abstractC2883l).yandex);
        C17358l c17358l = (C17358l) abstractC2883l;
        interfaceC14185l.yandex(crashlytics, c17358l.loadAd);
        interfaceC14185l.yandex(amazon, c17358l.crashlytics);
        interfaceC14185l.yandex(purchase, c17358l.amazon);
        interfaceC14185l.yandex(billing, c17358l.purchase);
        interfaceC14185l.yandex(mopub, c17358l.billing);
    }
}
