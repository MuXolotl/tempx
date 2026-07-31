package defpackage;

/* JADX INFO: renamed from: lؙۛؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6744l implements InterfaceC18528l {
    public static final C6744l yandex = new C6744l();
    public static final C3537l loadAd = C3537l.crashlytics("baseAddress");
    public static final C3537l crashlytics = C3537l.crashlytics("size");
    public static final C3537l amazon = C3537l.crashlytics("name");
    public static final C3537l purchase = C3537l.crashlytics("uuid");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC9956l abstractC9956l = (AbstractC9956l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.mopub(loadAd, ((C0494l) abstractC9956l).yandex);
        C0494l c0494l = (C0494l) abstractC9956l;
        interfaceC14185l.mopub(crashlytics, c0494l.loadAd);
        interfaceC14185l.yandex(amazon, c0494l.crashlytics);
        String str = c0494l.amazon;
        interfaceC14185l.yandex(purchase, str != null ? str.getBytes(AbstractC2236l.yandex) : null);
    }
}
