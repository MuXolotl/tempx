package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٕؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC15420l {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC15420l EF5;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15420l[] f30136l = {new EnumC15420l("INTERNAL", 0), new EnumC15420l("EXTERNAL", 1), new EnumC15420l("AUTHORIZE", 2)};
    public static final C17717l Companion = new C17717l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f30137l = AbstractC9968l.crashlytics(2, new C7703l(16));

    public static EnumC15420l valueOf(String str) {
        return (EnumC15420l) Enum.valueOf(EnumC15420l.class, str);
    }

    public static EnumC15420l[] values() {
        return (EnumC15420l[]) f30136l.clone();
    }
}
