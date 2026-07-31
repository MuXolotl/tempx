package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l٘ٝ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18077l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC18077l[] f35370l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC18077l f35371l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC18077l EF0;

    static {
        EnumC18077l enumC18077l = new EnumC18077l("NOT_SET", 0);
        EnumC18077l enumC18077l2 = new EnumC18077l("EVENT_OVERRIDE", 1);
        f35371l = enumC18077l2;
        f35370l = new EnumC18077l[]{enumC18077l, enumC18077l2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC18077l);
        sparseArray.put(5, enumC18077l2);
    }

    public static EnumC18077l valueOf(String str) {
        return (EnumC18077l) Enum.valueOf(EnumC18077l.class, str);
    }

    public static EnumC18077l[] values() {
        return (EnumC18077l[]) f35370l.clone();
    }
}
