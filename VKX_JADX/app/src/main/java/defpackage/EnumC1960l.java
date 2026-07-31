package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٜؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1960l {
    f4467l("NONE", "not compressed", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("raw ", "PCM 8-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF38("twos", "PCM 16-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("sowt", "not compressed", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF64("fl32", "PCM 32-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("fl64", "PCM 64-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF90("in24", "PCM 24-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF103("in32", "PCM 32-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF117("alaw", "Alaw 2:1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF131("ulaw", "µlaw 2:1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF145("MAC3", "MACE 3-to-1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF160("MAC6", "MACE 6-to-1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF175("ALAW", "CCITT G.711 A-law", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF190("ULAW", "CCITT G.711 u-law", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF205("FL32", "Float 32", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF220("rt24", "RT24 50:1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF235("rt29", "RT29 50:1", false);


    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final HashMap f4466l = new HashMap();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f4469l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f4470l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f4471l;

    static {
        for (EnumC1960l enumC1960l : values()) {
            f4466l.put(enumC1960l.f4471l, enumC1960l);
        }
    }

    EnumC1960l(String str, String str2, boolean z) {
        this.f4471l = str;
        this.f4470l = str2;
        this.f4469l = z;
    }
}
