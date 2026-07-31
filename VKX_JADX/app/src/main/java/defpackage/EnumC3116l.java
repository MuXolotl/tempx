package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؕؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3116l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3116l[] f6657l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC3116l f6658l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC3116l f6659l;

    static {
        EnumC3116l enumC3116l = new EnumC3116l("RAW", 0);
        f6659l = enumC3116l;
        EnumC3116l enumC3116l2 = new EnumC3116l("DQUOTES", 1);
        EnumC3116l enumC3116l3 = new EnumC3116l("URI_ENCODING", 2);
        f6658l = enumC3116l3;
        f6657l = new EnumC3116l[]{enumC3116l, enumC3116l2, enumC3116l3, new EnumC3116l("BASE64_ENCODING", 3)};
    }

    public static EnumC3116l valueOf(String str) {
        return (EnumC3116l) Enum.valueOf(EnumC3116l.class, str);
    }

    public static EnumC3116l[] values() {
        return (EnumC3116l[]) f6657l.clone();
    }
}
