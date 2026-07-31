package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٕۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15877l {
    public static final byte[][] amazon;
    public static final byte[][] billing;
    public static final C0848l[] crashlytics;
    public static final BigInteger loadAd;
    public static final C0848l[] purchase;
    public static final BigInteger yandex;

    static {
        BigInteger bigInteger = InterfaceC11695l.startapp;
        BigInteger bigIntegerNegate = bigInteger.negate();
        yandex = bigIntegerNegate;
        loadAd = InterfaceC11695l.adcel.negate();
        BigInteger bigInteger2 = InterfaceC11695l.ads;
        BigInteger bigIntegerNegate2 = bigInteger2.negate();
        BigInteger bigInteger3 = InterfaceC11695l.metrica;
        crashlytics = new C0848l[]{null, new C0848l(bigInteger, bigInteger3, 4), null, new C0848l(bigIntegerNegate2, bigIntegerNegate, 4), null, new C0848l(bigIntegerNegate, bigIntegerNegate, 4), null, new C0848l(bigInteger, bigIntegerNegate, 4), null, new C0848l(bigIntegerNegate, bigInteger, 4), null, new C0848l(bigInteger, bigInteger, 4), null, new C0848l(bigInteger2, bigInteger, 4), null, new C0848l(bigIntegerNegate, bigInteger3, 4)};
        amazon = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        purchase = new C0848l[]{null, new C0848l(bigInteger, bigInteger3, 4), null, new C0848l(bigIntegerNegate2, bigInteger, 4), null, new C0848l(bigIntegerNegate, bigInteger, 4), null, new C0848l(bigInteger, bigInteger, 4), null, new C0848l(bigIntegerNegate, bigIntegerNegate, 4), null, new C0848l(bigInteger, bigIntegerNegate, 4), null, new C0848l(bigInteger2, bigIntegerNegate, 4), null, new C0848l(bigIntegerNegate, bigInteger3, 4)};
        billing = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static BigInteger[] crashlytics(AbstractC7399l abstractC7399l) {
        int i;
        if (!abstractC7399l.Signature()) {
            C8339l.metrica("si is defined for Koblitz curves only");
            return null;
        }
        int iSmaato = abstractC7399l.smaato();
        int iIntValue = abstractC7399l.loadAd.signatures().intValue();
        BigInteger bigInteger = abstractC7399l.purchase;
        byte b = (byte) (iIntValue == 0 ? -1 : 1);
        if (bigInteger != null) {
            if (bigInteger.equals(InterfaceC11695l.adcel)) {
                i = 1;
            } else if (bigInteger.equals(InterfaceC11695l.subscription)) {
                i = 2;
            }
            BigInteger[] bigIntegerArrLoadAd = loadAd(b, (iSmaato + 3) - iIntValue, false);
            if (b == 1) {
                bigIntegerArrLoadAd[0] = bigIntegerArrLoadAd[0].negate();
                bigIntegerArrLoadAd[1] = bigIntegerArrLoadAd[1].negate();
            }
            BigInteger bigInteger2 = InterfaceC11695l.startapp;
            return new BigInteger[]{bigInteger2.add(bigIntegerArrLoadAd[1]).shiftRight(i), bigInteger2.add(bigIntegerArrLoadAd[0]).shiftRight(i).negate()};
        }
        C8339l.metrica("h (Cofactor) must be 2 or 4");
        return null;
    }

    public static BigInteger[] loadAd(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b != 1 && b != -1) {
            C8339l.metrica("mu must be 1 or -1");
            return null;
        }
        if (z) {
            bigInteger = InterfaceC11695l.adcel;
            bigIntegerSubtract = BigInteger.valueOf(b);
        } else {
            bigInteger = InterfaceC11695l.metrica;
            bigIntegerSubtract = InterfaceC11695l.startapp;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b < 0 ? bigIntegerSubtract.negate() : bigIntegerSubtract).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static C2747l yandex(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i) {
        int i2 = (i + 5) / 2;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - (i2 + 10)) - 2) + b));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i2);
        if (bigIntegerAdd.testBit(i2 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(InterfaceC11695l.startapp);
        }
        return new C2747l(10, bigIntegerShiftRight);
    }
}
