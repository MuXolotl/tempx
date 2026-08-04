package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٖۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16761l {
    public int loadAd;
    public int[] yandex;

    public C16761l(int i) {
        this.yandex = i == 0 ? AbstractC12047l.yandex : new int[i];
    }

    public final int amazon() {
        int i = this.loadAd;
        if (i != 0) {
            return this.yandex[i - 1];
        }
        AbstractC13082l.purchase("IntList is empty.");
        throw null;
    }

    public final void billing(int i, int i2) {
        if (i < 0 || i >= this.loadAd) {
            AbstractC13082l.amazon("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.yandex;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int crashlytics(int i) {
        if (i >= 0 && i < this.loadAd) {
            return this.yandex[i];
        }
        AbstractC13082l.amazon("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16761l) {
            C16761l c16761l = (C16761l) obj;
            int i = c16761l.loadAd;
            int i2 = this.loadAd;
            if (i == i2) {
                int[] iArr = this.yandex;
                int[] iArr2 = c16761l.yandex;
                C8934l c8934lAdcel = AbstractC8576l.adcel(0, i2);
                int i3 = c8934lAdcel.f15488l;
                int i4 = c8934lAdcel.f15487l;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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
        int[] iArr = this.yandex;
        int i = this.loadAd;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final void loadAd(int i) {
        int[] iArr = this.yandex;
        if (iArr.length < i) {
            this.yandex = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void purchase(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.loadAd)) {
            AbstractC13082l.amazon("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.yandex;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC8669l.ad(i, i + 1, iArr, iArr, i2);
        }
        this.loadAd--;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.yandex;
        int i = this.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final void yandex(int i) {
        loadAd(this.loadAd + 1);
        int[] iArr = this.yandex;
        int i2 = this.loadAd;
        iArr[i2] = i;
        this.loadAd = i2 + 1;
    }

    public /* synthetic */ C16761l() {
        this(16);
    }
}
