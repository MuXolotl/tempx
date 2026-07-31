package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٍۦَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9949l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C10957l(InterfaceC11695l.startapp)};
    public static final C10957l remoteconfig;
    public static final C10957l smaato;
    public final C13683l isPro;

    static {
        C10957l c10957l = new C10957l(new BigInteger(1, AbstractC8535l.crashlytics("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        smaato = c10957l;
        remoteconfig = (C10957l) c10957l.Signature();
    }

    public C9949l() {
        super(571, 2, 5, 10);
        this.isPro = new C13683l(this, null, null, 18);
        this.loadAd = new C10957l(BigInteger.valueOf(1L));
        this.crashlytics = smaato;
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.purchase = BigInteger.valueOf(2L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 18);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C10957l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        long[] jArr = new long[i * 18];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC17742l.yandex(i2, ((C10957l) abstractC8859l.loadAd).f22089l, jArr);
            AbstractC17742l.yandex(i2 + 9, ((C10957l) abstractC8859l.crashlytics).f22089l, jArr);
            i2 += 18;
        }
        return new C18029l(this, i, jArr, 1);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 18);
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
        return new C9949l();
    }
}
