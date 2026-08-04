package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌٜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0202l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C0202l yandex;

    static {
        C0202l c0202l = new C0202l();
        yandex = c0202l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.ecosystem.EcosystemCheckOtpResponseDto", c0202l, 9);
        c13637l.smaato("sid", false);
        c13637l.smaato("profile_exist", false);
        c13637l.smaato("profile", true);
        c13637l.smaato("can_skip_password", true);
        c13637l.smaato("next_step", true);
        c13637l.smaato("signup_restriction_reason", true);
        c13637l.smaato("signup_fields", true);
        c13637l.smaato("signup_fields_values", true);
        c13637l.smaato("signup_params", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C5984l.isPro;
        C0194l c0194l = C0194l.yandex;
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{c0194l, c2796l, AbstractC7303l.crashlytics(C0942l.yandex), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[4].getValue()), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[6].getValue()), AbstractC7303l.crashlytics(C3406l.yandex), AbstractC7303l.crashlytics(C11929l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C5984l c5984l = (C5984l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C5984l.isPro;
        String str = c5984l.yandex;
        C13414l c13414l = c5984l.subs;
        C17533l c17533l = c5984l.admob;
        List list = c5984l.mopub;
        String str2 = c5984l.billing;
        EnumC10104l enumC10104l = c5984l.purchase;
        Boolean bool = c5984l.amazon;
        C8768l c8768l = c5984l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        abstractC4072l.ad(interfaceC18035l, 1, c5984l.loadAd);
        if (abstractC4072l.ads() || c8768l != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0942l.yandex, c8768l);
        }
        if (abstractC4072l.ads() || bool != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C2796l.yandex, bool);
        }
        if (abstractC4072l.ads() || enumC10104l != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), enumC10104l);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || list != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list);
        }
        if (abstractC4072l.ads() || c17533l != null) {
            abstractC4072l.startapp(interfaceC18035l, 7, C3406l.yandex, c17533l);
        }
        if (abstractC4072l.ads() || c13414l != null) {
            abstractC4072l.startapp(interfaceC18035l, 8, C11929l.yandex, c13414l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C5984l.isPro;
        C13414l c13414l = null;
        boolean z = true;
        C17533l c17533l = null;
        int i = 0;
        String strRemoteconfig = null;
        boolean zIsVip = false;
        C8768l c8768l = null;
        Boolean bool = null;
        EnumC10104l enumC10104l = null;
        String str = null;
        List list = null;
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
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    c8768l = (C8768l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0942l.yandex, c8768l);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C2796l.yandex, bool);
                    i |= 8;
                    break;
                case 4:
                    enumC10104l = (EnumC10104l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), enumC10104l);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str);
                    i |= 32;
                    break;
                case 6:
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    c17533l = (C17533l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C3406l.yandex, c17533l);
                    i |= 128;
                    break;
                case 8:
                    c13414l = (C13414l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C11929l.yandex, c13414l);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C5984l(i, strRemoteconfig, zIsVip, c8768l, bool, enumC10104l, str, list, c17533l, c13414l);
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
