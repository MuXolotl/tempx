package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؕۘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3578l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3578l[] f7507l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC3578l f7508l;

    static {
        EnumC3578l enumC3578l = new EnumC3578l("Small", 0);
        f7508l = enumC3578l;
        f7507l = new EnumC3578l[]{enumC3578l, new EnumC3578l("Medium", 1), new EnumC3578l("Large", 2)};
    }

    public static EnumC3578l valueOf(String str) {
        return (EnumC3578l) Enum.valueOf(EnumC3578l.class, str);
    }

    public static EnumC3578l[] values() {
        return (EnumC3578l[]) f7507l.clone();
    }
}
