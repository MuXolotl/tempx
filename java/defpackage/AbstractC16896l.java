package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lۣٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16896l {
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Unit.class);
        InterfaceC13012l interfaceC13012lYandex2 = null;
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(Unit.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        yandex = new C11911l("IgnoreTrailingSlashAttributeKey", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
        InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C7472l.class);
        try {
            interfaceC13012lYandex2 = AbstractC18202l.yandex(C7472l.class);
        } catch (Throwable unused2) {
        }
        new C11911l("IgnoreTrailingSlash", new C11310l(interfaceC1388lLoadAd2, interfaceC13012lYandex2));
    }
}
