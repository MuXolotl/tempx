package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؚؑۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6963l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f14629l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BigInteger f14630l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C13698l f14628l = new C13698l((byte) 0, 2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final BigInteger f14627l = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* JADX WARN: Code duplicated, block: B:123:0x020a  */
    public C6963l(boolean z, BigInteger bigInteger, BigInteger bigInteger2, boolean z2) throws Throwable {
        boolean zContainsKey;
        BigInteger bigIntegerMod;
        int iMopub;
        Throwable th;
        Throwable th2;
        C14706l c14706l;
        boolean z3;
        BigInteger bigInteger3;
        super(z);
        boolean zMopub = true;
        if (!z && (bigInteger2.intValue() & 1) == 0) {
            C8339l.metrica("RSA publicExponent is even");
            throw null;
        }
        C13698l c13698l = f14628l;
        synchronized (c13698l) {
            zContainsKey = ((WeakHashMap) c13698l.f26743l).containsKey(bigInteger);
        }
        if (!zContainsKey) {
            if (z2) {
                c13698l.subs(bigInteger);
            } else {
                if ((bigInteger.intValue() & 1) == 0) {
                    C8339l.metrica("RSA modulus is even");
                    throw null;
                }
                if (!AbstractC8151l.crashlytics("org.bouncycastle.rsa.allow_unsafe_mod")) {
                    if (AbstractC8151l.yandex(16384, "org.bouncycastle.rsa.max_size") < bigInteger.bitLength()) {
                        C8339l.metrica("RSA modulus out of range");
                        throw null;
                    }
                    BigInteger bigInteger4 = f14627l;
                    if (bigInteger.bitLength() < bigInteger4.bitLength()) {
                        bigIntegerMod = bigInteger;
                    } else {
                        bigIntegerMod = bigInteger4;
                        bigInteger4 = bigInteger;
                    }
                    BigInteger bigInteger5 = AbstractC16784l.yandex;
                    boolean z4 = false;
                    if (!bigInteger4.testBit(0)) {
                        C8339l.metrica("'M' must be odd");
                        throw null;
                    }
                    if (bigInteger4.signum() != 1) {
                        throw new ArithmeticException("BigInteger: modulus not positive");
                    }
                    bigIntegerMod = (bigIntegerMod.signum() < 0 || bigIntegerMod.bitLength() > bigInteger4.bitLength()) ? bigIntegerMod.mod(bigInteger4) : bigIntegerMod;
                    if (!bigIntegerMod.equals(AbstractC16784l.loadAd)) {
                        int iBitLength = bigInteger4.bitLength();
                        int[] iArrVip = AbstractC4952l.vip(iBitLength, bigInteger4);
                        int[] iArrVip2 = AbstractC4952l.vip(iBitLength, bigIntegerMod);
                        int length = iArrVip.length;
                        int i = length * 32;
                        int i2 = length - 1;
                        int iNumberOfLeadingZeros = i - Integer.numberOfLeadingZeros(iArrVip[i2]);
                        int iSubscription = (iNumberOfLeadingZeros + 29) / 30;
                        while (true) {
                            if (i2 < 0) {
                                iMopub = 0;
                                break;
                            }
                            int i3 = iArrVip2[i2];
                            if (i3 != 0) {
                                iMopub = AbstractC14289l.mopub(i3) + (i2 * 32);
                                break;
                            }
                            i2--;
                        }
                        int i4 = iNumberOfLeadingZeros - iMopub;
                        int[] iArr = new int[4];
                        int[] iArr2 = new int[iSubscription];
                        int[] iArr3 = new int[iSubscription];
                        int[] iArr4 = new int[iSubscription];
                        AbstractC6974l.billing(iNumberOfLeadingZeros, iArrVip2, iArr3);
                        AbstractC6974l.billing(iNumberOfLeadingZeros, iArrVip, iArr4);
                        System.arraycopy(iArr4, 0, iArr2, 0, iSubscription);
                        int iPurchase = -i4;
                        th = null;
                        int i5 = (int) (((((long) iNumberOfLeadingZeros) * 188898) + ((long) (iNumberOfLeadingZeros < 46 ? 308405 : 181188))) >>> 16);
                        while (true) {
                            if (AbstractC6974l.mopub(iSubscription, 0, iArr3)) {
                                if ((iArr2[iSubscription - 1] >> 31) < 0) {
                                    AbstractC6974l.metrica(iArr2, iSubscription);
                                }
                                zMopub = AbstractC6974l.mopub(iSubscription, 1, iArr2);
                                break;
                            } else {
                                if (i4 >= i5) {
                                    zMopub = false;
                                    break;
                                }
                                i4 += 30;
                                iPurchase = AbstractC6974l.purchase(iPurchase, iArr2[0], iArr3[0], iArr);
                                AbstractC6974l.Signature(iSubscription, iArr2, iArr3, iArr);
                                iSubscription = AbstractC6974l.subscription(iSubscription, iArr2, iArr3);
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (!zMopub) {
                        Throwable th3 = th;
                        C8339l.metrica("RSA modulus has a small prime factor");
                        throw th3;
                    }
                    int iBitLength2 = bigInteger.bitLength() / 2;
                    int iYandex = AbstractC8151l.yandex(iBitLength2 >= 1536 ? 3 : iBitLength2 >= 1024 ? 4 : iBitLength2 >= 512 ? 7 : 50, "org.bouncycastle.rsa.max_mr_tests");
                    if (iYandex > 0) {
                        SecureRandom secureRandomLoadAd = AbstractC8776l.loadAd();
                        BigInteger bigInteger6 = AbstractC3493l.yandex;
                        BigInteger bigInteger7 = AbstractC3493l.loadAd;
                        AbstractC3493l.yandex(bigInteger);
                        if (secureRandomLoadAd == null) {
                            Throwable th4 = th;
                            C8339l.metrica("'random' cannot be null");
                            throw th4;
                        }
                        boolean z5 = true;
                        if (iYandex < 1) {
                            Throwable th5 = th;
                            C8339l.metrica("'iterations' must be > 0");
                            throw th5;
                        }
                        if (bigInteger.bitLength() == 2) {
                            c14706l = new C14706l(z4, 4);
                        } else {
                            int i6 = 4;
                            if (bigInteger.testBit(0)) {
                                BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger6);
                                BigInteger bigIntegerSubtract2 = bigInteger.subtract(bigInteger7);
                                int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
                                BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= iYandex) {
                                        th2 = th;
                                        c14706l = new C14706l(z4, 4);
                                        break;
                                    }
                                    BigInteger bigIntegerAmazon = AbstractC16784l.amazon(bigInteger7, bigIntegerSubtract2, secureRandomLoadAd);
                                    if (bigIntegerAmazon.gcd(bigInteger).compareTo(bigInteger6) > 0) {
                                        c14706l = new C14706l(true, 4);
                                    } else {
                                        BigInteger bigIntegerModPow = bigIntegerAmazon.modPow(bigIntegerShiftRight, bigInteger);
                                        if (!bigIntegerModPow.equals(bigInteger6) && !bigIntegerModPow.equals(bigIntegerSubtract)) {
                                            BigInteger bigIntegerModPow2 = bigIntegerModPow;
                                            int i8 = 1;
                                            while (true) {
                                                th2 = th;
                                                if (i8 >= lowestSetBit) {
                                                    z3 = false;
                                                    bigInteger3 = bigIntegerModPow2;
                                                    break;
                                                }
                                                BigInteger bigIntegerModPow3 = bigIntegerModPow2.modPow(bigInteger7, bigInteger);
                                                if (bigIntegerModPow3.equals(bigIntegerSubtract)) {
                                                    bigInteger3 = bigIntegerModPow3;
                                                    z3 = true;
                                                    break;
                                                } else if (bigIntegerModPow3.equals(bigInteger6)) {
                                                    bigInteger3 = bigIntegerModPow3;
                                                    z3 = false;
                                                    break;
                                                } else {
                                                    i8++;
                                                    bigIntegerModPow2 = bigIntegerModPow3;
                                                    th = th2;
                                                }
                                            }
                                            if (!z3) {
                                                if (!bigInteger3.equals(bigInteger6)) {
                                                    bigIntegerModPow2 = bigInteger3.modPow(bigInteger7, bigInteger);
                                                    if (bigIntegerModPow2.equals(bigInteger6)) {
                                                        bigIntegerModPow2 = bigInteger3;
                                                    }
                                                }
                                                if (bigIntegerModPow2.subtract(bigInteger6).gcd(bigInteger).compareTo(bigInteger6) <= 0) {
                                                    c14706l = new C14706l(true, 4);
                                                    break;
                                                } else {
                                                    c14706l = new C14706l(true, 4);
                                                    break;
                                                }
                                            }
                                        } else {
                                            th2 = th;
                                        }
                                        i7++;
                                        th = th2;
                                    }
                                }
                                if (!c14706l.f28767l) {
                                    C8339l.metrica("RSA modulus is not composite");
                                    throw th2;
                                }
                            } else {
                                c14706l = new C14706l(z5, i6);
                            }
                        }
                        th2 = th;
                        if (!c14706l.f28767l) {
                            C8339l.metrica("RSA modulus is not composite");
                            throw th2;
                        }
                    }
                    c13698l.subs(bigInteger);
                }
            }
        }
        this.f14630l = bigInteger;
        this.f14629l = bigInteger2;
    }
}
