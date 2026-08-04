package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؕٚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3493l {
    public static final BigInteger yandex = BigInteger.valueOf(1);
    public static final BigInteger loadAd = BigInteger.valueOf(2);

    static {
        BigInteger.valueOf(3L);
    }

    public static boolean crashlytics(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        String str;
        yandex(bigInteger);
        if (secureRandom == null) {
            str = "'random' cannot be null";
        } else {
            if (i >= 1) {
                if (bigInteger.bitLength() != 2) {
                    if (bigInteger.testBit(0)) {
                        BigInteger bigInteger2 = yandex;
                        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
                        BigInteger bigInteger3 = loadAd;
                        BigInteger bigIntegerSubtract2 = bigInteger.subtract(bigInteger3);
                        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
                        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
                        loop0: for (int i2 = 0; i2 < i; i2++) {
                            BigInteger bigIntegerModPow = AbstractC16784l.amazon(bigInteger3, bigIntegerSubtract2, secureRandom).modPow(bigIntegerShiftRight, bigInteger);
                            if (!bigIntegerModPow.equals(bigInteger2) && !bigIntegerModPow.equals(bigIntegerSubtract)) {
                                for (int i3 = 1; i3 < lowestSetBit; i3++) {
                                    bigIntegerModPow = bigIntegerModPow.modPow(bigInteger3, bigInteger);
                                    if (bigIntegerModPow.equals(bigIntegerSubtract)) {
                                        continue;
                                    } else {
                                        if (bigIntegerModPow.equals(bigInteger2)) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
            str = "'iterations' must be > 0";
        }
        C8339l.metrica(str);
        return false;
    }

    public static boolean loadAd(BigInteger bigInteger) {
        yandex(bigInteger);
        int iIntValue = bigInteger.mod(BigInteger.valueOf(223092870L)).intValue();
        if (iIntValue % 2 == 0 || iIntValue % 3 == 0 || iIntValue % 5 == 0 || iIntValue % 7 == 0 || iIntValue % 11 == 0 || iIntValue % 13 == 0 || iIntValue % 17 == 0 || iIntValue % 19 == 0 || iIntValue % 23 == 0) {
            return true;
        }
        int iIntValue2 = bigInteger.mod(BigInteger.valueOf(58642669L)).intValue();
        if (iIntValue2 % 29 == 0 || iIntValue2 % 31 == 0 || iIntValue2 % 37 == 0 || iIntValue2 % 41 == 0 || iIntValue2 % 43 == 0) {
            return true;
        }
        int iIntValue3 = bigInteger.mod(BigInteger.valueOf(600662303L)).intValue();
        if (iIntValue3 % 47 == 0 || iIntValue3 % 53 == 0 || iIntValue3 % 59 == 0 || iIntValue3 % 61 == 0 || iIntValue3 % 67 == 0) {
            return true;
        }
        int iIntValue4 = bigInteger.mod(BigInteger.valueOf(33984931L)).intValue();
        if (iIntValue4 % 71 == 0 || iIntValue4 % 73 == 0 || iIntValue4 % 79 == 0 || iIntValue4 % 83 == 0) {
            return true;
        }
        int iIntValue5 = bigInteger.mod(BigInteger.valueOf(89809099L)).intValue();
        if (iIntValue5 % 89 == 0 || iIntValue5 % 97 == 0 || iIntValue5 % EnergyProfile.EVCONNECTOR_TYPE_OTHER == 0 || iIntValue5 % 103 == 0) {
            return true;
        }
        int iIntValue6 = bigInteger.mod(BigInteger.valueOf(167375713L)).intValue();
        if (iIntValue6 % 107 == 0 || iIntValue6 % 109 == 0 || iIntValue6 % 113 == 0 || iIntValue6 % 127 == 0) {
            return true;
        }
        int iIntValue7 = bigInteger.mod(BigInteger.valueOf(371700317L)).intValue();
        if (iIntValue7 % 131 == 0 || iIntValue7 % 137 == 0 || iIntValue7 % 139 == 0 || iIntValue7 % 149 == 0) {
            return true;
        }
        int iIntValue8 = bigInteger.mod(BigInteger.valueOf(645328247L)).intValue();
        if (iIntValue8 % 151 == 0 || iIntValue8 % 157 == 0 || iIntValue8 % 163 == 0 || iIntValue8 % 167 == 0) {
            return true;
        }
        int iIntValue9 = bigInteger.mod(BigInteger.valueOf(1070560157L)).intValue();
        if (iIntValue9 % 173 == 0 || iIntValue9 % 179 == 0 || iIntValue9 % 181 == 0 || iIntValue9 % 191 == 0) {
            return true;
        }
        int iIntValue10 = bigInteger.mod(BigInteger.valueOf(1596463769L)).intValue();
        return iIntValue10 % 193 == 0 || iIntValue10 % 197 == 0 || iIntValue10 % 199 == 0 || iIntValue10 % 211 == 0;
    }

    public static void yandex(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            C8339l.metrica("'candidate' must be non-null and >= 2");
        }
    }
}
