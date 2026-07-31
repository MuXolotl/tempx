package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؓؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1618l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC1618l f3952l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC1618l f3953l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC1618l f3954l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1618l[] f3955l;

    static {
        EnumC1618l enumC1618l = new EnumC1618l("NIST_P256", 0);
        f3954l = enumC1618l;
        EnumC1618l enumC1618l2 = new EnumC1618l("NIST_P384", 1);
        f3953l = enumC1618l2;
        EnumC1618l enumC1618l3 = new EnumC1618l("NIST_P521", 2);
        f3952l = enumC1618l3;
        f3955l = new EnumC1618l[]{enumC1618l, enumC1618l2, enumC1618l3};
    }

    public static EnumC1618l valueOf(String str) {
        return (EnumC1618l) Enum.valueOf(EnumC1618l.class, str);
    }

    public static EnumC1618l[] values() {
        return (EnumC1618l[]) f3955l.clone();
    }
}
