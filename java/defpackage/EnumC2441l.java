package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2441l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2441l[] f5218l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC2441l f5219l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC2441l f5220l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2441l EF0;

    static {
        EnumC2441l enumC2441l = new EnumC2441l("AGREEMENT", 0);
        EnumC2441l enumC2441l2 = new EnumC2441l("ENCRYPTION", 1);
        EnumC2441l enumC2441l3 = new EnumC2441l("DECRYPTION", 2);
        EnumC2441l enumC2441l4 = new EnumC2441l("KEYGEN", 3);
        EnumC2441l enumC2441l5 = new EnumC2441l("SIGNING", 4);
        EnumC2441l enumC2441l6 = new EnumC2441l("VERIFYING", 5);
        EnumC2441l enumC2441l7 = new EnumC2441l("AUTHENTICATION", 6);
        EnumC2441l enumC2441l8 = new EnumC2441l("VERIFICATION", 7);
        EnumC2441l enumC2441l9 = new EnumC2441l("PRF", 8);
        f5220l = enumC2441l9;
        EnumC2441l enumC2441l10 = new EnumC2441l("ANY", 9);
        f5219l = enumC2441l10;
        f5218l = new EnumC2441l[]{enumC2441l, enumC2441l2, enumC2441l3, enumC2441l4, enumC2441l5, enumC2441l6, enumC2441l7, enumC2441l8, enumC2441l9, enumC2441l10};
    }

    public static EnumC2441l valueOf(String str) {
        return (EnumC2441l) Enum.valueOf(EnumC2441l.class, str);
    }

    public static EnumC2441l[] values() {
        return (EnumC2441l[]) f5218l.clone();
    }
}
