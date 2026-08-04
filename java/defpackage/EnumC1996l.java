package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؓٞؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1996l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1996l[] f4515l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final SparseArray f4516l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1996l EF0;

    static {
        EnumC1996l enumC1996l = new EnumC1996l("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC1996l enumC1996l2 = new EnumC1996l("GPRS", 1);
        EnumC1996l enumC1996l3 = new EnumC1996l("EDGE", 2);
        EnumC1996l enumC1996l4 = new EnumC1996l("UMTS", 3);
        EnumC1996l enumC1996l5 = new EnumC1996l("CDMA", 4);
        EnumC1996l enumC1996l6 = new EnumC1996l("EVDO_0", 5);
        EnumC1996l enumC1996l7 = new EnumC1996l("EVDO_A", 6);
        EnumC1996l enumC1996l8 = new EnumC1996l("RTT", 7);
        EnumC1996l enumC1996l9 = new EnumC1996l("HSDPA", 8);
        EnumC1996l enumC1996l10 = new EnumC1996l("HSUPA", 9);
        EnumC1996l enumC1996l11 = new EnumC1996l("HSPA", 10);
        EnumC1996l enumC1996l12 = new EnumC1996l("IDEN", 11);
        EnumC1996l enumC1996l13 = new EnumC1996l("EVDO_B", 12);
        EnumC1996l enumC1996l14 = new EnumC1996l("LTE", 13);
        EnumC1996l enumC1996l15 = new EnumC1996l("EHRPD", 14);
        EnumC1996l enumC1996l16 = new EnumC1996l("HSPAP", 15);
        EnumC1996l enumC1996l17 = new EnumC1996l("GSM", 16);
        EnumC1996l enumC1996l18 = new EnumC1996l("TD_SCDMA", 17);
        EnumC1996l enumC1996l19 = new EnumC1996l("IWLAN", 18);
        EnumC1996l enumC1996l20 = new EnumC1996l("LTE_CA", 19);
        f4515l = new EnumC1996l[]{enumC1996l, enumC1996l2, enumC1996l3, enumC1996l4, enumC1996l5, enumC1996l6, enumC1996l7, enumC1996l8, enumC1996l9, enumC1996l10, enumC1996l11, enumC1996l12, enumC1996l13, enumC1996l14, enumC1996l15, enumC1996l16, enumC1996l17, enumC1996l18, enumC1996l19, enumC1996l20, new EnumC1996l("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f4516l = sparseArray;
        sparseArray.put(0, enumC1996l);
        sparseArray.put(1, enumC1996l2);
        sparseArray.put(2, enumC1996l3);
        sparseArray.put(3, enumC1996l4);
        sparseArray.put(4, enumC1996l5);
        sparseArray.put(5, enumC1996l6);
        sparseArray.put(6, enumC1996l7);
        sparseArray.put(7, enumC1996l8);
        sparseArray.put(8, enumC1996l9);
        sparseArray.put(9, enumC1996l10);
        sparseArray.put(10, enumC1996l11);
        sparseArray.put(11, enumC1996l12);
        sparseArray.put(12, enumC1996l13);
        sparseArray.put(13, enumC1996l14);
        sparseArray.put(14, enumC1996l15);
        sparseArray.put(15, enumC1996l16);
        sparseArray.put(16, enumC1996l17);
        sparseArray.put(17, enumC1996l18);
        sparseArray.put(18, enumC1996l19);
        sparseArray.put(19, enumC1996l20);
    }

    public static EnumC1996l valueOf(String str) {
        return (EnumC1996l) Enum.valueOf(EnumC1996l.class, str);
    }

    public static EnumC1996l[] values() {
        return (EnumC1996l[]) f4515l.clone();
    }
}
