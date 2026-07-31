package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lْٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14872l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f29104l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14872l[] f29105l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14872l EF5;

    static {
        EnumC14872l[] enumC14872lArr = {new EnumC14872l("MONDAY", 0), new EnumC14872l("TUESDAY", 1), new EnumC14872l("WEDNESDAY", 2), new EnumC14872l("THURSDAY", 3), new EnumC14872l("FRIDAY", 4), new EnumC14872l("SATURDAY", 5), new EnumC14872l("SUNDAY", 6)};
        f29105l = enumC14872lArr;
        f29104l = new C14092l(enumC14872lArr);
    }

    public static EnumC14872l valueOf(String str) {
        return (EnumC14872l) Enum.valueOf(EnumC14872l.class, str);
    }

    public static EnumC14872l[] values() {
        return (EnumC14872l[]) f29105l.clone();
    }
}
