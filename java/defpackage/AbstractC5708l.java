package defpackage;

/* JADX INFO: renamed from: lؘٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5708l {
    public static final C11911l crashlytics;
    public static final InterfaceC6272l loadAd;
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C2759l.class);
        InterfaceC13012l interfaceC13012lYandex2 = null;
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C2759l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        yandex = new C11911l("RoutingFailureStatusCode", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
        loadAd = AbstractC1937l.loadAd("io.ktor.server.routing.Routing");
        InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C17239l.class);
        try {
            interfaceC13012lYandex2 = AbstractC18202l.yandex(C17239l.class);
        } catch (Throwable unused2) {
        }
        crashlytics = new C11911l("RoutingHandler", new C11310l(interfaceC1388lLoadAd2, interfaceC13012lYandex2));
    }

    public static final C14187l yandex(InterfaceC11641l interfaceC11641l) {
        C14187l c14187lYandex;
        if (interfaceC11641l instanceof C0720l) {
            return ((C0720l) interfaceC11641l).f2211l;
        }
        C2234l c2234l = ((C2234l) interfaceC11641l).f4918l;
        if (c2234l != null && (c14187lYandex = yandex(c2234l)) != null) {
            return c14187lYandex;
        }
        C10754l.ads("Cannot retrieve application from unattached routing entry");
        return null;
    }
}
