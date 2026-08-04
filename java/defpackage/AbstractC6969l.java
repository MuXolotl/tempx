package defpackage;

/* JADX INFO: renamed from: lؚؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6969l {
    public static final C11793l loadAd;
    public static final C11793l yandex;

    static {
        Double dValueOf = Double.valueOf(0.69d);
        Double dValueOf2 = Double.valueOf(0.265d);
        Double dValueOf3 = Double.valueOf(0.32d);
        Double dValueOf4 = Double.valueOf(0.68d);
        Double dValueOf5 = Double.valueOf(1.0d);
        C17296l c17296l = AbstractC12605l.loadAd;
        C15617l c15617l = C15617l.f30504l;
        C13317l c13317l = AbstractC2223l.yandex;
        C13317l c13317l2 = AbstractC2223l.loadAd;
        C13317l c13317l3 = AbstractC2223l.crashlytics;
        yandex = new C11793l("sRGB", c17296l, c15617l, c13317l, c13317l2, c13317l3, new C8163l(10));
        C14823l c14823l = C14823l.f29006l;
        loadAd = AbstractC2223l.yandex("Linear sRGB", c17296l, c14823l, c13317l, c13317l2, c13317l3);
        C17296l c17296l2 = AbstractC2223l.amazon;
        AbstractC2223l.yandex("ACES2065-1", c17296l2, c14823l, AbstractC2223l.purchase, AbstractC2223l.billing, AbstractC2223l.mopub);
        admob admobVar = admob.f4l;
        C13317l c13317l4 = AbstractC2223l.admob;
        C13317l c13317l5 = AbstractC2223l.subs;
        C13317l c13317l6 = AbstractC2223l.isPro;
        AbstractC2223l.yandex("ACEScc", c17296l2, admobVar, c13317l4, c13317l5, c13317l6);
        AbstractC2223l.yandex("ACEScct", c17296l2, subs.f36579l, c13317l4, c13317l5, c13317l6);
        AbstractC2223l.yandex("ACEScg", c17296l2, c14823l, c13317l4, c13317l5, c13317l6);
        C10477l c10477l = new C10477l(2.19921875d);
        Double dValueOf6 = Double.valueOf(0.64d);
        Double dValueOf7 = Double.valueOf(0.33d);
        C13317l c13317l7 = new C13317l(dValueOf6, dValueOf7);
        C13317l c13317l8 = new C13317l(Double.valueOf(0.21d), Double.valueOf(0.71d));
        Double dValueOf8 = Double.valueOf(0.15d);
        Double dValueOf9 = Double.valueOf(0.06d);
        AbstractC2223l.yandex("Adobe RGB", c17296l, c10477l, c13317l7, c13317l8, new C13317l(dValueOf8, dValueOf9));
        int i = AbstractC7755l.f16267l;
        Double dValueOf10 = Double.valueOf(0.708d);
        Double dValueOf11 = Double.valueOf(0.292d);
        float fFloatValue = dValueOf10.floatValue();
        float fFloatValue2 = dValueOf11.floatValue();
        dValueOf5.floatValue();
        Double dValueOf12 = Double.valueOf(0.17d);
        Double dValueOf13 = Double.valueOf(0.797d);
        float fFloatValue3 = dValueOf12.floatValue();
        float fFloatValue4 = dValueOf13.floatValue();
        dValueOf5.floatValue();
        Double dValueOf14 = Double.valueOf(0.131d);
        Double dValueOf15 = Double.valueOf(0.046d);
        float fFloatValue5 = dValueOf14.floatValue();
        float fFloatValue6 = dValueOf15.floatValue();
        dValueOf5.floatValue();
        AbstractC11553l.yandex("RGB");
        float[] fArr = {fFloatValue, fFloatValue3, fFloatValue5, fFloatValue2, fFloatValue4, fFloatValue6, (1.0f - fFloatValue) - fFloatValue2, (1.0f - fFloatValue3) - fFloatValue4, (1.0f - fFloatValue5) - fFloatValue6};
        C13317l c13317l9 = c17296l.loadAd;
        float[] fArrPurchase = AbstractC12446l.purchase(fArr);
        float f = c13317l9.yandex;
        float f2 = c13317l9.crashlytics;
        float f3 = (f * f2) / c13317l9.loadAd;
        float fYandex = c13317l9.yandex();
        AbstractC12446l.purchase(AbstractC12446l.crashlytics((fArrPurchase[2] * fYandex) + (fArrPurchase[1] * f2) + (fArrPurchase[0] * f3), (fArrPurchase[5] * fYandex) + (fArrPurchase[4] * f2) + (fArrPurchase[3] * f3), (fArrPurchase[8] * fYandex) + (fArrPurchase[7] * f2) + (fArrPurchase[6] * f3), fArr));
        AbstractC2223l.yandex("BT.709", c17296l, C11630l.f23348l, new C13317l(dValueOf6, dValueOf7), new C13317l(Double.valueOf(0.3d), Double.valueOf(0.6d)), new C13317l(dValueOf8, dValueOf9));
        AbstractC2223l.yandex("DCI P3", new C17296l("DCI P3", new C13317l(Double.valueOf(0.314d), Double.valueOf(0.351d))), new C10477l(2.6d), new C13317l(dValueOf4, dValueOf3), new C13317l(dValueOf2, dValueOf), new C13317l(dValueOf8, dValueOf9));
        AbstractC2223l.yandex("Display P3", c17296l, c15617l, new C13317l(dValueOf4, dValueOf3), new C13317l(dValueOf2, dValueOf), new C13317l(dValueOf8, dValueOf9));
        AbstractC2223l.yandex("ROMM RGB", AbstractC12605l.yandex, C18450l.f36025l, new C13317l(Double.valueOf(0.7347d), Double.valueOf(0.2653d)), new C13317l(Double.valueOf(0.1596d), Double.valueOf(0.8404d)), new C13317l(Double.valueOf(0.0366d), Double.valueOf(1.0E-4d)));
    }
}
