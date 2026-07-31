package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌۥۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9176l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC9176l f18875l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9176l[] f18876l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9176l f18877l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9176l f18878l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC9176l f18879l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC9176l f18880l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC9176l f18881l;

    static {
        EnumC9176l enumC9176l = new EnumC9176l("ENQUEUED", 0);
        f18878l = enumC9176l;
        EnumC9176l enumC9176l2 = new EnumC9176l("RUNNING", 1);
        f18877l = enumC9176l2;
        EnumC9176l enumC9176l3 = new EnumC9176l("SUCCEEDED", 2);
        f18875l = enumC9176l3;
        EnumC9176l enumC9176l4 = new EnumC9176l("FAILED", 3);
        f18880l = enumC9176l4;
        EnumC9176l enumC9176l5 = new EnumC9176l("BLOCKED", 4);
        f18879l = enumC9176l5;
        EnumC9176l enumC9176l6 = new EnumC9176l("CANCELLED", 5);
        f18881l = enumC9176l6;
        f18876l = new EnumC9176l[]{enumC9176l, enumC9176l2, enumC9176l3, enumC9176l4, enumC9176l5, enumC9176l6};
    }

    public static EnumC9176l valueOf(String str) {
        return (EnumC9176l) Enum.valueOf(EnumC9176l.class, str);
    }

    public static EnumC9176l[] values() {
        return (EnumC9176l[]) f18876l.clone();
    }

    public final boolean yandex() {
        return this == f18875l || this == f18880l || this == f18881l;
    }
}
