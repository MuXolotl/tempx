package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِۚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12098l {
    public static final int[] yandex = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] loadAd = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] crashlytics = {67108863, 33554431};
    public static final int[] amazon = {26, 25};

    public static void admob(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static final int amazon(long j) {
        return (int) ((j & 9223372032559808512L) >>> 32);
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        mopub(jArr4, jArr2, jArr3);
        subs(jArr4);
        admob(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static final C14473l crashlytics(C6956l c6956l) {
        return ((Boolean) ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon.getValue()).booleanValue() ? C14473l.mopub : C14473l.remoteconfig;
    }

    public static void firebase(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void isPro(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * 2;
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = jArr2[3];
        long j6 = jArr2[4];
        long j7 = jArr2[5];
        long j8 = jArr2[6];
        long j9 = jArr2[7];
        long j10 = jArr2[8];
        long j11 = jArr2[9];
        long[] jArr3 = {j * j, j2 * j3, ((j * j4) + (j3 * j3)) * 2, ((j * j5) + (j3 * j4)) * 2, (j2 * j6) + (j3 * 4 * j5) + (j4 * j4), ((j * j7) + (j3 * j6) + (j4 * j5)) * 2, ((j3 * 2 * j7) + (j * j8) + (j4 * j6) + (j5 * j5)) * 2, ((j * j9) + (j3 * j8) + (j4 * j7) + (j5 * j6)) * 2, (((((j5 * j7) + (j3 * j9)) * 2) + (j * j10) + (j4 * j8)) * 2) + (j6 * j6), ((j * j11) + (j3 * j10) + (j4 * j9) + (j5 * j8) + (j6 * j7)) * 2, ((((j3 * j11) + (j5 * j9)) * 2) + (j4 * j10) + (j6 * j8) + (j7 * j7)) * 2, ((j4 * j11) + (j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, (((((j5 * j11) + (j7 * j9)) * 2) + (j6 * j10)) * 2) + (j8 * j8), ((j6 * j11) + (j7 * j10) + (j8 * j9)) * 2, ((j7 * 2 * j11) + (j8 * j10) + (j9 * j9)) * 2, ((j8 * j11) + (j9 * j10)) * 2, (j9 * 4 * j11) + (j10 * j10), j10 * 2 * j11, 2 * j11 * j11};
        subs(jArr3);
        admob(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static byte[] loadAd(long[] jArr) {
        long j;
        int[] iArr;
        int i;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = 19;
            iArr = amazon;
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArrCopyOf[i4];
                int i5 = iArr[i4 & 1];
                int i6 = -((int) (((j2 >> 31) & j2) >> i5));
                jArrCopyOf[i4] = j2 + ((long) (i6 << i5));
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - ((long) i6);
            }
            long j3 = jArrCopyOf[9];
            int i7 = -((int) (((j3 >> 31) & j3) >> 25));
            jArrCopyOf[9] = j3 + ((long) (i7 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i7) * 19);
            i3++;
        }
        long j4 = jArrCopyOf[0];
        int i8 = -((int) (((j4 >> 31) & j4) >> 26));
        jArrCopyOf[0] = j4 + ((long) (i8 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i8);
        int i9 = 0;
        while (true) {
            iArr2 = crashlytics;
            if (i9 >= 2) {
                break;
            }
            int i10 = i2;
            while (i10 < 9) {
                long j5 = jArrCopyOf[i10];
                int i11 = i10 & 1;
                int i12 = i2;
                int i13 = i9;
                int i14 = (int) (j5 >> iArr[i11]);
                jArrCopyOf[i10] = ((long) iArr2[i11]) & j5;
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] + ((long) i14);
                i2 = i12;
                j = j;
                i9 = i13;
            }
            i9++;
        }
        int i15 = i2;
        long j6 = jArrCopyOf[9];
        jArrCopyOf[9] = j6 & 33554431;
        long j7 = (((long) ((int) (j6 >> 25))) * j) + jArrCopyOf[i15];
        jArrCopyOf[i15] = j7;
        int i16 = ~((((int) j7) - 67108845) >> 31);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = ~(((int) jArrCopyOf[i17]) ^ iArr2[i17 & 1]);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 << 1)) >> 31;
        }
        jArrCopyOf[i15] = jArrCopyOf[i15] - ((long) (67108845 & i16));
        long j8 = 33554431 & i16;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - ((long) (67108863 & i16));
            int i23 = i + 1;
            jArrCopyOf[i23] = jArrCopyOf[i23] - j8;
        }
        for (int i24 = i15; i24 < 10; i24++) {
            jArrCopyOf[i24] = jArrCopyOf[i24] << loadAd[i24];
        }
        byte[] bArr = new byte[32];
        for (int i25 = i15; i25 < 10; i25++) {
            int i26 = yandex[i25];
            long j9 = bArr[i26];
            long j10 = jArrCopyOf[i25];
            bArr[i26] = (byte) (j9 | (j10 & 255));
            int i27 = i26 + 1;
            bArr[i27] = (byte) (((long) bArr[i27]) | ((j10 >> 8) & 255));
            int i28 = i26 + 2;
            bArr[i28] = (byte) (((long) bArr[i28]) | ((j10 >> 16) & 255));
            int i29 = i26 + 3;
            bArr[i29] = (byte) (((long) bArr[i29]) | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    public static void mopub(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr3[1] * j;
        long j3 = jArr2[1];
        long j4 = jArr3[0];
        jArr[1] = (j3 * j4) + j2;
        long j5 = jArr2[1];
        long j6 = jArr3[1];
        jArr[2] = (jArr2[2] * j4) + (jArr3[2] * j) + (j5 * 2 * j6);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        jArr[3] = (jArr2[3] * j4) + (jArr3[3] * j) + (j8 * j6) + (j5 * j7);
        long j9 = jArr3[3];
        long j10 = jArr2[3];
        jArr[4] = (jArr2[4] * j4) + (jArr3[4] * j) + (((j10 * j6) + (j5 * j9)) * 2) + (j8 * j7);
        long j11 = jArr3[4];
        long j12 = (j5 * j11) + (j10 * j7) + (j8 * j9);
        long j13 = jArr2[4];
        jArr[5] = (jArr2[5] * j4) + (jArr3[5] * j) + (j13 * j6) + j12;
        long j14 = jArr3[5];
        long j15 = jArr2[5];
        jArr[6] = (jArr2[6] * j4) + (jArr3[6] * j) + (j13 * j7) + (j8 * j11) + (((j15 * j6) + (j5 * j14) + (j10 * j9)) * 2);
        long j16 = (j15 * j7) + (j8 * j14) + (j13 * j9) + (j10 * j11);
        long j17 = jArr3[6];
        long j18 = (j5 * j17) + j16;
        long j19 = jArr2[6];
        jArr[7] = (jArr2[7] * j4) + (jArr3[7] * j) + (j19 * j6) + j18;
        long j20 = jArr3[7];
        long j21 = (j5 * j20) + (j15 * j9) + (j10 * j14);
        long j22 = jArr2[7];
        long j23 = (((j22 * j6) + j21) * 2) + (j13 * j11);
        jArr[8] = (jArr2[8] * j4) + (jArr3[8] * j) + (j19 * j7) + (j8 * j17) + j23;
        long j24 = (j22 * j7) + (j8 * j20) + (j19 * j9) + (j10 * j17) + (j15 * j11) + (j13 * j14);
        long j25 = jArr3[8];
        long j26 = (j5 * j25) + j24;
        long j27 = jArr2[8];
        jArr[9] = (jArr2[9] * j4) + (j * jArr3[9]) + (j27 * j6) + j26;
        long j28 = (j22 * j9) + (j10 * j20) + (j15 * j14);
        long j29 = jArr3[9];
        long j30 = jArr2[9];
        long j31 = j13 * j17;
        jArr[10] = (j27 * j7) + (j8 * j25) + (j19 * j11) + j31 + (((j6 * j30) + (j5 * j29) + j28) * 2);
        long j32 = j8 * j29;
        long j33 = j7 * j30;
        jArr[11] = j33 + j32 + (j27 * j9) + (j10 * j25) + (j22 * j11) + (j13 * j20) + (j19 * j14) + (j15 * j17);
        long j34 = j10 * j29;
        long j35 = j9 * j30;
        long j36 = j27 * j11;
        jArr[12] = j36 + (j13 * j25) + ((j35 + j34 + (j22 * j14) + (j15 * j20)) * 2) + (j19 * j17);
        long j37 = j13 * j29;
        long j38 = j11 * j30;
        jArr[13] = j38 + j37 + (j27 * j14) + (j15 * j25) + (j22 * j17) + (j19 * j20);
        long j39 = j14 * j30;
        long j40 = j27 * j17;
        jArr[14] = j40 + (j19 * j25) + ((j39 + (j15 * j29) + (j22 * j20)) * 2);
        long j41 = j19 * j29;
        long j42 = j17 * j30;
        jArr[15] = j42 + j41 + (j27 * j20) + (j22 * j25);
        jArr[16] = (((j20 * j30) + (j22 * j29)) * 2) + (j27 * j25);
        jArr[17] = (j25 * j30) + (j27 * j29);
        jArr[18] = j30 * 2 * j29;
    }

    public static final boolean purchase(InterfaceC12001l interfaceC12001l) {
        return interfaceC12001l.admob(new C9673l(22));
    }

    public static void smaato(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static void subs(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static C7119l yandex(int i, int i2, Function1 function1, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        if (i == -2) {
            if (i2 != 1) {
                return new C14012l(1, i2, function1);
            }
            InterfaceC14592l.subs.getClass();
            return new C7119l(C14133l.loadAd, function1);
        }
        if (i == -1) {
            if (i2 == 1) {
                return new C14012l(1, 2, function1);
            }
            C8339l.metrica("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return i2 == 1 ? new C7119l(0, function1) : new C14012l(1, i2, function1);
        }
        if (i != Integer.MAX_VALUE) {
            return i2 == 1 ? new C7119l(i, function1) : new C14012l(i, i2, function1);
        }
        return new C7119l(Alert.DURATION_SHOW_INDEFINITELY, function1);
    }
}
