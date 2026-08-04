package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5714l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC5714l f12094l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC5714l f12095l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC5714l f12096l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5714l[] f12097l;

    static {
        EnumC5714l enumC5714l = new EnumC5714l("ALL", 0);
        f12096l = enumC5714l;
        EnumC5714l enumC5714l2 = new EnumC5714l("ONLY_NON_SYNTHESIZED", 1);
        f12095l = enumC5714l2;
        EnumC5714l enumC5714l3 = new EnumC5714l("NONE", 2);
        f12094l = enumC5714l3;
        f12097l = new EnumC5714l[]{enumC5714l, enumC5714l2, enumC5714l3};
    }

    public static EnumC5714l valueOf(String str) {
        return (EnumC5714l) Enum.valueOf(EnumC5714l.class, str);
    }

    public static EnumC5714l[] values() {
        return (EnumC5714l[]) f12097l.clone();
    }
}
