package defpackage;

/* JADX INFO: renamed from: lْٛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13507l {
    public final float[] admob;
    public final C18703l[] amazon;
    public final float[] billing;
    public final int crashlytics;
    public final int loadAd;
    public final float[] mopub;
    public int purchase;
    public final boolean yandex;

    public C13507l(boolean z, int i) {
        int i2;
        this.yandex = z;
        this.loadAd = i;
        if (z && AbstractC5020l.firebase(i, 1)) {
            C8339l.smaato("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            i2 = 3;
        } else {
            if (iInmobi != 1) {
                C18725l.billing();
                throw null;
            }
            i2 = 2;
        }
        this.crashlytics = i2;
        this.amazon = new C18703l[20];
        this.billing = new float[20];
        this.mopub = new float[20];
        this.admob = new float[3];
    }

    public final float crashlytics(float f) {
        if (f <= 0.0f) {
            AbstractC0081l.crashlytics("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fLoadAd = loadAd();
        if (fLoadAd == 0.0f || Float.isNaN(fLoadAd)) {
            return 0.0f;
        }
        if (fLoadAd <= 0.0f) {
            float f2 = -f;
            if (fLoadAd < f2) {
                return f2;
            }
        } else if (fLoadAd > f) {
            return f;
        }
        return fLoadAd;
    }

    public final float loadAd() {
        boolean z;
        int i;
        float[] fArr;
        int i2;
        float[] fArr2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.purchase;
        C18703l[] c18703lArr = this.amazon;
        C18703l c18703l = c18703lArr[i3];
        if (c18703l == null) {
            return 0.0f;
        }
        int i4 = 0;
        C18703l c18703l2 = c18703l;
        do {
            C18703l c18703l3 = c18703lArr[i3];
            z = this.yandex;
            i = this.loadAd;
            float[] fArr3 = this.billing;
            fArr = this.mopub;
            if (c18703l3 == null) {
                i2 = i4;
                fArr2 = fArr3;
                f = 0.0f;
            } else {
                long j = c18703l.yandex;
                i2 = i4;
                f = 0.0f;
                long j2 = c18703l3.yandex;
                float f3 = j - j2;
                fArr2 = fArr3;
                float fAbs = Math.abs(j2 - c18703l2.yandex);
                c18703l2 = (i == 1 || z) ? c18703l3 : c18703l;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i2] = c18703l3.loadAd;
                    fArr[i2] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i2 + 1;
                }
            }
            i4 = i2;
            break;
        } while (i4 < 20);
        if (i4 < this.crashlytics) {
            return f;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            try {
                float[] fArr4 = this.admob;
                AbstractC16358l.purchase(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iInmobi != 1) {
                C18725l.billing();
                return f;
            }
            int i5 = i4 - 1;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final void yandex(float f, long j) {
        int i = (this.purchase + 1) % 20;
        this.purchase = i;
        C18703l[] c18703lArr = this.amazon;
        C18703l c18703l = c18703lArr[i];
        if (c18703l != null) {
            c18703l.yandex = j;
            c18703l.loadAd = f;
        } else {
            C18703l c18703l2 = new C18703l();
            c18703l2.yandex = j;
            c18703l2.loadAd = f;
            c18703lArr[i] = c18703l2;
        }
    }

    public /* synthetic */ C13507l() {
        this(false, 1);
    }
}
