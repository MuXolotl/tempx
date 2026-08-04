package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؖۚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4386l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4386l[] f8920l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC4386l f8921l;

    static {
        EnumC4386l enumC4386l = new EnumC4386l("Visible", 0);
        f8921l = enumC4386l;
        f8920l = new EnumC4386l[]{enumC4386l, new EnumC4386l("Invisible", 1), new EnumC4386l("Gone", 2)};
    }

    public static EnumC4386l valueOf(String str) {
        return (EnumC4386l) Enum.valueOf(EnumC4386l.class, str);
    }

    public static EnumC4386l[] values() {
        return (EnumC4386l[]) f8920l.clone();
    }
}
