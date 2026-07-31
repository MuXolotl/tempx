package defpackage;

/* JADX INFO: renamed from: lٕٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16891l extends AbstractC7532l {
    public final /* synthetic */ int Signature = 0;
    public final AbstractC7532l license;

    public C16891l(C16786l c16786l, byte b) {
        super(3, AbstractC18202l.yandex.loadAd(float[].class), c16786l.purchase, new float[0], 32);
        this.license = c16786l;
    }

    @Override // defpackage.AbstractC7532l
    public final void admob(C13161l c13161l, int i, Object obj) {
        switch (this.Signature) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null && dArr.length != 0) {
                    super.admob(c13161l, i, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                if (fArr != null && fArr.length != 0) {
                    super.admob(c13161l, i, fArr);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        switch (this.Signature) {
            case 0:
                double[] dArr = (double[]) obj;
                for (int length = dArr.length - 1; -1 < length; length--) {
                    c1080l.m798static(Double.doubleToLongBits(dArr[length]));
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                for (int length2 = fArr.length - 1; -1 < length2; length2--) {
                    c1080l.m795interface(Float.floatToIntBits(fArr[length2]));
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        switch (this.Signature) {
            case 0:
                return new double[]{Double.longBitsToDouble(c7084l.firebase())};
            default:
                return new float[]{Float.intBitsToFloat(c7084l.isPro())};
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int firebase(int i, Object obj) {
        switch (this.Signature) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.firebase(i, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.firebase(i, fArr);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        int i = this.Signature;
        AbstractC7532l abstractC7532l = this.license;
        int i2 = 0;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                int length = dArr.length;
                int i3 = 0;
                while (i2 < length) {
                    ((C16786l) abstractC7532l).isPro(Double.valueOf(dArr[i2]));
                    i3 += 8;
                    i2++;
                }
                return i3;
            default:
                float[] fArr = (float[]) obj;
                int length2 = fArr.length;
                int i4 = 0;
                while (i2 < length2) {
                    float f = fArr[i2];
                    ((C16786l) abstractC7532l).getClass();
                    i4 += 4;
                    i2++;
                }
                return i4;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object loadAd(C2881l c2881l) {
        switch (this.Signature) {
            case 0:
                return new double[]{Double.longBitsToDouble(c2881l.isPro())};
            default:
                return new float[]{Float.intBitsToFloat(c2881l.subs())};
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        int i = this.Signature;
        AbstractC7532l abstractC7532l = this.license;
        int i2 = 0;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                int length = dArr.length;
                while (i2 < length) {
                    ((C16786l) abstractC7532l).purchase(c13161l, Double.valueOf(dArr[i2]));
                    i2++;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                int length2 = fArr.length;
                while (i2 < length2) {
                    ((C16786l) abstractC7532l).purchase(c13161l, Float.valueOf(fArr[i2]));
                    i2++;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void subs(C1080l c1080l, int i, Object obj) {
        switch (this.Signature) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null && dArr.length != 0) {
                    super.subs(c1080l, i, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                if (fArr != null && fArr.length != 0) {
                    super.subs(c1080l, i, fArr);
                    break;
                }
                break;
        }
    }

    public C16891l(C16786l c16786l) {
        super(3, AbstractC18202l.yandex.loadAd(double[].class), c16786l.purchase, new double[0], 32);
        this.license = c16786l;
    }
}
