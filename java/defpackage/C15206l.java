package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٔ۟ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15206l {
    public long[] crashlytics;
    public int loadAd;
    public final /* synthetic */ int yandex = 1;

    public C15206l(int i) {
        this.crashlytics = new long[i];
    }

    public long amazon(int i) {
        if (i >= 0 && i < this.loadAd) {
            return this.crashlytics[i];
        }
        C11983l.mopub(this.loadAd, AbstractC2812l.Signature("Invalid index ", i, ", size is "));
        return 0L;
    }

    public boolean crashlytics(long j) {
        int i = this.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.crashlytics[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void loadAd(long[] jArr) {
        int length = this.loadAd + jArr.length;
        long[] jArr2 = this.crashlytics;
        if (length > jArr2.length) {
            this.crashlytics = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.crashlytics, this.loadAd, jArr.length);
        this.loadAd = length;
    }

    public void purchase(long j) {
        int i = this.loadAd;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.crashlytics[i2]) {
                int i3 = this.loadAd - 1;
                while (i2 < i3) {
                    long[] jArr = this.crashlytics;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.loadAd--;
                return;
            }
            i2++;
        }
    }

    public final void yandex(long j) {
        switch (this.yandex) {
            case 0:
                int i = this.loadAd;
                long[] jArr = this.crashlytics;
                if (i == jArr.length) {
                    this.crashlytics = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.crashlytics;
                int i2 = this.loadAd;
                this.loadAd = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                if (!crashlytics(j)) {
                    int i3 = this.loadAd;
                    long[] jArrCopyOf = this.crashlytics;
                    if (i3 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i3 + 1, jArrCopyOf.length * 2));
                        this.crashlytics = jArrCopyOf;
                    }
                    jArrCopyOf[i3] = j;
                    if (i3 >= this.loadAd) {
                        this.loadAd = i3 + 1;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C15206l() {
    }
}
