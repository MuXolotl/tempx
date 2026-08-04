package defpackage;

/* JADX INFO: renamed from: l٘ۧۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18373l implements InterfaceC18528l {
    public static final C18373l yandex = new C18373l();
    public static final C3537l loadAd = C3537l.crashlytics("rolloutVariant");
    public static final C3537l crashlytics = C3537l.crashlytics("parameterKey");
    public static final C3537l amazon = C3537l.crashlytics("parameterValue");
    public static final C3537l purchase = C3537l.crashlytics("templateVersion");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC9375l abstractC9375l = (AbstractC9375l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C12069l) abstractC9375l).yandex);
        C12069l c12069l = (C12069l) abstractC9375l;
        interfaceC14185l.yandex(crashlytics, c12069l.loadAd);
        interfaceC14185l.yandex(amazon, c12069l.crashlytics);
        interfaceC14185l.mopub(purchase, c12069l.amazon);
    }
}
