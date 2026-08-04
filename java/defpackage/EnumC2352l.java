package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؔؓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC2352l {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2352l EF5;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2352l[] f5113l = {new EnumC2352l("APP", 0), new EnumC2352l("GAME", 1), new EnumC2352l("SITE", 2), new EnumC2352l("STANDALONE", 3), new EnumC2352l("VK_APP", 4), new EnumC2352l("COMMUNITY_APP", 5), new EnumC2352l("HTML5_GAME", 6), new EnumC2352l("MINI_APP", 7)};
    public static final C4688l Companion = new C4688l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f5114l = AbstractC9968l.crashlytics(2, new C7282l(19));

    public static EnumC2352l valueOf(String str) {
        return (EnumC2352l) Enum.valueOf(EnumC2352l.class, str);
    }

    public static EnumC2352l[] values() {
        return (EnumC2352l[]) f5113l.clone();
    }
}
