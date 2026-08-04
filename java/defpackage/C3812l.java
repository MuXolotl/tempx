package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؕۨٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3812l {
    public int admob;
    public long amazon;
    public long billing;
    public long crashlytics;
    public long loadAd;
    public final boolean[] mopub = new boolean[15];
    public long purchase;
    public long yandex;

    public final void crashlytics() {
        this.amazon = 0L;
        this.purchase = 0L;
        this.billing = 0L;
        this.admob = 0;
        Arrays.fill(this.mopub, false);
    }

    public final void loadAd(long j) {
        long j2 = this.amazon;
        if (j2 == 0) {
            this.yandex = j;
        } else if (j2 == 1) {
            long j3 = j - this.yandex;
            this.loadAd = j3;
            this.billing = j3;
            this.purchase = 1L;
        } else {
            long j4 = j - this.crashlytics;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.loadAd);
            boolean[] zArr = this.mopub;
            if (jAbs <= 1000000) {
                this.purchase++;
                this.billing += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.admob--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.admob++;
            }
        }
        this.amazon++;
        this.crashlytics = j;
    }

    public final boolean yandex() {
        return this.amazon > 15 && this.admob == 0;
    }
}
