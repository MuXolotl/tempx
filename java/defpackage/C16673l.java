package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٖ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16673l implements InterfaceC8145l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final BigInteger f32686l = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C2422l f32687l;

    @Override // defpackage.InterfaceC8145l
    public final C18595l purchase() {
        BigInteger bigIntegerYandex;
        BigInteger bigIntegerMultiply;
        C16673l c16673l = this;
        int i = c16673l.f32687l.f28908l;
        int i2 = (i + 1) / 2;
        int i3 = i - i2;
        int i4 = i / 2;
        int i5 = i4 - 100;
        int i6 = i / 3;
        if (i5 < i6) {
            i5 = i6;
        }
        int i7 = i >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(i4);
        BigInteger bigInteger = f32686l;
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i - 1);
        BigInteger bigIntegerShiftLeft2 = bigInteger.shiftLeft(i5);
        C18595l c18595l = null;
        boolean z = false;
        while (!z) {
            BigInteger bigInteger2 = c16673l.f32687l.f5181l;
            BigInteger bigIntegerYandex2 = c16673l.yandex(i2, bigInteger2, bigIntegerShiftLeft);
            while (true) {
                bigIntegerYandex = c16673l.yandex(i3, bigInteger2, bigIntegerShiftLeft);
                BigInteger bigIntegerAbs = bigIntegerYandex.subtract(bigIntegerYandex2).abs();
                i3 = i3;
                if (bigIntegerAbs.bitLength() >= i5 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                    bigIntegerMultiply = bigIntegerYandex2.multiply(bigIntegerYandex);
                    if (bigIntegerMultiply.bitLength() == i) {
                        if (AbstractC6660l.billing(bigIntegerMultiply) >= i7) {
                            break;
                        }
                        bigIntegerYandex2 = c16673l.yandex(i2, bigInteger2, bigIntegerShiftLeft);
                    } else {
                        bigIntegerYandex2 = bigIntegerYandex2.max(bigIntegerYandex);
                    }
                } else {
                    c16673l = this;
                    bigInteger2 = bigInteger2;
                    i = i;
                }
            }
            if (bigIntegerYandex2.compareTo(bigIntegerYandex) < 0) {
                bigIntegerYandex = bigIntegerYandex2;
                bigIntegerYandex2 = bigIntegerYandex;
            }
            BigInteger bigIntegerSubtract = bigIntegerYandex2.subtract(bigInteger);
            BigInteger bigIntegerSubtract2 = bigIntegerYandex.subtract(bigInteger);
            int i8 = i;
            BigInteger bigIntegerModInverse = bigInteger2.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                z = true;
                c18595l = new C18595l(new C6963l(false, bigIntegerMultiply, bigInteger2, true), new C6554l(bigIntegerMultiply, bigInteger2, bigIntegerModInverse, bigIntegerYandex2, bigIntegerYandex, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), AbstractC16784l.subs(bigIntegerYandex2, bigIntegerYandex), true), 7);
            }
            c16673l = this;
            i3 = i3;
            i = i8;
        }
        return c18595l;
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public final void mo274throws(C14785l c14785l) {
        this.f32687l = (C2422l) c14785l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    public final BigInteger yandex(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        int i2;
        for (int i3 = 0; i3 != i * 5; i3++) {
            BigInteger bigIntegerPurchase = AbstractC16784l.purchase(i, 1, (SecureRandom) this.f32687l.f28907l);
            BigInteger bigIntegerMod = bigIntegerPurchase.mod(bigInteger);
            BigInteger bigInteger3 = f32686l;
            if (!bigIntegerMod.equals(bigInteger3) && bigIntegerPurchase.multiply(bigIntegerPurchase).compareTo(bigInteger2) >= 0) {
                int iBitLength = bigIntegerPurchase.bitLength();
                int i4 = this.f32687l.f5180l;
                int iRemoteconfig = 4;
                if (iBitLength >= 1536) {
                    if (i4 <= 100) {
                        iRemoteconfig = 3;
                    } else if (i4 > 128) {
                        i2 = 127;
                        iRemoteconfig = AbstractC5020l.remoteconfig(i4, i2, 2, iRemoteconfig);
                    }
                } else if (iBitLength >= 1024) {
                    if (i4 > 100) {
                        if (i4 <= 112) {
                            iRemoteconfig = 5;
                        } else {
                            iRemoteconfig = AbstractC5020l.remoteconfig(i4, 111, 2, 5);
                        }
                    }
                } else if (iBitLength < 512) {
                    iRemoteconfig = i4 <= 80 ? 40 : AbstractC5020l.remoteconfig(i4, 79, 2, 40);
                } else if (i4 <= 80) {
                    iRemoteconfig = 5;
                } else {
                    iRemoteconfig = 7;
                    if (i4 > 100) {
                        i2 = 99;
                        iRemoteconfig = AbstractC5020l.remoteconfig(i4, i2, 2, iRemoteconfig);
                    }
                }
                if (!AbstractC3493l.loadAd(bigIntegerPurchase) && AbstractC3493l.crashlytics(bigIntegerPurchase, (SecureRandom) this.f32687l.f28907l, iRemoteconfig) && bigInteger.gcd(bigIntegerPurchase.subtract(bigInteger3)).equals(bigInteger3)) {
                    return bigIntegerPurchase;
                }
            }
        }
        C8339l.smaato("unable to generate prime number for RSA key");
        return null;
    }
}
