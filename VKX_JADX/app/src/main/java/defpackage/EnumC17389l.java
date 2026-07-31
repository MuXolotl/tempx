package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lًٗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17389l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC17389l[] f33855l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC17389l f33856l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC17389l f33857l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17389l EF0;

    static {
        EnumC17389l enumC17389l = new EnumC17389l("DESTROYED", 0);
        EnumC17389l enumC17389l2 = new EnumC17389l("CREATED", 1);
        f33857l = enumC17389l2;
        EnumC17389l enumC17389l3 = new EnumC17389l("STARTED", 2);
        EnumC17389l enumC17389l4 = new EnumC17389l("RESUMED", 3);
        f33856l = enumC17389l4;
        f33855l = new EnumC17389l[]{enumC17389l, enumC17389l2, enumC17389l3, enumC17389l4};
    }

    public static EnumC17389l valueOf(String str) {
        return (EnumC17389l) Enum.valueOf(EnumC17389l.class, str);
    }

    public static EnumC17389l[] values() {
        return (EnumC17389l[]) f33855l.clone();
    }
}
