package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.util.HashMap;

/* JADX INFO: renamed from: lؙْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13195l {
    f25824l("TXXX", FrameBodyTXXX.ACOUSTID_FINGERPRINT),
    f25895l("TXXX", FrameBodyTXXX.ACOUSTID_ID),
    ALBUM("TALB"),
    ALBUM_ARTIST("TPE2"),
    ALBUM_ARTIST_SORT("TSO2"),
    f25831l("TXXX", FrameBodyTXXX.ALBUM_ARTISTS),
    f25924l("TXXX", FrameBodyTXXX.ALBUM_ARTISTS_SORT),
    ALBUM_SORT("TSOA"),
    f25939l("TXXX", FrameBodyTXXX.AMAZON_ASIN),
    f25920l("IPLS", "arranger"),
    f25817l("TXXX", FrameBodyTXXX.ARRANGER_SORT),
    ARTIST("TPE1"),
    f25893l("TXXX", FrameBodyTXXX.ARTISTS),
    f25843l("TXXX", FrameBodyTXXX.ARTISTS_SORT),
    ARTIST_SORT("TSOP"),
    f25952l("TXXX", FrameBodyTXXX.BARCODE),
    BPM("TBPM"),
    f25830l("TXXX", FrameBodyTXXX.CATALOG_NO),
    f25827l("TXXX", FrameBodyTXXX.CHOIR),
    f25816l("TXXX", FrameBodyTXXX.CHOIR_SORT),
    f25953l("TXXX", FrameBodyTXXX.CLASSICAL_CATALOG),
    f25846l("TXXX", FrameBodyTXXX.CLASSICAL_NICKNAME),
    COMMENT("COMM"),
    COMPOSER("TCOM"),
    COMPOSER_SORT("TSOC"),
    CONDUCTOR("TPE3"),
    f25912l("TXXX", FrameBodyTXXX.CONDUCTOR_SORT),
    f25950l("TXXX", FrameBodyTXXX.COUNTRY),
    COVER_ART("APIC"),
    f25923l("COMM", FrameBodyCOMM.MM_CUSTOM1),
    f25806l("COMM", FrameBodyCOMM.MM_CUSTOM2),
    f25940l("COMM", FrameBodyCOMM.MM_CUSTOM3),
    f25845l("COMM", FrameBodyCOMM.MM_CUSTOM4),
    f25889l("COMM", FrameBodyCOMM.MM_CUSTOM5),
    DISC_NO("TPOS"),
    DISC_SUBTITLE("TSST"),
    DISC_TOTAL("TPOS"),
    f25839l("IPLS", "DJ-mix"),
    ENCODER("TENC"),
    f25821l("IPLS", "engineer"),
    f25848l("TXXX", FrameBodyTXXX.ENSEMBLE),
    f25907l("TXXX", FrameBodyTXXX.ENSEMBLE_SORT),
    f25865l("TXXX", FrameBodyTXXX.FBPM),
    GENRE("TCON"),
    GROUPING("TIT1"),
    INVOLVED_PERSON("IPLS"),
    ISRC("TSRC"),
    f25832l("TXXX", FrameBodyTXXX.IS_CLASSICAL),
    IS_COMPILATION("TCMP"),
    f25908l("TXXX", FrameBodyTXXX.IS_SOUNDTRACK),
    ITUNES_GROUPING("GRP1"),
    KEY("TKEY"),
    LANGUAGE("TLAN"),
    LYRICIST("TEXT"),
    LYRICS("USLT"),
    MEDIA("TMED"),
    f25914l("IPLS", "mix"),
    f25835l("TXXX", FrameBodyTXXX.MOOD),
    f25829l("TXXX", FrameBodyTXXX.MOOD_ACOUSTIC),
    f25811l("TXXX", FrameBodyTXXX.MOOD_AGGRESSIVE),
    f25917l("TXXX", FrameBodyTXXX.MOOD_AROUSAL),
    f25891l("TXXX", FrameBodyTXXX.MOOD_DANCEABILITY),
    f25903l("TXXX", FrameBodyTXXX.MOOD_ELECTRONIC),
    f25934l("TXXX", FrameBodyTXXX.MOOD_HAPPY),
    f25840l("TXXX", FrameBodyTXXX.MOOD_INSTRUMENTAL),
    f25869l("TXXX", FrameBodyTXXX.MOOD_PARTY),
    f25823l("TXXX", FrameBodyTXXX.MOOD_RELAXED),
    f25947l("TXXX", FrameBodyTXXX.MOOD_SAD),
    f25954l("TXXX", FrameBodyTXXX.MOOD_VALENCE),
    MOVEMENT("MVNM"),
    MOVEMENT_NO("MVIN"),
    MOVEMENT_TOTAL("MVIN"),
    f25875l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ARTISTID),
    f25942l("TXXX", FrameBodyTXXX.MUSICBRAINZ_DISCID),
    f25930l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ORIGINAL_ALBUMID),
    f25897l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_ARTISTID),
    f25853l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUMID),
    f25946l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_COUNTRY),
    f25901l("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_GROUPID),
    f25944l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_STATUS),
    f25874l("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_TRACKID),
    f25841l("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_TYPE),
    f25864l("UFID", FrameBodyUFID.UFID_MUSICBRAINZ),
    f25847l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION),
    f25828l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION_ID),
    f25911l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORKID),
    f25837l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_ID),
    f25937l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_ID),
    f25932l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_ID),
    f25902l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_ID),
    f25809l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_ID),
    f25906l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_ID),
    f25862l("TXXX", FrameBodyTXXX.MUSICIP_ID),
    f25859l("COMM", FrameBodyCOMM.MM_OCCASION),
    f25861l("TXXX", FrameBodyTXXX.OPUS),
    f25878l("TXXX", FrameBodyTXXX.ORCHESTRA),
    f25955l("TXXX", FrameBodyTXXX.ORCHESTRA_SORT),
    ORIGINAL_ALBUM("TOAL"),
    ORIGINAL_ARTIST("TOPE"),
    ORIGINAL_LYRICIST("TOLY"),
    ORIGINAL_YEAR("TORY"),
    f25926l("TXXX", FrameBodyTXXX.PART),
    f25905l("TXXX", FrameBodyTXXX.PART_NUMBER),
    f25873l("TXXX", FrameBodyTXXX.PART_TYPE),
    PERFORMER("IPLS"),
    f25931l("TXXX", FrameBodyTXXX.PERFORMER_NAME),
    f25834l("TXXX", FrameBodyTXXX.PERFORMER_NAME_SORT),
    f25883l("TXXX", FrameBodyTXXX.PERIOD),
    f25822l("IPLS", "producer"),
    f25922l("COMM", FrameBodyCOMM.MM_QUALITY),
    f25890l("TXXX", FrameBodyTXXX.RANKING),
    RATING("POPM"),
    RECORD_LABEL("TPUB"),
    REMIXER("TPE4"),
    f25885l("TXXX", FrameBodyTXXX.SCRIPT),
    f25925l("TXXX", FrameBodyTXXX.SINGLE_DISC_TRACK_NO),
    SUBTITLE("TIT3"),
    f25870l("TXXX", FrameBodyTXXX.TAGS),
    f25948l("COMM", FrameBodyCOMM.MM_TEMPO),
    f25836l("TXXX", FrameBodyTXXX.TIMBRE),
    TITLE("TIT2"),
    f25819l("TXXX", FrameBodyTXXX.TITLE_MOVEMENT),
    f25867l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK),
    TITLE_SORT("TSOT"),
    f25850l("TXXX", FrameBodyTXXX.TONALITY),
    TRACK("TRCK"),
    TRACK_TOTAL("TRCK"),
    f25851l("WXXX", FrameBodyWXXX.URL_DISCOGS_ARTIST_SITE),
    f25887l("WXXX", FrameBodyWXXX.URL_DISCOGS_RELEASE_SITE),
    f25882l("WXXX", FrameBodyWXXX.URL_LYRICS_SITE),
    URL_OFFICIAL_ARTIST_SITE("WOAR"),
    f25833l("WXXX", FrameBodyWXXX.URL_OFFICIAL_RELEASE_SITE),
    f25898l("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_ARTIST_SITE),
    f25871l("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_RELEASE_SITE),
    f25872l("TXXX", FrameBodyTXXX.WORK),
    f25884l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1),
    f25941l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE),
    f25818l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2),
    f25927l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE),
    f25810l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3),
    f25904l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE),
    f25899l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4),
    f25886l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE),
    f25929l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5),
    f25935l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE),
    f25900l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6),
    f25813l("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE),
    f25879l("TXXX", FrameBodyTXXX.WORK_TYPE),
    YEAR("TYER");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f25956l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f25957l;

    static {
        HashMap map = EnumC1699l.f4087l;
        HashMap map2 = EnumC1699l.f4087l;
        HashMap map3 = EnumC1699l.f4087l;
        HashMap map4 = EnumC1699l.f4087l;
        HashMap map5 = EnumC1699l.f4087l;
    }

    EnumC13195l(String str, String str2) {
        this.f25957l = str;
        this.f25956l = str2;
        StringBuilder sb = AbstractC11174l.yandex;
        sb.setLength(0);
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC12442l.subscription(sb.length() <= 48);
    }

    EnumC13195l(String str) {
        this.f25957l = str;
    }
}
