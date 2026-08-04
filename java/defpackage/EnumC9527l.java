package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9527l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9527l[] f19426l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9527l f19427l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9527l EF0;

    static {
        EnumC9527l enumC9527l = new EnumC9527l("AM", 0);
        EnumC9527l enumC9527l2 = new EnumC9527l("PM", 1);
        f19427l = enumC9527l2;
        f19426l = new EnumC9527l[]{enumC9527l, enumC9527l2};
    }

    public static EnumC9527l valueOf(String str) {
        return (EnumC9527l) Enum.valueOf(EnumC9527l.class, str);
    }

    public static EnumC9527l[] values() {
        return (EnumC9527l[]) f19426l.clone();
    }
}
