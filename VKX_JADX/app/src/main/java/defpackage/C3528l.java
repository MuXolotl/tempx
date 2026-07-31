package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕٞؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3528l {
    public transient int[] amazon;
    public transient float billing;
    public transient int crashlytics;
    public transient int[] loadAd;
    public transient int mopub;
    public transient long[] purchase;
    public transient Object[] yandex;

    public final void amazon(int i) {
        AbstractC12442l.subs(i >= 0, "Initial capacity must be non-negative");
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.amazon = iArr;
        this.billing = 1.0f;
        this.yandex = new Object[i];
        this.loadAd = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.purchase = jArr;
        this.mopub = Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    public final void billing(int i) {
        this.yandex = Arrays.copyOf(this.yandex, i);
        this.loadAd = Arrays.copyOf(this.loadAd, i);
        long[] jArr = this.purchase;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.purchase = jArrCopyOf;
    }

    public final int crashlytics(Object obj) {
        int iAmazon = AbstractC12027l.amazon(obj);
        int[] iArr = this.amazon;
        int i = iArr[(iArr.length - 1) & iAmazon];
        while (i != -1) {
            long j = this.purchase[i];
            if (((int) (j >>> 32)) == iAmazon && AbstractC7000l.loadAd(obj, this.yandex[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final int loadAd(Object obj) {
        int iCrashlytics = crashlytics(obj);
        if (iCrashlytics == -1) {
            return 0;
        }
        return this.loadAd[iCrashlytics];
    }

    public final void mopub(int i) {
        if (this.amazon.length >= 1073741824) {
            this.mopub = Alert.DURATION_SHOW_INDEFINITELY;
            return;
        }
        int i2 = ((int) (i * this.billing)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.purchase;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.crashlytics; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.mopub = i2;
        this.amazon = iArr;
    }

    public final void purchase(int i, Object obj) {
        long j;
        if (i <= 0) {
            C8339l.metrica(AbstractC0653l.vip(i, "count must be positive but was: "));
            return;
        }
        long[] jArr = this.purchase;
        Object[] objArr = this.yandex;
        int[] iArr = this.loadAd;
        int iAmazon = AbstractC12027l.amazon(obj);
        int[] iArr2 = this.amazon;
        int length = (iArr2.length - 1) & iAmazon;
        int i2 = this.crashlytics;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
            j = 4294967295L;
        } else {
            while (true) {
                long j2 = jArr[i3];
                j = 4294967295L;
                if (((int) (j2 >>> 32)) == iAmazon && AbstractC7000l.loadAd(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                } else {
                    int i5 = (int) j2;
                    if (i5 == -1) {
                        jArr[i3] = ((-4294967296L) & j2) | (((long) i2) & 4294967295L);
                        break;
                    }
                    i3 = i5;
                }
            }
        }
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i2 == Integer.MAX_VALUE) {
            C8339l.smaato("Cannot contain more than Integer.MAX_VALUE elements!");
            return;
        }
        int i7 = i2 + 1;
        int length2 = this.purchase.length;
        if (i7 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax >= 0) {
                i6 = iMax;
            }
            if (i6 != length2) {
                billing(i6);
            }
        }
        this.purchase[i2] = (((long) iAmazon) << 32) | j;
        this.yandex[i2] = obj;
        this.loadAd[i2] = i;
        this.crashlytics = i7;
        if (i2 >= this.mopub) {
            mopub(this.amazon.length * 2);
        }
    }

    public final void yandex(int i) {
        if (i > this.purchase.length) {
            billing(i);
        }
        if (i >= this.mopub) {
            mopub(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }
}
