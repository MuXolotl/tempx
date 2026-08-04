package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٗٝؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC17267l {
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    AES("AES-128"),
    /* JADX INFO: Fake field, exist only in values array */
    SAMPLE_AES("SAMPLE-AES");


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final HashMap f33497l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f33500l;

    static {
        for (EnumC17267l enumC17267l : values()) {
            f33497l.put(enumC17267l.f33500l, enumC17267l);
        }
    }

    EnumC17267l(String str) {
        this.f33500l = str;
    }
}
