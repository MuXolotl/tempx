package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18416l {
    public final int crashlytics;
    public final float[] loadAd;
    public final List yandex;

    public C18416l(List list, float[] fArr) {
        this.yandex = list;
        this.loadAd = fArr;
        if (list.size() != fArr.length) {
            AbstractC14825l.yandex("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + AbstractC8669l.m2410new(fArr));
        }
        this.crashlytics = fArr.length;
    }

    public final float amazon() {
        float[] fArr = this.loadAd;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    public final float billing(Object obj) {
        int iIndexOf = this.yandex.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.loadAd;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    public final boolean crashlytics(Object obj) {
        return this.yandex.indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18416l)) {
            return false;
        }
        C18416l c18416l = (C18416l) obj;
        return AbstractC8576l.yandex(this.yandex, c18416l.yandex) && Arrays.equals(this.loadAd, c18416l.loadAd) && this.crashlytics == c18416l.crashlytics;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.loadAd) + (this.yandex.hashCode() * 31)) * 31) + this.crashlytics;
    }

    public final Object loadAd(float f, boolean z) {
        float[] fArr = this.loadAd;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.yandex.get(i2);
    }

    public final float purchase() {
        float[] fArr = this.loadAd;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.crashlytics;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            Object objM4220for = AbstractC16901l.m4220for(i, this.yandex);
            if (i >= 0) {
                float[] fArr = this.loadAd;
                if (i < fArr.length) {
                    f = fArr[i];
                } else {
                    f = Float.NaN;
                }
            } else {
                f = Float.NaN;
            }
            sb.append(objM4220for + "=" + f);
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public final Object yandex(float f) {
        float[] fArr = this.loadAd;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.yandex.get(i2);
    }
}
