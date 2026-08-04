package defpackage;

/* JADX INFO: renamed from: lۦَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18699l implements InterfaceC18528l {
    public static final C18699l yandex = new C18699l();
    public static final C3537l loadAd = C3537l.crashlytics("key");
    public static final C3537l crashlytics = C3537l.crashlytics("value");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC12911l abstractC12911l = (AbstractC12911l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C15474l) abstractC12911l).yandex);
        interfaceC14185l.yandex(crashlytics, ((C15474l) abstractC12911l).loadAd);
    }
}
