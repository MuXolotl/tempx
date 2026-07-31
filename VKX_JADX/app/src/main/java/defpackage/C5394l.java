package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5394l implements InterfaceC9273l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final long[] f11564l = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f11565l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f11566l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long[] f11567l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC2441l f11568l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f11569l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f11570l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11571l;

    public C5394l(C5394l c5394l) {
        long[] jArr = new long[25];
        this.f11567l = jArr;
        byte[] bArr = new byte[192];
        this.f11565l = bArr;
        this.f11568l = c5394l.f11568l;
        long[] jArr2 = c5394l.f11567l;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr2 = c5394l.f11565l;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f11570l = c5394l.f11570l;
        this.f11569l = c5394l.f11569l;
        this.f11571l = c5394l.f11571l;
        this.f11566l = c5394l.f11566l;
        subs();
        AbstractC8776l.yandex();
    }

    public final void admob(C5394l c5394l) {
        if (this.f11568l != c5394l.f11568l) {
            C8339l.metrica("attempt to copy digest of different purpose");
            return;
        }
        long[] jArr = c5394l.f11567l;
        System.arraycopy(jArr, 0, this.f11567l, 0, jArr.length);
        byte[] bArr = c5394l.f11565l;
        System.arraycopy(bArr, 0, this.f11565l, 0, bArr.length);
        this.f11570l = c5394l.f11570l;
        this.f11569l = c5394l.f11569l;
        this.f11571l = c5394l.f11571l;
        this.f11566l = c5394l.f11566l;
        subs();
        AbstractC8776l.yandex();
    }

    public final void amazon(int i, byte[] bArr) {
        int i2 = this.f11570l >>> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.f11567l;
            jArr[i3] = jArr[i3] ^ AbstractC10000l.subscription(i, bArr);
            i += 8;
        }
        purchase();
    }

    public final void billing(int i, int i2, byte[] bArr) {
        int i3 = this.f11569l;
        if (i3 % 8 != 0) {
            C8339l.smaato("attempt to absorb with odd length queue");
            return;
        }
        if (this.f11566l) {
            C8339l.smaato("attempt to absorb while squeezing");
            return;
        }
        int i4 = i3 >>> 3;
        int i5 = this.f11570l >>> 3;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f11565l;
        if (i2 < i6) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f11569l += i2 << 3;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(bArr, i, bArr2, i4, i6);
            amazon(0, bArr2);
        } else {
            i6 = 0;
        }
        while (true) {
            int i7 = i2 - i6;
            if (i7 < i5) {
                System.arraycopy(bArr, i + i6, bArr2, 0, i7);
                this.f11569l = i7 << 3;
                return;
            } else {
                amazon(i + i6, bArr);
                i6 += i5;
            }
        }
    }

    @Override // defpackage.InterfaceC16922l
    public int doFinal(byte[] bArr, int i) {
        firebase(this.f11571l, bArr, i);
        reset();
        return getDigestSize();
    }

    public final void firebase(long j, byte[] bArr, int i) {
        boolean z = this.f11566l;
        long[] jArr = this.f11567l;
        byte[] bArr2 = this.f11565l;
        if (!z) {
            int i2 = this.f11569l;
            int i3 = i2 >>> 3;
            bArr2[i3] = (byte) (bArr2[i3] | ((byte) (1 << (i2 & 7))));
            int i4 = i2 + 1;
            this.f11569l = i4;
            if (i4 == this.f11570l) {
                amazon(0, bArr2);
            } else {
                int i5 = i4 >>> 6;
                int i6 = i4 & 63;
                int i7 = 0;
                for (int i8 = 0; i8 < i5; i8++) {
                    jArr[i8] = jArr[i8] ^ AbstractC10000l.subscription(i7, bArr2);
                    i7 += 8;
                }
                if (i6 > 0) {
                    jArr[i5] = (AbstractC10000l.subscription(i7, bArr2) & ((1 << i6) - 1)) ^ jArr[i5];
                }
            }
            int i9 = (this.f11570l - 1) >>> 6;
            jArr[i9] = jArr[i9] ^ Long.MIN_VALUE;
            this.f11569l = 0;
            this.f11566l = true;
        }
        long j2 = 0;
        if (j % 8 != 0) {
            C8339l.smaato("outputLength not a multiple of 8");
            return;
        }
        while (j2 < j) {
            if (this.f11569l == 0) {
                purchase();
                int i10 = this.f11570l >>> 6;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    AbstractC10000l.pro(jArr[i12], bArr2, i11);
                    i11 += 8;
                }
                this.f11569l = this.f11570l;
            }
            int iMin = (int) Math.min(this.f11569l, j - j2);
            System.arraycopy(bArr2, (this.f11570l - this.f11569l) / 8, bArr, i + ((int) (j2 / 8)), iMin / 8);
            this.f11569l -= iMin;
            j2 += (long) iMin;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public String getAlgorithmName() {
        return "Keccak-" + this.f11571l;
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return this.f11570l / 8;
    }

    @Override // defpackage.InterfaceC16922l
    public int getDigestSize() {
        return this.f11571l / 8;
    }

    public final void isPro(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            C8339l.metrica("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
            return;
        }
        int i2 = 1600 - (i << 1);
        if (i2 <= 0 || i2 >= 1600 || i2 % 64 != 0) {
            C8339l.smaato("invalid rate value");
            return;
        }
        this.f11570l = i2;
        int i3 = 0;
        while (true) {
            long[] jArr = this.f11567l;
            if (i3 >= jArr.length) {
                Arrays.fill(this.f11565l, (byte) 0);
                this.f11569l = 0;
                this.f11566l = false;
                this.f11571l = (1600 - i2) / 2;
                return;
            }
            jArr[i3] = 0;
            i3++;
        }
    }

    public final void mopub(int i, int i2) {
        if (i2 < 1 || i2 > 7) {
            C8339l.metrica("'bits' must be in the range 1 to 7");
            return;
        }
        int i3 = this.f11569l;
        if (i3 % 8 != 0) {
            C8339l.smaato("attempt to absorb with odd length queue");
            return;
        }
        if (this.f11566l) {
            C8339l.smaato("attempt to absorb while squeezing");
            return;
        }
        byte[] bArr = this.f11565l;
        bArr[i3 >>> 3] = (byte) (i & ((1 << i2) - 1));
        this.f11569l = i3 + i2;
    }

    public final void purchase() {
        long[] jArr = this.f11567l;
        long j = jArr[0];
        long j2 = jArr[1];
        char c = 2;
        long j3 = jArr[2];
        char c2 = 3;
        long j4 = jArr[3];
        char c3 = 4;
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        int i = 24;
        long j25 = jArr[24];
        int i2 = 0;
        while (i2 < i) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << 1) | (j27 >>> (-1))) ^ j30;
            long j32 = ((j28 << 1) | (j28 >>> (-1))) ^ j26;
            long j33 = ((j29 << 1) | (j29 >>> (-1))) ^ j27;
            long j34 = ((j30 << 1) | (j30 >>> (-1))) ^ j28;
            long j35 = ((j26 << 1) | (j26 >>> (-1))) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j3 ^ j33;
            long j47 = j8 ^ j33;
            long j48 = j13 ^ j33;
            long j49 = j18 ^ j33;
            long j50 = j23 ^ j33;
            long j51 = j4 ^ j34;
            long j52 = j9 ^ j34;
            long j53 = j14 ^ j34;
            long j54 = j19 ^ j34;
            long j55 = j24 ^ j34;
            long j56 = j5 ^ j35;
            long j57 = j10 ^ j35;
            long j58 = j15 ^ j35;
            long j59 = j20 ^ j35;
            long j60 = j25 ^ j35;
            long j61 = (j41 << 1) | (j41 >>> 63);
            char c4 = c;
            long j62 = (j42 << 44) | (j42 >>> 20);
            char c5 = c2;
            long j63 = (j57 << 20) | (j57 >>> 44);
            char c6 = c3;
            long j64 = (j50 << 61) | (j50 >>> c5);
            long j65 = (j58 << 39) | (j58 >>> 25);
            long j66 = (j40 << 18) | (j40 >>> 46);
            long j67 = (j46 << 62) | (j46 >>> c4);
            long j68 = (j48 << 43) | (j48 >>> 21);
            long j69 = (j53 << 25) | (j53 >>> 39);
            int i3 = i;
            long j70 = (j59 << 8) | (j59 >>> 56);
            int i4 = i2;
            long j71 = (j55 << 56) | (j55 >>> 8);
            long j72 = (j39 << 41) | (j39 >>> 23);
            long j73 = (j56 << 27) | (j56 >>> 37);
            long j74 = (j60 << 14) | (j60 >>> 50);
            long j75 = (j45 << c4) | (j45 >>> 62);
            long j76 = (j52 << 55) | (j52 >>> 9);
            long j77 = (j44 << 45) | (j44 >>> 19);
            long j78 = (j37 << 36) | (j37 >>> 28);
            long j79 = (j51 << 28) | (j51 >>> 36);
            long[] jArr2 = jArr;
            long j80 = (j54 << 21) | (j54 >>> 43);
            long j81 = (j49 << 15) | (j49 >>> 49);
            long j82 = (j43 << 10) | (j43 >>> 54);
            long j83 = (j47 << 6) | (j47 >>> 58);
            long j84 = (j38 << c5) | (j38 >>> 61);
            long j85 = j36 ^ ((~j62) & j68);
            long j86 = ((~j68) & j80) ^ j62;
            long j87 = ((~j80) & j74) ^ j68;
            j4 = ((~j74) & j36) ^ j80;
            long j88 = ((~j36) & j62) ^ j74;
            long j89 = j79 ^ ((~j63) & j84);
            long j90 = ((~j84) & j77) ^ j63;
            long j91 = ((~j77) & j64) ^ j84;
            long j92 = ((~j64) & j79) ^ j77;
            long j93 = ((~j79) & j63) ^ j64;
            j11 = j61 ^ ((~j83) & j69);
            long j94 = ((~j69) & j70) ^ j83;
            long j95 = ((~j70) & j66) ^ j69;
            j14 = j70 ^ ((~j66) & j61);
            long j96 = ((~j61) & j83) ^ j66;
            long j97 = j73 ^ ((~j78) & j82);
            long j98 = ((~j82) & j81) ^ j78;
            long j99 = j82 ^ ((~j81) & j71);
            long j100 = j81 ^ ((~j71) & j73);
            long j101 = j71 ^ ((~j73) & j78);
            j21 = j67 ^ ((~j76) & j65);
            long j102 = ((~j65) & j72) ^ j76;
            long j103 = j65 ^ ((~j72) & j75);
            long j104 = j72 ^ ((~j75) & j67);
            i2 = i4 + 1;
            j17 = j98;
            j12 = j94;
            j18 = j99;
            j22 = j102;
            j20 = j101;
            j16 = j97;
            j5 = j88;
            j7 = j90;
            c3 = c6;
            j25 = j75 ^ ((~j67) & j76);
            j24 = j104;
            j = j85 ^ f11564l[i4];
            jArr = jArr2;
            c = c4;
            i = i3;
            c2 = c5;
            j3 = j87;
            j2 = j86;
            j19 = j100;
            j23 = j103;
            j13 = j95;
            j8 = j91;
            j15 = j96;
            j10 = j93;
            j9 = j92;
            j6 = j89;
        }
        long[] jArr3 = jArr;
        jArr3[0] = j;
        jArr3[1] = j2;
        jArr3[c] = j3;
        jArr3[c2] = j4;
        jArr3[c3] = j5;
        jArr3[5] = j6;
        jArr3[6] = j7;
        jArr3[7] = j8;
        jArr3[8] = j9;
        jArr3[9] = j10;
        jArr3[10] = j11;
        jArr3[11] = j12;
        jArr3[12] = j13;
        jArr3[13] = j14;
        jArr3[14] = j15;
        jArr3[15] = j16;
        jArr3[16] = j17;
        jArr3[17] = j18;
        jArr3[18] = j19;
        jArr3[19] = j20;
        jArr3[20] = j21;
        jArr3[21] = j22;
        jArr3[22] = j23;
        jArr3[23] = j24;
        jArr3[i] = j25;
    }

    @Override // defpackage.InterfaceC16922l
    public void reset() {
        isPro(this.f11571l);
    }

    public InterfaceC15464l subs() {
        return AbstractC3586l.amazon(this);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f11569l;
        if (i % 8 != 0) {
            C8339l.smaato("attempt to absorb with odd length queue");
            return;
        }
        if (this.f11566l) {
            C8339l.smaato("attempt to absorb while squeezing");
            return;
        }
        byte[] bArr = this.f11565l;
        bArr[i >>> 3] = b;
        int i2 = i + 8;
        this.f11569l = i2;
        if (i2 == this.f11570l) {
            amazon(0, bArr);
            this.f11569l = 0;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        billing(i, i2, bArr);
    }

    public C5394l(int i, EnumC2441l enumC2441l) {
        this.f11567l = new long[25];
        this.f11565l = new byte[192];
        this.f11568l = enumC2441l;
        isPro(i);
        subs();
        AbstractC8776l.yandex();
    }

    public C5394l(int i) {
        this(i, EnumC2441l.f5219l);
    }
}
