package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2459l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C2459l yandex;

    static {
        C2459l c2459l = new C2459l();
        yandex = c2459l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAnnualResultBlockDto.Value", c2459l, 7);
        c13637l.smaato("title", true);
        c13637l.smaato("subtitle", true);
        c13637l.smaato("caption", true);
        c13637l.smaato("name", true);
        c13637l.smaato("value", true);
        c13637l.smaato("photo_url", true);
        c13637l.smaato("photo_urls", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C15375l.admob;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, c0194l, c0194l, c0194l, c0194l, interfaceC1220lArr[6].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C15375l c15375l = (C15375l) obj;
        List list = c15375l.mopub;
        String str = c15375l.billing;
        String str2 = c15375l.purchase;
        String str3 = c15375l.amazon;
        String str4 = c15375l.crashlytics;
        String str5 = c15375l.loadAd;
        String str6 = c15375l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C15375l.admob;
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str6, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 0, str6);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str5, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 1, str5);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str4, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 2, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str3, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 3, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str2, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 4, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 5, str);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, C2580l.f5619l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C15375l.admob;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        String strRemoteconfig4 = null;
        String strRemoteconfig5 = null;
        String strRemoteconfig6 = null;
        List list = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig4 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    strRemoteconfig5 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    strRemoteconfig6 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C15375l(i, strRemoteconfig, strRemoteconfig2, strRemoteconfig3, strRemoteconfig4, strRemoteconfig5, strRemoteconfig6, list);
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
