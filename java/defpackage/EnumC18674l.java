package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lّۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18674l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC18674l[] f36441l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC18674l f36442l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC18674l f36443l;

    static {
        EnumC18674l enumC18674l = new EnumC18674l("DEFERRED", 0);
        f36443l = enumC18674l;
        EnumC18674l enumC18674l2 = new EnumC18674l("IMMEDIATE", 1);
        f36442l = enumC18674l2;
        f36441l = new EnumC18674l[]{enumC18674l, enumC18674l2, new EnumC18674l("EXCLUSIVE", 2)};
    }

    public static EnumC18674l valueOf(String str) {
        return (EnumC18674l) Enum.valueOf(EnumC18674l.class, str);
    }

    public static EnumC18674l[] values() {
        return (EnumC18674l[]) f36441l.clone();
    }
}
