package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘؘُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC10870l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f21977l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10870l[] f21978l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10870l EF5;

    static {
        EnumC10870l[] enumC10870lArr = {new EnumC10870l("PLAY", 0), new EnumC10870l("PAUSE", 1), new EnumC10870l("PREVIOUS", 2), new EnumC10870l("NEXT", 3), new EnumC10870l("TOGGLE_REPEAT", 4), new EnumC10870l("TOGGLE_SHUFFLE", 5)};
        f21978l = enumC10870lArr;
        f21977l = new C14092l(enumC10870lArr);
    }

    public static EnumC10870l valueOf(String str) {
        return (EnumC10870l) Enum.valueOf(EnumC10870l.class, str);
    }

    public static EnumC10870l[] values() {
        return (EnumC10870l[]) f21978l.clone();
    }
}
