package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙٟٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6648l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C6648l yandex;

    static {
        C6648l c6648l = new C6648l();
        yandex = c6648l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.podcast.PodcastInfoDto", c6648l, 14);
        c13637l.smaato("cover", true);
        c13637l.smaato("description", true);
        c13637l.smaato("is_favorite", true);
        c13637l.smaato("plays", true);
        c13637l.smaato("position", true);
        c13637l.smaato("rss_guid", true);
        c13637l.smaato("restriction_description", true);
        c13637l.smaato("restriction_text", true);
        c13637l.smaato("restriction_button", true);
        c13637l.smaato("friends_liked", true);
        c13637l.smaato("is_random", true);
        c13637l.smaato("post", true);
        c13637l.smaato("is_donut", true);
        c13637l.smaato("podcast_id", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C14913l.metrica;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(C16725l.yandex);
        C0194l c0194l = C0194l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(c0194l);
        C2796l c2796l = C2796l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics3 = AbstractC7303l.crashlytics(c2796l);
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, interfaceC16588lCrashlytics3, AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(C10250l.yandex), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[9].getValue()), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c1313l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C14913l c14913l = (C14913l) obj;
        Integer num = c14913l.vip;
        Boolean bool = c14913l.remoteconfig;
        String str = c14913l.smaato;
        Boolean bool2 = c14913l.firebase;
        List list = c14913l.isPro;
        C13748l c13748l = c14913l.subs;
        String str2 = c14913l.admob;
        String str3 = c14913l.mopub;
        String str4 = c14913l.billing;
        Integer num2 = c14913l.purchase;
        Integer num3 = c14913l.amazon;
        Boolean bool3 = c14913l.crashlytics;
        String str5 = c14913l.loadAd;
        C12905l c12905l = c14913l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C14913l.metrica;
        if (interfaceC0039lCrashlytics.ads() || c12905l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C16725l.yandex, c12905l);
        }
        if (interfaceC0039lCrashlytics.ads() || str5 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C0194l.yandex, str5);
        }
        if (interfaceC0039lCrashlytics.ads() || bool3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C2796l.yandex, bool3);
        }
        if (interfaceC0039lCrashlytics.ads() || num3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, C1313l.yandex, num3);
        }
        if (interfaceC0039lCrashlytics.ads() || num2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C1313l.yandex, num2);
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
        if (interfaceC0039lCrashlytics.ads() || c13748l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 8, C10250l.yandex, c13748l);
        }
        if (interfaceC0039lCrashlytics.ads() || list != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || bool2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 10, C2796l.yandex, bool2);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 11, C0194l.yandex, str);
        }
        if (interfaceC0039lCrashlytics.ads() || bool != 0) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 12, C2796l.yandex, bool);
        }
        if (interfaceC0039lCrashlytics.ads() || num != 0) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 13, C1313l.yandex, num);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C12905l c12905l;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C14913l.metrica;
        String str = null;
        Boolean bool = null;
        List list = null;
        C13748l c13748l = null;
        Boolean bool2 = null;
        String str2 = null;
        int i = 0;
        Integer num = null;
        String str3 = null;
        Boolean bool3 = null;
        Integer num2 = null;
        Integer num3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = true;
        C12905l c12905l2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    c12905l = c12905l2;
                    z = false;
                    bool = bool;
                    bool3 = bool3;
                    c12905l2 = c12905l;
                    str = str;
                    break;
                case 0:
                    c12905l = (C12905l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C16725l.yandex, c12905l2);
                    i |= 1;
                    str3 = str3;
                    bool = bool;
                    bool3 = bool3;
                    c12905l2 = c12905l;
                    str = str;
                    break;
                case 1:
                    str = str;
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str3);
                    i |= 2;
                    bool3 = bool3;
                    str = str;
                    break;
                case 2:
                    str = str;
                    bool3 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C2796l.yandex, bool3);
                    i |= 4;
                    str3 = str3;
                    str = str;
                    break;
                case 3:
                    num2 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C1313l.yandex, num2);
                    i |= 8;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 4:
                    num3 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C1313l.yandex, num3);
                    i |= 16;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 5:
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str4);
                    i |= 32;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 6:
                    str5 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C0194l.yandex, str5);
                    i |= 64;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 7:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C0194l.yandex, str2);
                    i |= 128;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 8:
                    c13748l = (C13748l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C10250l.yandex, c13748l);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 9:
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), list);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 10:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 10, C2796l.yandex, bool);
                    i |= 1024;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 11:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 11, C0194l.yandex, str);
                    i |= 2048;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 12:
                    bool2 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 12, C2796l.yandex, bool2);
                    i |= 4096;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                case 13:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 13, C1313l.yandex, num);
                    i |= 8192;
                    str3 = str3;
                    bool3 = bool3;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        String str6 = str;
        C12905l c12905l3 = c12905l2;
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C14913l(i, c12905l3, str3, bool3, num2, num3, str4, str5, str2, c13748l, list, bool, str6, bool2, num);
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
