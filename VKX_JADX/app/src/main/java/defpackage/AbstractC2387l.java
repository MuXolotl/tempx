package defpackage;

/* JADX INFO: renamed from: lؔؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2387l {
    public static final long[] yandex = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static int adcel(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
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
        long j7 = jArr[((int) j) & 3];
        long j8 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 36028797018963967L & j7;
        jArr2[i + 1] = (j7 >>> 55) ^ (j8 << 9);
    }

    public static final void amazon(AbstractC4350l abstractC4350l, C18396l c18396l, AbstractC6475l abstractC6475l) {
        AutoCloseable autoCloseable;
        C14697l c14697l = abstractC4350l.yandex;
        if (c14697l != null) {
            synchronized (c14697l.yandex) {
                autoCloseable = (AutoCloseable) c14697l.loadAd.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C11596l c11596l = (C11596l) autoCloseable;
        if (c11596l == null || c11596l.f23309l) {
            return;
        }
        c11596l.yandex(c18396l, abstractC6475l);
        EnumC8981l enumC8981l = ((C5268l) abstractC6475l).subs;
        if (enumC8981l == EnumC8981l.f18521l || enumC8981l.yandex(EnumC8981l.f18524l)) {
            c18396l.m4524native();
        } else {
            abstractC6475l.yandex(new C14852l(abstractC6475l, c18396l, 1));
        }
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (j2 >>> 46) ^ (jArr[2] << 18);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        admob(jArr3, j5, j10, jArr4, 0);
        admob(jArr3, j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        admob(jArr3, j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        admob(jArr3, j5 ^ j13, j10 ^ j14, jArr4, 6);
        admob(jArr3, j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = j17 ^ jArr4[9];
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 55);
        long j29 = (j24 ^ j18) ^ (j28 >>> 55);
        long j30 = ((j26 & 36028797018963967L) >>> 1) ^ ((j28 & 1) << 54);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 36028797018963967L;
        long j37 = (((j28 & 36028797018963967L) >>> 1) ^ ((j29 & 1) << 54)) ^ (j36 >>> 54);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = 36028797018963967L & (j42 ^ (j42 << 32));
        long j44 = (j29 >>> 1) ^ (j43 >>> 54);
        long j45 = j44 ^ (j44 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j50 = j49 ^ (j49 << 32);
        jArr3[0] = j21;
        long j51 = (j23 ^ j36) ^ j25;
        jArr3[1] = j51;
        long j52 = ((j24 ^ j43) ^ j36) ^ j27;
        jArr3[2] = j52;
        long j53 = j43 ^ j50;
        jArr3[3] = j53;
        long j54 = j50 ^ jArr4[2];
        jArr3[4] = j54;
        long j55 = jArr4[3];
        jArr3[5] = j55;
        jArr3[0] = j21 ^ (j51 << 55);
        jArr3[1] = (j51 >>> 9) ^ (j52 << 46);
        jArr3[2] = (j52 >>> 18) ^ (j53 << 37);
        jArr3[3] = (j53 >>> 27) ^ (j54 << 28);
        jArr3[4] = (j54 >>> 36) ^ (j55 << 19);
        jArr3[5] = j55 >>> 45;
    }

    public static C16565l crashlytics(C11268l c11268l) {
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            c11268l.mo2154l(new C2977l(c5807l, c11268l, 8));
            c5807l.yandex = "Deferred.asListenableFuture";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        return c16565l;
    }

    public static void firebase(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        billing(jArr, jArr2, jArr4);
        remoteconfig(jArr4, jArr3);
    }

    public static void isPro(long[] jArr, long[] jArr2) {
        AbstractC5711l.amazon(3, jArr, jArr2);
        jArr2[6] = jArr[3] & 1;
    }

    public static void loadAd(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void metrica(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        AbstractC5711l.amazon(3, jArr, jArr3);
        while (true) {
            remoteconfig(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC5711l.amazon(3, jArr2, jArr3);
            }
        }
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
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    public static void purchase(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void remoteconfig(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j9 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j10 = (j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36))) ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j11 = j8 >>> 35;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = 34359738367L & j8;
    }

    public static void smaato(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        mopub(jArr, jArr2, jArr4);
        vip(jArr4, jArr3);
    }

    public static void startapp(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        isPro(jArr, jArr3);
        while (true) {
            vip(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                isPro(jArr2, jArr3);
            }
        }
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
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9)) ^ (jArr[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static void vip(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j9 >>> 50) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    public static void yandex(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }
}
