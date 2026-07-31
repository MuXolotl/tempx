package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16977l extends AbstractC14183l {
    public int billing;

    public C16977l(int i) {
        this.yandex = AbstractC12154l.yandex;
        this.loadAd = AbstractC12047l.yandex;
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
        long j;
        int i2;
        int i3;
        long j2;
        long[] jArr;
        int i4;
        int i5 = -862048943;
        int i6 = i * (-862048943);
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.amazon;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr2 = this.yandex;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            int i16 = i12;
            int i17 = 0;
            long j3 = (((-i14) >> 63) & (jArr2[i13 + 1] << (64 - i14))) | (jArr2[i13] >>> i14);
            long j4 = i9;
            int i18 = i5;
            int i19 = i9;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = -9187201950435737472L;
            long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j7) >> 3)) & i10;
                long j8 = j6;
                if (this.loadAd[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                j6 = j8;
            }
            long j9 = j6;
            if ((((~j3) << 6) & j3 & j9) != 0) {
                int iPurchase = purchase(i8);
                long j10 = 255;
                if (this.billing != 0 || ((this.yandex[iPurchase >> 3] >> ((iPurchase & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 1;
                    i3 = 0;
                    j2 = 128;
                } else {
                    int i20 = this.amazon;
                    if (i20 > 8) {
                        j2 = 128;
                        if (Long.compare((((long) this.purchase) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.yandex;
                            int i21 = this.amazon;
                            int[] iArr = this.loadAd;
                            Object[] objArr = this.crashlytics;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j11 = j10;
                                long j12 = jArr3[i23] & j9;
                                jArr3[i23] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i23++;
                                i22 = i22;
                                j10 = j11;
                            }
                            j = j10;
                            int length = jArr3.length;
                            int i24 = length - 1;
                            int i25 = length - 2;
                            jArr3[i25] = (jArr3[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i24] = jArr3[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j13 = (jArr3[i27] >> i28) & j;
                                if (j13 != 128 && j13 == 254) {
                                    int i29 = iArr[i26] * i18;
                                    int i30 = i29 ^ (i29 << 16);
                                    int i31 = i30 >>> 7;
                                    int iPurchase2 = purchase(i31);
                                    int i32 = i31 & i21;
                                    int i33 = i18;
                                    if (((iPurchase2 - i32) & i21) / 8 == ((i26 - i32) & i21) / 8) {
                                        int i34 = i15;
                                        int i35 = i17;
                                        jArr3[i27] = (((long) (i30 & 127)) << i28) | (jArr3[i27] & (~(j << i28)));
                                        jArr3[jArr3.length - i34] = (jArr3[i35] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i15 = i34;
                                        i18 = i33;
                                        i17 = i35;
                                    } else {
                                        int i36 = i15;
                                        int i37 = i17;
                                        int i38 = iPurchase2 >> 3;
                                        long j14 = jArr3[i38];
                                        int i39 = (iPurchase2 & 7) << 3;
                                        if (((j14 >> i39) & j) == 128) {
                                            int i40 = i26;
                                            jArr3[i38] = (j14 & (~(j << i39))) | (((long) (i30 & 127)) << i39);
                                            jArr3[i27] = (jArr3[i27] & (~(j << i28))) | (128 << i28);
                                            iArr[iPurchase2] = iArr[i40];
                                            iArr[i40] = i37;
                                            objArr[iPurchase2] = objArr[i40];
                                            objArr[i40] = null;
                                            i4 = i40;
                                        } else {
                                            int i41 = i26;
                                            jArr3[i38] = (((long) (i30 & 127)) << i39) | (j14 & (~(j << i39)));
                                            int i42 = iArr[iPurchase2];
                                            iArr[iPurchase2] = iArr[i41];
                                            iArr[i41] = i42;
                                            Object obj = objArr[iPurchase2];
                                            objArr[iPurchase2] = objArr[i41];
                                            objArr[i41] = obj;
                                            i4 = i41 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i37] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26 = i4 + 1;
                                        i21 = i21;
                                        i18 = i33;
                                        i17 = i37;
                                        i15 = i36;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i2 = i15;
                            i3 = i17;
                            this.billing = AbstractC12154l.yandex(this.amazon) - this.purchase;
                        }
                        iPurchase = purchase(i8);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    i2 = 1;
                    i3 = 0;
                    int iLoadAd = AbstractC12154l.loadAd(this.amazon);
                    long[] jArr4 = this.yandex;
                    int[] iArr2 = this.loadAd;
                    Object[] objArr2 = this.crashlytics;
                    int i43 = this.amazon;
                    billing(iLoadAd);
                    long[] jArr5 = this.yandex;
                    int[] iArr3 = this.loadAd;
                    Object[] objArr3 = this.crashlytics;
                    int i44 = this.amazon;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr4[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j2) {
                            int i46 = iArr2[i45];
                            int i47 = i46 * i18;
                            int i48 = i47 ^ (i47 << 16);
                            int iPurchase3 = purchase(i48 >>> 7);
                            jArr = jArr5;
                            long j15 = i48 & 127;
                            int i49 = iPurchase3 >> 3;
                            int i50 = (iPurchase3 & 7) << 3;
                            long j16 = (jArr[i49] & (~(255 << i50))) | (j15 << i50);
                            jArr[i49] = j16;
                            jArr[(((iPurchase3 - 7) & i44) + (i44 & 7)) >> 3] = j16;
                            iArr3[iPurchase3] = i46;
                            objArr3[iPurchase3] = objArr2[i45];
                        } else {
                            jArr = jArr5;
                        }
                        i45++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iPurchase = purchase(i8);
                }
                this.purchase++;
                int i51 = this.billing;
                long[] jArr6 = this.yandex;
                int i52 = iPurchase >> 3;
                long j17 = jArr6[i52];
                int i53 = (iPurchase & 7) << 3;
                if (((j17 >> i53) & j) == j2) {
                    i3 = i2;
                }
                this.billing = i51 - i3;
                int i54 = this.amazon;
                long j18 = (j17 & (~(j << i53))) | (j4 << i53);
                jArr6[i52] = j18;
                jArr6[(((iPurchase - 7) & i54) + (i54 & 7)) >> 3] = j18;
                return iPurchase;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i9 = i19;
            i5 = i18;
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
        this.loadAd = new int[iMax];
        this.crashlytics = new Object[iMax];
    }

    public final void crashlytics() {
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

    public final Object mopub(int i) {
        int iNumberOfTrailingZeros;
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.amazon;
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
        if (iNumberOfTrailingZeros >= 0) {
            return admob(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final int purchase(int i) {
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

    public final void subs(int i, Object obj) {
        int iAmazon = amazon(i);
        this.loadAd[iAmazon] = i;
        this.crashlytics[iAmazon] = obj;
    }

    public /* synthetic */ C16977l() {
        this(6);
    }
}
