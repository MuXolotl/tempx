package defpackage;

/* JADX INFO: renamed from: lْؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1285l {
    public static final C11911l loadAd;
    public static final C0499l yandex = new C0499l("call-context");

    static {
        InterfaceC13012l interfaceC13012lLoadAd;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C16990l.class);
        try {
            interfaceC13012lLoadAd = AbstractC18202l.loadAd(C16990l.class, C0861l.crashlytics);
        } catch (Throwable unused) {
            interfaceC13012lLoadAd = null;
        }
        loadAd = new C11911l("client-config", new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd));
    }
}
