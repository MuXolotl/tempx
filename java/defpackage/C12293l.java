package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lّؐٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12293l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C13897l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C12293l() {
        super(283, 5, 7, 12);
        this.isPro = new C13683l(this, null, null, 13);
        this.loadAd = new C13897l(BigInteger.valueOf(0L));
        this.crashlytics = new C13897l(BigInteger.valueOf(1L));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.purchase = BigInteger.valueOf(4L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return true;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 13);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC12754l crashlytics() {
        return new C16732l(2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C13897l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 10];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC0124l.mopub(i2, ((C13897l) abstractC8859l.loadAd).f27173l, jArr);
            AbstractC0124l.mopub(i2 + 5, ((C13897l) abstractC8859l.crashlytics).f27173l, jArr);
            i2 += 10;
        }
        return new C6345l(this, i, jArr, 26);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 13);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 283;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C12293l();
    }
}
