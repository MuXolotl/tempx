package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lَۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10718l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC10718l f21714l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC10718l f21715l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC10718l f21716l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10718l[] f21717l;

    static {
        EnumC10718l enumC10718l = new EnumC10718l("DarkPixel", 0);
        f21716l = enumC10718l;
        EnumC10718l enumC10718l2 = new EnumC10718l("LightPixel", 1);
        f21715l = enumC10718l2;
        EnumC10718l enumC10718l3 = new EnumC10718l("Background", 2);
        f21714l = enumC10718l3;
        f21717l = new EnumC10718l[]{enumC10718l, enumC10718l2, enumC10718l3, new EnumC10718l("Logo", 3)};
    }

    public static EnumC10718l valueOf(String str) {
        return (EnumC10718l) Enum.valueOf(EnumC10718l.class, str);
    }

    public static EnumC10718l[] values() {
        return (EnumC10718l[]) f21717l.clone();
    }
}
