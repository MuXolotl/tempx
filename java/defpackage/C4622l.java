package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؗؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4622l {
    public int amazon;
    public int crashlytics;
    public int[] loadAd;
    public int purchase;
    public long[] yandex;

    public C4622l(int i) {
        this.yandex = AbstractC12154l.yandex;
        this.loadAd = AbstractC12047l.yandex;
        if (i >= 0) {
            billing(AbstractC12154l.amazon(i));
        } else {
            AbstractC13082l.crashlytics("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void admob(int i) {
        this.amazon--;
        long[] jArr = this.yandex;
        int i2 = this.crashlytics;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int amazon(int i) {
        long j;
        int i2;
        long j2;
        int i3;
        long[] jArr;
        int i4 = -862048943;
        int i5 = i * (-862048943);
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.crashlytics;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.yandex;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            int i15 = i11;
            long j3 = (((-i13) >> 63) & (jArr2[i12 + 1] << (64 - i13))) | (jArr2[i12] >>> i13);
            long j4 = i8;
            int i16 = i4;
            int i17 = i8;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = -9187201950435737472L;
            long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                long j8 = j6;
                if (this.loadAd[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                j6 = j8;
            }
            long j9 = j6;
            char c = '\b';
            if ((((~j3) << 6) & j3 & j9) != 0) {
                int iPurchase = purchase(i7);
                long j10 = 255;
                if (this.purchase != 0 || ((this.yandex[iPurchase >> 3] >> ((iPurchase & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 1;
                    j2 = 128;
                } else {
                    int i18 = this.crashlytics;
                    if (i18 > 8) {
                        j2 = 128;
                        if (Long.compare((((long) this.amazon) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.yandex;
                            int i19 = this.crashlytics;
                            int[] iArr = this.loadAd;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j11 = j10;
                                long j12 = jArr3[i21] & j9;
                                int i22 = i21;
                                jArr3[i22] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i21 = i22 + 1;
                                j10 = j11;
                            }
                            j = j10;
                            int length = jArr3.length;
                            int i23 = length - 1;
                            int i24 = length - 2;
                            jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i23] = jArr3[0];
                            int i25 = 0;
                            while (i25 != i19) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j13 = (jArr3[i26] >> i27) & j;
                                if (j13 != 128 && j13 == 254) {
                                    int i28 = iArr[i25] * i16;
                                    int i29 = i28 ^ (i28 << 16);
                                    int i30 = i29 >>> 7;
                                    int iPurchase2 = purchase(i30);
                                    int i31 = i30 & i19;
                                    char c2 = c;
                                    if (((iPurchase2 - i31) & i19) / 8 == ((i25 - i31) & i19) / 8) {
                                        int i32 = i14;
                                        jArr3[i26] = (((long) (i29 & 127)) << i27) | (jArr3[i26] & (~(j << i27)));
                                        jArr3[jArr3.length - i32] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        i14 = i32;
                                        c = c2;
                                        i16 = i16;
                                    } else {
                                        int i33 = i16;
                                        int i34 = i14;
                                        int i35 = iPurchase2 >> 3;
                                        long j14 = jArr3[i35];
                                        int i36 = (iPurchase2 & 7) << 3;
                                        if (((j14 >> i36) & j) == 128) {
                                            jArr3[i35] = ((~(j << i36)) & j14) | (((long) (i29 & 127)) << i36);
                                            jArr3[i26] = (jArr3[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iPurchase2] = iArr[i25];
                                            iArr[i25] = 0;
                                        } else {
                                            jArr3[i35] = (((long) (i29 & 127)) << i36) | ((~(j << i36)) & j14);
                                            int i37 = iArr[iPurchase2];
                                            iArr[iPurchase2] = iArr[i25];
                                            iArr[i25] = i37;
                                            i25--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        c = c2;
                                        i16 = i33;
                                        i7 = i7;
                                        i14 = i34;
                                        i19 = i19;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i3 = i7;
                            i2 = i14;
                            this.purchase = AbstractC12154l.yandex(this.crashlytics) - this.amazon;
                        }
                        iPurchase = purchase(i3);
                    } else {
                        j2 = 128;
                    }
                    i3 = i7;
                    j = 255;
                    i2 = 1;
                    int iLoadAd = AbstractC12154l.loadAd(this.crashlytics);
                    long[] jArr4 = this.yandex;
                    int[] iArr2 = this.loadAd;
                    int i38 = this.crashlytics;
                    billing(iLoadAd);
                    long[] jArr5 = this.yandex;
                    int[] iArr3 = this.loadAd;
                    int i39 = this.crashlytics;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j2) {
                            int i41 = iArr2[i40];
                            int i42 = i41 * i16;
                            int i43 = i42 ^ (i42 << 16);
                            int iPurchase3 = purchase(i43 >>> 7);
                            long j15 = i43 & 127;
                            int i44 = iPurchase3 >> 3;
                            int i45 = (iPurchase3 & 7) << 3;
                            jArr = jArr5;
                            long j16 = (jArr5[i44] & (~(255 << i45))) | (j15 << i45);
                            jArr[i44] = j16;
                            jArr[(((iPurchase3 - 7) & i39) + (i39 & 7)) >> 3] = j16;
                            iArr3[iPurchase3] = i41;
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iPurchase = purchase(i3);
                }
                this.amazon++;
                int i46 = this.purchase;
                long[] jArr6 = this.yandex;
                int i47 = iPurchase >> 3;
                long j17 = jArr6[i47];
                int i48 = (iPurchase & 7) << 3;
                if (((j17 >> i48) & j) != j2) {
                    i2 = 0;
                }
                this.purchase = i46 - i2;
                int i49 = this.crashlytics;
                long j18 = (j17 & (~(j << i48))) | (j4 << i48);
                jArr6[i47] = j18;
                jArr6[(((iPurchase - 7) & i49) + (i49 & 7)) >> 3] = j18;
                return iPurchase;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i8 = i17;
            i4 = i16;
        }
    }

    public final void billing(int i) {
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
        this.loadAd = new int[iMax];
    }

    public final boolean crashlytics(int i) {
        int iNumberOfTrailingZeros;
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.crashlytics;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.yandex;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.loadAd[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4622l)) {
            return false;
        }
        C4622l c4622l = (C4622l) obj;
        if (c4622l.amazon != this.amazon) {
            return false;
        }
        int[] iArr = this.loadAd;
        long[] jArr = this.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !c4622l.crashlytics(iArr[(i << 3) + i3])) {
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
        int[] iArr = this.loadAd;
        long[] jArr = this.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 += iArr[(i << 3) + i4];
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

    public final void loadAd() {
        this.amazon = 0;
        long[] jArr = this.yandex;
        if (jArr != AbstractC12154l.yandex) {
            AbstractC8669l.m2417synchronized(-9187201950435737472L, jArr);
            long[] jArr2 = this.yandex;
            int i = this.crashlytics;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.purchase = AbstractC12154l.yandex(this.crashlytics) - this.amazon;
    }

    public final boolean mopub(int i) {
        int iNumberOfTrailingZeros;
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.crashlytics;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.yandex;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.loadAd[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            admob(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final int purchase(int i) {
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

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[DONT_INVERT, PHI: r5
  0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005d A[LOOP:0: B:5:0x0016->B:21:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[EDGE_INSN: B:26:0x0060->B:22:0x0060 BREAK  A[LOOP:0: B:5:0x0016->B:21:0x005d], SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.loadAd;
        long[] jArr = this.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append(i5);
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

    public final boolean yandex(int i) {
        int i2 = this.amazon;
        this.loadAd[amazon(i)] = i;
        return this.amazon != i2;
    }

    public /* synthetic */ C4622l() {
        this(6);
    }
}
