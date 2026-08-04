package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًٌۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7879l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C7879l yandex;

    static {
        C7879l c7879l = new C7879l();
        yandex = c7879l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.media.MediaPopupDto", c7879l, 9);
        c13637l.smaato("title", false);
        c13637l.smaato("id", true);
        c13637l.smaato("button", true);
        c13637l.smaato("buttons", true);
        c13637l.smaato("icons", true);
        c13637l.smaato("music_subscription_event", true);
        c13637l.smaato("text", true);
        c13637l.smaato("image_mode", true);
        c13637l.smaato("emoji_icons", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C17830l.isPro;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(C10250l.yandex), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[3].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[4].getValue()), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[7].getValue()), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C17830l c17830l = (C17830l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C17830l.isPro;
        String str = c17830l.yandex;
        String str2 = c17830l.subs;
        EnumC6811l enumC6811l = c17830l.admob;
        String str3 = c17830l.mopub;
        String str4 = c17830l.billing;
        List list = c17830l.purchase;
        List list2 = c17830l.amazon;
        C13748l c13748l = c17830l.crashlytics;
        String str5 = c17830l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        if (abstractC4072l.ads() || str5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, C0194l.yandex, str5);
        }
        if (abstractC4072l.ads() || c13748l != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C10250l.yandex, c13748l);
        }
        if (abstractC4072l.ads() || list2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list2);
        }
        if (abstractC4072l.ads() || list != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list);
        }
        if (abstractC4072l.ads() || str4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C0194l.yandex, str4);
        }
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || enumC6811l != null) {
            abstractC4072l.startapp(interfaceC18035l, 7, (InterfaceC16588l) interfaceC1220lArr[7].getValue(), enumC6811l);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 8, C0194l.yandex, str2);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C17830l.isPro;
        String str = null;
        boolean z = true;
        EnumC6811l enumC6811l = null;
        int i = 0;
        String strRemoteconfig = null;
        String str2 = null;
        C13748l c13748l = null;
        List list = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
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
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str2);
                    i |= 2;
                    break;
                case 2:
                    c13748l = (C13748l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C10250l.yandex, c13748l);
                    i |= 4;
                    break;
                case 3:
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C0194l.yandex, str4);
                    i |= 64;
                    break;
                case 7:
                    enumC6811l = (EnumC6811l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, (InterfaceC16588l) interfaceC1220lArr[7].getValue(), enumC6811l);
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
        return new C17830l(i, strRemoteconfig, str2, c13748l, list, list2, str3, str4, enumC6811l, str);
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
