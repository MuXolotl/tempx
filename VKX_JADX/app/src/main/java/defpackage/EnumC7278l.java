package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؚٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7278l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC7278l f15119l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC7278l f15120l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC7278l f15121l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7278l[] f15122l;

    static {
        EnumC7278l enumC7278l = new EnumC7278l("Focused", 0);
        f15121l = enumC7278l;
        EnumC7278l enumC7278l2 = new EnumC7278l("UnfocusedEmpty", 1);
        f15120l = enumC7278l2;
        EnumC7278l enumC7278l3 = new EnumC7278l("UnfocusedNotEmpty", 2);
        f15119l = enumC7278l3;
        f15122l = new EnumC7278l[]{enumC7278l, enumC7278l2, enumC7278l3};
    }

    public static EnumC7278l valueOf(String str) {
        return (EnumC7278l) Enum.valueOf(EnumC7278l.class, str);
    }

    public static EnumC7278l[] values() {
        return (EnumC7278l[]) f15122l.clone();
    }
}
