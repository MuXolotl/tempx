package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٖٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14924l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14924l[] f29377l = {new EnumC14924l("NEED_PASSWORD_AND_VALIDATION", 0), new EnumC14924l("NEED_VALIDATION", 1), new EnumC14924l("NEED_PASSWORD", 2), new EnumC14924l("NEED_REGISTRATION", 3), new EnumC14924l("NEED_LOGIN_VALIDATION", 4), new EnumC14924l("NEED_PASSKEY", 5), new EnumC14924l("NEED_PASSKEY_OTP", 6), new EnumC14924l("NEED_WEBAUTHN", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14924l EF5;

    public static EnumC14924l valueOf(String str) {
        return (EnumC14924l) Enum.valueOf(EnumC14924l.class, str);
    }

    public static EnumC14924l[] values() {
        return (EnumC14924l[]) f29377l.clone();
    }
}
