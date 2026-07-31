package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٓۗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14360l {
    public final int[] loadAd;
    public final float[] yandex;

    public C14360l(float[] fArr, int[] iArr) {
        this.yandex = fArr;
        this.loadAd = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14360l.class != obj.getClass()) {
            return false;
        }
        C14360l c14360l = (C14360l) obj;
        return Arrays.equals(this.yandex, c14360l.yandex) && Arrays.equals(this.loadAd, c14360l.loadAd);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.loadAd) + (Arrays.hashCode(this.yandex) * 31);
    }

    public final C14360l loadAd(float[] fArr) {
        int iSubs;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.yandex;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.loadAd;
            if (iBinarySearch >= 0) {
                iSubs = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iSubs = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iSubs = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iSubs = AbstractC17307l.subs(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = iSubs;
        }
        return new C14360l(fArr, iArr);
    }

    public final void yandex(C14360l c14360l) {
        int i = 0;
        while (true) {
            int[] iArr = c14360l.loadAd;
            if (i >= iArr.length) {
                return;
            }
            this.yandex[i] = c14360l.yandex[i];
            this.loadAd[i] = iArr[i];
            i++;
        }
    }
}
