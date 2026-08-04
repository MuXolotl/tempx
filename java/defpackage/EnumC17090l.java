package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lّٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class EnumC17090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC17090l f33255l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC17090l f33256l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C18685l f33257l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC17090l f33258l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ EnumC17090l[] f33259l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f33260l;

    static {
        EnumC17090l enumC17090l = new EnumC17090l(0, null, "NULL");
        f33256l = enumC17090l;
        EnumC17090l enumC17090l2 = new EnumC17090l(1, -1, "INDEX");
        f33255l = enumC17090l2;
        EnumC17090l enumC17090l3 = new EnumC17090l(2, Boolean.FALSE, "FALSE");
        f33258l = enumC17090l3;
        C18685l c18685l = new C18685l(3, null, "MAP_GET_OR_DEFAULT");
        f33257l = c18685l;
        f33259l = new EnumC17090l[]{enumC17090l, enumC17090l2, enumC17090l3, c18685l};
    }

    public EnumC17090l(int i, Object obj, String str) {
        super(str, i);
        this.f33260l = obj;
    }

    public static EnumC17090l valueOf(String str) {
        return (EnumC17090l) Enum.valueOf(EnumC17090l.class, str);
    }

    public static EnumC17090l[] values() {
        return (EnumC17090l[]) f33259l.clone();
    }
}
