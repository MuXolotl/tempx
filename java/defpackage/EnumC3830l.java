package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؖؐۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3830l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC3830l f7941l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC3830l f7942l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC3830l f7943l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3830l[] f7944l;

    static {
        EnumC3830l enumC3830l = new EnumC3830l("Locked", 0);
        f7943l = enumC3830l;
        EnumC3830l enumC3830l2 = new EnumC3830l("Enabled", 1);
        f7942l = enumC3830l2;
        EnumC3830l enumC3830l3 = new EnumC3830l("Loading", 2);
        f7941l = enumC3830l3;
        f7944l = new EnumC3830l[]{enumC3830l, enumC3830l2, enumC3830l3};
    }

    public static EnumC3830l valueOf(String str) {
        return (EnumC3830l) Enum.valueOf(EnumC3830l.class, str);
    }

    public static EnumC3830l[] values() {
        return (EnumC3830l[]) f7944l.clone();
    }
}
