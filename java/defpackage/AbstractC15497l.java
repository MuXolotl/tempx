package defpackage;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15497l {
    public static final int[] yandex = {-1, -1, -1, -3};
    public static final int[] loadAd = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] crashlytics = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void admob(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        AbstractC9168l.subs(iArr, iArr2, iArr4);
        firebase(iArr4, iArr3);
    }

    public static void amazon(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        int i = (int) j4;
        iArr3[3] = i;
        if (((int) (j4 >>> 32)) != 0 || ((i >>> 1) >= 2147483646 && AbstractC9168l.billing(iArr3, yandex))) {
            purchase(iArr3);
        }
    }

    public static double billing(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dBilling = AbstractC2533l.billing(d);
        double d3 = ((dBilling + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dIsPro = isPro(dBilling, d3);
        double dAbs = Math.abs(dIsPro - d2);
        if (dIsPro < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dAmazon = ((AbstractC2533l.amazon(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (dAmazon < 0.0d || dAmazon > 100.0d) {
            return -1.0d;
        }
        return dAmazon;
    }

    public static final void crashlytics(int i, Function2 function2, C15578l c15578l, Function2 function3, Function2 function4, InterfaceC10137l interfaceC10137l, Function2 function5, C6956l c6956l, int i2) {
        int i3;
        c6956l.m2133new(-280287501);
        int i4 = i2 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.admob(function2) ? 32 : 16) | (c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function3) ? 2048 : 1024) | (c6956l.admob(function4) ? 16384 : 8192) | (c6956l.billing(interfaceC10137l) ? 131072 : 65536) | (c6956l.admob(function5) ? 1048576 : 524288);
        if (c6956l.m2127for(i4 & 1, (599187 & i4) != 599186)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C3518l();
                c6956l.m2147try(objM2132native);
            }
            C3518l c3518l = (C3518l) objM2132native;
            boolean z = ((i4 & 896) == 256) | ((i4 & 458752) == 131072) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576);
            Object objM2132native2 = c6956l.m2132native();
            if (z || objM2132native2 == c13863l) {
                i3 = 0;
                objM2132native2 = new C18599l(interfaceC10137l, function2, function3, function4, i, function5, c3518l, c15578l);
                c6956l.m2147try(objM2132native2);
            } else {
                i3 = 0;
            }
            AbstractC4333l.yandex(null, (Function2) objM2132native2, c6956l, i3, 1);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4227l(i, function2, c15578l, function3, function4, interfaceC10137l, function5, i2);
        }
    }

    public static void firebase(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j7 + (j8 << 1);
        long j10 = j3 + j9;
        long j11 = j6 + (j9 << 1);
        long j12 = j5 + (j11 << 1);
        long j13 = j + j12;
        iArr2[0] = (int) j13;
        long j14 = j2 + j11 + (j13 >>> 32);
        iArr2[1] = (int) j14;
        long j15 = j10 + (j14 >>> 32);
        iArr2[2] = (int) j15;
        long j16 = j4 + j8 + (j12 << 1) + (j15 >>> 32);
        iArr2[3] = (int) j16;
        smaato(iArr2, (int) (j16 >>> 32));
    }

    public static double isPro(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0160  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0167  */
    /* JADX WARN: Code duplicated, block: B:124:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0170  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:130:0x0176  */
    /* JADX WARN: Code duplicated, block: B:131:0x0179  */
    /* JADX WARN: Code duplicated, block: B:134:0x017e  */
    /* JADX WARN: Code duplicated, block: B:135:0x018d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0193  */
    /* JADX WARN: Code duplicated, block: B:139:0x019a  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01be  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e1 A[PHI: r31
  0x01e1: PHI (r31v3 int) = (r31v1 int), (r31v4 int) binds: [B:151:0x01df, B:149:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:160:0x0205  */
    /* JADX WARN: Code duplicated, block: B:162:0x020b  */
    /* JADX WARN: Code duplicated, block: B:168:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x021c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0280  */
    /* JADX WARN: Code duplicated, block: B:174:0x0297  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    public static final void loadAd(InterfaceC17242l interfaceC17242l, Function2 function2, Function2 function3, Function2 function4, Function2 function5, int i, long j, long j2, InterfaceC10137l interfaceC10137l, final C15578l c15578l, C6956l c6956l, final int i2, final int i3) {
        int i4;
        Function2 function6;
        int i5;
        Function2 function7;
        int i6;
        int i7;
        Function2 function8;
        int i8;
        int i9;
        Function2 function9;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        final InterfaceC17242l interfaceC17242l2;
        final int i13;
        final InterfaceC10137l interfaceC10137l2;
        final Function2 function10;
        final Function2 function11;
        final Function2 function12;
        final Function2 function13;
        final long j3;
        final long j4;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l3;
        Function2 function14;
        Function2 function15;
        Function2 function16;
        Function2 function17;
        long j5;
        long jLoadAd;
        InterfaceC17242l interfaceC17242l4;
        int i14;
        long j6;
        int i15;
        InterfaceC10137l c18004l;
        int i16;
        int i17;
        boolean z3;
        Object objM2132native;
        boolean z4;
        C16721l c16721l;
        boolean z5;
        Object objM2132native2;
        int i18;
        int i19;
        c6956l.m2133new(-1211482744);
        int i20 = i3 & 1;
        if (i20 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i21 = i3 & 2;
        if (i21 == 0) {
            if ((i2 & 48) == 0) {
                function6 = function2;
                i4 |= c6956l.admob(function6) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    function7 = function3;
                    if (c6956l.admob(function7)) {
                        i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        function8 = function4;
                        if (c6956l.admob(function8)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            function9 = function5;
                            if (c6956l.admob(function9)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        i11 = i4 | 196608;
                        if ((1572864 & i2) != 0) {
                            if ((i3 & 64) == 0 || !c6956l.purchase(j)) {
                                i19 = 524288;
                            } else {
                                i19 = 1048576;
                            }
                            i11 |= i19;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                i12 = i20;
                                int i22 = c6956l.purchase(j2) ? 8388608 : 4194304;
                                i11 |= i22;
                            } else {
                                i12 = i20;
                            }
                            i11 |= i22;
                        } else {
                            i12 = i20;
                        }
                        if ((i2 & 100663296) != 0) {
                            i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                        }
                        if ((i2 & 805306368) == 0) {
                            if (c6956l.admob(c15578l)) {
                                i18 = 536870912;
                            } else {
                                i18 = 268435456;
                            }
                            i11 |= i18;
                        }
                        z = true;
                        if ((306783379 & i11) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (c6956l.m2127for(i11 & 1, z2)) {
                            c6956l.m2141switch();
                            if ((i2 & 1) != 0 || c6956l.ad()) {
                                if (i12 != 0) {
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                                if (i21 != 0) {
                                    function14 = AbstractC17185l.yandex;
                                } else {
                                    function14 = function6;
                                }
                                if (i5 != 0) {
                                    function15 = AbstractC17185l.loadAd;
                                } else {
                                    function15 = function7;
                                }
                                if (i7 != 0) {
                                    function16 = AbstractC17185l.crashlytics;
                                } else {
                                    function16 = function8;
                                }
                                if (i9 != 0) {
                                    function17 = AbstractC17185l.amazon;
                                } else {
                                    function17 = function9;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                    i11 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                    i11 &= -29360129;
                                } else {
                                    jLoadAd = j2;
                                }
                                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    WeakHashMap weakHashMap = C12923l.pro;
                                    interfaceC17242l4 = interfaceC17242l3;
                                    c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                    i14 = i11 & (-234881025);
                                    j6 = j5;
                                    i15 = 2;
                                } else {
                                    interfaceC17242l4 = interfaceC17242l3;
                                    i14 = i11;
                                    j6 = j5;
                                    i15 = 2;
                                    c18004l = interfaceC10137l;
                                }
                            } else {
                                c6956l.m2124else();
                                if ((i3 & 64) != 0) {
                                    i11 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i11 &= -29360129;
                                }
                                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    i11 &= -234881025;
                                }
                                interfaceC17242l4 = interfaceC17242l;
                                i15 = i;
                                c18004l = interfaceC10137l;
                                i14 = i11;
                                function14 = function6;
                                function15 = function7;
                                function16 = function8;
                                function17 = function9;
                                j6 = j;
                                jLoadAd = j2;
                            }
                            c6956l.adcel();
                            i16 = (234881024 & i14) ^ 100663296;
                            if (i16 > 67108864 || !c6956l.billing(c18004l)) {
                                i17 = i14;
                                if ((i17 & 100663296) != 67108864) {
                                    z3 = false;
                                }
                                objM2132native = c6956l.m2132native();
                                z4 = z3;
                                Object obj = C1867l.yandex;
                                if (z4 || objM2132native == obj) {
                                    objM2132native = new C16721l(c18004l);
                                    c6956l.m2147try(objM2132native);
                                }
                                c16721l = (C16721l) objM2132native;
                                boolean zBilling = c6956l.billing(c16721l);
                                long j7 = j6;
                                if ((i16 > 67108864 || !c6956l.billing(c18004l)) && (i17 & 100663296) != 67108864) {
                                }
                                z5 = zBilling | z;
                                objM2132native2 = c6956l.m2132native();
                                if (z5 || objM2132native2 == obj) {
                                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                                    c6956l.m2147try(objM2132native2);
                                }
                                Function2 function18 = function14;
                                Function2 function19 = function15;
                                Function2 function20 = function16;
                                Function2 function21 = function17;
                                int i23 = i15;
                                int i24 = i17 >> 12;
                                long j8 = jLoadAd;
                                AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j7, j8, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i23, function18, c15578l, function20, function21, c16721l, function19), c6956l), c6956l, (i24 & 7168) | (i24 & 896) | 12582912, 114);
                                j3 = j7;
                                j4 = j8;
                                interfaceC17242l2 = interfaceC17242l4;
                                interfaceC10137l2 = c18004l;
                                function10 = function18;
                                function11 = function19;
                                function12 = function20;
                                function13 = function21;
                                i13 = i23;
                            } else {
                                i17 = i14;
                            }
                            z3 = true;
                            objM2132native = c6956l.m2132native();
                            z4 = z3;
                            Object obj2 = C1867l.yandex;
                            if (z4) {
                                objM2132native = new C16721l(c18004l);
                                c6956l.m2147try(objM2132native);
                            } else {
                                objM2132native = new C16721l(c18004l);
                                c6956l.m2147try(objM2132native);
                            }
                            c16721l = (C16721l) objM2132native;
                            boolean zBilling2 = c6956l.billing(c16721l);
                            long j9 = j6;
                            z = i16 > 67108864 ? false : false;
                            z5 = zBilling2 | z;
                            objM2132native2 = c6956l.m2132native();
                            if (z5) {
                                objM2132native2 = new C10207l(c16721l, c18004l, 0);
                                c6956l.m2147try(objM2132native2);
                            } else {
                                objM2132native2 = new C10207l(c16721l, c18004l, 0);
                                c6956l.m2147try(objM2132native2);
                            }
                            Function2 function110 = function14;
                            Function2 function111 = function15;
                            Function2 function22 = function16;
                            Function2 function23 = function17;
                            int i25 = i15;
                            int i26 = i17 >> 12;
                            long j10 = jLoadAd;
                            AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j9, j10, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i25, function110, c15578l, function22, function23, c16721l, function111), c6956l), c6956l, (i26 & 7168) | (i26 & 896) | 12582912, 114);
                            j3 = j9;
                            j4 = j10;
                            interfaceC17242l2 = interfaceC17242l4;
                            interfaceC10137l2 = c18004l;
                            function10 = function110;
                            function11 = function111;
                            function12 = function22;
                            function13 = function23;
                            i13 = i25;
                        } else {
                            c6956l.m2124else();
                            interfaceC17242l2 = interfaceC17242l;
                            i13 = i;
                            interfaceC10137l2 = interfaceC10137l;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            j3 = j;
                            j4 = j2;
                        }
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iPurchase = AbstractC0545l.purchase(i2 | 1);
                                    AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj3, iPurchase, i3);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i4 |= 24576;
                    function9 = function5;
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            i12 = i20;
                            if (c6956l.purchase(j2)) {
                            }
                            i11 |= i22;
                        } else {
                            i12 = i20;
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    if ((i2 & 100663296) != 0) {
                        i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (c6956l.admob(c15578l)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    z = true;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i11 & 1, z2)) {
                        c6956l.m2141switch();
                        if ((i2 & 1) != 0) {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap2 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        } else {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap3 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        }
                        c6956l.adcel();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        objM2132native = c6956l.m2132native();
                        z4 = z3;
                        Object obj3 = C1867l.yandex;
                        if (z4) {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        }
                        c16721l = (C16721l) objM2132native;
                        boolean zBilling3 = c6956l.billing(c16721l);
                        long j11 = j6;
                        if (i16 > 67108864) {
                        }
                        z5 = zBilling3 | z;
                        objM2132native2 = c6956l.m2132native();
                        if (z5) {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        }
                        Function2 function112 = function14;
                        Function2 function113 = function15;
                        Function2 function24 = function16;
                        Function2 function25 = function17;
                        int i27 = i15;
                        int i28 = i17 >> 12;
                        long j12 = jLoadAd;
                        AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j11, j12, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i27, function112, c15578l, function24, function25, c16721l, function113), c6956l), c6956l, (i28 & 7168) | (i28 & 896) | 12582912, 114);
                        j3 = j11;
                        j4 = j12;
                        interfaceC17242l2 = interfaceC17242l4;
                        interfaceC10137l2 = c18004l;
                        function10 = function112;
                        function11 = function113;
                        function12 = function24;
                        function13 = function25;
                        i13 = i27;
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l2 = interfaceC17242l;
                        i13 = i;
                        interfaceC10137l2 = interfaceC10137l;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        j3 = j;
                        j4 = j2;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                                AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj4, iPurchase, i3);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i4 |= 3072;
                function8 = function4;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        function9 = function5;
                        if (c6956l.admob(function9)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            i12 = i20;
                            if (c6956l.purchase(j2)) {
                            }
                            i11 |= i22;
                        } else {
                            i12 = i20;
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    if ((i2 & 100663296) != 0) {
                        i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (c6956l.admob(c15578l)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    z = true;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i11 & 1, z2)) {
                        c6956l.m2141switch();
                        if ((i2 & 1) != 0) {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap4 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        } else {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap5 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        }
                        c6956l.adcel();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        objM2132native = c6956l.m2132native();
                        z4 = z3;
                        Object obj4 = C1867l.yandex;
                        if (z4) {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        }
                        c16721l = (C16721l) objM2132native;
                        boolean zBilling4 = c6956l.billing(c16721l);
                        long j13 = j6;
                        if (i16 > 67108864) {
                        }
                        z5 = zBilling4 | z;
                        objM2132native2 = c6956l.m2132native();
                        if (z5) {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        }
                        Function2 function114 = function14;
                        Function2 function115 = function15;
                        Function2 function26 = function16;
                        Function2 function27 = function17;
                        int i29 = i15;
                        int i210 = i17 >> 12;
                        long j14 = jLoadAd;
                        AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j13, j14, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i29, function114, c15578l, function26, function27, c16721l, function115), c6956l), c6956l, (i210 & 7168) | (i210 & 896) | 12582912, 114);
                        j3 = j13;
                        j4 = j14;
                        interfaceC17242l2 = interfaceC17242l4;
                        interfaceC10137l2 = c18004l;
                        function10 = function114;
                        function11 = function115;
                        function12 = function26;
                        function13 = function27;
                        i13 = i29;
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l2 = interfaceC17242l;
                        i13 = i;
                        interfaceC10137l2 = interfaceC10137l;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        j3 = j;
                        j4 = j2;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                ((Integer) obj6).getClass();
                                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                                AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj5, iPurchase, i3);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i4 |= 24576;
                function9 = function5;
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i12 = i20;
                        if (c6956l.purchase(j2)) {
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                if ((i2 & 100663296) != 0) {
                    i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                z = true;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i11 & 1, z2)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap6 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    } else {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap7 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    }
                    c6956l.adcel();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    objM2132native = c6956l.m2132native();
                    z4 = z3;
                    Object obj5 = C1867l.yandex;
                    if (z4) {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    }
                    c16721l = (C16721l) objM2132native;
                    boolean zBilling5 = c6956l.billing(c16721l);
                    long j15 = j6;
                    if (i16 > 67108864) {
                    }
                    z5 = zBilling5 | z;
                    objM2132native2 = c6956l.m2132native();
                    if (z5) {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function2 function116 = function14;
                    Function2 function117 = function15;
                    Function2 function28 = function16;
                    Function2 function29 = function17;
                    int i211 = i15;
                    int i212 = i17 >> 12;
                    long j16 = jLoadAd;
                    AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j15, j16, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i211, function116, c15578l, function28, function29, c16721l, function117), c6956l), c6956l, (i212 & 7168) | (i212 & 896) | 12582912, 114);
                    j3 = j15;
                    j4 = j16;
                    interfaceC17242l2 = interfaceC17242l4;
                    interfaceC10137l2 = c18004l;
                    function10 = function116;
                    function11 = function117;
                    function12 = function28;
                    function13 = function29;
                    i13 = i211;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    i13 = i;
                    interfaceC10137l2 = interfaceC10137l;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    j3 = j;
                    j4 = j2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            int iPurchase = AbstractC0545l.purchase(i2 | 1);
                            AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj6, iPurchase, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 384;
            function7 = function3;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    function8 = function4;
                    if (c6956l.admob(function8)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        function9 = function5;
                        if (c6956l.admob(function9)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            i12 = i20;
                            if (c6956l.purchase(j2)) {
                            }
                            i11 |= i22;
                        } else {
                            i12 = i20;
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    if ((i2 & 100663296) != 0) {
                        i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (c6956l.admob(c15578l)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    z = true;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i11 & 1, z2)) {
                        c6956l.m2141switch();
                        if ((i2 & 1) != 0) {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap8 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        } else {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap9 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        }
                        c6956l.adcel();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        objM2132native = c6956l.m2132native();
                        z4 = z3;
                        Object obj6 = C1867l.yandex;
                        if (z4) {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        }
                        c16721l = (C16721l) objM2132native;
                        boolean zBilling6 = c6956l.billing(c16721l);
                        long j17 = j6;
                        if (i16 > 67108864) {
                        }
                        z5 = zBilling6 | z;
                        objM2132native2 = c6956l.m2132native();
                        if (z5) {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        }
                        Function2 function118 = function14;
                        Function2 function119 = function15;
                        Function2 function210 = function16;
                        Function2 function211 = function17;
                        int i213 = i15;
                        int i214 = i17 >> 12;
                        long j18 = jLoadAd;
                        AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j17, j18, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i213, function118, c15578l, function210, function211, c16721l, function119), c6956l), c6956l, (i214 & 7168) | (i214 & 896) | 12582912, 114);
                        j3 = j17;
                        j4 = j18;
                        interfaceC17242l2 = interfaceC17242l4;
                        interfaceC10137l2 = c18004l;
                        function10 = function118;
                        function11 = function119;
                        function12 = function210;
                        function13 = function211;
                        i13 = i213;
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l2 = interfaceC17242l;
                        i13 = i;
                        interfaceC10137l2 = interfaceC10137l;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        j3 = j;
                        j4 = j2;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                ((Integer) obj8).getClass();
                                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                                AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj7, iPurchase, i3);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i4 |= 24576;
                function9 = function5;
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i12 = i20;
                        if (c6956l.purchase(j2)) {
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                if ((i2 & 100663296) != 0) {
                    i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                z = true;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i11 & 1, z2)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap10 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    } else {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap11 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    }
                    c6956l.adcel();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    objM2132native = c6956l.m2132native();
                    z4 = z3;
                    Object obj7 = C1867l.yandex;
                    if (z4) {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    }
                    c16721l = (C16721l) objM2132native;
                    boolean zBilling7 = c6956l.billing(c16721l);
                    long j19 = j6;
                    if (i16 > 67108864) {
                    }
                    z5 = zBilling7 | z;
                    objM2132native2 = c6956l.m2132native();
                    if (z5) {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function2 function1110 = function14;
                    Function2 function1111 = function15;
                    Function2 function212 = function16;
                    Function2 function213 = function17;
                    int i215 = i15;
                    int i216 = i17 >> 12;
                    long j110 = jLoadAd;
                    AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j19, j110, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i215, function1110, c15578l, function212, function213, c16721l, function1111), c6956l), c6956l, (i216 & 7168) | (i216 & 896) | 12582912, 114);
                    j3 = j19;
                    j4 = j110;
                    interfaceC17242l2 = interfaceC17242l4;
                    interfaceC10137l2 = c18004l;
                    function10 = function1110;
                    function11 = function1111;
                    function12 = function212;
                    function13 = function213;
                    i13 = i215;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    i13 = i;
                    interfaceC10137l2 = interfaceC10137l;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    j3 = j;
                    j4 = j2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            ((Integer) obj9).getClass();
                            int iPurchase = AbstractC0545l.purchase(i2 | 1);
                            AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj8, iPurchase, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 3072;
            function8 = function4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    function9 = function5;
                    if (c6956l.admob(function9)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i12 = i20;
                        if (c6956l.purchase(j2)) {
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                if ((i2 & 100663296) != 0) {
                    i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                z = true;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i11 & 1, z2)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap12 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    } else {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap13 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    }
                    c6956l.adcel();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    objM2132native = c6956l.m2132native();
                    z4 = z3;
                    Object obj8 = C1867l.yandex;
                    if (z4) {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    }
                    c16721l = (C16721l) objM2132native;
                    boolean zBilling8 = c6956l.billing(c16721l);
                    long j111 = j6;
                    if (i16 > 67108864) {
                    }
                    z5 = zBilling8 | z;
                    objM2132native2 = c6956l.m2132native();
                    if (z5) {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function2 function1112 = function14;
                    Function2 function1113 = function15;
                    Function2 function214 = function16;
                    Function2 function215 = function17;
                    int i217 = i15;
                    int i218 = i17 >> 12;
                    long j112 = jLoadAd;
                    AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j111, j112, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i217, function1112, c15578l, function214, function215, c16721l, function1113), c6956l), c6956l, (i218 & 7168) | (i218 & 896) | 12582912, 114);
                    j3 = j111;
                    j4 = j112;
                    interfaceC17242l2 = interfaceC17242l4;
                    interfaceC10137l2 = c18004l;
                    function10 = function1112;
                    function11 = function1113;
                    function12 = function214;
                    function13 = function215;
                    i13 = i217;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    i13 = i;
                    interfaceC10137l2 = interfaceC10137l;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    j3 = j;
                    j4 = j2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            ((Integer) obj10).getClass();
                            int iPurchase = AbstractC0545l.purchase(i2 | 1);
                            AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj9, iPurchase, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 24576;
            function9 = function5;
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i12 = i20;
                    if (c6956l.purchase(j2)) {
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                i11 |= i22;
            } else {
                i12 = i20;
            }
            if ((i2 & 100663296) != 0) {
                i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (c6956l.admob(c15578l)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            z = true;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i11 & 1, z2)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap14 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                } else {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap15 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                }
                c6956l.adcel();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                objM2132native = c6956l.m2132native();
                z4 = z3;
                Object obj9 = C1867l.yandex;
                if (z4) {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                }
                c16721l = (C16721l) objM2132native;
                boolean zBilling9 = c6956l.billing(c16721l);
                long j113 = j6;
                if (i16 > 67108864) {
                }
                z5 = zBilling9 | z;
                objM2132native2 = c6956l.m2132native();
                if (z5) {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                }
                Function2 function1114 = function14;
                Function2 function1115 = function15;
                Function2 function216 = function16;
                Function2 function217 = function17;
                int i219 = i15;
                int i2110 = i17 >> 12;
                long j114 = jLoadAd;
                AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j113, j114, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i219, function1114, c15578l, function216, function217, c16721l, function1115), c6956l), c6956l, (i2110 & 7168) | (i2110 & 896) | 12582912, 114);
                j3 = j113;
                j4 = j114;
                interfaceC17242l2 = interfaceC17242l4;
                interfaceC10137l2 = c18004l;
                function10 = function1114;
                function11 = function1115;
                function12 = function216;
                function13 = function217;
                i13 = i219;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                i13 = i;
                interfaceC10137l2 = interfaceC10137l;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                j3 = j;
                j4 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj10, Object obj11) {
                        ((Integer) obj11).getClass();
                        int iPurchase = AbstractC0545l.purchase(i2 | 1);
                        AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj10, iPurchase, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 48;
        function6 = function2;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                function7 = function3;
                if (c6956l.admob(function7)) {
                    i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    function8 = function4;
                    if (c6956l.admob(function8)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        function9 = function5;
                        if (c6956l.admob(function9)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            i12 = i20;
                            if (c6956l.purchase(j2)) {
                            }
                            i11 |= i22;
                        } else {
                            i12 = i20;
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    if ((i2 & 100663296) != 0) {
                        i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (c6956l.admob(c15578l)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    z = true;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i11 & 1, z2)) {
                        c6956l.m2141switch();
                        if ((i2 & 1) != 0) {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap16 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        } else {
                            if (i12 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                interfaceC17242l3 = interfaceC17242l;
                            }
                            if (i21 != 0) {
                                function14 = AbstractC17185l.yandex;
                            } else {
                                function14 = function6;
                            }
                            if (i5 != 0) {
                                function15 = AbstractC17185l.loadAd;
                            } else {
                                function15 = function7;
                            }
                            if (i7 != 0) {
                                function16 = AbstractC17185l.crashlytics;
                            } else {
                                function16 = function8;
                            }
                            if (i9 != 0) {
                                function17 = AbstractC17185l.amazon;
                            } else {
                                function17 = function9;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i3 & 128) != 0) {
                                jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                                i11 &= -29360129;
                            } else {
                                jLoadAd = j2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                WeakHashMap weakHashMap17 = C12923l.pro;
                                interfaceC17242l4 = interfaceC17242l3;
                                c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                                i14 = i11 & (-234881025);
                                j6 = j5;
                                i15 = 2;
                            } else {
                                interfaceC17242l4 = interfaceC17242l3;
                                i14 = i11;
                                j6 = j5;
                                i15 = 2;
                                c18004l = interfaceC10137l;
                            }
                        }
                        c6956l.adcel();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        objM2132native = c6956l.m2132native();
                        z4 = z3;
                        Object obj10 = C1867l.yandex;
                        if (z4) {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new C16721l(c18004l);
                            c6956l.m2147try(objM2132native);
                        }
                        c16721l = (C16721l) objM2132native;
                        boolean zBilling10 = c6956l.billing(c16721l);
                        long j115 = j6;
                        if (i16 > 67108864) {
                        }
                        z5 = zBilling10 | z;
                        objM2132native2 = c6956l.m2132native();
                        if (z5) {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C10207l(c16721l, c18004l, 0);
                            c6956l.m2147try(objM2132native2);
                        }
                        Function2 function1116 = function14;
                        Function2 function1117 = function15;
                        Function2 function218 = function16;
                        Function2 function219 = function17;
                        int i2111 = i15;
                        int i2112 = i17 >> 12;
                        long j116 = jLoadAd;
                        AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j115, j116, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i2111, function1116, c15578l, function218, function219, c16721l, function1117), c6956l), c6956l, (i2112 & 7168) | (i2112 & 896) | 12582912, 114);
                        j3 = j115;
                        j4 = j116;
                        interfaceC17242l2 = interfaceC17242l4;
                        interfaceC10137l2 = c18004l;
                        function10 = function1116;
                        function11 = function1117;
                        function12 = function218;
                        function13 = function219;
                        i13 = i2111;
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l2 = interfaceC17242l;
                        i13 = i;
                        interfaceC10137l2 = interfaceC10137l;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        j3 = j;
                        j4 = j2;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj11, Object obj12) {
                                ((Integer) obj12).getClass();
                                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                                AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj11, iPurchase, i3);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i4 |= 24576;
                function9 = function5;
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i12 = i20;
                        if (c6956l.purchase(j2)) {
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                if ((i2 & 100663296) != 0) {
                    i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                z = true;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i11 & 1, z2)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap18 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    } else {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap19 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    }
                    c6956l.adcel();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    objM2132native = c6956l.m2132native();
                    z4 = z3;
                    Object obj11 = C1867l.yandex;
                    if (z4) {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    }
                    c16721l = (C16721l) objM2132native;
                    boolean zBilling11 = c6956l.billing(c16721l);
                    long j117 = j6;
                    if (i16 > 67108864) {
                    }
                    z5 = zBilling11 | z;
                    objM2132native2 = c6956l.m2132native();
                    if (z5) {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function2 function1118 = function14;
                    Function2 function1119 = function15;
                    Function2 function2110 = function16;
                    Function2 function2111 = function17;
                    int i2113 = i15;
                    int i2114 = i17 >> 12;
                    long j118 = jLoadAd;
                    AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j117, j118, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i2113, function1118, c15578l, function2110, function2111, c16721l, function1119), c6956l), c6956l, (i2114 & 7168) | (i2114 & 896) | 12582912, 114);
                    j3 = j117;
                    j4 = j118;
                    interfaceC17242l2 = interfaceC17242l4;
                    interfaceC10137l2 = c18004l;
                    function10 = function1118;
                    function11 = function1119;
                    function12 = function2110;
                    function13 = function2111;
                    i13 = i2113;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    i13 = i;
                    interfaceC10137l2 = interfaceC10137l;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    j3 = j;
                    j4 = j2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj12, Object obj13) {
                            ((Integer) obj13).getClass();
                            int iPurchase = AbstractC0545l.purchase(i2 | 1);
                            AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj12, iPurchase, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 3072;
            function8 = function4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    function9 = function5;
                    if (c6956l.admob(function9)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i12 = i20;
                        if (c6956l.purchase(j2)) {
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                if ((i2 & 100663296) != 0) {
                    i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                z = true;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i11 & 1, z2)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap110 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    } else {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap111 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    }
                    c6956l.adcel();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    objM2132native = c6956l.m2132native();
                    z4 = z3;
                    Object obj12 = C1867l.yandex;
                    if (z4) {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    }
                    c16721l = (C16721l) objM2132native;
                    boolean zBilling12 = c6956l.billing(c16721l);
                    long j119 = j6;
                    if (i16 > 67108864) {
                    }
                    z5 = zBilling12 | z;
                    objM2132native2 = c6956l.m2132native();
                    if (z5) {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function2 function11110 = function14;
                    Function2 function11111 = function15;
                    Function2 function2112 = function16;
                    Function2 function2113 = function17;
                    int i2115 = i15;
                    int i2116 = i17 >> 12;
                    long j1110 = jLoadAd;
                    AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j119, j1110, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i2115, function11110, c15578l, function2112, function2113, c16721l, function11111), c6956l), c6956l, (i2116 & 7168) | (i2116 & 896) | 12582912, 114);
                    j3 = j119;
                    j4 = j1110;
                    interfaceC17242l2 = interfaceC17242l4;
                    interfaceC10137l2 = c18004l;
                    function10 = function11110;
                    function11 = function11111;
                    function12 = function2112;
                    function13 = function2113;
                    i13 = i2115;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    i13 = i;
                    interfaceC10137l2 = interfaceC10137l;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    j3 = j;
                    j4 = j2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj13, Object obj14) {
                            ((Integer) obj14).getClass();
                            int iPurchase = AbstractC0545l.purchase(i2 | 1);
                            AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj13, iPurchase, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 24576;
            function9 = function5;
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i12 = i20;
                    if (c6956l.purchase(j2)) {
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                i11 |= i22;
            } else {
                i12 = i20;
            }
            if ((i2 & 100663296) != 0) {
                i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (c6956l.admob(c15578l)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            z = true;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i11 & 1, z2)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap112 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                } else {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap113 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                }
                c6956l.adcel();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                objM2132native = c6956l.m2132native();
                z4 = z3;
                Object obj13 = C1867l.yandex;
                if (z4) {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                }
                c16721l = (C16721l) objM2132native;
                boolean zBilling13 = c6956l.billing(c16721l);
                long j1111 = j6;
                if (i16 > 67108864) {
                }
                z5 = zBilling13 | z;
                objM2132native2 = c6956l.m2132native();
                if (z5) {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                }
                Function2 function11112 = function14;
                Function2 function11113 = function15;
                Function2 function2114 = function16;
                Function2 function2115 = function17;
                int i2117 = i15;
                int i2118 = i17 >> 12;
                long j1112 = jLoadAd;
                AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j1111, j1112, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i2117, function11112, c15578l, function2114, function2115, c16721l, function11113), c6956l), c6956l, (i2118 & 7168) | (i2118 & 896) | 12582912, 114);
                j3 = j1111;
                j4 = j1112;
                interfaceC17242l2 = interfaceC17242l4;
                interfaceC10137l2 = c18004l;
                function10 = function11112;
                function11 = function11113;
                function12 = function2114;
                function13 = function2115;
                i13 = i2117;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                i13 = i;
                interfaceC10137l2 = interfaceC10137l;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                j3 = j;
                j4 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj14, Object obj15) {
                        ((Integer) obj15).getClass();
                        int iPurchase = AbstractC0545l.purchase(i2 | 1);
                        AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj14, iPurchase, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 384;
        function7 = function3;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                function8 = function4;
                if (c6956l.admob(function8)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    function9 = function5;
                    if (c6956l.admob(function9)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i12 = i20;
                        if (c6956l.purchase(j2)) {
                        }
                        i11 |= i22;
                    } else {
                        i12 = i20;
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                if ((i2 & 100663296) != 0) {
                    i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                z = true;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i11 & 1, z2)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap114 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    } else {
                        if (i12 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        if (i21 != 0) {
                            function14 = AbstractC17185l.yandex;
                        } else {
                            function14 = function6;
                        }
                        if (i5 != 0) {
                            function15 = AbstractC17185l.loadAd;
                        } else {
                            function15 = function7;
                        }
                        if (i7 != 0) {
                            function16 = AbstractC17185l.crashlytics;
                        } else {
                            function16 = function8;
                        }
                        if (i9 != 0) {
                            function17 = AbstractC17185l.amazon;
                        } else {
                            function17 = function9;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i3 & 128) != 0) {
                            jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                            i11 &= -29360129;
                        } else {
                            jLoadAd = j2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            WeakHashMap weakHashMap115 = C12923l.pro;
                            interfaceC17242l4 = interfaceC17242l3;
                            c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                            i14 = i11 & (-234881025);
                            j6 = j5;
                            i15 = 2;
                        } else {
                            interfaceC17242l4 = interfaceC17242l3;
                            i14 = i11;
                            j6 = j5;
                            i15 = 2;
                            c18004l = interfaceC10137l;
                        }
                    }
                    c6956l.adcel();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    objM2132native = c6956l.m2132native();
                    z4 = z3;
                    Object obj14 = C1867l.yandex;
                    if (z4) {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C16721l(c18004l);
                        c6956l.m2147try(objM2132native);
                    }
                    c16721l = (C16721l) objM2132native;
                    boolean zBilling14 = c6956l.billing(c16721l);
                    long j1113 = j6;
                    if (i16 > 67108864) {
                    }
                    z5 = zBilling14 | z;
                    objM2132native2 = c6956l.m2132native();
                    if (z5) {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C10207l(c16721l, c18004l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function2 function11114 = function14;
                    Function2 function11115 = function15;
                    Function2 function2116 = function16;
                    Function2 function2117 = function17;
                    int i2119 = i15;
                    int i21110 = i17 >> 12;
                    long j1114 = jLoadAd;
                    AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j1113, j1114, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i2119, function11114, c15578l, function2116, function2117, c16721l, function11115), c6956l), c6956l, (i21110 & 7168) | (i21110 & 896) | 12582912, 114);
                    j3 = j1113;
                    j4 = j1114;
                    interfaceC17242l2 = interfaceC17242l4;
                    interfaceC10137l2 = c18004l;
                    function10 = function11114;
                    function11 = function11115;
                    function12 = function2116;
                    function13 = function2117;
                    i13 = i2119;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    i13 = i;
                    interfaceC10137l2 = interfaceC10137l;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    j3 = j;
                    j4 = j2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj15, Object obj16) {
                            ((Integer) obj16).getClass();
                            int iPurchase = AbstractC0545l.purchase(i2 | 1);
                            AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj15, iPurchase, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 24576;
            function9 = function5;
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i12 = i20;
                    if (c6956l.purchase(j2)) {
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                i11 |= i22;
            } else {
                i12 = i20;
            }
            if ((i2 & 100663296) != 0) {
                i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (c6956l.admob(c15578l)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            z = true;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i11 & 1, z2)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap116 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                } else {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap117 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                }
                c6956l.adcel();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                objM2132native = c6956l.m2132native();
                z4 = z3;
                Object obj15 = C1867l.yandex;
                if (z4) {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                }
                c16721l = (C16721l) objM2132native;
                boolean zBilling15 = c6956l.billing(c16721l);
                long j1115 = j6;
                if (i16 > 67108864) {
                }
                z5 = zBilling15 | z;
                objM2132native2 = c6956l.m2132native();
                if (z5) {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                }
                Function2 function11116 = function14;
                Function2 function11117 = function15;
                Function2 function2118 = function16;
                Function2 function2119 = function17;
                int i21111 = i15;
                int i21112 = i17 >> 12;
                long j1116 = jLoadAd;
                AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j1115, j1116, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i21111, function11116, c15578l, function2118, function2119, c16721l, function11117), c6956l), c6956l, (i21112 & 7168) | (i21112 & 896) | 12582912, 114);
                j3 = j1115;
                j4 = j1116;
                interfaceC17242l2 = interfaceC17242l4;
                interfaceC10137l2 = c18004l;
                function10 = function11116;
                function11 = function11117;
                function12 = function2118;
                function13 = function2119;
                i13 = i21111;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                i13 = i;
                interfaceC10137l2 = interfaceC10137l;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                j3 = j;
                j4 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj16, Object obj17) {
                        ((Integer) obj17).getClass();
                        int iPurchase = AbstractC0545l.purchase(i2 | 1);
                        AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj16, iPurchase, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 3072;
        function8 = function4;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                function9 = function5;
                if (c6956l.admob(function9)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i12 = i20;
                    if (c6956l.purchase(j2)) {
                    }
                    i11 |= i22;
                } else {
                    i12 = i20;
                }
                i11 |= i22;
            } else {
                i12 = i20;
            }
            if ((i2 & 100663296) != 0) {
                i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (c6956l.admob(c15578l)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            z = true;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i11 & 1, z2)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap118 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                } else {
                    if (i12 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l;
                    }
                    if (i21 != 0) {
                        function14 = AbstractC17185l.yandex;
                    } else {
                        function14 = function6;
                    }
                    if (i5 != 0) {
                        function15 = AbstractC17185l.loadAd;
                    } else {
                        function15 = function7;
                    }
                    if (i7 != 0) {
                        function16 = AbstractC17185l.crashlytics;
                    } else {
                        function16 = function8;
                    }
                    if (i9 != 0) {
                        function17 = AbstractC17185l.amazon;
                    } else {
                        function17 = function9;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    if ((i3 & 128) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                        i11 &= -29360129;
                    } else {
                        jLoadAd = j2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        WeakHashMap weakHashMap119 = C12923l.pro;
                        interfaceC17242l4 = interfaceC17242l3;
                        c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                        i14 = i11 & (-234881025);
                        j6 = j5;
                        i15 = 2;
                    } else {
                        interfaceC17242l4 = interfaceC17242l3;
                        i14 = i11;
                        j6 = j5;
                        i15 = 2;
                        c18004l = interfaceC10137l;
                    }
                }
                c6956l.adcel();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                objM2132native = c6956l.m2132native();
                z4 = z3;
                Object obj16 = C1867l.yandex;
                if (z4) {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C16721l(c18004l);
                    c6956l.m2147try(objM2132native);
                }
                c16721l = (C16721l) objM2132native;
                boolean zBilling16 = c6956l.billing(c16721l);
                long j1117 = j6;
                if (i16 > 67108864) {
                }
                z5 = zBilling16 | z;
                objM2132native2 = c6956l.m2132native();
                if (z5) {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C10207l(c16721l, c18004l, 0);
                    c6956l.m2147try(objM2132native2);
                }
                Function2 function11118 = function14;
                Function2 function11119 = function15;
                Function2 function21110 = function16;
                Function2 function21111 = function17;
                int i21113 = i15;
                int i21114 = i17 >> 12;
                long j1118 = jLoadAd;
                AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j1117, j1118, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i21113, function11118, c15578l, function21110, function21111, c16721l, function11119), c6956l), c6956l, (i21114 & 7168) | (i21114 & 896) | 12582912, 114);
                j3 = j1117;
                j4 = j1118;
                interfaceC17242l2 = interfaceC17242l4;
                interfaceC10137l2 = c18004l;
                function10 = function11118;
                function11 = function11119;
                function12 = function21110;
                function13 = function21111;
                i13 = i21113;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                i13 = i;
                interfaceC10137l2 = interfaceC10137l;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                j3 = j;
                j4 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj17, Object obj18) {
                        ((Integer) obj18).getClass();
                        int iPurchase = AbstractC0545l.purchase(i2 | 1);
                        AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj17, iPurchase, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 24576;
        function9 = function5;
        i11 = i4 | 196608;
        if ((1572864 & i2) != 0) {
            if ((i3 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i11 |= i19;
        }
        if ((i2 & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                i12 = i20;
                if (c6956l.purchase(j2)) {
                }
                i11 |= i22;
            } else {
                i12 = i20;
            }
            i11 |= i22;
        } else {
            i12 = i20;
        }
        if ((i2 & 100663296) != 0) {
            i11 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !c6956l.billing(interfaceC10137l)) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            if (c6956l.admob(c15578l)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i11 |= i18;
        }
        z = true;
        if ((306783379 & i11) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i11 & 1, z2)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l;
                }
                if (i21 != 0) {
                    function14 = AbstractC17185l.yandex;
                } else {
                    function14 = function6;
                }
                if (i5 != 0) {
                    function15 = AbstractC17185l.loadAd;
                } else {
                    function15 = function7;
                }
                if (i7 != 0) {
                    function16 = AbstractC17185l.crashlytics;
                } else {
                    function16 = function8;
                }
                if (i9 != 0) {
                    function17 = AbstractC17185l.amazon;
                } else {
                    function17 = function9;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                    i11 &= -3670017;
                } else {
                    j5 = j;
                }
                if ((i3 & 128) != 0) {
                    jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                    i11 &= -29360129;
                } else {
                    jLoadAd = j2;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    WeakHashMap weakHashMap1110 = C12923l.pro;
                    interfaceC17242l4 = interfaceC17242l3;
                    c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                    i14 = i11 & (-234881025);
                    j6 = j5;
                    i15 = 2;
                } else {
                    interfaceC17242l4 = interfaceC17242l3;
                    i14 = i11;
                    j6 = j5;
                    i15 = 2;
                    c18004l = interfaceC10137l;
                }
            } else {
                if (i12 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l;
                }
                if (i21 != 0) {
                    function14 = AbstractC17185l.yandex;
                } else {
                    function14 = function6;
                }
                if (i5 != 0) {
                    function15 = AbstractC17185l.loadAd;
                } else {
                    function15 = function7;
                }
                if (i7 != 0) {
                    function16 = AbstractC17185l.crashlytics;
                } else {
                    function16 = function8;
                }
                if (i9 != 0) {
                    function17 = AbstractC17185l.amazon;
                } else {
                    function17 = function9;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip;
                    i11 &= -3670017;
                } else {
                    j5 = j;
                }
                if ((i3 & 128) != 0) {
                    jLoadAd = AbstractC15038l.loadAd(j5, c6956l);
                    i11 &= -29360129;
                } else {
                    jLoadAd = j2;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    WeakHashMap weakHashMap1111 = C12923l.pro;
                    interfaceC17242l4 = interfaceC17242l3;
                    c18004l = new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd);
                    i14 = i11 & (-234881025);
                    j6 = j5;
                    i15 = 2;
                } else {
                    interfaceC17242l4 = interfaceC17242l3;
                    i14 = i11;
                    j6 = j5;
                    i15 = 2;
                    c18004l = interfaceC10137l;
                }
            }
            c6956l.adcel();
            i16 = (234881024 & i14) ^ 100663296;
            if (i16 > 67108864) {
                i17 = i14;
                if ((i17 & 100663296) != 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                i17 = i14;
                if ((i17 & 100663296) != 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            objM2132native = c6956l.m2132native();
            z4 = z3;
            Object obj17 = C1867l.yandex;
            if (z4) {
                objM2132native = new C16721l(c18004l);
                c6956l.m2147try(objM2132native);
            } else {
                objM2132native = new C16721l(c18004l);
                c6956l.m2147try(objM2132native);
            }
            c16721l = (C16721l) objM2132native;
            boolean zBilling17 = c6956l.billing(c16721l);
            long j1119 = j6;
            if (i16 > 67108864) {
            }
            z5 = zBilling17 | z;
            objM2132native2 = c6956l.m2132native();
            if (z5) {
                objM2132native2 = new C10207l(c16721l, c18004l, 0);
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C10207l(c16721l, c18004l, 0);
                c6956l.m2147try(objM2132native2);
            }
            Function2 function111110 = function14;
            Function2 function111111 = function15;
            Function2 function21112 = function16;
            Function2 function21113 = function17;
            int i21115 = i15;
            int i21116 = i17 >> 12;
            long j11110 = jLoadAd;
            AbstractC3274l.yandex(interfaceC17242l4.premium(new C14387l((Function1) objM2132native2)), null, j1119, j11110, 0.0f, 0.0f, null, AbstractC14566l.amazon(848889571, new C4227l(i21115, function111110, c15578l, function21112, function21113, c16721l, function111111), c6956l), c6956l, (i21116 & 7168) | (i21116 & 896) | 12582912, 114);
            j3 = j1119;
            j4 = j11110;
            interfaceC17242l2 = interfaceC17242l4;
            interfaceC10137l2 = c18004l;
            function10 = function111110;
            function11 = function111111;
            function12 = function21112;
            function13 = function21113;
            i13 = i21115;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            i13 = i;
            interfaceC10137l2 = interfaceC10137l;
            function10 = function6;
            function11 = function7;
            function12 = function8;
            function13 = function9;
            j3 = j;
            j4 = j2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌؙۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj18, Object obj19) {
                    ((Integer) obj19).getClass();
                    int iPurchase = AbstractC0545l.purchase(i2 | 1);
                    AbstractC15497l.loadAd(interfaceC17242l2, function10, function11, function12, function13, i13, j3, j4, interfaceC10137l2, c15578l, (C6956l) obj18, iPurchase, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void metrica(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC9168l.firebase(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & ((long) iArr3[3])) - 2) + j2);
        }
    }

    public static double mopub(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dBilling = AbstractC2533l.billing(d);
        double d3 = ((dBilling + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dIsPro = isPro(d3, dBilling);
        double dAbs = Math.abs(dIsPro - d2);
        if (dIsPro < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dAmazon = ((AbstractC2533l.amazon(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (dAmazon < 0.0d || dAmazon > 100.0d) {
            return -1.0d;
        }
        return dAmazon;
    }

    public static void purchase(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) ((4294967295L & ((long) iArr[3])) + 2 + j2);
    }

    public static void remoteconfig(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        AbstractC9168l.isPro(iArr, iArr3);
        firebase(iArr3, iArr2);
    }

    public static void smaato(int[] iArr, int i) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[3])) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !AbstractC9168l.billing(iArr, yandex)) {
            return;
        }
        purchase(iArr);
    }

    public static boolean startapp(byte b) {
        return b > -65;
    }

    public static double subs(double d, double d2) {
        double d3 = (d + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d5 = d4 * 100.0d;
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = d6 * d6 * d6;
        if (d7 <= 0.008856451679035631d) {
            d7 = ((116.0d * d6) - 16.0d) / 903.2962962962963d;
        }
        return isPro(d5, d7 * 100.0d);
    }

    public static void vip(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        AbstractC9168l.isPro(iArr, iArr3);
        while (true) {
            firebase(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC9168l.isPro(iArr2, iArr3);
            }
        }
    }

    public static final void yandex(Object obj, int i, C16141l c16141l, C15578l c15578l, C6956l c6956l, int i2) {
        int i3;
        c6956l.m2133new(872548579);
        if ((i2 & 6) == 0) {
            i3 = (c6956l.admob(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.amazon(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.admob(c16141l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zBilling = c6956l.billing(obj) | c6956l.billing(c16141l);
            Object objM2132native = c6956l.m2132native();
            Object obj2 = C1867l.yandex;
            if (zBilling || objM2132native == obj2) {
                objM2132native = new C15920l(obj, c16141l);
                c6956l.m2147try(objM2132native);
            }
            C15920l c15920l = (C15920l) objM2132native;
            c15920l.crashlytics = i;
            C10086l c10086l = c15920l.mopub;
            AbstractC5189l abstractC5189l = AbstractC1629l.yandex;
            C15920l c15920l2 = (C15920l) c6956l.isPro(abstractC5189l);
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                if (c15920l2 != ((C15920l) c10086l.getValue())) {
                    c10086l.setValue(c15920l2);
                    if (c15920l.amazon > 0) {
                        C15920l c15920l3 = c15920l.purchase;
                        if (c15920l3 != null) {
                            c15920l3.loadAd();
                        }
                        if (c15920l2 != null) {
                            c15920l2.yandex();
                        } else {
                            c15920l2 = null;
                        }
                        c15920l.purchase = c15920l2;
                    }
                }
                Unit unit = Unit.INSTANCE;
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                boolean zBilling2 = c6956l.billing(c15920l);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling2 || objM2132native2 == obj2) {
                    objM2132native2 = new C17015l(18, c15920l);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC12311l.loadAd(c15920l, (Function1) objM2132native2, c6956l);
                AbstractC10478l.yandex(abstractC5189l.yandex(c15920l), c15578l, c6956l, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th;
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12348l(i, i2, 3, obj, c16141l, c15578l);
        }
    }
}
