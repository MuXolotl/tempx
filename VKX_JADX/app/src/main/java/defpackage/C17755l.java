package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17755l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C17755l yandex;

    static {
        C17755l c17755l = new C17755l();
        yandex = c17755l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountResponseDto", c17755l, 10);
        c13637l.smaato("is_phone", true);
        c13637l.smaato("is_email", true);
        c13637l.smaato("flow_name", true);
        c13637l.smaato("flow_names", true);
        c13637l.smaato("ads", true);
        c13637l.smaato("sid", true);
        c13637l.smaato("pass_sid", true);
        c13637l.smaato("login", true);
        c13637l.smaato("next_step", true);
        c13637l.smaato("remember_hash", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C8366l.firebase;
        C2796l c2796l = C2796l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c2796l);
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(c2796l);
        InterfaceC16588l interfaceC16588lCrashlytics3 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[2].getValue());
        InterfaceC16588l interfaceC16588lCrashlytics4 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[3].getValue());
        InterfaceC16588l interfaceC16588lCrashlytics5 = AbstractC7303l.crashlytics(c2796l);
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, interfaceC16588lCrashlytics3, interfaceC16588lCrashlytics4, interfaceC16588lCrashlytics5, AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(C17877l.yandex), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C8366l c8366l = (C8366l) obj;
        String str = c8366l.isPro;
        C8487l c8487l = c8366l.subs;
        String str2 = c8366l.admob;
        Boolean bool = c8366l.mopub;
        String str3 = c8366l.billing;
        Boolean bool2 = c8366l.purchase;
        List list = c8366l.amazon;
        EnumC14924l enumC14924l = c8366l.crashlytics;
        Boolean bool3 = c8366l.loadAd;
        Boolean bool4 = c8366l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C8366l.firebase;
        if (interfaceC0039lCrashlytics.ads() || bool4 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C2796l.yandex, bool4);
        }
        if (interfaceC0039lCrashlytics.ads() || bool3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C2796l.yandex, bool3);
        }
        if (interfaceC0039lCrashlytics.ads() || enumC14924l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC14924l);
        }
        if (interfaceC0039lCrashlytics.ads() || list != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || bool2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C2796l.yandex, bool2);
        }
        if (interfaceC0039lCrashlytics.ads() || str3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, C0194l.yandex, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || bool != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 6, C2796l.yandex, bool);
        }
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 7, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || c8487l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 8, C17877l.yandex, c8487l);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 9, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC1220l[] interfaceC1220lArr;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr2 = C8366l.firebase;
        String str = null;
        C8487l c8487l = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        EnumC14924l enumC14924l = null;
        List list = null;
        Boolean bool3 = null;
        String str3 = null;
        Boolean bool4 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C2796l.yandex, bool);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    bool2 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C2796l.yandex, bool2);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    enumC14924l = (EnumC14924l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC14924l);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    bool3 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C2796l.yandex, bool3);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str3);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    bool4 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C2796l.yandex, bool4);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C0194l.yandex, str2);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    c8487l = (C8487l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C17877l.yandex, c8487l);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 9, C0194l.yandex, str);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
            interfaceC1220lArr2 = interfaceC1220lArr;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C8366l(i, bool, bool2, enumC14924l, list, bool3, str3, bool4, str2, c8487l, str);
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
