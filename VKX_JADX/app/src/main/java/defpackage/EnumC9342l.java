package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9342l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC9342l f19163l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9342l f19164l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9342l f19165l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9342l[] f19166l;

    static {
        EnumC9342l enumC9342l = new EnumC9342l("COROUTINE_SUSPENDED", 0);
        f19165l = enumC9342l;
        EnumC9342l enumC9342l2 = new EnumC9342l("UNDECIDED", 1);
        f19164l = enumC9342l2;
        EnumC9342l enumC9342l3 = new EnumC9342l("RESUMED", 2);
        f19163l = enumC9342l3;
        f19166l = new EnumC9342l[]{enumC9342l, enumC9342l2, enumC9342l3};
    }

    public static EnumC9342l valueOf(String str) {
        return (EnumC9342l) Enum.valueOf(EnumC9342l.class, str);
    }

    public static EnumC9342l[] values() {
        return (EnumC9342l[]) f19166l.clone();
    }
}
