package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lُؚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7195l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7195l[] f15025l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC7195l f15026l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC7195l f15027l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f15028l;

    static {
        EnumC7195l enumC7195l = new EnumC7195l("Library", 0);
        f15027l = enumC7195l;
        EnumC7195l enumC7195l2 = new EnumC7195l("ManualTracks", 1);
        f15026l = enumC7195l2;
        EnumC7195l[] enumC7195lArr = {enumC7195l, enumC7195l2, new EnumC7195l("AllTracks", 2)};
        f15025l = enumC7195lArr;
        f15028l = new C14092l(enumC7195lArr);
    }

    public static EnumC7195l valueOf(String str) {
        return (EnumC7195l) Enum.valueOf(EnumC7195l.class, str);
    }

    public static EnumC7195l[] values() {
        return (EnumC7195l[]) f15025l.clone();
    }
}
