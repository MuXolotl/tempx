package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lۣٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4474l {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final LinkedHashMap f9099l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f9104l;

    static {
        EnumC4474l[] enumC4474lArrValues = values();
        int iFirebase = AbstractC2200l.firebase(enumC4474lArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase < 16 ? 16 : iFirebase);
        for (EnumC4474l enumC4474l : enumC4474lArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC4474l.f9104l), enumC4474l);
        }
        f9099l = linkedHashMap;
    }

    EnumC4474l(int i) {
        this.f9104l = i;
    }
}
