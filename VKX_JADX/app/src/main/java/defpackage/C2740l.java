package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؔٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2740l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C10957l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C2740l() {
        super(571, 2, 5, 10);
        this.isPro = new C13683l(this, null, null, 17);
        this.loadAd = new C10957l(BigInteger.valueOf(0L));
        this.crashlytics = new C10957l(BigInteger.valueOf(1L));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.purchase = BigInteger.valueOf(4L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return true;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 17);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC12754l crashlytics() {
        return new C16732l(2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C10957l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 18];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i4];
            AbstractC17742l.yandex(i3, ((C10957l) abstractC8859l.loadAd).f22089l, jArr);
            AbstractC17742l.yandex(i3 + 9, ((C10957l) abstractC8859l.crashlytics).f22089l, jArr);
            i3 += 18;
        }
        return new C18029l(this, i, jArr, i2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 17);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 571;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C2740l();
    }
}
