package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٕٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15240l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C9194l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C15240l() {
        super(233, 74, 0, 0);
        this.isPro = new C13683l(this, null, null, 10);
        this.loadAd = new C9194l(BigInteger.valueOf(0L));
        this.crashlytics = new C9194l(BigInteger.valueOf(1L));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.purchase = BigInteger.valueOf(4L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return true;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 10);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC12754l crashlytics() {
        return new C16732l(2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C9194l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC5998l.admob(i2, ((C9194l) abstractC8859l.loadAd).f18905l, jArr);
            AbstractC5998l.admob(i2 + 4, ((C9194l) abstractC8859l.crashlytics).f18905l, jArr);
            i2 += 8;
        }
        return new C6345l(this, i, jArr, 23);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 10);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 233;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C15240l();
    }
}
