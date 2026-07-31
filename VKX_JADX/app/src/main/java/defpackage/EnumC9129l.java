package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌَۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9129l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC9129l f18763l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9129l f18764l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9129l f18765l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9129l[] f18766l;

    static {
        EnumC9129l enumC9129l = new EnumC9129l("Hidden", 0);
        f18765l = enumC9129l;
        EnumC9129l enumC9129l2 = new EnumC9129l("Expanded", 1);
        f18764l = enumC9129l2;
        EnumC9129l enumC9129l3 = new EnumC9129l("PartiallyExpanded", 2);
        f18763l = enumC9129l3;
        f18766l = new EnumC9129l[]{enumC9129l, enumC9129l2, enumC9129l3};
    }

    public static EnumC9129l valueOf(String str) {
        return (EnumC9129l) Enum.valueOf(EnumC9129l.class, str);
    }

    public static EnumC9129l[] values() {
        return (EnumC9129l[]) f18766l.clone();
    }
}
