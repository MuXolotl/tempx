package defpackage;

/* JADX INFO: renamed from: l٘ٛؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18029l extends AbstractC17780l {
    public final /* synthetic */ long[] amazon;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ AbstractC7399l purchase;

    public /* synthetic */ C18029l(AbstractC7399l abstractC7399l, int i, long[] jArr, int i2) {
        this.loadAd = i2;
        this.purchase = abstractC7399l;
        this.crashlytics = i;
        this.amazon = jArr;
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l billing(int i) {
        int i2 = this.loadAd;
        AbstractC7399l abstractC7399l = this.purchase;
        long[] jArr = this.amazon;
        int i3 = this.crashlytics;
        switch (i2) {
            case 0:
                long[] jArr2 = new long[9];
                long[] jArr3 = new long[9];
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    long j = ((i5 ^ i) - 1) >> 31;
                    for (int i6 = 0; i6 < 9; i6++) {
                        jArr2[i6] = jArr2[i6] ^ (jArr[i4 + i6] & j);
                        jArr3[i6] = jArr3[i6] ^ (jArr[(i4 + 9) + i6] & j);
                    }
                    i4 += 18;
                }
                return new C13683l((C2740l) abstractC7399l, new C10957l(jArr2), new C10957l(jArr3), C2740l.firebase, 17);
            default:
                long[] jArr4 = new long[9];
                long[] jArr5 = new long[9];
                int i7 = 0;
                for (int i8 = 0; i8 < i3; i8++) {
                    long j2 = ((i8 ^ i) - 1) >> 31;
                    for (int i9 = 0; i9 < 9; i9++) {
                        jArr4[i9] = jArr4[i9] ^ (jArr[i7 + i9] & j2);
                        jArr5[i9] = jArr5[i9] ^ (jArr[(i7 + 9) + i9] & j2);
                    }
                    i7 += 18;
                }
                return new C13683l((C9949l) abstractC7399l, new C10957l(jArr4), new C10957l(jArr5), C9949l.firebase, 18);
        }
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l mopub(int i) {
        int i2 = this.loadAd;
        AbstractC7399l abstractC7399l = this.purchase;
        long[] jArr = this.amazon;
        int i3 = 0;
        switch (i2) {
            case 0:
                long[] jArr2 = new long[9];
                long[] jArr3 = new long[9];
                int i4 = i * 18;
                while (i3 < 9) {
                    jArr2[i3] = jArr[i4 + i3];
                    jArr3[i3] = jArr[i4 + 9 + i3];
                    i3++;
                }
                return new C13683l((C2740l) abstractC7399l, new C10957l(jArr2), new C10957l(jArr3), C2740l.firebase, 17);
            default:
                long[] jArr4 = new long[9];
                long[] jArr5 = new long[9];
                int i5 = i * 18;
                while (i3 < 9) {
                    jArr4[i3] = jArr[i5 + i3];
                    jArr5[i3] = jArr[i5 + 9 + i3];
                    i3++;
                }
                return new C13683l((C9949l) abstractC7399l, new C10957l(jArr4), new C10957l(jArr5), C9949l.firebase, 18);
        }
    }

    @Override // defpackage.AbstractC17780l
    public final int purchase() {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return this.crashlytics;
    }
}
