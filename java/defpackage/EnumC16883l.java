package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٗؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC16883l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16883l[] f32934l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC16883l f32935l;

    static {
        EnumC16883l enumC16883l = new EnumC16883l("DEFAULT", 0);
        f32935l = enumC16883l;
        EnumC16883l enumC16883l2 = new EnumC16883l("UNMETERED_ONLY", 1);
        EnumC16883l enumC16883l3 = new EnumC16883l("UNMETERED_OR_DAILY", 2);
        EnumC16883l enumC16883l4 = new EnumC16883l("FAST_IF_RADIO_AWAKE", 3);
        EnumC16883l enumC16883l5 = new EnumC16883l("NEVER", 4);
        EnumC16883l enumC16883l6 = new EnumC16883l("UNRECOGNIZED", 5);
        f32934l = new EnumC16883l[]{enumC16883l, enumC16883l2, enumC16883l3, enumC16883l4, enumC16883l5, enumC16883l6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC16883l);
        sparseArray.put(1, enumC16883l2);
        sparseArray.put(2, enumC16883l3);
        sparseArray.put(3, enumC16883l4);
        sparseArray.put(4, enumC16883l5);
        sparseArray.put(-1, enumC16883l6);
    }

    public static EnumC16883l valueOf(String str) {
        return (EnumC16883l) Enum.valueOf(EnumC16883l.class, str);
    }

    public static EnumC16883l[] values() {
        return (EnumC16883l[]) f32934l.clone();
    }
}
