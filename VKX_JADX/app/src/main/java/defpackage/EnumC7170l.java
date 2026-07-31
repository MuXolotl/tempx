package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍَؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7170l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC7170l f15002l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC7170l f15003l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC7170l f15004l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7170l[] f15005l;

    static {
        EnumC7170l enumC7170l = new EnumC7170l("None", 0);
        f15004l = enumC7170l;
        EnumC7170l enumC7170l2 = new EnumC7170l("Selection", 1);
        f15003l = enumC7170l2;
        EnumC7170l enumC7170l3 = new EnumC7170l("Cursor", 2);
        f15002l = enumC7170l3;
        f15005l = new EnumC7170l[]{enumC7170l, enumC7170l2, enumC7170l3};
    }

    public static EnumC7170l valueOf(String str) {
        return (EnumC7170l) Enum.valueOf(EnumC7170l.class, str);
    }

    public static EnumC7170l[] values() {
        return (EnumC7170l[]) f15005l.clone();
    }
}
