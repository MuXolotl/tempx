package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lِْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13308l {
    public static final C11911l crashlytics;
    public static final C13975l loadAd = new C13975l(3);
    public final ArrayList yandex = new ArrayList();

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C13308l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C13308l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        crashlytics = new C11911l("HttpSend", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }
}
