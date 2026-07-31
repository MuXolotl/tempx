package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٗۡۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17478l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C7908l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C17478l() {
        super(131, 2, 3, 8);
        this.isPro = new C13683l(this, null, null, 3);
        this.loadAd = new C7908l(new BigInteger(1, AbstractC8535l.crashlytics("07A11B09A76B562144418FF3FF8C2570B8")));
        this.crashlytics = new C7908l(new BigInteger(1, AbstractC8535l.crashlytics("0217C05610884B63B9C6C7291678F9D341")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("0400000000000000023123953A9464B54D"));
        this.purchase = BigInteger.valueOf(2L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 3);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C7908l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 6];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC0079l.admob(i2, ((C7908l) abstractC8859l.loadAd).f16492l, jArr);
            AbstractC0079l.admob(i2 + 3, ((C7908l) abstractC8859l.crashlytics).f16492l, jArr);
            i2 += 6;
        }
        return new C6345l(this, i, jArr, 16);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 3);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return 131;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C17478l();
    }
}
