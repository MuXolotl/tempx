package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٔۘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC15109l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC15109l f29639l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC15109l f29640l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC15109l f29641l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15109l[] f29642l;

    static {
        EnumC15109l enumC15109l = new EnumC15109l("UNKNOWN", 0);
        f29641l = enumC15109l;
        EnumC15109l enumC15109l2 = new EnumC15109l("DEFAULT", 1);
        f29640l = enumC15109l2;
        EnumC15109l enumC15109l3 = new EnumC15109l("YUV", 2);
        f29639l = enumC15109l3;
        f29642l = new EnumC15109l[]{enumC15109l, enumC15109l2, enumC15109l3};
    }

    public static EnumC15109l valueOf(String str) {
        return (EnumC15109l) Enum.valueOf(EnumC15109l.class, str);
    }

    public static EnumC15109l[] values() {
        return (EnumC15109l[]) f29642l.clone();
    }
}
