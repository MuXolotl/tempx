package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lِۖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12045l extends AbstractC17780l {
    public final /* synthetic */ byte[] amazon;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ AbstractC11918l purchase;

    public C12045l(AbstractC11918l abstractC11918l, int i, int i2, byte[] bArr) {
        this.purchase = abstractC11918l;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = bArr;
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l billing(int i) {
        int i2 = this.crashlytics;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.loadAd; i4++) {
            int i5 = ((i4 ^ i) - 1) >> 31;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b = bArr[i6];
                byte[] bArr3 = this.amazon;
                bArr[i6] = (byte) (b ^ (bArr3[i3 + i6] & i5));
                bArr2[i6] = (byte) (bArr2[i6] ^ (bArr3[(i3 + i2) + i6] & i5));
            }
            i3 += i2 * 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        AbstractC11918l abstractC11918l = this.purchase;
        return abstractC11918l.purchase(abstractC11918l.isPro(bigInteger), abstractC11918l.isPro(new BigInteger(1, bArr2)));
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l mopub(int i) {
        int i2 = this.crashlytics;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[i2];
        int i3 = i * i2 * 2;
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.amazon;
            bArr[i4] = bArr3[i3 + i4];
            bArr2[i4] = bArr3[i3 + i2 + i4];
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        AbstractC11918l abstractC11918l = this.purchase;
        return abstractC11918l.purchase(abstractC11918l.isPro(bigInteger), abstractC11918l.isPro(new BigInteger(1, bArr2)));
    }

    @Override // defpackage.AbstractC17780l
    public final int purchase() {
        return this.loadAd;
    }
}
