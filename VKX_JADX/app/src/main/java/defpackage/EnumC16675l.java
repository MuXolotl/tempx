package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٖ۠ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC16675l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16675l[] f32696l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C14562l f32697l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C18287l f32698l;

    static {
        C18287l c18287l = new C18287l();
        f32698l = c18287l;
        C14562l c14562l = new C14562l();
        f32697l = c14562l;
        f32696l = new EnumC16675l[]{c18287l, c14562l, new EnumC16675l() { // from class: lؘۨؔ
            @Override // defpackage.EnumC16675l
            public final String loadAd() {
                return "PKCS12";
            }

            @Override // defpackage.EnumC16675l
            public final byte[] yandex(char[] cArr) {
                return AbstractC11186l.PKCS12PasswordToBytes(cArr);
            }
        }};
    }

    public static EnumC16675l valueOf(String str) {
        return (EnumC16675l) Enum.valueOf(EnumC16675l.class, str);
    }

    public static EnumC16675l[] values() {
        return (EnumC16675l[]) f32696l.clone();
    }

    public abstract String loadAd();

    public abstract byte[] yandex(char[] cArr);
}
