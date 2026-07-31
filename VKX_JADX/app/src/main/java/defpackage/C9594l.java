package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٍٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9594l implements InterfaceC11795l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final BigInteger f19546l = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public SecureRandom f19547l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC2017l f19548l;

    @Override // defpackage.InterfaceC11795l
    public final boolean admob(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        C7838l c7838l = this.f19548l.f4542l;
        BigInteger bigInteger3 = c7838l.f16362l;
        if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
            return false;
        }
        AbstractC11918l abstractC11918l = c7838l.f16360l;
        BigInteger bigInteger4 = new BigInteger(1, AbstractC14024l.license(bArr));
        int iSmaato = abstractC11918l.smaato();
        int iBitLength = bigInteger4.bitLength();
        BigInteger bigInteger5 = f19546l;
        if (iBitLength > iSmaato) {
            bigInteger4 = bigInteger4.mod(bigInteger5.shiftLeft(iSmaato));
        }
        AbstractC2426l abstractC2426lIsPro = abstractC11918l.isPro(bigInteger4);
        if (abstractC2426lIsPro.metrica()) {
            abstractC2426lIsPro = abstractC11918l.isPro(bigInteger5);
        }
        AbstractC8859l abstractC8859lStartapp = AbstractC6974l.ads(c7838l.f16358l, bigInteger2, ((C4148l) this.f19548l).f8515l, bigInteger).startapp();
        if (abstractC8859lStartapp.smaato()) {
            return false;
        }
        abstractC8859lStartapp.loadAd();
        BigInteger bigIntegerSignatures = abstractC2426lIsPro.startapp(abstractC8859lStartapp.loadAd).signatures();
        int iBitLength2 = bigInteger3.bitLength() - 1;
        if (bigIntegerSignatures.bitLength() > iBitLength2) {
            bigIntegerSignatures = bigIntegerSignatures.mod(bigInteger5.shiftLeft(iBitLength2));
        }
        return bigIntegerSignatures.compareTo(bigInteger) == 0;
    }

    @Override // defpackage.InterfaceC11795l
    public final BigInteger[] crashlytics(byte[] bArr) {
        C7838l c7838l = this.f19548l.f4542l;
        AbstractC11918l abstractC11918l = c7838l.f16360l;
        BigInteger bigInteger = new BigInteger(1, AbstractC14024l.license(bArr));
        int iSmaato = abstractC11918l.smaato();
        int iBitLength = bigInteger.bitLength();
        BigInteger bigInteger2 = f19546l;
        if (iBitLength > iSmaato) {
            bigInteger = bigInteger.mod(bigInteger2.shiftLeft(iSmaato));
        }
        AbstractC2426l abstractC2426lIsPro = abstractC11918l.isPro(bigInteger);
        if (abstractC2426lIsPro.metrica()) {
            abstractC2426lIsPro = abstractC11918l.isPro(bigInteger2);
        }
        BigInteger bigInteger3 = c7838l.f16362l;
        BigInteger bigInteger4 = ((C8374l) this.f19548l).f17335l;
        C16732l c16732l = new C16732l(0);
        while (true) {
            BigInteger bigInteger5 = BigInteger.ONE;
            BigInteger bigIntegerAmazon = AbstractC16784l.amazon(bigInteger5, bigInteger3.subtract(bigInteger5), this.f19547l);
            AbstractC8859l abstractC8859lStartapp = c16732l.loadAd(c7838l.f16358l, bigIntegerAmazon).startapp();
            abstractC8859lStartapp.loadAd();
            AbstractC2426l abstractC2426l = abstractC8859lStartapp.loadAd;
            if (!abstractC2426l.metrica()) {
                BigInteger bigIntegerSignatures = abstractC2426lIsPro.startapp(abstractC2426l).signatures();
                int iBitLength2 = bigInteger3.bitLength() - 1;
                if (bigIntegerSignatures.bitLength() > iBitLength2) {
                    bigIntegerSignatures = bigIntegerSignatures.mod(bigInteger2.shiftLeft(iBitLength2));
                }
                if (bigIntegerSignatures.signum() != 0) {
                    BigInteger bigIntegerMod = bigIntegerSignatures.multiply(bigInteger4).add(bigIntegerAmazon).mod(bigInteger3);
                    if (bigIntegerMod.signum() != 0) {
                        return new BigInteger[]{bigIntegerSignatures, bigIntegerMod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC11795l
    public final BigInteger getOrder() {
        return this.f19548l.f4542l.f16362l;
    }

    @Override // defpackage.InterfaceC11795l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        SecureRandom secureRandomLoadAd = null;
        if (z) {
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                secureRandomLoadAd = c6114l.f12904l;
                interfaceC9719l = c6114l.f12903l;
            }
            this.f19548l = (C8374l) interfaceC9719l;
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
        } else {
            this.f19548l = (C4148l) interfaceC9719l;
        }
        this.f19547l = secureRandomLoadAd;
        AbstractC1497l.amazon("DSTU4145", this.f19548l, z);
        AbstractC8776l.yandex();
    }
}
