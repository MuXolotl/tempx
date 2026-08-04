package defpackage;

/* JADX INFO: renamed from: lِۧٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12262l implements InterfaceC18528l {
    public static final C12262l yandex = new C12262l();
    public static final C3537l loadAd = C3537l.crashlytics("clientType");
    public static final C3537l crashlytics = C3537l.crashlytics("androidClientInfo");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC0436l abstractC0436l = (AbstractC0436l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        ((C4511l) abstractC0436l).getClass();
        interfaceC14185l.yandex(loadAd, EnumC1941l.f4418l);
        interfaceC14185l.yandex(crashlytics, ((C4511l) abstractC0436l).yandex);
    }
}
