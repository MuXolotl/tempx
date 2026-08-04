package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lِِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11595l {
    public final long amazon;
    public final float[] billing;
    public final long crashlytics;
    public final long loadAd;
    public final AbstractC14971l mopub;
    public final long purchase;
    public final long yandex;

    public C11595l(long j, long j2, long j3, long j4, long j5, float[] fArr, AbstractC14971l abstractC14971l) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = fArr;
        this.mopub = abstractC14971l;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C11595l.class == obj.getClass()) {
                C11595l c11595l = (C11595l) obj;
                if (this.yandex == c11595l.yandex && this.loadAd == c11595l.loadAd && this.purchase == c11595l.purchase && C5177l.loadAd(this.crashlytics, c11595l.crashlytics) && C5177l.loadAd(this.amazon, c11595l.amazon)) {
                    float[] fArr = c11595l.billing;
                    float[] fArr2 = this.billing;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.mopub.equals(c11595l.mopub)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.purchase;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.crashlytics;
        int i3 = (((int) (j4 ^ (j4 >>> 32))) + i2) * 31;
        long j5 = this.amazon;
        int i4 = (((int) (j5 ^ (j5 >>> 32))) + i3) * 31;
        float[] fArr = this.billing;
        return this.mopub.hashCode() + ((i4 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
