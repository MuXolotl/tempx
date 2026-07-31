package defpackage;

import androidx.recyclerview.widget.subs;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍَۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10586l {
    public static final InterfaceC17242l admob(InterfaceC17242l interfaceC17242l, boolean z, C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z2, C6402l c6402l, Function0 function0) {
        InterfaceC17242l interfaceC17242lPremium;
        if (interfaceC2186l instanceof InterfaceC2186l) {
            interfaceC17242lPremium = new C1494l(z, c2403l, interfaceC2186l, z2, c6402l, function0);
        } else if (interfaceC2186l == null) {
            interfaceC17242lPremium = new C1494l(z, c2403l, null, z2, c6402l, function0);
        } else {
            C4346l c4346l = C4346l.f8873l;
            interfaceC17242lPremium = c2403l != null ? AbstractC14631l.yandex(c4346l, c2403l, interfaceC2186l).premium(new C1494l(z, c2403l, null, z2, c6402l, function0)) : AbstractC17541l.loadAd(c4346l, new C8161l(interfaceC2186l, z, z2, c6402l, function0, 0));
        }
        return interfaceC17242l.premium(interfaceC17242lPremium);
    }

    public static void amazon(long[] jArr, long[] jArr2) {
        AbstractC5711l.amazon(6, jArr, jArr2);
        jArr2[12] = AbstractC5711l.crashlytics((int) jArr[6]);
    }

    public static InterfaceC12932l billing(InterfaceC12932l interfaceC12932l, InterfaceC12932l interfaceC12932l2) {
        return interfaceC12932l2 == C17218l.f33421l ? interfaceC12932l : (InterfaceC12932l) interfaceC12932l2.mo247l(interfaceC12932l, new C8337l(28));
    }

    public static void crashlytics(long[] jArr, long j, long j2, long[] jArr2, int i) {
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

    public static int firebase(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static final void isPro(subs subsVar, List list) {
        boolean z = subsVar instanceof C12931l;
        if (z) {
            C12931l c12931l = z ? (C12931l) subsVar : null;
            if (c12931l != null) {
                c12931l.f25379l.appmetrica(list);
                return;
            } else {
                C8339l.smaato("Target adapter has other list type! [vertical_grid]");
                return;
            }
        }
        boolean z2 = subsVar instanceof C0663l;
        if (z2) {
            C0663l c0663l = z2 ? (C0663l) subsVar : null;
            if (c0663l != null) {
                c0663l.f2135l.appmetrica(list);
                return;
            } else {
                C8339l.smaato("Target adapter has other list type! [slider]");
                return;
            }
        }
        boolean z3 = subsVar instanceof AbstractC14630l;
        if (z3) {
            AbstractC14630l abstractC14630l = z3 ? (AbstractC14630l) subsVar : null;
            if (abstractC14630l != null) {
                abstractC14630l.appmetrica(list);
            } else {
                C8339l.smaato("Target adapter has other list type! [list]");
            }
        }
    }

    public static void loadAd(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        yandex(jArr, jArr4);
        yandex(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i = 0; i < 7; i++) {
            crashlytics(jArr6, jArr4[i], jArr5[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2] ^ j;
        long j4 = j3 ^ j2;
        jArr3[1] = j4;
        long j5 = j2 ^ jArr3[3];
        long j6 = j3 ^ jArr3[4];
        long j7 = j6 ^ j5;
        jArr3[2] = j7;
        long j8 = j5 ^ jArr3[5];
        long j9 = j6 ^ jArr3[6];
        long j10 = j9 ^ j8;
        jArr3[3] = j10;
        long j11 = j8 ^ jArr3[7];
        long j12 = j9 ^ jArr3[8];
        long j13 = j12 ^ j11;
        jArr3[4] = j13;
        long j14 = j11 ^ jArr3[9];
        long j15 = j12 ^ jArr3[10];
        long j16 = j15 ^ j14;
        jArr3[5] = j16;
        long j17 = j14 ^ jArr3[11];
        long j18 = j15 ^ jArr3[12];
        long j19 = j18 ^ j17;
        jArr3[6] = j19;
        long j20 = (j17 ^ jArr3[13]) ^ j18;
        jArr3[7] = j ^ j20;
        jArr3[8] = j4 ^ j20;
        jArr3[9] = j7 ^ j20;
        jArr3[10] = j10 ^ j20;
        jArr3[11] = j13 ^ j20;
        jArr3[12] = j16 ^ j20;
        jArr3[13] = j19 ^ j20;
        crashlytics(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        crashlytics(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        crashlytics(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        crashlytics(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        crashlytics(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        crashlytics(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        crashlytics(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        crashlytics(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        crashlytics(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        crashlytics(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        crashlytics(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        crashlytics(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        crashlytics(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        crashlytics(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        crashlytics(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        crashlytics(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        crashlytics(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        crashlytics(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        crashlytics(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        crashlytics(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        crashlytics(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
        long j21 = jArr3[0];
        long j22 = jArr3[1];
        long j23 = jArr3[2];
        long j24 = jArr3[3];
        long j25 = jArr3[4];
        long j26 = jArr3[5];
        long j27 = jArr3[6];
        long j28 = jArr3[7];
        long j29 = jArr3[8];
        long j30 = jArr3[9];
        long j31 = jArr3[10];
        long j32 = jArr3[11];
        long j33 = jArr3[12];
        long j34 = jArr3[13];
        jArr3[0] = j21 ^ (j22 << 59);
        jArr3[1] = (j22 >>> 5) ^ (j23 << 54);
        jArr3[2] = (j23 >>> 10) ^ (j24 << 49);
        jArr3[3] = (j24 >>> 15) ^ (j25 << 44);
        jArr3[4] = (j25 >>> 20) ^ (j26 << 39);
        jArr3[5] = (j26 >>> 25) ^ (j27 << 34);
        jArr3[6] = (j27 >>> 30) ^ (j28 << 29);
        jArr3[7] = (j28 >>> 35) ^ (j29 << 24);
        jArr3[8] = (j29 >>> 40) ^ (j30 << 19);
        jArr3[9] = (j30 >>> 45) ^ (j31 << 14);
        jArr3[10] = (j31 >>> 50) ^ (j32 << 9);
        jArr3[11] = ((j32 >>> 55) ^ (j33 << 4)) ^ (j34 << 63);
        jArr3[12] = j34 >>> 1;
    }

    public static void mopub(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = (j29 << 23) ^ j27;
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    public static void purchase(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        loadAd(jArr, jArr2, jArr4);
        mopub(jArr4, jArr3);
    }

    public static void subs(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        amazon(jArr, jArr3);
        while (true) {
            mopub(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                amazon(jArr2, jArr3);
            }
        }
    }

    public static void yandex(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }
}
