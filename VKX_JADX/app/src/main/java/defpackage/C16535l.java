package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٖٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16535l {
    public int crashlytics;
    public int[] loadAd;
    public final /* synthetic */ int yandex;

    public C16535l(byte b, int i) {
        this.yandex = i;
        switch (i) {
            case 2:
                this.loadAd = new int[10];
                break;
            case 3:
                this.loadAd = new int[30];
                break;
        }
    }

    public static long loadAd(boolean z, int i, int i2, int i3, int i4) {
        int i5 = z ? i3 : i4;
        if (z) {
            i3 = i4;
        }
        if (i < i2) {
            return AbstractC2296l.loadAd(i, i);
        }
        if (i == i2) {
            return i5 == 0 ? AbstractC2296l.loadAd(i2, i3 + i2) : AbstractC2296l.loadAd(i2, i2);
        }
        if (i < i2 + i5) {
            return i3 == 0 ? AbstractC2296l.loadAd(i2, i2) : AbstractC2296l.loadAd(i2, i3 + i2);
        }
        int i6 = (i - i5) + i3;
        return AbstractC2296l.loadAd(i6, i6);
    }

    public void admob(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = true;
            if (((i >>> ((i2 - i3) - 1)) & 1) != 1) {
                z = false;
            }
            subs(z);
        }
    }

    public int amazon() {
        int[] iArr = this.loadAd;
        int i = this.crashlytics - 1;
        this.crashlytics = i;
        return iArr[i];
    }

    public void billing(int i, int i2, int i3) {
        int i4 = this.crashlytics;
        int[] iArrCopyOf = this.loadAd;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.loadAd = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.crashlytics = i5;
    }

    public int crashlytics(int i) {
        int i2 = this.crashlytics - 1;
        return i2 >= 0 ? this.loadAd[i2] : i;
    }

    public void firebase(int i, int i2, int i3) {
        if (i3 < 0) {
            AbstractC14825l.yandex("Expected newLen to be ≥ 0, was " + i3);
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(iMin, i2) - iMin;
        if (iMax >= 2 || iMax != i3) {
            int i4 = this.crashlytics + 1;
            int[] iArr = this.loadAd;
            if (i4 > iArr.length / 3) {
                this.loadAd = Arrays.copyOf(this.loadAd, Math.max(i4 * 2, (iArr.length / 3) * 2) * 3);
            }
            int[] iArr2 = this.loadAd;
            int i5 = this.crashlytics * 3;
            iArr2[i5] = iMin;
            iArr2[i5 + 1] = iMax;
            iArr2[i5 + 2] = i3;
            this.crashlytics = i4;
        }
    }

    public void isPro(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.loadAd;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    smaato(i3, i4);
                }
            }
            smaato(i3 + 3, i2);
            isPro(i, i3);
            isPro(i3 + 6, i2);
        }
    }

    public void mopub(int i, int i2, int i3, int i4) {
        int i5 = this.crashlytics;
        int[] iArrCopyOf = this.loadAd;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.loadAd = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.crashlytics = i6;
    }

    public void purchase(int i) {
        int[] iArrCopyOf = this.loadAd;
        if (this.crashlytics >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.loadAd = iArrCopyOf;
        }
        int i2 = this.crashlytics;
        this.crashlytics = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    public void smaato(int i, int i2) {
        int[] iArr = this.loadAd;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void subs(boolean z) {
        int i = this.crashlytics;
        int[] iArr = this.loadAd;
        if (i == iArr.length * 8) {
            this.loadAd = Arrays.copyOf(iArr, iArr.length + 32);
        }
        if (z) {
            int[] iArr2 = this.loadAd;
            int i2 = this.crashlytics;
            int i3 = i2 / 8;
            iArr2[i3] = (128 >>> (i2 % 8)) | iArr2[i3];
        }
        this.crashlytics++;
    }

    public String toString() {
        switch (this.yandex) {
            case 0:
                StringBuilder sb = new StringBuilder();
                int i = this.crashlytics;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(((this.loadAd[i2 / 8] >>> (7 - (i2 % 8))) & 1) == 1 ? '1' : '0');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public long yandex(int i, boolean z) {
        int iMax;
        int[] iArr = this.loadAd;
        int i2 = this.crashlytics;
        if (i2 < 0) {
            iMax = i;
        } else if (z) {
            iMax = i;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                long jLoadAd = loadAd(z, i, i5, i6, i7);
                long jLoadAd2 = loadAd(z, iMax, i5, i6, i7);
                int i8 = C12814l.crashlytics;
                i = Math.min((int) (jLoadAd >> 32), (int) (jLoadAd2 >> 32));
                iMax = Math.max((int) (jLoadAd & 4294967295L), (int) (jLoadAd2 & 4294967295L));
            }
        } else {
            iMax = i;
            for (int i9 = i2 - 1; -1 < i9; i9--) {
                int i10 = i9 * 3;
                int i11 = iArr[i10];
                int i12 = iArr[i10 + 1];
                int i13 = iArr[i10 + 2];
                long jLoadAd3 = loadAd(z, i, i11, i12, i13);
                long jLoadAd4 = loadAd(z, iMax, i11, i12, i13);
                int i14 = C12814l.crashlytics;
                i = Math.min((int) (jLoadAd3 >> 32), (int) (jLoadAd4 >> 32));
                iMax = Math.max((int) (jLoadAd3 & 4294967295L), (int) (jLoadAd4 & 4294967295L));
            }
        }
        return AbstractC2296l.loadAd(i, iMax);
    }

    public C16535l(int i) {
        this.yandex = 1;
        this.loadAd = new int[i];
    }
}
