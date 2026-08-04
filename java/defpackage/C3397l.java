package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؕٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3397l extends AbstractC11779l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15333l f7240l;

    static {
        new C16530l(0);
        new C9934l(0);
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch(EnumC17969l.ACOUSTID_FINGERPRINT, EnumC16541l.f32455l);
        c13698lYandex.mo3668catch(EnumC17969l.ACOUSTID_ID, EnumC16541l.f32344l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM, EnumC16541l.ALBUM);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTIST, EnumC16541l.ALBUM_ARTIST);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTIST_SORT, EnumC16541l.ALBUM_ARTIST_SORT);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTISTS, EnumC16541l.f32376l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTISTS_SORT, EnumC16541l.f32471l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_SORT, EnumC16541l.ALBUM_SORT);
        c13698lYandex.mo3668catch(EnumC17969l.AMAZON_ID, EnumC16541l.f32346l);
        c13698lYandex.mo3668catch(EnumC17969l.ARRANGER, EnumC16541l.f32439l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTIST, EnumC16541l.ARTIST);
        c13698lYandex.mo3668catch(EnumC17969l.ARTISTS, EnumC16541l.f32412l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTIST_SORT, EnumC16541l.ARTIST_SORT);
        c13698lYandex.mo3668catch(EnumC17969l.BARCODE, EnumC16541l.f32336l);
        c13698lYandex.mo3668catch(EnumC17969l.BPM, EnumC16541l.f32472l);
        c13698lYandex.mo3668catch(EnumC17969l.CATALOG_NO, EnumC16541l.f32365l);
        c13698lYandex.mo3668catch(EnumC17969l.CHOIR, EnumC16541l.f32400l);
        c13698lYandex.mo3668catch(EnumC17969l.CHOIR_SORT, EnumC16541l.f32432l);
        c13698lYandex.mo3668catch(EnumC17969l.CLASSICAL_CATALOG, EnumC16541l.f32334l);
        c13698lYandex.mo3668catch(EnumC17969l.CLASSICAL_NICKNAME, EnumC16541l.f32385l);
        c13698lYandex.mo3668catch(EnumC17969l.COMMENT, EnumC16541l.COMMENT);
        c13698lYandex.mo3668catch(EnumC17969l.COMPOSER, EnumC16541l.COMPOSER);
        c13698lYandex.mo3668catch(EnumC17969l.COMPOSER_SORT, EnumC16541l.COMPOSER_SORT);
        c13698lYandex.mo3668catch(EnumC17969l.CONDUCTOR, EnumC16541l.f32326l);
        c13698lYandex.mo3668catch(EnumC17969l.COUNTRY, EnumC16541l.f32364l);
        c13698lYandex.mo3668catch(EnumC17969l.COVER_ART, EnumC16541l.ARTWORK);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM1, EnumC16541l.f32354l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM2, EnumC16541l.f32348l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM3, EnumC16541l.f32331l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM4, EnumC16541l.f32436l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM5, EnumC16541l.f32410l);
        EnumC16541l enumC16541l = EnumC16541l.DISCNUMBER;
        c13698lYandex.mo3668catch(EnumC17969l.DISC_NO, enumC16541l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_SUBTITLE, EnumC16541l.f32361l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_TOTAL, enumC16541l);
        c13698lYandex.mo3668catch(EnumC17969l.DJMIXER, EnumC16541l.f32335l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_ELECTRONIC, EnumC16541l.f32461l);
        c13698lYandex.mo3668catch(EnumC17969l.ENCODER, EnumC16541l.ENCODER);
        c13698lYandex.mo3668catch(EnumC17969l.ENGINEER, EnumC16541l.f32363l);
        c13698lYandex.mo3668catch(EnumC17969l.ENSEMBLE, EnumC16541l.f32341l);
        c13698lYandex.mo3668catch(EnumC17969l.ENSEMBLE_SORT, EnumC16541l.f32367l);
        c13698lYandex.mo3668catch(EnumC17969l.FBPM, EnumC16541l.f32425l);
        c13698lYandex.mo3668catch(EnumC17969l.GENRE, EnumC16541l.GENRE);
        c13698lYandex.mo3668catch(EnumC17969l.GROUPING, EnumC16541l.GROUPING);
        c13698lYandex.mo3668catch(EnumC17969l.INVOLVED_PERSON, EnumC16541l.INVOLVED_PEOPLE);
        c13698lYandex.mo3668catch(EnumC17969l.ISRC, EnumC16541l.f32357l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_COMPILATION, EnumC16541l.f32469l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_CLASSICAL, EnumC16541l.f32351l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_SOUNDTRACK, EnumC16541l.f32395l);
        c13698lYandex.mo3668catch(EnumC17969l.KEY, EnumC16541l.f32426l);
        c13698lYandex.mo3668catch(EnumC17969l.LANGUAGE, EnumC16541l.f32468l);
        c13698lYandex.mo3668catch(EnumC17969l.LYRICIST, EnumC16541l.f32328l);
        c13698lYandex.mo3668catch(EnumC17969l.LYRICS, EnumC16541l.LYRICS);
        c13698lYandex.mo3668catch(EnumC17969l.MEDIA, EnumC16541l.f32457l);
        c13698lYandex.mo3668catch(EnumC17969l.MIXER, EnumC16541l.f32433l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD, EnumC16541l.f32473l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_ACOUSTIC, EnumC16541l.f32437l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_AGGRESSIVE, EnumC16541l.f32396l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_AROUSAL, EnumC16541l.f32371l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_DANCEABILITY, EnumC16541l.f32394l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_HAPPY, EnumC16541l.f32449l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_INSTRUMENTAL, EnumC16541l.f32414l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_PARTY, EnumC16541l.f32372l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_RELAXED, EnumC16541l.f32465l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_SAD, EnumC16541l.f32419l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_VALENCE, EnumC16541l.f32463l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT, EnumC16541l.MOVEMENT);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT_NO, EnumC16541l.f32360l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT_TOTAL, EnumC16541l.f32383l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK, EnumC16541l.f32378l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_ARTISTID, EnumC16541l.f32456l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_DISC_ID, EnumC16541l.f32451l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC16541l.f32420l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASEARTISTID, EnumC16541l.f32366l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASEID, EnumC16541l.f32347l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_COUNTRY, EnumC16541l.f32406l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC16541l.f32329l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_STATUS, EnumC16541l.f32430l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC16541l.f32424l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_TYPE, EnumC16541l.f32356l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_TRACK_ID, EnumC16541l.f32381l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_ID, EnumC16541l.f32380l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICIP_ID, EnumC16541l.f32444l);
        c13698lYandex.mo3668catch(EnumC17969l.OCCASION, EnumC16541l.f32421l);
        c13698lYandex.mo3668catch(EnumC17969l.ORCHESTRA, EnumC16541l.f32389l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_ALBUM, EnumC16541l.f32453l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_ARTIST, EnumC16541l.f32359l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_LYRICIST, EnumC16541l.f32388l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_YEAR, EnumC16541l.f32343l);
        c13698lYandex.mo3668catch(EnumC17969l.PART, EnumC16541l.f32355l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER, EnumC16541l.f32386l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER_NAME, EnumC16541l.f32411l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER_NAME_SORT, EnumC16541l.f32369l);
        c13698lYandex.mo3668catch(EnumC17969l.PRODUCER, EnumC16541l.f32440l);
        c13698lYandex.mo3668catch(EnumC17969l.QUALITY, EnumC16541l.f32466l);
        c13698lYandex.mo3668catch(EnumC17969l.RANKING, EnumC16541l.f32370l);
        c13698lYandex.mo3668catch(EnumC17969l.RATING, EnumC16541l.SCORE);
        c13698lYandex.mo3668catch(EnumC17969l.RECORD_LABEL, EnumC16541l.f32429l);
        c13698lYandex.mo3668catch(EnumC17969l.REMIXER, EnumC16541l.f32401l);
        c13698lYandex.mo3668catch(EnumC17969l.SCRIPT, EnumC16541l.f32352l);
        c13698lYandex.mo3668catch(EnumC17969l.SUBTITLE, EnumC16541l.f32390l);
        c13698lYandex.mo3668catch(EnumC17969l.TAGS, EnumC16541l.f32391l);
        c13698lYandex.mo3668catch(EnumC17969l.TEMPO, EnumC16541l.TEMPO);
        c13698lYandex.mo3668catch(EnumC17969l.TIMBRE, EnumC16541l.f32460l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE, EnumC16541l.TITLE);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE_MOVEMENT, EnumC16541l.f32446l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE_SORT, EnumC16541l.TITLE_SORT);
        c13698lYandex.mo3668catch(EnumC17969l.TONALITY, EnumC16541l.f32422l);
        EnumC16541l enumC16541l2 = EnumC16541l.TRACK;
        c13698lYandex.mo3668catch(EnumC17969l.TRACK, enumC16541l2);
        c13698lYandex.mo3668catch(EnumC17969l.TRACK_TOTAL, enumC16541l2);
        c13698lYandex.mo3668catch(EnumC17969l.URL_DISCOGS_ARTIST_SITE, EnumC16541l.f32405l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_DISCOGS_RELEASE_SITE, EnumC16541l.f32448l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_LYRICS_SITE, EnumC16541l.f32454l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_OFFICIAL_ARTIST_SITE, EnumC16541l.f32418l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_OFFICIAL_RELEASE_SITE, EnumC16541l.f32333l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_WIKIPEDIA_ARTIST_SITE, EnumC16541l.f32398l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_WIKIPEDIA_RELEASE_SITE, EnumC16541l.f32375l);
        c13698lYandex.mo3668catch(EnumC17969l.WORK, EnumC16541l.WORK);
        c13698lYandex.mo3668catch(EnumC17969l.YEAR, EnumC16541l.DAY);
        c13698lYandex.mo3668catch(EnumC17969l.WORK_TYPE, EnumC16541l.f32427l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC16541l.f32474l);
        c13698lYandex.mo3668catch(EnumC17969l.PART_TYPE, EnumC16541l.f32339l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC16541l.f32438l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION, EnumC16541l.f32397l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC16541l.f32399l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC16541l.f32340l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC16541l.f32445l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC16541l.f32447l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC16541l.f32423l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC16541l.f32327l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC16541l.f32392l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC16541l.f32450l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC16541l.f32402l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC16541l.f32353l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC16541l.f32342l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC16541l.f32409l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC16541l.f32441l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC16541l.f32387l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC16541l.f32452l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC16541l.f32332l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC16541l.f32404l);
        c13698lYandex.mo3668catch(EnumC17969l.PART_NUMBER, EnumC16541l.f32435l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTISTS_SORT, EnumC16541l.f32362l);
        c13698lYandex.mo3668catch(EnumC17969l.CONDUCTOR_SORT, EnumC16541l.f32459l);
        c13698lYandex.mo3668catch(EnumC17969l.ORCHESTRA_SORT, EnumC16541l.f32467l);
        c13698lYandex.mo3668catch(EnumC17969l.ARRANGER_SORT, EnumC16541l.f32337l);
        c13698lYandex.mo3668catch(EnumC17969l.OPUS, EnumC16541l.f32368l);
        c13698lYandex.mo3668catch(EnumC17969l.SINGLE_DISC_TRACK_NO, EnumC16541l.f32415l);
        c13698lYandex.mo3668catch(EnumC17969l.PERIOD, EnumC16541l.f32382l);
        f7240l = c13698lYandex.metrica(true);
    }

    public static C0964l tapsense(boolean z) {
        try {
            EnumC16541l enumC16541l = EnumC16541l.f32469l;
            return new C0964l(enumC16541l, z ? "1" : "0", enumC16541l.f32479l);
        } catch (C9706l e) {
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        EnumC16541l enumC16541l = (EnumC16541l) f7240l.get(enumC17969l);
        if (enumC16541l == null) {
            throw new C6451l(enumC17969l.name(), 18, (byte) 0);
        }
        AbstractC1186l abstractC1186lAds = ads(enumC16541l.f32477l);
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        if (enumC17969l == EnumC17969l.KEY) {
            return abstractC1186lAds.size() == 0 ? ads(EnumC16541l.f32373l.f32477l) : abstractC1186lAds;
        }
        if (enumC17969l == EnumC17969l.GENRE) {
            return abstractC1186lAds.size() == 0 ? ads(EnumC16541l.GENRE_CUSTOM.f32477l) : abstractC1186lAds;
        }
        if (enumC17969l == EnumC17969l.TRACK) {
            C9258l c9258lListIterator = abstractC1186lAds.listIterator(0);
            while (c9258lListIterator.hasNext()) {
                InterfaceC4656l interfaceC4656l = (InterfaceC4656l) c9258lListIterator.next();
                if (((Short) ((C16530l) interfaceC4656l).f13129l.get(1)).shortValue() > 0) {
                    c16971lMetrica.crashlytics(interfaceC4656l);
                }
            }
            return c16971lMetrica.mopub();
        }
        if (enumC17969l == EnumC17969l.TRACK_TOTAL) {
            C9258l c9258lListIterator2 = abstractC1186lAds.listIterator(0);
            while (c9258lListIterator2.hasNext()) {
                InterfaceC4656l interfaceC4656l2 = (InterfaceC4656l) c9258lListIterator2.next();
                if (((C16530l) interfaceC4656l2).purchase().shortValue() > 0) {
                    c16971lMetrica.crashlytics(interfaceC4656l2);
                }
            }
            return c16971lMetrica.mopub();
        }
        if (enumC17969l == EnumC17969l.DISC_NO) {
            C9258l c9258lListIterator3 = abstractC1186lAds.listIterator(0);
            while (c9258lListIterator3.hasNext()) {
                InterfaceC4656l interfaceC4656l3 = (InterfaceC4656l) c9258lListIterator3.next();
                if (((Short) ((C9934l) interfaceC4656l3).f13129l.get(1)).shortValue() > 0) {
                    c16971lMetrica.crashlytics(interfaceC4656l3);
                }
            }
            return c16971lMetrica.mopub();
        }
        if (enumC17969l != EnumC17969l.DISC_TOTAL) {
            return abstractC1186lAds;
        }
        C9258l c9258lListIterator4 = abstractC1186lAds.listIterator(0);
        while (c9258lListIterator4.hasNext()) {
            InterfaceC4656l interfaceC4656l4 = (InterfaceC4656l) c9258lListIterator4.next();
            if (((C9934l) interfaceC4656l4).purchase().shortValue() > 0) {
                c16971lMetrica.crashlytics(interfaceC4656l4);
            }
        }
        return c16971lMetrica.mopub();
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) throws C9706l {
        InterfaceC4656l interfaceC4656lYandex = yandex(enumC17969l, strArr);
        if (enumC17969l == EnumC17969l.GENRE) {
            AbstractC5550l abstractC5550l = (AbstractC5550l) interfaceC4656lYandex;
            String str = abstractC5550l.f11834l;
            EnumC16541l enumC16541l = EnumC16541l.GENRE;
            if (str.equals(enumC16541l.f32477l)) {
                EnumC16541l enumC16541l2 = EnumC16541l.GENRE_CUSTOM;
                AbstractC6745l.yandex(enumC16541l2);
                admob(enumC16541l2.f32477l);
            } else if (abstractC5550l.f11834l.equals(EnumC16541l.GENRE_CUSTOM.f32477l)) {
                admob(enumC16541l.f32477l);
            }
        }
        remoteconfig(interfaceC4656lYandex);
        return this;
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        return crashlytics(enumC17969l).size() != 0;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        AbstractC1186l abstractC1186lCrashlytics = crashlytics(enumC17969l);
        if (abstractC1186lCrashlytics.size() <= 0) {
            return C1972l.f4482l;
        }
        InterfaceC4656l interfaceC4656l = (InterfaceC4656l) abstractC1186lCrashlytics.get(0);
        int iOrdinal = enumC17969l.ordinal();
        if (iOrdinal == 34) {
            return AbstractC17238l.amazon(((Short) ((C9934l) interfaceC4656l).f13129l.get(1)).toString());
        }
        if (iOrdinal == 36) {
            return AbstractC17238l.amazon(((C9934l) interfaceC4656l).purchase().toString());
        }
        if (iOrdinal != 137) {
            return iOrdinal != 138 ? AbstractC17238l.amazon(interfaceC4656l.toString()) : AbstractC17238l.amazon(((C16530l) interfaceC4656l).purchase().toString());
        }
        return AbstractC17238l.amazon(((Short) ((C16530l) interfaceC4656l).f13129l.get(1)).toString());
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC13280l
    public final void remoteconfig(InterfaceC4656l interfaceC4656l) {
        if (interfaceC4656l == null) {
            return;
        }
        if (interfaceC4656l.getId().equals(EnumC16541l.TRACK.f32477l)) {
            List listAdcel = adcel(interfaceC4656l.getId());
            if (listAdcel.size() == 0) {
                super.remoteconfig(interfaceC4656l);
                return;
            }
            C16530l c16530l = (C16530l) listAdcel.get(0);
            C16530l c16530l2 = (C16530l) interfaceC4656l;
            Short sh = (Short) c16530l.f13129l.get(1);
            Short shPurchase = c16530l.purchase();
            if (((Short) c16530l2.f13129l.get(1)).shortValue() > 0) {
                sh = (Short) c16530l2.f13129l.get(1);
            }
            if (c16530l2.purchase().shortValue() > 0) {
                shPurchase = c16530l2.purchase();
            }
            super.remoteconfig(new C16530l(sh.shortValue(), shPurchase.shortValue()));
            return;
        }
        if (!interfaceC4656l.getId().equals(EnumC16541l.DISCNUMBER.f32477l)) {
            super.remoteconfig(interfaceC4656l);
            return;
        }
        List listAdcel2 = adcel(interfaceC4656l.getId());
        if (listAdcel2.size() == 0) {
            super.remoteconfig(interfaceC4656l);
            return;
        }
        C9934l c9934l = (C9934l) listAdcel2.get(0);
        C9934l c9934l2 = (C9934l) interfaceC4656l;
        Short sh2 = (Short) c9934l.f13129l.get(1);
        Short shPurchase2 = c9934l.purchase();
        if (((Short) c9934l2.f13129l.get(1)).shortValue() > 0) {
            sh2 = (Short) c9934l2.f13129l.get(1);
        }
        if (c9934l2.purchase().shortValue() > 0) {
            shPurchase2 = c9934l2.purchase();
        }
        super.remoteconfig(new C9934l(sh2.shortValue(), shPurchase2.shortValue()));
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) {
        byte[] bArr = abstractC5859l.yandex;
        C10801l c10801l = new C10801l(EnumC16541l.ARTWORK.f32477l);
        c10801l.f22244l = bArr;
        if (AbstractC5484l.crashlytics(bArr)) {
            c10801l.f21832l = EnumC11981l.COVERART_PNG;
            return c10801l;
        }
        if (AbstractC5484l.loadAd(bArr)) {
            c10801l.f21832l = EnumC11981l.COVERART_JPEG;
            return c10801l;
        }
        if (AbstractC5484l.yandex(bArr)) {
            c10801l.f21832l = EnumC11981l.COVERART_GIF;
            return c10801l;
        }
        if (bArr.length >= 2 && 66 == (bArr[0] & 255) && 77 == (bArr[1] & 255)) {
            c10801l.f21832l = EnumC11981l.COVERART_BMP;
            return c10801l;
        }
        C13975l c13975l = C10801l.f21830l;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        c10801l.f21832l = EnumC11981l.COVERART_PNG;
        return c10801l;
    }

    @Override // defpackage.AbstractC11779l
    public final String toString() {
        return "Mpeg4 ".concat(super.toString());
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return f7240l.keySet();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) throws C9706l {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        String str = (String) AbstractC6745l.amazon(strArr, "values");
        if (enumC17969l == EnumC17969l.TRACK || enumC17969l == EnumC17969l.TRACK_TOTAL || enumC17969l == EnumC17969l.DISC_NO || enumC17969l == EnumC17969l.DISC_TOTAL) {
            try {
                int i = Integer.parseInt(str);
                int iOrdinal = enumC17969l.ordinal();
                if (iOrdinal == 34) {
                    return new C9934l(i);
                }
                if (iOrdinal == 36) {
                    return new C9934l(0, i);
                }
                if (iOrdinal == 137) {
                    return new C16530l(i);
                }
                if (iOrdinal == 138) {
                    return new C16530l(0, i);
                }
            } catch (NumberFormatException unused) {
                throw new C9706l(AbstractC15560l.Signature("Value ", str, " is not a number as required"));
            }
        } else if (enumC17969l == EnumC17969l.GENRE) {
            C6356l.amazon();
            C13975l c13975l = C10124l.f20632l;
            try {
                if (Short.parseShort(str) - 1 > 125) {
                    Integer numAdcel = C18595l.ads().adcel(str);
                    if (numAdcel == null || numAdcel.intValue() > 125) {
                        return new C2453l(EnumC16541l.GENRE_CUSTOM.f32477l, str);
                    }
                }
            } catch (NumberFormatException unused2) {
            }
            return new C10124l(str);
        }
        EnumC16541l enumC16541l = (EnumC16541l) f7240l.get(enumC17969l);
        if (enumC16541l == null) {
            throw new C6451l(enumC17969l.name(), 18, (byte) 0);
        }
        String str2 = enumC16541l.f32477l;
        if (enumC16541l == EnumC16541l.f32469l) {
            return (str.equalsIgnoreCase("true") || str.equals("1")) ? tapsense(true) : tapsense(false);
        }
        if (enumC16541l == EnumC16541l.GENRE) {
            C13975l c13975l2 = C10124l.f20632l;
            try {
                if (Short.parseShort(str) - 1 > 125) {
                    Integer numAdcel2 = C18595l.ads().adcel(str);
                    if (numAdcel2 == null || numAdcel2.intValue() > 125) {
                        C8339l.metrica("This is not a standard genre value, use custom genre field instead");
                        return null;
                    }
                }
            } catch (NumberFormatException unused3) {
            }
            return new C10124l(str);
        }
        EnumC16541l enumC16541l2 = EnumC16541l.GENRE_CUSTOM;
        if (enumC16541l == enumC16541l2) {
            return new C2453l(enumC16541l2.f32477l, str);
        }
        int i2 = enumC16541l.f32478l;
        if (i2 == 6) {
            C9934l c9934l = new C9934l(EnumC16541l.DISCNUMBER.f32477l, str);
            ArrayList arrayList = new ArrayList();
            c9934l.f13129l = arrayList;
            arrayList.add(new Short("0"));
            String[] strArrSplit = str.split("/");
            int length = strArrSplit.length;
            if (length == 1) {
                try {
                    c9934l.f13129l.add(Short.valueOf(Short.parseShort(strArrSplit[0])));
                    c9934l.f13129l.add(new Short("0"));
                    return c9934l;
                } catch (NumberFormatException unused4) {
                    throw new C9706l("Value of:" + strArrSplit[0] + " is invalid for field:" + c9934l.f11834l);
                }
            }
            if (length != 2) {
                throw new C9706l("Value is invalid for field:" + c9934l.f11834l);
            }
            try {
                c9934l.f13129l.add(Short.valueOf(Short.parseShort(strArrSplit[0])));
                try {
                    c9934l.f13129l.add(Short.valueOf(Short.parseShort(strArrSplit[1])));
                    return c9934l;
                } catch (NumberFormatException unused5) {
                    throw new C9706l("Value of:" + strArrSplit[1] + " is invalid for field:" + c9934l.f11834l);
                }
            } catch (NumberFormatException unused6) {
                throw new C9706l("Value of:" + strArrSplit[0] + " is invalid for field:" + c9934l.f11834l);
            }
        }
        if (i2 != 7) {
            if (i2 == 2) {
                return new C0964l(enumC16541l, str, enumC16541l.f32479l);
            }
            if (i2 == 3) {
                return new C6212l(str2, str);
            }
            if (i2 == 4) {
                C12509l c12509l = new C12509l(str2);
                c12509l.f24650l = enumC16541l.f32476l;
                c12509l.f24649l = enumC16541l.f32475l;
                c12509l.f24651l = str;
                return c12509l;
            }
            if (i2 == 8) {
                throw new C6451l("Cover Art cannot be created using this method", 18, (byte) 0);
            }
            if (i2 == 1) {
                return new C2453l(str2, str);
            }
            if (i2 == 9) {
                throw new C6451l(new Object[]{str2});
            }
            throw new C6451l(new Object[]{str2});
        }
        C16530l c16530l = new C16530l(EnumC16541l.TRACK.f32477l, str);
        ArrayList arrayList2 = new ArrayList();
        c16530l.f13129l = arrayList2;
        arrayList2.add(new Short("0"));
        String[] strArrSplit2 = str.split("/");
        int length2 = strArrSplit2.length;
        if (length2 == 1) {
            try {
                c16530l.f13129l.add(Short.valueOf(Short.parseShort(strArrSplit2[0])));
                c16530l.f13129l.add(new Short("0"));
                c16530l.f13129l.add(new Short("0"));
                return c16530l;
            } catch (NumberFormatException unused7) {
                throw new C9706l("Value of:" + strArrSplit2[0] + " is invalid for field:" + c16530l.f11834l);
            }
        }
        if (length2 != 2) {
            throw new C9706l("Value is invalid for field:" + c16530l.f11834l);
        }
        try {
            c16530l.f13129l.add(Short.valueOf(Short.parseShort(strArrSplit2[0])));
            try {
                c16530l.f13129l.add(Short.valueOf(Short.parseShort(strArrSplit2[1])));
                c16530l.f13129l.add(new Short("0"));
                return c16530l;
            } catch (NumberFormatException unused8) {
                throw new C9706l("Value of:" + strArrSplit2[1] + " is invalid for field:" + c16530l.f11834l);
            }
        } catch (NumberFormatException unused9) {
            throw new C9706l("Value of:" + strArrSplit2[0] + " is invalid for field:" + c16530l.f11834l);
        }
    }
}
