package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٖۦۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16784l {
    public static final BigInteger yandex = BigInteger.valueOf(0);
    public static final BigInteger loadAd = BigInteger.valueOf(1);
    public static final BigInteger crashlytics = BigInteger.valueOf(2);
    public static final BigInteger amazon = BigInteger.valueOf(3);
    public static final BigInteger purchase = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    public static final int billing = BigInteger.valueOf(743).bitLength();

    public static int admob(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    public static BigInteger amazon(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo <= 0) {
                return bigInteger;
            }
            C8339l.metrica("'min' may not be greater than 'max'");
            return null;
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return amazon(yandex, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        for (int i = 0; i < 1000; i++) {
            BigInteger bigIntegerCrashlytics = crashlytics(bigInteger2.bitLength(), secureRandom);
            if (bigIntegerCrashlytics.compareTo(bigInteger) >= 0 && bigIntegerCrashlytics.compareTo(bigInteger2) <= 0) {
                return bigIntegerCrashlytics;
            }
        }
        return crashlytics(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
    }

    public static BigInteger billing(int i, int i2, byte[] bArr) {
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger crashlytics(int i, SecureRandom secureRandom) {
        return new BigInteger(1, loadAd(i, secureRandom));
    }

    public static BigInteger isPro(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            C8339l.metrica("'M' must be odd");
            return null;
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        BigInteger bigInteger3 = loadAd;
        if (bigInteger.equals(bigInteger3)) {
            return yandex;
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger3;
        }
        int iBitLength = bigInteger.bitLength();
        int[] iArrVip = AbstractC4952l.vip(iBitLength, bigInteger);
        int[] iArrVip2 = AbstractC4952l.vip(iBitLength, bigInteger2);
        int length = iArrVip.length;
        int[] iArr = new int[length];
        if (AbstractC6974l.vip(iArrVip, iArrVip2, iArr)) {
            return AbstractC4952l.m1651strictfp(iArr, length);
        }
        throw new ArithmeticException("BigInteger not invertible.");
    }

    public static byte[] loadAd(int i, SecureRandom secureRandom) {
        if (i < 1) {
            C8339l.metrica("bitLength must be at least 1");
            return null;
        }
        int i2 = (i + 7) / 8;
        byte[] bArr = new byte[i2];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i2 * 8) - i))));
        return bArr;
    }

    public static int mopub(BigInteger bigInteger) {
        if (bigInteger.equals(yandex)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static BigInteger purchase(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i < 2) {
            C8339l.metrica("bitLength < 2");
            return null;
        }
        BigInteger bigInteger2 = crashlytics;
        if (i == 2) {
            return secureRandom.nextInt() < 0 ? bigInteger2 : amazon;
        }
        do {
            byte[] bArrLoadAd = loadAd(i, secureRandom);
            bArrLoadAd[0] = (byte) (((byte) (1 << (7 - ((bArrLoadAd.length * 8) - i)))) | bArrLoadAd[0]);
            int length = bArrLoadAd.length - 1;
            bArrLoadAd[length] = (byte) (bArrLoadAd[length] | 1);
            bigInteger = new BigInteger(1, bArrLoadAd);
            if (i > billing) {
                while (!bigInteger.gcd(purchase).equals(loadAd)) {
                    bigInteger = bigInteger.add(bigInteger2);
                }
            }
        } while (!bigInteger.isProbablePrime(i2));
        return bigInteger;
    }

    public static BigInteger subs(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            C8339l.metrica("'M' must be odd");
            return null;
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int iBitLength = bigInteger.bitLength();
        int[] iArrVip = AbstractC4952l.vip(iBitLength, bigInteger);
        int[] iArrVip2 = AbstractC4952l.vip(iBitLength, bigInteger2);
        int length = iArrVip.length;
        int[] iArr = new int[length];
        if (AbstractC6974l.remoteconfig(iArrVip, iArrVip2, iArr) != 0) {
            return AbstractC4952l.m1651strictfp(iArr, length);
        }
        throw new ArithmeticException("BigInteger not invertible.");
    }

    public static byte[] yandex(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length > i) {
            C8339l.metrica("standard length exceeded for value");
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, i2, bArr, i - length, length);
        return bArr;
    }
}
