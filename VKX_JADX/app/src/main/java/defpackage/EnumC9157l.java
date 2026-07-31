package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌۤٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class EnumC9157l {
    public static final C0190l Companion;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC9157l f18805l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9157l[] f18806l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9157l f18807l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f18808l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC9157l f18809l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC9157l f18810l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC9157l f18811l;

    static {
        EnumC9157l enumC9157l = new EnumC9157l("Search", 0);
        f18807l = enumC9157l;
        EnumC9157l enumC9157l2 = new EnumC9157l("Main", 1);
        f18805l = enumC9157l2;
        EnumC9157l enumC9157l3 = new EnumC9157l("Library", 2);
        f18810l = enumC9157l3;
        EnumC9157l enumC9157l4 = new EnumC9157l("NowPlaying", 3);
        f18809l = enumC9157l4;
        EnumC9157l enumC9157l5 = new EnumC9157l("Settings", 4);
        f18811l = enumC9157l5;
        f18806l = new EnumC9157l[]{enumC9157l, enumC9157l2, enumC9157l3, enumC9157l4, enumC9157l5};
        Companion = new C0190l();
        f18808l = AbstractC9968l.crashlytics(2, new C1712l(18));
    }

    public static EnumC9157l valueOf(String str) {
        return (EnumC9157l) Enum.valueOf(EnumC9157l.class, str);
    }

    public static EnumC9157l[] values() {
        return (EnumC9157l[]) f18806l.clone();
    }
}
