package defpackage;

/* JADX INFO: renamed from: lٜٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4255l implements InterfaceC18528l {
    public static final C4255l yandex = new C4255l();
    public static final C3537l loadAd = C3537l.crashlytics("processName");
    public static final C3537l crashlytics = C3537l.crashlytics("pid");
    public static final C3537l amazon = C3537l.crashlytics("importance");
    public static final C3537l purchase = C3537l.crashlytics("defaultProcess");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC1431l abstractC1431l = (AbstractC1431l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C4702l) abstractC1431l).yandex);
        C4702l c4702l = (C4702l) abstractC1431l;
        interfaceC14185l.purchase(crashlytics, c4702l.loadAd);
        interfaceC14185l.purchase(amazon, c4702l.crashlytics);
        interfaceC14185l.amazon(purchase, c4702l.amazon);
    }
}
