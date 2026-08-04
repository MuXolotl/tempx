package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lؓۙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2086l {
    /* JADX INFO: Fake field, exist only in values array */
    FORMAT("fmt "),
    /* JADX INFO: Fake field, exist only in values array */
    FACT("fact"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA("data"),
    /* JADX INFO: Fake field, exist only in values array */
    LIST("LIST"),
    /* JADX INFO: Fake field, exist only in values array */
    INFO("INFO"),
    /* JADX INFO: Fake field, exist only in values array */
    ID3("id3 "),
    /* JADX INFO: Fake field, exist only in values array */
    CORRUPT_LIST("iLIS"),
    /* JADX INFO: Fake field, exist only in values array */
    CORRUPT_ID3_LATE("d3 \u0000"),
    /* JADX INFO: Fake field, exist only in values array */
    CORRUPT_ID3_EARLY("\u0000id3");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final HashMap f4674l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f4675l;

    EnumC2086l(String str) {
        this.f4675l = str;
    }

    public static synchronized EnumC2086l yandex(String str) {
        try {
            if (f4674l.isEmpty()) {
                for (EnumC2086l enumC2086l : values()) {
                    f4674l.put(enumC2086l.f4675l, enumC2086l);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (EnumC2086l) f4674l.get(str);
    }
}
