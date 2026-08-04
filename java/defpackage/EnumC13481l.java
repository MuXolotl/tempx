package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lْٚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13481l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC13481l f26469l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC13481l[] f26470l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC13481l f26471l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC13481l f26472l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC13481l f26473l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC13481l f26474l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC13481l f26475l;

    static {
        EnumC13481l enumC13481l = new EnumC13481l("SHA512withDSA", 0);
        f26472l = enumC13481l;
        EnumC13481l enumC13481l2 = new EnumC13481l("SHA3_512withDSA", 1);
        f26471l = enumC13481l2;
        EnumC13481l enumC13481l3 = new EnumC13481l("SHA512withECDSA", 2);
        f26469l = enumC13481l3;
        EnumC13481l enumC13481l4 = new EnumC13481l("SHA3_512withECDSA", 3);
        f26474l = enumC13481l4;
        EnumC13481l enumC13481l5 = new EnumC13481l("SHA512withRSA", 4);
        f26473l = enumC13481l5;
        EnumC13481l enumC13481l6 = new EnumC13481l("SHA3_512withRSA", 5);
        f26475l = enumC13481l6;
        f26470l = new EnumC13481l[]{enumC13481l, enumC13481l2, enumC13481l3, enumC13481l4, enumC13481l5, enumC13481l6};
    }

    public static EnumC13481l valueOf(String str) {
        return (EnumC13481l) Enum.valueOf(EnumC13481l.class, str);
    }

    public static EnumC13481l[] values() {
        return (EnumC13481l[]) f26470l.clone();
    }
}
