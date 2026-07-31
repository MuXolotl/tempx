package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lَؚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10151l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10151l[] f20667l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC10151l f20668l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC10151l f20669l;

    static {
        EnumC10151l enumC10151l = new EnumC10151l("READ_ONLY", 0);
        f20669l = enumC10151l;
        EnumC10151l enumC10151l2 = new EnumC10151l("MUTABLE", 1);
        f20668l = enumC10151l2;
        f20667l = new EnumC10151l[]{enumC10151l, enumC10151l2};
    }

    public static EnumC10151l valueOf(String str) {
        return (EnumC10151l) Enum.valueOf(EnumC10151l.class, str);
    }

    public static EnumC10151l[] values() {
        return (EnumC10151l[]) f20667l.clone();
    }
}
