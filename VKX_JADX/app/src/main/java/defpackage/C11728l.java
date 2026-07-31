package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٍِٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11728l extends AbstractC11861l {
    public final C15213l subs;
    public static final BigInteger isPro = C0448l.f1629l;
    public static final AbstractC2426l[] firebase = {new C0448l(InterfaceC11695l.startapp)};

    public C11728l() {
        super(isPro);
        AbstractC2426l abstractC2426l = null;
        this.subs = new C15213l(this, abstractC2426l, abstractC2426l, 5);
        this.loadAd = new C0448l(new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.crashlytics = new C0448l(new BigInteger(1, AbstractC8535l.crashlytics("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("0100000000000000000001F4C8F927AED3CA752257"));
        this.purchase = BigInteger.valueOf(1L);
        this.billing = 2;
    }

    @Override // defpackage.AbstractC11861l
    public final BigInteger Signature() {
        return isPro;
    }

    @Override // defpackage.AbstractC11861l, defpackage.AbstractC11918l
    public final AbstractC2426l ads(SecureRandom secureRandom) {
        int[] iArr = new int[5];
        do {
            byte[] bArr = new byte[20];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC10000l.adcel(bArr, 0, iArr, 0, 5);
            } while (AbstractC4952l.ad(5, iArr, AbstractC3979l.yandex) == 0);
        } while (AbstractC4952l.smaato(iArr, 5) != 0);
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 5);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C0448l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        int[] iArr = new int[i * 10];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            C16050l.amazon(i2, ((C0448l) abstractC8859l.loadAd).f1630l, iArr);
            C16050l.amazon(i2 + 5, ((C0448l) abstractC8859l.crashlytics).f1630l, iArr);
            i2 += 10;
        }
        return new C6345l(this, i, iArr, 4);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, 5);
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
        return new C11728l();
    }
}
