package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lۣؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC5244l f11320l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC5244l f11321l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC5244l f11322l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5244l[] f11323l;

    static {
        EnumC5244l enumC5244l = new EnumC5244l("IGNORE", 0);
        f11322l = enumC5244l;
        EnumC5244l enumC5244l2 = new EnumC5244l("WARN", 1);
        f11321l = enumC5244l2;
        EnumC5244l enumC5244l3 = new EnumC5244l("STRICT", 2);
        f11320l = enumC5244l3;
        f11323l = new EnumC5244l[]{enumC5244l, enumC5244l2, enumC5244l3};
    }

    public static EnumC5244l valueOf(String str) {
        return (EnumC5244l) Enum.valueOf(EnumC5244l.class, str);
    }

    public static EnumC5244l[] values() {
        return (EnumC5244l[]) f11323l.clone();
    }

    public final boolean yandex() {
        return this == f11321l;
    }
}
