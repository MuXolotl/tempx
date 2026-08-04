package defpackage;

/* JADX INFO: renamed from: lؙٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3955l {
    public static final C0777l Signature;
    public static final C5709l ad;
    public static final C0777l adcel;
    public static final C0777l admob;
    public static final C0777l ads;
    public static final AbstractC11833l[] advert;
    public static final C0411l amazon;
    public static final C0777l billing;
    public static final C0411l crashlytics;
    public static final C0777l firebase;
    public static final C0777l isPro;
    public static final C0777l license;
    public static final float[] loadAd;
    public static final C0777l metrica;
    public static final C0777l mopub;
    public static final C0777l pro;
    public static final C0777l purchase;
    public static final C0777l remoteconfig;
    public static final C0777l smaato;
    public static final C0777l startapp;
    public static final C0777l subs;
    public static final C2474l subscription;
    public static final C2474l tapsense;
    public static final C0777l vip;
    public static final float[] yandex;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        yandex = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        loadAd = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C0411l c0411l = new C0411l(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0411l c0411l2 = new C0411l(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0411l c0411l3 = new C0411l(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        crashlytics = c0411l3;
        C0411l c0411l4 = new C0411l(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        amazon = c0411l4;
        C18558l c18558l = AbstractC2238l.amazon;
        C0777l c0777l = new C0777l("sRGB IEC61966-2.1", fArr, c18558l, c0411l, 0);
        purchase = c0777l;
        C0777l c0777l2 = new C0777l("sRGB IEC61966-2.1 (Linear)", fArr, c18558l, 1.0d, 0.0f, 1.0f, 1);
        billing = c0777l2;
        C0777l c0777l3 = new C0777l("scRGB-nl IEC 61966-2-2:2003", fArr, c18558l, null, new C8936l(6), new C8936l(7), -0.799f, 2.399f, c0411l, 2);
        mopub = c0777l3;
        C0777l c0777l4 = new C0777l("scRGB IEC 61966-2-2:2003", fArr, c18558l, 1.0d, -0.5f, 7.499f, 3);
        admob = c0777l4;
        C0777l c0777l5 = new C0777l("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c18558l, new C0411l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        subs = c0777l5;
        C0777l c0777l6 = new C0777l("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c18558l, new C0411l(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        isPro = c0777l6;
        C0777l c0777l7 = new C0777l("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C18558l(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        firebase = c0777l7;
        C0777l c0777l8 = new C0777l("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c18558l, c0411l, 7);
        smaato = c0777l8;
        double d = 0.2222222222222222d;
        double d2 = 0.081d;
        double d3 = 2.2222222222222223d;
        double d4 = 0.9099181073703367d;
        double d5 = 0.09008189262966333d;
        C0777l c0777l9 = new C0777l("NTSC (1953)", fArr2, AbstractC2238l.yandex, new C0411l(d3, d4, d5, d, d2), 8);
        remoteconfig = c0777l9;
        C0777l c0777l10 = new C0777l("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c18558l, new C0411l(d3, d4, d5, d, d2), 9);
        vip = c0777l10;
        C0777l c0777l11 = new C0777l("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c18558l, 2.2d, 0.0f, 1.0f, 10);
        metrica = c0777l11;
        C0777l c0777l12 = new C0777l("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC2238l.loadAd, new C0411l(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        startapp = c0777l12;
        C18558l c18558l2 = AbstractC2238l.crashlytics;
        C0777l c0777l13 = new C0777l("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c18558l2, 1.0d, -65504.0f, 65504.0f, 12);
        adcel = c0777l13;
        C0777l c0777l14 = new C0777l("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c18558l2, 1.0d, -65504.0f, 65504.0f, 13);
        ads = c0777l14;
        C2474l c2474l = new C2474l(14, 1, 12884901889L, "Generic XYZ");
        subscription = c2474l;
        C2474l c2474l2 = new C2474l(15, 0, 12884901890L, "Generic L*a*b*");
        tapsense = c2474l2;
        C0777l c0777l15 = new C0777l("None", fArr, c18558l, c0411l2, 16);
        Signature = c0777l15;
        C0777l c0777l16 = new C0777l("Hybrid Log Gamma encoding", fArr3, c18558l, null, new C8936l(8), new C8936l(9), 0.0f, 1.0f, c0411l3, 17);
        license = c0777l16;
        C0777l c0777l17 = new C0777l("Perceptual Quantizer encoding", fArr3, c18558l, null, new C8936l(10), new C8936l(11), 0.0f, 1.0f, c0411l4, 18);
        pro = c0777l17;
        C5709l c5709l = new C5709l(12884901890L, 19, "Oklab");
        ad = c5709l;
        advert = new AbstractC11833l[]{c0777l, c0777l2, c0777l3, c0777l4, c0777l5, c0777l6, c0777l7, c0777l8, c0777l9, c0777l10, c0777l11, c0777l12, c0777l13, c0777l14, c2474l, c2474l2, c0777l15, c0777l16, c0777l17, c5709l};
    }

    public static double amazon(C0411l c0411l, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = -c0411l.loadAd;
        double d5 = c0411l.purchase;
        double d6 = 1.0d / c0411l.mopub;
        return Math.pow(Math.max((Math.pow(d3, d6) * d5) + d4, 0.0d) / ((Math.pow(d3, d6) * (-c0411l.billing)) + c0411l.crashlytics), 1.0d / c0411l.amazon) * d2;
    }

    public static double crashlytics(C0411l c0411l, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = c0411l.loadAd;
        double d5 = c0411l.amazon;
        double dPow = (Math.pow(d3, d5) * c0411l.crashlytics) + d4;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d3, d5) * c0411l.billing) + c0411l.purchase), c0411l.mopub) * d2;
    }

    public static double loadAd(C0411l c0411l, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = 1.0d / c0411l.loadAd;
        double d4 = 1.0d / c0411l.crashlytics;
        double d5 = 1.0d / c0411l.amazon;
        double d6 = c0411l.purchase;
        double d7 = c0411l.billing;
        double d8 = (d * d2) / (c0411l.mopub + 1.0d);
        return d2 * (d8 <= 1.0d ? Math.pow(d8, d4) * d3 : (Math.log(d8 - d6) * d5) + d7);
    }

    public static double yandex(C0411l c0411l, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = c0411l.loadAd;
        double d5 = c0411l.crashlytics;
        double d6 = c0411l.amazon;
        double d7 = c0411l.purchase;
        double d8 = c0411l.billing;
        double d9 = d4 * d3;
        return (c0411l.mopub + 1.0d) * d2 * (d9 <= 1.0d ? Math.pow(d9, d5) : Math.exp((d3 - d8) * d6) + d7);
    }
}
