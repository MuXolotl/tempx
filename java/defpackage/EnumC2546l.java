package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lُۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC2546l {
    public static final C17758l Companion;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC2546l f5544l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final EnumC2546l f5545l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2546l[] f5546l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC2546l f5547l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f5548l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC2546l f5549l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC2546l f5550l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC2546l f5551l;

    static {
        EnumC2546l enumC2546l = new EnumC2546l("BaseScreen", 0);
        f5547l = enumC2546l;
        EnumC2546l enumC2546l2 = new EnumC2546l("WelcomeScreen", 1);
        f5544l = enumC2546l2;
        EnumC2546l enumC2546l3 = new EnumC2546l("NumberScreen", 2);
        f5550l = enumC2546l3;
        EnumC2546l enumC2546l4 = new EnumC2546l("TopScreen", 3);
        EnumC2546l enumC2546l5 = new EnumC2546l("SummaryScreen", 4);
        f5549l = enumC2546l5;
        EnumC2546l enumC2546l6 = new EnumC2546l("BaseExtScreen", 5);
        f5551l = enumC2546l6;
        EnumC2546l enumC2546l7 = new EnumC2546l("AchievementScreen", 6);
        f5545l = enumC2546l7;
        f5546l = new EnumC2546l[]{enumC2546l, enumC2546l2, enumC2546l3, enumC2546l4, enumC2546l5, enumC2546l6, enumC2546l7, new EnumC2546l("BaseExtScreenPlaylist", 7), new EnumC2546l("PlaceholderScreen", 8), new EnumC2546l("VideoScreen", 9), new EnumC2546l("TopArtistScreen", 10)};
        Companion = new C17758l();
        f5548l = AbstractC9968l.crashlytics(2, new C15687l(19));
    }

    public static EnumC2546l valueOf(String str) {
        return (EnumC2546l) Enum.valueOf(EnumC2546l.class, str);
    }

    public static EnumC2546l[] values() {
        return (EnumC2546l[]) f5546l.clone();
    }
}
