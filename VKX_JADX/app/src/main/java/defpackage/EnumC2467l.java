package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؚؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2467l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2467l[] f5251l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC2467l f5252l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC2467l f5253l;

    static {
        EnumC2467l enumC2467l = new EnumC2467l("ACTIVE", 0);
        f5253l = enumC2467l;
        EnumC2467l enumC2467l2 = new EnumC2467l("INACTIVE", 1);
        f5252l = enumC2467l2;
        f5251l = new EnumC2467l[]{enumC2467l, enumC2467l2};
    }

    public static EnumC2467l valueOf(String str) {
        return (EnumC2467l) Enum.valueOf(EnumC2467l.class, str);
    }

    public static EnumC2467l[] values() {
        return (EnumC2467l[]) f5251l.clone();
    }
}
