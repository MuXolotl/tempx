package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0425l {
    public final float adcel;
    public float admob;
    public final float ads;
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final float firebase;
    public final float[] isPro;
    public final float loadAd;
    public final float metrica;
    public final float mopub;
    public final float purchase;
    public final float remoteconfig;
    public final float smaato;
    public final boolean startapp;
    public float subs;
    public final float vip;
    public final float yandex;

    public C0425l(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        this.purchase = f5;
        this.billing = f6;
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f11 = z2 ? -1.0f : 1.0f;
        this.remoteconfig = f11;
        float f12 = 1.0f / (f2 - f);
        this.firebase = f12;
        float[] fArr = new float[EnergyProfile.EVCONNECTOR_TYPE_OTHER];
        this.isPro = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.mopub = fHypot;
            this.smaato = fHypot * f12;
            this.adcel = f8 * f12;
            this.ads = f9 * f12;
            this.vip = Float.NaN;
            this.metrica = Float.NaN;
            z = true;
        } else {
            this.vip = f8 * f11;
            this.metrica = f9 * (-f11);
            this.adcel = z2 ? f5 : f3;
            this.ads = z2 ? f4 : f6;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float[] fArr2 = AbstractC1068l.yandex;
            float f15 = f14;
            float fHypot2 = 0.0f;
            float f16 = 0.0f;
            int i4 = 1;
            while (true) {
                double d = (float) (((((double) i4) * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float fSin = ((float) Math.sin(d)) * f13;
                float fCos = ((float) Math.cos(d)) * f14;
                f7 = f10;
                fHypot2 += (float) Math.hypot(fSin - f16, fCos - f15);
                fArr2[i4] = fHypot2;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f16 = fSin;
                f15 = fCos;
                i3 = i2;
                f10 = f7;
            }
            this.mopub = fHypot2;
            int i5 = i2;
            while (true) {
                fArr2[i5] = fArr2[i5] / fHypot2;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            int length = fArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f17 = i6 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f17);
                if (iBinarySearch >= 0) {
                    fArr[i6] = iBinarySearch / 90.0f;
                } else if (iBinarySearch == -1) {
                    fArr[i6] = f7;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    float f18 = i8;
                    float f19 = fArr2[i8];
                    fArr[i6] = (((f17 - f19) / (fArr2[i7 - i2] - f19)) + f18) / 90.0f;
                }
            }
            this.smaato = this.mopub * this.firebase;
            z = z3;
        }
        this.startapp = z;
    }

    public final void crashlytics(float f) {
        float f2 = (this.remoteconfig == -1.0f ? this.loadAd - f : f - this.yandex) * this.firebase;
        float fSignature = 0.0f;
        if (f2 > 0.0f) {
            fSignature = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100.0f;
                int i = (int) f3;
                float[] fArr = this.isPro;
                float f4 = fArr[i];
                fSignature = AbstractC4338l.Signature(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fSignature * 1.5707964f;
        this.admob = (float) Math.sin(d);
        this.subs = (float) Math.cos(d);
    }

    public final float loadAd() {
        float f = this.vip * this.subs;
        float f2 = (-this.metrica) * this.admob;
        return f2 * this.remoteconfig * (this.smaato / ((float) Math.hypot(f, f2)));
    }

    public final float yandex() {
        float f = this.vip * this.subs;
        return f * this.remoteconfig * (this.smaato / ((float) Math.hypot(f, (-this.metrica) * this.admob)));
    }
}
