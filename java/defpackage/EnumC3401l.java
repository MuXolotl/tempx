package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؕٔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3401l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3401l[] f7247l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC3401l f7248l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC3401l f7249l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3401l EF0;

    static {
        EnumC3401l enumC3401l = new EnumC3401l("PRETTY", 0);
        EnumC3401l enumC3401l2 = new EnumC3401l("DEBUG", 1);
        f7249l = enumC3401l2;
        EnumC3401l enumC3401l3 = new EnumC3401l("NONE", 2);
        f7248l = enumC3401l3;
        f7247l = new EnumC3401l[]{enumC3401l, enumC3401l2, enumC3401l3};
    }

    public static EnumC3401l valueOf(String str) {
        return (EnumC3401l) Enum.valueOf(EnumC3401l.class, str);
    }

    public static EnumC3401l[] values() {
        return (EnumC3401l[]) f7247l.clone();
    }
}
