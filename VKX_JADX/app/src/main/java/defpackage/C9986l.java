package defpackage;

/* JADX INFO: renamed from: lٍۨۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9986l implements InterfaceC18528l {
    public static final C9986l yandex = new C9986l();
    public static final C3537l loadAd = C3537l.crashlytics("arch");
    public static final C3537l crashlytics = C3537l.crashlytics("libraryName");
    public static final C3537l amazon = C3537l.crashlytics("buildId");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC0724l abstractC0724l = (AbstractC0724l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C13365l) abstractC0724l).yandex);
        C13365l c13365l = (C13365l) abstractC0724l;
        interfaceC14185l.yandex(crashlytics, c13365l.loadAd);
        interfaceC14185l.yandex(amazon, c13365l.crashlytics);
    }
}
