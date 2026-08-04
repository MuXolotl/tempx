package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؓۖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2038l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C2038l yandex;

    static {
        C2038l c2038l = new C2038l();
        yandex = c2038l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksItemPersonDto", c2038l, 6);
        c13637l.smaato("description", true);
        c13637l.smaato("id", true);
        c13637l.smaato("legal_notice", true);
        c13637l.smaato("name", true);
        c13637l.smaato("photo", true);
        c13637l.smaato("roles", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C1358l.mopub;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(C1313l.yandex), AbstractC7303l.crashlytics(C0023l.yandex), AbstractC7303l.crashlytics(c0194l), interfaceC1220lArr[4].getValue(), interfaceC1220lArr[5].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C1358l c1358l = (C1358l) obj;
        List list = c1358l.billing;
        List list2 = c1358l.purchase;
        String str = c1358l.amazon;
        C7412l c7412l = c1358l.crashlytics;
        Integer num = c1358l.loadAd;
        String str2 = c1358l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C1358l.mopub;
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || num != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C1313l.yandex, num);
        }
        if (interfaceC0039lCrashlytics.ads() || c7412l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C0023l.yandex, c7412l);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, C0194l.yandex, str);
        }
        boolean zAds = interfaceC0039lCrashlytics.ads();
        C2580l c2580l = C2580l.f5619l;
        if (zAds || !AbstractC8576l.yandex(list2, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), list);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C1358l.mopub;
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        C7412l c7412l = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C0194l.yandex, str);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C1313l.yandex, num);
                    i |= 2;
                    break;
                case 2:
                    c7412l = (C7412l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0023l.yandex, c7412l);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C1358l(i, str, num, c7412l, str2, list, list2);
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
