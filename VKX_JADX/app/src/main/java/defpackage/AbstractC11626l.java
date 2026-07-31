package defpackage;

/* JADX INFO: renamed from: lُِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11626l {
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C11310l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C11310l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        yandex = new C11911l("ReceiveType", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    public static final C11310l yandex(InterfaceC18636l interfaceC18636l) {
        return (C11310l) interfaceC18636l.getAttributes().crashlytics(yandex);
    }
}
