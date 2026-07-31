package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٗۥۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC17542l {
    /* JADX INFO: Fake field, exist only in values array */
    FORMAT_VERSION("FVER"),
    /* JADX INFO: Fake field, exist only in values array */
    APPLICATION("APPL"),
    /* JADX INFO: Fake field, exist only in values array */
    SOUND("SSND"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMON("COMM"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS("COMT"),
    /* JADX INFO: Fake field, exist only in values array */
    NAME("NAME"),
    /* JADX INFO: Fake field, exist only in values array */
    AUTHOR("AUTH"),
    /* JADX INFO: Fake field, exist only in values array */
    COPYRIGHT("(c) "),
    /* JADX INFO: Fake field, exist only in values array */
    ANNOTATION("ANNO"),
    TAG("ID3 "),
    CORRUPT_TAG_LATE("D3 \u0000"),
    CORRUPT_TAG_EARLY("\u0000ID3");


    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final HashMap f34154l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f34157l;

    EnumC17542l(String str) {
        this.f34157l = str;
    }

    public static synchronized EnumC17542l yandex(String str) {
        try {
            if (f34154l.isEmpty()) {
                for (EnumC17542l enumC17542l : values()) {
                    f34154l.put(enumC17542l.f34157l, enumC17542l);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (EnumC17542l) f34154l.get(str);
    }
}
