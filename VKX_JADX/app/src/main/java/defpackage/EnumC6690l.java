package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lؙۘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6690l {
    f14038l("utf-8", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("windows-1252", false);


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final HashMap f14037l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f14040l;

    static {
        for (EnumC6690l enumC6690l : values()) {
            f14037l.put(enumC6690l.f14040l, enumC6690l);
        }
    }

    EnumC6690l(String str, boolean z) {
        this.f14040l = str;
    }
}
