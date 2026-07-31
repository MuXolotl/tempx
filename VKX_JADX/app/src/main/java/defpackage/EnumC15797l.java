package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٕٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC15797l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15797l[] f31017l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC15797l f31018l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC15797l f31019l;

    static {
        EnumC15797l enumC15797l = new EnumC15797l("all", 0);
        f31019l = enumC15797l;
        EnumC15797l enumC15797l2 = new EnumC15797l("aural", 1);
        EnumC15797l enumC15797l3 = new EnumC15797l("braille", 2);
        EnumC15797l enumC15797l4 = new EnumC15797l("embossed", 3);
        EnumC15797l enumC15797l5 = new EnumC15797l("handheld", 4);
        EnumC15797l enumC15797l6 = new EnumC15797l("print", 5);
        EnumC15797l enumC15797l7 = new EnumC15797l("projection", 6);
        EnumC15797l enumC15797l8 = new EnumC15797l("screen", 7);
        f31018l = enumC15797l8;
        f31017l = new EnumC15797l[]{enumC15797l, enumC15797l2, enumC15797l3, enumC15797l4, enumC15797l5, enumC15797l6, enumC15797l7, enumC15797l8, new EnumC15797l("speech", 8), new EnumC15797l("tty", 9), new EnumC15797l("tv", 10)};
    }

    public static EnumC15797l valueOf(String str) {
        return (EnumC15797l) Enum.valueOf(EnumC15797l.class, str);
    }

    public static EnumC15797l[] values() {
        return (EnumC15797l[]) f31017l.clone();
    }
}
