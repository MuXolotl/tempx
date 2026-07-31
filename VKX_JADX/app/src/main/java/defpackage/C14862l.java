package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14862l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C14862l yandex;

    static {
        C14862l c14862l = new C14862l();
        yandex = c14862l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.internal.VkErrorDetails", c14862l, 9);
        c13637l.smaato("error_code", false);
        c13637l.smaato("error_msg", false);
        c13637l.smaato("request_params", true);
        c13637l.smaato("captcha_img", true);
        c13637l.smaato("captcha_sid", true);
        c13637l.smaato("captcha_ratio", true);
        c13637l.smaato("captcha_ts", true);
        c13637l.smaato("captcha_attempt", true);
        c13637l.smaato("redirect_uri", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C4513l.isPro;
        C1313l c1313l = C1313l.yandex;
        C0194l c0194l = C0194l.yandex;
        C7872l c7872l = C7872l.yandex;
        return new InterfaceC16588l[]{c1313l, c0194l, interfaceC1220lArr[2].getValue(), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c7872l), AbstractC7303l.crashlytics(c7872l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C4513l c4513l = (C4513l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4513l.isPro;
        int i = c4513l.yandex;
        String str = c4513l.subs;
        Integer num = c4513l.admob;
        Double d = c4513l.mopub;
        Double d2 = c4513l.billing;
        String str2 = c4513l.purchase;
        String str3 = c4513l.amazon;
        List list = c4513l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c4513l.loadAd);
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(list, C2580l.f5619l)) {
            abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
        }
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || d2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C7872l.yandex, d2);
        }
        if (abstractC4072l.ads() || d != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C7872l.yandex, d);
        }
        if (abstractC4072l.ads() || num != null) {
            abstractC4072l.startapp(interfaceC18035l, 7, C1313l.yandex, num);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 8, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C4513l.isPro;
        String str = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        int iSubscription = 0;
        String strRemoteconfig = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        Double d2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str3);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C7872l.yandex, d);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C7872l.yandex, d2);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C1313l.yandex, num);
                    i |= 128;
                    break;
                case 8:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C0194l.yandex, str);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C4513l(i, iSubscription, strRemoteconfig, list, str2, str3, d, d2, num, str);
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
