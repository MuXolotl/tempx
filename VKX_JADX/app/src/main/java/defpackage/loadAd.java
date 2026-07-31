package defpackage;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class loadAd {
    public static final byte[] yandex = "0123456789abcdef".getBytes(AbstractC9050l.yandex);
    public static final long[] loadAd = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:0: B:8:0x0019->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    public static final int amazon(C0869l c0869l, C5884l c5884l, boolean z) {
        int i;
        int i2;
        int i3;
        C18346l c18346l;
        int i4;
        C18346l c18346l2 = c0869l.f2527l;
        if (c18346l2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c18346l2.yandex;
        int i5 = c18346l2.loadAd;
        int i6 = c18346l2.crashlytics;
        int[] iArr = c5884l.f12401l;
        C18346l c18346l3 = c18346l2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c18346l3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c18346l3 = c18346l3.billing;
                            int i16 = c18346l3.loadAd;
                            byte[] bArr2 = c18346l3.yandex;
                            i2 = c18346l3.crashlytics;
                            if (c18346l3 == c18346l2) {
                                i3 = i16;
                                bArr = bArr2;
                                c18346l3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        C18346l c18346l4 = c18346l3.billing;
                        i3 = c18346l4.loadAd;
                        byte[] bArr3 = c18346l4.yandex;
                        i4 = c18346l4.crashlytics;
                        if (c18346l4 != c18346l2) {
                            c18346l = c18346l4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c18346l = null;
                        }
                    } else {
                        c18346l = c18346l3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c18346l3 = c18346l;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c18346l3 = c18346l;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static final String crashlytics(C0869l c0869l, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (c0869l.ads(j2) == 13) {
                String strMo712l = c0869l.mo712l(j2, AbstractC9050l.yandex);
                c0869l.skip(2L);
                return strMo712l;
            }
        }
        String strMo712l2 = c0869l.mo712l(j, AbstractC9050l.yandex);
        c0869l.skip(1L);
        return strMo712l2;
    }

    public static final boolean loadAd(C18346l c18346l, int i, byte[] bArr, int i2, int i3) {
        int i4 = c18346l.crashlytics;
        byte[] bArr2 = c18346l.yandex;
        while (i2 < i3) {
            if (i == i4) {
                c18346l = c18346l.billing;
                byte[] bArr3 = c18346l.yandex;
                bArr2 = bArr3;
                i = c18346l.loadAd;
                i4 = c18346l.crashlytics;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final long yandex(C0869l c0869l, C3844l c3844l, long j, long j2, int i) {
        C18346l c18346l;
        long j3 = j;
        long j4 = j2;
        long j5 = i;
        AbstractC9334l.crashlytics(c3844l.purchase(), 0L, j5);
        if (i <= 0) {
            C8339l.metrica("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            C10754l.metrica(AbstractC2812l.ads(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbSignature = AbstractC0653l.Signature(j3, "fromIndex > toIndex: ", " > ");
            sbSignature.append(j4);
            throw new IllegalArgumentException(sbSignature.toString().toString());
        }
        long j6 = c0869l.f2526l;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (c18346l = c0869l.f2527l) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                c18346l = c18346l.mopub;
                j6 -= (long) (c18346l.crashlytics - c18346l.loadAd);
            }
            byte[] bArrSubs = c3844l.subs();
            byte b = bArrSubs[0];
            long jMin = Math.min(j4, (c0869l.f2526l - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = c18346l.yandex;
                int iMin = (int) Math.min(c18346l.crashlytics, (((long) c18346l.loadAd) + jMin) - j6);
                for (int i2 = (int) ((((long) c18346l.loadAd) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b && loadAd(c18346l, i2 + 1, bArrSubs, 1, i)) {
                        return ((long) (i2 - c18346l.loadAd)) + j6;
                    }
                }
                j6 += (long) (c18346l.crashlytics - c18346l.loadAd);
                c18346l = c18346l.billing;
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (c18346l.crashlytics - c18346l.loadAd));
            if (j8 > j3) {
                break;
            }
            c18346l = c18346l.billing;
            j7 = j8;
        }
        byte[] bArrSubs2 = c3844l.subs();
        byte b2 = bArrSubs2[0];
        long jMin2 = Math.min(j4, (c0869l.f2526l - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = c18346l.yandex;
            int iMin2 = (int) Math.min(c18346l.crashlytics, (((long) c18346l.loadAd) + jMin2) - j7);
            for (int i3 = (int) ((((long) c18346l.loadAd) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b2 && loadAd(c18346l, i3 + 1, bArrSubs2, 1, i)) {
                    return ((long) (i3 - c18346l.loadAd)) + j7;
                }
            }
            j7 += (long) (c18346l.crashlytics - c18346l.loadAd);
            c18346l = c18346l.billing;
            j3 = j7;
        }
        return -1L;
    }
}
