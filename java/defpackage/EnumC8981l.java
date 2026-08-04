package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌۖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8981l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC8981l f18520l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC8981l f18521l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC8981l f18522l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC8981l f18523l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC8981l f18524l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8981l[] f18525l;

    static {
        EnumC8981l enumC8981l = new EnumC8981l("DESTROYED", 0);
        f18522l = enumC8981l;
        EnumC8981l enumC8981l2 = new EnumC8981l("INITIALIZED", 1);
        f18521l = enumC8981l2;
        EnumC8981l enumC8981l3 = new EnumC8981l("CREATED", 2);
        f18520l = enumC8981l3;
        EnumC8981l enumC8981l4 = new EnumC8981l("STARTED", 3);
        f18524l = enumC8981l4;
        EnumC8981l enumC8981l5 = new EnumC8981l("RESUMED", 4);
        f18523l = enumC8981l5;
        f18525l = new EnumC8981l[]{enumC8981l, enumC8981l2, enumC8981l3, enumC8981l4, enumC8981l5};
    }

    public static EnumC8981l valueOf(String str) {
        return (EnumC8981l) Enum.valueOf(EnumC8981l.class, str);
    }

    public static EnumC8981l[] values() {
        return (EnumC8981l[]) f18525l.clone();
    }

    public final boolean yandex(EnumC8981l enumC8981l) {
        return compareTo(enumC8981l) >= 0;
    }
}
