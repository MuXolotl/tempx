package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٍۜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9824l {
    public int amazon;
    public int crashlytics;
    public int purchase;
    public long[] yandex = AbstractC12154l.yandex;
    public long[] loadAd = AbstractC13579l.yandex;

    public C9824l(int i) {
        if (i >= 0) {
            crashlytics(AbstractC12154l.amazon(i));
        } else {
            AbstractC13082l.crashlytics("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void amazon(long j) {
        long j2;
        int i;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        long[] jArr2;
        char c = ' ';
        int i2 = -862048943;
        int i3 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.crashlytics;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr3 = this.yandex;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            int i13 = i9;
            long j4 = (((-i11) >> 63) & (jArr3[i10 + 1] << (64 - i11))) | (jArr3[i10] >>> i11);
            long j5 = i6;
            char c2 = c;
            int i14 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = -9187201950435737472L;
            long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i7;
                int i15 = i2;
                if (this.loadAd[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i2 = i15;
            }
            int i16 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iLoadAd = loadAd(i5);
                long j9 = 255;
                if (this.purchase != 0 || ((this.yandex[iLoadAd >> 3] >> ((iLoadAd & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 1;
                    j3 = 128;
                } else {
                    int i17 = this.crashlytics;
                    if (i17 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.amazon) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.yandex;
                            int i18 = this.crashlytics;
                            long[] jArr5 = this.loadAd;
                            int i19 = (i18 + 7) >> 3;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j10 = j9;
                                long j11 = jArr4[i20] & j7;
                                jArr4[i20] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i20++;
                                j9 = j10;
                                j7 = -9187201950435737472L;
                            }
                            j2 = j9;
                            int length = jArr4.length;
                            int i21 = length - 1;
                            int i22 = length - 2;
                            long j12 = 72057594037927935L;
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i21] = jArr4[0];
                            int i23 = 0;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j13 = (jArr4[i24] >> i25) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    long j14 = jArr5[i23];
                                    int i26 = ((int) (j14 ^ (j14 >>> c2))) * i16;
                                    int i27 = i26 ^ (i26 << 16);
                                    int i28 = i27 >>> 7;
                                    int iLoadAd2 = loadAd(i28);
                                    int i29 = i28 & i18;
                                    long j15 = j12;
                                    if (((iLoadAd2 - i29) & i18) / 8 == ((i23 - i29) & i18) / 8) {
                                        jArr4[i24] = (((long) (i27 & 127)) << i25) | (jArr4[i24] & (~(j2 << i25)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j15) | Long.MIN_VALUE;
                                        i23++;
                                        i12 = i12;
                                        c2 = c2;
                                        j12 = j15;
                                    } else {
                                        char c3 = c2;
                                        int i30 = i12;
                                        int i31 = iLoadAd2 >> 3;
                                        long j16 = jArr4[i31];
                                        int i32 = (iLoadAd2 & 7) << 3;
                                        if (((j16 >> i32) & j2) == 128) {
                                            jArr2 = jArr5;
                                            jArr4[i31] = ((~(j2 << i32)) & j16) | (((long) (i27 & 127)) << i32);
                                            jArr4[i24] = (jArr4[i24] & (~(j2 << i25))) | (128 << i25);
                                            jArr2[iLoadAd2] = jArr2[i23];
                                            jArr2[i23] = 0;
                                        } else {
                                            jArr2 = jArr5;
                                            jArr4[i31] = (((long) (i27 & 127)) << i32) | ((~(j2 << i32)) & j16);
                                            long j17 = jArr2[iLoadAd2];
                                            jArr2[iLoadAd2] = jArr2[i23];
                                            jArr2[i23] = j17;
                                            i23--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j15) | Long.MIN_VALUE;
                                        i23++;
                                        i18 = i18;
                                        i12 = i30;
                                        c2 = c3;
                                        j12 = j15;
                                        jArr5 = jArr2;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            i = i12;
                            this.purchase = AbstractC12154l.yandex(this.crashlytics) - this.amazon;
                        }
                        iLoadAd = loadAd(i5);
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i = 1;
                    int iLoadAd3 = AbstractC12154l.loadAd(this.crashlytics);
                    long[] jArr6 = this.yandex;
                    long[] jArr7 = this.loadAd;
                    int i33 = this.crashlytics;
                    crashlytics(iLoadAd3);
                    long[] jArr8 = this.yandex;
                    long[] jArr9 = this.loadAd;
                    int i34 = this.crashlytics;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr6[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            long j18 = jArr7[i35];
                            int i36 = ((int) ((j18 >>> c2) ^ j18)) * i16;
                            int i37 = i36 ^ (i36 << 16);
                            int iLoadAd4 = loadAd(i37 >>> 7);
                            jArr = jArr8;
                            long j19 = i37 & 127;
                            int i38 = iLoadAd4 >> 3;
                            int i39 = (iLoadAd4 & 7) << 3;
                            long j20 = (jArr[i38] & (~(255 << i39))) | (j19 << i39);
                            jArr[i38] = j20;
                            jArr[(((iLoadAd4 - 7) & i34) + (i34 & 7)) >> 3] = j20;
                            jArr9[iLoadAd4] = j18;
                        } else {
                            jArr = jArr8;
                        }
                        i35++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iLoadAd = loadAd(i5);
                }
                iNumberOfTrailingZeros = iLoadAd;
                this.amazon++;
                int i40 = this.purchase;
                long[] jArr10 = this.yandex;
                int i41 = iNumberOfTrailingZeros >> 3;
                long j21 = jArr10[i41];
                int i42 = (iNumberOfTrailingZeros & 7) << 3;
                this.purchase = i40 - (((j21 >> i42) & j2) == j3 ? i : 0);
                int i43 = this.crashlytics;
                long j22 = (j21 & (~(j2 << i42))) | (j5 << i42);
                jArr10[i41] = j22;
                jArr10[(((iNumberOfTrailingZeros - 7) & i43) + (i43 & 7)) >> 3] = j22;
                break;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i6 = i14;
            i2 = i16;
            c = c2;
        }
        this.loadAd[iNumberOfTrailingZeros] = j;
    }

    public final void crashlytics(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC12154l.crashlytics(i)) : 0;
        this.crashlytics = iMax;
        if (iMax == 0) {
            jArr = AbstractC12154l.yandex;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.yandex = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.purchase = AbstractC12154l.yandex(this.crashlytics) - this.amazon;
        this.loadAd = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9824l)) {
            return false;
        }
        C9824l c9824l = (C9824l) obj;
        if (c9824l.amazon != this.amazon) {
            return false;
        }
        long[] jArr = this.loadAd;
        long[] jArr2 = this.yandex;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !c9824l.yandex(jArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.loadAd;
        long[] jArr2 = this.yandex;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        long j2 = jArr[(i << 3) + i4];
                        i2 += (int) (j2 ^ (j2 >>> 32));
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final int loadAd(int i) {
        int i2 = this.crashlytics;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.yandex;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void purchase(long j) {
        int iNumberOfTrailingZeros;
        int i = ((int) ((j >>> 32) ^ j)) * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.crashlytics;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.yandex;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.loadAd[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i6 += 8;
                i5 = (i5 + i6) & i4;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.amazon--;
            long[] jArr2 = this.yandex;
            int i9 = this.crashlytics;
            int i10 = iNumberOfTrailingZeros >> 3;
            int i11 = (iNumberOfTrailingZeros & 7) << 3;
            long j5 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
            jArr2[i10] = j5;
            jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[DONT_INVERT, PHI: r5
  0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005d A[LOOP:0: B:5:0x0016->B:21:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[EDGE_INSN: B:26:0x0060->B:22:0x0060 BREAK  A[LOOP:0: B:5:0x0016->B:21:0x005d], SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.loadAd;
        long[] jArr2 = this.yandex;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append(j2);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final boolean yandex(long j) {
        int iNumberOfTrailingZeros;
        int i = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.crashlytics;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.yandex;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.loadAd[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }
}
