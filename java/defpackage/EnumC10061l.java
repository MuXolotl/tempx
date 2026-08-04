package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lَؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10061l {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("FORMAT_PCM", "WAV PCM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("FORMAT_FLOAT", "WAV IEEE_FLOAT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("FORMAT_ALAW", "WAV A-LAW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("FORMAT_MULAW", "WAV µ-LAW"),
    f20524l("FORMAT_EXTENSIBLE", "EXTENSIBLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF66("FORMAT_GSM_COMPRESSED", "GSM_COMPRESSED");


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final HashMap f20526l = new HashMap();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f20527l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f20528l;

    static {
        for (EnumC10061l enumC10061l : values()) {
            f20526l.put(Integer.valueOf(enumC10061l.f20528l), enumC10061l);
        }
    }

    EnumC10061l(String str, String str2) {
        this.f20528l = i;
        this.f20527l = str2;
    }
}
