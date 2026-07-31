package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؗٙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4974l {
    public int loadAd;
    public float[] yandex;

    public C4974l(int i) {
        this.yandex = i == 0 ? AbstractC9508l.yandex : new float[i];
    }

    public static String crashlytics(C4974l c4974l, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        c4974l.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = c4974l.yandex;
        int i2 = c4974l.loadAd;
        for (int i3 = 0; i3 < i2; i3++) {
            float f = fArr[i3];
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(f);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4974l) {
            C4974l c4974l = (C4974l) obj;
            int i = c4974l.loadAd;
            int i2 = this.loadAd;
            if (i == i2) {
                float[] fArr = this.yandex;
                float[] fArr2 = c4974l.yandex;
                C8934l c8934lAdcel = AbstractC8576l.adcel(0, i2);
                int i3 = c8934lAdcel.f15488l;
                int i4 = c8934lAdcel.f15487l;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.yandex;
        int i = this.loadAd;
        int iFloatToIntBits = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i2]) * 31;
        }
        return iFloatToIntBits;
    }

    public final float loadAd(int i) {
        if (i >= 0 && i < this.loadAd) {
            return this.yandex[i];
        }
        AbstractC13082l.amazon("Index must be between 0 and size");
        throw null;
    }

    public final String toString() {
        return crashlytics(this, 25);
    }

    public final void yandex(float f) {
        int i = this.loadAd + 1;
        float[] fArr = this.yandex;
        if (fArr.length < i) {
            this.yandex = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.yandex;
        int i2 = this.loadAd;
        fArr2[i2] = f;
        this.loadAd = i2 + 1;
    }
}
