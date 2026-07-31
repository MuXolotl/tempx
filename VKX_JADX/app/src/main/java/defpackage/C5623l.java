package defpackage;

/* JADX INFO: renamed from: lؘّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5623l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C5623l yandex;

    static {
        C5623l c5623l = new C5623l();
        yandex = c5623l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthCodeAuthDeviceInfoDto", c5623l, 8);
        c13637l.smaato("browser_name", true);
        c13637l.smaato("browser_package", true);
        c13637l.smaato("browser_page_link", true);
        c13637l.smaato("browser_url_scheme", true);
        c13637l.smaato("ip", true);
        c13637l.smaato("location", true);
        c13637l.smaato("location_map", true);
        c13637l.smaato("name", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C10399l c10399l = (C10399l) obj;
        String str = c10399l.admob;
        String str2 = c10399l.mopub;
        String str3 = c10399l.billing;
        String str4 = c10399l.purchase;
        String str5 = c10399l.amazon;
        String str6 = c10399l.crashlytics;
        String str7 = c10399l.loadAd;
        String str8 = c10399l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || str8 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C0194l.yandex, str8);
        }
        if (interfaceC0039lCrashlytics.ads() || str7 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C0194l.yandex, str7);
        }
        if (interfaceC0039lCrashlytics.ads() || str6 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C0194l.yandex, str6);
        }
        if (interfaceC0039lCrashlytics.ads() || str5 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, C0194l.yandex, str5);
        }
        if (interfaceC0039lCrashlytics.ads() || str4 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C0194l.yandex, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || str3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, C0194l.yandex, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 6, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 7, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C0194l.yandex, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C0194l.yandex, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C0194l.yandex, str8);
                    i |= 128;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C10399l(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
