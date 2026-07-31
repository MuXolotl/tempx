package defpackage;

/* JADX INFO: renamed from: lَؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2533l {
    public static volatile boolean crashlytics = true;
    public static final double[][] yandex = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] loadAd = {95.047d, 100.0d, 108.883d};

    public static double amazon(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double billing(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d2 * d2 * d2;
        if (d3 <= 0.008856451679035631d) {
            d3 = ((116.0d * d2) - 16.0d) / 903.2962962962963d;
        }
        return d3 * 100.0d;
    }

    public static final boolean crashlytics(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static int loadAd(double d) {
        double d2 = d / 100.0d;
        return (int) AbstractC8576l.crashlytics(Math.rint((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0.0d, 255.0d);
    }

    public static double purchase(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static final long yandex(C1503l c1503l, C3844l c3844l, int i, long j, long j2) {
        C3844l c3844l2;
        C0869l c0869l = c1503l.f3755l;
        long j3 = i;
        AbstractC9334l.crashlytics(c3844l.purchase(), 0L, j3);
        if (c1503l.f3754l) {
            C8339l.smaato("closed");
            return 0L;
        }
        long jMax = j;
        int i2 = i;
        C3844l c3844l3 = c3844l;
        while (true) {
            long jYandex = loadAd.yandex(c0869l, c3844l3, jMax, j2, i2);
            long j4 = jMax;
            if (jYandex != -1) {
                return jYandex;
            }
            long j5 = c0869l.f2526l;
            long j6 = (j5 - j3) + 1;
            if (j6 < j2) {
                if (j5 < j2) {
                    c3844l2 = c3844l;
                } else {
                    int iMax = (int) Math.max(1L, (j5 - j2) + 1);
                    int iMin = ((int) Math.min(j3, (c0869l.f2526l - j4) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            c3844l2 = c3844l;
                            if (c0869l.inmobi(c0869l.f2526l - ((long) iMin), c3844l2, iMin)) {
                                break;
                            }
                            if (iMin != iMax) {
                                iMin--;
                            }
                        }
                    }
                }
                if (c1503l.f3756l.ad(c0869l, 8192L) != -1) {
                    i2 = i;
                    jMax = Math.max(j4, j6);
                    c3844l3 = c3844l2;
                }
            }
            return -1L;
        }
    }
}
