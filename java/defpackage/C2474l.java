package defpackage;

/* JADX INFO: renamed from: lؚؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2474l extends AbstractC11833l {
    public final /* synthetic */ int amazon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2474l(int i, int i2, long j, String str) {
        super(j, i, str);
        this.amazon = i2;
    }

    @Override // defpackage.AbstractC11833l
    public final long amazon(float f, float f2, float f3) {
        long jFloatToRawIntBits;
        long j;
        switch (this.amazon) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f4 = (f + 16.0f) / 116.0f;
                float f5 = (f2 * 0.002f) + f4;
                float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
                float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
                float[] fArr = AbstractC2238l.purchase;
                float f8 = f6 * fArr[0];
                float f9 = f7 * fArr[1];
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                jFloatToRawIntBits = Float.floatToRawIntBits(f9);
                j = jFloatToRawIntBits2 << 32;
                break;
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                float f10 = f2 <= 2.0f ? f2 : 2.0f;
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(f);
                jFloatToRawIntBits = Float.floatToRawIntBits(f10);
                j = jFloatToRawIntBits3 << 32;
                break;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    @Override // defpackage.AbstractC11833l
    public final long billing(float f, float f2, float f3, float f4, AbstractC11833l abstractC11833l) {
        switch (this.amazon) {
            case 0:
                float[] fArr = AbstractC2238l.purchase;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float fCbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
                float f8 = (116.0f * fCbrt2) - 16.0f;
                float f9 = (fCbrt - fCbrt2) * 500.0f;
                float f10 = (fCbrt2 - fCbrt3) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                return AbstractC12953l.yandex(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, abstractC11833l);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                return AbstractC12953l.yandex(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, abstractC11833l);
        }
    }

    @Override // defpackage.AbstractC11833l
    public final float loadAd(int i) {
        switch (this.amazon) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // defpackage.AbstractC11833l
    public final float purchase(float f, float f2, float f3) {
        switch (this.amazon) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * AbstractC2238l.purchase[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // defpackage.AbstractC11833l
    public final float yandex(int i) {
        switch (this.amazon) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }
}
