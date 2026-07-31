package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lّٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC12805l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC12805l f25184l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC12805l f25185l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC12805l f25186l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC12805l[] f25187l;

    static {
        EnumC12805l enumC12805l = new EnumC12805l("StartToEnd", 0);
        f25186l = enumC12805l;
        EnumC12805l enumC12805l2 = new EnumC12805l("EndToStart", 1);
        f25185l = enumC12805l2;
        EnumC12805l enumC12805l3 = new EnumC12805l("Settled", 2);
        f25184l = enumC12805l3;
        f25187l = new EnumC12805l[]{enumC12805l, enumC12805l2, enumC12805l3};
    }

    public static EnumC12805l valueOf(String str) {
        return (EnumC12805l) Enum.valueOf(EnumC12805l.class, str);
    }

    public static EnumC12805l[] values() {
        return (EnumC12805l[]) f25187l.clone();
    }
}
