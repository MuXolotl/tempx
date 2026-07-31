package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lّۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13032l extends AbstractC11861l {
    public final C15213l subs;
    public static final BigInteger isPro = C3849l.f7954l;
    public static final AbstractC2426l[] firebase = {new C3849l(InterfaceC11695l.startapp)};

    public C13032l() {
        super(isPro);
        AbstractC2426l abstractC2426l = null;
        this.subs = new C15213l(this, abstractC2426l, abstractC2426l, 13);
        this.loadAd = new C3849l(new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.crashlytics = new C3849l(new BigInteger(1, AbstractC8535l.crashlytics("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.purchase = BigInteger.valueOf(1L);
        this.billing = 2;
    }

    @Override // defpackage.AbstractC11861l
    public final BigInteger Signature() {
        return isPro;
    }

    @Override // defpackage.AbstractC11861l, defpackage.AbstractC11918l
    public final AbstractC2426l ads(SecureRandom secureRandom) {
        int[] iArr = new int[12];
        do {
            byte[] bArr = new byte[48];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC10000l.adcel(bArr, 0, iArr, 0, 12);
            } while (AbstractC4952l.ad(12, iArr, AbstractC16817l.f32844l) == 0);
        } while (AbstractC4952l.smaato(iArr, 12) != 0);
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 13);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C3849l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        int[] iArr = new int[i * 24];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 12;
            if (i2 >= i) {
                return new C6345l(this, i, iArr, i4);
            }
            AbstractC8859l abstractC8859l = abstractC8859lArr[i2];
            System.arraycopy(((C3849l) abstractC8859l.loadAd).f7955l, 0, iArr, i3, 12);
            System.arraycopy(((C3849l) abstractC8859l.crashlytics).f7955l, 0, iArr, i3 + 12, 12);
            i3 += 24;
            i2++;
        }
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, 13);
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
        return new C13032l();
    }
}
