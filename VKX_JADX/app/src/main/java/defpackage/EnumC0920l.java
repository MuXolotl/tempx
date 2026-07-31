package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0920l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC0920l f2593l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC0920l f2594l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC0920l f2595l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0920l[] f2596l;

    static {
        EnumC0920l enumC0920l = new EnumC0920l("START", 0);
        f2595l = enumC0920l;
        EnumC0920l enumC0920l2 = new EnumC0920l("STOP", 1);
        f2594l = enumC0920l2;
        EnumC0920l enumC0920l3 = new EnumC0920l("STOP_AND_RESET_REPLAY_CACHE", 2);
        f2593l = enumC0920l3;
        f2596l = new EnumC0920l[]{enumC0920l, enumC0920l2, enumC0920l3};
    }

    public static EnumC0920l valueOf(String str) {
        return (EnumC0920l) Enum.valueOf(EnumC0920l.class, str);
    }

    public static EnumC0920l[] values() {
        return (EnumC0920l[]) f2596l.clone();
    }
}
