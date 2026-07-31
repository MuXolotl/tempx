package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؙؙٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6304l extends AbstractC7399l {
    public int firebase;
    public int isPro;
    public int remoteconfig;
    public int smaato;
    public C13683l vip;

    public C6304l(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i, i2, i3, i4);
        this.isPro = i;
        this.firebase = i2;
        this.smaato = i3;
        this.remoteconfig = i4;
        this.amazon = bigInteger3;
        this.purchase = bigInteger4;
        AbstractC2426l abstractC2426l = null;
        this.vip = new C13683l(this, abstractC2426l, abstractC2426l, 0);
        this.loadAd = isPro(bigInteger);
        this.crashlytics = isPro(bigInteger2);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 0);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC12754l crashlytics() {
        return Signature() ? new C16732l(2) : super.crashlytics();
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int iBitLength = bigInteger.bitLength();
            int i = this.isPro;
            if (iBitLength <= i) {
                int i2 = this.smaato;
                int i3 = this.remoteconfig;
                int i4 = i2 | i3;
                int i5 = this.firebase;
                char c = 2;
                int i6 = 1;
                int[] iArr = i4 == 0 ? new int[]{i5} : new int[]{i5, i2, i3};
                C3892l c3892l = new C3892l();
                if (bigInteger.signum() < 0) {
                    C8339l.metrica("invalid F2m field value");
                    return null;
                }
                if (bigInteger.signum() == 0) {
                    c3892l.f8035l = new long[]{0};
                } else {
                    byte[] byteArray = bigInteger.toByteArray();
                    int length = byteArray.length;
                    if (byteArray[0] == 0) {
                        length--;
                    } else {
                        i6 = 0;
                    }
                    int i7 = (length + 7) / 8;
                    c3892l.f8035l = new long[i7];
                    int i8 = i7 - 1;
                    int i9 = (length % 8) + i6;
                    if (i6 < i9) {
                        long j = 0;
                        while (i6 < i9) {
                            j = (j << 8) | ((long) (byteArray[i6] & 255));
                            i6++;
                            c = c;
                        }
                        c3892l.f8035l[i8] = j;
                        i8 = i7 - 2;
                    }
                    while (i8 >= 0) {
                        long j2 = 0;
                        int i10 = 0;
                        while (i10 < 8) {
                            j2 = (j2 << 8) | ((long) (byteArray[i6] & 255));
                            i10++;
                            i6++;
                        }
                        c3892l.f8035l[i8] = j2;
                        i8--;
                    }
                }
                return new C7319l(i, iArr, c3892l);
            }
        }
        C8339l.metrica("x value invalid in F2m field element");
        return null;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        int i2 = this.firebase;
        int i3 = this.remoteconfig;
        int i4 = (this.isPro + 63) >>> 6;
        int i5 = this.smaato;
        int[] iArr = (i5 == 0 && i3 == 0) ? new int[]{i2} : new int[]{i2, i5, i3};
        long[] jArr = new long[i * i4 * 2];
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i7];
            long[] jArr2 = ((C7319l) abstractC8859l.loadAd).f15174l.f8035l;
            System.arraycopy(jArr2, 0, jArr, i6, jArr2.length);
            int i8 = i6 + i4;
            long[] jArr3 = ((C7319l) abstractC8859l.crashlytics).f15174l.f8035l;
            System.arraycopy(jArr3, 0, jArr, i8, jArr3.length);
            i6 = i8 + i4;
        }
        return new C4881l(this, i, i4, jArr, iArr);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 0);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.vip;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 0 || i == 1 || i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        int i = this.isPro;
        int i2 = this.firebase;
        int i3 = this.smaato;
        int i4 = this.remoteconfig;
        AbstractC2426l abstractC2426l = this.loadAd;
        AbstractC2426l abstractC2426l2 = this.crashlytics;
        BigInteger bigInteger = this.amazon;
        BigInteger bigInteger2 = this.purchase;
        C6304l c6304l = new C6304l(i, i2, i3, i4);
        c6304l.isPro = i;
        c6304l.firebase = i2;
        c6304l.smaato = i3;
        c6304l.remoteconfig = i4;
        c6304l.amazon = bigInteger;
        c6304l.purchase = bigInteger2;
        AbstractC2426l abstractC2426l3 = null;
        c6304l.vip = new C13683l(c6304l, abstractC2426l3, abstractC2426l3, 0);
        c6304l.loadAd = abstractC2426l;
        c6304l.crashlytics = abstractC2426l2;
        c6304l.billing = 6;
        return c6304l;
    }

    public C6304l(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }
}
