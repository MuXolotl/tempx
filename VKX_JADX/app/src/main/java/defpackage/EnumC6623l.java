package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌؙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6623l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f13862l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6623l[] f13863l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6623l EF5;

    static {
        EnumC6623l[] enumC6623lArr = {new EnumC6623l("MONDAY", 0), new EnumC6623l("TUESDAY", 1), new EnumC6623l("WEDNESDAY", 2), new EnumC6623l("THURSDAY", 3), new EnumC6623l("FRIDAY", 4), new EnumC6623l("SATURDAY", 5), new EnumC6623l("SUNDAY", 6)};
        f13863l = enumC6623lArr;
        f13862l = new C14092l(enumC6623lArr);
    }

    public static EnumC6623l valueOf(String str) {
        return (EnumC6623l) Enum.valueOf(EnumC6623l.class, str);
    }

    public static EnumC6623l[] values() {
        return (EnumC6623l[]) f13863l.clone();
    }
}
