package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lَّٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10249l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC10249l f20871l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC10249l f20872l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC10249l f20873l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10249l[] f20874l;

    static {
        EnumC10249l enumC10249l = new EnumC10249l("FORCE_FLEXIBILITY", 0);
        f20873l = enumC10249l;
        EnumC10249l enumC10249l2 = new EnumC10249l("NULLABLE", 1);
        f20872l = enumC10249l2;
        EnumC10249l enumC10249l3 = new EnumC10249l("NOT_NULL", 2);
        f20871l = enumC10249l3;
        f20874l = new EnumC10249l[]{enumC10249l, enumC10249l2, enumC10249l3};
    }

    public static EnumC10249l valueOf(String str) {
        return (EnumC10249l) Enum.valueOf(EnumC10249l.class, str);
    }

    public static EnumC10249l[] values() {
        return (EnumC10249l[]) f20874l.clone();
    }
}
