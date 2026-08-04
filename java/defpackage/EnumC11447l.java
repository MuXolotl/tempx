package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lُۤؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11447l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC11447l f23031l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC11447l f23032l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC11447l f23033l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11447l[] f23034l;

    static {
        EnumC11447l enumC11447l = new EnumC11447l("IDLE", 0);
        f23033l = enumC11447l;
        EnumC11447l enumC11447l2 = new EnumC11447l("PLAYING", 1);
        f23032l = enumC11447l2;
        EnumC11447l enumC11447l3 = new EnumC11447l("PAUSED", 2);
        f23031l = enumC11447l3;
        f23034l = new EnumC11447l[]{enumC11447l, enumC11447l2, enumC11447l3};
    }

    public static EnumC11447l valueOf(String str) {
        return (EnumC11447l) Enum.valueOf(EnumC11447l.class, str);
    }

    public static EnumC11447l[] values() {
        return (EnumC11447l[]) f23034l.clone();
    }
}
