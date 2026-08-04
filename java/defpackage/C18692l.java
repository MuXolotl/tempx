package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lۥۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18692l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C18692l yandex;

    static {
        C18692l c18692l = new C18692l();
        yandex = c18692l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetResponseDto", c18692l, 4);
        c13637l.smaato("count", true);
        c13637l.smaato("items", true);
        c13637l.smaato("groups", true);
        c13637l.smaato("profiles", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C4363l.purchase;
        return new InterfaceC16588l[]{C1313l.yandex, interfaceC1220lArr[1].getValue(), interfaceC1220lArr[2].getValue(), interfaceC1220lArr[3].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C4363l c4363l = (C4363l) obj;
        List list = c4363l.amazon;
        List list2 = c4363l.crashlytics;
        List list3 = c4363l.loadAd;
        int i = c4363l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4363l.purchase;
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
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4363l.purchase;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
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
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list3 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list3);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C4363l(i, iSubscription, list, list2, list3);
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
