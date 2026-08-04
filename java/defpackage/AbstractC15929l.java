package defpackage;

/* JADX INFO: renamed from: lٕۚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15929l {
    public static final int admob = 48;
    public static final int amazon = 6;
    public static final int billing = 5;
    public static final int crashlytics = 9;
    public static C5197l loadAd = null;
    public static final int mopub = 15;
    public static final int purchase = 10;
    public static final short[] yandex = {2285, 2571, 2970, 1812, 1493, 1422, 287, 202, 3158, 622, 1577, 182, 962, 2127, 1855, 1468, 573, 2004, 264, 383, 2500, 1458, 1727, 3199, 2648, 1017, 732, 608, 1787, 411, 3124, 1758, 1223, 652, 2777, 1015, 2036, 1491, 3047, 1785, 516, 3321, 3009, 2663, 1711, 2167, 126, 1469, 2476, 3239, 3058, 830, 107, 1908, 3082, 2378, 2931, 961, 1821, 2604, 448, 2264, 677, 2054, 2226, 430, 555, 843, 2078, 871, 1550, 105, 422, 587, 177, 3094, 3038, 2869, 1574, 1653, 3083, 778, 1159, 3182, 2552, 1483, 2727, 1119, 1739, 644, 2457, 349, 418, 329, 3173, 3254, 817, 1097, 603, 610, 1322, 2044, 1864, 384, 2114, 3193, 1218, 1994, 2455, 220, 2142, 1670, 2144, 1799, 2051, 794, 1819, 2475, 2459, 478, 3221, 3021, 996, 991, 958, 1869, 1522, 1628};

    public static final void amazon(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final C5197l crashlytics() {
        C5197l c5197l = loadAd;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("AutoMirrored.Rounded.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(9.29f, 15.88f);
        c15659l.amazon(13.17f, 12.0f);
        c15659l.amazon(9.29f, 8.12f);
        c15659l.loadAd(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        c15659l.loadAd(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        c15659l.purchase(4.59f, 4.59f);
        c15659l.loadAd(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        c15659l.amazon(10.7f, 17.3f);
        c15659l.loadAd(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        c15659l.loadAd(-0.38f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f);
        c15659l.yandex();
        C10943l.yandex(c10943l, c15659l.f30611l, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        loadAd = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static void loadAd(short[] sArr, int i, short s, short s2, short s3, short s4, short s5) {
        sArr[i] = (short) (AbstractC10409l.billing(s * s3) + AbstractC10409l.billing(AbstractC10409l.billing(s2 * s4) * s5));
        int i2 = i + 1;
        sArr[i2] = (short) (AbstractC10409l.billing(s2 * s3) + AbstractC10409l.billing(s * s4));
    }

    public static final C9426l yandex(Object obj) {
        C9426l c9426l = new C9426l();
        c9426l.m3885new(obj);
        return c9426l;
    }
}
