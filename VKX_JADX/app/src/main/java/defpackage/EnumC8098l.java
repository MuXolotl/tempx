package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lًٚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8098l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC8098l f16875l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC8098l f16876l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC8098l f16877l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8098l[] f16878l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC8098l f16879l;

    static {
        EnumC8098l enumC8098l = new EnumC8098l("MANUAL_PREVIOUS", 0);
        f16877l = enumC8098l;
        EnumC8098l enumC8098l2 = new EnumC8098l("MANUAL_NEXT", 1);
        f16876l = enumC8098l2;
        EnumC8098l enumC8098l3 = new EnumC8098l("COMPLETED", 2);
        f16875l = enumC8098l3;
        EnumC8098l enumC8098l4 = new EnumC8098l("SOURCE_CHANGED", 3);
        f16879l = enumC8098l4;
        f16878l = new EnumC8098l[]{enumC8098l, enumC8098l2, enumC8098l3, enumC8098l4};
    }

    public static EnumC8098l valueOf(String str) {
        return (EnumC8098l) Enum.valueOf(EnumC8098l.class, str);
    }

    public static EnumC8098l[] values() {
        return (EnumC8098l[]) f16878l.clone();
    }
}
