package defpackage;

/* JADX INFO: renamed from: lؖؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3892l implements Cloneable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final short[] f8034l = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long[] f8035l;

    public C3892l(long[] jArr, int i) {
        if (i == jArr.length) {
            this.f8035l = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.f8035l = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    public static void adcel(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
    }

    public static void admob(long[] jArr, int i) {
        int i2 = i >>> 6;
        jArr[i2] = (1 << (i & 63)) ^ jArr[i2];
    }

    public static long amazon(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr2[i2 + i6];
            int i7 = i + i6;
            jArr[i7] = (j | (j2 << i4)) ^ jArr[i7];
            j = j2 >>> i5;
        }
        return j;
    }

    public static void isPro(int i, long j, long[] jArr) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        if (i3 == 0) {
            jArr[i2] = j ^ jArr[i2];
            return;
        }
        jArr[i2] = jArr[i2] ^ (j << i3);
        long j2 = j >>> (64 - i3);
        if (j2 != 0) {
            int i4 = i2 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    public static void metrica(long j, long[] jArr, int i, long[] jArr2) {
        int i2 = i;
        long[] jArr3 = jArr2;
        if ((j & 1) != 0) {
            yandex(0, 0, i2, jArr3, jArr);
        }
        long j2 = j;
        int i3 = 1;
        while (true) {
            j2 >>>= 1;
            if (j2 == 0) {
                return;
            }
            if ((j2 & 1) != 0) {
                long jAmazon = amazon(jArr3, 0, jArr, 0, i2, i3);
                if (jAmazon != 0) {
                    jArr2[i] = jArr2[i] ^ jAmazon;
                }
            }
            i3++;
            i2 = i;
            jArr3 = jArr2;
        }
    }

    public static long smaato(int i) {
        short[] sArr = f8034l;
        int i2 = sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16);
        return ((((long) ((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & 255])) & 4294967295L) << 32) | (4294967295L & ((long) i2));
    }

    public static int startapp(long[] jArr, int i, int i2, int[] iArr) {
        int i3 = (i2 + 63) >>> 6;
        if (i < i3) {
            return i;
        }
        int i4 = i << 6;
        int iMin = Math.min(i4, (i2 << 1) - 1);
        int i5 = i4 - iMin;
        while (i5 >= 64) {
            i--;
            i5 -= 64;
        }
        int length = iArr.length;
        int i6 = iArr[length - 1];
        int i7 = length > 1 ? iArr[length - 2] : 0;
        int iMax = Math.max(i2, i6 + 64);
        int iMin2 = (Math.min(iMin - iMax, i2 - i7) + i5) >> 6;
        if (iMin2 > 1) {
            int i8 = i - iMin2;
            iMin = i8 << 6;
            int i9 = iMin - i2;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                subs(i8, i - i8, iArr[length2] + i9, jArr, jArr);
            }
            subs(i8, i - i8, i9, jArr, jArr);
            while (i > i8) {
                i--;
                jArr[i] = 0;
            }
        }
        if (iMin > iMax) {
            int i10 = iMax >>> 6;
            while (true) {
                i--;
                if (i <= i10) {
                    break;
                }
                long j = jArr[i];
                if (j != 0) {
                    jArr[i] = 0;
                    int i11 = (i << 6) - i2;
                    int length3 = iArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        isPro(iArr[length3] + i11, j, jArr);
                    }
                    isPro(i11, j, jArr);
                }
            }
            int i12 = iMax & 63;
            long j2 = jArr[i10];
            long j3 = j2 >>> i12;
            if (j3 != 0) {
                jArr[i10] = j2 ^ (j3 << i12);
                int i13 = iMax - i2;
                int length4 = iArr.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    isPro(iArr[length4] + i13, j3, jArr);
                }
                isPro(i13, j3, jArr);
            }
        } else {
            iMax = iMin;
        }
        if (iMax > i2) {
            while (true) {
                iMax--;
                if (iMax < i2) {
                    break;
                }
                if (((1 << (iMax & 63)) & jArr[iMax >>> 6]) != 0) {
                    admob(jArr, iMax);
                    int i14 = iMax - i2;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        admob(jArr, iArr[length5] + i14);
                    }
                    admob(jArr, i14);
                }
            }
        }
        return i3;
    }

    public static void subs(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        int i4 = i3 >>> 6;
        int i5 = i3 & 63;
        int i6 = i2;
        if (i5 == 0) {
            yandex(i4, i, i6, jArr, jArr2);
            return;
        }
        int i7 = i4 + 1;
        int i8 = 64 - i5;
        int i9 = 64 - i8;
        long j = 0;
        while (true) {
            i6--;
            if (i6 < 0) {
                jArr[i4] = jArr[i4] ^ j;
                return;
            }
            long j2 = jArr2[i + i6];
            int i10 = i7 + i6;
            jArr[i10] = (j | (j2 >>> i8)) ^ jArr[i10];
            j = j2 << i9;
        }
    }

    public static void yandex(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    public final int billing(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.f8035l[i2];
            if (j != 0) {
                return (64 - Long.numberOfLeadingZeros(j)) + (i2 * 64);
            }
        }
        return 0;
    }

    public final Object clone() {
        long[] jArr = this.f8035l;
        return new C3892l(jArr == null ? null : (long[]) jArr.clone());
    }

    public final void crashlytics(C3892l c3892l) {
        int iFirebase = c3892l.firebase();
        if (iFirebase == 0) {
            return;
        }
        long[] jArr = this.f8035l;
        if (iFirebase > jArr.length) {
            long[] jArr2 = new long[iFirebase];
            System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, iFirebase));
            this.f8035l = jArr2;
        }
        yandex(0, 0, iFirebase, this.f8035l, c3892l.f8035l);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3892l)) {
            return false;
        }
        C3892l c3892l = (C3892l) obj;
        int iFirebase = firebase();
        if (c3892l.firebase() != iFirebase) {
            return false;
        }
        for (int i = 0; i < iFirebase; i++) {
            if (this.f8035l[i] != c3892l.f8035l[i]) {
                return false;
            }
        }
        return true;
    }

    public final int firebase() {
        long[] jArr = this.f8035l;
        int iMin = Math.min(jArr.length, jArr.length);
        if (iMin >= 1) {
            if (jArr[0] != 0) {
                while (true) {
                    int i = iMin - 1;
                    if (jArr[i] != 0) {
                        return iMin;
                    }
                    iMin = i;
                }
            } else {
                while (true) {
                    int i2 = iMin - 1;
                    if (jArr[i2] != 0) {
                        return iMin;
                    }
                    if (i2 > 0) {
                        iMin = i2;
                    }
                }
            }
        }
        return 0;
    }

    public final int hashCode() {
        int iFirebase = firebase();
        int i = 1;
        for (int i2 = 0; i2 < iFirebase; i2++) {
            long j = this.f8035l[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final void loadAd(C3892l c3892l, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        long[] jArr = this.f8035l;
        if (i5 == 0) {
            yandex(i4, 0, i3, jArr, c3892l.f8035l);
            return;
        }
        long jAmazon = amazon(jArr, i4, c3892l.f8035l, 0, i3, i5);
        if (jAmazon != 0) {
            long[] jArr2 = this.f8035l;
            int i6 = i3 + i4;
            jArr2[i6] = jAmazon ^ jArr2[i6];
        }
    }

    public final int purchase() {
        int length = this.f8035l.length;
        while (length != 0) {
            length--;
            long j = this.f8035l[length];
            if (j != 0) {
                return (64 - Long.numberOfLeadingZeros(j)) + (length * 64);
            }
        }
        return 0;
    }

    public final boolean remoteconfig() {
        long[] jArr = this.f8035l;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        int iFirebase = firebase();
        if (iFirebase == 0) {
            return "0";
        }
        int i = iFirebase - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f8035l[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f8035l[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public final C3892l vip(C3892l c3892l) {
        int i;
        int i2;
        C3892l c3892l2;
        C3892l c3892l3;
        long[] jArr;
        int iPurchase = purchase();
        if (iPurchase == 0) {
            return this;
        }
        int iPurchase2 = c3892l.purchase();
        if (iPurchase2 == 0) {
            return c3892l;
        }
        if (iPurchase > iPurchase2) {
            i2 = iPurchase;
            i = iPurchase2;
            c3892l3 = this;
            c3892l2 = c3892l;
        } else {
            i = iPurchase;
            i2 = iPurchase2;
            c3892l2 = this;
            c3892l3 = c3892l;
        }
        int i3 = (i + 63) >>> 6;
        int i4 = (i2 + 63) >>> 6;
        int i5 = ((i + i2) + 62) >>> 6;
        if (i3 == 1) {
            long j = c3892l2.f8035l[0];
            if (j == 1) {
                return c3892l3;
            }
            long[] jArr2 = new long[i5];
            metrica(j, c3892l3.f8035l, i4, jArr2);
            return new C3892l(jArr2, i5);
        }
        int i6 = (i2 + 70) >>> 6;
        int[] iArr = new int[16];
        int i7 = i6 << 4;
        long[] jArr3 = new long[i7];
        iArr[1] = i6;
        System.arraycopy(c3892l3.f8035l, 0, jArr3, i6, i4);
        int i8 = 2;
        int i9 = i6;
        while (i8 < 16) {
            int i10 = i9 + i6;
            iArr[i8] = i10;
            if ((i8 & 1) == 0) {
                adcel(jArr3, i10 >>> 1, jArr3, i10, i6, 1);
                jArr = jArr3;
            } else {
                jArr = jArr3;
                int i11 = i10 - i6;
                for (int i12 = 0; i12 < i6; i12++) {
                    jArr[i10 + i12] = jArr[i6 + i12] ^ jArr[i11 + i12];
                }
            }
            i8++;
            i9 = i10;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        long[] jArr5 = new long[i7];
        adcel(jArr4, 0, jArr5, 0, i7, 4);
        long[] jArr6 = c3892l2.f8035l;
        int i13 = i5 << 3;
        long[] jArr7 = new long[i13];
        for (int i14 = 0; i14 < i3; i14++) {
            long j2 = jArr6[i14];
            int i15 = i14;
            while (true) {
                int i16 = iArr[((int) j2) & 15];
                int i17 = iArr[((int) (j2 >>> 4)) & 15];
                for (int i18 = 0; i18 < i6; i18++) {
                    int i19 = i15 + i18;
                    jArr7[i19] = jArr7[i19] ^ (jArr4[i16 + i18] ^ jArr5[i17 + i18]);
                }
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i15 += i5;
            }
        }
        while (true) {
            int i20 = i13 - i5;
            if (i20 == 0) {
                return new C3892l(jArr7, i5);
            }
            amazon(jArr7, i20 - i5, jArr7, i20, i5, 8);
            i13 = i20;
        }
    }

    public C3892l(long[] jArr) {
        this.f8035l = jArr;
    }

    public C3892l(int i) {
        this.f8035l = new long[i];
    }
}
