package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14098l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC14098l f27456l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC14098l f27457l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC14098l f27458l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14098l[] f27459l;

    static {
        EnumC14098l enumC14098l = new EnumC14098l("PAD_ONE_ZERO", 0);
        f27458l = enumC14098l;
        EnumC14098l enumC14098l2 = new EnumC14098l("PAD_TWO_ZERO", 1);
        f27457l = enumC14098l2;
        EnumC14098l enumC14098l3 = new EnumC14098l("PAD_THREE_ZERO", 2);
        f27456l = enumC14098l3;
        f27459l = new EnumC14098l[]{enumC14098l, enumC14098l2, enumC14098l3};
    }

    public static EnumC14098l valueOf(String str) {
        return (EnumC14098l) Enum.valueOf(EnumC14098l.class, str);
    }

    public static EnumC14098l[] values() {
        return (EnumC14098l[]) f27459l.clone();
    }
}
