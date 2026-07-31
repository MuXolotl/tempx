package defpackage;

/* JADX INFO: renamed from: lٍؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9267l {
    public final int[] admob;
    public final int[] amazon;
    public final long[] billing;
    public final long[] crashlytics;
    public final boolean isPro;
    public final int loadAd;
    public final int[] mopub;
    public final int purchase;
    public final long subs;
    public final C11436l yandex;

    public C9267l(C11436l c11436l, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        AbstractC12442l.admob(iArr.length == jArr2.length);
        AbstractC12442l.admob(jArr.length == jArr2.length);
        AbstractC12442l.admob(iArr2.length == jArr2.length);
        this.yandex = c11436l;
        this.crashlytics = jArr;
        this.amazon = iArr;
        this.purchase = i;
        this.billing = jArr2;
        this.mopub = iArr2;
        this.admob = iArr3;
        this.isPro = z;
        this.subs = j;
        this.loadAd = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int loadAd(long j) {
        long[] jArr = this.billing;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.isPro) {
            return AbstractC15323l.loadAd(jArr, j, true);
        }
        int[] iArr = this.admob;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int iRemoteconfig = AbstractC5020l.remoteconfig(length, i, 2, i);
            if (jArr[iArr[iRemoteconfig]] >= j) {
                length = iRemoteconfig - 1;
                i2 = iRemoteconfig;
            } else {
                i = iRemoteconfig + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                if (jArr[iArr[i3]] != j2) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr[i2];
    }

    public final int yandex(long j) {
        long[] jArr = this.billing;
        if (jArr.length <= 0) {
            return -1;
        }
        int i = 0;
        if (this.isPro) {
            return AbstractC15323l.billing(jArr, j, false);
        }
        int[] iArr = this.admob;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int iRemoteconfig = AbstractC5020l.remoteconfig(length, i, 2, i);
            if (jArr[iArr[iRemoteconfig]] <= j) {
                i = iRemoteconfig + 1;
                i2 = iRemoteconfig;
            } else {
                length = iRemoteconfig - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }
}
