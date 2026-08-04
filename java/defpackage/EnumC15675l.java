package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.util.HashMap;

/* JADX INFO: renamed from: lٕٓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15675l {
    f30669l("TXX", FrameBodyTXXX.ACOUSTID_FINGERPRINT),
    f30740l("TXX", FrameBodyTXXX.ACOUSTID_ID),
    ALBUM("TAL"),
    ALBUM_ARTIST("TP2"),
    ALBUM_ARTIST_SORT("TS2"),
    f30676l("TXX", FrameBodyTXXX.ALBUM_ARTISTS),
    f30769l("TXX", FrameBodyTXXX.ALBUM_ARTISTS_SORT),
    ALBUM_SORT("TSA"),
    f30784l("TXX", FrameBodyTXXX.AMAZON_ASIN),
    f30765l("IPL", "arranger"),
    f30662l("TXX", FrameBodyTXXX.ARRANGER_SORT),
    ARTIST("TP1"),
    f30738l("TXX", FrameBodyTXXX.ARTISTS),
    f30688l("TXX", FrameBodyTXXX.ARTISTS_SORT),
    ARTIST_SORT("TSP"),
    f30797l("TXX", FrameBodyTXXX.BARCODE),
    BPM("TBP"),
    f30675l("TXX", FrameBodyTXXX.CATALOG_NO),
    f30672l("TXX", FrameBodyTXXX.CHOIR),
    f30661l("TXX", FrameBodyTXXX.CHOIR_SORT),
    f30798l("TXX", FrameBodyTXXX.CLASSICAL_CATALOG),
    f30691l("TXX", FrameBodyTXXX.CLASSICAL_NICKNAME),
    COMMENT("COM"),
    COMPOSER("TCM"),
    COMPOSER_SORT("TSC"),
    CONDUCTOR("TPE"),
    f30757l("TXX", FrameBodyTXXX.CONDUCTOR_SORT),
    f30795l("TXX", FrameBodyTXXX.COUNTRY),
    COVER_ART("PIC"),
    f30768l("COM", FrameBodyCOMM.MM_CUSTOM1),
    f30651l("COM", FrameBodyCOMM.MM_CUSTOM2),
    f30785l("COM", FrameBodyCOMM.MM_CUSTOM3),
    f30690l("COM", FrameBodyCOMM.MM_CUSTOM4),
    f30734l("COM", FrameBodyCOMM.MM_CUSTOM5),
    DISC_NO("TPA"),
    DISC_SUBTITLE("TPS"),
    DISC_TOTAL("TPA"),
    f30684l("IPL", "DJ-mix"),
    ENCODER("TEN"),
    f30666l("IPL", "engineer"),
    f30693l("TXX", FrameBodyTXXX.ENSEMBLE),
    f30752l("TXX", FrameBodyTXXX.ENSEMBLE_SORT),
    f30710l("TXX", FrameBodyTXXX.FBPM),
    GENRE("TCO"),
    GROUPING("TT1"),
    f30796l("TXX", FrameBodyTXXX.MOOD_INSTRUMENTAL),
    INVOLVED_PERSON("IPL"),
    ISRC("TRC"),
    f30721l("TXX", FrameBodyTXXX.IS_CLASSICAL),
    IS_COMPILATION("TCP"),
    f30699l("TXX", FrameBodyTXXX.IS_SOUNDTRACK),
    ITUNES_GROUPING("GP1"),
    KEY("TKE"),
    LANGUAGE("TLA"),
    LYRICIST("TXT"),
    LYRICS("ULT"),
    MEDIA("TMT"),
    f30680l("IPL", "mix"),
    f30674l("TXX", FrameBodyTXXX.MOOD),
    f30656l("TXX", FrameBodyTXXX.MOOD_ACOUSTIC),
    f30762l("TXX", FrameBodyTXXX.MOOD_AGGRESSIVE),
    f30736l("TXX", FrameBodyTXXX.MOOD_AROUSAL),
    f30748l("TXX", FrameBodyTXXX.MOOD_DANCEABILITY),
    f30779l("TXX", FrameBodyTXXX.MOOD_ELECTRONIC),
    f30685l("TXX", FrameBodyTXXX.MOOD_HAPPY),
    f30714l("TXX", FrameBodyTXXX.MOOD_PARTY),
    f30668l("TXX", FrameBodyTXXX.MOOD_RELAXED),
    f30792l("TXX", FrameBodyTXXX.MOOD_SAD),
    f30799l("TXX", FrameBodyTXXX.MOOD_VALENCE),
    MOVEMENT("MVN"),
    MOVEMENT_NO("MVI"),
    MOVEMENT_TOTAL("MVI"),
    f30720l("TXX", FrameBodyTXXX.MUSICBRAINZ_ARTISTID),
    f30787l("TXX", FrameBodyTXXX.MUSICBRAINZ_DISCID),
    f30775l("TXX", FrameBodyTXXX.MUSICBRAINZ_ORIGINAL_ALBUMID),
    f30742l("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_ARTISTID),
    f30698l("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUMID),
    f30791l("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_COUNTRY),
    f30746l("TXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_GROUPID),
    f30789l("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_STATUS),
    f30719l("TXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_TRACKID),
    f30686l("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_TYPE),
    f30709l("UFI", FrameBodyUFID.UFID_MUSICBRAINZ),
    f30692l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION),
    f30673l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION_ID),
    f30756l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORKID),
    f30682l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_ID),
    f30782l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_ID),
    f30777l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_ID),
    f30747l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_ID),
    f30654l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_ID),
    f30751l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_ID),
    f30707l("TXX", FrameBodyTXXX.MUSICIP_ID),
    f30704l("COM", FrameBodyCOMM.MM_OCCASION),
    f30706l("TXX", FrameBodyTXXX.OPUS),
    f30723l("TXX", FrameBodyTXXX.ORCHESTRA),
    f30800l("TXX", FrameBodyTXXX.ORCHESTRA_SORT),
    ORIGINAL_ALBUM("TOT"),
    ORIGINAL_ARTIST("TOA"),
    ORIGINAL_LYRICIST("TOL"),
    ORIGINAL_YEAR("TOR"),
    f30771l("TXX", FrameBodyTXXX.PART),
    f30750l("TXX", FrameBodyTXXX.PART_NUMBER),
    f30718l("TXX", FrameBodyTXXX.PART_TYPE),
    PERFORMER("IPL"),
    f30776l("TXX", FrameBodyTXXX.PERFORMER_NAME),
    f30679l("TXX", FrameBodyTXXX.PERFORMER_NAME_SORT),
    f30728l("TXX", FrameBodyTXXX.PERIOD),
    f30667l("IPL", "producer"),
    f30767l("COM", FrameBodyCOMM.MM_QUALITY),
    f30735l("TXX", FrameBodyTXXX.RANKING),
    RATING("POP"),
    RECORD_LABEL("TPB"),
    REMIXER("TP4"),
    f30730l("TXX", FrameBodyTXXX.SCRIPT),
    f30770l("TXX", FrameBodyTXXX.SINGLE_DISC_TRACK_NO),
    SUBTITLE("TT3"),
    f30715l("TXX", FrameBodyTXXX.TAGS),
    f30793l("COM", FrameBodyCOMM.MM_TEMPO),
    f30681l("TXX", FrameBodyTXXX.TIMBRE),
    TITLE("TT2"),
    f30664l("TXX", FrameBodyTXXX.TITLE_MOVEMENT),
    f30712l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK),
    TITLE_SORT("TST"),
    f30695l("TXX", FrameBodyTXXX.TONALITY),
    TRACK("TRK"),
    TRACK_TOTAL("TRK"),
    f30696l("WXX", FrameBodyWXXX.URL_DISCOGS_ARTIST_SITE),
    f30732l("WXX", FrameBodyWXXX.URL_DISCOGS_RELEASE_SITE),
    f30727l("WXX", FrameBodyWXXX.URL_LYRICS_SITE),
    URL_OFFICIAL_ARTIST_SITE("WAR"),
    f30678l("WXX", FrameBodyWXXX.URL_OFFICIAL_RELEASE_SITE),
    f30743l("WXX", FrameBodyWXXX.URL_WIKIPEDIA_ARTIST_SITE),
    f30716l("WXX", FrameBodyWXXX.URL_WIKIPEDIA_RELEASE_SITE),
    f30717l("TXX", FrameBodyTXXX.WORK),
    f30729l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1),
    f30786l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE),
    f30663l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2),
    f30772l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE),
    f30655l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3),
    f30749l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE),
    f30744l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4),
    f30731l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE),
    f30774l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5),
    f30780l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE),
    f30745l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6),
    f30658l("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE),
    f30724l("TXX", FrameBodyTXXX.WORK_TYPE),
    YEAR("TYE");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f30801l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f30802l;

    static {
        HashMap map = EnumC1699l.f4087l;
        HashMap map2 = EnumC1699l.f4087l;
        HashMap map3 = EnumC1699l.f4087l;
        HashMap map4 = EnumC1699l.f4087l;
        HashMap map5 = EnumC1699l.f4087l;
    }

    EnumC15675l(String str, String str2) {
        this.f30802l = str;
        this.f30801l = str2;
        StringBuilder sb = AbstractC0545l.yandex;
        sb.setLength(0);
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC12442l.subscription(sb.length() <= 48);
    }

    EnumC15675l(String str) {
        this.f30802l = str;
    }
}
