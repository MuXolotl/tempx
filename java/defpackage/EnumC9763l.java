package defpackage;

import ealvatag.tag.datatype.DataTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍۗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC9763l {
    public static final C2349l Companion;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC9763l f19899l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final EnumC9763l f19900l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9763l[] f19901l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC9763l f19902l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f19903l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC9763l f19904l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC9763l f19905l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC9763l f19906l;

    static {
        EnumC9763l enumC9763l = new EnumC9763l("Sms", 0);
        f19902l = enumC9763l;
        EnumC9763l enumC9763l2 = new EnumC9763l("Push", 1);
        f19899l = enumC9763l2;
        EnumC9763l enumC9763l3 = new EnumC9763l(DataTypes.OBJ_EMAIL, 2);
        f19905l = enumC9763l3;
        EnumC9763l enumC9763l4 = new EnumC9763l("App", 3);
        EnumC9763l enumC9763l5 = new EnumC9763l("LibVerify", 4);
        f19904l = enumC9763l5;
        EnumC9763l enumC9763l6 = new EnumC9763l("CallReset", 5);
        f19906l = enumC9763l6;
        EnumC9763l enumC9763l7 = new EnumC9763l("ReserveCode", 6);
        f19900l = enumC9763l7;
        f19901l = new EnumC9763l[]{enumC9763l, enumC9763l2, enumC9763l3, enumC9763l4, enumC9763l5, enumC9763l6, enumC9763l7};
        Companion = new C2349l();
        f19903l = AbstractC9968l.crashlytics(2, new C8810l(6));
    }

    public static EnumC9763l valueOf(String str) {
        return (EnumC9763l) Enum.valueOf(EnumC9763l.class, str);
    }

    public static EnumC9763l[] values() {
        return (EnumC9763l[]) f19901l.clone();
    }
}
