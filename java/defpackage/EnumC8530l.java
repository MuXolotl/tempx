package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌؘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8530l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC8530l f17620l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC8530l f17621l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC8530l f17622l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8530l[] f17623l;

    static {
        EnumC8530l enumC8530l = new EnumC8530l("PASS_THROUGH", 0);
        f17622l = enumC8530l;
        EnumC8530l enumC8530l2 = new EnumC8530l("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f17621l = enumC8530l2;
        EnumC8530l enumC8530l3 = new EnumC8530l("DISCARDING", 2);
        f17620l = enumC8530l3;
        f17623l = new EnumC8530l[]{enumC8530l, enumC8530l2, enumC8530l3};
    }

    public static EnumC8530l valueOf(String str) {
        return (EnumC8530l) Enum.valueOf(EnumC8530l.class, str);
    }

    public static EnumC8530l[] values() {
        return (EnumC8530l[]) f17623l.clone();
    }
}
