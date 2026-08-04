package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚْۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13213l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13213l yandex;

    static {
        C13213l c13213l = new C13213l();
        yandex = c13213l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25CBlock", c13213l, 13);
        c13637l.smaato("type", false);
        c13637l.smaato("name", false);
        c13637l.smaato("titles", true);
        c13637l.smaato("subtitles", true);
        c13637l.smaato("photo_urls", true);
        c13637l.smaato("background", true);
        c13637l.smaato("is_visible", false);
        c13637l.smaato("order", false);
        c13637l.smaato("is_sharing_enabled", true);
        c13637l.smaato("audio_preview_url", true);
        c13637l.smaato("metrics", true);
        c13637l.smaato("color_type", true);
        c13637l.smaato("playlist", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C6001l.vip;
        C0194l c0194l = C0194l.yandex;
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{interfaceC1220lArr[0].getValue(), c0194l, interfaceC1220lArr[2].getValue(), interfaceC1220lArr[3].getValue(), interfaceC1220lArr[4].getValue(), AbstractC7303l.crashlytics(C12850l.yandex), c2796l, C1313l.yandex, c2796l, c0194l, interfaceC1220lArr[10].getValue(), interfaceC1220lArr[11].getValue(), AbstractC7303l.crashlytics(C4484l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C6001l c6001l = (C6001l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6001l.vip;
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) interfaceC1220lArr[0].getValue();
        EnumC2546l enumC2546l = c6001l.yandex;
        C15506l c15506l = c6001l.remoteconfig;
        EnumC18350l enumC18350l = c6001l.smaato;
        List list = c6001l.firebase;
        String str = c6001l.isPro;
        boolean z = c6001l.subs;
        C5576l c5576l = c6001l.billing;
        List list2 = c6001l.purchase;
        List list3 = c6001l.amazon;
        List list4 = c6001l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, interfaceC16588l, enumC2546l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c6001l.loadAd);
        boolean zAds = abstractC4072l.ads();
        C2580l c2580l = C2580l.f5619l;
        if (zAds || !AbstractC8576l.yandex(list4, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list4);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(list3, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list3);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(list2, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list2);
        }
        if (abstractC4072l.ads() || c5576l != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C12850l.yandex, c5576l);
        }
        abstractC4072l.ad(interfaceC18035l, 6, c6001l.mopub);
        abstractC4072l.signatures(7, c6001l.admob, interfaceC18035l);
        if (abstractC4072l.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 8, z);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 9, str);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(list, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 10, (InterfaceC16588l) interfaceC1220lArr[10].getValue(), list);
        }
        if (abstractC4072l.ads() || enumC18350l != EnumC18350l.f35864l) {
            abstractC4072l.applovin(interfaceC18035l, 11, (InterfaceC16588l) interfaceC1220lArr[11].getValue(), enumC18350l);
        }
        if (abstractC4072l.ads() || c15506l != null) {
            abstractC4072l.startapp(interfaceC18035l, 12, C4484l.yandex, c15506l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC1220l[] interfaceC1220lArr;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr2 = C6001l.vip;
        C15506l c15506l = null;
        EnumC18350l enumC18350l = null;
        boolean z = true;
        List list = null;
        int i = 0;
        EnumC2546l enumC2546l = null;
        String strRemoteconfig = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        C5576l c5576l = null;
        boolean zIsVip = false;
        int iSubscription = 0;
        boolean zIsVip2 = false;
        String strRemoteconfig2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    z = false;
                    break;
                case 0:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    enumC2546l = (EnumC2546l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC2546l);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    list3 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    list4 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list4);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    c5576l = (C5576l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C12850l.yandex, c5576l);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 6);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 7);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    zIsVip2 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 9);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                case 10:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 10, (InterfaceC16588l) interfaceC1220lArr[10].getValue(), list);
                    i |= 1024;
                    break;
                case 11:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    enumC18350l = (EnumC18350l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 11, (InterfaceC16588l) interfaceC1220lArr[11].getValue(), enumC18350l);
                    i |= 2048;
                    break;
                case 12:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    c15506l = (C15506l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 12, C4484l.yandex, c15506l);
                    i |= 4096;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
            interfaceC1220lArr2 = interfaceC1220lArr;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C6001l(i, enumC2546l, strRemoteconfig, list2, list3, list4, c5576l, zIsVip, iSubscription, zIsVip2, strRemoteconfig2, list, enumC18350l, c15506l);
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
