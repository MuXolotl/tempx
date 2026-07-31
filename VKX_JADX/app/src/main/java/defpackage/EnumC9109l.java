package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌ۠ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9109l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC9109l f18706l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9109l f18707l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9109l f18708l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9109l[] f18709l;

    static {
        EnumC9109l enumC9109l = new EnumC9109l("VK_COM_WORKS", 0);
        f18708l = enumC9109l;
        EnumC9109l enumC9109l2 = new EnumC9109l("VK_RU_WORKS", 1);
        f18707l = enumC9109l2;
        EnumC9109l enumC9109l3 = new EnumC9109l("NOTHING_WORKS", 2);
        f18706l = enumC9109l3;
        f18709l = new EnumC9109l[]{enumC9109l, enumC9109l2, enumC9109l3};
    }

    public static EnumC9109l valueOf(String str) {
        return (EnumC9109l) Enum.valueOf(EnumC9109l.class, str);
    }

    public static EnumC9109l[] values() {
        return (EnumC9109l[]) f18709l.clone();
    }
}
