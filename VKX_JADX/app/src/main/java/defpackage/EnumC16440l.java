package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC16440l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC16440l f32143l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC16440l f32144l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC16440l f32145l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16440l[] f32146l;

    static {
        EnumC16440l enumC16440l = new EnumC16440l("StartToEnd", 0);
        f32145l = enumC16440l;
        EnumC16440l enumC16440l2 = new EnumC16440l("EndToStart", 1);
        f32144l = enumC16440l2;
        EnumC16440l enumC16440l3 = new EnumC16440l("Settled", 2);
        f32143l = enumC16440l3;
        f32146l = new EnumC16440l[]{enumC16440l, enumC16440l2, enumC16440l3};
    }

    public static EnumC16440l valueOf(String str) {
        return (EnumC16440l) Enum.valueOf(EnumC16440l.class, str);
    }

    public static EnumC16440l[] values() {
        return (EnumC16440l[]) f32146l.clone();
    }
}
