package defpackage;

/* JADX INFO: renamed from: lٍؘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5566l extends AbstractC5232l {
    public static volatile C5566l billing;
    public volatile C1394l amazon;
    public volatile C15333l purchase;

    public static C5566l admob() {
        if (billing == null) {
            synchronized (C5566l.class) {
                try {
                    if (billing == null) {
                        billing = new C5566l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return billing;
    }

    public static C1394l firebase() {
        C15325l c15325l = new C15325l(4, 11);
        c15325l.m3988import(EnumC17969l.ACOUSTID_FINGERPRINT, EnumC13195l.f25824l);
        c15325l.m3988import(EnumC17969l.ACOUSTID_ID, EnumC13195l.f25895l);
        c15325l.m3988import(EnumC17969l.ALBUM, EnumC13195l.ALBUM);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTIST, EnumC13195l.ALBUM_ARTIST);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTIST_SORT, EnumC13195l.ALBUM_ARTIST_SORT);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTISTS, EnumC13195l.f25831l);
        c15325l.m3988import(EnumC17969l.ALBUM_ARTISTS_SORT, EnumC13195l.f25924l);
        c15325l.m3988import(EnumC17969l.ALBUM_SORT, EnumC13195l.ALBUM_SORT);
        c15325l.m3988import(EnumC17969l.AMAZON_ID, EnumC13195l.f25939l);
        c15325l.m3988import(EnumC17969l.ARRANGER, EnumC13195l.f25920l);
        c15325l.m3988import(EnumC17969l.ARRANGER_SORT, EnumC13195l.f25817l);
        c15325l.m3988import(EnumC17969l.ARTIST, EnumC13195l.ARTIST);
        c15325l.m3988import(EnumC17969l.ARTISTS, EnumC13195l.f25893l);
        c15325l.m3988import(EnumC17969l.ARTISTS_SORT, EnumC13195l.f25843l);
        c15325l.m3988import(EnumC17969l.ARTIST_SORT, EnumC13195l.ARTIST_SORT);
        c15325l.m3988import(EnumC17969l.BARCODE, EnumC13195l.f25952l);
        c15325l.m3988import(EnumC17969l.BPM, EnumC13195l.BPM);
        c15325l.m3988import(EnumC17969l.CATALOG_NO, EnumC13195l.f25830l);
        c15325l.m3988import(EnumC17969l.CHOIR, EnumC13195l.f25827l);
        c15325l.m3988import(EnumC17969l.CHOIR_SORT, EnumC13195l.f25816l);
        c15325l.m3988import(EnumC17969l.CLASSICAL_CATALOG, EnumC13195l.f25953l);
        c15325l.m3988import(EnumC17969l.CLASSICAL_NICKNAME, EnumC13195l.f25846l);
        c15325l.m3988import(EnumC17969l.COMMENT, EnumC13195l.COMMENT);
        c15325l.m3988import(EnumC17969l.COMPOSER, EnumC13195l.COMPOSER);
        c15325l.m3988import(EnumC17969l.COMPOSER_SORT, EnumC13195l.COMPOSER_SORT);
        c15325l.m3988import(EnumC17969l.CONDUCTOR, EnumC13195l.CONDUCTOR);
        c15325l.m3988import(EnumC17969l.CONDUCTOR_SORT, EnumC13195l.f25912l);
        c15325l.m3988import(EnumC17969l.COUNTRY, EnumC13195l.f25950l);
        c15325l.m3988import(EnumC17969l.COVER_ART, EnumC13195l.COVER_ART);
        c15325l.m3988import(EnumC17969l.CUSTOM1, EnumC13195l.f25923l);
        c15325l.m3988import(EnumC17969l.CUSTOM2, EnumC13195l.f25806l);
        c15325l.m3988import(EnumC17969l.CUSTOM3, EnumC13195l.f25940l);
        c15325l.m3988import(EnumC17969l.CUSTOM4, EnumC13195l.f25845l);
        c15325l.m3988import(EnumC17969l.CUSTOM5, EnumC13195l.f25889l);
        c15325l.m3988import(EnumC17969l.DISC_NO, EnumC13195l.DISC_NO);
        c15325l.m3988import(EnumC17969l.DISC_SUBTITLE, EnumC13195l.DISC_SUBTITLE);
        c15325l.m3988import(EnumC17969l.DISC_TOTAL, EnumC13195l.DISC_TOTAL);
        c15325l.m3988import(EnumC17969l.DJMIXER, EnumC13195l.f25839l);
        c15325l.m3988import(EnumC17969l.MOOD_ELECTRONIC, EnumC13195l.f25903l);
        c15325l.m3988import(EnumC17969l.ENCODER, EnumC13195l.ENCODER);
        c15325l.m3988import(EnumC17969l.ENGINEER, EnumC13195l.f25821l);
        c15325l.m3988import(EnumC17969l.ENSEMBLE, EnumC13195l.f25848l);
        c15325l.m3988import(EnumC17969l.ENSEMBLE_SORT, EnumC13195l.f25907l);
        c15325l.m3988import(EnumC17969l.FBPM, EnumC13195l.f25865l);
        c15325l.m3988import(EnumC17969l.GENRE, EnumC13195l.GENRE);
        c15325l.m3988import(EnumC17969l.GROUPING, EnumC13195l.GROUPING);
        c15325l.m3988import(EnumC17969l.MOOD_INSTRUMENTAL, EnumC13195l.f25840l);
        c15325l.m3988import(EnumC17969l.INVOLVED_PERSON, EnumC13195l.INVOLVED_PERSON);
        c15325l.m3988import(EnumC17969l.ISRC, EnumC13195l.ISRC);
        c15325l.m3988import(EnumC17969l.IS_CLASSICAL, EnumC13195l.f25832l);
        c15325l.m3988import(EnumC17969l.IS_COMPILATION, EnumC13195l.IS_COMPILATION);
        c15325l.m3988import(EnumC17969l.IS_SOUNDTRACK, EnumC13195l.f25908l);
        c15325l.m3988import(EnumC17969l.ITUNES_GROUPING, EnumC13195l.ITUNES_GROUPING);
        c15325l.m3988import(EnumC17969l.KEY, EnumC13195l.KEY);
        c15325l.m3988import(EnumC17969l.LANGUAGE, EnumC13195l.LANGUAGE);
        c15325l.m3988import(EnumC17969l.LYRICIST, EnumC13195l.LYRICIST);
        c15325l.m3988import(EnumC17969l.LYRICS, EnumC13195l.LYRICS);
        c15325l.m3988import(EnumC17969l.MEDIA, EnumC13195l.MEDIA);
        c15325l.m3988import(EnumC17969l.MIXER, EnumC13195l.f25914l);
        c15325l.m3988import(EnumC17969l.MOOD, EnumC13195l.f25835l);
        c15325l.m3988import(EnumC17969l.MOOD_ACOUSTIC, EnumC13195l.f25829l);
        c15325l.m3988import(EnumC17969l.MOOD_AGGRESSIVE, EnumC13195l.f25811l);
        c15325l.m3988import(EnumC17969l.MOOD_AROUSAL, EnumC13195l.f25917l);
        c15325l.m3988import(EnumC17969l.MOOD_DANCEABILITY, EnumC13195l.f25891l);
        c15325l.m3988import(EnumC17969l.MOOD_HAPPY, EnumC13195l.f25934l);
        c15325l.m3988import(EnumC17969l.MOOD_PARTY, EnumC13195l.f25869l);
        c15325l.m3988import(EnumC17969l.MOOD_RELAXED, EnumC13195l.f25823l);
        c15325l.m3988import(EnumC17969l.MOOD_SAD, EnumC13195l.f25947l);
        c15325l.m3988import(EnumC17969l.MOOD_VALENCE, EnumC13195l.f25954l);
        c15325l.m3988import(EnumC17969l.MOVEMENT, EnumC13195l.MOVEMENT);
        c15325l.m3988import(EnumC17969l.MOVEMENT_NO, EnumC13195l.MOVEMENT_NO);
        c15325l.m3988import(EnumC17969l.MOVEMENT_TOTAL, EnumC13195l.MOVEMENT_TOTAL);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_ARTISTID, EnumC13195l.f25875l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_DISC_ID, EnumC13195l.f25942l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC13195l.f25930l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASEARTISTID, EnumC13195l.f25897l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASEID, EnumC13195l.f25853l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_COUNTRY, EnumC13195l.f25946l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC13195l.f25901l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_STATUS, EnumC13195l.f25944l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC13195l.f25874l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_RELEASE_TYPE, EnumC13195l.f25841l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_TRACK_ID, EnumC13195l.f25864l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK, EnumC13195l.f25867l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_ID, EnumC13195l.f25911l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC13195l.f25828l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC13195l.f25837l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC13195l.f25937l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC13195l.f25932l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC13195l.f25902l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC13195l.f25809l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC13195l.f25906l);
        c15325l.m3988import(EnumC17969l.MUSICIP_ID, EnumC13195l.f25862l);
        c15325l.m3988import(EnumC17969l.OCCASION, EnumC13195l.f25859l);
        c15325l.m3988import(EnumC17969l.OPUS, EnumC13195l.f25861l);
        c15325l.m3988import(EnumC17969l.ORCHESTRA, EnumC13195l.f25878l);
        c15325l.m3988import(EnumC17969l.ORCHESTRA_SORT, EnumC13195l.f25955l);
        c15325l.m3988import(EnumC17969l.ORIGINAL_ALBUM, EnumC13195l.ORIGINAL_ALBUM);
        c15325l.m3988import(EnumC17969l.ORIGINAL_ARTIST, EnumC13195l.ORIGINAL_ARTIST);
        c15325l.m3988import(EnumC17969l.ORIGINAL_LYRICIST, EnumC13195l.ORIGINAL_LYRICIST);
        c15325l.m3988import(EnumC17969l.ORIGINAL_YEAR, EnumC13195l.ORIGINAL_YEAR);
        c15325l.m3988import(EnumC17969l.PART, EnumC13195l.f25926l);
        c15325l.m3988import(EnumC17969l.PART_NUMBER, EnumC13195l.f25905l);
        c15325l.m3988import(EnumC17969l.PART_TYPE, EnumC13195l.f25873l);
        c15325l.m3988import(EnumC17969l.PERFORMER, EnumC13195l.PERFORMER);
        c15325l.m3988import(EnumC17969l.PERFORMER_NAME, EnumC13195l.f25931l);
        c15325l.m3988import(EnumC17969l.PERFORMER_NAME_SORT, EnumC13195l.f25834l);
        c15325l.m3988import(EnumC17969l.PERIOD, EnumC13195l.f25883l);
        c15325l.m3988import(EnumC17969l.PRODUCER, EnumC13195l.f25822l);
        c15325l.m3988import(EnumC17969l.QUALITY, EnumC13195l.f25922l);
        c15325l.m3988import(EnumC17969l.RANKING, EnumC13195l.f25890l);
        c15325l.m3988import(EnumC17969l.RATING, EnumC13195l.RATING);
        c15325l.m3988import(EnumC17969l.RECORD_LABEL, EnumC13195l.RECORD_LABEL);
        c15325l.m3988import(EnumC17969l.REMIXER, EnumC13195l.REMIXER);
        c15325l.m3988import(EnumC17969l.SCRIPT, EnumC13195l.f25885l);
        c15325l.m3988import(EnumC17969l.SINGLE_DISC_TRACK_NO, EnumC13195l.f25925l);
        c15325l.m3988import(EnumC17969l.SUBTITLE, EnumC13195l.SUBTITLE);
        c15325l.m3988import(EnumC17969l.TAGS, EnumC13195l.f25870l);
        c15325l.m3988import(EnumC17969l.TEMPO, EnumC13195l.f25948l);
        c15325l.m3988import(EnumC17969l.TIMBRE, EnumC13195l.f25836l);
        c15325l.m3988import(EnumC17969l.TITLE, EnumC13195l.TITLE);
        c15325l.m3988import(EnumC17969l.TITLE_MOVEMENT, EnumC13195l.f25819l);
        c15325l.m3988import(EnumC17969l.TITLE_SORT, EnumC13195l.TITLE_SORT);
        c15325l.m3988import(EnumC17969l.TONALITY, EnumC13195l.f25850l);
        c15325l.m3988import(EnumC17969l.TRACK, EnumC13195l.TRACK);
        c15325l.m3988import(EnumC17969l.TRACK_TOTAL, EnumC13195l.TRACK_TOTAL);
        c15325l.m3988import(EnumC17969l.URL_DISCOGS_ARTIST_SITE, EnumC13195l.f25851l);
        c15325l.m3988import(EnumC17969l.URL_DISCOGS_RELEASE_SITE, EnumC13195l.f25887l);
        c15325l.m3988import(EnumC17969l.URL_LYRICS_SITE, EnumC13195l.f25882l);
        c15325l.m3988import(EnumC17969l.URL_OFFICIAL_ARTIST_SITE, EnumC13195l.URL_OFFICIAL_ARTIST_SITE);
        c15325l.m3988import(EnumC17969l.URL_OFFICIAL_RELEASE_SITE, EnumC13195l.f25833l);
        c15325l.m3988import(EnumC17969l.URL_WIKIPEDIA_ARTIST_SITE, EnumC13195l.f25898l);
        c15325l.m3988import(EnumC17969l.URL_WIKIPEDIA_RELEASE_SITE, EnumC13195l.f25871l);
        c15325l.m3988import(EnumC17969l.WORK, EnumC13195l.f25872l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION, EnumC13195l.f25847l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC13195l.f25884l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC13195l.f25941l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC13195l.f25818l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC13195l.f25927l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC13195l.f25810l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC13195l.f25904l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC13195l.f25899l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC13195l.f25886l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC13195l.f25929l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC13195l.f25935l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC13195l.f25900l);
        c15325l.m3988import(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC13195l.f25813l);
        c15325l.m3988import(EnumC17969l.WORK_TYPE, EnumC13195l.f25879l);
        c15325l.m3988import(EnumC17969l.YEAR, EnumC13195l.YEAR);
        return c15325l.adcel();
    }

    public static C15333l isPro() {
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch("TPE2", "Text: Band/Orchestra/Accompaniment");
        c13698lYandex.mo3668catch("TALB", "Text: Album/Movie/Show title");
        c13698lYandex.mo3668catch("TPE1", "Text: Lead artist(s)/Lead performer(s)/Soloist(s)/Performing group");
        c13698lYandex.mo3668catch("APIC", "Attached picture");
        c13698lYandex.mo3668catch("AENC", "Audio encryption");
        c13698lYandex.mo3668catch("TBPM", "Text: BPM (Beats Per Minute)");
        c13698lYandex.mo3668catch("CHAP", "Chapter");
        c13698lYandex.mo3668catch("CTOC", "Chapter TOC");
        c13698lYandex.mo3668catch("COMM", "Comments");
        c13698lYandex.mo3668catch("COMR", "");
        c13698lYandex.mo3668catch("TCOM", "Text: Composer");
        c13698lYandex.mo3668catch("TPE3", "Text: Conductor/Performer refinement");
        c13698lYandex.mo3668catch("TIT1", "Text: Content group description");
        c13698lYandex.mo3668catch("TCOP", "Text: Copyright message");
        c13698lYandex.mo3668catch("TENC", "Text: Encoded by");
        c13698lYandex.mo3668catch("ENCR", "Encryption method registration");
        c13698lYandex.mo3668catch("EQUA", "Equalization");
        c13698lYandex.mo3668catch("ETCO", "Event timing codes");
        c13698lYandex.mo3668catch("TOWN", "");
        c13698lYandex.mo3668catch("TFLT", "Text: File type");
        c13698lYandex.mo3668catch("GEOB", "General encapsulated datatype");
        c13698lYandex.mo3668catch("TCON", "Text: Content type");
        c13698lYandex.mo3668catch("GRID", "");
        c13698lYandex.mo3668catch("TSSE", "Text: Software/hardware and settings used for encoding");
        c13698lYandex.mo3668catch("TKEY", "Text: Initial key");
        c13698lYandex.mo3668catch("IPLS", "Involved people list");
        c13698lYandex.mo3668catch("TSRC", "Text: ISRC (International Standard Recording Code)");
        c13698lYandex.mo3668catch("GRP1", "Text: iTunes Grouping");
        c13698lYandex.mo3668catch("TLAN", "Text: Language(s)");
        c13698lYandex.mo3668catch("TLEN", "Text: Length");
        c13698lYandex.mo3668catch("LINK", "Linked information");
        c13698lYandex.mo3668catch("TEXT", "Text: Lyricist/text writer");
        c13698lYandex.mo3668catch("TMED", "Text: Media type");
        c13698lYandex.mo3668catch("MVNM", "Text: Movement");
        c13698lYandex.mo3668catch("MVIN", "Text: Movement No");
        c13698lYandex.mo3668catch("MLLT", "MPEG location lookup table");
        c13698lYandex.mo3668catch("MCDI", "Music CD Identifier");
        c13698lYandex.mo3668catch("TOPE", "Text: Original artist(s)/performer(s)");
        c13698lYandex.mo3668catch("TOFN", "Text: Original filename");
        c13698lYandex.mo3668catch("TOLY", "Text: Original Lyricist(s)/text writer(s)");
        c13698lYandex.mo3668catch("TOAL", "Text: Original album/Movie/Show title");
        c13698lYandex.mo3668catch("OWNE", "");
        c13698lYandex.mo3668catch("TDLY", "Text: Playlist delay");
        c13698lYandex.mo3668catch("PCNT", "Play counter");
        c13698lYandex.mo3668catch("POPM", "Popularimeter");
        c13698lYandex.mo3668catch("POSS", "Position Sync");
        c13698lYandex.mo3668catch("PRIV", "Private frame");
        c13698lYandex.mo3668catch("TPUB", "Text: Publisher");
        c13698lYandex.mo3668catch("TRSN", "");
        c13698lYandex.mo3668catch("TRSO", "");
        c13698lYandex.mo3668catch("RBUF", "Recommended buffer size");
        c13698lYandex.mo3668catch("RVAD", "Relative volume adjustment");
        c13698lYandex.mo3668catch("TPE4", "Text: Interpreted, remixed, or otherwise modified by");
        c13698lYandex.mo3668catch("RVRB", "Reverb");
        c13698lYandex.mo3668catch("TPOS", "Text: Part of a setField");
        c13698lYandex.mo3668catch("TSST", "Text: SubTitle");
        c13698lYandex.mo3668catch("SYLT", "Synchronized lyric/text");
        c13698lYandex.mo3668catch("SYTC", "Synced tempo codes");
        c13698lYandex.mo3668catch("TDAT", "Text: Date");
        c13698lYandex.mo3668catch("USER", "");
        c13698lYandex.mo3668catch("TIME", "Text: Time");
        c13698lYandex.mo3668catch("TIT2", "Text: Title/Songname/Content description");
        c13698lYandex.mo3668catch("TIT3", "Text: Subtitle/Description refinement");
        c13698lYandex.mo3668catch("TORY", "Text: Original release year");
        c13698lYandex.mo3668catch("TRCK", "Text: Track number/Position in setField");
        c13698lYandex.mo3668catch("TRDA", "Text: Recording dates");
        c13698lYandex.mo3668catch("TSIZ", "Text: Size");
        c13698lYandex.mo3668catch("TYER", "Text: Year");
        c13698lYandex.mo3668catch("UFID", "Unique file identifier");
        c13698lYandex.mo3668catch("USLT", "Unsychronized lyric/text transcription");
        c13698lYandex.mo3668catch("WOAR", "URL: Official artist/performer webpage");
        c13698lYandex.mo3668catch("WCOM", "URL: Commercial information");
        c13698lYandex.mo3668catch("WCOP", "URL: Copyright/Legal information");
        c13698lYandex.mo3668catch("WOAF", "URL: Official audio file webpage");
        c13698lYandex.mo3668catch("WORS", "Official Radio");
        c13698lYandex.mo3668catch("WPAY", "URL: Payment");
        c13698lYandex.mo3668catch("WPUB", "URL: Publishers official webpage");
        c13698lYandex.mo3668catch("WOAS", "URL: Official audio source webpage");
        c13698lYandex.mo3668catch("TXXX", "User defined text information frame");
        c13698lYandex.mo3668catch("WXXX", "User defined URL link frame");
        c13698lYandex.mo3668catch("TCMP", "Is Compilation");
        c13698lYandex.mo3668catch("TSOT", "Text: title sort order");
        c13698lYandex.mo3668catch("TSOP", "Text: artist sort order");
        c13698lYandex.mo3668catch("TSOA", "Text: album sort order");
        c13698lYandex.mo3668catch("XSOT", "Text: title sort order");
        c13698lYandex.mo3668catch("XSOP", "Text: artist sort order");
        c13698lYandex.mo3668catch("XSOA", "Text: album sort order");
        c13698lYandex.mo3668catch("TSO2", "Text:Album Artist Sort Order Frame");
        c13698lYandex.mo3668catch("TSOC", "Text:Composer Sort Order Frame");
        return c13698lYandex.metrica(true);
    }

    @Override // defpackage.AbstractC5232l
    public final AbstractC8481l amazon() {
        return AbstractC8481l.Signature("TPE1", "TALB", "TIT2", "TCON", "TRCK", "TYER", "COMM");
    }

    @Override // defpackage.AbstractC5232l
    public final AbstractC8481l billing() {
        return AbstractC8481l.Signature("TXXX", "WXXX", "APIC", "PRIV", "COMM", "UFID", "USLT", "POPM", "GEOB", "WOAR");
    }

    public final boolean mopub(String str) {
        if (this.purchase == null) {
            synchronized (this) {
                try {
                    if (this.purchase == null) {
                        this.purchase = isPro();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.purchase.containsKey(str);
    }

    @Override // defpackage.AbstractC5232l
    public final AbstractC8481l purchase() {
        return AbstractC8481l.Signature("ETCO", "EQUA", "MLLT", "POSS", "SYLT", "SYTC", "RVAD", "ETCO", "TENC", "TLEN", "TSIZ");
    }

    public final C1394l subs() {
        if (this.amazon == null) {
            synchronized (this) {
                try {
                    if (this.amazon == null) {
                        this.amazon = firebase();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.amazon;
    }
}
