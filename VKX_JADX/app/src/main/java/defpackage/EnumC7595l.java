package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؚۢۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC7595l {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7595l EF5;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7595l[] f15623l = {new EnumC7595l("FREE", 0), new EnumC7595l("PAID", 1), new EnumC7595l("STARTED", 2)};
    public static final C0445l Companion = new C0445l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f15624l = AbstractC9968l.crashlytics(2, new C0063l(17));

    public static EnumC7595l valueOf(String str) {
        return (EnumC7595l) Enum.valueOf(EnumC7595l.class, str);
    }

    public static EnumC7595l[] values() {
        return (EnumC7595l[]) f15623l.clone();
    }
}
