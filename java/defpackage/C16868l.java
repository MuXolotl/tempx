package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٗؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16868l extends AbstractC7399l {
    public static final AbstractC2426l[] firebase = {new C13897l(InterfaceC11695l.startapp)};
    public final C13683l isPro;

    public C16868l() {
        super(283, 5, 7, 12);
        this.isPro = new C13683l(this, null, null, 14);
        this.loadAd = new C13897l(BigInteger.valueOf(1L));
        this.crashlytics = new C13897l(new BigInteger(1, AbstractC8535l.crashlytics("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.purchase = BigInteger.valueOf(2L);
        this.billing = 6;
    }

    @Override // defpackage.AbstractC7399l
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 14);
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
        return new C6345l(this, i, jArr, 27);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C13683l(this, abstractC2426l, abstractC2426l2, 14);
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
        return new C16868l();
    }
}
