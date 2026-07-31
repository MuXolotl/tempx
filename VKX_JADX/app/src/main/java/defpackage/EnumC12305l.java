package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٌّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12305l {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT("EVENT"),
    /* JADX INFO: Fake field, exist only in values array */
    VOD("VOD");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final HashMap f24377l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f24378l;

    static {
        for (EnumC12305l enumC12305l : values()) {
            f24377l.put(enumC12305l.f24378l, enumC12305l);
        }
    }

    EnumC12305l(String str) {
        this.f24378l = str;
    }
}
