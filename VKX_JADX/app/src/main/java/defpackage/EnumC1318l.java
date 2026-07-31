package defpackage;

import ealvatag.tag.datatype.DataTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؒۚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC1318l {
    public static final C0961l Companion;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1318l[] f3406l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC1318l f3407l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f3408l;

    static {
        EnumC1318l enumC1318l = new EnumC1318l("Sms", 0);
        f3407l = enumC1318l;
        f3406l = new EnumC1318l[]{enumC1318l, new EnumC1318l("Push", 1), new EnumC1318l(DataTypes.OBJ_EMAIL, 2), new EnumC1318l("CallReset", 3)};
        Companion = new C0961l();
        f3408l = AbstractC9968l.crashlytics(2, new C8810l(7));
    }

    public static EnumC1318l valueOf(String str) {
        return (EnumC1318l) Enum.valueOf(EnumC1318l.class, str);
    }

    public static EnumC1318l[] values() {
        return (EnumC1318l[]) f3406l.clone();
    }
}
