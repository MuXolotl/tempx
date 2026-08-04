package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10496l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10496l yandex;

    static {
        C10496l c10496l = new C10496l();
        yandex = c10496l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthUserExchangeTokenDto", c10496l, 4);
        c13637l.smaato("user_id", false);
        c13637l.smaato("profile_type", true);
        c13637l.smaato("common_token", true);
        c13637l.smaato("tier_tokens", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C5682l.purchase;
        return new InterfaceC16588l[]{C11363l.yandex, AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[1].getValue()), AbstractC7303l.crashlytics(C0194l.yandex), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[3].getValue())};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C5682l c5682l = (C5682l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C5682l.purchase;
        C11363l c11363l = C11363l.yandex;
        long j = c5682l.yandex;
        List list = c5682l.amazon;
        String str = c5682l.crashlytics;
        EnumC8858l enumC8858l = c5682l.loadAd;
        C10877l c10877l = new C10877l(j);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, c11363l, c10877l);
        if (abstractC4072l.ads() || enumC8858l != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC8858l);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0194l.yandex, str);
        }
        if (abstractC4072l.ads() || list != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C5682l.purchase;
        boolean z = true;
        int i = 0;
        C10877l c10877l = null;
        EnumC8858l enumC8858l = null;
        String str = null;
        List list = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                c10877l = (C10877l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C11363l.yandex, c10877l);
                i |= 1;
            } else if (iAdmob == 1) {
                enumC8858l = (EnumC8858l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC8858l);
                i |= 2;
            } else if (iAdmob == 2) {
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C5682l(i, c10877l, enumC8858l, str, list);
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
