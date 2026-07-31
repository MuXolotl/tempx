package defpackage;

/* JADX INFO: renamed from: lٍؙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9236l implements InterfaceC18528l {
    public static final C9236l yandex = new C9236l();
    public static final C3537l loadAd = C3537l.crashlytics("files");
    public static final C3537l crashlytics = C3537l.crashlytics("orgId");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC2869l abstractC2869l = (AbstractC2869l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C8638l) abstractC2869l).yandex);
        interfaceC14185l.yandex(crashlytics, ((C8638l) abstractC2869l).loadAd);
    }
}
