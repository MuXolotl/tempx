package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* JADX INFO: renamed from: lُؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10774l {
    public static final long[] yandex = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void Signature(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    public static void ad(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        remoteconfig(jArr, jArr3);
        while (true) {
            tapsense(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                remoteconfig(jArr2, jArr3);
            }
        }
    }

    public static void adcel(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        isPro(jArr, jArr2, jArr4);
        tapsense(jArr4, jArr3);
    }

    public static void admob(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i = 0; i < 9; i++) {
            firebase(jArr4, jArr[i], jArr2[i], jArr3, i << 1);
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
        long j20 = j17 ^ jArr3[13];
        long j21 = j18 ^ jArr3[14];
        long j22 = j21 ^ j20;
        jArr3[7] = j22;
        long j23 = j20 ^ jArr3[15];
        long j24 = j21 ^ jArr3[16];
        long j25 = j24 ^ j23;
        jArr3[8] = j25;
        long j26 = (j23 ^ jArr3[17]) ^ j24;
        jArr3[9] = j ^ j26;
        jArr3[10] = j4 ^ j26;
        jArr3[11] = j7 ^ j26;
        jArr3[12] = j10 ^ j26;
        jArr3[13] = j13 ^ j26;
        jArr3[14] = j16 ^ j26;
        jArr3[15] = j19 ^ j26;
        jArr3[16] = j22 ^ j26;
        jArr3[17] = j25 ^ j26;
        firebase(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        firebase(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        firebase(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        firebase(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        firebase(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        firebase(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        firebase(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        firebase(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        firebase(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        firebase(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        firebase(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        firebase(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        firebase(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        firebase(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        firebase(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        firebase(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        firebase(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        firebase(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        firebase(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        firebase(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        firebase(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        firebase(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        firebase(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        firebase(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        firebase(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        firebase(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        firebase(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        firebase(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        firebase(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        firebase(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        firebase(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        firebase(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        firebase(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        firebase(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        firebase(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        firebase(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static final void ads(Context context, InterfaceC1982l interfaceC1982l, Catalog2Button catalog2Button) {
        String strSmaato = interfaceC1982l.smaato();
        String str = catalog2Button.amazon;
        if (str == null) {
            return;
        }
        AbstractC9092l.loadAd(context, new C7108l(str, strSmaato), new C13305l(null, 0L, null, false, catalog2Button.yandex instanceof C0146l, false, 111));
    }

    public static void advert(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC5711l.amazon(4, jArr, jArr3);
        while (true) {
            Signature(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC5711l.amazon(4, jArr2, jArr3);
            }
        }
    }

    public static void amazon(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static final void billing(BroadcastReceiver broadcastReceiver, InterfaceC12932l interfaceC12932l, Function2 function2) {
        if (AbstractC5673l.yandex.get()) {
            C8339l.smaato("goAsync must never be called when the AsyncRequestWorker is meant to be used");
            return;
        }
        C18662l c18662lYandex = AbstractC11990l.yandex(interfaceC12932l);
        AbstractC10999l.mopub(c18662lYandex, null, 0, new C7641l(c18662lYandex, broadcastReceiver.goAsync(), function2, (InterfaceC14029l) null, 26), 3);
    }

    public static void crashlytics(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void firebase(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = 0;
        long j4 = j2;
        long j5 = j;
        for (int i2 = 2; i2 < 16; i2 += 2) {
            long j6 = jArr[i2 >>> 1] << 1;
            jArr[i2] = j6;
            jArr[i2 + 1] = j6 ^ j2;
            j5 = (j5 & (-72340172838076674L)) >>> 1;
            j3 ^= (j4 >> 63) & j5;
            j4 <<= 1;
        }
        int i3 = (int) j;
        long j7 = jArr[i3 & 15] ^ (jArr[(i3 >>> 4) & 15] << 4);
        int i4 = 56;
        do {
            int i5 = (int) (j >>> i4);
            long j8 = jArr[i5 & 15] ^ (jArr[(i5 >>> 4) & 15] << 4);
            j7 ^= j8 << i4;
            j3 ^= j8 >>> (-i4);
            i4 -= 8;
        } while (i4 > 0);
        jArr2[i] = jArr2[i] ^ j7;
        int i6 = i + 1;
        jArr2[i6] = jArr2[i6] ^ j3;
    }

    public static void isPro(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 56;
        while (true) {
            long j = 0;
            int i2 = 0;
            if (i < 0) {
                break;
            }
            for (int i3 = 1; i3 < 9; i3 += 2) {
                int i4 = (int) (jArr[i3] >>> i);
                loadAd(jArr2, (i4 & 15) * 9, jArr2, (((i4 >>> 4) & 15) + 16) * 9, jArr3, i3 - 1);
            }
            while (i2 < 16) {
                long j2 = jArr3[i2];
                jArr3[i2] = (j >>> (-8)) | (j2 << 8);
                i2++;
                j = j2;
            }
            i -= 8;
        }
        for (int i5 = 56; i5 >= 0; i5 -= 8) {
            int i6 = 0;
            while (i6 < 9) {
                int i7 = (int) (jArr[i6] >>> i5);
                int i8 = i6;
                loadAd(jArr2, (i7 & 15) * 9, jArr2, (((i7 >>> 4) & 15) + 16) * 9, jArr3, i8);
                i6 = i8 + 2;
            }
            if (i5 > 0) {
                long j3 = 0;
                int i9 = 0;
                while (i9 < 18) {
                    long j4 = jArr3[i9];
                    jArr3[i9] = (j3 >>> (-8)) | (j4 << 8);
                    i9++;
                    j3 = j4;
                }
            }
        }
    }

    public static Object isVip(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void license(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        remoteconfig(jArr, jArr3);
        tapsense(jArr3, jArr2);
    }

    public static void loadAd(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void metrica(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        subs(jArr, jArr2, jArr4);
        Signature(jArr4, jArr3);
    }

    public static void mopub(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    public static void pro(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC5711l.amazon(4, jArr, jArr3);
        Signature(jArr3, jArr2);
    }

    public static void purchase(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void remoteconfig(long[] jArr, long[] jArr2) {
        AbstractC5711l.amazon(9, jArr, jArr2);
    }

    public static void smaato(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        jArr2[i] = jArr2[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr2[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j8) << 4) ^ (j7 >>> 60)) ^ jArr2[i5];
    }

    public static void startapp(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        admob(jArr, jArr2, jArr4);
        amazon(jArr3, jArr4, jArr3);
    }

    public static void subs(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        mopub(jArr, jArr4);
        mopub(jArr2, jArr5);
        long[] jArr6 = new long[8];
        smaato(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        smaato(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        smaato(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        smaato(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        smaato(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        smaato(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        smaato(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        smaato(jArr6, j, j3, jArr7, 0);
        smaato(jArr6, j2, j4, jArr7, 1);
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
        jArr3[0] = j12 ^ (j13 << 60);
        jArr3[1] = (j13 >>> 4) ^ (j8 << 56);
        jArr3[2] = (j8 >>> 8) ^ (j9 << 52);
        jArr3[3] = (j9 >>> 12) ^ (j10 << 48);
        jArr3[4] = (j10 >>> 16) ^ (j11 << 44);
        jArr3[5] = (j11 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    public static long[] subscription(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        int i3 = 0;
        while (true) {
            j = 0;
            if (i2 <= 0) {
                break;
            }
            int i4 = i3 + 18;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < 9) {
                long j2 = jArr2[i5 + i6];
                jArr2[i4 + i6] = (j >>> 63) | (j2 << 1);
                i6++;
                j = j2;
            }
            int i7 = i3 + 26;
            long j3 = jArr2[i7];
            long j4 = j3 >>> 59;
            jArr2[i4] = ((j4 << 10) ^ (((j4 << 2) ^ j4) ^ (j4 << 5))) ^ jArr2[i4];
            jArr2[i7] = j3 & 576460752303423487L;
            int i8 = i3 + 27;
            for (int i9 = 0; i9 < 9; i9++) {
                jArr2[i8 + i9] = jArr2[9 + i9] ^ jArr2[i4 + i9];
            }
            i2--;
            i3 = i4;
        }
        while (i < 144) {
            long j5 = jArr2[i];
            jArr2[144 + i] = (j >>> (-4)) | (j5 << 4);
            i++;
            j = j5;
        }
        return jArr2;
    }

    public static void tapsense(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void vip(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        admob(jArr, jArr2, jArr4);
        tapsense(jArr4, jArr3);
    }

    public static void yandex(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }
}
