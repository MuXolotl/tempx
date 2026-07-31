package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lۨؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18730l {
    public int amazon;
    public int billing;
    public Object[] crashlytics;
    public long[] loadAd;
    public int purchase;
    public long[] yandex;

    public C18730l(int i) {
        this.yandex = AbstractC12154l.yandex;
        this.loadAd = AbstractC13579l.yandex;
        this.crashlytics = AbstractC4918l.crashlytics;
        if (i >= 0) {
            billing(AbstractC12154l.amazon(i));
        } else {
            AbstractC13082l.crashlytics("Capacity must be a positive value.");
            throw null;
        }
    }

    public final Object admob(int i) {
        this.purchase--;
        long[] jArr = this.yandex;
        int i2 = this.amazon;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.crashlytics;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int amazon(int i) {
        int i2 = this.amazon;
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

    public final void billing(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC12154l.crashlytics(i)) : 0;
        this.amazon = iMax;
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
        this.billing = AbstractC12154l.yandex(this.amazon) - this.purchase;
        this.loadAd = new long[iMax];
        this.crashlytics = new Object[iMax];
    }

    public final int crashlytics(long j) {
        long j2;
        int i;
        long j3;
        long[] jArr;
        long[] jArr2;
        char c = ' ';
        int i2 = -862048943;
        int i3 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.amazon;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
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
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i7;
                int i15 = i2;
                if (this.loadAd[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i15;
            }
            int i16 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iAmazon = amazon(i5);
                if (this.billing != 0 || ((this.yandex[iAmazon >> 3] >> ((iAmazon & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 1;
                    j3 = 128;
                } else {
                    int i17 = this.amazon;
                    if (i17 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.purchase) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.yandex;
                            int i18 = this.amazon;
                            long[] jArr5 = this.loadAd;
                            Object[] objArr = this.crashlytics;
                            int i19 = (i18 + 7) >> 3;
                            j2 = 255;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j9 = j7;
                                long j10 = jArr4[i20] & j9;
                                jArr4[i20] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i20++;
                                i12 = i12;
                                c2 = c2;
                                j7 = j9;
                            }
                            char c3 = c2;
                            int i21 = i12;
                            int length = jArr4.length;
                            int i22 = length - 1;
                            int i23 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i22] = jArr4[0];
                            int i24 = 0;
                            while (i24 != i18) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr4[i25] >> i26) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    long j13 = jArr5[i24];
                                    int i27 = ((int) (j13 ^ (j13 >>> c3))) * i16;
                                    int i28 = i27 ^ (i27 << 16);
                                    int i29 = i28 >>> 7;
                                    int iAmazon2 = amazon(i29);
                                    int i30 = i29 & i18;
                                    int i31 = i21;
                                    if (((iAmazon2 - i30) & i18) / 8 == ((i24 - i30) & i18) / 8) {
                                        long j14 = j11;
                                        jArr4[i25] = (((long) (i28 & 127)) << i26) | (jArr4[i25] & (~(255 << i26)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i24++;
                                        i21 = i31;
                                        j11 = j14;
                                    } else {
                                        long j15 = j11;
                                        int i32 = iAmazon2 >> 3;
                                        long j16 = jArr4[i32];
                                        int i33 = (iAmazon2 & 7) << 3;
                                        if (((j16 >> i33) & 255) == 128) {
                                            jArr2 = jArr5;
                                            jArr4[i32] = ((~(255 << i33)) & j16) | (((long) (i28 & 127)) << i33);
                                            jArr4[i25] = (jArr4[i25] & (~(255 << i26))) | (128 << i26);
                                            jArr2[iAmazon2] = jArr2[i24];
                                            jArr2[i24] = 0;
                                            objArr[iAmazon2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            jArr2 = jArr5;
                                            jArr4[i32] = ((~(255 << i33)) & j16) | (((long) (i28 & 127)) << i33);
                                            long j17 = jArr2[iAmazon2];
                                            jArr2[iAmazon2] = jArr2[i24];
                                            jArr2[i24] = j17;
                                            Object obj = objArr[iAmazon2];
                                            objArr[iAmazon2] = objArr[i24];
                                            objArr[i24] = obj;
                                            i24--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j15) | Long.MIN_VALUE;
                                        i24++;
                                        i18 = i18;
                                        i21 = i31;
                                        j11 = j15;
                                        jArr5 = jArr2;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            i = i21;
                            this.billing = AbstractC12154l.yandex(this.amazon) - this.purchase;
                        }
                        iAmazon = amazon(i5);
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i = 1;
                    int iLoadAd = AbstractC12154l.loadAd(this.amazon);
                    long[] jArr6 = this.yandex;
                    long[] jArr7 = this.loadAd;
                    Object[] objArr2 = this.crashlytics;
                    int i34 = this.amazon;
                    billing(iLoadAd);
                    long[] jArr8 = this.yandex;
                    long[] jArr9 = this.loadAd;
                    Object[] objArr3 = this.crashlytics;
                    int i35 = this.amazon;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr6[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            long j18 = jArr7[i36];
                            jArr = jArr8;
                            int i37 = ((int) (j18 ^ (j18 >>> c2))) * i16;
                            int i38 = i37 ^ (i37 << 16);
                            int iAmazon3 = amazon(i38 >>> 7);
                            int i39 = iAmazon3 >> 3;
                            int i40 = (iAmazon3 & 7) << 3;
                            long j19 = (jArr[i39] & (~(255 << i40))) | (((long) (i38 & 127)) << i40);
                            jArr[i39] = j19;
                            jArr[(((iAmazon3 - 7) & i35) + (i35 & 7)) >> 3] = j19;
                            jArr9[iAmazon3] = j18;
                            objArr3[iAmazon3] = objArr2[i36];
                        } else {
                            jArr = jArr8;
                        }
                        i36++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iAmazon = amazon(i5);
                }
                this.purchase++;
                int i41 = this.billing;
                long[] jArr10 = this.yandex;
                int i42 = iAmazon >> 3;
                long j20 = jArr10[i42];
                int i43 = (iAmazon & 7) << 3;
                if (((j20 >> i43) & j2) != j3) {
                    i = 0;
                }
                this.billing = i41 - i;
                int i44 = this.amazon;
                long j21 = (j20 & (~(j2 << i43))) | (j5 << i43);
                jArr10[i42] = j21;
                jArr10[(((iAmazon - 7) & i44) + (i44 & 7)) >> 3] = j21;
                return iAmazon;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i6 = i14;
            i2 = i16;
            c = c2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18730l)) {
            return false;
        }
        C18730l c18730l = (C18730l) obj;
        if (c18730l.purchase != this.purchase) {
            return false;
        }
        long[] jArr = this.loadAd;
        Object[] objArr = this.crashlytics;
        long[] jArr2 = this.yandex;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (c18730l.purchase(j2) != null || !c18730l.loadAd(j2)) {
                                    return false;
                                }
                            } else if (!obj2.equals(c18730l.purchase(j2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.loadAd;
        Object[] objArr = this.crashlytics;
        long[] jArr2 = this.yandex;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j2 ^ (j2 >>> 32)));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean loadAd(long j) {
        int iNumberOfTrailingZeros;
        int i = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.amazon;
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

    public final Object mopub(long j) {
        int iNumberOfTrailingZeros;
        int i = ((int) ((j >>> 32) ^ j)) * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.amazon;
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
        if (iNumberOfTrailingZeros >= 0) {
            return admob(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object purchase(long j) {
        int iNumberOfTrailingZeros;
        int i = ((int) ((j >>> 32) ^ j)) * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.amazon;
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.crashlytics[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void subs(long j, Object obj) {
        int iCrashlytics = crashlytics(j);
        this.loadAd[iCrashlytics] = j;
        this.crashlytics[iCrashlytics] = obj;
    }

    public final String toString() {
        int i;
        int i2;
        if (this.purchase == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.loadAd;
        Object[] objArr = this.crashlytics;
        long[] jArr2 = this.yandex;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.purchase) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void yandex() {
        this.purchase = 0;
        long[] jArr = this.yandex;
        if (jArr != AbstractC12154l.yandex) {
            AbstractC8669l.m2417synchronized(-9187201950435737472L, jArr);
            long[] jArr2 = this.yandex;
            int i = this.amazon;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.crashlytics, 0, this.amazon, (Object) null);
        this.billing = AbstractC12154l.yandex(this.amazon) - this.purchase;
    }

    public /* synthetic */ C18730l() {
        this(6);
    }
}
