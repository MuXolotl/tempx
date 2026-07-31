package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًٕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15861l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C15861l yandex;

    static {
        C15861l c15861l = new C15861l();
        yandex = c15861l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBookDto", c15861l, 23);
        c13637l.smaato("access_status", false);
        c13637l.smaato("annotation", true);
        c13637l.smaato("authors", true);
        c13637l.smaato("chapters", true);
        c13637l.smaato("code", true);
        c13637l.smaato("copyright", true);
        c13637l.smaato("cover", true);
        c13637l.smaato("duration", false);
        c13637l.smaato("file_size", false);
        c13637l.smaato("genres", true);
        c13637l.smaato("id", false);
        c13637l.smaato("in_favorites", true);
        c13637l.smaato("is_explicit", true);
        c13637l.smaato("main_genre", true);
        c13637l.smaato("minimum_age", true);
        c13637l.smaato("narrators", true);
        c13637l.smaato("progress_percentage", true);
        c13637l.smaato("publisher", false);
        c13637l.smaato("release_date", true);
        c13637l.smaato("title", true);
        c13637l.smaato("track_code", true);
        c13637l.smaato("translators", true);
        c13637l.smaato("updated_at", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C2391l.ad;
        C0194l c0194l = C0194l.yandex;
        C1313l c1313l = C1313l.yandex;
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{interfaceC1220lArr[0].getValue(), AbstractC7303l.crashlytics(c0194l), interfaceC1220lArr[2].getValue(), interfaceC1220lArr[3].getValue(), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), interfaceC1220lArr[6].getValue(), c1313l, C2010l.yandex, interfaceC1220lArr[9].getValue(), c1313l, c2796l, c2796l, AbstractC7303l.crashlytics(C14977l.yandex), AbstractC7303l.crashlytics(c1313l), interfaceC1220lArr[15].getValue(), c1313l, C18018l.yandex, c1313l, AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), interfaceC1220lArr[21].getValue(), c1313l};
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x01d1  */
    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        List list;
        List list2;
        C2391l c2391l = (C2391l) obj;
        int i = c2391l.pro;
        List list3 = c2391l.license;
        String str = c2391l.Signature;
        String str2 = c2391l.tapsense;
        int i2 = c2391l.subscription;
        int i3 = c2391l.adcel;
        List list4 = c2391l.startapp;
        Integer num = c2391l.metrica;
        C0249l c0249l = c2391l.vip;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C2391l.ad;
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) interfaceC1220lArr[0].getValue();
        EnumC7595l enumC7595l = c2391l.yandex;
        boolean z = c2391l.remoteconfig;
        boolean z2 = c2391l.smaato;
        List list5 = c2391l.isPro;
        List list6 = c2391l.mopub;
        String str3 = c2391l.billing;
        String str4 = c2391l.purchase;
        List list7 = c2391l.amazon;
        List list8 = c2391l.crashlytics;
        String str5 = c2391l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, interfaceC16588l, enumC7595l);
        if (abstractC4072l.ads() || str5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, C0194l.yandex, str5);
        }
        boolean zAds = abstractC4072l.ads();
        C2580l c2580l = C2580l.f5619l;
        if (zAds || !AbstractC8576l.yandex(list8, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list8);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(list7, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list7);
        }
        if (abstractC4072l.ads() || str4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C0194l.yandex, str4);
        }
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(list6, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list6);
        }
        abstractC4072l.signatures(7, c2391l.admob, interfaceC18035l);
        abstractC4072l.premium(interfaceC18035l, 8, c2391l.subs);
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(list5, c2580l)) {
            abstractC4072l.applovin(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), list5);
        }
        abstractC4072l.signatures(10, c2391l.firebase, interfaceC18035l);
        if (abstractC4072l.ads() || z2) {
            abstractC4072l.ad(interfaceC18035l, 11, z2);
        }
        if (abstractC4072l.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 12, z);
        }
        if (abstractC4072l.ads() || c0249l != null) {
            abstractC4072l.startapp(interfaceC18035l, 13, C14977l.yandex, c0249l);
        }
        if (abstractC4072l.ads() || num != null) {
            abstractC4072l.startapp(interfaceC18035l, 14, C1313l.yandex, num);
        }
        if (!abstractC4072l.ads()) {
            list = list4;
            if (!AbstractC8576l.yandex(list, c2580l)) {
            }
            if (abstractC4072l.ads() || i3 != 0) {
                abstractC4072l.signatures(16, i3, interfaceC18035l);
            }
            abstractC4072l.applovin(interfaceC18035l, 17, C18018l.yandex, c2391l.ads);
            if (abstractC4072l.ads() || i2 != 0) {
                abstractC4072l.signatures(18, i2, interfaceC18035l);
            }
            if (abstractC4072l.ads() || str2 != null) {
                abstractC4072l.startapp(interfaceC18035l, 19, C0194l.yandex, str2);
            }
            if (abstractC4072l.ads() || str != null) {
                abstractC4072l.startapp(interfaceC18035l, 20, C0194l.yandex, str);
            }
            if (abstractC4072l.ads()) {
                list2 = list3;
                if (!AbstractC8576l.yandex(list2, c2580l)) {
                }
                if (abstractC4072l.ads() || i != 0) {
                    abstractC4072l.signatures(22, i, interfaceC18035l);
                }
                interfaceC0039lCrashlytics.yandex(interfaceC18035l);
            }
            list2 = list3;
            abstractC4072l.applovin(interfaceC18035l, 21, (InterfaceC16588l) interfaceC1220lArr[21].getValue(), list2);
            if (abstractC4072l.ads()) {
                abstractC4072l.signatures(22, i, interfaceC18035l);
            } else {
                abstractC4072l.signatures(22, i, interfaceC18035l);
            }
            interfaceC0039lCrashlytics.yandex(interfaceC18035l);
        }
        list = list4;
        abstractC4072l.applovin(interfaceC18035l, 15, (InterfaceC16588l) interfaceC1220lArr[15].getValue(), list);
        if (abstractC4072l.ads()) {
            abstractC4072l.signatures(16, i3, interfaceC18035l);
        } else {
            abstractC4072l.signatures(16, i3, interfaceC18035l);
        }
        abstractC4072l.applovin(interfaceC18035l, 17, C18018l.yandex, c2391l.ads);
        if (abstractC4072l.ads()) {
            abstractC4072l.signatures(18, i2, interfaceC18035l);
        } else {
            abstractC4072l.signatures(18, i2, interfaceC18035l);
        }
        if (abstractC4072l.ads()) {
            abstractC4072l.startapp(interfaceC18035l, 19, C0194l.yandex, str2);
        } else {
            abstractC4072l.startapp(interfaceC18035l, 19, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads()) {
            abstractC4072l.startapp(interfaceC18035l, 20, C0194l.yandex, str);
        } else {
            abstractC4072l.startapp(interfaceC18035l, 20, C0194l.yandex, str);
        }
        if (abstractC4072l.ads()) {
            list2 = list3;
            if (!AbstractC8576l.yandex(list2, c2580l)) {
            }
            if (abstractC4072l.ads()) {
                abstractC4072l.signatures(22, i, interfaceC18035l);
            } else {
                abstractC4072l.signatures(22, i, interfaceC18035l);
            }
            interfaceC0039lCrashlytics.yandex(interfaceC18035l);
        }
        list2 = list3;
        abstractC4072l.applovin(interfaceC18035l, 21, (InterfaceC16588l) interfaceC1220lArr[21].getValue(), list2);
        if (abstractC4072l.ads()) {
            abstractC4072l.signatures(22, i, interfaceC18035l);
        } else {
            abstractC4072l.signatures(22, i, interfaceC18035l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        int i;
        int i2;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C2391l.ad;
        long jInmobi = 0;
        C6612l c6612l = null;
        List list = null;
        Integer num = null;
        C0249l c0249l = null;
        String str = null;
        List list2 = null;
        List list3 = null;
        int i3 = 0;
        String str2 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        String str3 = null;
        String str4 = null;
        int iSubscription = 0;
        int iSubscription2 = 0;
        boolean zIsVip = false;
        boolean zIsVip2 = false;
        boolean z = true;
        EnumC7595l enumC7595l = null;
        String str5 = null;
        int iSubscription3 = 0;
        int iSubscription4 = 0;
        int iSubscription5 = 0;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    list = list;
                    c6612l = c6612l;
                    str5 = str5;
                    list6 = list6;
                    break;
                case 0:
                    enumC7595l = (EnumC7595l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC7595l);
                    i3 |= 1;
                    list = list;
                    list5 = list5;
                    c6612l = c6612l;
                    str5 = str5;
                    list6 = list6;
                    break;
                case 1:
                    list6 = list6;
                    str5 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str5);
                    i3 |= 2;
                    list5 = list5;
                    c6612l = c6612l;
                    list6 = list6;
                    break;
                case 2:
                    list6 = list6;
                    list5 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list5);
                    i3 |= 4;
                    c6612l = c6612l;
                    list6 = list6;
                    break;
                case 3:
                    list6 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list6);
                    i3 |= 8;
                    list5 = list5;
                    c6612l = c6612l;
                    break;
                case 4:
                    list5 = list5;
                    list6 = list6;
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str3);
                    i3 |= 16;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 5:
                    list5 = list5;
                    list6 = list6;
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str4);
                    i3 |= 32;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 6:
                    list5 = list5;
                    list6 = list6;
                    list2 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), list2);
                    i3 |= 64;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 7:
                    list5 = list5;
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 7);
                    i3 |= 128;
                    list5 = list5;
                    break;
                case 8:
                    list5 = list5;
                    jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 8);
                    i3 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    list5 = list5;
                    break;
                case 9:
                    list5 = list5;
                    list6 = list6;
                    list3 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), list3);
                    i3 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 10:
                    list5 = list5;
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 10);
                    i3 |= 1024;
                    list5 = list5;
                    break;
                case 11:
                    list5 = list5;
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 11);
                    i3 |= 2048;
                    list5 = list5;
                    break;
                case 12:
                    list5 = list5;
                    zIsVip2 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 12);
                    i3 |= 4096;
                    list5 = list5;
                    break;
                case 13:
                    list5 = list5;
                    list6 = list6;
                    c0249l = (C0249l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 13, C14977l.yandex, c0249l);
                    i3 |= 8192;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 14:
                    list5 = list5;
                    list6 = list6;
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 14, C1313l.yandex, num);
                    i3 |= 16384;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 15:
                    list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 15, (InterfaceC16588l) interfaceC1220lArr[15].getValue(), list);
                    i2 = 32768;
                    i3 |= i2;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 16:
                    iSubscription3 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 16);
                    i = 65536;
                    i3 |= i;
                    list5 = list5;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    c6612l = (C6612l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 17, C18018l.yandex, c6612l);
                    i2 = 131072;
                    i3 |= i2;
                    list5 = list5;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    iSubscription4 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 18);
                    i = 262144;
                    i3 |= i;
                    list5 = list5;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 19, C0194l.yandex, str);
                    i2 = 524288;
                    i3 |= i2;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 20:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 20, C0194l.yandex, str2);
                    i2 = 1048576;
                    i3 |= i2;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 21:
                    list4 = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 21, (InterfaceC16588l) interfaceC1220lArr[21].getValue(), list4);
                    i2 = 2097152;
                    i3 |= i2;
                    list5 = list5;
                    list6 = list6;
                    break;
                case 22:
                    iSubscription5 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 22);
                    i = 4194304;
                    i3 |= i;
                    list5 = list5;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        C6612l c6612l2 = c6612l;
        List list7 = list6;
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C2391l(i3, enumC7595l, str5, list5, list7, str3, str4, list2, iSubscription, jInmobi, list3, iSubscription2, zIsVip, zIsVip2, c0249l, num, list, iSubscription3, c6612l2, iSubscription4, str, str2, list4, iSubscription5);
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
