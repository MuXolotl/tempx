package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lُٜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11163l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11163l[] f22449l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC11163l f22450l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11163l EF0;

    static {
        EnumC11163l enumC11163l = new EnumC11163l("Classic", 0);
        EnumC11163l enumC11163l2 = new EnumC11163l("Absolution", 1);
        f22450l = enumC11163l2;
        f22449l = new EnumC11163l[]{enumC11163l, enumC11163l2};
    }

    public static EnumC11163l valueOf(String str) {
        return (EnumC11163l) Enum.valueOf(EnumC11163l.class, str);
    }

    public static EnumC11163l[] values() {
        return (EnumC11163l[]) f22449l.clone();
    }
}
