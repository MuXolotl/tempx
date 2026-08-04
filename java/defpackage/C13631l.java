package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْۚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13631l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13631l yandex;

    static {
        C13631l c13631l = new C13631l();
        yandex = c13631l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPhotoDto", c13631l, 11);
        c13637l.smaato("width", false);
        c13637l.smaato("height", false);
        c13637l.smaato("id", true);
        c13637l.smaato("photo_34", true);
        c13637l.smaato("photo_68", true);
        c13637l.smaato("photo_135", true);
        c13637l.smaato("photo_270", true);
        c13637l.smaato("photo_300", true);
        c13637l.smaato("photo_600", true);
        c13637l.smaato("photo_1200", true);
        c13637l.smaato("sizes", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C8206l.smaato;
        C0194l c0194l = C0194l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics3 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics4 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics5 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics6 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics7 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics8 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics9 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[10].getValue());
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c1313l, c1313l, interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, interfaceC16588lCrashlytics3, interfaceC16588lCrashlytics4, interfaceC16588lCrashlytics5, interfaceC16588lCrashlytics6, interfaceC16588lCrashlytics7, interfaceC16588lCrashlytics8, interfaceC16588lCrashlytics9};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C8206l c8206l = (C8206l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C8206l.smaato;
        int i = c8206l.yandex;
        List list = c8206l.firebase;
        String str = c8206l.isPro;
        String str2 = c8206l.subs;
        String str3 = c8206l.admob;
        String str4 = c8206l.mopub;
        String str5 = c8206l.billing;
        String str6 = c8206l.purchase;
        String str7 = c8206l.amazon;
        String str8 = c8206l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.signatures(1, c8206l.loadAd, interfaceC18035l);
        if (abstractC4072l.ads() || str8 != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0194l.yandex, str8);
        }
        if (abstractC4072l.ads() || str7 != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C0194l.yandex, str7);
        }
        if (abstractC4072l.ads() || str6 != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C0194l.yandex, str6);
        }
        if (abstractC4072l.ads() || str5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C0194l.yandex, str5);
        }
        if (abstractC4072l.ads() || str4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C0194l.yandex, str4);
        }
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 7, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 8, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 9, C0194l.yandex, str);
        }
        if (abstractC4072l.ads() || list != null) {
            abstractC4072l.startapp(interfaceC18035l, 10, (InterfaceC16588l) interfaceC1220lArr[10].getValue(), list);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC1220l[] interfaceC1220lArr;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr2 = C8206l.smaato;
        List list = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                    i |= 2;
                    interfaceC1220lArr2 = interfaceC1220lArr2;
                    continue;
                case 2:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str4);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str5 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str5);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str6 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str6);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str7 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str7);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str8 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C0194l.yandex, str8);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C0194l.yandex, str3);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C0194l.yandex, str2);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 9, C0194l.yandex, str);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                case 10:
                    interfaceC1220lArr = interfaceC1220lArr2;
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 10, (InterfaceC16588l) interfaceC1220lArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
            interfaceC1220lArr2 = interfaceC1220lArr;
            z = z;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C8206l(i, iSubscription, iSubscription2, str4, str5, str6, str7, str8, str3, str2, str, list);
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
