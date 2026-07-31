package defpackage;

import ealvatag.tag.datatype.DataTypes;

/* JADX INFO: renamed from: lؙٟٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6647l extends AbstractC5232l {
    public static C6647l admob;
    public static volatile C6647l mopub;
    public final /* synthetic */ int amazon;
    public volatile C15333l billing;
    public volatile C1394l purchase;

    public /* synthetic */ C6647l(int i) {
        this.amazon = i;
    }

    public static C6647l admob() {
        if (mopub == null) {
            synchronized (C6647l.class) {
                try {
                    if (mopub == null) {
                        mopub = new C6647l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mopub;
    }

    public static C1394l metrica() {
        C15325l c15325l = new C15325l(4, 11);
        c15325l.m3988import(EnumC17969l.ACOUSTID_FINGERPRINT, EnumC4724l.f9605l);
        c15325l.m3988import(EnumC17969l.ACOUSTID_ID, EnumC4724l.f9676l);
        c15325l.m3988import(EnumC17969l.ALBUM, EnumC4724l.ALBUM);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTIST, EnumC4724l.ALBUM_ARTIST);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTIST_SORT, EnumC4724l.ALBUM_ARTIST_SORT);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTISTS, EnumC4724l.f9612l);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTISTS_SORT, EnumC4724l.f9705l);
        c15325l.m3988import(EnumC17969l.ALBUM_SORT, EnumC4724l.ALBUM_SORT);
        c15325l.m3988import(EnumC17969l.AMAZON_ID, EnumC4724l.f9720l);
        c15325l.m3988import(EnumC17969l.ARRANGER, EnumC4724l.f9701l);
        c15325l.m3988import(EnumC17969l.ARRANGER_SORT, EnumC4724l.f9598l);
        c15325l.m3988import(EnumC17969l.ARTIST, EnumC4724l.ARTIST);
        c15325l.m3988import(EnumC17969l.ARTISTS, EnumC4724l.f9674l);
        c15325l.m3988import(EnumC17969l.ARTISTS_SORT, EnumC4724l.f9624l);
        c15325l.m3988import(EnumC17969l.ARTIST_SORT, EnumC4724l.ARTIST_SORT);
        c15325l.m3988import(EnumC17969l.BARCODE, EnumC4724l.f9733l);
        c15325l.m3988import(EnumC17969l.BPM, EnumC4724l.BPM);
        c15325l.m3988import(EnumC17969l.CATALOG_NO, EnumC4724l.f9611l);
        c15325l.m3988import(EnumC17969l.CHOIR, EnumC4724l.f9608l);
        c15325l.m3988import(EnumC17969l.CHOIR_SORT, EnumC4724l.f9597l);
        c15325l.m3988import(EnumC17969l.CLASSICAL_CATALOG, EnumC4724l.f9734l);
        c15325l.m3988import(EnumC17969l.CLASSICAL_NICKNAME, EnumC4724l.f9627l);
        c15325l.m3988import(EnumC17969l.COMMENT, EnumC4724l.COMMENT);
        c15325l.m3988import(EnumC17969l.COMPOSER, EnumC4724l.COMPOSER);
        c15325l.m3988import(EnumC17969l.COMPOSER_SORT, EnumC4724l.COMPOSER_SORT);
        c15325l.m3988import(EnumC17969l.CONDUCTOR, EnumC4724l.CONDUCTOR);
        c15325l.m3988import(EnumC17969l.CONDUCTOR_SORT, EnumC4724l.f9693l);
        c15325l.m3988import(EnumC17969l.COUNTRY, EnumC4724l.f9731l);
        c15325l.m3988import(EnumC17969l.COVER_ART, EnumC4724l.COVER_ART);
        c15325l.m3988import(EnumC17969l.CUSTOM1, EnumC4724l.f9704l);
        c15325l.m3988import(EnumC17969l.CUSTOM2, EnumC4724l.f9587l);
        c15325l.m3988import(EnumC17969l.CUSTOM3, EnumC4724l.f9721l);
        c15325l.m3988import(EnumC17969l.CUSTOM4, EnumC4724l.f9626l);
        c15325l.m3988import(EnumC17969l.CUSTOM5, EnumC4724l.f9670l);
        c15325l.m3988import(EnumC17969l.DISC_NO, EnumC4724l.DISC_NO);
        c15325l.m3988import(EnumC17969l.DISC_SUBTITLE, EnumC4724l.DISC_SUBTITLE);
        c15325l.m3988import(EnumC17969l.DISC_TOTAL, EnumC4724l.DISC_TOTAL);
        c15325l.m3988import(EnumC17969l.DJMIXER, EnumC4724l.f9620l);
        c15325l.m3988import(EnumC17969l.MOOD_ELECTRONIC, EnumC4724l.f9684l);
        c15325l.m3988import(EnumC17969l.ENCODER, EnumC4724l.ENCODER);
        c15325l.m3988import(EnumC17969l.ENGINEER, EnumC4724l.f9602l);
        c15325l.m3988import(EnumC17969l.ENSEMBLE, EnumC4724l.f9629l);
        c15325l.m3988import(EnumC17969l.ENSEMBLE_SORT, EnumC4724l.f9688l);
        c15325l.m3988import(EnumC17969l.FBPM, EnumC4724l.f9646l);
        c15325l.m3988import(EnumC17969l.GENRE, EnumC4724l.GENRE);
        c15325l.m3988import(EnumC17969l.GROUPING, EnumC4724l.GROUPING);
        c15325l.m3988import(EnumC17969l.MOOD_INSTRUMENTAL, EnumC4724l.f9621l);
        c15325l.m3988import(EnumC17969l.INVOLVED_PERSON, EnumC4724l.INVOLVED_PERSON);
        c15325l.m3988import(EnumC17969l.ISRC, EnumC4724l.ISRC);
        c15325l.m3988import(EnumC17969l.IS_CLASSICAL, EnumC4724l.f9613l);
        c15325l.m3988import(EnumC17969l.IS_COMPILATION, EnumC4724l.IS_COMPILATION);
        c15325l.m3988import(EnumC17969l.IS_SOUNDTRACK, EnumC4724l.f9689l);
        c15325l.m3988import(EnumC17969l.ITUNES_GROUPING, EnumC4724l.ITUNES_GROUPING);
        c15325l.m3988import(EnumC17969l.KEY, EnumC4724l.KEY);
        c15325l.m3988import(EnumC17969l.LANGUAGE, EnumC4724l.LANGUAGE);
        c15325l.m3988import(EnumC17969l.LYRICIST, EnumC4724l.LYRICIST);
        c15325l.m3988import(EnumC17969l.LYRICS, EnumC4724l.LYRICS);
        c15325l.m3988import(EnumC17969l.MEDIA, EnumC4724l.MEDIA);
        c15325l.m3988import(EnumC17969l.MIXER, EnumC4724l.f9695l);
        c15325l.m3988import(EnumC17969l.MOOD, EnumC4724l.MOOD);
        c15325l.m3988import(EnumC17969l.MOOD_ACOUSTIC, EnumC4724l.f9610l);
        c15325l.m3988import(EnumC17969l.MOOD_AGGRESSIVE, EnumC4724l.f9592l);
        c15325l.m3988import(EnumC17969l.MOOD_AROUSAL, EnumC4724l.f9698l);
        c15325l.m3988import(EnumC17969l.MOOD_DANCEABILITY, EnumC4724l.f9672l);
        c15325l.m3988import(EnumC17969l.MOOD_HAPPY, EnumC4724l.f9715l);
        c15325l.m3988import(EnumC17969l.MOOD_PARTY, EnumC4724l.f9650l);
        c15325l.m3988import(EnumC17969l.MOOD_RELAXED, EnumC4724l.f9604l);
        c15325l.m3988import(EnumC17969l.MOOD_SAD, EnumC4724l.f9728l);
        c15325l.m3988import(EnumC17969l.MOOD_VALENCE, EnumC4724l.f9735l);
        c15325l.m3988import(EnumC17969l.MOVEMENT, EnumC4724l.MOVEMENT);
        c15325l.m3988import(EnumC17969l.MOVEMENT_NO, EnumC4724l.MOVEMENT_NO);
        c15325l.m3988import(EnumC17969l.MOVEMENT_TOTAL, EnumC4724l.MOVEMENT_TOTAL);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_ARTISTID, EnumC4724l.f9656l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_DISC_ID, EnumC4724l.f9723l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC4724l.f9711l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASEARTISTID, EnumC4724l.f9678l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASEID, EnumC4724l.f9634l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_COUNTRY, EnumC4724l.f9727l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC4724l.f9682l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_STATUS, EnumC4724l.f9725l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC4724l.f9655l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_TYPE, EnumC4724l.f9622l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_TRACK_ID, EnumC4724l.f9645l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK, EnumC4724l.f9600l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_ID, EnumC4724l.f9609l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION, EnumC4724l.f9653l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC4724l.f9628l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC4724l.f9692l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC4724l.f9618l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC4724l.f9718l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC4724l.f9713l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC4724l.f9683l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC4724l.f9590l);
        c15325l.m3988import(EnumC17969l.MUSICIP_ID, EnumC4724l.f9687l);
        c15325l.m3988import(EnumC17969l.OCCASION, EnumC4724l.f9643l);
        c15325l.m3988import(EnumC17969l.OPUS, EnumC4724l.f9640l);
        c15325l.m3988import(EnumC17969l.ORCHESTRA, EnumC4724l.f9642l);
        c15325l.m3988import(EnumC17969l.ORCHESTRA_SORT, EnumC4724l.f9659l);
        c15325l.m3988import(EnumC17969l.ORIGINAL_ALBUM, EnumC4724l.ORIGINAL_ALBUM);
        c15325l.m3988import(EnumC17969l.ORIGINAL_ARTIST, EnumC4724l.ORIGINAL_ARTIST);
        c15325l.m3988import(EnumC17969l.ORIGINAL_LYRICIST, EnumC4724l.ORIGINAL_LYRICIST);
        c15325l.m3988import(EnumC17969l.ORIGINAL_YEAR, EnumC4724l.ORIGINAL_YEAR);
        c15325l.m3988import(EnumC17969l.PART, EnumC4724l.f9709l);
        c15325l.m3988import(EnumC17969l.PART_NUMBER, EnumC4724l.f9707l);
        c15325l.m3988import(EnumC17969l.PART_TYPE, EnumC4724l.f9686l);
        c15325l.m3988import(EnumC17969l.PERFORMER, EnumC4724l.PERFORMER);
        c15325l.m3988import(EnumC17969l.PERFORMER_NAME, EnumC4724l.f9588l);
        c15325l.m3988import(EnumC17969l.PERFORMER_NAME_SORT, EnumC4724l.f9712l);
        c15325l.m3988import(EnumC17969l.PERIOD, EnumC4724l.f9615l);
        c15325l.m3988import(EnumC17969l.PRODUCER, EnumC4724l.f9664l);
        c15325l.m3988import(EnumC17969l.QUALITY, EnumC4724l.f9603l);
        c15325l.m3988import(EnumC17969l.RANKING, EnumC4724l.f9703l);
        c15325l.m3988import(EnumC17969l.RATING, EnumC4724l.RATING);
        c15325l.m3988import(EnumC17969l.RECORD_LABEL, EnumC4724l.RECORD_LABEL);
        c15325l.m3988import(EnumC17969l.REMIXER, EnumC4724l.REMIXER);
        c15325l.m3988import(EnumC17969l.SCRIPT, EnumC4724l.f9714l);
        c15325l.m3988import(EnumC17969l.SINGLE_DISC_TRACK_NO, EnumC4724l.f9666l);
        c15325l.m3988import(EnumC17969l.SUBTITLE, EnumC4724l.SUBTITLE);
        c15325l.m3988import(EnumC17969l.TAGS, EnumC4724l.f9630l);
        c15325l.m3988import(EnumC17969l.TEMPO, EnumC4724l.f9651l);
        c15325l.m3988import(EnumC17969l.TIMBRE, EnumC4724l.f9729l);
        c15325l.m3988import(EnumC17969l.TITLE, EnumC4724l.TITLE);
        c15325l.m3988import(EnumC17969l.TITLE_MOVEMENT, EnumC4724l.f9697l);
        c15325l.m3988import(EnumC17969l.TITLE_SORT, EnumC4724l.TITLE_SORT);
        c15325l.m3988import(EnumC17969l.TONALITY, EnumC4724l.f9673l);
        c15325l.m3988import(EnumC17969l.TRACK, EnumC4724l.TRACK);
        c15325l.m3988import(EnumC17969l.TRACK_TOTAL, EnumC4724l.TRACK_TOTAL);
        c15325l.m3988import(EnumC17969l.URL_DISCOGS_ARTIST_SITE, EnumC4724l.f9702l);
        c15325l.m3988import(EnumC17969l.URL_DISCOGS_RELEASE_SITE, EnumC4724l.f9632l);
        c15325l.m3988import(EnumC17969l.URL_LYRICS_SITE, EnumC4724l.f9668l);
        c15325l.m3988import(EnumC17969l.URL_OFFICIAL_ARTIST_SITE, EnumC4724l.URL_OFFICIAL_ARTIST_SITE);
        c15325l.m3988import(EnumC17969l.URL_OFFICIAL_RELEASE_SITE, EnumC4724l.f9690l);
        c15325l.m3988import(EnumC17969l.URL_WIKIPEDIA_ARTIST_SITE, EnumC4724l.f9614l);
        c15325l.m3988import(EnumC17969l.URL_WIKIPEDIA_RELEASE_SITE, EnumC4724l.f9679l);
        c15325l.m3988import(EnumC17969l.WORK, EnumC4724l.f9652l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC4724l.f9722l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC4724l.f9599l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC4724l.f9708l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC4724l.f9591l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC4724l.f9685l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC4724l.f9665l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC4724l.f9680l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC4724l.f9667l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC4724l.f9710l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC4724l.f9716l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC4724l.f9681l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC4724l.f9594l);
        c15325l.m3988import(EnumC17969l.WORK_TYPE, EnumC4724l.f9660l);
        c15325l.m3988import(EnumC17969l.YEAR, EnumC4724l.YEAR);
        return c15325l.adcel();
    }

    public static C15333l remoteconfig() {
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch("TPE2", "Text: Band/Orchestra/Accompaniment");
        c13698lYandex.mo3668catch("TALB", "Text: Album/Movie/Show title");
        c13698lYandex.mo3668catch("TSOA", "Album sort order");
        c13698lYandex.mo3668catch("TPE1", "Text: Lead artist(s)/Lead performer(s)/Soloist(s)/Performing group");
        c13698lYandex.mo3668catch("APIC", "Attached picture");
        c13698lYandex.mo3668catch("AENC", "Audio encryption");
        c13698lYandex.mo3668catch("ASPI", "Audio seek point index");
        c13698lYandex.mo3668catch("TBPM", "Text: BPM (Beats Per Minute)");
        c13698lYandex.mo3668catch("CHAP", "Chapter");
        c13698lYandex.mo3668catch("CTOC", "Chapter TOC");
        c13698lYandex.mo3668catch("COMM", "Comments");
        c13698lYandex.mo3668catch("COMR", "Commercial Frame");
        c13698lYandex.mo3668catch("TCOM", "Text: Composer");
        c13698lYandex.mo3668catch("TPE3", "Text: Conductor/Performer refinement");
        c13698lYandex.mo3668catch("TIT1", "Text: Content group description");
        c13698lYandex.mo3668catch("TCOP", "Text: Copyright message");
        c13698lYandex.mo3668catch("TENC", "Text: Encoded by");
        c13698lYandex.mo3668catch("TDEN", "Text: Encoding time");
        c13698lYandex.mo3668catch("ENCR", "Encryption method registration");
        c13698lYandex.mo3668catch("EQU2", "Equalization (2)");
        c13698lYandex.mo3668catch("ETCO", "Event timing codes");
        c13698lYandex.mo3668catch("TOWN", "Text:File Owner");
        c13698lYandex.mo3668catch("TFLT", "Text: File type");
        c13698lYandex.mo3668catch("GEOB", "General encapsulated datatype");
        c13698lYandex.mo3668catch("TCON", "Text: Content type");
        c13698lYandex.mo3668catch("GRID", "Group ID Registration");
        c13698lYandex.mo3668catch("TSSE", "Text: Software/hardware and settings used for encoding");
        c13698lYandex.mo3668catch("TKEY", "Text: Initial key");
        c13698lYandex.mo3668catch("TIPL", "Involved people list");
        c13698lYandex.mo3668catch("TSRC", "Text: ISRC (International Standard Recording Code)");
        c13698lYandex.mo3668catch("GRP1", "iTunes Grouping");
        c13698lYandex.mo3668catch("TLAN", "Text: Language(s)");
        c13698lYandex.mo3668catch("TLEN", "Text: Length");
        c13698lYandex.mo3668catch("LINK", "Linked information");
        c13698lYandex.mo3668catch("TEXT", "Text: Lyricist/text writer");
        c13698lYandex.mo3668catch("TMED", "Text: Media type");
        c13698lYandex.mo3668catch("TMOO", "Text: Mood");
        c13698lYandex.mo3668catch("MVNM", "Text: Movement");
        c13698lYandex.mo3668catch("MVIN", "Text: Movement No");
        c13698lYandex.mo3668catch("MLLT", "MPEG location lookup table");
        c13698lYandex.mo3668catch("MCDI", "Music CD Identifier");
        c13698lYandex.mo3668catch("TOPE", "Text: Original artist(s)/performer(s)");
        c13698lYandex.mo3668catch("TDOR", "Text: Original release time");
        c13698lYandex.mo3668catch("TOFN", "Text: Original filename");
        c13698lYandex.mo3668catch("TOLY", "Text: Original Lyricist(s)/text writer(s)");
        c13698lYandex.mo3668catch("TOAL", "Text: Original album/Movie/Show title");
        c13698lYandex.mo3668catch("OWNE", "Ownership");
        c13698lYandex.mo3668catch("TSOP", "Performance Sort Order");
        c13698lYandex.mo3668catch("TDLY", "Text: Playlist delay");
        c13698lYandex.mo3668catch("PCNT", "Play counter");
        c13698lYandex.mo3668catch("POPM", "Popularimeter");
        c13698lYandex.mo3668catch("POSS", "Position Sync");
        c13698lYandex.mo3668catch("PRIV", "Private frame");
        c13698lYandex.mo3668catch("TPRO", "Produced Notice");
        c13698lYandex.mo3668catch("TPUB", "Text: Publisher");
        c13698lYandex.mo3668catch("TRSN", "Text: Radio Name");
        c13698lYandex.mo3668catch("TRSO", "Text: Radio Owner");
        c13698lYandex.mo3668catch("RBUF", "Recommended buffer size");
        c13698lYandex.mo3668catch("RVA2", "Relative volume adjustment(2)");
        c13698lYandex.mo3668catch("TDRL", "Release Time");
        c13698lYandex.mo3668catch("TPE4", "Text: Interpreted, remixed, or otherwise modified by");
        c13698lYandex.mo3668catch("RVRB", "Reverb");
        c13698lYandex.mo3668catch("SEEK", "Seek");
        c13698lYandex.mo3668catch("TPOS", "Text: Part of a setField");
        c13698lYandex.mo3668catch("TSST", "Text: Set subtitle");
        c13698lYandex.mo3668catch("SIGN", DataTypes.OBJ_SIGNATURE);
        c13698lYandex.mo3668catch("SYLT", "Synchronized lyric/text");
        c13698lYandex.mo3668catch("SYTC", "Synced tempo codes");
        c13698lYandex.mo3668catch("TDTG", "Text: Tagging time");
        c13698lYandex.mo3668catch("USER", "Terms of Use");
        c13698lYandex.mo3668catch("TIT2", "Text: title");
        c13698lYandex.mo3668catch("TIT3", "Text: Subtitle/Description refinement");
        c13698lYandex.mo3668catch("TSOT", "Text: title sort order");
        c13698lYandex.mo3668catch("TRCK", "Text: Track number/Position in setField");
        c13698lYandex.mo3668catch("UFID", "Unique file identifier");
        c13698lYandex.mo3668catch("USLT", "Unsychronized lyric/text transcription");
        c13698lYandex.mo3668catch("WOAR", "URL: Official artist/performer webpage");
        c13698lYandex.mo3668catch("WCOM", "URL: Commercial information");
        c13698lYandex.mo3668catch("WCOP", "URL: Copyright/Legal information");
        c13698lYandex.mo3668catch("WOAF", "URL: Official audio file webpage");
        c13698lYandex.mo3668catch("WORS", "URL: Official Radio website");
        c13698lYandex.mo3668catch("WPAY", "URL: Payment for this recording ");
        c13698lYandex.mo3668catch("WPUB", "URL: Publishers official webpage");
        c13698lYandex.mo3668catch("WOAS", "URL: Official audio source webpage");
        c13698lYandex.mo3668catch("TXXX", "User defined text information frame");
        c13698lYandex.mo3668catch("WXXX", "User defined URL link frame");
        c13698lYandex.mo3668catch("TDRC", "Text:Year");
        c13698lYandex.mo3668catch("TCMP", "Is Compilation");
        c13698lYandex.mo3668catch("TSO2", "Text:Album Artist Sort Order Frame");
        c13698lYandex.mo3668catch("TSOC", "Text:Composer Sort Order Frame");
        return c13698lYandex.metrica(true);
    }

    public static C15333l smaato() {
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch("TP2", "Text: Band/Orchestra/Accompaniment");
        c13698lYandex.mo3668catch("TAL", "Text: Album/Movie/Show title");
        c13698lYandex.mo3668catch("TP1", "Text: Lead artist(s)/Lead performer(s)/Soloist(s)/Performing group");
        c13698lYandex.mo3668catch("PIC", "Attached picture");
        c13698lYandex.mo3668catch("CRA", "Audio encryption");
        c13698lYandex.mo3668catch("TBP", "Text: BPM (Beats Per Minute)");
        c13698lYandex.mo3668catch("COM", "Comments");
        c13698lYandex.mo3668catch("TCM", "Text: Composer");
        c13698lYandex.mo3668catch("TPE", "Text: Conductor/Performer refinement");
        c13698lYandex.mo3668catch("TT1", "Text: Content group description");
        c13698lYandex.mo3668catch("TCR", "Text: Copyright message");
        c13698lYandex.mo3668catch("TEN", "Text: Encoded by");
        c13698lYandex.mo3668catch("CRM", "Encrypted meta frame");
        c13698lYandex.mo3668catch("EQU", "Equalization");
        c13698lYandex.mo3668catch("ETC", "Event timing codes");
        c13698lYandex.mo3668catch("TFT", "Text: File type");
        c13698lYandex.mo3668catch("GEO", "General encapsulated datatype");
        c13698lYandex.mo3668catch("TCO", "Text: Content type");
        c13698lYandex.mo3668catch("TSS", "Text: Software/hardware and settings used for encoding");
        c13698lYandex.mo3668catch("TKE", "Text: Initial key");
        c13698lYandex.mo3668catch("IPL", "Involved people list");
        c13698lYandex.mo3668catch("TRC", "Text: ISRC (International Standard Recording Code)");
        c13698lYandex.mo3668catch("GP1", "iTunes Grouping");
        c13698lYandex.mo3668catch("TLA", "Text: Language(s)");
        c13698lYandex.mo3668catch("TLE", "Text: Length");
        c13698lYandex.mo3668catch("LNK", "Linked information");
        c13698lYandex.mo3668catch("TXT", "Text: Lyricist/text writer");
        c13698lYandex.mo3668catch("TMT", "Text: Media type");
        c13698lYandex.mo3668catch("MVN", "Text: Movement");
        c13698lYandex.mo3668catch("MVI", "Text: Movement No");
        c13698lYandex.mo3668catch("MLL", "MPEG location lookup table");
        c13698lYandex.mo3668catch("MCI", "Music CD Identifier");
        c13698lYandex.mo3668catch("TOA", "Text: Original artist(s)/performer(s)");
        c13698lYandex.mo3668catch("TOF", "Text: Original filename");
        c13698lYandex.mo3668catch("TOL", "Text: Original Lyricist(s)/text writer(s)");
        c13698lYandex.mo3668catch("TOT", "Text: Original album/Movie/Show title");
        c13698lYandex.mo3668catch("TDY", "Text: Playlist delay");
        c13698lYandex.mo3668catch("CNT", "Play counter");
        c13698lYandex.mo3668catch("POP", "Popularimeter");
        c13698lYandex.mo3668catch("TPB", "Text: Publisher");
        c13698lYandex.mo3668catch("BUF", "Recommended buffer size");
        c13698lYandex.mo3668catch("RVA", "Relative volume adjustment");
        c13698lYandex.mo3668catch("TP4", "Text: Interpreted, remixed, or otherwise modified by");
        c13698lYandex.mo3668catch("REV", "Reverb");
        c13698lYandex.mo3668catch("TPA", "Text: Part of a setField");
        c13698lYandex.mo3668catch("TPS", "Text: Set subtitle");
        c13698lYandex.mo3668catch("SLT", "Synchronized lyric/text");
        c13698lYandex.mo3668catch("STC", "Synced tempo codes");
        c13698lYandex.mo3668catch("TDA", "Text: Date");
        c13698lYandex.mo3668catch("TIM", "Text: Time");
        c13698lYandex.mo3668catch("TT2", "Text: Title/Songname/Content description");
        c13698lYandex.mo3668catch("TT3", "Text: Subtitle/Description refinement");
        c13698lYandex.mo3668catch("TOR", "Text: Original release year");
        c13698lYandex.mo3668catch("TRK", "Text: Track number/Position in setField");
        c13698lYandex.mo3668catch("TRD", "Text: Recording dates");
        c13698lYandex.mo3668catch("TSI", "Text: Size");
        c13698lYandex.mo3668catch("TYE", "Text: Year");
        c13698lYandex.mo3668catch("UFI", "Unique file identifier");
        c13698lYandex.mo3668catch("ULT", "Unsychronized lyric/text transcription");
        c13698lYandex.mo3668catch("WAR", "URL: Official artist/performer webpage");
        c13698lYandex.mo3668catch("WCM", "URL: Commercial information");
        c13698lYandex.mo3668catch("WCP", "URL: Copyright/Legal information");
        c13698lYandex.mo3668catch("WAF", "URL: Official audio file webpage");
        c13698lYandex.mo3668catch("WRS", "URL: Official radio station");
        c13698lYandex.mo3668catch("WPAY", "URL: Official payment site");
        c13698lYandex.mo3668catch("WPB", "URL: Publishers official webpage");
        c13698lYandex.mo3668catch("WAS", "URL: Official audio source webpage");
        c13698lYandex.mo3668catch("TXX", "User defined text information frame");
        c13698lYandex.mo3668catch("WXX", "User defined URL link frame");
        c13698lYandex.mo3668catch("TCP", "Is Compilation");
        c13698lYandex.mo3668catch("TST", "Text: title sort order");
        c13698lYandex.mo3668catch("TSP", "Text: artist sort order");
        c13698lYandex.mo3668catch("TSA", "Text: album sort order");
        c13698lYandex.mo3668catch("TS2", "Text:Album Artist Sort Order Frame");
        c13698lYandex.mo3668catch("TSC", "Text:Composer Sort Order Frame");
        return c13698lYandex.metrica(true);
    }

    public static C6647l subs() {
        if (admob == null) {
            admob = new C6647l(1);
        }
        return admob;
    }

    public static C1394l vip() {
        C15325l c15325l = new C15325l(4, 11);
        c15325l.m3988import(EnumC17969l.ACOUSTID_FINGERPRINT, EnumC15675l.f30669l);
        c15325l.m3988import(EnumC17969l.ACOUSTID_ID, EnumC15675l.f30740l);
        c15325l.m3988import(EnumC17969l.ALBUM, EnumC15675l.ALBUM);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTIST, EnumC15675l.ALBUM_ARTIST);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTIST_SORT, EnumC15675l.ALBUM_ARTIST_SORT);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTISTS, EnumC15675l.f30676l);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTISTS_SORT, EnumC15675l.f30769l);
        c15325l.m3988import(EnumC17969l.ALBUM_SORT, EnumC15675l.ALBUM_SORT);
        c15325l.m3988import(EnumC17969l.AMAZON_ID, EnumC15675l.f30784l);
        c15325l.m3988import(EnumC17969l.ARRANGER, EnumC15675l.f30765l);
        c15325l.m3988import(EnumC17969l.ARRANGER_SORT, EnumC15675l.f30662l);
        c15325l.m3988import(EnumC17969l.ARTIST, EnumC15675l.ARTIST);
        c15325l.m3988import(EnumC17969l.ARTISTS, EnumC15675l.f30738l);
        c15325l.m3988import(EnumC17969l.ARTISTS_SORT, EnumC15675l.f30688l);
        c15325l.m3988import(EnumC17969l.ARTIST_SORT, EnumC15675l.ARTIST_SORT);
        c15325l.m3988import(EnumC17969l.BARCODE, EnumC15675l.f30797l);
        c15325l.m3988import(EnumC17969l.BPM, EnumC15675l.BPM);
        c15325l.m3988import(EnumC17969l.CATALOG_NO, EnumC15675l.f30675l);
        c15325l.m3988import(EnumC17969l.CHOIR, EnumC15675l.f30672l);
        c15325l.m3988import(EnumC17969l.CHOIR_SORT, EnumC15675l.f30661l);
        c15325l.m3988import(EnumC17969l.CLASSICAL_CATALOG, EnumC15675l.f30798l);
        c15325l.m3988import(EnumC17969l.CLASSICAL_NICKNAME, EnumC15675l.f30691l);
        c15325l.m3988import(EnumC17969l.COMMENT, EnumC15675l.COMMENT);
        c15325l.m3988import(EnumC17969l.COMPOSER, EnumC15675l.COMPOSER);
        c15325l.m3988import(EnumC17969l.COMPOSER_SORT, EnumC15675l.COMPOSER_SORT);
        c15325l.m3988import(EnumC17969l.CONDUCTOR, EnumC15675l.CONDUCTOR);
        c15325l.m3988import(EnumC17969l.CONDUCTOR_SORT, EnumC15675l.f30757l);
        c15325l.m3988import(EnumC17969l.COUNTRY, EnumC15675l.f30795l);
        c15325l.m3988import(EnumC17969l.COVER_ART, EnumC15675l.COVER_ART);
        c15325l.m3988import(EnumC17969l.CUSTOM1, EnumC15675l.f30768l);
        c15325l.m3988import(EnumC17969l.CUSTOM2, EnumC15675l.f30651l);
        c15325l.m3988import(EnumC17969l.CUSTOM3, EnumC15675l.f30785l);
        c15325l.m3988import(EnumC17969l.CUSTOM4, EnumC15675l.f30690l);
        c15325l.m3988import(EnumC17969l.CUSTOM5, EnumC15675l.f30734l);
        c15325l.m3988import(EnumC17969l.DISC_NO, EnumC15675l.DISC_NO);
        c15325l.m3988import(EnumC17969l.DISC_SUBTITLE, EnumC15675l.DISC_SUBTITLE);
        c15325l.m3988import(EnumC17969l.DISC_TOTAL, EnumC15675l.DISC_TOTAL);
        c15325l.m3988import(EnumC17969l.DJMIXER, EnumC15675l.f30684l);
        c15325l.m3988import(EnumC17969l.ENCODER, EnumC15675l.ENCODER);
        c15325l.m3988import(EnumC17969l.ENGINEER, EnumC15675l.f30666l);
        c15325l.m3988import(EnumC17969l.ENSEMBLE, EnumC15675l.f30693l);
        c15325l.m3988import(EnumC17969l.ENSEMBLE_SORT, EnumC15675l.f30752l);
        c15325l.m3988import(EnumC17969l.FBPM, EnumC15675l.f30710l);
        c15325l.m3988import(EnumC17969l.GENRE, EnumC15675l.GENRE);
        c15325l.m3988import(EnumC17969l.GROUPING, EnumC15675l.GROUPING);
        c15325l.m3988import(EnumC17969l.INVOLVED_PERSON, EnumC15675l.INVOLVED_PERSON);
        c15325l.m3988import(EnumC17969l.ISRC, EnumC15675l.ISRC);
        c15325l.m3988import(EnumC17969l.IS_CLASSICAL, EnumC15675l.f30721l);
        c15325l.m3988import(EnumC17969l.IS_COMPILATION, EnumC15675l.IS_COMPILATION);
        c15325l.m3988import(EnumC17969l.IS_SOUNDTRACK, EnumC15675l.f30699l);
        c15325l.m3988import(EnumC17969l.ITUNES_GROUPING, EnumC15675l.ITUNES_GROUPING);
        c15325l.m3988import(EnumC17969l.KEY, EnumC15675l.KEY);
        c15325l.m3988import(EnumC17969l.LANGUAGE, EnumC15675l.LANGUAGE);
        c15325l.m3988import(EnumC17969l.LYRICIST, EnumC15675l.LYRICIST);
        c15325l.m3988import(EnumC17969l.LYRICS, EnumC15675l.LYRICS);
        c15325l.m3988import(EnumC17969l.MEDIA, EnumC15675l.MEDIA);
        c15325l.m3988import(EnumC17969l.MIXER, EnumC15675l.f30680l);
        c15325l.m3988import(EnumC17969l.MOOD, EnumC15675l.f30674l);
        c15325l.m3988import(EnumC17969l.MOOD_ACOUSTIC, EnumC15675l.f30656l);
        c15325l.m3988import(EnumC17969l.MOOD_AGGRESSIVE, EnumC15675l.f30762l);
        c15325l.m3988import(EnumC17969l.MOOD_AROUSAL, EnumC15675l.f30736l);
        c15325l.m3988import(EnumC17969l.MOOD_DANCEABILITY, EnumC15675l.f30748l);
        c15325l.m3988import(EnumC17969l.MOOD_ELECTRONIC, EnumC15675l.f30779l);
        c15325l.m3988import(EnumC17969l.MOOD_HAPPY, EnumC15675l.f30685l);
        c15325l.m3988import(EnumC17969l.MOOD_INSTRUMENTAL, EnumC15675l.f30796l);
        c15325l.m3988import(EnumC17969l.MOOD_PARTY, EnumC15675l.f30714l);
        c15325l.m3988import(EnumC17969l.MOOD_RELAXED, EnumC15675l.f30668l);
        c15325l.m3988import(EnumC17969l.MOOD_SAD, EnumC15675l.f30792l);
        c15325l.m3988import(EnumC17969l.MOOD_VALENCE, EnumC15675l.f30799l);
        c15325l.m3988import(EnumC17969l.MOVEMENT, EnumC15675l.MOVEMENT);
        c15325l.m3988import(EnumC17969l.MOVEMENT_NO, EnumC15675l.MOVEMENT_NO);
        c15325l.m3988import(EnumC17969l.MOVEMENT_TOTAL, EnumC15675l.MOVEMENT_TOTAL);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_ARTISTID, EnumC15675l.f30720l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_DISC_ID, EnumC15675l.f30787l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC15675l.f30775l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASEARTISTID, EnumC15675l.f30742l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASEID, EnumC15675l.f30698l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_COUNTRY, EnumC15675l.f30791l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC15675l.f30746l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_STATUS, EnumC15675l.f30789l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC15675l.f30719l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_TYPE, EnumC15675l.f30686l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_TRACK_ID, EnumC15675l.f30709l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK, EnumC15675l.f30712l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_ID, EnumC15675l.f30756l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC15675l.f30673l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC15675l.f30682l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC15675l.f30782l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC15675l.f30777l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC15675l.f30747l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC15675l.f30654l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC15675l.f30751l);
        c15325l.m3988import(EnumC17969l.MUSICIP_ID, EnumC15675l.f30707l);
        c15325l.m3988import(EnumC17969l.OCCASION, EnumC15675l.f30704l);
        c15325l.m3988import(EnumC17969l.OPUS, EnumC15675l.f30706l);
        c15325l.m3988import(EnumC17969l.ORCHESTRA, EnumC15675l.f30723l);
        c15325l.m3988import(EnumC17969l.ORCHESTRA_SORT, EnumC15675l.f30800l);
        c15325l.m3988import(EnumC17969l.ORIGINAL_ALBUM, EnumC15675l.ORIGINAL_ALBUM);
        c15325l.m3988import(EnumC17969l.ORIGINAL_ARTIST, EnumC15675l.ORIGINAL_ARTIST);
        c15325l.m3988import(EnumC17969l.ORIGINAL_LYRICIST, EnumC15675l.ORIGINAL_LYRICIST);
        c15325l.m3988import(EnumC17969l.ORIGINAL_YEAR, EnumC15675l.ORIGINAL_YEAR);
        c15325l.m3988import(EnumC17969l.PART, EnumC15675l.f30771l);
        c15325l.m3988import(EnumC17969l.PART_NUMBER, EnumC15675l.f30750l);
        c15325l.m3988import(EnumC17969l.PART_TYPE, EnumC15675l.f30718l);
        c15325l.m3988import(EnumC17969l.PERFORMER, EnumC15675l.PERFORMER);
        c15325l.m3988import(EnumC17969l.PERFORMER_NAME, EnumC15675l.f30776l);
        c15325l.m3988import(EnumC17969l.PERFORMER_NAME_SORT, EnumC15675l.f30679l);
        c15325l.m3988import(EnumC17969l.PERIOD, EnumC15675l.f30728l);
        c15325l.m3988import(EnumC17969l.PRODUCER, EnumC15675l.f30667l);
        c15325l.m3988import(EnumC17969l.QUALITY, EnumC15675l.f30767l);
        c15325l.m3988import(EnumC17969l.RANKING, EnumC15675l.f30735l);
        c15325l.m3988import(EnumC17969l.RATING, EnumC15675l.RATING);
        c15325l.m3988import(EnumC17969l.RECORD_LABEL, EnumC15675l.RECORD_LABEL);
        c15325l.m3988import(EnumC17969l.REMIXER, EnumC15675l.REMIXER);
        c15325l.m3988import(EnumC17969l.SCRIPT, EnumC15675l.f30730l);
        c15325l.m3988import(EnumC17969l.SINGLE_DISC_TRACK_NO, EnumC15675l.f30770l);
        c15325l.m3988import(EnumC17969l.SUBTITLE, EnumC15675l.SUBTITLE);
        c15325l.m3988import(EnumC17969l.TAGS, EnumC15675l.f30715l);
        c15325l.m3988import(EnumC17969l.TEMPO, EnumC15675l.f30793l);
        c15325l.m3988import(EnumC17969l.TIMBRE, EnumC15675l.f30681l);
        c15325l.m3988import(EnumC17969l.TITLE, EnumC15675l.TITLE);
        c15325l.m3988import(EnumC17969l.TITLE_MOVEMENT, EnumC15675l.f30664l);
        c15325l.m3988import(EnumC17969l.TITLE_SORT, EnumC15675l.TITLE_SORT);
        c15325l.m3988import(EnumC17969l.TONALITY, EnumC15675l.f30695l);
        c15325l.m3988import(EnumC17969l.TRACK, EnumC15675l.TRACK);
        c15325l.m3988import(EnumC17969l.TRACK_TOTAL, EnumC15675l.TRACK_TOTAL);
        c15325l.m3988import(EnumC17969l.URL_DISCOGS_ARTIST_SITE, EnumC15675l.f30696l);
        c15325l.m3988import(EnumC17969l.URL_DISCOGS_RELEASE_SITE, EnumC15675l.f30732l);
        c15325l.m3988import(EnumC17969l.URL_LYRICS_SITE, EnumC15675l.f30727l);
        c15325l.m3988import(EnumC17969l.URL_OFFICIAL_ARTIST_SITE, EnumC15675l.URL_OFFICIAL_ARTIST_SITE);
        c15325l.m3988import(EnumC17969l.URL_OFFICIAL_RELEASE_SITE, EnumC15675l.f30678l);
        c15325l.m3988import(EnumC17969l.URL_WIKIPEDIA_ARTIST_SITE, EnumC15675l.f30743l);
        c15325l.m3988import(EnumC17969l.URL_WIKIPEDIA_RELEASE_SITE, EnumC15675l.f30716l);
        c15325l.m3988import(EnumC17969l.WORK, EnumC15675l.f30717l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION, EnumC15675l.f30692l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC15675l.f30729l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC15675l.f30786l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC15675l.f30663l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC15675l.f30772l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC15675l.f30655l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC15675l.f30749l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC15675l.f30744l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC15675l.f30731l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC15675l.f30774l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC15675l.f30780l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC15675l.f30745l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC15675l.f30658l);
        c15325l.m3988import(EnumC17969l.WORK_TYPE, EnumC15675l.f30724l);
        c15325l.m3988import(EnumC17969l.YEAR, EnumC15675l.YEAR);
        return c15325l.adcel();
    }

    @Override // defpackage.AbstractC5232l
    public final AbstractC8481l amazon() {
        switch (this.amazon) {
            case 0:
                return AbstractC8481l.Signature("TP1", "TAL", "TT2", "TCO", "TRK", "TYE", "COM");
            default:
                return AbstractC8481l.Signature("TPE1", "TALB", "TIT2", "TCON", "TRCK", "TDRC", "COMM");
        }
    }

    @Override // defpackage.AbstractC5232l
    public final AbstractC8481l billing() {
        switch (this.amazon) {
            case 0:
                return AbstractC8481l.Signature("PIC", "UFI", "POP", "TXX", "WXX", "COM", "ULT", "GEO", "WAR");
            default:
                return AbstractC8481l.Signature("TXXX", "WXXX", "APIC", "PRIV", "COMM", "UFID", "USLT", "POPM", "GEOB", "WOAR");
        }
    }

    public C1394l firebase() {
        if (this.purchase == null) {
            synchronized (this) {
                try {
                    if (this.purchase == null) {
                        this.purchase = metrica();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.purchase;
    }

    public C1394l isPro() {
        if (this.purchase == null) {
            synchronized (this) {
                try {
                    if (this.purchase == null) {
                        this.purchase = vip();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.purchase;
    }

    public boolean mopub(String str) {
        if (this.billing == null) {
            synchronized (this) {
                try {
                    if (this.billing == null) {
                        this.billing = remoteconfig();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.billing.containsKey(str);
    }

    @Override // defpackage.AbstractC5232l
    public final AbstractC8481l purchase() {
        switch (this.amazon) {
            case 0:
                int i = AbstractC8481l.f17529l;
                return C13825l.f26967l;
            default:
                return AbstractC8481l.Signature("ETCO", "MLLT", "POSS", "SYLT", "SYTC", "ETCO", "TENC", "TLEN");
        }
    }
}
