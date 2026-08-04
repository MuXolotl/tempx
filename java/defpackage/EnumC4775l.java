package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4775l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f9801l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4775l[] f9802l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC4775l f9803l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4775l EF0;

    static {
        EnumC4775l enumC4775l = new EnumC4775l("DYNAMIC_RANGE", 0);
        EnumC4775l enumC4775l2 = new EnumC4775l("FPS_RANGE", 1);
        f9803l = enumC4775l2;
        EnumC4775l[] enumC4775lArr = {enumC4775l, enumC4775l2, new EnumC4775l("VIDEO_STABILIZATION", 2), new EnumC4775l("IMAGE_FORMAT", 3), new EnumC4775l("RECORDING_QUALITY", 4)};
        f9802l = enumC4775lArr;
        f9801l = new C14092l(enumC4775lArr);
    }

    public static EnumC4775l valueOf(String str) {
        return (EnumC4775l) Enum.valueOf(EnumC4775l.class, str);
    }

    public static EnumC4775l[] values() {
        return (EnumC4775l[]) f9802l.clone();
    }
}
