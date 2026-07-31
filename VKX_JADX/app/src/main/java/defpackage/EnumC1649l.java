package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؓؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1649l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC1649l f3992l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC1649l f3993l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC1649l f3994l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1649l[] f3995l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC1649l f3996l;

    static {
        EnumC1649l enumC1649l = new EnumC1649l("AwaitingInput", 0);
        f3994l = enumC1649l;
        EnumC1649l enumC1649l2 = new EnumC1649l("Processing", 1);
        f3993l = enumC1649l2;
        EnumC1649l enumC1649l3 = new EnumC1649l("Success", 2);
        f3992l = enumC1649l3;
        EnumC1649l enumC1649l4 = new EnumC1649l("Error", 3);
        f3996l = enumC1649l4;
        f3995l = new EnumC1649l[]{enumC1649l, enumC1649l2, enumC1649l3, enumC1649l4};
    }

    public static EnumC1649l valueOf(String str) {
        return (EnumC1649l) Enum.valueOf(EnumC1649l.class, str);
    }

    public static EnumC1649l[] values() {
        return (EnumC1649l[]) f3995l.clone();
    }
}
