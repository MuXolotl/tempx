package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌ۠ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9110l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9110l[] f18710l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9110l f18711l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9110l f18712l;

    static {
        EnumC9110l enumC9110l = new EnumC9110l("CRASHLYTICS", 0);
        f18712l = enumC9110l;
        EnumC9110l enumC9110l2 = new EnumC9110l("PERFORMANCE", 1);
        f18711l = enumC9110l2;
        f18710l = new EnumC9110l[]{enumC9110l, enumC9110l2, new EnumC9110l("MATT_SAYS_HI", 2)};
    }

    public static EnumC9110l valueOf(String str) {
        return (EnumC9110l) Enum.valueOf(EnumC9110l.class, str);
    }

    public static EnumC9110l[] values() {
        return (EnumC9110l[]) f18710l.clone();
    }
}
