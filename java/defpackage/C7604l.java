package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lًؚۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7604l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C1099l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C7604l() {
        super(193, 15, 0, 0);
        this.isPro = new C13683l(this, null, null, 8);
        this.loadAd = new C1099l(new BigInteger(1, AbstractC8535l.crashlytics("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.crashlytics = new C1099l(new BigInteger(1, AbstractC8535l.crashlytics("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.purchase = BigInteger.valueOf(2L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 8);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C1099l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC5998l.admob(i2, ((C1099l) abstractC8859l.loadAd).f3036l, jArr);
            AbstractC5998l.admob(i2 + 4, ((C1099l) abstractC8859l.crashlytics).f3036l, jArr);
            i2 += 8;
        }
        return new C6345l(this, i, jArr, 21);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 8);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 193;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C7604l();
    }
}
