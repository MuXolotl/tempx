package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؚؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0681l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C12917l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C0681l() {
        super(163, 3, 6, 7);
        this.isPro = new C13683l(this, null, null, 6);
        this.loadAd = new C12917l(new BigInteger(1, AbstractC8535l.crashlytics("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.crashlytics = new C12917l(new BigInteger(1, AbstractC8535l.crashlytics("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.purchase = BigInteger.valueOf(2L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 6);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C12917l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 6];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC0079l.admob(i2, ((C12917l) abstractC8859l.loadAd).f25372l, jArr);
            AbstractC0079l.admob(i2 + 3, ((C12917l) abstractC8859l.crashlytics).f25372l, jArr);
            i2 += 6;
        }
        return new C6345l(this, i, jArr, 19);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 6);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 163;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C0681l();
    }
}
