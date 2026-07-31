package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lؘِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class EnumC5608l {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5608l EF5;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5608l[] f11912l = {new EnumC5608l("NEW_RELEASE", 0), new EnumC5608l("NO_CHANGES", 1), new EnumC5608l("MOVED_UP", 2), new EnumC5608l("MOVED_DOWN", 3)};
    public static final C2496l Companion = new C2496l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final InterfaceC1220l f11913l = AbstractC9968l.crashlytics(2, new C0063l(24));

    public static EnumC5608l valueOf(String str) {
        return (EnumC5608l) Enum.valueOf(EnumC5608l.class, str);
    }

    public static EnumC5608l[] values() {
        return (EnumC5608l[]) f11912l.clone();
    }
}
