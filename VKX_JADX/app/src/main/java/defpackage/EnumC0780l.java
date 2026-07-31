package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؒؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC0780l {
    public static final C7536l Companion;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC0780l f2359l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC0780l f2360l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f2361l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0780l[] f2362l;

    static {
        EnumC0780l enumC0780l = new EnumC0780l("Success", 0);
        f2360l = enumC0780l;
        EnumC0780l enumC0780l2 = new EnumC0780l("IoException", 1);
        f2359l = enumC0780l2;
        f2362l = new EnumC0780l[]{enumC0780l, enumC0780l2, new EnumC0780l("Unknown", 2)};
        Companion = new C7536l();
        f2361l = AbstractC9968l.crashlytics(2, new C11200l(5));
    }

    public static EnumC0780l valueOf(String str) {
        return (EnumC0780l) Enum.valueOf(EnumC0780l.class, str);
    }

    public static EnumC0780l[] values() {
        return (EnumC0780l[]) f2362l.clone();
    }
}
