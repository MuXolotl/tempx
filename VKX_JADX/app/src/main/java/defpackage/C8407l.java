package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lًۦؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8407l extends AbstractC11861l {
    public final C15213l subs;
    public static final BigInteger isPro = C5420l.f11612l;
    public static final AbstractC2426l[] firebase = {new C5420l(InterfaceC11695l.startapp)};

    public C8407l() {
        super(isPro);
        AbstractC2426l abstractC2426l = null;
        this.subs = new C15213l(this, abstractC2426l, abstractC2426l, 10);
        this.loadAd = new C5420l(new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.crashlytics = new C5420l(new BigInteger(1, AbstractC8535l.crashlytics("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.purchase = BigInteger.valueOf(1L);
        this.billing = 2;
    }

    @Override // defpackage.AbstractC11861l
    public final BigInteger Signature() {
        return isPro;
    }

    @Override // defpackage.AbstractC11861l, defpackage.AbstractC11918l
    public final AbstractC2426l ads(SecureRandom secureRandom) {
        int[] iArr = new int[7];
        do {
            byte[] bArr = new byte[28];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC10000l.adcel(bArr, 0, iArr, 0, 7);
            } while (AbstractC4952l.ad(7, iArr, AbstractC4654l.yandex) == 0);
        } while (AbstractC4952l.smaato(iArr, 7) != 0);
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 10);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C5420l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        int[] iArr = new int[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC3292l.admob(i2, ((C5420l) abstractC8859l.loadAd).f11613l, iArr);
            AbstractC3292l.admob(i2 + 7, ((C5420l) abstractC8859l.crashlytics).f11613l, iArr);
            i2 += 14;
        }
        return new C6345l(this, i, iArr, 9);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, 10);
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
        return new C8407l();
    }
}
