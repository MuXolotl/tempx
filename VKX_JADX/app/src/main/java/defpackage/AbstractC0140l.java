package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0140l {
    public static final long[] yandex = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void Signature(InterfaceC2743l interfaceC2743l, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        int iPurchase;
        boolean z;
        long j = c8807l.loadAd;
        if (j == -9223372036854775807L) {
            iPurchase = 0;
        } else {
            iPurchase = interfaceC2743l.purchase(j);
            if (iPurchase == -1) {
                iPurchase = interfaceC2743l.subscription();
            }
            if (iPurchase > 0 && interfaceC2743l.firebase(iPurchase - 1) == j) {
                iPurchase--;
            }
        }
        if (j == -9223372036854775807L || iPurchase >= interfaceC2743l.subscription()) {
            z = false;
        } else {
            List listMetrica = interfaceC2743l.metrica(j);
            long jFirebase = interfaceC2743l.firebase(iPurchase);
            if (listMetrica.isEmpty()) {
                z = false;
            } else {
                long j2 = c8807l.loadAd;
                if (j2 < jFirebase) {
                    interfaceC18679l.accept(new C8755l(j2, jFirebase - j2, listMetrica));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iPurchase; i < interfaceC2743l.subscription(); i++) {
            remoteconfig(interfaceC2743l, i, interfaceC18679l);
        }
        if (c8807l.yandex) {
            if (z) {
                iPurchase--;
            }
            for (int i2 = 0; i2 < iPurchase; i2++) {
                remoteconfig(interfaceC2743l, i2, interfaceC18679l);
            }
            if (z) {
                interfaceC18679l.accept(new C8755l(interfaceC2743l.firebase(iPurchase), j - interfaceC2743l.firebase(iPurchase), interfaceC2743l.metrica(j)));
            }
        }
    }

    public static int ad(InterfaceC12353l interfaceC12353l, int i, byte[] bArr, int i2, int i3, InterfaceC14009l interfaceC14009l, C13275l c13275l) {
        Object objBilling = interfaceC12353l.billing();
        InterfaceC12353l interfaceC12353l2 = interfaceC12353l;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C13275l c13275l2 = c13275l;
        int iM286throws = m286throws(objBilling, interfaceC12353l2, bArr2, i2, i4, c13275l2);
        interfaceC12353l2.yandex(objBilling);
        c13275l2.crashlytics = objBilling;
        interfaceC14009l.add(objBilling);
        while (iM286throws < i4) {
            C13275l c13275l3 = c13275l2;
            int i5 = i4;
            int iSignatures = signatures(bArr2, iM286throws, c13275l3);
            if (i != c13275l3.yandex) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC12353l interfaceC12353l3 = interfaceC12353l2;
            Object objBilling2 = interfaceC12353l3.billing();
            iM286throws = m286throws(objBilling2, interfaceC12353l3, bArr3, iSignatures, i5, c13275l3);
            interfaceC12353l2 = interfaceC12353l3;
            bArr2 = bArr3;
            i4 = i5;
            c13275l2 = c13275l3;
            interfaceC12353l2.yandex(objBilling2);
            c13275l2.crashlytics = objBilling2;
            interfaceC14009l.add(objBilling2);
        }
        return iM286throws;
    }

    public static void adcel(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        isPro(jArr, jArr3);
        metrica(jArr3, jArr2);
    }

    public static void admob(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        long j7 = jArr[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j7;
        jArr2[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void ads(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC5711l.amazon(4, jArr, jArr3);
        startapp(jArr3, jArr2);
    }

    public static int advert(byte[] bArr, int i, InterfaceC14009l interfaceC14009l, C13275l c13275l) {
        C14363l c14363l = (C14363l) interfaceC14009l;
        int iSignatures = signatures(bArr, i, c13275l);
        int i2 = c13275l.yandex + iSignatures;
        while (iSignatures < i2) {
            iSignatures = signatures(bArr, iSignatures, c13275l);
            c14363l.mopub(c13275l.yandex);
        }
        if (iSignatures == i2) {
            return iSignatures;
        }
        C11586l.billing("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static void amazon(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static int applovin(int i, byte[] bArr, int i2, int i3, InterfaceC14009l interfaceC14009l, C13275l c13275l) {
        C14363l c14363l = (C14363l) interfaceC14009l;
        int iSignatures = signatures(bArr, i2, c13275l);
        c14363l.mopub(c13275l.yandex);
        while (iSignatures < i3) {
            int iSignatures2 = signatures(bArr, iSignatures, c13275l);
            if (i != c13275l.yandex) {
                break;
            }
            iSignatures = signatures(bArr, iSignatures2, c13275l);
            c14363l.mopub(c13275l.yandex);
        }
        return iSignatures;
    }

    public static int appmetrica(byte[] bArr, int i, C13275l c13275l) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c13275l.loadAd = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c13275l.loadAd = j2;
        return i3;
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        amazon(jArr, jArr4);
        amazon(jArr2, jArr5);
        long[] jArr6 = new long[26];
        admob(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        admob(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        admob(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        admob(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        admob(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        admob(jArr3, j6 ^ j13, j8 ^ j15, jArr6, 18);
        admob(jArr3, j10 ^ jArr4[1], j12 ^ jArr5[1], jArr6, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        long j19 = j17 ^ jArr4[2];
        long j20 = jArr5[2] ^ j18;
        admob(jArr3, j17, j18, jArr6, 22);
        admob(jArr3, j19, j20, jArr6, 24);
        admob(jArr3, j2, j4, jArr6, 10);
        admob(jArr3, j6, j8, jArr6, 12);
        admob(jArr3, j10, j12, jArr6, 14);
        admob(jArr3, j14, j16, jArr6, 16);
        long j21 = jArr6[0];
        jArr3[0] = j21;
        long j22 = jArr6[9];
        jArr3[9] = j22;
        long j23 = jArr6[0];
        long j24 = jArr6[1] ^ j23;
        long j25 = j24 ^ jArr6[2];
        long j26 = j25 ^ jArr6[10];
        jArr3[1] = j26;
        long j27 = jArr6[3] ^ jArr6[4];
        long j28 = j25 ^ (j27 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j28;
        long j29 = j24 ^ j27;
        long j30 = jArr6[5] ^ jArr6[6];
        long j31 = jArr6[8];
        long j32 = (j29 ^ j30) ^ j31;
        long j33 = jArr6[13] ^ jArr6[14];
        long j34 = jArr6[18];
        long j35 = jArr6[22];
        long j36 = jArr6[24];
        long j37 = (j32 ^ j33) ^ ((j34 ^ j35) ^ j36);
        jArr3[3] = j37;
        long j38 = jArr6[7] ^ j31;
        long j39 = jArr6[9];
        long j40 = j38 ^ j39;
        long j41 = j40 ^ jArr6[17];
        jArr3[8] = j41;
        long j42 = (j40 ^ j30) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j42;
        long j43 = jArr6[19] ^ jArr6[20];
        long j44 = jArr6[25];
        long j45 = jArr6[23];
        long j46 = j43 ^ (j44 ^ j36);
        long j47 = (j46 ^ (j34 ^ j45)) ^ (j42 ^ j26);
        jArr3[4] = j47;
        long j48 = jArr6[21];
        long j49 = (j46 ^ (j28 ^ j41)) ^ (j48 ^ j35);
        jArr3[5] = j49;
        long j50 = (((((j23 ^ j32) ^ j39) ^ j33) ^ j48) ^ j45) ^ j44;
        jArr3[6] = j50;
        jArr3[0] = j21 ^ (j26 << 57);
        jArr3[1] = (j26 >>> 7) ^ (j28 << 50);
        jArr3[2] = (j28 >>> 14) ^ (j37 << 43);
        jArr3[3] = (j37 >>> 21) ^ (j47 << 36);
        jArr3[4] = (j47 >>> 28) ^ (j49 << 29);
        jArr3[5] = (j49 >>> 35) ^ (j50 << 22);
        jArr3[6] = (j50 >>> 42) ^ (j42 << 15);
        jArr3[7] = (j42 >>> 49) ^ (j41 << 8);
        jArr3[8] = (j41 >>> 56) ^ (j22 << 1);
        jArr3[9] = j22 >>> 63;
    }

    public static C16565l crashlytics(C9426l c9426l) {
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            c9426l.mo2154l(new C3005l(c5807l, c9426l, 4));
            c5807l.yandex = "Deferred.asListenableFuture";
            return c16565l;
        } catch (Exception e) {
            c16565l.loadAd(e);
            return c16565l;
        }
    }

    public static void firebase(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        billing(jArr, jArr2, jArr4);
        metrica(jArr4, jArr3);
    }

    public static int inmobi(Object obj, InterfaceC12353l interfaceC12353l, byte[] bArr, int i, int i2, int i3, C13275l c13275l) {
        C17414l c17414l = (C17414l) interfaceC12353l;
        int i4 = c13275l.purchase + 1;
        c13275l.purchase = i4;
        if (i4 >= 100) {
            C11586l.billing("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iTapsense = c17414l.tapsense(obj, bArr, i, i2, i3, c13275l);
        c13275l.purchase--;
        c13275l.crashlytics = obj;
        return iTapsense;
    }

    public static void isPro(long[] jArr, long[] jArr2) {
        AbstractC5711l.amazon(4, jArr, jArr2);
        jArr2[8] = AbstractC5711l.crashlytics((int) jArr[4]);
    }

    public static int isVip(int i, byte[] bArr, int i2, int i3, C2886l c2886l, C13275l c13275l) {
        if ((i >>> 3) == 0) {
            C11586l.billing("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iAppmetrica = appmetrica(bArr, i2, c13275l);
            c2886l.crashlytics(i, Long.valueOf(c13275l.loadAd));
            return iAppmetrica;
        }
        if (i4 == 1) {
            c2886l.crashlytics(i, Long.valueOf(m285synchronized(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iSignatures = signatures(bArr, i2, c13275l);
            int i5 = c13275l.yandex;
            if (i5 < 0) {
                C11586l.billing("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iSignatures) {
                C11586l.billing("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                c2886l.crashlytics(i, AbstractC1096l.f3033l);
            } else {
                c2886l.crashlytics(i, AbstractC1096l.isVip(iSignatures, i5, bArr));
            }
            return iSignatures + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                c2886l.crashlytics(i, Integer.valueOf(pro(i2, bArr)));
                return i2 + 4;
            }
            C11586l.billing("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        C2886l c2886lLoadAd = C2886l.loadAd();
        int i7 = c13275l.purchase + 1;
        c13275l.purchase = i7;
        if (i7 >= 100) {
            C11586l.billing("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iSignatures2 = signatures(bArr, i2, c13275l);
            int i9 = c13275l.yandex;
            if (i9 == i6) {
                i8 = i9;
                i2 = iSignatures2;
                break;
            }
            i2 = isVip(i9, bArr, iSignatures2, i3, c2886lLoadAd, c13275l);
            i8 = i9;
        }
        c13275l.purchase--;
        if (i2 > i3 || i8 != i6) {
            C11586l.billing("Failed to parse the message.");
            return 0;
        }
        c2886l.crashlytics(i, c2886lLoadAd);
        return i2;
    }

    public static int license(byte[] bArr, int i, C13275l c13275l) {
        int iSignatures = signatures(bArr, i, c13275l);
        int i2 = c13275l.yandex;
        if (i2 < 0) {
            C11586l.billing("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iSignatures) {
            C11586l.billing("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            c13275l.crashlytics = AbstractC1096l.f3033l;
            return iSignatures;
        }
        c13275l.crashlytics = AbstractC1096l.isVip(iSignatures, i2, bArr);
        return iSignatures + i2;
    }

    public static void loadAd(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void metrica(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static void mopub(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        purchase(jArr, jArr4);
        purchase(jArr2, jArr5);
        long[] jArr6 = new long[8];
        subs(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        subs(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        subs(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        subs(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        subs(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        subs(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        subs(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        subs(jArr6, j, j3, jArr7, 0);
        subs(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static int m284package(int i, byte[] bArr, int i2, int i3, C13275l c13275l) {
        if ((i >>> 3) == 0) {
            C11586l.billing("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return appmetrica(bArr, i2, c13275l);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return signatures(bArr, i2, c13275l) + c13275l.yandex;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            C11586l.billing("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = signatures(bArr, i2, c13275l);
            i6 = c13275l.yandex;
            if (i6 == i5) {
                break;
            }
            i2 = m284package(i6, bArr, i2, i3, c13275l);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        C11586l.billing("Failed to parse the message.");
        return 0;
    }

    public static int premium(int i, byte[] bArr, int i2, C13275l c13275l) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c13275l.yandex = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c13275l.yandex = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c13275l.yandex = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c13275l.yandex = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c13275l.yandex = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int pro(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static void purchase(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void remoteconfig(InterfaceC2743l interfaceC2743l, int i, InterfaceC18679l interfaceC18679l) {
        long jFirebase = interfaceC2743l.firebase(i);
        List listMetrica = interfaceC2743l.metrica(jFirebase);
        if (listMetrica.isEmpty()) {
            return;
        }
        if (i == interfaceC2743l.subscription() - 1) {
            C18073l.admob();
            return;
        }
        long jFirebase2 = interfaceC2743l.firebase(i + 1) - interfaceC2743l.firebase(i);
        if (jFirebase2 > 0) {
            interfaceC18679l.accept(new C8755l(jFirebase, jFirebase2, listMetrica));
        }
    }

    public static int signatures(byte[] bArr, int i, C13275l c13275l) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return premium(b, bArr, i2, c13275l);
        }
        c13275l.yandex = b;
        return i2;
    }

    public static void smaato(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        mopub(jArr, jArr2, jArr4);
        startapp(jArr4, jArr3);
    }

    public static void startapp(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    public static void subs(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static void subscription(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        isPro(jArr, jArr3);
        while (true) {
            metrica(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                isPro(jArr2, jArr3);
            }
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static long m285synchronized(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static void tapsense(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC5711l.amazon(4, jArr, jArr3);
        while (true) {
            startapp(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC5711l.amazon(4, jArr2, jArr3);
            }
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static int m286throws(Object obj, InterfaceC12353l interfaceC12353l, byte[] bArr, int i, int i2, C13275l c13275l) {
        int iPremium = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iPremium = premium(i3, bArr, iPremium, c13275l);
            i3 = c13275l.yandex;
        }
        int i4 = iPremium;
        if (i3 < 0 || i3 > i2 - i4) {
            C11586l.billing("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = c13275l.purchase + 1;
        c13275l.purchase = i5;
        if (i5 >= 100) {
            C11586l.billing("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        interfaceC12353l.amazon(obj, bArr, i4, i6, c13275l);
        c13275l.purchase--;
        c13275l.crashlytics = obj;
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void vip(InterfaceC1142l interfaceC1142l, C9426l c9426l) {
        ((C14750l) interfaceC1142l).mo2154l(new C6135l(interfaceC1142l, c9426l));
    }

    public static void yandex(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }
}
