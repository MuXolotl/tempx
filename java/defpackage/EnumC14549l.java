package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14549l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14549l[] f28490l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC14549l f28491l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC14549l f28492l;

    static {
        EnumC14549l enumC14549l = new EnumC14549l("GENERAL", 0);
        f28492l = enumC14549l;
        EnumC14549l enumC14549l2 = new EnumC14549l("FALLBACK", 1);
        f28491l = enumC14549l2;
        f28490l = new EnumC14549l[]{enumC14549l, enumC14549l2};
    }

    public static EnumC14549l valueOf(String str) {
        return (EnumC14549l) Enum.valueOf(EnumC14549l.class, str);
    }

    public static EnumC14549l[] values() {
        return (EnumC14549l[]) f28490l.clone();
    }
}
