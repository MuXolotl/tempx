package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lًؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1375l {
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST("IART", EnumC17969l.ARTIST, 1),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM("IPRD", EnumC17969l.ALBUM, 2),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE("INAM", EnumC17969l.TITLE, 3),
    TRACKNO("ITRK", EnumC17969l.TRACK, 4),
    /* JADX INFO: Fake field, exist only in values array */
    YEAR("ICRD", EnumC17969l.YEAR, 5),
    /* JADX INFO: Fake field, exist only in values array */
    GENRE("IGNR", EnumC17969l.GENRE, 6),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM_ARTIST("iaar", EnumC17969l.ALBUM_ARTIST, 7),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS("ICMT", EnumC17969l.COMMENT, 8),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSER("IMUS", EnumC17969l.COMPOSER, 9),
    /* JADX INFO: Fake field, exist only in values array */
    CONDUCTOR("ITCH", EnumC17969l.CONDUCTOR, 10),
    /* JADX INFO: Fake field, exist only in values array */
    LYRICIST("IWRI", EnumC17969l.LYRICIST, 11),
    /* JADX INFO: Fake field, exist only in values array */
    ENCODER("ISFT", EnumC17969l.ENCODER, 12),
    /* JADX INFO: Fake field, exist only in values array */
    RATING("IRTD", EnumC17969l.RATING, 13),
    /* JADX INFO: Fake field, exist only in values array */
    ISRC("ISRC", EnumC17969l.ISRC, 14),
    /* JADX INFO: Fake field, exist only in values array */
    LABEL("ICMS", EnumC17969l.RECORD_LABEL, 15),
    /* JADX INFO: Fake field, exist only in values array */
    TRACK_GAIN("ITGL", null, 16),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM_GAIN("IAGL", null, 17),
    /* JADX INFO: Fake field, exist only in values array */
    COPYRIGHT("ICOP", null, 18),
    /* JADX INFO: Fake field, exist only in values array */
    TWONKY_TRACKNO("itrk", null, 1);


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f3503l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC17969l f3504l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f3505l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final HashMap f3500l = new HashMap();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final HashMap f3502l = new HashMap();

    EnumC1375l(String str, EnumC17969l enumC17969l, int i) {
        this.f3505l = str;
        this.f3504l = enumC17969l;
        this.f3503l = i;
    }

    public static synchronized EnumC1375l yandex(EnumC17969l enumC17969l) {
        try {
            if (f3502l.isEmpty()) {
                for (EnumC1375l enumC1375l : values()) {
                    EnumC17969l enumC17969l2 = enumC1375l.f3504l;
                    if (enumC17969l2 != null) {
                        f3502l.put(enumC17969l2, enumC1375l);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (EnumC1375l) f3502l.get(enumC17969l);
    }
}
