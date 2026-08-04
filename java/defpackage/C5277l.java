package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؗۥٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5277l extends AbstractC11861l {
    public C15213l firebase;
    public BigInteger isPro;
    public BigInteger subs;
    public static final Set smaato = DesugarCollections.synchronizedSet(new HashSet());
    public static final C13698l remoteconfig = new C13698l((byte) 0, 2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    public C5277l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, boolean z) {
        boolean zContainsKey;
        int iRemoteconfig;
        super(bigInteger);
        Set set = smaato;
        AbstractC2426l abstractC2426l = null;
        if (z) {
            set.add(bigInteger);
        } else if (!set.contains(bigInteger)) {
            C13698l c13698l = remoteconfig;
            synchronized (c13698l) {
                zContainsKey = ((WeakHashMap) c13698l.f26743l).containsKey(bigInteger);
            }
            if (!zContainsKey) {
                int iYandex = AbstractC8151l.yandex(1042, "org.bouncycastle.ec.fp_max_size");
                int iYandex2 = AbstractC8151l.yandex(100, "org.bouncycastle.ec.fp_certainty");
                int iBitLength = bigInteger.bitLength();
                if (iYandex < iBitLength) {
                    C8339l.metrica("Fp q value out of range");
                    throw null;
                }
                if (!AbstractC3493l.loadAd(bigInteger)) {
                    SecureRandom secureRandomLoadAd = AbstractC8776l.loadAd();
                    if (iBitLength >= 1536) {
                        if (iYandex2 <= 100) {
                            iRemoteconfig = 3;
                        } else if (iYandex2 <= 128) {
                            iRemoteconfig = 4;
                        } else {
                            iRemoteconfig = AbstractC5020l.remoteconfig(iYandex2, 127, 2, 4);
                        }
                    } else if (iBitLength >= 1024) {
                        if (iYandex2 <= 100) {
                            iRemoteconfig = 4;
                        } else if (iYandex2 <= 112) {
                            iRemoteconfig = 5;
                        } else {
                            iRemoteconfig = AbstractC5020l.remoteconfig(iYandex2, 111, 2, 5);
                        }
                    } else if (iBitLength < 512) {
                        iRemoteconfig = iYandex2 <= 80 ? 40 : AbstractC5020l.remoteconfig(iYandex2, 79, 2, 40);
                    } else if (iYandex2 <= 80) {
                        iRemoteconfig = 5;
                    } else {
                        iRemoteconfig = iYandex2 <= 100 ? 7 : AbstractC5020l.remoteconfig(iYandex2, 99, 2, 7);
                    }
                    if (AbstractC3493l.crashlytics(bigInteger, secureRandomLoadAd, iRemoteconfig)) {
                        c13698l.subs(bigInteger);
                    }
                }
                C8339l.metrica("Fp q value not prime");
                throw null;
            }
        }
        this.subs = bigInteger;
        int iBitLength2 = bigInteger.bitLength();
        this.isPro = (iBitLength2 < 96 || bigInteger.shiftRight(iBitLength2 + (-64)).longValue() != -1) ? null : InterfaceC11695l.startapp.shiftLeft(iBitLength2).subtract(bigInteger);
        this.firebase = new C15213l(this, abstractC2426l, abstractC2426l, 1);
        this.loadAd = isPro(bigInteger2);
        this.crashlytics = isPro(bigInteger3);
        this.amazon = bigInteger4;
        this.purchase = bigInteger5;
        this.billing = 4;
    }

    @Override // defpackage.AbstractC11861l
    public final BigInteger Signature() {
        return this.subs;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 1);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.subs;
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(bigInteger2) < 0) {
            return new C18713l(bigInteger2, this.isPro, bigInteger);
        }
        C8339l.metrica("x value invalid for Fp field element");
        return null;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, 1);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.firebase;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return this.subs.bitLength();
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 0 || i == 1 || i == 2 || i == 4;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l vip(AbstractC8859l abstractC8859l) {
        int i;
        return (this == abstractC8859l.yandex || this.billing != 2 || abstractC8859l.smaato() || !((i = abstractC8859l.yandex.billing) == 2 || i == 3 || i == 4)) ? super.vip(abstractC8859l) : new C15213l(this, isPro(abstractC8859l.loadAd.signatures()), isPro(abstractC8859l.crashlytics.signatures()), new AbstractC2426l[]{isPro(abstractC8859l.amazon[0].signatures())}, 1);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        BigInteger bigInteger = this.subs;
        BigInteger bigInteger2 = this.isPro;
        AbstractC2426l abstractC2426l = this.loadAd;
        AbstractC2426l abstractC2426l2 = this.crashlytics;
        BigInteger bigInteger3 = this.amazon;
        BigInteger bigInteger4 = this.purchase;
        C5277l c5277l = new C5277l(bigInteger);
        c5277l.subs = bigInteger;
        c5277l.isPro = bigInteger2;
        AbstractC2426l abstractC2426l3 = null;
        c5277l.firebase = new C15213l(c5277l, abstractC2426l3, abstractC2426l3, 1);
        c5277l.loadAd = abstractC2426l;
        c5277l.crashlytics = abstractC2426l2;
        c5277l.amazon = bigInteger3;
        c5277l.purchase = bigInteger4;
        c5277l.billing = 4;
        return c5277l;
    }
}
