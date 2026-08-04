package defpackage;

/* JADX INFO: renamed from: lؖ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4433l {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);


    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC4433l[] f9025l = new EnumC4433l[26];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f9026l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f9027l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char f9028l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f9029l;

    static {
        for (EnumC4433l enumC4433l : values()) {
            f9025l[(enumC4433l.f9028l | ' ') - 97] = enumC4433l;
        }
    }

    EnumC4433l(char c, int i, String str, boolean z) {
        this.f9028l = c;
        this.f9027l = i;
        C17465l c17465l = C17465l.purchase;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iCharAt = ((int) ((C17465l.amazon >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                C8339l.metrica("invalid flags: ".concat(str));
                throw null;
            }
            i2 |= 1 << iCharAt;
        }
        this.f9026l = i2;
        this.f9029l = AbstractC2812l.tapsense(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }
}
