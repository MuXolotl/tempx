package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌُّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8737l {
    public static final BigInteger admob;
    public static final BigInteger subs;
    public int amazon;
    public boolean billing;
    public int crashlytics;
    public int loadAd;
    public int mopub;
    public SecureRandom purchase;
    public final AbstractC7389l yandex;

    static {
        BigInteger.valueOf(0L);
        admob = BigInteger.valueOf(1L);
        subs = BigInteger.valueOf(2L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8737l() {
        this(new C0655l());
        int i = AbstractC14832l.yandex;
    }

    public static void loadAd(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    public final void amazon(C0531l c0531l) {
        int i = c0531l.yandex;
        int i2 = c0531l.loadAd;
        if (i < 1024 || i > 3072 || i % 1024 != 0) {
            C8339l.metrica("L values must be between 1024 and 3072 and a multiple of 1024");
            return;
        }
        if (i == 1024 && i2 != 160) {
            C8339l.metrica("N must be 160 for L = 1024");
            return;
        }
        if (i == 2048 && i2 != 224 && i2 != 256) {
            C8339l.metrica("N must be 224 or 256 for L = 2048");
            return;
        }
        if (i == 3072 && i2 != 256) {
            C8339l.metrica("N must be 256 for L = 3072");
            return;
        }
        if (this.yandex.getDigestSize() * 8 < i2) {
            C8339l.smaato("Digest output size too small for value of N");
            return;
        }
        this.loadAd = i;
        this.crashlytics = i2;
        int i3 = c0531l.crashlytics;
        this.amazon = i3;
        Math.max(i <= 1024 ? 40 : (((i - 1) / 1024) * 8) + 48, (i3 + 1) / 2);
        this.purchase = c0531l.amazon;
        this.billing = true;
        this.mopub = -1;
    }

    public final void crashlytics(int i, int i2, SecureRandom secureRandom) {
        this.loadAd = i;
        this.crashlytics = i > 1024 ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 160;
        this.amazon = i2;
        Math.max(i <= 1024 ? 40 : (((i - 1) / 1024) * 8) + 48, (i2 + 1) / 2);
        this.purchase = secureRandom;
        this.billing = false;
        this.mopub = -1;
    }

    public final C12933l yandex() {
        BigInteger bigInteger;
        int i;
        BigInteger bigIntegerSubtract;
        BigInteger bigIntegerModPow;
        BigInteger bit;
        int i2;
        BigInteger bigIntegerSubtract2;
        BigInteger bigIntegerModPow2;
        BigInteger bigIntegerModPow3;
        boolean z = this.billing;
        BigInteger bigInteger2 = subs;
        int i3 = 1;
        AbstractC7389l abstractC7389l = this.yandex;
        int i4 = 0;
        BigInteger bigInteger3 = admob;
        if (!z) {
            int i5 = 20;
            byte[] bArr = new byte[20];
            byte[] bArr2 = new byte[20];
            byte[] bArr3 = new byte[20];
            byte[] bArr4 = new byte[20];
            int i6 = this.loadAd;
            int i7 = (i6 - 1) / 160;
            int i8 = i6 / 8;
            byte[] bArr5 = new byte[i8];
            if (!(abstractC7389l instanceof C0655l)) {
                C8339l.smaato("can only use SHA-1 for generating FIPS 186-2 parameters");
                return null;
            }
            loop5: while (true) {
                this.purchase.nextBytes(bArr);
                abstractC7389l.update(bArr, 0, i5);
                C0655l c0655l = (C0655l) abstractC7389l;
                c0655l.doFinal(bArr2, 0);
                System.arraycopy(bArr, 0, bArr3, 0, i5);
                loadAd(bArr3);
                abstractC7389l.update(bArr3, 0, i5);
                c0655l.doFinal(bArr3, 0);
                for (int i9 = 0; i9 != i5; i9++) {
                    bArr4[i9] = (byte) (bArr2[i9] ^ bArr3[i9]);
                }
                bArr4[0] = (byte) (bArr4[0] | (-128));
                bArr4[19] = (byte) (bArr4[19] | 1);
                bigInteger = new BigInteger(1, bArr4);
                if (bigInteger.isProbablePrime(this.amazon)) {
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
                    loadAd(bArrCrashlytics);
                    i = 0;
                    while (i < 4096) {
                        int i10 = 1;
                        while (i10 <= i7) {
                            loadAd(bArrCrashlytics);
                            abstractC7389l.update(bArrCrashlytics, 0, bArrCrashlytics.length);
                            c0655l.doFinal(bArr5, i8 - (i10 * 20));
                            i10++;
                            bArr3 = bArr3;
                            bArr4 = bArr4;
                        }
                        byte[] bArr6 = bArr3;
                        byte[] bArr7 = bArr4;
                        int i11 = i8 - (i7 * 20);
                        loadAd(bArrCrashlytics);
                        abstractC7389l.update(bArrCrashlytics, 0, bArrCrashlytics.length);
                        c0655l.doFinal(bArr2, 0);
                        System.arraycopy(bArr2, 20 - i11, bArr5, 0, i11);
                        bArr5[0] = (byte) (bArr5[0] | (-128));
                        BigInteger bigInteger4 = new BigInteger(1, bArr5);
                        bigIntegerSubtract = bigInteger4.subtract(bigInteger4.mod(bigInteger.shiftLeft(1)).subtract(bigInteger3));
                        if (bigIntegerSubtract.bitLength() == this.loadAd && bigIntegerSubtract.isProbablePrime(this.amazon)) {
                            break loop5;
                        }
                        i++;
                        bArr3 = bArr6;
                        bArr4 = bArr7;
                    }
                    i5 = 20;
                }
            }
            SecureRandom secureRandom = this.purchase;
            BigInteger bigIntegerDivide = bigIntegerSubtract.subtract(bigInteger3).divide(bigInteger);
            BigInteger bigIntegerSubtract3 = bigIntegerSubtract.subtract(bigInteger2);
            do {
                bigIntegerModPow = AbstractC16784l.amazon(bigInteger2, bigIntegerSubtract3, secureRandom).modPow(bigIntegerDivide, bigIntegerSubtract);
            } while (bigIntegerModPow.bitLength() <= 1);
            return new C12933l(bigIntegerSubtract, bigInteger, bigIntegerModPow, new C8312l(bArr, i, 0));
        }
        int digestSize = abstractC7389l.getDigestSize() * 8;
        int i12 = this.crashlytics / 8;
        byte[] bArr8 = new byte[i12];
        int i13 = this.loadAd;
        int i14 = i13 - 1;
        int i15 = i14 / digestSize;
        int i16 = i14 % digestSize;
        int i17 = i13 / 8;
        byte[] bArr9 = new byte[i17];
        int digestSize2 = abstractC7389l.getDigestSize();
        byte[] bArr10 = new byte[digestSize2];
        loop0: while (true) {
            this.purchase.nextBytes(bArr8);
            abstractC7389l.update(bArr8, i4, i12);
            abstractC7389l.doFinal(bArr10, i4);
            bit = new BigInteger(i3, bArr10).mod(bigInteger3.shiftLeft(this.crashlytics - i3)).setBit(i4).setBit(this.crashlytics - i3);
            if (bit.isProbablePrime(this.amazon)) {
                byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArr8);
                int i18 = this.loadAd * 4;
                i2 = i4;
                while (i2 < i18) {
                    int i19 = 1;
                    while (i19 <= i15) {
                        loadAd(bArrCrashlytics2);
                        abstractC7389l.update(bArrCrashlytics2, 0, bArrCrashlytics2.length);
                        abstractC7389l.doFinal(bArr9, i17 - (i19 * digestSize2));
                        i19++;
                        i18 = i18;
                        i17 = i17;
                    }
                    int i20 = i18;
                    int i21 = i17;
                    int i22 = i21 - (i15 * digestSize2);
                    loadAd(bArrCrashlytics2);
                    abstractC7389l.update(bArrCrashlytics2, 0, bArrCrashlytics2.length);
                    abstractC7389l.doFinal(bArr10, 0);
                    System.arraycopy(bArr10, digestSize2 - i22, bArr9, 0, i22);
                    bArr9[0] = (byte) (bArr9[0] | (-128));
                    BigInteger bigInteger5 = new BigInteger(1, bArr9);
                    bigIntegerSubtract2 = bigInteger5.subtract(bigInteger5.mod(bit.shiftLeft(1)).subtract(bigInteger3));
                    if (bigIntegerSubtract2.bitLength() == this.loadAd && bigIntegerSubtract2.isProbablePrime(this.amazon)) {
                        break loop0;
                    }
                    i2++;
                    i18 = i20;
                    i17 = i21;
                    i4 = 0;
                }
                i3 = 1;
            }
        }
        int i23 = this.mopub;
        if (i23 >= 0) {
            BigInteger bigIntegerDivide2 = bigIntegerSubtract2.subtract(bigInteger3).divide(bit);
            byte[] bArrCrashlytics3 = AbstractC8535l.crashlytics("6767656E");
            int length = bArrCrashlytics3.length + i12;
            int i24 = length + 3;
            byte[] bArr11 = new byte[i24];
            int i25 = 0;
            System.arraycopy(bArr8, 0, bArr11, 0, i12);
            System.arraycopy(bArrCrashlytics3, 0, bArr11, i12, bArrCrashlytics3.length);
            bArr11[length] = (byte) i23;
            byte[] bArr12 = new byte[abstractC7389l.getDigestSize()];
            int i26 = 1;
            while (true) {
                if (i26 >= 65536) {
                    bigIntegerModPow3 = null;
                    break;
                }
                loadAd(bArr11);
                abstractC7389l.update(bArr11, i25, i24);
                abstractC7389l.doFinal(bArr12, i25);
                bigIntegerModPow3 = new BigInteger(1, bArr12).modPow(bigIntegerDivide2, bigIntegerSubtract2);
                if (bigIntegerModPow3.compareTo(bigInteger2) >= 0) {
                    break;
                }
                i26++;
                i25 = 0;
            }
            if (bigIntegerModPow3 != null) {
                return new C12933l(bigIntegerSubtract2, bit, bigIntegerModPow3, new C8312l(bArr8, i2, 0));
            }
        }
        SecureRandom secureRandom2 = this.purchase;
        BigInteger bigIntegerDivide3 = bigIntegerSubtract2.subtract(bigInteger3).divide(bit);
        BigInteger bigIntegerSubtract4 = bigIntegerSubtract2.subtract(bigInteger2);
        do {
            bigIntegerModPow2 = AbstractC16784l.amazon(bigInteger2, bigIntegerSubtract4, secureRandom2).modPow(bigIntegerDivide3, bigIntegerSubtract2);
        } while (bigIntegerModPow2.bitLength() <= 1);
        return new C12933l(bigIntegerSubtract2, bit, bigIntegerModPow2, new C8312l(bArr8, i2, 0));
    }

    public C8737l(AbstractC7389l abstractC7389l) {
        this.yandex = abstractC7389l;
    }
}
