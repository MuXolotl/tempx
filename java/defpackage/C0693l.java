package defpackage;

/* JADX INFO: renamed from: lؑۤۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0693l {
    public static final byte[] purchase = new byte[1792];
    public char amazon;
    public int crashlytics;
    public final int loadAd;
    public final String yandex;

    static {
        for (int i = 0; i < 1792; i++) {
            purchase[i] = Character.getDirectionality(i);
        }
    }

    public C0693l(String str) {
        this.yandex = str;
        this.loadAd = str.length();
    }

    public final byte yandex() {
        int i = this.crashlytics - 1;
        String str = this.yandex;
        char cCharAt = str.charAt(i);
        this.amazon = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.crashlytics;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(str, i2);
            this.crashlytics -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.crashlytics = i2 - 1;
        char c = this.amazon;
        return c < 1792 ? purchase[c] : Character.getDirectionality(c);
    }
}
