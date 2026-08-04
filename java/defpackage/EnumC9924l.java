package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍۤۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9924l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC9924l f20195l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9924l f20196l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9924l f20197l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final HashMap f20198l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC9924l f20199l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9924l[] f20200l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9924l EF0;

    static {
        EnumC9924l enumC9924l = new EnumC9924l("target", 0);
        EnumC9924l enumC9924l2 = new EnumC9924l("root", 1);
        EnumC9924l enumC9924l3 = new EnumC9924l("nth_child", 2);
        f20197l = enumC9924l3;
        EnumC9924l enumC9924l4 = new EnumC9924l("nth_last_child", 3);
        EnumC9924l enumC9924l5 = new EnumC9924l("nth_of_type", 4);
        f20196l = enumC9924l5;
        EnumC9924l enumC9924l6 = new EnumC9924l("nth_last_of_type", 5);
        f20195l = enumC9924l6;
        EnumC9924l enumC9924l7 = new EnumC9924l("first_child", 6);
        EnumC9924l enumC9924l8 = new EnumC9924l("last_child", 7);
        EnumC9924l enumC9924l9 = new EnumC9924l("first_of_type", 8);
        EnumC9924l enumC9924l10 = new EnumC9924l("last_of_type", 9);
        EnumC9924l enumC9924l11 = new EnumC9924l("only_child", 10);
        EnumC9924l enumC9924l12 = new EnumC9924l("only_of_type", 11);
        EnumC9924l enumC9924l13 = new EnumC9924l("empty", 12);
        EnumC9924l enumC9924l14 = new EnumC9924l("not", 13);
        EnumC9924l enumC9924l15 = new EnumC9924l("lang", 14);
        EnumC9924l enumC9924l16 = new EnumC9924l("link", 15);
        EnumC9924l enumC9924l17 = new EnumC9924l("visited", 16);
        EnumC9924l enumC9924l18 = new EnumC9924l("hover", 17);
        EnumC9924l enumC9924l19 = new EnumC9924l("active", 18);
        EnumC9924l enumC9924l20 = new EnumC9924l("focus", 19);
        EnumC9924l enumC9924l21 = new EnumC9924l("enabled", 20);
        EnumC9924l enumC9924l22 = new EnumC9924l("disabled", 21);
        EnumC9924l enumC9924l23 = new EnumC9924l("checked", 22);
        EnumC9924l enumC9924l24 = new EnumC9924l("indeterminate", 23);
        EnumC9924l enumC9924l25 = new EnumC9924l("UNSUPPORTED", 24);
        f20199l = enumC9924l25;
        f20200l = new EnumC9924l[]{enumC9924l, enumC9924l2, enumC9924l3, enumC9924l4, enumC9924l5, enumC9924l6, enumC9924l7, enumC9924l8, enumC9924l9, enumC9924l10, enumC9924l11, enumC9924l12, enumC9924l13, enumC9924l14, enumC9924l15, enumC9924l16, enumC9924l17, enumC9924l18, enumC9924l19, enumC9924l20, enumC9924l21, enumC9924l22, enumC9924l23, enumC9924l24, enumC9924l25};
        f20198l = new HashMap();
        for (EnumC9924l enumC9924l26 : values()) {
            if (enumC9924l26 != f20199l) {
                f20198l.put(enumC9924l26.name().replace('_', '-'), enumC9924l26);
            }
        }
    }

    public static EnumC9924l valueOf(String str) {
        return (EnumC9924l) Enum.valueOf(EnumC9924l.class, str);
    }

    public static EnumC9924l[] values() {
        return (EnumC9924l[]) f20200l.clone();
    }
}
