package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٓٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14251l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC14251l f27851l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC14251l f27852l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC14251l f27853l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14251l[] f27854l;

    static {
        EnumC14251l enumC14251l = new EnumC14251l("DEFAULT", 0);
        f27853l = enumC14251l;
        EnumC14251l enumC14251l2 = new EnumC14251l("VERY_LOW", 1);
        f27852l = enumC14251l2;
        EnumC14251l enumC14251l3 = new EnumC14251l("HIGHEST", 2);
        f27851l = enumC14251l3;
        f27854l = new EnumC14251l[]{enumC14251l, enumC14251l2, enumC14251l3};
    }

    public static EnumC14251l valueOf(String str) {
        return (EnumC14251l) Enum.valueOf(EnumC14251l.class, str);
    }

    public static EnumC14251l[] values() {
        return (EnumC14251l[]) f27854l.clone();
    }
}
