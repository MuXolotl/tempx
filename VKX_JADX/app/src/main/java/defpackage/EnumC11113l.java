package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lُ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC11113l {
    public static final C7788l Companion;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC11113l f22321l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC11113l f22322l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f22323l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11113l[] f22324l;

    static {
        EnumC11113l enumC11113l = new EnumC11113l("DONE", 0);
        f22322l = enumC11113l;
        EnumC11113l enumC11113l2 = new EnumC11113l("IN_PROGRESS", 1);
        f22321l = enumC11113l2;
        f22324l = new EnumC11113l[]{enumC11113l, enumC11113l2, new EnumC11113l("UNREAD", 2)};
        Companion = new C7788l();
        f22323l = AbstractC9968l.crashlytics(2, new C0063l(19));
    }

    public static EnumC11113l valueOf(String str) {
        return (EnumC11113l) Enum.valueOf(EnumC11113l.class, str);
    }

    public static EnumC11113l[] values() {
        return (EnumC11113l[]) f22324l.clone();
    }
}
