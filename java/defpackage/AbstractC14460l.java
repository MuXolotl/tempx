package defpackage;

import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14460l {
    public static final int[] yandex = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] loadAd = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static final C10038l admob(C10038l c10038l, InterfaceC3841l interfaceC3841l) {
        if (interfaceC3841l.isEmpty()) {
            return c10038l;
        }
        return new C10038l((C7757l) c10038l.f20463l, (InterfaceC7483l) c10038l.f20462l, AbstractC9968l.crashlytics(3, new C0340l(c10038l, interfaceC3841l, false, 10)));
    }

    public static final C16761l amazon(InterfaceC3074l interfaceC3074l, C16141l c16141l, C5138l c5138l) {
        int iMin;
        C11362l c11362l = c16141l.f31608l;
        AbstractC5030l abstractC5030l = ((C1713l) AbstractC9620l.Signature(c11362l.f22912l, c11362l)).crashlytics;
        C17893l c17893l = (C17893l) c5138l.f11181l;
        int i = 1;
        if (!(c17893l.f34846l != 0) && abstractC5030l.isEmpty()) {
            return AbstractC7124l.yandex;
        }
        C16761l c16761l = new C16761l();
        if (((C17893l) c5138l.f11181l).f34846l != 0) {
            int i2 = c17893l.f34846l;
            if (i2 == 0) {
                C1759l.firebase("MutableVector is empty.");
                return null;
            }
            Object[] objArr = c17893l.f34848l;
            int i3 = ((C17149l) objArr[0]).yandex;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = ((C17149l) objArr[i4]).yandex;
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i3 < 0) {
                AbstractC14825l.yandex("negative minIndex");
            }
            int i6 = c17893l.f34846l;
            if (i6 == 0) {
                C1759l.firebase("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = c17893l.f34848l;
            int i7 = ((C17149l) objArr2[0]).loadAd;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = ((C17149l) objArr2[i8]).loadAd;
                if (i9 > i7) {
                    i7 = i9;
                }
            }
            iMin = Math.min(i7, interfaceC3074l.yandex() - 1);
            i = i3;
        } else {
            iMin = 0;
        }
        int size = abstractC5030l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C15920l c15920l = (C15920l) abstractC5030l.get(i10);
            int iYandex = AbstractC13841l.yandex(interfaceC3074l, c15920l.yandex, c15920l.crashlytics);
            if ((i > iYandex || iYandex > iMin) && iYandex >= 0 && iYandex < interfaceC3074l.yandex()) {
                c16761l.yandex(iYandex);
            }
        }
        if (i <= iMin) {
            while (true) {
                c16761l.yandex(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        int i11 = c16761l.loadAd;
        if (i11 == 0) {
            return c16761l;
        }
        Arrays.sort(c16761l.yandex, 0, i11);
        return c16761l;
    }

    public static C10038l billing(C10038l c10038l, InterfaceC4920l interfaceC4920l, C12875l c12875l, int i) {
        if ((i & 2) != 0) {
            c12875l = null;
        }
        return purchase(c10038l, interfaceC4920l, c12875l, 0, AbstractC9968l.crashlytics(3, new C0340l(c10038l, interfaceC4920l, false, 9)));
    }

    public static void crashlytics(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = ((((long) iArr[2]) & 4294967295L) - 1) + j2;
        iArr[2] = (int) j4;
        long j5 = (((long) iArr[3]) & 4294967295L) + 1 + (j4 >> 32);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + j6);
    }

    public static void firebase(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((((long) iArr[2]) & 4294967295L) - j2) + j4;
            iArr[2] = (int) j6;
            long j7 = (((long) iArr[3]) & 4294967295L) + j2 + (j6 >> 32);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = (4294967295L & ((long) iArr[7])) + j2 + j8;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && AbstractC5998l.metrica(iArr, yandex))) {
            crashlytics(iArr);
        }
    }

    public static void isPro(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = (((long) iArr[0]) & 4294967295L) + j13 + j6 + j7 + j8;
        iArr2[0] = (int) j14;
        long j15 = (((((long) iArr[1]) & 4294967295L) + j13) - j) + j7 + j8 + (j14 >> 32);
        iArr2[1] = (int) j15;
        long j16 = ((((long) iArr[2]) & 4294967295L) - j12) + (j15 >> 32);
        iArr2[2] = (int) j16;
        long j17 = ((((((long) iArr[3]) & 4294967295L) + j13) - j2) - j3) + j6 + (j16 >> 32);
        iArr2[3] = (int) j17;
        long j18 = ((((((long) iArr[4]) & 4294967295L) + j13) - j9) - j) + j7 + (j17 >> 32);
        iArr2[4] = (int) j18;
        long j19 = (((long) iArr[5]) & 4294967295L) + j11 + j3 + (j18 >> 32);
        iArr2[5] = (int) j19;
        long j20 = (((long) iArr[6]) & 4294967295L) + j4 + j7 + j8 + (j19 >> 32);
        iArr2[6] = (int) j20;
        long j21 = (((long) iArr[7]) & 4294967295L) + j13 + j11 + j5 + (j20 >> 32);
        iArr2[7] = (int) j21;
        firebase(iArr2, (int) (j21 >> 32));
    }

    public static void loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC5998l.loadAd(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && AbstractC5998l.metrica(iArr3, yandex))) {
            crashlytics(iArr3);
        }
    }

    public static void metrica(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC5998l.ad(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = (((long) iArr3[2]) & 4294967295L) + 1 + j2;
            iArr3[2] = (int) j4;
            long j5 = ((((long) iArr3[3]) & 4294967295L) - 1) + (j4 >> 32);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (((long) iArr3[6]) & 4294967295L);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & ((long) iArr3[7])) - 1) + j6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[PHI: r6
  0x0048: PHI (r6v35 int) = (r6v4 int), (r6v20 int), (r6v20 int), (r6v22 int), (r6v31 int), (r6v31 int), (r6v42 int) binds: [B:94:0x016c, B:63:0x00e5, B:65:0x00eb, B:57:0x00cd, B:39:0x0087, B:41:0x008d, B:22:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[PHI: r6
  0x0066: PHI (r6v32 int) = (r6v5 int), (r6v20 int), (r6v20 int), (r6v23 int), (r6v31 int), (r6v40 int), (r6v41 int) binds: [B:93:0x0164, B:67:0x00ef, B:69:0x00f5, B:56:0x00c6, B:41:0x008d, B:29:0x005e, B:28:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public static final String mopub(int i, int i2, byte[] bArr) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        if (i6 < 0 || i2 > bArr.length || i6 > i2) {
            StringBuilder sb = new StringBuilder("size=");
            AbstractC12900l.tapsense(sb, bArr.length, " beginIndex=", i6, " endIndex=");
            C11983l.mopub(i2, sb);
            return null;
        }
        char[] cArr = new char[i2 - i6];
        int i7 = 0;
        while (i6 < i2) {
            byte b = bArr[i6];
            if (b >= 0) {
                int i8 = i7 + 1;
                cArr[i7] = (char) b;
                i6++;
                while (i6 < i2) {
                    byte b2 = bArr[i6];
                    if (b2 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i8] = (char) b2;
                    i8++;
                }
                Unit unit = Unit.INSTANCE;
                i7 = i8;
            } else {
                if ((b >> 5) == -2) {
                    int i9 = i6 + 1;
                    if (i2 <= i9) {
                        i3 = i7 + 1;
                        cArr[i7] = 65533;
                    } else {
                        byte b3 = bArr[i9];
                        if ((b3 & 192) == 128) {
                            int i10 = (b << 6) ^ (b3 ^ 3968);
                            if (i10 < 128) {
                                i3 = i7 + 1;
                                cArr[i7] = 65533;
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                int i11 = i7 + 1;
                                cArr[i7] = (char) i10;
                                Unit unit3 = Unit.INSTANCE;
                                i3 = i11;
                            }
                            i5 = 2;
                            i6 += i5;
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = 65533;
                        }
                    }
                    Unit unit4 = Unit.INSTANCE;
                    i5 = 1;
                    i6 += i5;
                } else if ((b >> 4) == -2) {
                    int i12 = i6 + 2;
                    if (i2 <= i12) {
                        i3 = i7 + 1;
                        cArr[i7] = 65533;
                        Unit unit5 = Unit.INSTANCE;
                        int i13 = i6 + 1;
                        if (i2 <= i13 || (bArr[i13] & 192) != 128) {
                            i5 = 1;
                        } else {
                            i5 = 2;
                        }
                    } else {
                        byte b4 = bArr[i6 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i12];
                            if ((b5 & 192) == 128) {
                                int i14 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i14 < 2048) {
                                    i3 = i7 + 1;
                                    cArr[i7] = 65533;
                                } else {
                                    if (55296 > i14 || i14 >= 57344) {
                                        int i15 = i7 + 1;
                                        cArr[i7] = (char) i14;
                                        Unit unit6 = Unit.INSTANCE;
                                        i3 = i15;
                                    } else {
                                        i3 = i7 + 1;
                                        cArr[i7] = 65533;
                                    }
                                    i5 = 3;
                                }
                                Unit unit7 = Unit.INSTANCE;
                                i5 = 3;
                            } else {
                                i3 = i7 + 1;
                                cArr[i7] = 65533;
                                Unit unit8 = Unit.INSTANCE;
                                i5 = 2;
                            }
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = 65533;
                            Unit unit9 = Unit.INSTANCE;
                            i5 = 1;
                        }
                    }
                    i6 += i5;
                } else if ((b >> 3) == -2) {
                    int i16 = i6 + 3;
                    if (i2 <= i16) {
                        i3 = i7 + 1;
                        cArr[i7] = 65533;
                        Unit unit10 = Unit.INSTANCE;
                        int i17 = i6 + 1;
                        if (i2 <= i17 || (bArr[i17] & 192) != 128) {
                            i5 = 1;
                        } else {
                            int i18 = i6 + 2;
                            if (i2 <= i18 || (bArr[i18] & 192) != 128) {
                                i5 = 2;
                            } else {
                                i5 = 3;
                            }
                        }
                    } else {
                        byte b6 = bArr[i6 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i6 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i16];
                                if ((b8 & 192) == 128) {
                                    int i19 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i19 > 1114111) {
                                        i3 = i7 + 1;
                                        cArr[i7] = 65533;
                                    } else {
                                        if ((55296 > i19 || i19 >= 57344) && i19 >= 65536) {
                                            if (i19 != 65533) {
                                                cArr[i7] = (char) ((i19 >>> 10) + 55232);
                                                i4 = i7 + 2;
                                                cArr[i7 + 1] = (char) ((i19 & 1023) + 56320);
                                            } else {
                                                cArr[i7] = 65533;
                                                i4 = i7 + 1;
                                            }
                                            Unit unit11 = Unit.INSTANCE;
                                            i3 = i4;
                                        } else {
                                            i3 = i7 + 1;
                                            cArr[i7] = 65533;
                                        }
                                        i5 = 4;
                                    }
                                    Unit unit12 = Unit.INSTANCE;
                                    i5 = 4;
                                } else {
                                    i3 = i7 + 1;
                                    cArr[i7] = 65533;
                                    Unit unit13 = Unit.INSTANCE;
                                    i5 = 3;
                                }
                            } else {
                                i3 = i7 + 1;
                                cArr[i7] = 65533;
                                Unit unit14 = Unit.INSTANCE;
                                i5 = 2;
                            }
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = 65533;
                            Unit unit15 = Unit.INSTANCE;
                            i5 = 1;
                        }
                    }
                    i6 += i5;
                } else {
                    i3 = i7 + 1;
                    cArr[i7] = 65533;
                    i6++;
                }
                i7 = i3;
            }
        }
        return AbstractC16648l.startapp(cArr, 0, i7);
    }

    public static final C10038l purchase(C10038l c10038l, InterfaceC10233l interfaceC10233l, InterfaceC18335l interfaceC18335l, int i, InterfaceC1220l interfaceC1220l) {
        return new C10038l((C7757l) c10038l.f20463l, interfaceC18335l != null ? new C9598l(c10038l, interfaceC10233l, interfaceC18335l, i) : (InterfaceC7483l) c10038l.f20462l, interfaceC1220l);
    }

    public static void remoteconfig(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC5998l.pro(iArr, iArr3);
        isPro(iArr3, iArr2);
    }

    public static InterfaceC17242l smaato(InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(new C17197l(1200, AbstractC14055l.yandex, 30.0f));
    }

    public static void subs(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        AbstractC5998l.tapsense(iArr, iArr2, iArr4);
        isPro(iArr4, iArr3);
    }

    public static void vip(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC5998l.pro(iArr, iArr3);
        while (true) {
            isPro(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC5998l.pro(iArr2, iArr3);
            }
        }
    }

    public static final void yandex(C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-573699091);
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            c6956l.m2123default(-1394531265);
            AbstractC17863l.yandex(48, c15578l, c6956l, null);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15701l(c15578l, i, 11);
        }
    }
}
