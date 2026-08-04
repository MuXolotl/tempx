package ua.itaysonlab.catalogkit.objects;

import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC15639l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkapi2.objects.music.AudioBookPerson;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.Concert;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.RecommendedPlaylist;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogLongread;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkapi2.objects.video.VKVideo;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2ResponseJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l Signature;
    public final AbstractC7188l ad;
    public final AbstractC7188l adcel;
    public final AbstractC7188l admob;
    public final AbstractC7188l ads;
    public final AbstractC7188l advert;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l firebase;
    public final AbstractC7188l isPro;
    public final AbstractC7188l isVip;
    public final AbstractC7188l license;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l metrica;
    public final AbstractC7188l mopub;
    public final AbstractC7188l pro;
    public final AbstractC7188l purchase;
    public final AbstractC7188l remoteconfig;
    public final AbstractC7188l smaato;
    public final AbstractC7188l startapp;
    public final AbstractC7188l subs;
    public final AbstractC7188l subscription;
    public final AbstractC7188l tapsense;
    public final AbstractC7188l vip;
    public final C0458l yandex = C0458l.m547strictfp("catalog", "section", "block", "replacements", "profiles", "groups", "artist_videos", "videos", "links", "audios", "playlists", "artists", "suggestions", "catalog_banners", "curators", "texts", "podcast_episodes", "podcast_slider_items", "longreads", "placeholders", "recommended_playlists", "music_owners", "audio_followings_update_info", "podcasts", "radio_stations", "audio_books", "audio_stream_mixes", "audio_books_persons", "audio_content_cards", "concerts");

    public Catalog2ResponseJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(Catalog2Root.class, c5746l, "catalog");
        this.crashlytics = c12952l.loadAd(Catalog2Section.class, c5746l, "section");
        this.amazon = c12952l.loadAd(Catalog2Block.class, c5746l, "block");
        this.purchase = c12952l.loadAd(Catalog2Replacements.class, c5746l, "replacements");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, VKProfile.class), c5746l, "profiles");
        this.mopub = c12952l.loadAd(AbstractC15639l.mopub(List.class, VKVideo.class), c5746l, "artist_videos");
        this.admob = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItem.class), c5746l, "links");
        this.subs = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioTrack.class), c5746l, "audios");
        this.isPro = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioPlaylist.class), c5746l, "playlists");
        this.firebase = c12952l.loadAd(AbstractC15639l.mopub(List.class, CatalogArtist.class), c5746l, "artists");
        this.smaato = c12952l.loadAd(AbstractC15639l.mopub(List.class, SmartSuggestion.class), c5746l, "suggestions");
        this.remoteconfig = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2Banner.class), c5746l, "catalog_banners");
        this.vip = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2Text.class), c5746l, "texts");
        this.metrica = c12952l.loadAd(AbstractC15639l.mopub(List.class, PodcastCatalogSliderItem.class), c5746l, "podcast_slider_items");
        this.startapp = c12952l.loadAd(AbstractC15639l.mopub(List.class, PodcastCatalogLongread.class), c5746l, "longreads");
        this.adcel = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2Placeholder.class), c5746l, "placeholders");
        this.ads = c12952l.loadAd(AbstractC15639l.mopub(List.class, RecommendedPlaylist.class), c5746l, "recommended_playlists");
        this.subscription = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioFollowingsUpdateInfo.class), c5746l, "audio_followings_update_info");
        this.tapsense = c12952l.loadAd(AbstractC15639l.mopub(List.class, Podcast.class), c5746l, "podcasts");
        this.Signature = c12952l.loadAd(AbstractC15639l.mopub(List.class, RadioStation.class), c5746l, "radio_stations");
        this.license = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioBook.class), c5746l, "audio_books");
        this.pro = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioStreamMix.class), c5746l, "audio_stream_mixes");
        this.ad = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioBookPerson.class), c5746l, "audio_books_persons");
        this.advert = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioContentCard.class), c5746l, "audio_content_cards");
        this.isVip = c12952l.loadAd(AbstractC15639l.mopub(List.class, Concert.class), c5746l, "concerts");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Catalog2Response catalog2Response = (Catalog2Response) obj;
        c3631l.mopub();
        c3631l.isVip("catalog");
        this.loadAd.billing(c3631l, catalog2Response.yandex);
        c3631l.isVip("section");
        this.crashlytics.billing(c3631l, catalog2Response.loadAd);
        c3631l.isVip("block");
        this.amazon.billing(c3631l, catalog2Response.crashlytics);
        c3631l.isVip("replacements");
        this.purchase.billing(c3631l, catalog2Response.amazon);
        c3631l.isVip("profiles");
        List list = catalog2Response.purchase;
        AbstractC7188l abstractC7188l = this.billing;
        abstractC7188l.billing(c3631l, list);
        c3631l.isVip("groups");
        abstractC7188l.billing(c3631l, catalog2Response.billing);
        c3631l.isVip("artist_videos");
        List list2 = catalog2Response.mopub;
        AbstractC7188l abstractC7188l2 = this.mopub;
        abstractC7188l2.billing(c3631l, list2);
        c3631l.isVip("videos");
        abstractC7188l2.billing(c3631l, catalog2Response.admob);
        c3631l.isVip("links");
        List list3 = catalog2Response.subs;
        AbstractC7188l abstractC7188l3 = this.admob;
        abstractC7188l3.billing(c3631l, list3);
        c3631l.isVip("audios");
        List list4 = catalog2Response.isPro;
        AbstractC7188l abstractC7188l4 = this.subs;
        abstractC7188l4.billing(c3631l, list4);
        c3631l.isVip("playlists");
        this.isPro.billing(c3631l, catalog2Response.firebase);
        c3631l.isVip("artists");
        this.firebase.billing(c3631l, catalog2Response.smaato);
        c3631l.isVip("suggestions");
        this.smaato.billing(c3631l, catalog2Response.remoteconfig);
        c3631l.isVip("catalog_banners");
        this.remoteconfig.billing(c3631l, catalog2Response.vip);
        c3631l.isVip("curators");
        abstractC7188l.billing(c3631l, catalog2Response.metrica);
        c3631l.isVip("texts");
        this.vip.billing(c3631l, catalog2Response.startapp);
        c3631l.isVip("podcast_episodes");
        abstractC7188l4.billing(c3631l, catalog2Response.adcel);
        c3631l.isVip("podcast_slider_items");
        this.metrica.billing(c3631l, catalog2Response.ads);
        c3631l.isVip("longreads");
        this.startapp.billing(c3631l, catalog2Response.subscription);
        c3631l.isVip("placeholders");
        this.adcel.billing(c3631l, catalog2Response.tapsense);
        c3631l.isVip("recommended_playlists");
        this.ads.billing(c3631l, catalog2Response.Signature);
        c3631l.isVip("music_owners");
        abstractC7188l3.billing(c3631l, catalog2Response.license);
        c3631l.isVip("audio_followings_update_info");
        this.subscription.billing(c3631l, catalog2Response.pro);
        c3631l.isVip("podcasts");
        this.tapsense.billing(c3631l, catalog2Response.ad);
        c3631l.isVip("radio_stations");
        this.Signature.billing(c3631l, catalog2Response.advert);
        c3631l.isVip("audio_books");
        this.license.billing(c3631l, catalog2Response.isVip);
        c3631l.isVip("audio_stream_mixes");
        this.pro.billing(c3631l, catalog2Response.signatures);
        c3631l.isVip("audio_books_persons");
        this.ad.billing(c3631l, catalog2Response.premium);
        c3631l.isVip("audio_content_cards");
        this.advert.billing(c3631l, catalog2Response.applovin);
        c3631l.isVip("concerts");
        this.isVip.billing(c3631l, catalog2Response.appmetrica);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int i;
        c0396l.billing();
        Object objLoadAd = null;
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
        Object objLoadAd14 = null;
        Object objLoadAd15 = null;
        Object objLoadAd16 = null;
        Object objLoadAd17 = null;
        Object objLoadAd18 = null;
        Object objLoadAd19 = null;
        Object objLoadAd20 = null;
        Object objLoadAd21 = null;
        Object objLoadAd22 = null;
        Object objLoadAd23 = null;
        Object objLoadAd24 = null;
        Object objLoadAd25 = null;
        Object objLoadAd26 = null;
        Object objLoadAd27 = null;
        Object objLoadAd28 = null;
        Object objLoadAd29 = null;
        int i2 = -1;
        Object objLoadAd30 = null;
        while (c0396l.m504package()) {
            Object obj = objLoadAd30;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.mopub;
            Object obj2 = objLoadAd;
            AbstractC7188l abstractC7188l2 = this.subs;
            Object obj3 = objLoadAd2;
            AbstractC7188l abstractC7188l3 = this.admob;
            Object obj4 = objLoadAd3;
            AbstractC7188l abstractC7188l4 = this.billing;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 0:
                    objLoadAd29 = this.loadAd.loadAd(c0396l);
                    i2 &= -2;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 1:
                    objLoadAd30 = this.crashlytics.loadAd(c0396l);
                    i2 &= -3;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 2:
                    objLoadAd = this.amazon.loadAd(c0396l);
                    i2 &= -5;
                    objLoadAd30 = obj;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 3:
                    objLoadAd2 = this.purchase.loadAd(c0396l);
                    i2 &= -9;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd3 = obj4;
                    break;
                case 4:
                    objLoadAd3 = abstractC7188l4.loadAd(c0396l);
                    i2 &= -17;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    break;
                case 5:
                    objLoadAd4 = abstractC7188l4.loadAd(c0396l);
                    i2 &= -33;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 6:
                    objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    i2 &= -65;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 7:
                    objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    i2 &= -129;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 8:
                    objLoadAd7 = abstractC7188l3.loadAd(c0396l);
                    i2 &= -257;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 9:
                    objLoadAd8 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -513;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 10:
                    objLoadAd9 = this.isPro.loadAd(c0396l);
                    i2 &= -1025;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 11:
                    objLoadAd10 = this.firebase.loadAd(c0396l);
                    i2 &= -2049;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 12:
                    objLoadAd11 = this.smaato.loadAd(c0396l);
                    i2 &= -4097;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 13:
                    objLoadAd12 = this.remoteconfig.loadAd(c0396l);
                    i2 &= -8193;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 14:
                    objLoadAd13 = abstractC7188l4.loadAd(c0396l);
                    i2 &= -16385;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 15:
                    objLoadAd14 = this.vip.loadAd(c0396l);
                    i = -32769;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 16:
                    objLoadAd15 = abstractC7188l2.loadAd(c0396l);
                    i = -65537;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    objLoadAd16 = this.metrica.loadAd(c0396l);
                    i = -131073;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    objLoadAd17 = this.startapp.loadAd(c0396l);
                    i = -262145;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    objLoadAd18 = this.adcel.loadAd(c0396l);
                    i = -524289;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 20:
                    objLoadAd19 = this.ads.loadAd(c0396l);
                    i = -1048577;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 21:
                    objLoadAd20 = abstractC7188l3.loadAd(c0396l);
                    i = -2097153;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 22:
                    objLoadAd21 = this.subscription.loadAd(c0396l);
                    i = -4194305;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case 23:
                    objLoadAd22 = this.tapsense.loadAd(c0396l);
                    i = -8388609;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    objLoadAd23 = this.Signature.loadAd(c0396l);
                    i = -16777217;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    objLoadAd24 = this.license.loadAd(c0396l);
                    i = -33554433;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    objLoadAd25 = this.pro.loadAd(c0396l);
                    i = -67108865;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    objLoadAd26 = this.ad.loadAd(c0396l);
                    i = -134217729;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    objLoadAd27 = this.advert.loadAd(c0396l);
                    i = -268435457;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    objLoadAd28 = this.isVip.loadAd(c0396l);
                    i = -536870913;
                    i2 &= i;
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
                default:
                    objLoadAd30 = obj;
                    objLoadAd = obj2;
                    objLoadAd2 = obj3;
                    objLoadAd3 = obj4;
                    break;
            }
        }
        Object obj5 = objLoadAd30;
        Object obj6 = objLoadAd;
        Object obj7 = objLoadAd2;
        Object obj8 = objLoadAd3;
        c0396l.ads();
        return i2 == -1073741824 ? new Catalog2Response((Catalog2Root) objLoadAd29, (Catalog2Section) obj5, (Catalog2Block) obj6, (Catalog2Replacements) obj7, (List) obj8, (List) objLoadAd4, (List) objLoadAd5, (List) objLoadAd6, (List) objLoadAd7, (List) objLoadAd8, (List) objLoadAd9, (List) objLoadAd10, (List) objLoadAd11, (List) objLoadAd12, (List) objLoadAd13, (List) objLoadAd14, (List) objLoadAd15, (List) objLoadAd16, (List) objLoadAd17, (List) objLoadAd18, (List) objLoadAd19, (List) objLoadAd20, (List) objLoadAd21, (List) objLoadAd22, (List) objLoadAd23, (List) objLoadAd24, (List) objLoadAd25, (List) objLoadAd26, (List) objLoadAd27, (List) objLoadAd28) : new Catalog2Response((Catalog2Root) objLoadAd29, (Catalog2Section) obj5, (Catalog2Block) obj6, (Catalog2Replacements) obj7, (List) obj8, (List) objLoadAd4, (List) objLoadAd5, (List) objLoadAd6, (List) objLoadAd7, (List) objLoadAd8, (List) objLoadAd9, (List) objLoadAd10, (List) objLoadAd11, (List) objLoadAd12, (List) objLoadAd13, (List) objLoadAd14, (List) objLoadAd15, (List) objLoadAd16, (List) objLoadAd17, (List) objLoadAd18, (List) objLoadAd19, (List) objLoadAd20, (List) objLoadAd21, (List) objLoadAd22, (List) objLoadAd23, (List) objLoadAd24, (List) objLoadAd25, (List) objLoadAd26, (List) objLoadAd27, (List) objLoadAd28, i2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Response)";
    }
}
