package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؙۜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6767l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC6767l f14177l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6767l[] f14178l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC6767l f14179l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC6767l f14180l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC6767l f14181l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC6767l f14182l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC6767l f14183l;

    static {
        EnumC6767l enumC6767l = new EnumC6767l("ShutDown", 0);
        f14180l = enumC6767l;
        EnumC6767l enumC6767l2 = new EnumC6767l("ShuttingDown", 1);
        f14179l = enumC6767l2;
        EnumC6767l enumC6767l3 = new EnumC6767l("Inactive", 2);
        f14177l = enumC6767l3;
        EnumC6767l enumC6767l4 = new EnumC6767l("InactivePendingWork", 3);
        f14182l = enumC6767l4;
        EnumC6767l enumC6767l5 = new EnumC6767l("Idle", 4);
        f14181l = enumC6767l5;
        EnumC6767l enumC6767l6 = new EnumC6767l("PendingWork", 5);
        f14183l = enumC6767l6;
        f14178l = new EnumC6767l[]{enumC6767l, enumC6767l2, enumC6767l3, enumC6767l4, enumC6767l5, enumC6767l6};
    }

    public static EnumC6767l valueOf(String str) {
        return (EnumC6767l) Enum.valueOf(EnumC6767l.class, str);
    }

    public static EnumC6767l[] values() {
        return (EnumC6767l[]) f14178l.clone();
    }
}
