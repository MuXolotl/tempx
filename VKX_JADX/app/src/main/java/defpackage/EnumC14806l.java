package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lَٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14806l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC14806l f28952l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC14806l f28953l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC14806l f28954l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14806l[] f28955l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC14806l f28956l;

    static {
        EnumC14806l enumC14806l = new EnumC14806l("START", 0);
        f28954l = enumC14806l;
        EnumC14806l enumC14806l2 = new EnumC14806l("END", 1);
        f28953l = enumC14806l2;
        EnumC14806l enumC14806l3 = new EnumC14806l("TOP", 2);
        f28952l = enumC14806l3;
        EnumC14806l enumC14806l4 = new EnumC14806l("BOTTOM", 3);
        f28956l = enumC14806l4;
        f28955l = new EnumC14806l[]{enumC14806l, enumC14806l2, enumC14806l3, enumC14806l4};
    }

    public static EnumC14806l valueOf(String str) {
        return (EnumC14806l) Enum.valueOf(EnumC14806l.class, str);
    }

    public static EnumC14806l[] values() {
        return (EnumC14806l[]) f28955l.clone();
    }

    public final boolean crashlytics(boolean z) {
        if (z || this != f28953l) {
            return z && this == f28954l;
        }
        return true;
    }

    public final boolean loadAd(boolean z) {
        if (z || this != f28954l) {
            return z && this == f28953l;
        }
        return true;
    }

    public final boolean yandex() {
        return this == f28954l || this == f28953l;
    }
}
