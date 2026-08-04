package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚۣۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7609l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C7609l yandex;

    static {
        C7609l c7609l = new C7609l();
        yandex = c7609l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetPlaylistsResponseDto", c7609l, 5);
        c13637l.smaato("count", true);
        c13637l.smaato("items", true);
        c13637l.smaato("groups", true);
        c13637l.smaato("profiles", true);
        c13637l.smaato("next_from", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C18292l.billing;
        return new InterfaceC16588l[]{C1313l.yandex, interfaceC1220lArr[1].getValue(), interfaceC1220lArr[2].getValue(), interfaceC1220lArr[3].getValue(), AbstractC7303l.crashlytics(C0194l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C18292l c18292l = (C18292l) obj;
        String str = c18292l.purchase;
        List list = c18292l.amazon;
        List list2 = c18292l.crashlytics;
        List list3 = c18292l.loadAd;
        int i = c18292l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C18292l.billing;
        if (interfaceC0039lCrashlytics.ads() || i != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(0, i, interfaceC18035l);
        }
        boolean zAds = interfaceC0039lCrashlytics.ads();
        C2580l c2580l = C2580l.f5619l;
        if (zAds || !AbstractC8576l.yandex(list3, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), list3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list2, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, c2580l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C18292l.billing;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), list);
                i |= 2;
            } else if (iAdmob == 2) {
                list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list2);
                i |= 4;
            } else if (iAdmob == 3) {
                list3 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list3);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C18292l(i, iSubscription, list, list2, list3, str);
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
