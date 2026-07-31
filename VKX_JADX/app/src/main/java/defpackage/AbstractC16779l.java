package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٖۦٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16779l {
    public static final BigInteger yandex = BigInteger.valueOf(1);
    public static final BigInteger loadAd = BigInteger.valueOf(2);

    public static BigInteger yandex(C2396l c2396l, SecureRandom secureRandom) {
        BigInteger bigIntegerAmazon;
        BigInteger bit;
        int i = c2396l.f5162l;
        if (i != 0) {
            int i2 = i >>> 2;
            do {
                bit = AbstractC16784l.crashlytics(i, secureRandom).setBit(i - 1);
            } while (AbstractC6660l.billing(bit) < i2);
            return bit;
        }
        int i3 = c2396l.f5160l;
        BigInteger bigInteger = loadAd;
        BigInteger bigIntegerShiftLeft = i3 != 0 ? yandex.shiftLeft(i3 - 1) : bigInteger;
        BigInteger bigInteger2 = c2396l.f5156l;
        if (bigInteger2 == null) {
            bigInteger2 = c2396l.f5158l;
        }
        BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger);
        int iBitLength = bigIntegerSubtract.bitLength() >>> 2;
        do {
            bigIntegerAmazon = AbstractC16784l.amazon(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
        } while (AbstractC6660l.billing(bigIntegerAmazon) < iBitLength);
        return bigIntegerAmazon;
    }
}
