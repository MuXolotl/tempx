package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lَۜۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10587l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C7385l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C10587l() {
        super(409, 87, 0, 0);
        this.isPro = new C13683l(this, null, null, 16);
        this.loadAd = new C7385l(BigInteger.valueOf(1L));
        this.crashlytics = new C7385l(new BigInteger(1, AbstractC8535l.crashlytics("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.purchase = BigInteger.valueOf(2L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 16);
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
        return new C6345l(this, i, jArr, 29);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 16);
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
        return new C10587l();
    }
}
