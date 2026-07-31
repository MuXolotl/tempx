package defpackage;

/* JADX INFO: renamed from: lؘٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5709l extends AbstractC11833l {
    public static final float[] amazon;
    public static final float[] billing;
    public static final float[] mopub;
    public static final float[] purchase;

    static {
        float[] fArrSubs = AbstractC0136l.subs(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC0136l.amazon(C7225l.f15054l.f15055l, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        amazon = fArrSubs;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        purchase = fArr;
        billing = AbstractC0136l.mopub(fArrSubs);
        mopub = AbstractC0136l.mopub(fArr);
    }

    @Override // defpackage.AbstractC11833l
    public final long amazon(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = mopub;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = billing;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    @Override // defpackage.AbstractC11833l
    public final long billing(float f, float f2, float f3, float f4, AbstractC11833l abstractC11833l) {
        float[] fArr = amazon;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fCrashlytics = AbstractC7572l.crashlytics(f5);
        float fCrashlytics2 = AbstractC7572l.crashlytics(f6);
        float fCrashlytics3 = AbstractC7572l.crashlytics(f7);
        float[] fArr2 = purchase;
        return AbstractC12953l.yandex((fArr2[6] * fCrashlytics3) + (fArr2[3] * fCrashlytics2) + (fArr2[0] * fCrashlytics), (fArr2[7] * fCrashlytics3) + (fArr2[4] * fCrashlytics2) + (fArr2[1] * fCrashlytics), (fArr2[8] * fCrashlytics3) + (fArr2[5] * fCrashlytics2) + (fArr2[2] * fCrashlytics), f4, abstractC11833l);
    }

    @Override // defpackage.AbstractC11833l
    public final float loadAd(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.AbstractC11833l
    public final float purchase(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = mopub;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = billing;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // defpackage.AbstractC11833l
    public final float yandex(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }
}
