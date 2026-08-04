package defpackage;

import android.graphics.PathMeasure;
import java.util.Arrays;

/* JADX INFO: renamed from: lؗۢٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5228l {
    public C0404l admob;
    public float[] amazon;
    public final C16876l firebase;
    public final C9902l isPro;
    public C0404l mopub;
    public float purchase;
    public C9902l[] remoteconfig;
    public final C9902l smaato;
    public float subs;
    public float vip;
    public float yandex = -1.0f;
    public float loadAd = -1.0f;
    public long crashlytics = 9205357640488583168L;
    public float billing = -1.0f;

    public C5228l() {
        C0404l c0404l = new C0404l(0.0f, 0.0f, 0, 0, null, 31);
        this.mopub = c0404l;
        this.admob = c0404l;
        this.subs = 1.0f;
        this.isPro = AbstractC3478l.yandex();
        this.firebase = new C16876l(new PathMeasure());
        this.smaato = AbstractC3478l.yandex();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[LOOP:2: B:43:0x00c7->B:45:0x00cb, LOOP_END] */
    public final void yandex(long j, float f, float[] fArr, float f2, float f3, float f4, C0404l c0404l, C0404l c0404l2) {
        long j2;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float f5;
        float f6;
        C9902l c9902l;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        boolean z;
        if (this.amazon == null) {
            this.amazon = new float[fArr.length];
            int length = fArr.length / 2;
            C9902l[] c9902lArr = new C9902l[length];
            for (int i = 0; i < length; i++) {
                c9902lArr[i] = AbstractC3478l.yandex();
            }
            this.remoteconfig = c9902lArr;
        }
        boolean zLoadAd = C14174l.loadAd(this.crashlytics, j);
        float fMax = 0.0f;
        C16876l c16876l = this.firebase;
        if (zLoadAd && this.yandex == f && AbstractC8576l.yandex(this.mopub, c0404l) && AbstractC8576l.yandex(this.admob, c0404l2) && this.purchase == f4) {
            float f13 = this.loadAd;
            if (!(f13 == 0.0f || f2 == 0.0f) || (f13 == 0.0f && f2 == 0.0f)) {
                z = false;
                j2 = 4294967295L;
                f5 = 2.0f;
            } else {
                j2 = 4294967295L;
                fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
                int i2 = c0404l.crashlytics;
                f5 = 2.0f;
                f6 = c0404l.yandex;
                fMax = i2 == 0 ? Math.max(f6 / 2.0f, c0404l2.yandex / 2.0f) : Math.max(f6 / 2.0f, c0404l2.yandex / 2.0f);
                this.vip = fMax;
                c9902l = this.isPro;
                c9902l.subs();
                c9902l.billing(0.0f, 0.0f);
                if (f2 == 0.0f) {
                    c9902l.purchase(fIntBitsToFloat2, 0.0f);
                    f12 = 0.0f;
                } else {
                    f7 = f / 2.0f;
                    f8 = fIntBitsToFloat - f6;
                    f9 = (f * 2.0f) + fIntBitsToFloat2;
                    f10 = f7;
                    f11 = f7 / 2.0f;
                    while (f10 <= f9) {
                        c9902l.yandex.quadTo(f11, f8, f10, 0.0f);
                        f10 += f7;
                        f11 += f7;
                        f8 *= -1.0f;
                        fIntBitsToFloat = fIntBitsToFloat;
                    }
                    f12 = 0.0f;
                }
                c9902l.smaato((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / 2.0f)) & 4294967295L));
                c16876l.loadAd(c9902l);
                float length2 = c16876l.yandex.getLength();
                C8896l c8896lAmazon = c9902l.amazon();
                this.subs = length2 / ((c8896lAmazon.crashlytics - c8896lAmazon.yandex) + 1.0E-8f);
                this.crashlytics = j;
                this.yandex = f;
                this.mopub = c0404l;
                this.admob = c0404l2;
                this.purchase = f4;
                z = true;
            }
        } else {
            j2 = 4294967295L;
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
            int i3 = c0404l.crashlytics;
            f5 = 2.0f;
            f6 = c0404l.yandex;
            if ((i3 == 0 || c0404l2.crashlytics != 0) && fIntBitsToFloat <= fIntBitsToFloat2) {
            }
            this.vip = fMax;
            c9902l = this.isPro;
            c9902l.subs();
            c9902l.billing(0.0f, 0.0f);
            if (f2 == 0.0f) {
                c9902l.purchase(fIntBitsToFloat2, 0.0f);
                f12 = 0.0f;
            } else {
                f7 = f / 2.0f;
                f8 = fIntBitsToFloat - f6;
                f9 = (f * 2.0f) + fIntBitsToFloat2;
                f10 = f7;
                f11 = f7 / 2.0f;
                while (f10 <= f9) {
                    c9902l.yandex.quadTo(f11, f8, f10, 0.0f);
                    f10 += f7;
                    f11 += f7;
                    f8 *= -1.0f;
                    fIntBitsToFloat = fIntBitsToFloat;
                }
                f12 = 0.0f;
            }
            c9902l.smaato((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / 2.0f)) & 4294967295L));
            c16876l.loadAd(c9902l);
            float length3 = c16876l.yandex.getLength();
            C8896l c8896lAmazon2 = c9902l.amazon();
            this.subs = length3 / ((c8896lAmazon2.crashlytics - c8896lAmazon2.yandex) + 1.0E-8f);
            this.crashlytics = j;
            this.yandex = f;
            this.mopub = c0404l;
            this.admob = c0404l2;
            this.purchase = f4;
            z = true;
        }
        if (C14174l.loadAd(this.crashlytics, 9205357640488583168L)) {
            C8339l.metrica("updateDrawPaths was called before updateFullPaths");
            return;
        }
        C9902l[] c9902lArr2 = this.remoteconfig;
        if (c9902lArr2.length != fArr.length / 2) {
            C10754l.metrica(AbstractC12589l.applovin(fArr.length / 2, c9902lArr2.length, "the given progress fraction pairs do not match the expected number of progress paths to draw. updateDrawPaths called with ", " pairs, while there are ", " expected progress paths."));
            return;
        }
        if (!z && Arrays.equals(this.amazon, fArr) && this.loadAd == f2 && this.billing == f3) {
            return;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.crashlytics >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.crashlytics & j2)) / f5;
        float fMin = this.purchase;
        float f14 = fIntBitsToFloat3 - this.vip;
        C9902l c9902l2 = this.smaato;
        c9902l2.subs();
        c9902l2.billing(f14, fIntBitsToFloat4);
        int length4 = this.remoteconfig.length;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < length4) {
            this.remoteconfig[i4].subs();
            int i5 = i4 * 2;
            float f15 = fArr[i5];
            float f16 = fArr[i5 + 1];
            float f17 = f15 * fIntBitsToFloat3;
            float f18 = f16 * fIntBitsToFloat3;
            if (i4 == 0) {
                float f19 = this.vip;
                fMin = f18 < f19 ? 0.0f : Math.min(f18 - f19, this.purchase);
                z2 = f18 >= this.vip;
            }
            float f20 = fIntBitsToFloat3;
            float f21 = this.vip;
            float f22 = f20 - f21;
            float f23 = f18 < f21 ? f21 : f18;
            if (f23 > f22) {
                f23 = f22;
            }
            if (f17 >= f21) {
                f21 = f17;
            }
            if (f21 <= f22) {
                f22 = f21;
            }
            if (Math.abs(f16 - f15) > 0.0f) {
                float f24 = f2 == 0.0f ? 0.0f : this.yandex * f3;
                float f25 = this.subs;
                c16876l.yandex((f22 + f24) * f25, f25 * (f23 + f24), this.remoteconfig[i4]);
                C9902l c9902l3 = this.remoteconfig[i4];
                float[] fArrYandex = C10924l.yandex();
                C10924l.isPro(fArrYandex, f24 > 0.0f ? -f24 : 0.0f, (1.0f - f2) * fIntBitsToFloat4);
                if (f2 != 1.0f) {
                    C10924l.admob(fArrYandex, 0.0f, f2, 5);
                }
                c9902l3.firebase(fArrYandex);
            }
            float f26 = z2 ? (this.vip * f5) + fMin : fMin;
            float f27 = f23 + f26;
            if (f14 > f27) {
                c9902l2.purchase(Math.max(this.vip, f27), fIntBitsToFloat4);
            }
            if (f18 > f17) {
                float fMax2 = Math.max(this.vip, f22 - f26);
                c9902l2.billing(fMax2, fIntBitsToFloat4);
                f14 = fMax2;
            }
            i4++;
            fIntBitsToFloat3 = f20;
            fMin = fMin;
        }
        float f28 = this.vip;
        if (f14 > f28) {
            c9902l2.purchase(f28, fIntBitsToFloat4);
        }
        AbstractC8669l.appmetrica(fArr, this.amazon, 14);
        this.loadAd = f2;
        this.billing = f3;
    }
}
