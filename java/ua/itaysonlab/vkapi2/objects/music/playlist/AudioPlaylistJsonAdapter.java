package ua.itaysonlab.vkapi2.objects.music.playlist;

import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC12589l;
import defpackage.AbstractC15639l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.AudioPlaylistMeta;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.music.restriction.MusicDynamicRestriction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioPlaylistJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l adcel;
    public final AbstractC7188l admob;
    public final AbstractC7188l ads;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l firebase;
    public final AbstractC7188l isPro;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l metrica;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final AbstractC7188l remoteconfig;
    public final AbstractC7188l smaato;
    public final AbstractC7188l startapp;
    public final AbstractC7188l subs;
    public final AbstractC7188l subscription;
    public final AbstractC7188l tapsense;
    public final AbstractC7188l vip;
    public final C0458l yandex = C0458l.m547strictfp("id", "owner_id", "type", "album", "title", "description", "count", "followers", "plays", "create_time", "update_time", "genres", "is_following", "is_curator", "audios", "year", "followed", "original", "photo", "thumbs", "access_key", "is_explicit", "subtitle", "main_artists", "subtitle_badge", "no_discover", "audio_chart_info", "meta", "restriction", "permissions", "main_color");

    public AudioPlaylistJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Long.TYPE, c5746l, "owner_id");
        this.amazon = c12952l.loadAd(String.class, c5746l, "newType");
        this.purchase = c12952l.loadAd(AudioPlaylist.AlbumMeta.class, c5746l, "newAlbumMeta");
        this.billing = c12952l.loadAd(String.class, c5746l, "description");
        this.mopub = c12952l.loadAd(Long.class, c5746l, "update_time");
        this.admob = c12952l.loadAd(AbstractC15639l.mopub(List.class, Genre.class), c5746l, "genres");
        this.subs = c12952l.loadAd(Boolean.class, c5746l, "is_following");
        this.isPro = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioTrack.class), c5746l, "audios");
        this.firebase = c12952l.loadAd(FollowedMetadata.class, c5746l, "followed");
        this.smaato = c12952l.loadAd(OriginalPlaylist.class, c5746l, "original");
        this.remoteconfig = c12952l.loadAd(AlbumThumb.class, c5746l, "photo");
        this.vip = c12952l.loadAd(AbstractC15639l.mopub(List.class, AlbumThumb.class), c5746l, "thumbs");
        this.metrica = c12952l.loadAd(AbstractC15639l.mopub(List.class, MainArtist.class), c5746l, "main_artists");
        this.startapp = c12952l.loadAd(Boolean.TYPE, c5746l, "subtitle_badge");
        this.adcel = c12952l.loadAd(AudioChartInfo.class, c5746l, "audio_chart_info");
        this.ads = c12952l.loadAd(AudioPlaylistMeta.class, c5746l, "meta");
        this.subscription = c12952l.loadAd(MusicDynamicRestriction.class, c5746l, "restriction");
        this.tapsense = c12952l.loadAd(AudioPlaylistPermissions.class, c5746l, "permissions");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        int i = audioPlaylist.crashlytics;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "owner_id");
        long j = audioPlaylist.amazon;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        AbstractC12589l.m3427throws(j, abstractC7188l2, c3631l, "type");
        String str = audioPlaylist.purchase;
        AbstractC7188l abstractC7188l3 = this.amazon;
        abstractC7188l3.billing(c3631l, str);
        c3631l.isVip("album");
        this.purchase.billing(c3631l, audioPlaylist.billing);
        c3631l.isVip("title");
        abstractC7188l3.billing(c3631l, audioPlaylist.mopub);
        c3631l.isVip("description");
        String str2 = audioPlaylist.admob;
        AbstractC7188l abstractC7188l4 = this.billing;
        abstractC7188l4.billing(c3631l, str2);
        c3631l.isVip("count");
        AbstractC12589l.inmobi(audioPlaylist.subs, abstractC7188l, c3631l, "followers");
        AbstractC12589l.inmobi(audioPlaylist.isPro, abstractC7188l, c3631l, "plays");
        AbstractC12589l.inmobi(audioPlaylist.firebase, abstractC7188l, c3631l, "create_time");
        AbstractC12589l.m3427throws(audioPlaylist.smaato, abstractC7188l2, c3631l, "update_time");
        this.mopub.billing(c3631l, audioPlaylist.remoteconfig);
        c3631l.isVip("genres");
        this.admob.billing(c3631l, audioPlaylist.vip);
        c3631l.isVip("is_following");
        Boolean bool = audioPlaylist.metrica;
        AbstractC7188l abstractC7188l5 = this.subs;
        abstractC7188l5.billing(c3631l, bool);
        c3631l.isVip("is_curator");
        abstractC7188l5.billing(c3631l, audioPlaylist.startapp);
        c3631l.isVip("audios");
        this.isPro.billing(c3631l, audioPlaylist.adcel);
        c3631l.isVip("year");
        AbstractC12589l.inmobi(audioPlaylist.ads, abstractC7188l, c3631l, "followed");
        this.firebase.billing(c3631l, audioPlaylist.subscription);
        c3631l.isVip("original");
        this.smaato.billing(c3631l, audioPlaylist.tapsense);
        c3631l.isVip("photo");
        this.remoteconfig.billing(c3631l, audioPlaylist.Signature);
        c3631l.isVip("thumbs");
        this.vip.billing(c3631l, audioPlaylist.license);
        c3631l.isVip("access_key");
        abstractC7188l4.billing(c3631l, audioPlaylist.pro);
        c3631l.isVip("is_explicit");
        abstractC7188l5.billing(c3631l, audioPlaylist.ad);
        c3631l.isVip("subtitle");
        abstractC7188l4.billing(c3631l, audioPlaylist.advert);
        c3631l.isVip("main_artists");
        this.metrica.billing(c3631l, audioPlaylist.isVip);
        c3631l.isVip("subtitle_badge");
        boolean z = audioPlaylist.signatures;
        AbstractC7188l abstractC7188l6 = this.startapp;
        AbstractC12589l.m3428volatile(z, abstractC7188l6, c3631l, "no_discover");
        AbstractC12589l.m3428volatile(audioPlaylist.premium, abstractC7188l6, c3631l, "audio_chart_info");
        this.adcel.billing(c3631l, audioPlaylist.applovin);
        c3631l.isVip("meta");
        this.ads.billing(c3631l, audioPlaylist.appmetrica);
        c3631l.isVip("restriction");
        this.subscription.billing(c3631l, audioPlaylist.inmobi);
        c3631l.isVip("permissions");
        this.tapsense.billing(c3631l, audioPlaylist.f36623throws);
        c3631l.isVip("main_color");
        abstractC7188l4.billing(c3631l, audioPlaylist.f36620package);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int i;
        int i2;
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        int i3 = -1;
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        int iIntValue5 = 0;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        long jLongValue = 0;
        long jLongValue2 = 0;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object obj = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object obj2 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        Object obj3 = null;
        Object objLoadAd7 = null;
        Object objLoadAd8 = null;
        Object objLoadAd9 = null;
        Object obj4 = null;
        Object objLoadAd10 = null;
        Object objLoadAd11 = null;
        Object objLoadAd12 = null;
        Object obj5 = null;
        Object objLoadAd13 = null;
        Object objLoadAd14 = null;
        Object objLoadAd15 = null;
        Object objLoadAd16 = null;
        Object objLoadAd17 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            Object obj6 = objLoadAd;
            AbstractC7188l abstractC7188l = this.amazon;
            Object obj7 = objLoadAd2;
            AbstractC7188l abstractC7188l2 = this.crashlytics;
            Object obj8 = obj;
            AbstractC7188l abstractC7188l3 = this.startapp;
            AbstractC7188l abstractC7188l4 = this.subs;
            Object obj9 = objLoadAd3;
            AbstractC7188l abstractC7188l5 = this.billing;
            int i4 = iIntValue;
            AbstractC7188l abstractC7188l6 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 0:
                    Object objLoadAd18 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd18 == null) {
                        setIsVip = AbstractC2812l.isVip("id", "id", c0396l, setIsVip);
                        iIntValue = i4;
                    } else {
                        iIntValue = ((Number) objLoadAd18).intValue();
                    }
                    i3 &= -2;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    break;
                case 1:
                    Object objLoadAd19 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd19 == null) {
                        setIsVip = AbstractC2812l.isVip("owner_id", "owner_id", c0396l, setIsVip);
                    } else {
                        jLongValue = ((Number) objLoadAd19).longValue();
                    }
                    i = i3 & (-3);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 2:
                    objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setIsVip = AbstractC2812l.isVip("newType", "type", c0396l, setIsVip);
                        objLoadAd = obj6;
                    }
                    i3 &= -5;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 3:
                    objLoadAd2 = this.purchase.loadAd(c0396l);
                    i3 &= -9;
                    objLoadAd = obj6;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 4:
                    Object objLoadAd20 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd20 == null) {
                        setIsVip = AbstractC2812l.isVip("title", "title", c0396l, setIsVip);
                        obj = obj8;
                    } else {
                        obj = objLoadAd20;
                    }
                    i3 &= -17;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 5:
                    objLoadAd3 = abstractC7188l5.loadAd(c0396l);
                    i3 &= -33;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    iIntValue = i4;
                    break;
                case 6:
                    Object objLoadAd21 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd21 == null) {
                        setIsVip = AbstractC2812l.isVip("count", "count", c0396l, setIsVip);
                    } else {
                        iIntValue2 = ((Number) objLoadAd21).intValue();
                    }
                    i = i3 & (-65);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 7:
                    Object objLoadAd22 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd22 == null) {
                        setIsVip = AbstractC2812l.isVip("followers", "followers", c0396l, setIsVip);
                    } else {
                        iIntValue3 = ((Number) objLoadAd22).intValue();
                    }
                    i = i3 & (-129);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 8:
                    Object objLoadAd23 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd23 == null) {
                        setIsVip = AbstractC2812l.isVip("plays", "plays", c0396l, setIsVip);
                    } else {
                        iIntValue4 = ((Number) objLoadAd23).intValue();
                    }
                    i = i3 & (-257);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 9:
                    Object objLoadAd24 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd24 == null) {
                        setIsVip = AbstractC2812l.isVip("create_time", "create_time", c0396l, setIsVip);
                    } else {
                        jLongValue2 = ((Number) objLoadAd24).longValue();
                    }
                    i = i3 & (-513);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 10:
                    objLoadAd4 = this.mopub.loadAd(c0396l);
                    i = i3 & (-1025);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 11:
                    Object objLoadAd25 = this.admob.loadAd(c0396l);
                    if (objLoadAd25 == null) {
                        setIsVip = AbstractC2812l.isVip("genres", "genres", c0396l, setIsVip);
                    } else {
                        obj2 = objLoadAd25;
                    }
                    i = i3 & (-2049);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 12:
                    objLoadAd5 = abstractC7188l4.loadAd(c0396l);
                    i = i3 & (-4097);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 13:
                    objLoadAd6 = abstractC7188l4.loadAd(c0396l);
                    i = i3 & (-8193);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 14:
                    Object objLoadAd26 = this.isPro.loadAd(c0396l);
                    if (objLoadAd26 == null) {
                        setIsVip = AbstractC2812l.isVip("audios", "audios", c0396l, setIsVip);
                    } else {
                        obj3 = objLoadAd26;
                    }
                    i = i3 & (-16385);
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 15:
                    Object objLoadAd27 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd27 == null) {
                        setIsVip = AbstractC2812l.isVip("year", "year", c0396l, setIsVip);
                    } else {
                        iIntValue5 = ((Number) objLoadAd27).intValue();
                    }
                    i2 = -32769;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 16:
                    objLoadAd7 = this.firebase.loadAd(c0396l);
                    i2 = -65537;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    objLoadAd8 = this.smaato.loadAd(c0396l);
                    i2 = -131073;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    objLoadAd9 = this.remoteconfig.loadAd(c0396l);
                    i2 = -262145;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    Object objLoadAd28 = this.vip.loadAd(c0396l);
                    if (objLoadAd28 == null) {
                        setIsVip = AbstractC2812l.isVip("thumbs", "thumbs", c0396l, setIsVip);
                    } else {
                        obj4 = objLoadAd28;
                    }
                    i2 = -524289;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 20:
                    objLoadAd10 = abstractC7188l5.loadAd(c0396l);
                    i2 = -1048577;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 21:
                    objLoadAd11 = abstractC7188l4.loadAd(c0396l);
                    i2 = -2097153;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 22:
                    objLoadAd12 = abstractC7188l5.loadAd(c0396l);
                    i2 = -4194305;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 23:
                    Object objLoadAd29 = this.metrica.loadAd(c0396l);
                    if (objLoadAd29 == null) {
                        setIsVip = AbstractC2812l.isVip("main_artists", "main_artists", c0396l, setIsVip);
                    } else {
                        obj5 = objLoadAd29;
                    }
                    i2 = -8388609;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    Object objLoadAd30 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd30 == null) {
                        setIsVip = AbstractC2812l.isVip("subtitle_badge", "subtitle_badge", c0396l, setIsVip);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd30).booleanValue();
                    }
                    i2 = -16777217;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    Object objLoadAd31 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd31 == null) {
                        setIsVip = AbstractC2812l.isVip("no_discover", "no_discover", c0396l, setIsVip);
                    } else {
                        zBooleanValue2 = ((Boolean) objLoadAd31).booleanValue();
                    }
                    i2 = -33554433;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    objLoadAd13 = this.adcel.loadAd(c0396l);
                    i2 = -67108865;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    objLoadAd14 = this.ads.loadAd(c0396l);
                    i2 = -134217729;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    objLoadAd15 = this.subscription.loadAd(c0396l);
                    i2 = -268435457;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    objLoadAd16 = this.tapsense.loadAd(c0396l);
                    i2 = -536870913;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                case 30:
                    objLoadAd17 = abstractC7188l5.loadAd(c0396l);
                    i2 = -1073741825;
                    i = i2 & i3;
                    i3 = i;
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
                default:
                    objLoadAd = obj6;
                    objLoadAd2 = obj7;
                    obj = obj8;
                    objLoadAd3 = obj9;
                    iIntValue = i4;
                    break;
            }
        }
        Object obj10 = objLoadAd;
        Object obj11 = objLoadAd2;
        Object obj12 = obj;
        Object obj13 = objLoadAd3;
        int i5 = iIntValue;
        c0396l.ads();
        if (setIsVip.size() == 0) {
            return new AudioPlaylist(i5, jLongValue, (String) obj10, (AudioPlaylist.AlbumMeta) obj11, (String) obj12, (String) obj13, iIntValue2, iIntValue3, iIntValue4, jLongValue2, (Long) objLoadAd4, (List) obj2, (Boolean) objLoadAd5, (Boolean) objLoadAd6, (List) obj3, iIntValue5, (FollowedMetadata) objLoadAd7, (OriginalPlaylist) objLoadAd8, (AlbumThumb) objLoadAd9, (List) obj4, (String) objLoadAd10, (Boolean) objLoadAd11, (String) objLoadAd12, (List) obj5, zBooleanValue, zBooleanValue2, (AudioChartInfo) objLoadAd13, (AudioPlaylistMeta) objLoadAd14, (MusicDynamicRestriction) objLoadAd15, (AudioPlaylistPermissions) objLoadAd16, (String) objLoadAd17, false, null, false, false, i3, -1);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioPlaylist)";
    }
}
