package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؚؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6974l {
    public static final C15578l yandex = new C15578l(1806309936, false, new C1590l(23));
    public static final C15578l loadAd = new C15578l(670771249, false, new C1590l(24));
    public static final C15578l crashlytics = new C15578l(-1808077471, false, new C1590l(25));

    public static void Signature(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr3[0];
        int i3 = 1;
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        long j = i2;
        long j2 = iArr[0];
        long j3 = i4;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i5;
        long j7 = i6;
        long j8 = ((j4 * j7) + (j2 * j6)) >> 30;
        int i7 = 1;
        long j9 = j5 >> 30;
        while (i7 < i) {
            long j10 = iArr[i7];
            int i8 = i3;
            long j11 = j6;
            long j12 = iArr2[i7];
            long jRemoteconfig = AbstractC0653l.remoteconfig(j3, j12, j * j10, j9);
            long j13 = j7;
            long jRemoteconfig2 = AbstractC0653l.remoteconfig(j13, j12, j11 * j10, j8);
            int i9 = i7 - 1;
            iArr[i9] = ((int) jRemoteconfig) & 1073741823;
            j9 = jRemoteconfig >> 30;
            iArr2[i9] = ((int) jRemoteconfig2) & 1073741823;
            j8 = jRemoteconfig2 >> 30;
            i7++;
            i3 = i8;
            j7 = j13;
            j6 = j11;
        }
        int i10 = i - i3;
        iArr[i10] = (int) j9;
        iArr2[i10] = (int) j8;
    }

    public static void admob(AbstractC8859l abstractC8859l) {
        if (abstractC8859l.firebase(false, false)) {
            return;
        }
        C8339l.smaato("Invalid result");
    }

    public static AbstractC8859l ads(AbstractC8859l abstractC8859l, BigInteger bigInteger, AbstractC8859l abstractC8859l2, BigInteger bigInteger2) {
        AbstractC8859l abstractC8859lSubs;
        AbstractC8859l abstractC8859lYandex;
        AbstractC8859l abstractC8859lLoadAd;
        int[] iArr = AbstractC6660l.f14008l;
        AbstractC11918l abstractC11918l = abstractC8859l.yandex;
        if (!abstractC11918l.subs(abstractC8859l2.yandex)) {
            C8339l.metrica("Point must be on the same curve");
            return null;
        }
        AbstractC8859l abstractC8859lVip = abstractC11918l.vip(abstractC8859l2);
        if ((abstractC11918l instanceof AbstractC7399l) && ((AbstractC7399l) abstractC11918l).Signature()) {
            AbstractC8859l abstractC8859lYandex2 = abstractC8859l.vip(bigInteger).yandex(abstractC8859lVip.vip(bigInteger2));
            admob(abstractC8859lYandex2);
            return abstractC8859lYandex2;
        }
        C2723l c2723l = abstractC11918l.mopub;
        int i = 8;
        boolean z = true;
        boolean z2 = false;
        if (!(c2723l instanceof C2723l)) {
            boolean z3 = bigInteger.signum() < 0;
            boolean z4 = bigInteger2.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int iMopub = AbstractC6660l.mopub(bigIntegerAbs.bitLength(), 8, iArr);
            int iMopub2 = AbstractC6660l.mopub(bigIntegerAbs2.bitLength(), 8, iArr);
            C16556l c16556lAdmob = AbstractC6660l.admob(abstractC8859l, iMopub);
            AbstractC11918l abstractC11918l2 = abstractC8859l.yandex;
            C16556l c16556lAdmob2 = AbstractC6660l.admob(abstractC8859lVip, iMopub2);
            int iPurchase = AbstractC11173l.purchase(abstractC11918l2);
            if (z3 || z4 || bigInteger.bitLength() > iPurchase || bigInteger2.bitLength() > iPurchase || c16556lAdmob.yandex > 0 || c16556lAdmob2.yandex > 0) {
                abstractC8859lSubs = subs(z3 ? c16556lAdmob.amazon : c16556lAdmob.crashlytics, z3 ? c16556lAdmob.crashlytics : c16556lAdmob.amazon, AbstractC6660l.purchase(Math.min(8, c16556lAdmob.billing), bigIntegerAbs), z4 ? c16556lAdmob2.amazon : c16556lAdmob2.crashlytics, z4 ? c16556lAdmob2.crashlytics : c16556lAdmob2.amazon, AbstractC6660l.purchase(Math.min(8, c16556lAdmob2.billing), bigIntegerAbs2));
            } else {
                int iPurchase2 = AbstractC11173l.purchase(abstractC11918l2);
                if (bigInteger.bitLength() > iPurchase2 || bigInteger2.bitLength() > iPurchase2) {
                    C8339l.smaato("fixed-point comb doesn't support scalars larger than the curve order");
                    return null;
                }
                AbstractC11918l abstractC11918l3 = abstractC8859l.yandex;
                int i2 = 22;
                C16364l c16364l = (C16364l) abstractC11918l3.adcel(abstractC8859l, "bc_fixed_point", new C3797l(abstractC11918l3, abstractC8859l, i2));
                AbstractC11918l abstractC11918l4 = abstractC8859lVip.yandex;
                C16364l c16364l2 = (C16364l) abstractC11918l4.adcel(abstractC8859lVip, "bc_fixed_point", new C3797l(abstractC11918l4, abstractC8859lVip, i2));
                AbstractC17780l abstractC17780l = c16364l.loadAd;
                AbstractC17780l abstractC17780l2 = c16364l2.loadAd;
                int i3 = c16364l.crashlytics;
                if (i3 != c16364l2.crashlytics) {
                    C16732l c16732l = new C16732l(0);
                    abstractC8859lYandex = c16732l.loadAd(abstractC8859l, bigInteger);
                    abstractC8859lLoadAd = c16732l.loadAd(abstractC8859lVip, bigInteger2);
                } else {
                    int i4 = ((iPurchase2 + i3) - 1) / i3;
                    AbstractC8859l abstractC8859lRemoteconfig = abstractC11918l2.remoteconfig();
                    int i5 = i3 * i4;
                    int[] iArrVip = AbstractC4952l.vip(i5, bigInteger);
                    int[] iArrVip2 = AbstractC4952l.vip(i5, bigInteger2);
                    int i6 = i5 - 1;
                    for (int i7 = 0; i7 < i4; i7++) {
                        int i8 = 0;
                        int i9 = 0;
                        for (int i10 = i6 - i7; i10 >= 0; i10 -= i4) {
                            int i11 = i10 >>> 5;
                            int i12 = i10 & 31;
                            int i13 = iArrVip[i11] >>> i12;
                            i9 = ((i9 ^ (i13 >>> 1)) << 1) ^ i13;
                            int i14 = iArrVip2[i11] >>> i12;
                            i8 = ((i8 ^ (i14 >>> 1)) << 1) ^ i14;
                        }
                        abstractC8859lRemoteconfig = abstractC8859lRemoteconfig.isVip(abstractC17780l.mopub(i9).yandex(abstractC17780l2.mopub(i8)));
                    }
                    abstractC8859lYandex = abstractC8859lRemoteconfig.yandex(c16364l.yandex);
                    abstractC8859lLoadAd = c16364l2.yandex;
                }
                abstractC8859lSubs = abstractC8859lYandex.yandex(abstractC8859lLoadAd);
            }
            admob(abstractC8859lSubs);
            return abstractC8859lSubs;
        }
        int i15 = 2;
        AbstractC8859l[] abstractC8859lArr = {abstractC8859l, abstractC8859lVip};
        BigInteger[] bigIntegerArr = {bigInteger, bigInteger2};
        BigInteger bigInteger3 = abstractC8859lArr[0].yandex.amazon;
        int i16 = 4;
        BigInteger[] bigIntegerArr2 = new BigInteger[4];
        int i17 = 0;
        for (int i18 = 0; i18 < 2; i18++) {
            BigInteger[] bigIntegerArrYandex = c2723l.yandex(bigIntegerArr[i18].mod(bigInteger3));
            int i19 = i17 + 1;
            bigIntegerArr2[i17] = bigIntegerArrYandex[0];
            i17 += 2;
            bigIntegerArr2[i19] = bigIntegerArrYandex[1];
        }
        boolean[] zArr = new boolean[4];
        C16556l[] c16556lArr = new C16556l[4];
        byte[][] bArr = new byte[4][];
        C7026l c7026l = c2723l.loadAd;
        int i20 = 0;
        while (i20 < i15) {
            int i21 = i20 << 1;
            int i22 = i21 + 1;
            BigInteger bigInteger4 = bigIntegerArr2[i21];
            zArr[i21] = bigInteger4.signum() < 0 ? z : z2;
            BigInteger bigIntegerAbs3 = bigInteger4.abs();
            BigInteger bigInteger5 = bigIntegerArr2[i22];
            zArr[i22] = bigInteger5.signum() < 0 ? z : z2;
            boolean z5 = z;
            BigInteger bigIntegerAbs4 = bigInteger5.abs();
            int iMopub3 = AbstractC6660l.mopub(Math.max(bigIntegerAbs3.bitLength(), bigIntegerAbs4.bitLength()), i, iArr);
            AbstractC8859l abstractC8859l3 = abstractC8859lArr[i20];
            C16556l c16556lAdmob3 = AbstractC6660l.admob(abstractC8859l3, iMopub3);
            boolean[] zArr2 = zArr;
            C16556l[] c16556lArr2 = c16556lArr;
            AbstractC8859l abstractC8859l4 = ((C2700l) abstractC8859l3.yandex.adcel(abstractC8859l3, "bc_endo", new C10023l((Object) c2723l, (Object) abstractC8859l3, false))).loadAd;
            C16556l c16556l = (C16556l) abstractC8859l4.yandex.adcel(abstractC8859l4, "bc_wnaf", new C13568l(c16556lAdmob3, c7026l, 28));
            int iMin = Math.min(8, c16556lAdmob3.billing);
            int iMin2 = Math.min(8, c16556l.billing);
            c16556lArr2[i21] = c16556lAdmob3;
            c16556lArr2[i22] = c16556l;
            bArr[i21] = AbstractC6660l.purchase(iMin, bigIntegerAbs3);
            bArr[i22] = AbstractC6660l.purchase(iMin2, bigIntegerAbs4);
            i20++;
            zArr = zArr2;
            c16556lArr = c16556lArr2;
            z = z5;
            i16 = 4;
            i15 = 2;
            i = 8;
            z2 = false;
        }
        boolean[] zArr3 = zArr;
        C16556l[] c16556lArr3 = c16556lArr;
        boolean z6 = z;
        int i23 = 0;
        int iMax = 0;
        while (i23 < i16) {
            iMax = Math.max(iMax, bArr[i23].length);
            i23++;
            i16 = 4;
        }
        AbstractC8859l abstractC8859lRemoteconfig2 = c16556lArr3[0].crashlytics[0].yandex.remoteconfig();
        int i24 = iMax - 1;
        AbstractC8859l abstractC8859lAd = abstractC8859lRemoteconfig2;
        int i25 = 0;
        while (i24 >= 0) {
            AbstractC8859l abstractC8859lYandex3 = abstractC8859lRemoteconfig2;
            for (int i26 = 0; i26 < 4; i26++) {
                byte[] bArr2 = bArr[i26];
                byte b = i24 < bArr2.length ? bArr2[i24] : (byte) 0;
                if (b != 0) {
                    int iAbs = Math.abs((int) b);
                    C16556l c16556l2 = c16556lArr3[i26];
                    abstractC8859lYandex3 = abstractC8859lYandex3.yandex(((b < 0 ? z6 : false) == zArr3[i26] ? c16556l2.crashlytics : c16556l2.amazon)[iAbs >>> 1]);
                }
            }
            if (abstractC8859lYandex3 == abstractC8859lRemoteconfig2) {
                i25++;
            } else {
                if (i25 > 0) {
                    abstractC8859lAd = abstractC8859lAd.ad(i25);
                    i25 = 0;
                }
                abstractC8859lAd = abstractC8859lAd.isVip(abstractC8859lYandex3);
            }
            i24--;
        }
        if (i25 > 0) {
            abstractC8859lAd = abstractC8859lAd.ad(i25);
        }
        admob(abstractC8859lAd);
        return abstractC8859lAd;
    }

    public static void amazon(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            while (i2 < Math.min(32, i)) {
                j |= ((long) iArr[i3]) << i2;
                i2 += 30;
                i3++;
            }
            iArr2[i4] = (int) j;
            j >>>= 32;
            i2 -= 32;
            i -= 32;
            i4++;
        }
    }

    public static void billing(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (i2 < Math.min(30, i)) {
                j |= (((long) iArr[i3]) & 4294967295L) << i2;
                i2 += 32;
                i3++;
            }
            iArr2[i4] = ((int) j) & 1073741823;
            j >>>= 30;
            i2 -= 30;
            i -= 30;
            i4++;
        }
    }

    public static AbstractC8859l crashlytics(AbstractC11918l abstractC11918l, AbstractC8859l abstractC8859l) {
        if (abstractC11918l.subs(abstractC8859l.yandex)) {
            return abstractC11918l.mopub(abstractC8859l.admob(false));
        }
        C8339l.metrica("Point must be on the same curve");
        return null;
    }

    public static boolean firebase(InterfaceC3340l interfaceC3340l) {
        return interfaceC3340l.yandex() == 1;
    }

    public static int isPro(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = (2 - (i * i2)) * i2;
        int i4 = (2 - (i * i3)) * i3;
        return (2 - (i * i4)) * i4;
    }

    public static void loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
        if (remoteconfig(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static int metrica(int[] iArr, int i) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static boolean mopub(int i, int i2, int[] iArr) {
        int i3 = i2 ^ iArr[0];
        if (i3 == 0) {
            for (int i4 = 1; i4 < i; i4++) {
                i3 |= iArr[i4];
            }
            if (i3 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int purchase(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5 = 30;
        int i6 = 1;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(((-1) << i5) | i3);
            int i10 = i3 >> iNumberOfTrailingZeros;
            i6 <<= iNumberOfTrailingZeros;
            i8 <<= iNumberOfTrailingZeros;
            i -= iNumberOfTrailingZeros;
            i5 -= iNumberOfTrailingZeros;
            if (i5 <= 0) {
                iArr[0] = i6;
                iArr[1] = i8;
                iArr[2] = i9;
                iArr[3] = i7;
                return i;
            }
            if (i <= 0) {
                i = 2 - i;
                int i11 = -i2;
                int i12 = -i6;
                int i13 = -i8;
                i4 = ((-1) >>> (32 - (i > i5 ? i5 : i))) & 63 & (((i10 * i10) - 2) * i10 * i11);
                i10 = i11;
                i2 = i10;
                int i14 = i9;
                i9 = i12;
                i6 = i14;
                int i15 = i7;
                i7 = i13;
                i8 = i15;
            } else {
                i4 = ((-1) >>> (32 - (i > i5 ? i5 : i))) & 15 & (((((i2 + 1) & 4) << 1) + i2) * (-i10));
            }
            i3 = i10 + (i2 * i4);
            i9 += i6 * i4;
            i7 += i4 * i8;
        }
    }

    public static int remoteconfig(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int i = 1;
        int iNumberOfLeadingZeros = (length * 32) - Integer.numberOfLeadingZeros(iArr[length - 1]);
        int i2 = 30;
        int i3 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        iArr5[0] = 1;
        billing(iNumberOfLeadingZeros, iArr2, iArr7);
        billing(iNumberOfLeadingZeros, iArr, iArr8);
        System.arraycopy(iArr8, 0, iArr6, 0, i3);
        int iIsPro = isPro(iArr8[0]);
        int i4 = 0;
        int i5 = (int) (((((long) iNumberOfLeadingZeros) * 150964) + 99243) >>> 16);
        int i6 = 0;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = iArr6[i4];
            int i9 = iArr7[i4];
            int i10 = i6;
            int i11 = i8;
            int i12 = i4;
            int i13 = i3;
            int i14 = iIsPro;
            int[] iArr9 = iArr4;
            int i15 = i12;
            int i16 = i15;
            int i17 = i16;
            int i18 = 1073741824;
            int i19 = i;
            int i20 = 1073741824;
            while (i15 < i2) {
                int i21 = i2;
                int i22 = i10 >> 31;
                int i23 = i15;
                int i24 = -(i9 & 1);
                int i25 = i9 - ((i11 ^ i22) & i24);
                int i26 = i17 - ((i18 ^ i22) & i24);
                int i27 = i20 - ((i16 ^ i22) & i24);
                int i28 = (~i22) & i24;
                i10 = (i10 ^ i28) + 1;
                i11 += i25 & i28;
                i18 += i26 & i28;
                i16 += i28 & i27;
                i9 = i25 >> 1;
                i17 = i26 >> 1;
                i20 = i27 >> 1;
                i15 = i23 + 1;
                i2 = i21;
            }
            int[] iArr10 = {i18, i16, i17, i20};
            iIsPro = i14;
            i3 = i13;
            iArr4 = iArr9;
            tapsense(i3, iIsPro, iArr4, iArr5, iArr10, iArr8);
            Signature(i3, iArr6, iArr7, iArr10);
            i7 += 30;
            i4 = i12;
            i6 = i10;
            i = i19;
        }
        int i29 = i4;
        int i30 = i;
        int i31 = i3 - 1;
        int i32 = iArr6[i31] >> 31;
        int i33 = i29;
        int i34 = i33;
        while (i33 < i31) {
            int i35 = ((iArr6[i33] ^ i32) - i32) + i34;
            iArr6[i33] = i35 & 1073741823;
            i34 = i35 >> 30;
            i33++;
        }
        iArr6[i31] = ((iArr6[i31] ^ i32) - i32) + i34;
        int i36 = iArr4[i31] >> 31;
        int i37 = i29;
        int i38 = i37;
        while (i37 < i31) {
            int i39 = (((iArr4[i37] + (iArr8[i37] & i36)) ^ i32) - i32) + i38;
            iArr4[i37] = i39 & 1073741823;
            i38 = i39 >> 30;
            i37++;
        }
        int i40 = (((iArr4[i31] + (i36 & iArr8[i31])) ^ i32) - i32) + i38;
        iArr4[i31] = i40;
        int i41 = i40 >> 31;
        int i42 = i29;
        int i43 = i42;
        while (i42 < i31) {
            int i44 = iArr4[i42] + (iArr8[i42] & i41) + i43;
            iArr4[i42] = i44 & 1073741823;
            i43 = i44 >> 30;
            i42++;
        }
        iArr4[i31] = iArr4[i31] + (i41 & iArr8[i31]) + i43;
        amazon(iNumberOfLeadingZeros, iArr4, iArr3);
        int i45 = iArr6[i29] ^ 1;
        for (int i46 = i30; i46 < i3; i46++) {
            i45 |= iArr6[i46];
        }
        int i47 = (~i45) & (i45 - 1);
        int i48 = iArr7[i29];
        for (int i49 = i30; i49 < i3; i49++) {
            i48 |= iArr7[i49];
        }
        return (i47 & ((~i48) & (i48 - 1))) >> 31;
    }

    public static final boolean smaato(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null || !AbstractC12024l.appmetrica(message, "No space left on device", false)) {
            return smaato(th.getCause());
        }
        return true;
    }

    public static AbstractC8859l startapp(AbstractC8859l abstractC8859l, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        AbstractC8859l abstractC8859lRemoteconfig = abstractC8859l.yandex.remoteconfig();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                abstractC8859lRemoteconfig = abstractC8859l;
            }
            for (int i = 1; i < iBitLength; i++) {
                abstractC8859l = abstractC8859l.advert();
                if (bigIntegerAbs.testBit(i)) {
                    abstractC8859lRemoteconfig = abstractC8859lRemoteconfig.yandex(abstractC8859l);
                }
            }
        }
        return bigInteger.signum() < 0 ? abstractC8859lRemoteconfig.metrica() : abstractC8859lRemoteconfig;
    }

    public static AbstractC8859l subs(AbstractC8859l[] abstractC8859lArr, AbstractC8859l[] abstractC8859lArr2, byte[] bArr, AbstractC8859l[] abstractC8859lArr3, AbstractC8859l[] abstractC8859lArr4, byte[] bArr2) {
        AbstractC8859l abstractC8859lYandex;
        int iMax = Math.max(bArr.length, bArr2.length);
        AbstractC8859l abstractC8859lRemoteconfig = abstractC8859lArr[0].yandex.remoteconfig();
        int i = iMax - 1;
        int i2 = 0;
        AbstractC8859l abstractC8859lIsVip = abstractC8859lRemoteconfig;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : (byte) 0;
            byte b2 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    abstractC8859lYandex = abstractC8859lRemoteconfig.yandex((b < 0 ? abstractC8859lArr2 : abstractC8859lArr)[Math.abs((int) b) >>> 1]);
                } else {
                    abstractC8859lYandex = abstractC8859lRemoteconfig;
                }
                if (b2 != 0) {
                    abstractC8859lYandex = abstractC8859lYandex.yandex((b2 < 0 ? abstractC8859lArr4 : abstractC8859lArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    abstractC8859lIsVip = abstractC8859lIsVip.ad(i2);
                    i2 = 0;
                }
                abstractC8859lIsVip = abstractC8859lIsVip.isVip(abstractC8859lYandex);
            }
            i--;
        }
        return i2 > 0 ? abstractC8859lIsVip.ad(i2) : abstractC8859lIsVip;
    }

    public static int subscription(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = iArr[i2];
        int i4 = iArr2[i2];
        int i5 = i - 2;
        if (((i5 >> 31) | ((i3 >> 31) ^ i3) | ((i4 >> 31) ^ i4)) != 0) {
            return i;
        }
        iArr[i5] = (i3 << 30) | iArr[i5];
        iArr2[i5] = iArr2[i5] | (i4 << 30);
        return i - 1;
    }

    public static void tapsense(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j7 * j4) + (j2 * j6);
        int i14 = i11 - (((((int) j5) * i2) + i11) & 1073741823);
        long j9 = i13;
        long j10 = i14;
        long j11 = (j9 * j10) + j5;
        long j12 = i12 - (((((int) j8) * i2) + i12) & 1073741823);
        char c = 30;
        long j13 = j11 >> 30;
        long j14 = ((j9 * j12) + j8) >> 30;
        int i15 = 1;
        while (i15 < i3) {
            int i16 = iArr4[i15];
            char c2 = c;
            long j15 = j12;
            long j16 = iArr[i15];
            long j17 = j * j16;
            long j18 = iArr2[i15];
            long j19 = i16;
            long j20 = j10;
            long jRemoteconfig = AbstractC0653l.remoteconfig(j19, j20, (j3 * j18) + j17, j13);
            long jRemoteconfig2 = AbstractC0653l.remoteconfig(j19, j15, (j18 * j7) + (j6 * j16), j14);
            int i17 = i15 - 1;
            iArr[i17] = ((int) jRemoteconfig) & 1073741823;
            j13 = jRemoteconfig >> c2;
            iArr2[i17] = ((int) jRemoteconfig2) & 1073741823;
            j14 = jRemoteconfig2 >> c2;
            i15++;
            i3 = i;
            c = c2;
            j10 = j20;
            j12 = j15;
        }
        iArr[i8] = (int) j13;
        iArr2[i8] = (int) j14;
    }

    public static boolean vip(int[] iArr, int[] iArr2, int[] iArr3) {
        int iMopub;
        int length = iArr.length;
        int i = length * 32;
        int i2 = length - 1;
        int iNumberOfLeadingZeros = i - Integer.numberOfLeadingZeros(iArr[i2]);
        int i3 = (iNumberOfLeadingZeros + 29) / 30;
        while (true) {
            if (i2 < 0) {
                iMopub = 0;
                break;
            }
            int i4 = iArr2[i2];
            if (i4 != 0) {
                iMopub = AbstractC14289l.mopub(i4) + (i2 * 32);
                break;
            }
            i2--;
        }
        int i5 = iNumberOfLeadingZeros - iMopub;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        iArr6[0] = 1;
        billing(iNumberOfLeadingZeros, iArr2, iArr8);
        billing(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i3);
        int iPurchase = -i5;
        int iIsPro = isPro(iArr9[0]);
        int i6 = (int) (((((long) iNumberOfLeadingZeros) * 188898) + ((long) (iNumberOfLeadingZeros < 46 ? 308405 : 181188))) >>> 16);
        int iSubscription = i3;
        while (!mopub(iSubscription, 0, iArr8)) {
            if (i5 >= i6) {
                return false;
            }
            i5 += 30;
            iPurchase = purchase(iPurchase, iArr7[0], iArr8[0], iArr4);
            tapsense(i3, iIsPro, iArr5, iArr6, iArr4, iArr9);
            Signature(iSubscription, iArr7, iArr8, iArr4);
            iSubscription = subscription(iSubscription, iArr7, iArr8);
        }
        int i7 = iArr7[iSubscription - 1] >> 31;
        int iMetrica = iArr5[i3 - 1] >> 31;
        if (iMetrica < 0) {
            iMetrica = yandex(i3, iArr5, iArr9);
        }
        if (i7 < 0) {
            iMetrica = metrica(iArr5, i3);
            metrica(iArr7, iSubscription);
        }
        if (!mopub(iSubscription, 1, iArr7)) {
            return false;
        }
        if (iMetrica < 0) {
            yandex(i3, iArr5, iArr9);
        }
        amazon(iNumberOfLeadingZeros, iArr5, iArr3);
        return true;
    }

    public static int yandex(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4] + iArr2[i4] + i3;
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = iArr[i2] + iArr2[i2] + i3;
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public abstract InterfaceC13789l adcel(InterfaceC13789l interfaceC13789l);
}
