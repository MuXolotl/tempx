package defpackage;

/* JADX INFO: renamed from: lؘؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5715l {
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0516l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C0516l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        yandex = new C11911l("MutableOriginConnectionPointKey", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    public static final InterfaceC16746l yandex(InterfaceC14280l interfaceC14280l) {
        if (interfaceC14280l.crashlytics().getAttributes().billing(yandex) == null) {
            return interfaceC14280l.subs();
        }
        C18725l.loadAd();
        return null;
    }
}
