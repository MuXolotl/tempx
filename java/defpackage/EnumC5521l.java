package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5521l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC5521l f11788l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC5521l f11789l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC5521l f11790l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5521l[] f11791l;

    static {
        EnumC5521l enumC5521l = new EnumC5521l("UNCOMPRESSED", 0);
        f11790l = enumC5521l;
        EnumC5521l enumC5521l2 = new EnumC5521l("COMPRESSED", 1);
        f11789l = enumC5521l2;
        EnumC5521l enumC5521l3 = new EnumC5521l("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        f11788l = enumC5521l3;
        f11791l = new EnumC5521l[]{enumC5521l, enumC5521l2, enumC5521l3};
    }

    public static EnumC5521l valueOf(String str) {
        return (EnumC5521l) Enum.valueOf(EnumC5521l.class, str);
    }

    public static EnumC5521l[] values() {
        return (EnumC5521l[]) f11791l.clone();
    }
}
