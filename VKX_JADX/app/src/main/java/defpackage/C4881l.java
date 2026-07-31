package defpackage;

/* JADX INFO: renamed from: lٌؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4881l extends AbstractC17780l {
    public final /* synthetic */ long[] amazon;
    public final /* synthetic */ C6304l billing;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ int[] purchase;

    public C4881l(C6304l c6304l, int i, int i2, long[] jArr, int[] iArr) {
        this.billing = c6304l;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = jArr;
        this.purchase = iArr;
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l billing(int i) {
        int i2 = this.crashlytics;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.loadAd; i4++) {
            long j = ((i4 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < i2; i5++) {
                long j2 = jArr[i5];
                long[] jArr3 = this.amazon;
                jArr[i5] = j2 ^ (jArr3[i3 + i5] & j);
                jArr2[i5] = jArr2[i5] ^ (jArr3[(i3 + i2) + i5] & j);
            }
            i3 += i2 * 2;
        }
        return subs(jArr, jArr2);
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l mopub(int i) {
        int i2 = this.crashlytics;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = i * i2 * 2;
        for (int i4 = 0; i4 < i2; i4++) {
            long[] jArr3 = this.amazon;
            jArr[i4] = jArr3[i3 + i4];
            jArr2[i4] = jArr3[i3 + i2 + i4];
        }
        return subs(jArr, jArr2);
    }

    @Override // defpackage.AbstractC17780l
    public final int purchase() {
        return this.loadAd;
    }

    public final C13683l subs(long[] jArr, long[] jArr2) {
        C6304l c6304l = this.billing;
        int i = c6304l.isPro;
        C3892l c3892l = new C3892l(jArr);
        int[] iArr = this.purchase;
        return new C13683l(c6304l, new C7319l(i, iArr, c3892l), new C7319l(i, iArr, new C3892l(jArr2)), 0);
    }
}
