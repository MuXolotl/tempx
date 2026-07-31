package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lًٜۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8132l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8132l[] f16934l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC8132l f16935l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC8132l f16936l;

    static {
        EnumC8132l enumC8132l = new EnumC8132l("OPEN", 0);
        f16936l = enumC8132l;
        EnumC8132l enumC8132l2 = new EnumC8132l("CLOSED", 1);
        f16935l = enumC8132l2;
        f16934l = new EnumC8132l[]{enumC8132l, enumC8132l2};
    }

    public static EnumC8132l valueOf(String str) {
        return (EnumC8132l) Enum.valueOf(EnumC8132l.class, str);
    }

    public static EnumC8132l[] values() {
        return (EnumC8132l[]) f16934l.clone();
    }
}
