package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؒۙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1292l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C1292l yandex;

    static {
        C1292l c1292l = new C1292l();
        yandex = c1292l;
        C13637l c13637l = new C13637l("vps_stream_mix", c1292l, 6);
        c13637l.smaato("mixId", false);
        c13637l.smaato("mixEntityId", true);
        c13637l.smaato("options", true);
        c13637l.smaato("displayName", true);
        c13637l.smaato("isAppend", true);
        c13637l.smaato("id", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C3086l.mopub;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, AbstractC7303l.crashlytics(c0194l), interfaceC1220lArr[2].getValue(), c0194l, C2796l.yandex, c0194l};
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C3086l c3086l = (C3086l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C3086l.mopub;
        String str = c3086l.yandex;
        String str2 = c3086l.billing;
        String str3 = c3086l.amazon;
        Map map = c3086l.crashlytics;
        String str4 = c3086l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        if (abstractC4072l.ads() || str4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, C0194l.yandex, str4);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(map, C14054l.f27396l)) {
            abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), map);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str3, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 3, str3);
        }
        if (abstractC4072l.ads() || c3086l.purchase) {
            abstractC4072l.ad(interfaceC18035l, 4, c3086l.purchase);
        }
        if (abstractC4072l.ads()) {
            abstractC4072l.appmetrica(interfaceC18035l, 5, str2);
        } else {
            if (!AbstractC8576l.yandex(str2, "vk_mix_" + str + '_' + str4 + '_' + AbstractC16901l.m4210case(map.entrySet(), null, null, null, new C10949l(26), 31))) {
                abstractC4072l.appmetrica(interfaceC18035l, 5, str2);
            }
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C3086l.mopub;
        boolean z = true;
        int i = 0;
        boolean zIsVip = false;
        String strRemoteconfig = null;
        String str = null;
        Map map = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str);
                    i |= 2;
                    break;
                case 2:
                    map = (Map) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 5);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C3086l(i, strRemoteconfig, str, map, strRemoteconfig2, zIsVip, strRemoteconfig3);
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
