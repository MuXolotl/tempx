package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.util.HashMap;

/* JADX INFO: renamed from: lؙۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4724l {
    f9605l("TXXX", FrameBodyTXXX.ACOUSTID_FINGERPRINT),
    f9676l("TXXX", FrameBodyTXXX.ACOUSTID_ID),
    ALBUM("TALB"),
    ALBUM_ARTIST("TPE2"),
    ALBUM_ARTIST_SORT("TSO2"),
    f9612l("TXXX", FrameBodyTXXX.ALBUM_ARTISTS),
    f9705l("TXXX", FrameBodyTXXX.ALBUM_ARTISTS_SORT),
    ALBUM_SORT("TSOA"),
    f9720l("TXXX", FrameBodyTXXX.AMAZON_ASIN),
    f9701l("TIPL", "arranger"),
    f9598l("TXXX", FrameBodyTXXX.ARRANGER_SORT),
    ARTIST("TPE1"),
    f9674l("TXXX", FrameBodyTXXX.ARTISTS),
    f9624l("TXXX", FrameBodyTXXX.ARTISTS_SORT),
    ARTIST_SORT("TSOP"),
    f9733l("TXXX", FrameBodyTXXX.BARCODE),
    BPM("TBPM"),
    f9611l("TXXX", FrameBodyTXXX.CATALOG_NO),
    f9608l("TXXX", FrameBodyTXXX.CHOIR),
    f9597l("TXXX", FrameBodyTXXX.CHOIR_SORT),
    f9734l("TXXX", FrameBodyTXXX.CLASSICAL_CATALOG),
    f9627l("TXXX", FrameBodyTXXX.CLASSICAL_NICKNAME),
    COMMENT("COMM"),
    COMPOSER("TCOM"),
    COMPOSER_SORT("TSOC"),
    CONDUCTOR("TPE3"),
    f9693l("TXXX", FrameBodyTXXX.CONDUCTOR_SORT),
    f9731l("TXXX", FrameBodyTXXX.COUNTRY),
    COVER_ART("APIC"),
    f9704l("COMM", FrameBodyCOMM.MM_CUSTOM1),
    f9587l("COMM", FrameBodyCOMM.MM_CUSTOM2),
    f9721l("COMM", FrameBodyCOMM.MM_CUSTOM3),
    f9626l("COMM", FrameBodyCOMM.MM_CUSTOM4),
    f9670l("COMM", FrameBodyCOMM.MM_CUSTOM5),
    DISC_NO("TPOS"),
    DISC_SUBTITLE("TSST"),
    DISC_TOTAL("TPOS"),
    f9620l("TIPL", "DJ-mix"),
    ENCODER("TENC"),
    f9602l("TIPL", "engineer"),
    f9629l("TXXX", FrameBodyTXXX.ENSEMBLE),
    f9688l("TXXX", FrameBodyTXXX.ENSEMBLE_SORT),
    f9646l("TXXX", FrameBodyTXXX.FBPM),
    GENRE("TCON"),
    GROUPING("TIT1"),
    INVOLVED_PERSON("TIPL"),
    ISRC("TSRC"),
    f9613l("TXXX", FrameBodyTXXX.IS_CLASSICAL),
    IS_COMPILATION("TCMP"),
    f9689l("TXXX", FrameBodyTXXX.IS_SOUNDTRACK),
    ITUNES_GROUPING("GRP1"),
    KEY("TKEY"),
    LANGUAGE("TLAN"),
    LYRICIST("TEXT"),
    LYRICS("USLT"),
    MEDIA("TMED"),
    f9695l("TIPL", "mix"),
    MOOD("TMOO"),
    f9610l("TXXX", FrameBodyTXXX.MOOD_ACOUSTIC),
    f9592l("TXXX", FrameBodyTXXX.MOOD_AGGRESSIVE),
    f9698l("TXXX", FrameBodyTXXX.MOOD_AROUSAL),
    f9672l("TXXX", FrameBodyTXXX.MOOD_DANCEABILITY),
    f9684l("TXXX", FrameBodyTXXX.MOOD_ELECTRONIC),
    f9715l("TXXX", FrameBodyTXXX.MOOD_HAPPY),
    f9621l("TXXX", FrameBodyTXXX.MOOD_INSTRUMENTAL),
    f9650l("TXXX", FrameBodyTXXX.MOOD_PARTY),
    f9604l("TXXX", FrameBodyTXXX.MOOD_RELAXED),
    f9728l("TXXX", FrameBodyTXXX.MOOD_SAD),
    f9735l("TXXX", FrameBodyTXXX.MOOD_VALENCE),
    MOVEMENT("MVNM"),
    MOVEMENT_NO("MVIN"),
    MOVEMENT_TOTAL("MVIN"),
    f9656l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ARTISTID),
    f9723l("TXXX", FrameBodyTXXX.MUSICBRAINZ_DISCID),
    f9711l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ORIGINAL_ALBUMID),
    f9678l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_ARTISTID),
    f9634l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUMID),
    f9727l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_COUNTRY),
    f9682l("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_GROUPID),
    f9725l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_STATUS),
    f9655l("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_TRACKID),
    f9622l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_TYPE),
    f9645l("UFID", FrameBodyUFID.UFID_MUSICBRAINZ),
    f9628l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION_ID),
    f9609l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORKID),
    f9692l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_ID),
    f9618l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_ID),
    f9718l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_ID),
    f9713l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_ID),
    f9683l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_ID),
    f9590l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_ID),
    f9687l("TXXX", FrameBodyTXXX.MUSICIP_ID),
    f9643l("COMM", FrameBodyCOMM.MM_OCCASION),
    f9640l("TXXX", FrameBodyTXXX.OPUS),
    f9642l("TXXX", FrameBodyTXXX.ORCHESTRA),
    f9659l("TXXX", FrameBodyTXXX.ORCHESTRA_SORT),
    ORIGINAL_ALBUM("TOAL"),
    ORIGINAL_ARTIST("TOPE"),
    ORIGINAL_LYRICIST("TOLY"),
    ORIGINAL_YEAR("TDOR"),
    f9709l("TXXX", FrameBodyTXXX.PART),
    f9707l("TXXX", FrameBodyTXXX.PART_NUMBER),
    f9686l("TXXX", FrameBodyTXXX.PART_TYPE),
    PERFORMER("TMCL"),
    f9588l("TXXX", FrameBodyTXXX.PERFORMER_NAME),
    f9712l("TXXX", FrameBodyTXXX.PERFORMER_NAME_SORT),
    f9615l("TXXX", FrameBodyTXXX.PERIOD),
    f9664l("TIPL", "producer"),
    f9603l("COMM", FrameBodyCOMM.MM_QUALITY),
    f9703l("TXXX", FrameBodyTXXX.RANKING),
    RATING("POPM"),
    RECORD_LABEL("TPUB"),
    REMIXER("TPE4"),
    f9714l("TXXX", FrameBodyTXXX.SCRIPT),
    f9666l("TXXX", FrameBodyTXXX.SINGLE_DISC_TRACK_NO),
    SUBTITLE("TIT3"),
    f9630l("TXXX", FrameBodyTXXX.TAGS),
    f9651l("COMM", FrameBodyCOMM.MM_TEMPO),
    f9729l("TXXX", FrameBodyTXXX.TIMBRE),
    TITLE("TIT2"),
    f9697l("TXXX", FrameBodyTXXX.TITLE_MOVEMENT),
    f9600l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK),
    TITLE_SORT("TSOT"),
    f9673l("TXXX", FrameBodyTXXX.TONALITY),
    TRACK("TRCK"),
    TRACK_TOTAL("TRCK"),
    f9702l("WXXX", FrameBodyWXXX.URL_DISCOGS_ARTIST_SITE),
    f9632l("WXXX", FrameBodyWXXX.URL_DISCOGS_RELEASE_SITE),
    f9668l("WXXX", FrameBodyWXXX.URL_LYRICS_SITE),
    URL_OFFICIAL_ARTIST_SITE("WOAR"),
    f9690l("WXXX", FrameBodyWXXX.URL_OFFICIAL_RELEASE_SITE),
    f9614l("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_ARTIST_SITE),
    f9679l("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_RELEASE_SITE),
    f9652l("TXXX", FrameBodyTXXX.WORK),
    f9653l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION),
    f9665l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE),
    f9722l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1),
    f9599l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE),
    f9708l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2),
    f9591l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE),
    f9685l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3),
    f9680l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4),
    f9667l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE),
    f9710l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5),
    f9716l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE),
    f9681l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6),
    f9594l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE),
    f9660l("TXXX", FrameBodyTXXX.WORK_TYPE),
    YEAR("TDRC");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f9737l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f9738l;

    static {
        HashMap map = EnumC1699l.f4087l;
        HashMap map2 = EnumC1699l.f4087l;
        HashMap map3 = EnumC1699l.f4087l;
        HashMap map4 = EnumC1699l.f4087l;
        HashMap map5 = EnumC1699l.f4087l;
    }

    EnumC4724l(String str, String str2) {
        this.f9738l = str;
        this.f9737l = str2;
        StringBuilder sb = AbstractC5833l.yandex;
        sb.setLength(0);
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC12442l.subscription(sb.length() <= 48);
    }

    EnumC4724l(String str) {
        this.f9738l = str;
    }
}
