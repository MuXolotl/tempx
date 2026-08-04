package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؑۛٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0586l {
    public static final BigInteger yandex = BigInteger.valueOf(1);
    public static final BigInteger loadAd = BigInteger.valueOf(2);

    public static BigInteger loadAd(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigInteger2 = loadAd;
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
        do {
            bigIntegerModPow = AbstractC16784l.amazon(bigInteger2, bigIntegerSubtract, secureRandom).modPow(bigInteger2, bigInteger);
        } while (bigIntegerModPow.equals(yandex));
        return bigIntegerModPow;
    }

    public static BigInteger[] yandex(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger bigIntegerPurchase = AbstractC16784l.purchase(i3, 2, secureRandom);
            BigInteger bigIntegerAdd = bigIntegerPurchase.shiftLeft(1).add(yandex);
            if (bigIntegerAdd.isProbablePrime(i2) && (i2 <= 2 || bigIntegerPurchase.isProbablePrime(i2 - 2))) {
                if (AbstractC6660l.billing(bigIntegerAdd) >= i4) {
                    return new BigInteger[]{bigIntegerAdd, bigIntegerPurchase};
                }
            }
        }
    }
}
