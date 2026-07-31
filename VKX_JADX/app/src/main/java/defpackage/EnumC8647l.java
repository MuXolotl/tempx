package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lًٌٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8647l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC8647l f17804l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC8647l f17805l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC8647l f17806l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8647l[] f17807l;

    static {
        EnumC8647l enumC8647l = new EnumC8647l("ContinueTraversal", 0);
        f17806l = enumC8647l;
        EnumC8647l enumC8647l2 = new EnumC8647l("SkipSubtreeAndContinueTraversal", 1);
        f17805l = enumC8647l2;
        EnumC8647l enumC8647l3 = new EnumC8647l("CancelTraversal", 2);
        f17804l = enumC8647l3;
        f17807l = new EnumC8647l[]{enumC8647l, enumC8647l2, enumC8647l3};
    }

    public static EnumC8647l valueOf(String str) {
        return (EnumC8647l) Enum.valueOf(EnumC8647l.class, str);
    }

    public static EnumC8647l[] values() {
        return (EnumC8647l[]) f17807l.clone();
    }
}
