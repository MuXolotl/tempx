package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: renamed from: lؙؖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4391l extends AbstractC11779l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15333l f8922l;

    static {
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch(EnumC17969l.ACOUSTID_FINGERPRINT, EnumC14884l.f29160l);
        c13698lYandex.mo3668catch(EnumC17969l.ACOUSTID_ID, EnumC14884l.f29135l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM, EnumC14884l.f29207l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTIST, EnumC14884l.f29206l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTISTS, EnumC14884l.f29136l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTISTS_SORT, EnumC14884l.f29142l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTIST_SORT, EnumC14884l.f29250l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_SORT, EnumC14884l.f29200l);
        c13698lYandex.mo3668catch(EnumC17969l.AMAZON_ID, EnumC14884l.f29169l);
        c13698lYandex.mo3668catch(EnumC17969l.ARRANGER, EnumC14884l.f29253l);
        c13698lYandex.mo3668catch(EnumC17969l.ARRANGER_SORT, EnumC14884l.f29234l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTIST, EnumC14884l.f29128l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTISTS, EnumC14884l.f29259l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTISTS_SORT, EnumC14884l.f29154l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTIST_SORT, EnumC14884l.f29205l);
        c13698lYandex.mo3668catch(EnumC17969l.BARCODE, EnumC14884l.f29266l);
        c13698lYandex.mo3668catch(EnumC17969l.BPM, EnumC14884l.f29167l);
        c13698lYandex.mo3668catch(EnumC17969l.CATALOG_NO, EnumC14884l.f29141l);
        c13698lYandex.mo3668catch(EnumC17969l.CHOIR, EnumC14884l.f29138l);
        c13698lYandex.mo3668catch(EnumC17969l.CHOIR_SORT, EnumC14884l.f29127l);
        c13698lYandex.mo3668catch(EnumC17969l.CLASSICAL_CATALOG, EnumC14884l.f29267l);
        c13698lYandex.mo3668catch(EnumC17969l.CLASSICAL_NICKNAME, EnumC14884l.f29157l);
        c13698lYandex.mo3668catch(EnumC17969l.COMMENT, EnumC14884l.f29193l);
        c13698lYandex.mo3668catch(EnumC17969l.COMPOSER, EnumC14884l.f29125l);
        c13698lYandex.mo3668catch(EnumC17969l.COMPOSER_SORT, EnumC14884l.f29178l);
        c13698lYandex.mo3668catch(EnumC17969l.CONDUCTOR, EnumC14884l.f29226l);
        c13698lYandex.mo3668catch(EnumC17969l.CONDUCTOR_SORT, EnumC14884l.f29264l);
        c13698lYandex.mo3668catch(EnumC17969l.COUNTRY, EnumC14884l.f29170l);
        c13698lYandex.mo3668catch(EnumC17969l.COVER_ART, EnumC14884l.f29140l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM1, EnumC14884l.f29254l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM2, EnumC14884l.f29156l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM3, EnumC14884l.f29201l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM4, EnumC14884l.f29229l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM5, EnumC14884l.f29153l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_NO, EnumC14884l.f29155l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_SUBTITLE, EnumC14884l.f29132l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_TOTAL, EnumC14884l.f29159l);
        c13698lYandex.mo3668catch(EnumC17969l.DJMIXER, EnumC14884l.f29220l);
        c13698lYandex.mo3668catch(EnumC17969l.ENCODER, EnumC14884l.VENDOR);
        c13698lYandex.mo3668catch(EnumC17969l.ENGINEER, EnumC14884l.f29177l);
        c13698lYandex.mo3668catch(EnumC17969l.ENSEMBLE, EnumC14884l.f29137l);
        c13698lYandex.mo3668catch(EnumC17969l.ENSEMBLE_SORT, EnumC14884l.f29257l);
        c13698lYandex.mo3668catch(EnumC17969l.FBPM, EnumC14884l.f29265l);
        c13698lYandex.mo3668catch(EnumC17969l.GENRE, EnumC14884l.f29149l);
        c13698lYandex.mo3668catch(EnumC17969l.GROUPING, EnumC14884l.f29143l);
        c13698lYandex.mo3668catch(EnumC17969l.INVOLVED_PERSON, EnumC14884l.f29188l);
        c13698lYandex.mo3668catch(EnumC17969l.ISRC, EnumC14884l.f29221l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_CLASSICAL, EnumC14884l.f29166l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_COMPILATION, EnumC14884l.f29227l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_SOUNDTRACK, EnumC14884l.f29224l);
        c13698lYandex.mo3668catch(EnumC17969l.KEY, EnumC14884l.KEY);
        c13698lYandex.mo3668catch(EnumC17969l.LANGUAGE, EnumC14884l.LANGUAGE);
        c13698lYandex.mo3668catch(EnumC17969l.LYRICIST, EnumC14884l.f29252l);
        c13698lYandex.mo3668catch(EnumC17969l.LYRICS, EnumC14884l.f29228l);
        c13698lYandex.mo3668catch(EnumC17969l.MEDIA, EnumC14884l.f29146l);
        c13698lYandex.mo3668catch(EnumC17969l.MIXER, EnumC14884l.f29122l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD, EnumC14884l.f29231l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_ACOUSTIC, EnumC14884l.f29203l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_AGGRESSIVE, EnumC14884l.f29216l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_AROUSAL, EnumC14884l.f29248l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_DANCEABILITY, EnumC14884l.f29151l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_ELECTRONIC, EnumC14884l.f29181l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_HAPPY, EnumC14884l.f29134l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_INSTRUMENTAL, EnumC14884l.f29261l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_PARTY, EnumC14884l.f29268l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_RELAXED, EnumC14884l.f29232l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_SAD, EnumC14884l.f29189l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_VALENCE, EnumC14884l.f29164l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT, EnumC14884l.f29187l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT_NO, EnumC14884l.f29256l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT_TOTAL, EnumC14884l.f29244l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_ARTISTID, EnumC14884l.f29258l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_DISC_ID, EnumC14884l.f29186l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC14884l.f29152l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASEARTISTID, EnumC14884l.f29209l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASEID, EnumC14884l.f29165l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_COUNTRY, EnumC14884l.f29163l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC14884l.f29176l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_STATUS, EnumC14884l.f29260l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC14884l.f29158l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_TYPE, EnumC14884l.f29214l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_TRACK_ID, EnumC14884l.f29139l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK, EnumC14884l.f29225l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION, EnumC14884l.f29251l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC14884l.f29246l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_ID, EnumC14884l.f29148l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC14884l.f29215l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC14884l.f29120l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC14884l.f29219l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC14884l.f29174l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC14884l.f29171l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC14884l.f29173l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC14884l.f29190l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC14884l.f29269l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC14884l.f29192l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC14884l.f29131l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC14884l.f29233l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC14884l.f29242l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC14884l.f29240l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC14884l.f29218l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC14884l.f29185l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC14884l.f29118l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC14884l.f29245l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC14884l.f29145l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICIP_ID, EnumC14884l.f29195l);
        c13698lYandex.mo3668catch(EnumC17969l.OCCASION, EnumC14884l.f29133l);
        c13698lYandex.mo3668catch(EnumC17969l.OPUS, EnumC14884l.f29236l);
        c13698lYandex.mo3668catch(EnumC17969l.ORCHESTRA, EnumC14884l.f29202l);
        c13698lYandex.mo3668catch(EnumC17969l.ORCHESTRA_SORT, EnumC14884l.f29180l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_ALBUM, EnumC14884l.f29123l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_ARTIST, EnumC14884l.f29247l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_LYRICIST, EnumC14884l.f29197l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_YEAR, EnumC14884l.f29239l);
        c13698lYandex.mo3668catch(EnumC17969l.PART, EnumC14884l.f29161l);
        c13698lYandex.mo3668catch(EnumC17969l.PART_NUMBER, EnumC14884l.f29182l);
        c13698lYandex.mo3668catch(EnumC17969l.PART_TYPE, EnumC14884l.f29262l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER, EnumC14884l.f29147l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER_NAME, EnumC14884l.f29230l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER_NAME_SORT, EnumC14884l.f29130l);
        c13698lYandex.mo3668catch(EnumC17969l.PERIOD, EnumC14884l.f29179l);
        c13698lYandex.mo3668catch(EnumC17969l.PRODUCER, EnumC14884l.f29204l);
        c13698lYandex.mo3668catch(EnumC17969l.QUALITY, EnumC14884l.f29162l);
        c13698lYandex.mo3668catch(EnumC17969l.RANKING, EnumC14884l.f29175l);
        c13698lYandex.mo3668catch(EnumC17969l.RATING, EnumC14884l.f29235l);
        c13698lYandex.mo3668catch(EnumC17969l.RECORD_LABEL, EnumC14884l.f29119l);
        c13698lYandex.mo3668catch(EnumC17969l.REMIXER, EnumC14884l.f29199l);
        c13698lYandex.mo3668catch(EnumC17969l.SCRIPT, EnumC14884l.f29194l);
        c13698lYandex.mo3668catch(EnumC17969l.SINGLE_DISC_TRACK_NO, EnumC14884l.f29223l);
        c13698lYandex.mo3668catch(EnumC17969l.SUBTITLE, EnumC14884l.f29144l);
        c13698lYandex.mo3668catch(EnumC17969l.TAGS, EnumC14884l.f29210l);
        c13698lYandex.mo3668catch(EnumC17969l.TEMPO, EnumC14884l.f29183l);
        c13698lYandex.mo3668catch(EnumC17969l.TIMBRE, EnumC14884l.f29184l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE, EnumC14884l.f29196l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE_MOVEMENT, EnumC14884l.f29255l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE_SORT, EnumC14884l.f29129l);
        c13698lYandex.mo3668catch(EnumC17969l.TONALITY, EnumC14884l.f29241l);
        c13698lYandex.mo3668catch(EnumC17969l.TRACK, EnumC14884l.f29121l);
        c13698lYandex.mo3668catch(EnumC17969l.TRACK_TOTAL, EnumC14884l.f29217l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_DISCOGS_ARTIST_SITE, EnumC14884l.f29211l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_DISCOGS_RELEASE_SITE, EnumC14884l.f29198l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_LYRICS_SITE, EnumC14884l.f29243l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_OFFICIAL_ARTIST_SITE, EnumC14884l.f29249l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_OFFICIAL_RELEASE_SITE, EnumC14884l.f29213l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_WIKIPEDIA_ARTIST_SITE, EnumC14884l.f29124l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_WIKIPEDIA_RELEASE_SITE, EnumC14884l.f29191l);
        c13698lYandex.mo3668catch(EnumC17969l.WORK, EnumC14884l.f29172l);
        c13698lYandex.mo3668catch(EnumC17969l.WORK_TYPE, EnumC14884l.f29222l);
        c13698lYandex.mo3668catch(EnumC17969l.YEAR, EnumC14884l.f29126l);
        f8922l = c13698lYandex.metrica(true);
    }

    public static EnumC14884l Signature(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        EnumC14884l enumC14884l = (EnumC14884l) f8922l.get(enumC17969l);
        if (enumC14884l != null) {
            return enumC14884l;
        }
        throw new C6451l(enumC17969l.name(), 18, (byte) 0);
    }

    public static C4391l tapsense() {
        C4391l c4391l = new C4391l();
        c4391l.remoteconfig(new C2143l(EnumC14884l.VENDOR.f29270l, 1, "ealvatag"));
        return c4391l;
    }

    @Override // defpackage.AbstractC11779l
    public final void billing(InterfaceC4656l interfaceC4656l) {
        if (interfaceC4656l.getId().equals(EnumC14884l.VENDOR.f29270l)) {
            remoteconfig(interfaceC4656l);
        } else {
            super.billing(interfaceC4656l);
        }
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        return ads(Signature(EnumC17969l.COVER_ART).f29270l);
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) {
        if (enumC17969l != EnumC17969l.ALBUM_ARTIST) {
            remoteconfig(yandex(enumC17969l, strArr));
            return this;
        }
        C6356l.amazon();
        remoteconfig(yandex(enumC17969l, (String) AbstractC6745l.crashlytics(strArr)));
        return this;
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final boolean isEmpty() {
        return this.f23579l.size() <= 1;
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final InterfaceC15476l metrica(AbstractC5859l abstractC5859l) {
        AbstractC6745l.loadAd(abstractC5859l, "artwork");
        remoteconfig(smaato(abstractC5859l));
        EnumC14884l enumC14884l = EnumC14884l.f29237l;
        AbstractC6745l.yandex(enumC14884l);
        String str = enumC14884l.f29270l;
        List listAdcel = adcel(str);
        if ((listAdcel.size() != 0 ? ((InterfaceC4656l) listAdcel.get(0)).toString() : "").length() > 0) {
            admob(str);
            EnumC14884l enumC14884l2 = EnumC14884l.f29117l;
            AbstractC6745l.yandex(enumC14884l2);
            admob(enumC14884l2.f29270l);
        }
        return this;
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        return adcel(Signature(enumC17969l).f29270l).size() != 0;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        if (enumC17969l != EnumC17969l.ALBUM_ARTIST) {
            return subscription(Signature(enumC17969l).f29270l);
        }
        C6356l.amazon();
        AbstractC17238l abstractC17238lSubscription = subscription(EnumC14884l.f29206l.f29270l);
        return !abstractC17238lSubscription.crashlytics() ? subscription(EnumC14884l.f29238l.f29270l) : abstractC17238lSubscription;
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) throws C9706l {
        try {
            EnumC14884l enumC14884l = EnumC14884l.f29140l;
            abstractC5859l.getClass();
            if (!abstractC5859l.yandex()) {
                throw new C9706l("Unable to create MetadataBlockDataPicture from buffered");
            }
            return new C2143l(enumC14884l.f29270l, 1, new String(AbstractC2131l.yandex(new C1562l(abstractC5859l.yandex, abstractC5859l.crashlytics, abstractC5859l.loadAd, abstractC5859l.amazon, abstractC5859l.purchase).billing())));
        } catch (UnsupportedEncodingException e) {
            throw new C9706l(e);
        }
    }

    @Override // defpackage.AbstractC11779l
    public final String toString() {
        return "OGG ".concat(super.toString());
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return f8922l.keySet();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        return new C2143l(Signature(enumC17969l).f29270l, 1, (String) AbstractC6745l.amazon(strArr, "values"));
    }
}
