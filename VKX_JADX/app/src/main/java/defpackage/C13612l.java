package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْۘۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13612l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13612l yandex;

    static {
        C13612l c13612l = new C13612l();
        yandex = c13612l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto", c13612l, 39);
        c13637l.smaato("artist", false);
        c13637l.smaato("id", false);
        c13637l.smaato("owner_id", false);
        c13637l.smaato("title", false);
        c13637l.smaato("duration", false);
        c13637l.smaato("access_key", true);
        c13637l.smaato("is_explicit", true);
        c13637l.smaato("is_focus_track", true);
        c13637l.smaato("is_licensed", true);
        c13637l.smaato("track_code", true);
        c13637l.smaato("url", true);
        c13637l.smaato("date", true);
        c13637l.smaato("album_id", true);
        c13637l.smaato("has_lyrics", true);
        c13637l.smaato("genre_id", true);
        c13637l.smaato("no_search", true);
        c13637l.smaato("album", true);
        c13637l.smaato("release_id", true);
        c13637l.smaato("track_id", true);
        c13637l.smaato("mstcp_type", true);
        c13637l.smaato("track_genre_id", true);
        c13637l.smaato("content_restricted", true);
        c13637l.smaato("main_artists", true);
        c13637l.smaato("featured_artists", true);
        c13637l.smaato("subtitle", true);
        c13637l.smaato("album_part_number", true);
        c13637l.smaato("performer", true);
        c13637l.smaato("podcast_info", true);
        c13637l.smaato("audio_chart_info", true);
        c13637l.smaato("original_sound_video_id", true);
        c13637l.smaato("short_videos_allowed", true);
        c13637l.smaato("stories_allowed", true);
        c13637l.smaato("stories_cover_allowed", true);
        c13637l.smaato("in_clips_favorite_allowed", true);
        c13637l.smaato("in_clips_favorite", true);
        c13637l.smaato("dmca_blocked", true);
        c13637l.smaato("kws_skip", true);
        c13637l.smaato("is_official", true);
        c13637l.smaato("release_audio_id", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C2757l.f5965for;
        C0194l c0194l = C0194l.yandex;
        C1313l c1313l = C1313l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c0194l);
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{c0194l, c1313l, C11363l.yandex, c0194l, c1313l, interfaceC16588lCrashlytics, AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[14].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[15].getValue()), AbstractC7303l.crashlytics(C15677l.yandex), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[19].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[20].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[21].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[22].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[23].getValue()), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(C6648l.yandex), AbstractC7303l.crashlytics(C16719l.yandex), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[36].getValue()), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C2757l c2757l = (C2757l) obj;
        String str = c2757l.f5966extends;
        Boolean bool = c2757l.f5969private;
        List list = c2757l.f5967native;
        Boolean bool2 = c2757l.f5973volatile;
        Boolean bool3 = c2757l.f5970strictfp;
        Boolean bool4 = c2757l.f5971synchronized;
        Boolean bool5 = c2757l.f5968package;
        Boolean bool6 = c2757l.f5972throws;
        Boolean bool7 = c2757l.inmobi;
        String str2 = c2757l.appmetrica;
        C18191l c18191l = c2757l.applovin;
        C14913l c14913l = c2757l.premium;
        String str3 = c2757l.signatures;
        Integer num = c2757l.isVip;
        String str4 = c2757l.advert;
        List list2 = c2757l.ad;
        List list3 = c2757l.pro;
        EnumC16114l enumC16114l = c2757l.license;
        EnumC0836l enumC0836l = c2757l.Signature;
        EnumC2939l enumC2939l = c2757l.tapsense;
        Integer num2 = c2757l.subscription;
        Integer num3 = c2757l.ads;
        C12787l c12787l = c2757l.adcel;
        EnumC17046l enumC17046l = c2757l.startapp;
        EnumC13459l enumC13459l = c2757l.metrica;
        Boolean bool8 = c2757l.vip;
        Integer num4 = c2757l.remoteconfig;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C2757l.f5965for;
        String str5 = c2757l.yandex;
        Integer num5 = c2757l.smaato;
        String str6 = c2757l.firebase;
        String str7 = c2757l.isPro;
        Boolean bool9 = c2757l.subs;
        Boolean bool10 = c2757l.admob;
        Boolean bool11 = c2757l.mopub;
        String str8 = c2757l.billing;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str5);
        abstractC4072l.signatures(1, c2757l.loadAd, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 2, C11363l.yandex, new C10877l(c2757l.crashlytics));
        abstractC4072l.appmetrica(interfaceC18035l, 3, c2757l.amazon);
        abstractC4072l.signatures(4, c2757l.purchase, interfaceC18035l);
        if (abstractC4072l.ads() || str8 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C0194l.yandex, str8);
        }
        if (abstractC4072l.ads() || bool11 != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C2796l.yandex, bool11);
        }
        if (abstractC4072l.ads() || bool10 != null) {
            abstractC4072l.startapp(interfaceC18035l, 7, C2796l.yandex, bool10);
        }
        if (abstractC4072l.ads() || bool9 != null) {
            abstractC4072l.startapp(interfaceC18035l, 8, C2796l.yandex, bool9);
        }
        if (abstractC4072l.ads() || str7 != null) {
            abstractC4072l.startapp(interfaceC18035l, 9, C0194l.yandex, str7);
        }
        if (abstractC4072l.ads() || str6 != null) {
            abstractC4072l.startapp(interfaceC18035l, 10, C0194l.yandex, str6);
        }
        if (abstractC4072l.ads() || num5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 11, C1313l.yandex, num5);
        }
        if (abstractC4072l.ads() || num4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 12, C1313l.yandex, num4);
        }
        if (abstractC4072l.ads() || bool8 != null) {
            abstractC4072l.startapp(interfaceC18035l, 13, C2796l.yandex, bool8);
        }
        if (abstractC4072l.ads() || enumC13459l != null) {
            abstractC4072l.startapp(interfaceC18035l, 14, (InterfaceC16588l) interfaceC1220lArr[14].getValue(), enumC13459l);
        }
        if (abstractC4072l.ads() || enumC17046l != null) {
            abstractC4072l.startapp(interfaceC18035l, 15, (InterfaceC16588l) interfaceC1220lArr[15].getValue(), enumC17046l);
        }
        if (abstractC4072l.ads() || c12787l != null) {
            abstractC4072l.startapp(interfaceC18035l, 16, C15677l.yandex, c12787l);
        }
        if (abstractC4072l.ads() || num3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 17, C1313l.yandex, num3);
        }
        if (abstractC4072l.ads() || num2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 18, C1313l.yandex, num2);
        }
        if (abstractC4072l.ads() || enumC2939l != null) {
            abstractC4072l.startapp(interfaceC18035l, 19, (InterfaceC16588l) interfaceC1220lArr[19].getValue(), enumC2939l);
        }
        if (abstractC4072l.ads() || enumC0836l != null) {
            abstractC4072l.startapp(interfaceC18035l, 20, (InterfaceC16588l) interfaceC1220lArr[20].getValue(), enumC0836l);
        }
        if (abstractC4072l.ads() || enumC16114l != null) {
            abstractC4072l.startapp(interfaceC18035l, 21, (InterfaceC16588l) interfaceC1220lArr[21].getValue(), enumC16114l);
        }
        if (abstractC4072l.ads() || list3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 22, (InterfaceC16588l) interfaceC1220lArr[22].getValue(), list3);
        }
        if (abstractC4072l.ads() || list2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 23, (InterfaceC16588l) interfaceC1220lArr[23].getValue(), list2);
        }
        if (abstractC4072l.ads() || str4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 24, C0194l.yandex, str4);
        }
        if (abstractC4072l.ads() || num != null) {
            abstractC4072l.startapp(interfaceC18035l, 25, C1313l.yandex, num);
        }
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 26, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || c14913l != null) {
            abstractC4072l.startapp(interfaceC18035l, 27, C6648l.yandex, c14913l);
        }
        if (abstractC4072l.ads() || c18191l != null) {
            abstractC4072l.startapp(interfaceC18035l, 28, C16719l.yandex, c18191l);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 29, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || bool7 != null) {
            abstractC4072l.startapp(interfaceC18035l, 30, C2796l.yandex, bool7);
        }
        if (abstractC4072l.ads() || bool6 != null) {
            abstractC4072l.startapp(interfaceC18035l, 31, C2796l.yandex, bool6);
        }
        if (abstractC4072l.ads() || bool5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 32, C2796l.yandex, bool5);
        }
        if (abstractC4072l.ads() || bool4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 33, C2796l.yandex, bool4);
        }
        if (abstractC4072l.ads() || bool3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 34, C2796l.yandex, bool3);
        }
        if (abstractC4072l.ads() || bool2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 35, C2796l.yandex, bool2);
        }
        if (abstractC4072l.ads() || list != null) {
            abstractC4072l.startapp(interfaceC18035l, 36, (InterfaceC16588l) interfaceC1220lArr[36].getValue(), list);
        }
        if (abstractC4072l.ads() || bool != null) {
            abstractC4072l.startapp(interfaceC18035l, 37, C2796l.yandex, bool);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 38, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        int i;
        EnumC13459l enumC13459l;
        int i2;
        int i3;
        int i4;
        int i5;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C2757l.f5965for;
        Boolean bool = null;
        List list = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        Boolean bool4 = null;
        C14913l c14913l = null;
        Integer num = null;
        String str2 = null;
        C18191l c18191l = null;
        Boolean bool5 = null;
        String str3 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        boolean z = true;
        int i6 = 0;
        String str4 = null;
        int i7 = 0;
        String str5 = null;
        int i8 = 0;
        C10877l c10877l = null;
        String str6 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        String str7 = null;
        String str8 = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool11 = null;
        int i9 = 0;
        EnumC13459l enumC13459l2 = null;
        EnumC17046l enumC17046l = null;
        C12787l c12787l = null;
        Integer num4 = null;
        Integer num5 = null;
        EnumC2939l enumC2939l = null;
        EnumC0836l enumC0836l = null;
        EnumC16114l enumC16114l = null;
        List list2 = null;
        List list3 = null;
        String str9 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    i = i9;
                    Unit unit = Unit.INSTANCE;
                    z = false;
                    list = list;
                    enumC13459l2 = enumC13459l2;
                    i9 = i;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 0:
                    String strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i = i9 | 1;
                    Unit unit2 = Unit.INSTANCE;
                    str4 = strRemoteconfig;
                    list = list;
                    enumC13459l2 = enumC13459l2;
                    i9 = i;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i10 = i9;
                    enumC13459l2 = enumC13459l2;
                    int iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                    i = i10 | 2;
                    Unit unit3 = Unit.INSTANCE;
                    i7 = iSubscription;
                    list = list;
                    enumC13459l2 = enumC13459l2;
                    i9 = i;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 2:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i11 = i9;
                    EnumC13459l enumC13459l3 = enumC13459l2;
                    List list4 = list;
                    C10877l c10877l2 = (C10877l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, C11363l.yandex, c10877l);
                    int i12 = i11 | 4;
                    Unit unit4 = Unit.INSTANCE;
                    i9 = i12;
                    list = list4;
                    enumC13459l2 = enumC13459l3;
                    c10877l = c10877l2;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 3:
                    String strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i = i9 | 8;
                    Unit unit5 = Unit.INSTANCE;
                    str5 = strRemoteconfig2;
                    list = list;
                    enumC13459l2 = enumC13459l2;
                    i9 = i;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 4:
                    int iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 4);
                    i = i9 | 16;
                    Unit unit6 = Unit.INSTANCE;
                    i8 = iSubscription2;
                    list = list;
                    enumC13459l2 = enumC13459l2;
                    i9 = i;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 5:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i13 = i9;
                    EnumC13459l enumC13459l4 = enumC13459l2;
                    List list5 = list;
                    String str10 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str6);
                    int i14 = i13 | 32;
                    Unit unit7 = Unit.INSTANCE;
                    i9 = i14;
                    list = list5;
                    enumC13459l2 = enumC13459l4;
                    str6 = str10;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 6:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i15 = i9;
                    EnumC13459l enumC13459l5 = enumC13459l2;
                    List list6 = list;
                    Boolean bool12 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C2796l.yandex, bool8);
                    int i16 = i15 | 64;
                    Unit unit8 = Unit.INSTANCE;
                    i9 = i16;
                    list = list6;
                    enumC13459l2 = enumC13459l5;
                    bool8 = bool12;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 7:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i17 = i9;
                    EnumC13459l enumC13459l6 = enumC13459l2;
                    List list7 = list;
                    Boolean bool13 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C2796l.yandex, bool9);
                    int i18 = i17 | 128;
                    Unit unit9 = Unit.INSTANCE;
                    i9 = i18;
                    list = list7;
                    enumC13459l2 = enumC13459l6;
                    bool9 = bool13;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 8:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i19 = i9;
                    EnumC13459l enumC13459l7 = enumC13459l2;
                    List list8 = list;
                    Boolean bool14 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C2796l.yandex, bool10);
                    int i20 = i19 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit10 = Unit.INSTANCE;
                    i9 = i20;
                    list = list8;
                    enumC13459l2 = enumC13459l7;
                    bool10 = bool14;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 9:
                    int i21 = i9;
                    enumC13459l = enumC13459l2;
                    String str11 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 9, C0194l.yandex, str7);
                    i2 = i21 | AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit11 = Unit.INSTANCE;
                    str7 = str11;
                    list = list;
                    num = num;
                    enumC13459l2 = enumC13459l;
                    i9 = i2;
                    str2 = str2;
                    bool = bool;
                    break;
                case 10:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i22 = i9;
                    EnumC13459l enumC13459l8 = enumC13459l2;
                    List list9 = list;
                    String str12 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 10, C0194l.yandex, str8);
                    int i23 = i22 | 1024;
                    Unit unit12 = Unit.INSTANCE;
                    i9 = i23;
                    list = list9;
                    enumC13459l2 = enumC13459l8;
                    str8 = str12;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 11:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i24 = i9;
                    EnumC13459l enumC13459l9 = enumC13459l2;
                    List list10 = list;
                    Integer num6 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 11, C1313l.yandex, num2);
                    int i25 = i24 | 2048;
                    Unit unit13 = Unit.INSTANCE;
                    i9 = i25;
                    list = list10;
                    enumC13459l2 = enumC13459l9;
                    num2 = num6;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 12:
                    bool = bool;
                    num = num;
                    str2 = str2;
                    int i26 = i9;
                    EnumC13459l enumC13459l10 = enumC13459l2;
                    List list11 = list;
                    Integer num7 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 12, C1313l.yandex, num3);
                    int i27 = i26 | 4096;
                    Unit unit14 = Unit.INSTANCE;
                    i9 = i27;
                    list = list11;
                    enumC13459l2 = enumC13459l10;
                    num3 = num7;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 13:
                    int i28 = i9;
                    enumC13459l = enumC13459l2;
                    Boolean bool15 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 13, C2796l.yandex, bool11);
                    i2 = i28 | 8192;
                    Unit unit15 = Unit.INSTANCE;
                    bool11 = bool15;
                    list = list;
                    num = num;
                    enumC13459l2 = enumC13459l;
                    i9 = i2;
                    str2 = str2;
                    bool = bool;
                    break;
                case 14:
                    num = num;
                    str2 = str2;
                    EnumC13459l enumC13459l11 = (EnumC13459l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 14, (InterfaceC16588l) interfaceC1220lArr[14].getValue(), enumC13459l2);
                    i3 = i9 | 16384;
                    Unit unit16 = Unit.INSTANCE;
                    enumC13459l2 = enumC13459l11;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 15:
                    num = num;
                    str2 = str2;
                    EnumC17046l enumC17046l2 = (EnumC17046l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 15, (InterfaceC16588l) interfaceC1220lArr[15].getValue(), enumC17046l);
                    i3 = i9 | 32768;
                    Unit unit17 = Unit.INSTANCE;
                    enumC17046l = enumC17046l2;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 16:
                    num = num;
                    str2 = str2;
                    C12787l c12787l2 = (C12787l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 16, C15677l.yandex, c12787l);
                    i3 = i9 | 65536;
                    Unit unit18 = Unit.INSTANCE;
                    c12787l = c12787l2;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    num = num;
                    str2 = str2;
                    Integer num8 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 17, C1313l.yandex, num4);
                    i3 = i9 | 131072;
                    Unit unit19 = Unit.INSTANCE;
                    num4 = num8;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    num = num;
                    str2 = str2;
                    Integer num9 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 18, C1313l.yandex, num5);
                    i3 = i9 | 262144;
                    Unit unit20 = Unit.INSTANCE;
                    num5 = num9;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    num = num;
                    str2 = str2;
                    EnumC2939l enumC2939l2 = (EnumC2939l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 19, (InterfaceC16588l) interfaceC1220lArr[19].getValue(), enumC2939l);
                    i3 = i9 | 524288;
                    Unit unit21 = Unit.INSTANCE;
                    enumC2939l = enumC2939l2;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 20:
                    num = num;
                    str2 = str2;
                    EnumC0836l enumC0836l2 = (EnumC0836l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 20, (InterfaceC16588l) interfaceC1220lArr[20].getValue(), enumC0836l);
                    i3 = i9 | 1048576;
                    Unit unit22 = Unit.INSTANCE;
                    enumC0836l = enumC0836l2;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 21:
                    num = num;
                    str2 = str2;
                    EnumC16114l enumC16114l2 = (EnumC16114l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 21, (InterfaceC16588l) interfaceC1220lArr[21].getValue(), enumC16114l);
                    i3 = i9 | 2097152;
                    Unit unit23 = Unit.INSTANCE;
                    enumC16114l = enumC16114l2;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 22:
                    num = num;
                    str2 = str2;
                    List list12 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 22, (InterfaceC16588l) interfaceC1220lArr[22].getValue(), list2);
                    i3 = i9 | 4194304;
                    Unit unit24 = Unit.INSTANCE;
                    list2 = list12;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 23:
                    num = num;
                    str2 = str2;
                    List list13 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 23, (InterfaceC16588l) interfaceC1220lArr[23].getValue(), list3);
                    i3 = i9 | 8388608;
                    Unit unit25 = Unit.INSTANCE;
                    list3 = list13;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    str2 = str2;
                    num = num;
                    String str13 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 24, C0194l.yandex, str9);
                    i3 = i9 | 16777216;
                    Unit unit26 = Unit.INSTANCE;
                    str9 = str13;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    bool = bool;
                    str2 = str2;
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 25, C1313l.yandex, num);
                    Unit unit27 = Unit.INSTANCE;
                    i9 |= 33554432;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    num = num;
                    bool = bool;
                    String str14 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 26, C0194l.yandex, str2);
                    Unit unit28 = Unit.INSTANCE;
                    i9 |= 67108864;
                    str2 = str14;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    c14913l = (C14913l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 27, C6648l.yandex, c14913l);
                    i4 = 134217728;
                    i3 = i9 | i4;
                    Unit unit29 = Unit.INSTANCE;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    c18191l = (C18191l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 28, C16719l.yandex, c18191l);
                    i4 = 268435456;
                    i3 = i9 | i4;
                    Unit unit210 = Unit.INSTANCE;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 29, C0194l.yandex, str3);
                    i4 = 536870912;
                    i3 = i9 | i4;
                    Unit unit211 = Unit.INSTANCE;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 30:
                    bool6 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 30, C2796l.yandex, bool6);
                    i4 = 1073741824;
                    i3 = i9 | i4;
                    Unit unit212 = Unit.INSTANCE;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 31:
                    bool5 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 31, C2796l.yandex, bool5);
                    i4 = RecyclerView.UNDEFINED_DURATION;
                    i3 = i9 | i4;
                    Unit unit213 = Unit.INSTANCE;
                    i9 = i3;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case 32:
                    bool7 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 32, C2796l.yandex, bool7);
                    i5 = i6 | 1;
                    Unit unit30 = Unit.INSTANCE;
                    bool = bool;
                    i6 = i5;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    bool4 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 33, C2796l.yandex, bool4);
                    i5 = i6 | 2;
                    Unit unit31 = Unit.INSTANCE;
                    bool = bool;
                    i6 = i5;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    bool3 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 34, C2796l.yandex, bool3);
                    i5 = i6 | 4;
                    Unit unit32 = Unit.INSTANCE;
                    bool = bool;
                    i6 = i5;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    bool2 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 35, C2796l.yandex, bool2);
                    i5 = i6 | 8;
                    Unit unit33 = Unit.INSTANCE;
                    bool = bool;
                    i6 = i5;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 36, (InterfaceC16588l) interfaceC1220lArr[36].getValue(), list);
                    i5 = i6 | 16;
                    Unit unit34 = Unit.INSTANCE;
                    bool = bool;
                    i6 = i5;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 37, C2796l.yandex, bool);
                    i5 = i6 | 32;
                    Unit unit35 = Unit.INSTANCE;
                    bool = bool;
                    i6 = i5;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 38, C0194l.yandex, str);
                    i5 = i6 | 64;
                    Unit unit36 = Unit.INSTANCE;
                    bool = bool;
                    i6 = i5;
                    num = num;
                    str2 = str2;
                    bool = bool;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        Boolean bool16 = bool;
        int i29 = i9;
        EnumC13459l enumC13459l12 = enumC13459l2;
        List list14 = list;
        C10877l c10877l3 = c10877l;
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        Boolean bool17 = bool9;
        Integer num10 = num4;
        C18191l c18191l2 = c18191l;
        return new C2757l(i29, i6, str4, i7, c10877l3, str5, i8, str6, bool8, bool17, bool10, str7, str8, num2, num3, bool11, enumC13459l12, enumC17046l, c12787l, num10, num5, enumC2939l, enumC0836l, enumC16114l, list2, list3, str9, num, str2, c14913l, c18191l2, str3, bool6, bool5, bool7, bool4, bool3, bool2, list14, bool16, str);
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
