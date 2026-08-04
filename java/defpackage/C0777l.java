package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؒؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0777l extends AbstractC11833l {
    public static final C11983l ads = new C11983l();
    public final boolean adcel;
    public final float[] admob;
    public final C18558l amazon;
    public final float billing;
    public final InterfaceC9052l firebase;
    public final float[] isPro;
    public final C7982l metrica;
    public final C0411l mopub;
    public final float purchase;
    public final C8646l remoteconfig;
    public final C7982l smaato;
    public final C8646l startapp;
    public final float[] subs;
    public final InterfaceC9052l vip;

    /* JADX WARN: Code duplicated, block: B:42:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0211  */
    /* JADX WARN: Code duplicated, block: B:56:0x021a  */
    /* JADX WARN: Code duplicated, block: B:63:0x022e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0246  */
    /* JADX WARN: Code duplicated, block: B:68:0x0260  */
    /* JADX WARN: Code duplicated, block: B:77:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0263 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public C0777l(String str, float[] fArr, C18558l c18558l, float[] fArr2, InterfaceC9052l interfaceC9052l, InterfaceC9052l interfaceC9052l2, float f, float f2, C0411l c0411l, int i) {
        char c;
        float f3;
        float f4;
        boolean z;
        float[] fArr3;
        C0777l c0777l;
        double d;
        int i2;
        super(12884901888L, i, str);
        this.amazon = c18558l;
        this.purchase = f;
        this.billing = f2;
        this.mopub = c0411l;
        this.firebase = interfaceC9052l;
        int i3 = 1;
        this.smaato = new C7982l(this, i3);
        int i4 = 0;
        this.remoteconfig = new C8646l(this, i4);
        this.vip = interfaceC9052l2;
        this.metrica = new C7982l(this, i4);
        this.startapp = new C8646l(this, i3);
        if (fArr.length != 6 && fArr.length != 9) {
            C8339l.metrica("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            C11983l.vip("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            AbstractC8669l.appmetrica(fArr, fArr4, 6);
        }
        this.admob = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = c18558l.yandex;
            c = 1;
            float f21 = c18558l.loadAd;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.subs = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                C8339l.metrica(AbstractC0653l.vip(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.subs = fArr2;
        }
        this.isPro = AbstractC0136l.mopub(this.subs);
        float fPurchase = AbstractC15576l.purchase(fArr4);
        float[] fArr5 = C3955l.yandex;
        if (fPurchase / AbstractC15576l.purchase(C3955l.loadAd) > 0.9f) {
            float[] fArr6 = C3955l.yandex;
            float f38 = fArr4[0];
            float f39 = fArr6[0];
            float f40 = fArr4[c];
            float f41 = fArr6[c];
            float f42 = fArr4[2];
            float f43 = fArr6[2];
            float f44 = fArr4[3];
            float f45 = fArr6[3];
            float f46 = fArr4[4];
            float f47 = fArr6[4];
            float f48 = fArr4[5];
            float f49 = fArr6[5];
            f4 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[0] = f38 - f39;
            fArr7[c] = f40 - f41;
            fArr7[2] = f42 - f43;
            fArr7[3] = f44 - f45;
            fArr7[4] = f46 - f47;
            fArr7[5] = f48 - f49;
            float f50 = fArr7[0];
            float f51 = fArr7[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr7[2];
                float f53 = fArr7[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr7[4];
                    float f55 = fArr7[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr3 = C3955l.yandex;
                if (fArr4 == fArr3) {
                    i2 = 0;
                    while (true) {
                        if (i2 < 6) {
                            if (Float.compare(fArr4[i2], fArr3[i2]) != 0 || Math.abs(fArr4[i2] - fArr3[i2]) <= 0.001f) {
                                i2++;
                            }
                        } else if (AbstractC0136l.purchase(c18558l, AbstractC2238l.amazon)) {
                            float[] fArr8 = C3955l.yandex;
                            c0777l = C3955l.purchase;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c;
                                } else if (Math.abs(interfaceC9052l.amazon(d) - c0777l.firebase.amazon(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (AbstractC0136l.purchase(c18558l, AbstractC2238l.amazon) && f == f4 && f2 == f3) {
                    float[] fArr9 = C3955l.yandex;
                    c0777l = C3955l.purchase;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c;
                        } else if (Math.abs(interfaceC9052l.amazon(d) - c0777l.firebase.amazon(d)) > 0.001d && Math.abs(interfaceC9052l2.amazon(d) - c0777l.vip.amazon(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = 0;
            } else {
                z = c;
            }
            this.adcel = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr3 = C3955l.yandex;
            if (fArr4 == fArr3) {
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr4[i2], fArr3[i2]) != 0) {
                        }
                        i2++;
                    } else if (AbstractC0136l.purchase(c18558l, AbstractC2238l.amazon)) {
                        float[] fArr10 = C3955l.yandex;
                        c0777l = C3955l.purchase;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = c;
                            } else if (Math.abs(interfaceC9052l.amazon(d) - c0777l.firebase.amazon(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (AbstractC0136l.purchase(c18558l, AbstractC2238l.amazon)) {
                float[] fArr11 = C3955l.yandex;
                c0777l = C3955l.purchase;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = c;
                    } else if (Math.abs(interfaceC9052l.amazon(d) - c0777l.firebase.amazon(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = 0;
        } else {
            z = c;
        }
        this.adcel = z;
    }

    @Override // defpackage.AbstractC11833l
    public final long amazon(float f, float f2, float f3) {
        double d = f;
        C8646l c8646l = this.startapp;
        float fAmazon = (float) c8646l.amazon(d);
        float fAmazon2 = (float) c8646l.amazon(f2);
        float fAmazon3 = (float) c8646l.amazon(f3);
        float[] fArr = this.subs;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fAmazon3) + ((fArr[3] * fAmazon2) + (fArr[0] * fAmazon)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fAmazon3) + (fArr[4] * fAmazon2) + (fArr[1] * fAmazon))));
    }

    @Override // defpackage.AbstractC11833l
    public final long billing(float f, float f2, float f3, float f4, AbstractC11833l abstractC11833l) {
        float[] fArr = this.isPro;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        C8646l c8646l = this.remoteconfig;
        return AbstractC12953l.yandex((float) c8646l.amazon(f5), (float) c8646l.amazon(f6), (float) c8646l.amazon(f7), f4, abstractC11833l);
    }

    @Override // defpackage.AbstractC11833l
    public final boolean crashlytics() {
        return this.adcel;
    }

    @Override // defpackage.AbstractC11833l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0777l.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0777l c0777l = (C0777l) obj;
        if (Float.compare(c0777l.purchase, this.purchase) != 0 || Float.compare(c0777l.billing, this.billing) != 0 || !AbstractC8576l.yandex(this.amazon, c0777l.amazon) || !Arrays.equals(this.admob, c0777l.admob)) {
            return false;
        }
        C0411l c0411l = c0777l.mopub;
        C0411l c0411l2 = this.mopub;
        if (c0411l2 != null) {
            return AbstractC8576l.yandex(c0411l2, c0411l);
        }
        if (c0411l == null) {
            return true;
        }
        if (AbstractC8576l.yandex(this.firebase, c0777l.firebase)) {
            return AbstractC8576l.yandex(this.vip, c0777l.vip);
        }
        return false;
    }

    @Override // defpackage.AbstractC11833l
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.admob) + ((this.amazon.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.purchase;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.billing;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        C0411l c0411l = this.mopub;
        int iHashCode2 = iFloatToIntBits2 + (c0411l != null ? c0411l.hashCode() : 0);
        if (c0411l != null) {
            return iHashCode2;
        }
        return this.vip.hashCode() + ((this.firebase.hashCode() + (iHashCode2 * 31)) * 31);
    }

    @Override // defpackage.AbstractC11833l
    public final float loadAd(int i) {
        return this.purchase;
    }

    @Override // defpackage.AbstractC11833l
    public final float purchase(float f, float f2, float f3) {
        double d = f;
        C8646l c8646l = this.startapp;
        float fAmazon = (float) c8646l.amazon(d);
        float fAmazon2 = (float) c8646l.amazon(f2);
        float fAmazon3 = (float) c8646l.amazon(f3);
        float[] fArr = this.subs;
        return (fArr[8] * fAmazon3) + (fArr[5] * fAmazon2) + (fArr[2] * fAmazon);
    }

    @Override // defpackage.AbstractC11833l
    public final float yandex(int i) {
        return this.billing;
    }

    public C0777l(String str, float[] fArr, C18558l c18558l, final C0411l c0411l, int i) {
        double d;
        InterfaceC9052l interfaceC9052l;
        InterfaceC9052l interfaceC9052l2;
        double d2 = c0411l.yandex;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = c0411l.mopub;
        double d4 = c0411l.billing;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            interfaceC9052l = new InterfaceC9052l() { // from class: lََ٘
                @Override // defpackage.InterfaceC9052l
                public final double amazon(double d5) {
                    int i5 = i4;
                    C0411l c0411l2 = c0411l;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = C3955l.yandex;
                            return C3955l.yandex(c0411l2, d5);
                        case 1:
                            float[] fArr3 = C3955l.yandex;
                            return C3955l.crashlytics(c0411l2, d5);
                        case 2:
                            double d6 = c0411l2.loadAd;
                            return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                        case 3:
                            double d7 = c0411l2.loadAd;
                            double d8 = c0411l2.crashlytics;
                            double d9 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                        case 4:
                            float[] fArr4 = C3955l.yandex;
                            return C3955l.loadAd(c0411l2, d5);
                        case 5:
                            float[] fArr5 = C3955l.yandex;
                            return C3955l.amazon(c0411l2, d5);
                        case 6:
                            double d10 = c0411l2.loadAd;
                            double d11 = c0411l2.crashlytics;
                            double d12 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c0411l2.loadAd;
                            double d14 = c0411l2.crashlytics;
                            double d15 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                interfaceC9052l = new InterfaceC9052l() { // from class: lََ٘
                    @Override // defpackage.InterfaceC9052l
                    public final double amazon(double d5) {
                        int i6 = i5;
                        C0411l c0411l2 = c0411l;
                        switch (i6) {
                            case 0:
                                float[] fArr2 = C3955l.yandex;
                                return C3955l.yandex(c0411l2, d5);
                            case 1:
                                float[] fArr3 = C3955l.yandex;
                                return C3955l.crashlytics(c0411l2, d5);
                            case 2:
                                double d6 = c0411l2.loadAd;
                                return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                            case 3:
                                double d7 = c0411l2.loadAd;
                                double d8 = c0411l2.crashlytics;
                                double d9 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                            case 4:
                                float[] fArr4 = C3955l.yandex;
                                return C3955l.loadAd(c0411l2, d5);
                            case 5:
                                float[] fArr5 = C3955l.yandex;
                                return C3955l.amazon(c0411l2, d5);
                            case 6:
                                double d10 = c0411l2.loadAd;
                                double d11 = c0411l2.crashlytics;
                                double d12 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c0411l2.loadAd;
                                double d14 = c0411l2.crashlytics;
                                double d15 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                interfaceC9052l = new InterfaceC9052l() { // from class: lََ٘
                    @Override // defpackage.InterfaceC9052l
                    public final double amazon(double d5) {
                        int i7 = i6;
                        C0411l c0411l2 = c0411l;
                        switch (i7) {
                            case 0:
                                float[] fArr2 = C3955l.yandex;
                                return C3955l.yandex(c0411l2, d5);
                            case 1:
                                float[] fArr3 = C3955l.yandex;
                                return C3955l.crashlytics(c0411l2, d5);
                            case 2:
                                double d6 = c0411l2.loadAd;
                                return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                            case 3:
                                double d7 = c0411l2.loadAd;
                                double d8 = c0411l2.crashlytics;
                                double d9 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                            case 4:
                                float[] fArr4 = C3955l.yandex;
                                return C3955l.loadAd(c0411l2, d5);
                            case 5:
                                float[] fArr5 = C3955l.yandex;
                                return C3955l.amazon(c0411l2, d5);
                            case 6:
                                double d10 = c0411l2.loadAd;
                                double d11 = c0411l2.crashlytics;
                                double d12 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c0411l2.loadAd;
                                double d14 = c0411l2.crashlytics;
                                double d15 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                interfaceC9052l = new InterfaceC9052l() { // from class: lََ٘
                    @Override // defpackage.InterfaceC9052l
                    public final double amazon(double d5) {
                        int i8 = i7;
                        C0411l c0411l2 = c0411l;
                        switch (i8) {
                            case 0:
                                float[] fArr2 = C3955l.yandex;
                                return C3955l.yandex(c0411l2, d5);
                            case 1:
                                float[] fArr3 = C3955l.yandex;
                                return C3955l.crashlytics(c0411l2, d5);
                            case 2:
                                double d6 = c0411l2.loadAd;
                                return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                            case 3:
                                double d7 = c0411l2.loadAd;
                                double d8 = c0411l2.crashlytics;
                                double d9 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                            case 4:
                                float[] fArr4 = C3955l.yandex;
                                return C3955l.loadAd(c0411l2, d5);
                            case 5:
                                float[] fArr5 = C3955l.yandex;
                                return C3955l.amazon(c0411l2, d5);
                            case 6:
                                double d10 = c0411l2.loadAd;
                                double d11 = c0411l2.crashlytics;
                                double d12 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c0411l2.loadAd;
                                double d14 = c0411l2.crashlytics;
                                double d15 = c0411l2.amazon;
                                return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            interfaceC9052l2 = new InterfaceC9052l() { // from class: lََ٘
                @Override // defpackage.InterfaceC9052l
                public final double amazon(double d5) {
                    int i8 = i2;
                    C0411l c0411l2 = c0411l;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = C3955l.yandex;
                            return C3955l.yandex(c0411l2, d5);
                        case 1:
                            float[] fArr3 = C3955l.yandex;
                            return C3955l.crashlytics(c0411l2, d5);
                        case 2:
                            double d6 = c0411l2.loadAd;
                            return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                        case 3:
                            double d7 = c0411l2.loadAd;
                            double d8 = c0411l2.crashlytics;
                            double d9 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                        case 4:
                            float[] fArr4 = C3955l.yandex;
                            return C3955l.loadAd(c0411l2, d5);
                        case 5:
                            float[] fArr5 = C3955l.yandex;
                            return C3955l.amazon(c0411l2, d5);
                        case 6:
                            double d10 = c0411l2.loadAd;
                            double d11 = c0411l2.crashlytics;
                            double d12 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c0411l2.loadAd;
                            double d14 = c0411l2.crashlytics;
                            double d15 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            interfaceC9052l2 = new InterfaceC9052l() { // from class: lََ٘
                @Override // defpackage.InterfaceC9052l
                public final double amazon(double d5) {
                    int i8 = i3;
                    C0411l c0411l2 = c0411l;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = C3955l.yandex;
                            return C3955l.yandex(c0411l2, d5);
                        case 1:
                            float[] fArr3 = C3955l.yandex;
                            return C3955l.crashlytics(c0411l2, d5);
                        case 2:
                            double d6 = c0411l2.loadAd;
                            return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                        case 3:
                            double d7 = c0411l2.loadAd;
                            double d8 = c0411l2.crashlytics;
                            double d9 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                        case 4:
                            float[] fArr4 = C3955l.yandex;
                            return C3955l.loadAd(c0411l2, d5);
                        case 5:
                            float[] fArr5 = C3955l.yandex;
                            return C3955l.amazon(c0411l2, d5);
                        case 6:
                            double d10 = c0411l2.loadAd;
                            double d11 = c0411l2.crashlytics;
                            double d12 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c0411l2.loadAd;
                            double d14 = c0411l2.crashlytics;
                            double d15 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            interfaceC9052l2 = new InterfaceC9052l() { // from class: lََ٘
                @Override // defpackage.InterfaceC9052l
                public final double amazon(double d5) {
                    int i9 = i8;
                    C0411l c0411l2 = c0411l;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = C3955l.yandex;
                            return C3955l.yandex(c0411l2, d5);
                        case 1:
                            float[] fArr3 = C3955l.yandex;
                            return C3955l.crashlytics(c0411l2, d5);
                        case 2:
                            double d6 = c0411l2.loadAd;
                            return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                        case 3:
                            double d7 = c0411l2.loadAd;
                            double d8 = c0411l2.crashlytics;
                            double d9 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                        case 4:
                            float[] fArr4 = C3955l.yandex;
                            return C3955l.loadAd(c0411l2, d5);
                        case 5:
                            float[] fArr5 = C3955l.yandex;
                            return C3955l.amazon(c0411l2, d5);
                        case 6:
                            double d10 = c0411l2.loadAd;
                            double d11 = c0411l2.crashlytics;
                            double d12 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c0411l2.loadAd;
                            double d14 = c0411l2.crashlytics;
                            double d15 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            interfaceC9052l2 = new InterfaceC9052l() { // from class: lََ٘
                @Override // defpackage.InterfaceC9052l
                public final double amazon(double d5) {
                    int i10 = i9;
                    C0411l c0411l2 = c0411l;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = C3955l.yandex;
                            return C3955l.yandex(c0411l2, d5);
                        case 1:
                            float[] fArr3 = C3955l.yandex;
                            return C3955l.crashlytics(c0411l2, d5);
                        case 2:
                            double d6 = c0411l2.loadAd;
                            return d5 >= c0411l2.purchase ? Math.pow((d6 * d5) + c0411l2.crashlytics, c0411l2.yandex) : c0411l2.amazon * d5;
                        case 3:
                            double d7 = c0411l2.loadAd;
                            double d8 = c0411l2.crashlytics;
                            double d9 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase ? Math.pow((d7 * d5) + d8, c0411l2.yandex) + c0411l2.billing : (d9 * d5) + c0411l2.mopub;
                        case 4:
                            float[] fArr4 = C3955l.yandex;
                            return C3955l.loadAd(c0411l2, d5);
                        case 5:
                            float[] fArr5 = C3955l.yandex;
                            return C3955l.amazon(c0411l2, d5);
                        case 6:
                            double d10 = c0411l2.loadAd;
                            double d11 = c0411l2.crashlytics;
                            double d12 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d12 ? (Math.pow(d5, 1.0d / c0411l2.yandex) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c0411l2.loadAd;
                            double d14 = c0411l2.crashlytics;
                            double d15 = c0411l2.amazon;
                            return d5 >= c0411l2.purchase * d15 ? (Math.pow(d5 - c0411l2.billing, 1.0d / c0411l2.yandex) - d14) / d13 : (d5 - c0411l2.mopub) / d15;
                    }
                }
            };
        }
        this(str, fArr, c18558l, null, interfaceC9052l, interfaceC9052l2, 0.0f, 1.0f, c0411l, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0777l(String str, float[] fArr, C18558l c18558l, final double d, float f, float f2, int i) {
        InterfaceC9052l interfaceC9052l;
        InterfaceC9052l interfaceC9052l2 = ads;
        if (d == 1.0d) {
            interfaceC9052l = interfaceC9052l2;
        } else {
            final int i2 = 0;
            interfaceC9052l = new InterfaceC9052l() { // from class: lؘُؚ
                @Override // defpackage.InterfaceC9052l
                public final double amazon(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            interfaceC9052l2 = new InterfaceC9052l() { // from class: lؘُؚ
                @Override // defpackage.InterfaceC9052l
                public final double amazon(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        InterfaceC9052l interfaceC9052l3 = interfaceC9052l2;
        this(str, fArr, c18558l, null, interfaceC9052l, interfaceC9052l3, f, f2, new C0411l(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
