package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؙ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6791l {
    public static final C11951l yandex = new C11951l(Float.POSITIVE_INFINITY);
    public static final C15709l loadAd = new C15709l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C5951l crashlytics = new C5951l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C10369l amazon = new C10369l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C11951l purchase = new C11951l(Float.NEGATIVE_INFINITY);
    public static final C15709l billing = new C15709l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C5951l mopub = new C5951l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C10369l admob = new C10369l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final int[] subs = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    public static long Signature(ByteBuffer byteBuffer) {
        return ((((long) byteBuffer.get()) & 14) << 29) | ((long) ((byteBuffer.get() & 255) << 22)) | ((long) (((byteBuffer.get() & 255) >> 1) << 15)) | ((long) ((byteBuffer.get() & 255) << 7)) | ((long) ((byteBuffer.get() & 255) >> 1));
    }

    public static void ad(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i * 2;
        int i18 = i2 * 2;
        int i19 = i5 * 2;
        int i20 = i6 * 2;
        int i21 = i7 * 2;
        int i22 = i9 * 2;
        int i23 = i11 * 2;
        int i24 = i12 * 2;
        int i25 = i13 * 2;
        int i26 = i + i9;
        int i27 = i2 + i10;
        int i28 = i3 + i11;
        int i29 = i4 + i12;
        int i30 = i5 + i13;
        int i31 = i6 + i14;
        int i32 = i7 + i15;
        int i33 = i26 * 2;
        int i34 = i27 * 2;
        int i35 = i28 * 2;
        int i36 = i29 * 2;
        long j = i;
        long j2 = j * j;
        long j3 = i8;
        long j4 = i18;
        long j5 = j3 * j4;
        long j6 = i7;
        long j7 = i3 * 2;
        long j8 = (j6 * j7) + j5;
        long j9 = i6;
        long j10 = i4 * 2;
        long j11 = (j9 * j10) + j8;
        long j12 = i5;
        long j13 = i9;
        long j14 = j13 * j13;
        long j15 = i16;
        long j16 = i10 * 2;
        long j17 = i15;
        long j18 = i23;
        long j19 = (j17 * j18) + (j15 * j16);
        long j20 = i14;
        long j21 = i24;
        long j22 = i13;
        long j23 = j22 * j22;
        long j24 = i26;
        long j25 = j24 * j24;
        long j26 = i8 + i16;
        long j27 = ((long) i34) & 4294967295L;
        long j28 = j26 * j27;
        long j29 = i32;
        long j30 = ((long) i35) & 4294967295L;
        long j31 = (j29 * j30) + j28;
        long j32 = i31;
        long j33 = ((long) i36) & 4294967295L;
        long j34 = (j32 * j33) + j31;
        long j35 = i30;
        long j36 = (j35 * j35) + j34;
        long j37 = ((j2 + j14) + j36) - ((j12 * j12) + j11);
        int i37 = ((int) j37) & 268435455;
        long j38 = j37 >>> 28;
        long j39 = (((j23 + ((j20 * j21) + j19)) + j25) - j2) + j36;
        int i38 = ((int) j39) & 268435455;
        long j40 = j39 >>> 28;
        long j41 = i2;
        long j42 = i17;
        long j43 = j41 * j42;
        long j44 = i19;
        long j45 = j9 * j44;
        long j46 = i10;
        long j47 = i22;
        long j48 = j46 * j47;
        long j49 = i25;
        long j50 = j20 * j49;
        long j51 = i27;
        long j52 = ((long) i33) & 4294967295L;
        long j53 = j51 * j52;
        long j54 = (j29 * j33) + (j26 * j30);
        long j55 = ((long) (i30 * 2)) & 4294967295L;
        long j56 = (j32 * j55) + j54;
        long j57 = (((j43 + j48) + j56) - (j45 + ((j6 * j10) + (j3 * j7)))) + j38;
        int i39 = ((int) j57) & 268435455;
        long j58 = j57 >>> 28;
        long j59 = (((j50 + ((j17 * j21) + (j15 * j18))) + j53) - j43) + j56 + j40;
        int i40 = ((int) j59) & 268435455;
        long j60 = j59 >>> 28;
        long j61 = i3;
        long j62 = (j41 * j41) + (j61 * j42);
        long j63 = (j6 * j44) + (j3 * j10);
        long j64 = i11;
        long j65 = (j46 * j46) + (j64 * j47);
        long j66 = (j17 * j49) + (j15 * j21);
        long j67 = i28;
        long j68 = (j51 * j51) + (j67 * j52);
        long j69 = (j32 * j32) + (j29 * j55) + (j26 * j33);
        long j70 = (((j62 + j65) + j69) - ((j9 * j9) + j63)) + j58;
        int i41 = ((int) j70) & 268435455;
        long j71 = j70 >>> 28;
        long j72 = ((((j20 * j20) + j66) + j68) - j62) + j69 + j60;
        int i42 = ((int) j72) & 268435455;
        long j73 = j72 >>> 28;
        long j74 = i4;
        long j75 = (j61 * j4) + (j74 * j42);
        long j76 = j3 * j44;
        long j77 = i20;
        long j78 = (j6 * j77) + j76;
        long j79 = i12;
        long j80 = (j64 * j16) + (j79 * j47);
        long j81 = j15 * j49;
        long j82 = i14 * 2;
        long j83 = (j17 * j82) + j81;
        long j84 = i29;
        long j85 = (j67 * j27) + (j84 * j52);
        long j86 = j55 * j26;
        long j87 = ((long) (i31 * 2)) & 4294967295L;
        long j88 = (j29 * j87) + j86;
        long j89 = (((j75 + j80) + j88) - j78) + j71;
        int i43 = ((int) j89) & 268435455;
        long j90 = j89 >>> 28;
        long j91 = ((j83 + j85) - j75) + j88 + j73;
        int i44 = ((int) j91) & 268435455;
        long j92 = j91 >>> 28;
        long j93 = (j61 * j61) + (j74 * j4) + (j12 * j42);
        long j94 = (j17 * j17) + (j82 * j15);
        long j95 = (j67 * j67) + (j84 * j27) + (j35 * j52);
        long j96 = (j29 * j29) + (j26 * j87);
        long j97 = (((j93 + ((j64 * j64) + ((j79 * j16) + (j22 * j47)))) + j96) - ((j6 * j6) + (j3 * j77))) + j90;
        int i45 = ((int) j97) & 268435455;
        long j98 = j97 >>> 28;
        long j99 = ((j94 + j95) - j93) + j96 + j92;
        int i46 = ((int) j99) & 268435455;
        long j100 = j99 >>> 28;
        long j101 = (j74 * j7) + (j12 * j4) + (j9 * j42);
        long j102 = (j79 * j18) + (j22 * j16) + (j20 * j47);
        long j103 = (j84 * j30) + (j35 * j27) + (j32 * j52);
        long j104 = (((long) (i32 * 2)) & 4294967295L) * j26;
        long j105 = (((j101 + j102) + j104) - (((long) i21) * j3)) + j98;
        int i47 = ((int) j105) & 268435455;
        long j106 = j105 >>> 28;
        long j107 = (((((long) (i15 * 2)) * j15) + j103) - j101) + j104 + j100;
        int i48 = ((int) j107) & 268435455;
        long j108 = j107 >>> 28;
        long j109 = (j74 * j74) + (j12 * j7) + (j9 * j4) + (j6 * j42);
        long j110 = (j84 * j84) + (j35 * j30) + (j32 * j27) + (j29 * j52);
        long j111 = j26 * j26;
        long j112 = (((j109 + ((j79 * j79) + ((j22 * j18) + ((j20 * j16) + (j17 * j47))))) + j111) - (j3 * j3)) + j106;
        int i49 = ((int) j112) & 268435455;
        long j113 = j112 >>> 28;
        long j114 = (((j15 * j15) + j110) - j109) + j111 + j108;
        long j115 = (j10 * j12) + (j9 * j7) + (j6 * j4) + (j3 * j42);
        long j116 = j20 * j18;
        long j117 = (j22 * j21) + j116 + (j17 * j16) + (j15 * j47);
        long j118 = j117 + j115 + j113;
        int i50 = ((int) j118) & 268435455;
        long j119 = (((j35 * j33) + ((j32 * j30) + ((j29 * j27) + (j26 * j52)))) - j115) + (j114 >>> 28);
        long j120 = j119 >>> 28;
        long j121 = (j118 >>> 28) + j120 + ((long) i38);
        long j122 = j120 + ((long) i37);
        iArr2[0] = ((int) j122) & 268435455;
        iArr2[1] = i39 + ((int) (j122 >>> 28));
        iArr2[2] = i41;
        iArr2[3] = i43;
        iArr2[4] = i45;
        iArr2[5] = i47;
        iArr2[6] = i49;
        iArr2[7] = i50;
        iArr2[8] = ((int) j121) & 268435455;
        iArr2[9] = i40 + ((int) (j121 >>> 28));
        iArr2[10] = i42;
        iArr2[11] = i44;
        iArr2[12] = i46;
        iArr2[13] = i48;
        iArr2[14] = ((int) j114) & 268435455;
        iArr2[15] = ((int) j119) & 268435455;
    }

    public static void adcel(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[14];
        billing(0, 0, iArr, iArr3);
        license(iArr3, 1);
        license(iArr3, -1);
        metrica(0, 0, iArr3, iArr4);
        metrica(8, 7, iArr3, iArr4);
        AbstractC6974l.remoteconfig(subs, iArr4, iArr4);
        isPro(0, 0, iArr4, iArr2);
        isPro(7, 8, iArr4, iArr2);
    }

    public static int ads(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static void advert(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = (i2 + 536870910) - i18;
        int i32 = (i6 + 536870910) - i22;
        int i33 = (i10 + 536870910) - i26;
        int i34 = (i14 + 536870910) - i30;
        int i35 = ((i3 + 536870910) - i19) + (i31 >>> 28);
        int i36 = ((i7 + 536870910) - i23) + (i32 >>> 28);
        int i37 = ((i11 + 536870910) - i27) + (i33 >>> 28);
        int i38 = ((i15 + 536870910) - iArr2[14]) + (i34 >>> 28);
        int i39 = ((i4 + 536870910) - i20) + (i35 >>> 28);
        int i40 = ((i8 + 536870910) - i24) + (i36 >>> 28);
        int i41 = ((i12 + 536870910) - i28) + (i37 >>> 28);
        int i42 = ((i16 + 536870910) - iArr2[15]) + (i38 >>> 28);
        int i43 = i42 >>> 28;
        int i44 = ((i + 536870910) - i17) + i43;
        int i45 = ((i5 + 536870910) - i21) + (i39 >>> 28);
        int i46 = ((i9 + 536870908) - i25) + i43 + (i40 >>> 28);
        int i47 = ((i13 + 536870910) - i29) + (i41 >>> 28);
        iArr3[0] = i44 & 268435455;
        iArr3[1] = (i31 & 268435455) + (i44 >>> 28);
        iArr3[2] = i35 & 268435455;
        iArr3[3] = i39 & 268435455;
        iArr3[4] = i45 & 268435455;
        iArr3[5] = (i32 & 268435455) + (i45 >>> 28);
        iArr3[6] = i36 & 268435455;
        iArr3[7] = i40 & 268435455;
        iArr3[8] = i46 & 268435455;
        iArr3[9] = (i33 & 268435455) + (i46 >>> 28);
        iArr3[10] = i37 & 268435455;
        iArr3[11] = i41 & 268435455;
        iArr3[12] = i47 & 268435455;
        iArr3[13] = (i34 & 268435455) + (i47 >>> 28);
        iArr3[14] = i38 & 268435455;
        iArr3[15] = i42 & 268435455;
    }

    public static void amazon(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = i2 + (i >>> 28);
        int i16 = i6 + (i5 >>> 28);
        int i17 = i10 + (i9 >>> 28);
        int i18 = i14 + (i13 >>> 28);
        int i19 = i3 + (i15 >>> 28);
        int i20 = i7 + (i16 >>> 28);
        int i21 = i11 + (i17 >>> 28);
        int i22 = iArr[14] + (i18 >>> 28);
        int i23 = i4 + (i19 >>> 28);
        int i24 = i8 + (i20 >>> 28);
        int i25 = i12 + (i21 >>> 28);
        int i26 = iArr[15] + (i22 >>> 28);
        int i27 = i26 >>> 28;
        int i28 = (i & 268435455) + i27;
        int i29 = (i5 & 268435455) + (i23 >>> 28);
        int i30 = (i9 & 268435455) + i27 + (i24 >>> 28);
        int i31 = (i13 & 268435455) + (i25 >>> 28);
        iArr[0] = i28 & 268435455;
        iArr[1] = (i15 & 268435455) + (i28 >>> 28);
        iArr[2] = i19 & 268435455;
        iArr[3] = i23 & 268435455;
        iArr[4] = i29 & 268435455;
        iArr[5] = (i16 & 268435455) + (i29 >>> 28);
        iArr[6] = i20 & 268435455;
        iArr[7] = i24 & 268435455;
        iArr[8] = i30 & 268435455;
        iArr[9] = (i17 & 268435455) + (i30 >>> 28);
        iArr[10] = i21 & 268435455;
        iArr[11] = i25 & 268435455;
        iArr[12] = i31 & 268435455;
        iArr[13] = (i18 & 268435455) + (i31 >>> 28);
        iArr[14] = i22 & 268435455;
        iArr[15] = i26 & 268435455;
    }

    public static void billing(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void crashlytics(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static int firebase(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void isPro(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        iArr2[i2] = i3 & 268435455;
        iArr2[i2 + 1] = ((i3 >>> 28) | (i4 << 4)) & 268435455;
        iArr2[i2 + 2] = ((i4 >>> 24) | (i5 << 8)) & 268435455;
        iArr2[i2 + 3] = ((i5 >>> 20) | (i6 << 12)) & 268435455;
        iArr2[i2 + 4] = ((i6 >>> 16) | (i7 << 16)) & 268435455;
        iArr2[i2 + 5] = ((i7 >>> 12) | (i8 << 20)) & 268435455;
        iArr2[i2 + 6] = 268435455 & ((i8 >>> 8) | (i9 << 24));
        iArr2[i2 + 7] = i9 >>> 4;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public static final AbstractC8870l isVip(InterfaceC18636l interfaceC18636l, Object obj) {
        C5254l c5254lAdmob;
        if (obj instanceof AbstractC8870l) {
            return (AbstractC8870l) obj;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof byte[]) {
                return new C15135l((byte[]) obj, null, 6);
            }
            if (obj instanceof C2759l) {
                return new C1365l((C2759l) obj);
            }
            if (obj instanceof InterfaceC9354l) {
                return new C4400l(1, obj);
            }
            if (obj instanceof InputStream) {
                return new C4400l(0, obj);
            }
            return null;
        }
        String strM1821l = interfaceC18636l.adcel().yandex().m1821l("Content-Type");
        if (strM1821l != null) {
            try {
                C5254l c5254l = C5254l.f11335l;
                c5254lAdmob = AbstractC10033l.admob(strM1821l);
            } catch (C2120l unused) {
                c5254lAdmob = null;
            }
            if (c5254lAdmob == null) {
                c5254lAdmob = AbstractC2460l.loadAd;
            }
        } else {
            c5254lAdmob = AbstractC2460l.loadAd;
        }
        if (AbstractC15755l.yandex(c5254lAdmob) == null && c5254lAdmob.m1754l(AbstractC2460l.yandex)) {
            c5254lAdmob = c5254lAdmob.m1756l(AbstractC9050l.yandex.name());
        }
        return new C2627l((String) obj, c5254lAdmob, null);
    }

    public static void license(int[] iArr, int i) {
        int i2;
        int i3 = iArr[15];
        int i4 = i3 & 268435455;
        long j = (i3 >>> 28) + i;
        int i5 = 0;
        long j2 = j;
        while (true) {
            if (i5 >= 8) {
                break;
            }
            long j3 = j2 + (4294967295L & ((long) iArr[i5]));
            iArr[i5] = ((int) j3) & 268435455;
            j2 = j3 >> 28;
            i5++;
        }
        long j4 = j2 + j;
        for (i2 = 8; i2 < 15; i2++) {
            long j5 = j4 + (((long) iArr[i2]) & 4294967295L);
            iArr[i2] = ((int) j5) & 268435455;
            j4 = j5 >> 28;
        }
        iArr[15] = i4 + ((int) j4);
    }

    public static long loadAd(int i, ByteBuffer byteBuffer) {
        return ((long) ((byteBuffer.get() & 255) >> 1)) | ((((long) i) & 14) << 29) | ((long) ((byteBuffer.get() & 255) << 22)) | ((long) (((byteBuffer.get() & 255) >> 1) << 15)) | ((long) ((byteBuffer.get() & 255) << 7));
    }

    public static void metrica(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        int i10 = iArr[i + 7];
        iArr2[i2] = (i4 << 28) | i3;
        iArr2[i2 + 1] = (i4 >>> 4) | (i5 << 24);
        iArr2[i2 + 2] = (i5 >>> 8) | (i6 << 20);
        iArr2[i2 + 3] = (i6 >>> 12) | (i7 << 16);
        iArr2[i2 + 4] = (i7 >>> 16) | (i8 << 12);
        iArr2[i2 + 5] = (i8 >>> 20) | (i9 << 8);
        iArr2[i2 + 6] = (i10 << 4) | (i9 >>> 24);
    }

    public static void mopub(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static String premium(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strAd = AbstractC9361l.ad(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strAd), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strAd.length() + 8 + name2.length() + 1);
            AbstractC9361l.appmetrica(sb, "<", strAd, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static void pro(int i, int[] iArr, int[] iArr2) {
        ad(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                ad(iArr2, iArr2);
            }
        }
    }

    public static void purchase(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr2[i3];
            iArr2[i3] = i4 ^ ((iArr[i2 + i3] ^ i4) & i);
        }
    }

    public static void remoteconfig(int i, int i2, byte[] bArr, int[] iArr) {
        int iFirebase = firebase(i, bArr);
        int i3 = ((bArr[i + 6] & 255) << 16) | (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8);
        iArr[i2] = 268435455 & iFirebase;
        iArr[i2 + 1] = (i3 << 4) | (iFirebase >>> 28);
    }

    public static String signatures(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(premium(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(premium(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void smaato(byte[] bArr, int[] iArr) {
        remoteconfig(0, 0, bArr, iArr);
        remoteconfig(7, 2, bArr, iArr);
        remoteconfig(14, 4, bArr, iArr);
        remoteconfig(21, 6, bArr, iArr);
        remoteconfig(28, 8, bArr, iArr);
        remoteconfig(35, 10, bArr, iArr);
        remoteconfig(42, 12, bArr, iArr);
        remoteconfig(49, 14, bArr, iArr);
    }

    public static void startapp(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = (i4 << 28) | i3;
        bArr[i2] = (byte) i5;
        bArr[i2 + 1] = (byte) (i5 >>> 8);
        bArr[i2 + 2] = (byte) (i5 >>> 16);
        bArr[i2 + 3] = (byte) (i5 >>> 24);
        bArr[i2 + 4] = (byte) (i4 >>> 4);
        bArr[i2 + 5] = (byte) (i4 >>> 12);
        bArr[i2 + 6] = (byte) (i4 >>> 20);
    }

    public static void subscription(int i, int[] iArr, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = iArr[15];
        long j = i;
        long j2 = ((long) i3) * j;
        int i18 = ((int) j2) & 268435455;
        long j3 = j2 >>> 28;
        long j4 = ((long) i7) * j;
        int i19 = ((int) j4) & 268435455;
        long j5 = j4 >>> 28;
        long j6 = ((long) i11) * j;
        int i20 = ((int) j6) & 268435455;
        long j7 = j6 >>> 28;
        long j8 = ((long) i15) * j;
        int i21 = ((int) j8) & 268435455;
        long j9 = j8 >>> 28;
        long j10 = (((long) i4) * j) + j3;
        iArr2[2] = ((int) j10) & 268435455;
        long j11 = j10 >>> 28;
        long j12 = (((long) i8) * j) + j5;
        iArr2[6] = ((int) j12) & 268435455;
        long j13 = j12 >>> 28;
        long j14 = (((long) i12) * j) + j7;
        iArr2[10] = ((int) j14) & 268435455;
        long j15 = (((long) i16) * j) + j9;
        iArr2[14] = ((int) j15) & 268435455;
        long j16 = j15 >>> 28;
        long j17 = (((long) i5) * j) + j11;
        iArr2[3] = ((int) j17) & 268435455;
        long j18 = (((long) i9) * j) + j13;
        iArr2[7] = ((int) j18) & 268435455;
        long j19 = (((long) i13) * j) + (j14 >>> 28);
        iArr2[11] = ((int) j19) & 268435455;
        long j20 = j19 >>> 28;
        long j21 = (((long) i17) * j) + j16;
        iArr2[15] = ((int) j21) & 268435455;
        long j22 = j21 >>> 28;
        long j23 = (((long) i6) * j) + (j17 >>> 28);
        iArr2[4] = ((int) j23) & 268435455;
        long j24 = j23 >>> 28;
        long j25 = (((long) i10) * j) + (j18 >>> 28) + j22;
        iArr2[8] = ((int) j25) & 268435455;
        long j26 = (((long) i14) * j) + j20;
        iArr2[12] = ((int) j26) & 268435455;
        long j27 = j26 >>> 28;
        long j28 = (((long) i2) * j) + j22;
        iArr2[0] = ((int) j28) & 268435455;
        iArr2[1] = i18 + ((int) (j28 >>> 28));
        iArr2[5] = i19 + ((int) j24);
        iArr2[9] = i20 + ((int) (j25 >>> 28));
        iArr2[13] = i21 + ((int) j27);
    }

    public static void tapsense(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = iArr2[15];
        int i33 = i + i9;
        int i34 = i2 + i10;
        int i35 = i3 + i11;
        int i36 = i4 + i12;
        int i37 = i5 + i13;
        int i38 = i6 + i14;
        int i39 = i7 + i15;
        int i40 = i8 + i16;
        int i41 = i17 + i25;
        int i42 = i18 + i26;
        int i43 = i19 + i27;
        int i44 = i20 + i28;
        int i45 = i21 + i29;
        int i46 = i22 + i30;
        int i47 = i23 + i31;
        int i48 = i24 + i32;
        long j = i;
        long j2 = i17;
        long j3 = j * j2;
        long j4 = i8;
        long j5 = i18;
        long j6 = j4 * j5;
        long j7 = i7;
        long j8 = i19;
        long j9 = (j7 * j8) + j6;
        long j10 = i6;
        long j11 = i20;
        long j12 = i5;
        long j13 = i21;
        long j14 = i4;
        long j15 = i22;
        long j16 = (j14 * j15) + (j12 * j13) + (j10 * j11) + j9;
        long j17 = i3;
        long j18 = i23;
        long j19 = i2;
        long j20 = i24;
        long j21 = j19 * j20;
        long j22 = i9;
        long j23 = i25;
        long j24 = j22 * j23;
        long j25 = i16;
        long j26 = i26;
        long j27 = j25 * j26;
        long j28 = i15;
        long j29 = i27;
        long j30 = (j28 * j29) + j27;
        long j31 = i14;
        long j32 = i28;
        long j33 = (j31 * j32) + j30;
        long j34 = i13;
        long j35 = i29;
        long j36 = (j34 * j35) + j33;
        long j37 = i12;
        long j38 = i30;
        long j39 = (j37 * j38) + j36;
        long j40 = i11;
        long j41 = i31;
        long j42 = (j40 * j41) + j39;
        long j43 = i10;
        long j44 = i32;
        long j45 = (j43 * j44) + j42;
        long j46 = i33;
        long j47 = i41;
        long j48 = j46 * j47;
        long j49 = i40;
        long j50 = i42;
        long j51 = j49 * j50;
        long j52 = i39;
        long j53 = i43;
        long j54 = (j52 * j53) + j51;
        long j55 = i38;
        long j56 = i44;
        long j57 = (j55 * j56) + j54;
        long j58 = i37;
        long j59 = i45;
        long j60 = (j58 * j59) + j57;
        long j61 = i36;
        long j62 = i46;
        long j63 = (j61 * j62) + j60;
        long j64 = i35;
        long j65 = i47;
        long j66 = (j64 * j65) + j63;
        long j67 = i34;
        long j68 = i48;
        long j69 = (j67 * j68) + j66;
        long j70 = ((j3 + j24) + j69) - (j21 + ((j17 * j18) + j16));
        int i49 = ((int) j70) & 268435455;
        long j71 = ((j45 + j48) - j3) + j69;
        int i50 = ((int) j71) & 268435455;
        long j72 = j71 >>> 28;
        long j73 = (j * j5) + (j19 * j2);
        long j74 = (j40 * j44) + (j37 * j41) + (j34 * j38) + (j31 * j35) + (j28 * j32) + (j25 * j29);
        long j75 = (j46 * j50) + (j67 * j47);
        long j76 = (j64 * j68) + (j61 * j65) + (j58 * j62) + (j55 * j59) + (j52 * j56) + (j49 * j53);
        long j77 = (((j73 + ((j22 * j26) + (j43 * j23))) + j76) - ((j17 * j20) + ((j14 * j18) + ((j12 * j15) + ((j10 * j13) + ((j7 * j11) + (j4 * j8))))))) + (j70 >>> 28);
        int i51 = ((int) j77) & 268435455;
        long j78 = j77 >>> 28;
        long j79 = ((j74 + j75) - j73) + j76 + j72;
        int i52 = ((int) j79) & 268435455;
        long j80 = j79 >>> 28;
        long j81 = (j * j8) + (j19 * j5) + (j17 * j2);
        long j82 = (j37 * j44) + (j34 * j41) + (j31 * j38) + (j28 * j35) + (j25 * j32);
        long j83 = (j46 * j53) + (j67 * j50) + (j64 * j47);
        long j84 = (j61 * j68) + (j58 * j65) + (j55 * j62) + (j52 * j59) + (j49 * j56);
        long j85 = (((j81 + ((j22 * j29) + ((j43 * j26) + (j40 * j23)))) + j84) - ((j14 * j20) + ((j12 * j18) + ((j10 * j15) + ((j7 * j13) + (j4 * j11)))))) + j78;
        int i53 = ((int) j85) & 268435455;
        long j86 = j85 >>> 28;
        long j87 = ((j82 + j83) - j81) + j84 + j80;
        int i54 = ((int) j87) & 268435455;
        long j88 = j87 >>> 28;
        long j89 = (j * j11) + (j19 * j8) + (j17 * j5) + (j14 * j2);
        long j90 = (j34 * j44) + (j31 * j41) + (j28 * j38) + (j25 * j35);
        long j91 = (j46 * j56) + (j67 * j53) + (j64 * j50) + (j61 * j47);
        long j92 = (j58 * j68) + (j55 * j65) + (j52 * j62) + (j49 * j59);
        long j93 = (((j89 + ((j22 * j32) + ((j43 * j29) + ((j40 * j26) + (j37 * j23))))) + j92) - ((j12 * j20) + ((j10 * j18) + ((j7 * j15) + (j4 * j13))))) + j86;
        int i55 = ((int) j93) & 268435455;
        long j94 = j93 >>> 28;
        long j95 = ((j90 + j91) - j89) + j92 + j88;
        int i56 = ((int) j95) & 268435455;
        long j96 = j95 >>> 28;
        long j97 = (j * j13) + (j19 * j11) + (j17 * j8) + (j14 * j5) + (j12 * j2);
        long j98 = (j31 * j44) + (j28 * j41) + (j25 * j38);
        long j99 = (j46 * j59) + (j67 * j56) + (j64 * j53) + (j61 * j50) + (j58 * j47);
        long j100 = (j55 * j68) + (j52 * j65) + (j49 * j62);
        long j101 = (((j97 + ((j22 * j35) + ((j43 * j32) + ((j40 * j29) + ((j37 * j26) + (j34 * j23)))))) + j100) - ((j10 * j20) + ((j7 * j18) + (j4 * j15)))) + j94;
        int i57 = ((int) j101) & 268435455;
        long j102 = j101 >>> 28;
        long j103 = ((j98 + j99) - j97) + j100 + j96;
        int i58 = ((int) j103) & 268435455;
        long j104 = j103 >>> 28;
        long j105 = (j * j15) + (j19 * j13) + (j17 * j11) + (j14 * j8) + (j12 * j5) + (j10 * j2);
        long j106 = (j28 * j44) + (j25 * j41);
        long j107 = (j46 * j62) + (j67 * j59) + (j64 * j56) + (j61 * j53) + (j58 * j50) + (j55 * j47);
        long j108 = (j52 * j68) + (j49 * j65);
        long j109 = (((j105 + ((j22 * j38) + ((j43 * j35) + ((j40 * j32) + ((j37 * j29) + ((j34 * j26) + (j31 * j23))))))) + j108) - ((j7 * j20) + (j4 * j18))) + j102;
        int i59 = ((int) j109) & 268435455;
        long j110 = j109 >>> 28;
        long j111 = ((j106 + j107) - j105) + j108 + j104;
        int i60 = ((int) j111) & 268435455;
        long j112 = j111 >>> 28;
        long j113 = (j * j18) + (j19 * j15) + (j17 * j13) + (j14 * j11) + (j12 * j8) + (j10 * j5) + (j7 * j2);
        long j114 = j25 * j44;
        long j115 = (j46 * j65) + (j67 * j62) + (j64 * j59) + (j61 * j56) + (j58 * j53) + (j55 * j50) + (j52 * j47);
        long j116 = j49 * j68;
        long j117 = (((j113 + ((j22 * j41) + ((j43 * j38) + ((j40 * j35) + ((j37 * j32) + ((j34 * j29) + ((j31 * j26) + (j28 * j23)))))))) + j116) - (j4 * j20)) + j110;
        int i61 = ((int) j117) & 268435455;
        long j118 = j117 >>> 28;
        long j119 = ((j114 + j115) - j113) + j116 + j112;
        long j120 = j14 * j13;
        long j121 = (j * j20) + (j19 * j18) + (j17 * j15) + j120 + (j12 * j11) + (j10 * j8) + (j7 * j5) + (j2 * j4);
        long j122 = (j22 * j44) + (j43 * j41) + (j40 * j38) + (j37 * j35) + (j34 * j32) + (j31 * j29) + (j28 * j26) + (j25 * j23) + j121 + j118;
        int i62 = ((int) j122) & 268435455;
        long j123 = (((j46 * j68) + ((j67 * j65) + ((j64 * j62) + ((j61 * j59) + ((j58 * j56) + ((j55 * j53) + ((j52 * j50) + (j49 * j47)))))))) - j121) + (j119 >>> 28);
        long j124 = j123 >>> 28;
        long j125 = (j122 >>> 28) + j124 + ((long) i50);
        long j126 = j124 + ((long) i49);
        iArr3[0] = ((int) j126) & 268435455;
        iArr3[1] = i51 + ((int) (j126 >>> 28));
        iArr3[2] = i53;
        iArr3[3] = i55;
        iArr3[4] = i57;
        iArr3[5] = i59;
        iArr3[6] = i61;
        iArr3[7] = i62;
        iArr3[8] = ((int) j125) & 268435455;
        iArr3[9] = i52 + ((int) (j125 >>> 28));
        iArr3[10] = i54;
        iArr3[11] = i56;
        iArr3[12] = i58;
        iArr3[13] = i60;
        iArr3[14] = ((int) j119) & 268435455;
        iArr3[15] = ((int) j123) & 268435455;
    }

    public static void vip(int i, byte[] bArr, int[] iArr) {
        startapp(0, i, bArr, iArr);
        startapp(2, i + 7, bArr, iArr);
        startapp(4, i + 14, bArr, iArr);
        startapp(6, i + 21, bArr, iArr);
        startapp(8, i + 28, bArr, iArr);
        startapp(10, i + 35, bArr, iArr);
        startapp(12, i + 42, bArr, iArr);
        startapp(14, i + 49, bArr, iArr);
    }

    public static C5616l yandex(float f) {
        return new C5616l(Float.valueOf(f), AbstractC3483l.purchase, Float.valueOf(0.01f), 8);
    }

    public C7417l admob(C15608l c15608l) {
        ByteBuffer byteBuffer = c15608l.f8498l;
        byteBuffer.getClass();
        AbstractC12442l.admob(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return subs(c15608l, byteBuffer);
    }

    public abstract C7417l subs(C15608l c15608l, ByteBuffer byteBuffer);
}
