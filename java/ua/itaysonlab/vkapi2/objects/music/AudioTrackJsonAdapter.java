package ua.itaysonlab.vkapi2.objects.music;

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
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioTrackJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l firebase;
    public final AbstractC7188l isPro;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final AbstractC7188l smaato;
    public final AbstractC7188l subs;
    public final C0458l yandex = C0458l.m547strictfp("artist", "id", "owner_id", "title", "duration", "access_key", "is_explicit", "is_licensed", "track_code", "url", "date", "genre_id", "content_restricted", "album", "lyrics_id", "main_artists", "featured_artists", "subtitle", "track_genre_id", "album_part_number", "is_hq", "is_focus_track", "has_lyrics", "dislike", "podcast_info", "audio_chart_info", "stream_duration", "release_audio_id", "like");

    public AudioTrackJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "artist");
        this.crashlytics = c12952l.loadAd(Integer.TYPE, c5746l, "id");
        this.amazon = c12952l.loadAd(Long.TYPE, c5746l, "owner_id");
        this.purchase = c12952l.loadAd(String.class, c5746l, "access_key");
        this.billing = c12952l.loadAd(Boolean.TYPE, c5746l, "is_explicit");
        this.mopub = c12952l.loadAd(Integer.class, c5746l, "genre_id");
        this.admob = c12952l.loadAd(AudioAlbum.class, c5746l, "album");
        this.subs = c12952l.loadAd(AbstractC15639l.mopub(List.class, MainArtist.class), c5746l, "main_artists");
        this.isPro = c12952l.loadAd(PodcastInfo.class, c5746l, "podcast_info");
        this.firebase = c12952l.loadAd(AudioChartInfo.class, c5746l, "audio_chart_info");
        this.smaato = c12952l.loadAd(Boolean.class, c5746l, "like");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioTrack audioTrack = (AudioTrack) obj;
        c3631l.mopub();
        c3631l.isVip("artist");
        String str = audioTrack.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("id");
        int i = audioTrack.loadAd;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        AbstractC12589l.inmobi(i, abstractC7188l2, c3631l, "owner_id");
        long j = audioTrack.crashlytics;
        AbstractC7188l abstractC7188l3 = this.amazon;
        AbstractC12589l.m3427throws(j, abstractC7188l3, c3631l, "title");
        abstractC7188l.billing(c3631l, audioTrack.amazon);
        c3631l.isVip("duration");
        AbstractC12589l.inmobi(audioTrack.purchase, abstractC7188l2, c3631l, "access_key");
        String str2 = audioTrack.billing;
        AbstractC7188l abstractC7188l4 = this.purchase;
        abstractC7188l4.billing(c3631l, str2);
        c3631l.isVip("is_explicit");
        boolean z = audioTrack.mopub;
        AbstractC7188l abstractC7188l5 = this.billing;
        AbstractC12589l.m3428volatile(z, abstractC7188l5, c3631l, "is_licensed");
        AbstractC12589l.m3428volatile(audioTrack.admob, abstractC7188l5, c3631l, "track_code");
        abstractC7188l.billing(c3631l, audioTrack.subs);
        c3631l.isVip("url");
        abstractC7188l.billing(c3631l, audioTrack.isPro);
        c3631l.isVip("date");
        AbstractC12589l.m3427throws(audioTrack.firebase, abstractC7188l3, c3631l, "genre_id");
        Integer num = audioTrack.smaato;
        AbstractC7188l abstractC7188l6 = this.mopub;
        abstractC7188l6.billing(c3631l, num);
        c3631l.isVip("content_restricted");
        AbstractC12589l.inmobi(audioTrack.remoteconfig, abstractC7188l2, c3631l, "album");
        this.admob.billing(c3631l, audioTrack.vip);
        c3631l.isVip("lyrics_id");
        abstractC7188l6.billing(c3631l, audioTrack.metrica);
        c3631l.isVip("main_artists");
        List list = audioTrack.startapp;
        AbstractC7188l abstractC7188l7 = this.subs;
        abstractC7188l7.billing(c3631l, list);
        c3631l.isVip("featured_artists");
        abstractC7188l7.billing(c3631l, audioTrack.adcel);
        c3631l.isVip("subtitle");
        abstractC7188l4.billing(c3631l, audioTrack.ads);
        c3631l.isVip("track_genre_id");
        abstractC7188l6.billing(c3631l, audioTrack.subscription);
        c3631l.isVip("album_part_number");
        abstractC7188l6.billing(c3631l, audioTrack.tapsense);
        c3631l.isVip("is_hq");
        AbstractC12589l.m3428volatile(audioTrack.Signature, abstractC7188l5, c3631l, "is_focus_track");
        AbstractC12589l.m3428volatile(audioTrack.license, abstractC7188l5, c3631l, "has_lyrics");
        AbstractC12589l.m3428volatile(audioTrack.pro, abstractC7188l5, c3631l, "dislike");
        AbstractC12589l.m3428volatile(audioTrack.ad, abstractC7188l5, c3631l, "podcast_info");
        this.isPro.billing(c3631l, audioTrack.advert);
        c3631l.isVip("audio_chart_info");
        this.firebase.billing(c3631l, audioTrack.isVip);
        c3631l.isVip("stream_duration");
        AbstractC12589l.inmobi(audioTrack.signatures, abstractC7188l2, c3631l, "release_audio_id");
        abstractC7188l4.billing(c3631l, audioTrack.premium);
        c3631l.isVip("like");
        this.smaato.billing(c3631l, audioTrack.applovin);
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
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        int iIntValue3 = 0;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        boolean zBooleanValue6 = false;
        int iIntValue4 = 0;
        long jLongValue = 0;
        long jLongValue2 = 0;
        Object obj = null;
        Object obj2 = null;
        Object objLoadAd = null;
        Object obj3 = null;
        Object obj4 = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        Object objLoadAd7 = null;
        Object objLoadAd8 = null;
        Object objLoadAd9 = null;
        Object objLoadAd10 = null;
        Object objLoadAd11 = null;
        Object objLoadAd12 = null;
        Object objLoadAd13 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.amazon;
            Object obj5 = obj;
            AbstractC7188l abstractC7188l2 = this.subs;
            Object obj6 = obj2;
            AbstractC7188l abstractC7188l3 = this.purchase;
            Object obj7 = objLoadAd;
            AbstractC7188l abstractC7188l4 = this.loadAd;
            Object obj8 = obj3;
            AbstractC7188l abstractC7188l5 = this.mopub;
            Object obj9 = obj4;
            AbstractC7188l abstractC7188l6 = this.crashlytics;
            int i4 = iIntValue;
            AbstractC7188l abstractC7188l7 = this.billing;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 0:
                    Object objLoadAd14 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd14 == null) {
                        setIsVip = AbstractC2812l.isVip("artist", "artist", c0396l, setIsVip);
                        obj = obj5;
                    } else {
                        obj = objLoadAd14;
                    }
                    i3 &= -2;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 1:
                    Object objLoadAd15 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd15 == null) {
                        setIsVip = AbstractC2812l.isVip("id", "id", c0396l, setIsVip);
                        iIntValue = i4;
                    } else {
                        iIntValue = ((Number) objLoadAd15).intValue();
                    }
                    i3 &= -3;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    break;
                case 2:
                    Object objLoadAd16 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd16 == null) {
                        setIsVip = AbstractC2812l.isVip("owner_id", "owner_id", c0396l, setIsVip);
                    } else {
                        jLongValue = ((Number) objLoadAd16).longValue();
                    }
                    i = i3 & (-5);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 3:
                    Object objLoadAd17 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd17 == null) {
                        setIsVip = AbstractC2812l.isVip("title", "title", c0396l, setIsVip);
                        obj2 = obj6;
                    } else {
                        obj2 = objLoadAd17;
                    }
                    i3 &= -9;
                    obj = obj5;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 4:
                    Object objLoadAd18 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd18 == null) {
                        setIsVip = AbstractC2812l.isVip("duration", "duration", c0396l, setIsVip);
                    } else {
                        iIntValue2 = ((Number) objLoadAd18).intValue();
                    }
                    i = i3 & (-17);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 5:
                    objLoadAd = abstractC7188l3.loadAd(c0396l);
                    i3 &= -33;
                    obj = obj5;
                    obj2 = obj6;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 6:
                    Object objLoadAd19 = abstractC7188l7.loadAd(c0396l);
                    if (objLoadAd19 == null) {
                        setIsVip = AbstractC2812l.isVip("is_explicit", "is_explicit", c0396l, setIsVip);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd19).booleanValue();
                    }
                    i = i3 & (-65);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 7:
                    Object objLoadAd20 = abstractC7188l7.loadAd(c0396l);
                    if (objLoadAd20 == null) {
                        setIsVip = AbstractC2812l.isVip("is_licensed", "is_licensed", c0396l, setIsVip);
                    } else {
                        zBooleanValue2 = ((Boolean) objLoadAd20).booleanValue();
                    }
                    i = i3 & (-129);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 8:
                    Object objLoadAd21 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd21 == null) {
                        setIsVip = AbstractC2812l.isVip("track_code", "track_code", c0396l, setIsVip);
                        obj3 = obj8;
                    } else {
                        obj3 = objLoadAd21;
                    }
                    i3 &= -257;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 9:
                    Object objLoadAd22 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd22 == null) {
                        setIsVip = AbstractC2812l.isVip("url", "url", c0396l, setIsVip);
                        obj4 = obj9;
                    } else {
                        obj4 = objLoadAd22;
                    }
                    i3 &= -513;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    iIntValue = i4;
                    break;
                case 10:
                    Object objLoadAd23 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd23 == null) {
                        setIsVip = AbstractC2812l.isVip("date", "date", c0396l, setIsVip);
                    } else {
                        jLongValue2 = ((Number) objLoadAd23).longValue();
                    }
                    i = i3 & (-1025);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 11:
                    objLoadAd2 = abstractC7188l5.loadAd(c0396l);
                    i = i3 & (-2049);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 12:
                    Object objLoadAd24 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd24 == null) {
                        setIsVip = AbstractC2812l.isVip("content_restricted", "content_restricted", c0396l, setIsVip);
                    } else {
                        iIntValue3 = ((Number) objLoadAd24).intValue();
                    }
                    i = i3 & (-4097);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 13:
                    objLoadAd3 = this.admob.loadAd(c0396l);
                    i = i3 & (-8193);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 14:
                    objLoadAd4 = abstractC7188l5.loadAd(c0396l);
                    i = i3 & (-16385);
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 15:
                    objLoadAd5 = abstractC7188l2.loadAd(c0396l);
                    i2 = -32769;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 16:
                    objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    i2 = -65537;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    objLoadAd7 = abstractC7188l3.loadAd(c0396l);
                    i2 = -131073;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    objLoadAd8 = abstractC7188l5.loadAd(c0396l);
                    i2 = -262145;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    objLoadAd9 = abstractC7188l5.loadAd(c0396l);
                    i2 = -524289;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 20:
                    Object objLoadAd25 = abstractC7188l7.loadAd(c0396l);
                    if (objLoadAd25 == null) {
                        setIsVip = AbstractC2812l.isVip("is_hq", "is_hq", c0396l, setIsVip);
                    } else {
                        zBooleanValue3 = ((Boolean) objLoadAd25).booleanValue();
                    }
                    i2 = -1048577;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 21:
                    Object objLoadAd26 = abstractC7188l7.loadAd(c0396l);
                    if (objLoadAd26 == null) {
                        setIsVip = AbstractC2812l.isVip("is_focus_track", "is_focus_track", c0396l, setIsVip);
                    } else {
                        zBooleanValue4 = ((Boolean) objLoadAd26).booleanValue();
                    }
                    i2 = -2097153;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 22:
                    Object objLoadAd27 = abstractC7188l7.loadAd(c0396l);
                    if (objLoadAd27 == null) {
                        setIsVip = AbstractC2812l.isVip("has_lyrics", "has_lyrics", c0396l, setIsVip);
                    } else {
                        zBooleanValue5 = ((Boolean) objLoadAd27).booleanValue();
                    }
                    i2 = -4194305;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case 23:
                    Object objLoadAd28 = abstractC7188l7.loadAd(c0396l);
                    if (objLoadAd28 == null) {
                        setIsVip = AbstractC2812l.isVip("dislike", "dislike", c0396l, setIsVip);
                    } else {
                        zBooleanValue6 = ((Boolean) objLoadAd28).booleanValue();
                    }
                    i2 = -8388609;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    objLoadAd10 = this.isPro.loadAd(c0396l);
                    i2 = -16777217;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    objLoadAd11 = this.firebase.loadAd(c0396l);
                    i2 = -33554433;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    Object objLoadAd29 = abstractC7188l6.loadAd(c0396l);
                    if (objLoadAd29 == null) {
                        setIsVip = AbstractC2812l.isVip("stream_duration", "stream_duration", c0396l, setIsVip);
                    } else {
                        iIntValue4 = ((Number) objLoadAd29).intValue();
                    }
                    i2 = -67108865;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    objLoadAd12 = abstractC7188l3.loadAd(c0396l);
                    i2 = -134217729;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    objLoadAd13 = this.smaato.loadAd(c0396l);
                    i2 = -268435457;
                    i = i2 & i3;
                    i3 = i;
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
                default:
                    obj = obj5;
                    obj2 = obj6;
                    objLoadAd = obj7;
                    obj3 = obj8;
                    obj4 = obj9;
                    iIntValue = i4;
                    break;
            }
        }
        Object obj10 = obj;
        Object obj11 = obj2;
        Object obj12 = objLoadAd;
        Object obj13 = obj3;
        Object obj14 = obj4;
        int i5 = iIntValue;
        c0396l.ads();
        if (setIsVip.size() == 0) {
            return new AudioTrack((String) obj10, i5, jLongValue, (String) obj11, iIntValue2, (String) obj12, zBooleanValue, zBooleanValue2, (String) obj13, (String) obj14, jLongValue2, (Integer) objLoadAd2, iIntValue3, (AudioAlbum) objLoadAd3, (Integer) objLoadAd4, (List) objLoadAd5, (List) objLoadAd6, (String) objLoadAd7, (Integer) objLoadAd8, (Integer) objLoadAd9, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, (PodcastInfo) objLoadAd10, (AudioChartInfo) objLoadAd11, iIntValue4, (String) objLoadAd12, (Boolean) objLoadAd13, false, false, false, false, false, i3, -1);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioTrack)";
    }
}
