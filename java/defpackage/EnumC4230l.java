package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؖٛؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4230l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4230l[] f8663l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final HashMap f8664l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC4230l f8665l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4230l EF0;

    static {
        EnumC4230l enumC4230l = new EnumC4230l("X86_32", 0);
        EnumC4230l enumC4230l2 = new EnumC4230l("X86_64", 1);
        EnumC4230l enumC4230l3 = new EnumC4230l("ARM_UNKNOWN", 2);
        EnumC4230l enumC4230l4 = new EnumC4230l("PPC", 3);
        EnumC4230l enumC4230l5 = new EnumC4230l("PPC64", 4);
        EnumC4230l enumC4230l6 = new EnumC4230l("ARMV6", 5);
        EnumC4230l enumC4230l7 = new EnumC4230l("ARMV7", 6);
        EnumC4230l enumC4230l8 = new EnumC4230l("UNKNOWN", 7);
        f8665l = enumC4230l8;
        EnumC4230l enumC4230l9 = new EnumC4230l("ARMV7S", 8);
        EnumC4230l enumC4230l10 = new EnumC4230l("ARM64", 9);
        f8663l = new EnumC4230l[]{enumC4230l, enumC4230l2, enumC4230l3, enumC4230l4, enumC4230l5, enumC4230l6, enumC4230l7, enumC4230l8, enumC4230l9, enumC4230l10};
        HashMap map = new HashMap(4);
        f8664l = map;
        map.put("armeabi-v7a", enumC4230l7);
        map.put("armeabi", enumC4230l6);
        map.put("arm64-v8a", enumC4230l10);
        map.put("x86", enumC4230l);
    }

    public static EnumC4230l valueOf(String str) {
        return (EnumC4230l) Enum.valueOf(EnumC4230l.class, str);
    }

    public static EnumC4230l[] values() {
        return (EnumC4230l[]) f8663l.clone();
    }
}
