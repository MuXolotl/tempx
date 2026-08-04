package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٌۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18733l {
    public static final BigInteger amazon = BigInteger.valueOf(1);
    public static final BigInteger purchase = BigInteger.valueOf(2);
    public SecureRandom crashlytics;
    public int loadAd;
    public int yandex;

    public final BigInteger crashlytics(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = amazon;
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCrashlytics = AbstractC16784l.crashlytics(iBitLength, this.crashlytics);
            if (bigIntegerCrashlytics.compareTo(bigInteger3) > 0 && bigIntegerCrashlytics.compareTo(bigIntegerSubtract) < 0) {
                BigInteger bigIntegerModPow = bigIntegerCrashlytics.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger3) != 0) {
                    return bigIntegerModPow;
                }
            }
        }
    }

    public final long loadAd(long j, long j2, BigInteger[] bigIntegerArr, int i) {
        int i2;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        int i3;
        BigInteger bigInteger3;
        int[] iArr;
        long jNextInt = j;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            }
            jNextInt = this.crashlytics.nextInt() * 2;
        }
        long jNextInt2 = j2;
        while (true) {
            i2 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            jNextInt2 = (this.crashlytics.nextInt() * 2) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger5 = new BigInteger("97781173");
        BigInteger bigInteger6 = new BigInteger(Long.toString(jNextInt));
        int i4 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr2 = {i};
        int i5 = 0;
        int i6 = 0;
        while (iArr2[i5] >= 33) {
            int length = iArr2.length + 1;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = new int[length];
            System.arraycopy(iArr3, 0, iArr2, 0, length);
            i6 = i5 + 1;
            iArr2[i6] = iArr2[i5] / 2;
            i5 = i6;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i6 + 1];
        bigIntegerArr4[i6] = new BigInteger("8000000B", 16);
        int i7 = i6 - 1;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = 32;
            int i10 = iArr2[i7] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i4, bigIntegerArr5, i4, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i10 + 1];
                System.arraycopy(bigIntegerArr5, i4, bigIntegerArr2, i4, length2);
                int i11 = i4;
                while (true) {
                    bigInteger2 = purchase;
                    if (i11 >= i10) {
                        break;
                    }
                    int i12 = i11 + 1;
                    bigIntegerArr2[i12] = bigIntegerArr2[i11].multiply(bigInteger5).add(bigInteger4).mod(bigInteger2.pow(i9));
                    i11 = i12;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                int i13 = i4;
                while (i13 < i10) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i13].multiply(bigInteger2.pow(i13 * 32)));
                    i13++;
                    i4 = i4;
                }
                i3 = i4;
                bigIntegerArr2[i3] = bigIntegerArr2[i10];
                int i14 = i7 + 1;
                BigInteger bigIntegerAdd = bigInteger2.pow(iArr2[i7] - i2).divide(bigIntegerArr4[i14]).add(bigInteger2.pow(iArr2[i7] - i2).multiply(bigInteger7).divide(bigIntegerArr4[i14].multiply(bigInteger2.pow(i10 * 32))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger2);
                BigInteger bigInteger8 = amazon;
                if (bigIntegerMod.compareTo(bigInteger8) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger8);
                }
                int i15 = i3;
                while (true) {
                    BigInteger bigInteger9 = bigInteger8;
                    long j3 = i15;
                    bigInteger3 = bigInteger4;
                    BigInteger bigIntegerAdd2 = bigIntegerArr4[i14].multiply(bigIntegerAdd.add(BigInteger.valueOf(j3))).add(bigInteger9);
                    bigIntegerArr4[i7] = bigIntegerAdd2;
                    iArr = iArr2;
                    if (bigIntegerAdd2.compareTo(bigInteger2.pow(iArr[i7])) != 1) {
                        if (bigInteger2.modPow(bigIntegerArr4[i14].multiply(bigIntegerAdd.add(BigInteger.valueOf(j3))), bigIntegerArr4[i7]).compareTo(bigInteger9) == 0 && bigInteger2.modPow(bigIntegerAdd.add(BigInteger.valueOf(j3)), bigIntegerArr4[i7]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i15 += 2;
                        iArr2 = iArr;
                        bigInteger4 = bigInteger3;
                        bigInteger8 = bigInteger9;
                    } else {
                        i4 = i3;
                        bigInteger4 = bigInteger3;
                        i2 = 1;
                        bigIntegerArr3 = bigIntegerArr2;
                        i9 = 32;
                        iArr2 = iArr;
                    }
                }
            }
            i7--;
            if (i7 < 0) {
                bigIntegerArr[i3] = bigIntegerArr4[i3];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i3];
                return bigInteger.longValue();
            }
            i8++;
            i2 = 1;
            i4 = i3;
            iArr2 = iArr;
            bigInteger4 = bigInteger3;
            bigIntegerArr3 = bigIntegerArr2;
        }
        bigInteger = bigIntegerArr3[i4];
        return bigInteger.longValue();
    }

    public final int yandex(int i, int i2, BigInteger[] bigIntegerArr, int i3) {
        int i4;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        int i5;
        BigInteger[] bigIntegerArr3;
        BigInteger bigInteger3;
        int iNextInt = i;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            }
            iNextInt = this.crashlytics.nextInt() / 32768;
        }
        int iNextInt2 = i2;
        while (true) {
            i4 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.crashlytics.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger bigInteger6 = new BigInteger(Integer.toString(iNextInt));
        int i6 = 0;
        BigInteger[] bigIntegerArr4 = {bigInteger6};
        int[] iArr = {i3};
        int i7 = 0;
        int i8 = 0;
        while (iArr[i7] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i8 = i7 + 1;
            iArr[i8] = iArr[i7] / 2;
            i7 = i8;
        }
        BigInteger[] bigIntegerArr5 = new BigInteger[i8 + 1];
        int i9 = 16;
        bigIntegerArr5[i8] = new BigInteger("8003", 16);
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 < i8) {
            int i12 = iArr[i10] / i9;
            while (true) {
                int length2 = bigIntegerArr4.length;
                BigInteger[] bigIntegerArr6 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr4, i6, bigIntegerArr6, i6, bigIntegerArr4.length);
                bigIntegerArr2 = new BigInteger[i12 + 1];
                System.arraycopy(bigIntegerArr6, i6, bigIntegerArr2, i6, length2);
                int i13 = i6;
                while (true) {
                    bigInteger2 = purchase;
                    if (i13 >= i12) {
                        break;
                    }
                    int i14 = i13 + 1;
                    bigIntegerArr2[i14] = bigIntegerArr2[i13].multiply(bigInteger5).add(bigInteger4).mod(bigInteger2.pow(i9));
                    i13 = i14;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                int i15 = i6;
                while (i15 < i12) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i15].multiply(bigInteger2.pow(i15 * 16)));
                    i15++;
                    i6 = i6;
                }
                i5 = i6;
                bigIntegerArr2[i5] = bigIntegerArr2[i12];
                int i16 = i10 + 1;
                BigInteger bigIntegerAdd = bigInteger2.pow(iArr[i10] - i4).divide(bigIntegerArr5[i16]).add(bigInteger2.pow(iArr[i10] - i4).multiply(bigInteger7).divide(bigIntegerArr5[i16].multiply(bigInteger2.pow(i12 * 16))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger2);
                BigInteger bigInteger8 = amazon;
                if (bigIntegerMod.compareTo(bigInteger8) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger8);
                }
                int i17 = i5;
                while (true) {
                    bigIntegerArr3 = bigIntegerArr5;
                    long j = i17;
                    bigInteger3 = bigInteger4;
                    BigInteger bigIntegerAdd2 = bigIntegerArr5[i16].multiply(bigIntegerAdd.add(BigInteger.valueOf(j))).add(bigInteger8);
                    bigIntegerArr3[i10] = bigIntegerAdd2;
                    if (bigIntegerAdd2.compareTo(bigInteger2.pow(iArr[i10])) != 1) {
                        if (bigInteger2.modPow(bigIntegerArr3[i16].multiply(bigIntegerAdd.add(BigInteger.valueOf(j))), bigIntegerArr3[i10]).compareTo(bigInteger8) == 0 && bigInteger2.modPow(bigIntegerAdd.add(BigInteger.valueOf(j)), bigIntegerArr3[i10]).compareTo(bigInteger8) != 0) {
                            break;
                        }
                        i17 += 2;
                        bigIntegerArr5 = bigIntegerArr3;
                        bigInteger4 = bigInteger3;
                    } else {
                        i6 = i5;
                        bigIntegerArr5 = bigIntegerArr3;
                        bigIntegerArr4 = bigIntegerArr2;
                        i4 = 1;
                        bigInteger4 = bigInteger3;
                        i9 = 16;
                    }
                }
            }
            i10--;
            if (i10 < 0) {
                bigIntegerArr[i5] = bigIntegerArr3[i5];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[i5];
                return bigInteger.intValue();
            }
            i11++;
            i4 = 1;
            i9 = 16;
            i6 = i5;
            bigIntegerArr5 = bigIntegerArr3;
            bigIntegerArr4 = bigIntegerArr2;
            bigInteger4 = bigInteger3;
        }
        bigInteger = bigIntegerArr4[i6];
        return bigInteger.intValue();
    }
}
