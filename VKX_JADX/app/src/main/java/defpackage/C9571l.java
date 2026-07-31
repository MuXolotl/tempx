package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٍٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9571l {
    public int loadAd;
    public long[] yandex;

    public C9571l(int i) {
        this.yandex = i == 0 ? AbstractC13579l.yandex : new long[i];
    }

    public final long amazon(int i) {
        if (i >= 0 && i < this.loadAd) {
            return this.yandex[i];
        }
        AbstractC13082l.amazon("Index must be between 0 and size");
        throw null;
    }

    public final void billing(int i, long j) {
        if (i < 0 || i >= this.loadAd) {
            AbstractC13082l.amazon("Index must be between 0 and size");
            throw null;
        }
        long[] jArr = this.yandex;
        long j2 = jArr[i];
        jArr[i] = j;
    }

    public final void crashlytics(int i) {
        long[] jArr = this.yandex;
        if (jArr.length < i) {
            this.yandex = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9571l) {
            C9571l c9571l = (C9571l) obj;
            int i = c9571l.loadAd;
            int i2 = this.loadAd;
            if (i == i2) {
                long[] jArr = this.yandex;
                long[] jArr2 = c9571l.yandex;
                C8934l c8934lAdcel = AbstractC8576l.adcel(0, i2);
                int i3 = c8934lAdcel.f15488l;
                int i4 = c8934lAdcel.f15487l;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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
        long[] jArr = this.yandex;
        int i = this.loadAd;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j = jArr[i3];
            i2 += ((int) (j ^ (j >>> 32))) * 31;
        }
        return i2;
    }

    public final void loadAd(int i, C9571l c9571l) {
        int i2;
        if (i < 0 || i > (i2 = this.loadAd)) {
            AbstractC13082l.amazon("");
            throw null;
        }
        int i3 = c9571l.loadAd;
        if (i3 == 0) {
            return;
        }
        crashlytics(i2 + i3);
        long[] jArr = this.yandex;
        int i4 = this.loadAd;
        if (i != i4) {
            AbstractC8669l.license(c9571l.loadAd + i, i, i4, jArr, jArr);
        }
        AbstractC8669l.license(i, 0, c9571l.loadAd, c9571l.yandex, jArr);
        this.loadAd += c9571l.loadAd;
    }

    public final void purchase(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.loadAd) || i2 < 0 || i2 > i3) {
            AbstractC13082l.amazon("Index must be between 0 and size");
            throw null;
        }
        if (i2 < i) {
            AbstractC13082l.crashlytics("The end index must be < start index");
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = this.yandex;
                AbstractC8669l.license(i, i2, i3, jArr, jArr);
            }
            this.loadAd -= i2 - i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.yandex;
        int i = this.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final void yandex(long j) {
        crashlytics(this.loadAd + 1);
        long[] jArr = this.yandex;
        int i = this.loadAd;
        jArr[i] = j;
        this.loadAd = i + 1;
    }

    public /* synthetic */ C9571l() {
        this(16);
    }
}
