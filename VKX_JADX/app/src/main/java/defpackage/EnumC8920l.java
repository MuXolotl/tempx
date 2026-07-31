package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌٜٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8920l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8920l[] f18383l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC8920l f18384l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC8920l f18385l;

    static {
        EnumC8920l enumC8920l = new EnumC8920l("UPTIME", 0);
        f18385l = enumC8920l;
        EnumC8920l enumC8920l2 = new EnumC8920l("REALTIME", 1);
        f18384l = enumC8920l2;
        f18383l = new EnumC8920l[]{enumC8920l, enumC8920l2};
    }

    public static EnumC8920l valueOf(String str) {
        return (EnumC8920l) Enum.valueOf(EnumC8920l.class, str);
    }

    public static EnumC8920l[] values() {
        return (EnumC8920l[]) f18383l.clone();
    }
}
