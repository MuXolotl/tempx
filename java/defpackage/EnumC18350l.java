package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l٘ۦَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC18350l {
    public static final C3283l Companion;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC18350l[] f35863l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC18350l f35864l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f35865l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC18350l EF0;

    static {
        EnumC18350l enumC18350l = new EnumC18350l("Blue", 0);
        EnumC18350l enumC18350l2 = new EnumC18350l("BlueLight", 1);
        EnumC18350l enumC18350l3 = new EnumC18350l("BlueDark", 2);
        EnumC18350l enumC18350l4 = new EnumC18350l("Cyan", 3);
        EnumC18350l enumC18350l5 = new EnumC18350l("Violet", 4);
        EnumC18350l enumC18350l6 = new EnumC18350l("Pink", 5);
        f35864l = enumC18350l6;
        f35863l = new EnumC18350l[]{enumC18350l, enumC18350l2, enumC18350l3, enumC18350l4, enumC18350l5, enumC18350l6, new EnumC18350l("PinkDark", 6)};
        Companion = new C3283l();
        f35865l = AbstractC9968l.crashlytics(2, new C15687l(18));
    }

    public static EnumC18350l valueOf(String str) {
        return (EnumC18350l) Enum.valueOf(EnumC18350l.class, str);
    }

    public static EnumC18350l[] values() {
        return (EnumC18350l[]) f35863l.clone();
    }
}
