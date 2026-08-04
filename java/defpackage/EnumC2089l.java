package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lۣؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2089l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC2089l f4678l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC2089l f4679l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC2089l f4680l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2089l[] f4681l;

    static {
        EnumC2089l enumC2089l = new EnumC2089l("NETWORK_UNMETERED", 0);
        f4680l = enumC2089l;
        EnumC2089l enumC2089l2 = new EnumC2089l("DEVICE_IDLE", 1);
        f4679l = enumC2089l2;
        EnumC2089l enumC2089l3 = new EnumC2089l("DEVICE_CHARGING", 2);
        f4678l = enumC2089l3;
        f4681l = new EnumC2089l[]{enumC2089l, enumC2089l2, enumC2089l3};
    }

    public static EnumC2089l valueOf(String str) {
        return (EnumC2089l) Enum.valueOf(EnumC2089l.class, str);
    }

    public static EnumC2089l[] values() {
        return (EnumC2089l[]) f4681l.clone();
    }
}
