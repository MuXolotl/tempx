package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lۣؖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4476l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C17366l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C4476l() {
        super(113, 9, 0, 0);
        this.isPro = new C13683l(this, null, null, 2);
        this.loadAd = new C17366l(new BigInteger(1, AbstractC8535l.crashlytics("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.crashlytics = new C17366l(new BigInteger(1, AbstractC8535l.crashlytics("0095E9A9EC9B297BD4BF36E059184F")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("010000000000000108789B2496AF93"));
        this.purchase = BigInteger.valueOf(2L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C17366l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC9168l.purchase(i2, ((C17366l) abstractC8859l.loadAd).f33833l, jArr);
            AbstractC9168l.purchase(i2 + 2, ((C17366l) abstractC8859l.crashlytics).f33833l, jArr);
            i2 += 4;
        }
        return new C6345l(this, i, jArr, 15);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 113;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C4476l();
    }
}
