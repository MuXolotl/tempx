package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5710l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC5710l f12088l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC5710l f12089l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC5710l f12090l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5710l[] f12091l;

    static {
        EnumC5710l enumC5710l = new EnumC5710l("NotEnough", 0);
        f12090l = enumC5710l;
        EnumC5710l enumC5710l2 = new EnumC5710l("Enough", 1);
        f12089l = enumC5710l2;
        EnumC5710l enumC5710l3 = new EnumC5710l("Finishing", 2);
        f12088l = enumC5710l3;
        f12091l = new EnumC5710l[]{enumC5710l, enumC5710l2, enumC5710l3};
    }

    public static EnumC5710l valueOf(String str) {
        return (EnumC5710l) Enum.valueOf(EnumC5710l.class, str);
    }

    public static EnumC5710l[] values() {
        return (EnumC5710l[]) f12091l.clone();
    }
}
