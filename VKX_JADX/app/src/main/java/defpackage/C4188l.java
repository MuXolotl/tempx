package defpackage;

/* JADX INFO: renamed from: lُؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4188l implements InterfaceC18528l {
    public static final C4188l yandex = new C4188l();
    public static final C3537l loadAd = C3537l.crashlytics("filename");
    public static final C3537l crashlytics = C3537l.crashlytics("contents");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC6291l abstractC6291l = (AbstractC6291l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C10090l) abstractC6291l).yandex);
        interfaceC14185l.yandex(crashlytics, ((C10090l) abstractC6291l).loadAd);
    }
}
