package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: renamed from: lۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18713l extends AbstractC14331l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final BigInteger f36470l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final BigInteger f36471l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final BigInteger f36472l;

    public C18713l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(3);
        this.f36470l = bigInteger;
        this.f36472l = bigInteger2;
        this.f36471l = bigInteger3;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        BigInteger bigInteger;
        BigInteger bigIntegerApplovin;
        if (metrica() || vip()) {
            return this;
        }
        BigInteger bigInteger2 = this.f36470l;
        int i = 0;
        AbstractC2426l abstractC2426l = null;
        if (!bigInteger2.testBit(0)) {
            C18073l.license("not done yet");
            return null;
        }
        int i2 = 1;
        boolean zTestBit = bigInteger2.testBit(1);
        BigInteger bigInteger3 = this.f36472l;
        BigInteger bigInteger4 = this.f36471l;
        BigInteger bigInteger5 = InterfaceC11695l.startapp;
        if (zTestBit) {
            C18713l c18713l = new C18713l(bigInteger2, bigInteger3, bigInteger4.modPow(bigInteger2.shiftRight(2).add(bigInteger5), bigInteger2));
            if (c18713l.license().equals(this)) {
                return c18713l;
            }
            return null;
        }
        boolean zTestBit2 = bigInteger2.testBit(2);
        BigInteger bigIntegerApplovin2 = InterfaceC11695l.adcel;
        if (zTestBit2) {
            BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger2.shiftRight(3), bigInteger2);
            BigInteger bigIntegerPremium = premium(bigIntegerModPow, bigInteger4);
            if (premium(bigIntegerPremium, bigIntegerModPow).equals(bigInteger5)) {
                C18713l c18713l2 = new C18713l(bigInteger2, bigInteger3, bigIntegerPremium);
                if (c18713l2.license().equals(this)) {
                    return c18713l2;
                }
                return null;
            }
            C18713l c18713l3 = new C18713l(bigInteger2, bigInteger3, applovin(bigIntegerPremium.multiply(bigIntegerApplovin2.modPow(bigInteger2.shiftRight(2), bigInteger2))));
            if (c18713l3.license().equals(this)) {
                return c18713l3;
            }
            return null;
        }
        BigInteger bigIntegerShiftRight = bigInteger2.shiftRight(1);
        if (!bigInteger4.modPow(bigIntegerShiftRight, bigInteger2).equals(bigInteger5)) {
            return null;
        }
        BigInteger bigIntegerShiftLeft = bigInteger4.shiftLeft(1);
        if (bigIntegerShiftLeft.compareTo(bigInteger2) >= 0) {
            bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(bigInteger2);
        }
        BigInteger bigIntegerShiftLeft2 = bigIntegerShiftLeft.shiftLeft(1);
        if (bigIntegerShiftLeft2.compareTo(bigInteger2) >= 0) {
            bigIntegerShiftLeft2 = bigIntegerShiftLeft2.subtract(bigInteger2);
        }
        BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger5);
        BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger5);
        Random random = new Random();
        while (true) {
            abstractC2426l = abstractC2426l;
            BigInteger bigInteger6 = new BigInteger(bigInteger2.bitLength(), random);
            if (bigInteger6.compareTo(bigInteger2) >= 0 || !applovin(bigInteger6.multiply(bigInteger6).subtract(bigIntegerShiftLeft2)).modPow(bigIntegerShiftRight, bigInteger2).equals(bigIntegerSubtract)) {
                bigIntegerApplovin2 = bigIntegerApplovin2;
            } else {
                int iBitLength = bigIntegerAdd.bitLength();
                int i3 = i;
                int lowestSetBit = bigIntegerAdd.getLowestSetBit();
                int i4 = iBitLength - i2;
                BigInteger bigInteger7 = bigIntegerShiftRight;
                BigInteger bigIntegerPremium2 = bigInteger5;
                BigInteger bigIntegerPremium3 = bigIntegerPremium2;
                BigInteger bigIntegerPremium4 = bigIntegerPremium3;
                BigInteger bigInteger8 = bigIntegerApplovin2;
                Random random2 = random;
                BigInteger bigInteger9 = bigInteger6;
                while (true) {
                    bigInteger = bigIntegerSubtract;
                    if (i4 < lowestSetBit + 1) {
                        break;
                    }
                    bigIntegerPremium4 = premium(bigIntegerPremium4, bigIntegerPremium2);
                    if (bigIntegerAdd.testBit(i4)) {
                        bigIntegerPremium2 = premium(bigIntegerPremium4, bigInteger4);
                        bigIntegerPremium3 = premium(bigIntegerPremium3, bigInteger9);
                        bigIntegerApplovin2 = applovin(bigInteger9.multiply(bigIntegerApplovin2).subtract(bigInteger6.multiply(bigIntegerPremium4)));
                        bigIntegerApplovin = applovin(bigInteger9.multiply(bigInteger9).subtract(bigIntegerPremium2.shiftLeft(1)));
                    } else {
                        BigInteger bigIntegerApplovin3 = applovin(bigIntegerPremium3.multiply(bigIntegerApplovin2).subtract(bigIntegerPremium4));
                        bigIntegerApplovin = applovin(bigInteger9.multiply(bigIntegerApplovin2).subtract(bigInteger6.multiply(bigIntegerPremium4)));
                        bigIntegerApplovin2 = applovin(bigIntegerApplovin2.multiply(bigIntegerApplovin2).subtract(bigIntegerPremium4.shiftLeft(1)));
                        bigIntegerPremium3 = bigIntegerApplovin3;
                        bigIntegerPremium2 = bigIntegerPremium4;
                    }
                    bigInteger9 = bigIntegerApplovin;
                    i4--;
                    bigIntegerSubtract = bigInteger;
                }
                BigInteger bigIntegerPremium5 = premium(bigIntegerPremium4, bigIntegerPremium2);
                BigInteger bigIntegerPremium6 = premium(bigIntegerPremium5, bigInteger4);
                BigInteger bigIntegerApplovin4 = applovin(bigIntegerPremium3.multiply(bigIntegerApplovin2).subtract(bigIntegerPremium5));
                BigInteger bigIntegerApplovin5 = applovin(bigInteger9.multiply(bigIntegerApplovin2).subtract(bigInteger6.multiply(bigIntegerPremium5)));
                BigInteger bigIntegerApplovin6 = applovin(bigIntegerPremium5.multiply(bigIntegerPremium6));
                for (int i5 = 1; i5 <= lowestSetBit; i5++) {
                    bigIntegerApplovin4 = premium(bigIntegerApplovin4, bigIntegerApplovin5);
                    bigIntegerApplovin5 = applovin(bigIntegerApplovin5.multiply(bigIntegerApplovin5).subtract(bigIntegerApplovin6.shiftLeft(1)));
                    bigIntegerApplovin6 = applovin(bigIntegerApplovin6.multiply(bigIntegerApplovin6));
                }
                BigInteger[] bigIntegerArr = new BigInteger[2];
                bigIntegerArr[i3] = bigIntegerApplovin4;
                bigIntegerArr[1] = bigIntegerApplovin5;
                BigInteger bigInteger10 = bigIntegerArr[i3];
                BigInteger bigIntegerSubtract2 = bigIntegerArr[1];
                if (premium(bigIntegerSubtract2, bigIntegerSubtract2).equals(bigIntegerShiftLeft2)) {
                    if (bigIntegerSubtract2.testBit(i3)) {
                        bigIntegerSubtract2 = bigInteger2.subtract(bigIntegerSubtract2);
                    }
                    return new C18713l(bigInteger2, bigInteger3, bigIntegerSubtract2.shiftRight(1));
                }
                if (bigInteger10.equals(bigInteger5)) {
                    i = i3;
                    i2 = 1;
                    bigIntegerShiftRight = bigInteger7;
                    bigIntegerApplovin2 = bigInteger8;
                    random = random2;
                    bigIntegerSubtract = bigInteger;
                } else {
                    if (!bigInteger10.equals(bigInteger)) {
                        return abstractC2426l;
                    }
                    bigIntegerSubtract = bigInteger;
                    i = i3;
                    i2 = 1;
                    bigIntegerShiftRight = bigInteger7;
                    bigIntegerApplovin2 = bigInteger8;
                    random = random2;
                }
            }
        }
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l adcel(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l abstractC2426l3) {
        return new C18713l(this.f36470l, this.f36472l, applovin(this.f36471l.multiply(abstractC2426l.signatures()).subtract(abstractC2426l2.signatures().multiply(abstractC2426l3.signatures()))));
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        BigInteger bigIntegerSignatures = abstractC2426l.signatures();
        BigInteger bigInteger = this.f36470l;
        return new C18713l(bigInteger, this.f36472l, premium(this.f36471l, AbstractC16784l.subs(bigInteger, bigIntegerSignatures)));
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ads(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l abstractC2426l3) {
        return new C18713l(this.f36470l, this.f36472l, applovin(this.f36471l.multiply(abstractC2426l.signatures()).add(abstractC2426l2.signatures().multiply(abstractC2426l3.signatures()))));
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        BigInteger bigIntegerSubtract = this.f36471l.subtract(abstractC2426l.signatures());
        int iSignum = bigIntegerSubtract.signum();
        BigInteger bigInteger = this.f36470l;
        if (iSignum < 0) {
            bigIntegerSubtract = bigIntegerSubtract.add(bigInteger);
        }
        return new C18713l(bigInteger, this.f36472l, bigIntegerSubtract);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        BigInteger bigIntegerAdd = this.f36471l.add(abstractC2426l.signatures());
        BigInteger bigInteger = this.f36470l;
        if (bigIntegerAdd.compareTo(bigInteger) >= 0) {
            bigIntegerAdd = bigIntegerAdd.subtract(bigInteger);
        }
        return new C18713l(bigInteger, this.f36472l, bigIntegerAdd);
    }

    public final BigInteger applovin(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.f36470l;
        BigInteger bigInteger3 = this.f36472l;
        if (bigInteger3 == null) {
            return bigInteger.mod(bigInteger2);
        }
        boolean z = bigInteger.signum() < 0;
        if (z) {
            bigInteger = bigInteger.abs();
        }
        int iBitLength = bigInteger2.bitLength();
        boolean zEquals = bigInteger3.equals(InterfaceC11695l.startapp);
        while (bigInteger.bitLength() > iBitLength + 1) {
            BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
            if (!zEquals) {
                bigIntegerShiftRight = bigIntegerShiftRight.multiply(bigInteger3);
            }
            bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
        }
        while (bigInteger.compareTo(bigInteger2) >= 0) {
            bigInteger = bigInteger.subtract(bigInteger2);
        }
        return (!z || bigInteger.signum() == 0) ? bigInteger : bigInteger2.subtract(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18713l)) {
            return false;
        }
        C18713l c18713l = (C18713l) obj;
        return this.f36470l.equals(c18713l.f36470l) && this.f36471l.equals(c18713l.f36471l);
    }

    public final int hashCode() {
        return this.f36471l.hashCode() ^ this.f36470l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        BigInteger bigInteger = this.f36471l;
        return new C18713l(this.f36470l, this.f36472l, premium(bigInteger, bigInteger));
    }

    public final BigInteger premium(BigInteger bigInteger, BigInteger bigInteger2) {
        return applovin(bigInteger.multiply(bigInteger2));
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        BigInteger bigIntegerSignatures = abstractC2426l.signatures();
        BigInteger bigIntegerSignatures2 = abstractC2426l2.signatures();
        BigInteger bigInteger = this.f36471l;
        return new C18713l(this.f36470l, this.f36472l, applovin(bigInteger.multiply(bigInteger).add(bigIntegerSignatures.multiply(bigIntegerSignatures2))));
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        BigInteger bigIntegerAdd = this.f36471l.add(InterfaceC11695l.startapp);
        BigInteger bigInteger = this.f36470l;
        if (bigIntegerAdd.compareTo(bigInteger) == 0) {
            bigIntegerAdd = InterfaceC11695l.metrica;
        }
        return new C18713l(bigInteger, this.f36472l, bigIntegerAdd);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        BigInteger bigInteger = this.f36471l;
        BigInteger bigInteger2 = this.f36470l;
        return new C18713l(bigInteger2, this.f36472l, AbstractC16784l.subs(bigInteger2, bigInteger));
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return this.f36471l;
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return this.f36470l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        return new C18713l(this.f36470l, this.f36472l, premium(this.f36471l, abstractC2426l.signatures()));
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        BigInteger bigInteger = this.f36471l;
        if (bigInteger.signum() == 0) {
            return this;
        }
        BigInteger bigInteger2 = this.f36472l;
        BigInteger bigInteger3 = this.f36470l;
        return new C18713l(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
    }
}
