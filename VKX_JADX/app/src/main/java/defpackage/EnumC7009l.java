package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lؚٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7009l {
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("AUDIO"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("VIDEO"),
    SUBTITLES("SUBTITLES"),
    CLOSED_CAPTIONS("CLOSED-CAPTIONS");


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final HashMap f14702l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f14703l;

    static {
        for (EnumC7009l enumC7009l : values()) {
            f14702l.put(enumC7009l.f14703l, enumC7009l);
        }
    }

    EnumC7009l(String str) {
        this.f14703l = str;
    }
}
