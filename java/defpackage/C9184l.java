package defpackage;

/* JADX INFO: renamed from: lٌۥۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9184l implements InterfaceC18528l {
    public static final C9184l yandex = new C9184l();
    public static final C3537l loadAd = C3537l.crashlytics("name");
    public static final C3537l crashlytics = C3537l.crashlytics("importance");
    public static final C3537l amazon = C3537l.crashlytics("frames");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC5906l abstractC5906l = (AbstractC5906l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C16498l) abstractC5906l).yandex);
        C16498l c16498l = (C16498l) abstractC5906l;
        interfaceC14185l.purchase(crashlytics, c16498l.loadAd);
        interfaceC14185l.yandex(amazon, c16498l.crashlytics);
    }
}
