package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؙٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17938l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C7385l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C17938l() {
        super(409, 87, 0, 0);
        this.isPro = new C13683l(this, null, null, 15);
        this.loadAd = new C7385l(BigInteger.valueOf(0L));
        this.crashlytics = new C7385l(BigInteger.valueOf(1L));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.purchase = BigInteger.valueOf(4L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return true;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 15);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC12754l crashlytics() {
        return new C16732l(2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C7385l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC7985l.yandex(i2, ((C7385l) abstractC8859l.loadAd).f15312l, jArr);
            AbstractC7985l.yandex(i2 + 7, ((C7385l) abstractC8859l.crashlytics).f15312l, jArr);
            i2 += 14;
        }
        return new C6345l(this, i, jArr, 28);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 15);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 409;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C17938l();
    }
}
