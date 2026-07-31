package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؕۘۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3591l extends AbstractC11861l {
    public final C15213l subs;
    public static final BigInteger isPro = C8649l.f17821l;
    public static final AbstractC2426l[] firebase = {new C8649l(InterfaceC11695l.startapp)};

    public C3591l() {
        super(isPro);
        AbstractC2426l abstractC2426l = null;
        this.subs = new C15213l(this, abstractC2426l, abstractC2426l, 3);
        this.loadAd = new C8649l(new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.crashlytics = new C8649l(new BigInteger(1, AbstractC8535l.crashlytics("E87579C11079F43DD824993C2CEE5ED3")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFE0000000075A30D1B9038A115"));
        this.purchase = BigInteger.valueOf(1L);
        this.billing = 2;
    }

    @Override // defpackage.AbstractC11861l
    public final BigInteger Signature() {
        return isPro;
    }

    @Override // defpackage.AbstractC11861l, defpackage.AbstractC11918l
    public final AbstractC2426l ads(SecureRandom secureRandom) {
        int[] iArr = new int[4];
        do {
            byte[] bArr = new byte[16];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC10000l.adcel(bArr, 0, iArr, 0, 4);
            } while (AbstractC4952l.ad(4, iArr, AbstractC15497l.yandex) == 0);
        } while (AbstractC4952l.smaato(iArr, 4) != 0);
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 3);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C8649l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        int[] iArr = new int[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC9168l.amazon(i2, ((C8649l) abstractC8859l.loadAd).f17822l, iArr);
            AbstractC9168l.amazon(i2 + 4, ((C8649l) abstractC8859l.crashlytics).f17822l, iArr);
            i2 += 8;
        }
        return new C6345l(this, i, iArr, 2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, 3);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.subs;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return isPro.bitLength();
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 2;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C3591l();
    }
}
