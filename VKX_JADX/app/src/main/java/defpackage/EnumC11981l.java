package defpackage;

import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: lِٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11981l {
    IMPLICIT(0),
    TEXT(1),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT_UTF16BE(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT_JAPANESE(3),
    /* JADX INFO: Fake field, exist only in values array */
    HTML(6),
    /* JADX INFO: Fake field, exist only in values array */
    XML(7),
    /* JADX INFO: Fake field, exist only in values array */
    GUID(8),
    /* JADX INFO: Fake field, exist only in values array */
    ISRC(9),
    /* JADX INFO: Fake field, exist only in values array */
    MI3P(10),
    COVERART_GIF(12),
    COVERART_JPEG(13),
    COVERART_PNG(14),
    /* JADX INFO: Fake field, exist only in values array */
    URL(15),
    /* JADX INFO: Fake field, exist only in values array */
    DURATION(16),
    /* JADX INFO: Fake field, exist only in values array */
    UPC(17),
    /* JADX INFO: Fake field, exist only in values array */
    RIAAPA(18),
    INTEGER(21),
    /* JADX INFO: Fake field, exist only in values array */
    RIAAPA(24),
    /* JADX INFO: Fake field, exist only in values array */
    UPC(25),
    COVERART_BMP(27);


    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final EnumSet f23883l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final HashMap f23886l = new HashMap(values().length);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f23889l;

    static {
        for (EnumC11981l enumC11981l : values()) {
            f23886l.put(Integer.valueOf(enumC11981l.f23889l), enumC11981l);
        }
        f23883l = EnumSet.of(COVERART_GIF, COVERART_JPEG, COVERART_PNG, COVERART_BMP);
    }

    EnumC11981l(int i) {
        this.f23889l = i;
    }
}
