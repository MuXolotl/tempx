package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lِؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11822l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC11822l f23649l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC11822l f23650l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC11822l f23651l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11822l[] f23652l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC11822l f23653l;

    static {
        EnumC11822l enumC11822l = new EnumC11822l("Active", 0);
        f23651l = enumC11822l;
        EnumC11822l enumC11822l2 = new EnumC11822l("ActiveParent", 1);
        f23650l = enumC11822l2;
        EnumC11822l enumC11822l3 = new EnumC11822l("Captured", 2);
        f23649l = enumC11822l3;
        EnumC11822l enumC11822l4 = new EnumC11822l("Inactive", 3);
        f23653l = enumC11822l4;
        f23652l = new EnumC11822l[]{enumC11822l, enumC11822l2, enumC11822l3, enumC11822l4};
    }

    public static EnumC11822l valueOf(String str) {
        return (EnumC11822l) Enum.valueOf(EnumC11822l.class, str);
    }

    public static EnumC11822l[] values() {
        return (EnumC11822l[]) f23652l.clone();
    }

    public final boolean loadAd() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                C18725l.billing();
                return false;
            }
        }
        return true;
    }

    public final boolean yandex() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        C18725l.billing();
        return false;
    }
}
