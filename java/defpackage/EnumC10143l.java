package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lَؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10143l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10143l[] f20650l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC10143l f20651l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC10143l f20652l;

    static {
        EnumC10143l enumC10143l = new EnumC10143l("BIG_ENDIAN", 0);
        f20652l = enumC10143l;
        EnumC10143l enumC10143l2 = new EnumC10143l("LITTLE_ENDIAN", 1);
        f20651l = enumC10143l2;
        f20650l = new EnumC10143l[]{enumC10143l, enumC10143l2};
    }

    public static EnumC10143l valueOf(String str) {
        return (EnumC10143l) Enum.valueOf(EnumC10143l.class, str);
    }

    public static EnumC10143l[] values() {
        return (EnumC10143l[]) f20650l.clone();
    }
}
