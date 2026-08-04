package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٌَۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC10566l {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10566l EF5;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10566l[] f21483l = {new EnumC10566l("LIGHT", 0), new EnumC10566l("DARK", 1)};
    public static final C11067l Companion = new C11067l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f21484l = AbstractC9968l.crashlytics(2, new C7703l(10));

    public static EnumC10566l valueOf(String str) {
        return (EnumC10566l) Enum.valueOf(EnumC10566l.class, str);
    }

    public static EnumC10566l[] values() {
        return (EnumC10566l[]) f21483l.clone();
    }
}
