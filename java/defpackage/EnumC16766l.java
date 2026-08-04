package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٖۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC16766l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16766l[] f32774l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC16766l f32775l;

    static {
        EnumC16766l enumC16766l = new EnumC16766l("DEFAULT", 0);
        f32775l = enumC16766l;
        f32774l = new EnumC16766l[]{enumC16766l, new EnumC16766l("SIGNED", 1), new EnumC16766l("FIXED", 2)};
    }

    public static EnumC16766l valueOf(String str) {
        return (EnumC16766l) Enum.valueOf(EnumC16766l.class, str);
    }

    public static EnumC16766l[] values() {
        return (EnumC16766l[]) f32774l.clone();
    }
}
