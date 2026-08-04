package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؓٛۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1957l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1957l[] f4456l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC1957l f4457l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC1957l f4458l;

    static {
        EnumC1957l enumC1957l = new EnumC1957l("RENDER_OVERRIDE", 0);
        f4458l = enumC1957l;
        EnumC1957l enumC1957l2 = new EnumC1957l("RENDER_OPEN", 1);
        f4457l = enumC1957l2;
        f4456l = new EnumC1957l[]{enumC1957l, enumC1957l2, new EnumC1957l("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static EnumC1957l valueOf(String str) {
        return (EnumC1957l) Enum.valueOf(EnumC1957l.class, str);
    }

    public static EnumC1957l[] values() {
        return (EnumC1957l[]) f4456l.clone();
    }
}
