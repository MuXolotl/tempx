package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؚٜۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7384l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7384l[] f15309l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC7384l f15310l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC7384l f15311l;

    static {
        EnumC7384l enumC7384l = new EnumC7384l("IDLE", 0);
        f15311l = enumC7384l;
        EnumC7384l enumC7384l2 = new EnumC7384l("STREAMING", 1);
        f15310l = enumC7384l2;
        f15309l = new EnumC7384l[]{enumC7384l, enumC7384l2};
    }

    public static EnumC7384l valueOf(String str) {
        return (EnumC7384l) Enum.valueOf(EnumC7384l.class, str);
    }

    public static EnumC7384l[] values() {
        return (EnumC7384l[]) f15309l.clone();
    }
}
