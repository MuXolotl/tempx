package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؚ۠ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7560l extends AbstractC4416l {
    public static final C3797l firebase = new C3797l("ClientNotification.API", new C5795l(3), new C14823l(24));
    public static final C3797l smaato = new C3797l("ClientTelemetry.API", new C5795l(4), new C14823l(24));
    public static final C3797l remoteconfig = new C3797l("ModuleInstall.API", new C5795l(2), new C14823l(24));
    public static final C3797l vip = new C3797l("CastApi.API", new C5795l(7), new C14823l(24));

    public C3823l admob(String[] strArr) {
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.yandex = new C0848l(this, strArr, 10);
        c10147lYandex.amazon = new C9138l[]{AbstractC13106l.crashlytics};
        c10147lYandex.crashlytics = true;
        c10147lYandex.loadAd = false;
        c10147lYandex.purchase = 8425;
        return purchase(0, c10147lYandex.yandex());
    }

    public C3823l billing(InterfaceC10959l... interfaceC10959lArr) {
        int i = 1;
        AbstractC1051l.crashlytics(interfaceC10959lArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (InterfaceC10959l interfaceC10959l : interfaceC10959lArr) {
            AbstractC1051l.isPro(interfaceC10959l, "Requested API must not be null.");
        }
        C7794l c7794lBilling = C7794l.billing(Arrays.asList(interfaceC10959lArr), false);
        if (c7794lBilling.f16319l.isEmpty()) {
            return AbstractC4311l.mopub(new C5156l(true, 0));
        }
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.amazon = new C9138l[]{AbstractC4927l.yandex};
        c10147lYandex.purchase = 27301;
        c10147lYandex.crashlytics = true;
        c10147lYandex.loadAd = false;
        c10147lYandex.yandex = new C17516l(this, c7794lBilling, i);
        return purchase(0, c10147lYandex.yandex());
    }

    public C3823l mopub(C12798l c12798l) {
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.amazon = new C9138l[]{AbstractC6689l.loadAd};
        c10147lYandex.crashlytics = true;
        c10147lYandex.loadAd = false;
        c10147lYandex.yandex = new C2290l(c12798l);
        return purchase(2, c10147lYandex.yandex());
    }
}
