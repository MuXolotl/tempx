package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٖۨؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16798l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C16798l yandex;

    static {
        C16798l c16798l = new C16798l();
        yandex = c16798l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.ValidatePhoneResponse", c16798l, 10);
        c13637l.smaato("next_sid", true);
        c13637l.smaato("validation_type", true);
        c13637l.smaato("validation_resend", true);
        c13637l.smaato("delay", true);
        c13637l.smaato("external_id", true);
        c13637l.smaato("phone", true);
        c13637l.smaato("phone_mask", true);
        c13637l.smaato("masked_email", true);
        c13637l.smaato("code_length", true);
        c13637l.smaato("device_name", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C1359l.firebase;
        C0194l c0194l = C0194l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[1].getValue());
        InterfaceC16588l interfaceC16588lCrashlytics3 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[2].getValue());
        InterfaceC16588l interfaceC16588lCrashlytics4 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics5 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics6 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics7 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics8 = AbstractC7303l.crashlytics(c0194l);
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, interfaceC16588lCrashlytics3, c1313l, interfaceC16588lCrashlytics4, interfaceC16588lCrashlytics5, interfaceC16588lCrashlytics6, interfaceC16588lCrashlytics7, c1313l, interfaceC16588lCrashlytics8};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C1359l c1359l = (C1359l) obj;
        String str = c1359l.isPro;
        int i = c1359l.subs;
        String str2 = c1359l.admob;
        String str3 = c1359l.mopub;
        String str4 = c1359l.billing;
        String str5 = c1359l.purchase;
        int i2 = c1359l.amazon;
        EnumC1318l enumC1318l = c1359l.crashlytics;
        EnumC1318l enumC1318l2 = c1359l.loadAd;
        String str6 = c1359l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C1359l.firebase;
        if (interfaceC0039lCrashlytics.ads() || str6 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C0194l.yandex, str6);
        }
        if (interfaceC0039lCrashlytics.ads() || enumC1318l2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC1318l2);
        }
        if (interfaceC0039lCrashlytics.ads() || enumC1318l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC1318l);
        }
        if (interfaceC0039lCrashlytics.ads() || i2 != 120) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(3, i2, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || str5 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C0194l.yandex, str5);
        }
        if (interfaceC0039lCrashlytics.ads() || str4 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, C0194l.yandex, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || str3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 6, C0194l.yandex, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 7, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || i != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(8, i, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 9, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C1359l.firebase;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        EnumC1318l enumC1318l = null;
        EnumC1318l enumC1318l2 = null;
        int iSubscription = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int iSubscription2 = 0;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C0194l.yandex, str3);
                    i |= 1;
                    break;
                case 1:
                    enumC1318l = (EnumC1318l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC1318l);
                    i |= 2;
                    break;
                case 2:
                    enumC1318l2 = (EnumC1318l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC1318l2);
                    i |= 4;
                    break;
                case 3:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C0194l.yandex, str6);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C0194l.yandex, str2);
                    i |= 128;
                    break;
                case 8:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 9, C0194l.yandex, str);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C1359l(i, str3, enumC1318l, enumC1318l2, iSubscription, str4, str5, str6, str2, iSubscription2, str);
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
