package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؕ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3677l implements InterfaceC9273l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final long[] f7741l = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final byte[][] f7742l = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f7743l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long[] f7744l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long[] f7745l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f7746l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f7747l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f7748l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f7749l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f7750l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public long f7751l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f7752l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7753l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f7754l;

    public C3677l(C3677l c3677l) {
        this.f7747l = 64;
        this.f7746l = null;
        this.f7743l = null;
        this.f7750l = null;
        byte[] bArr = new byte[128];
        this.f7749l = bArr;
        this.f7753l = 0;
        this.f7744l = new long[16];
        long[] jArr = new long[8];
        this.f7745l = jArr;
        this.f7752l = 0L;
        this.f7748l = 0L;
        this.f7754l = 0L;
        this.f7751l = 0L;
        System.arraycopy(c3677l.f7745l, 0, jArr, 0, 8);
        System.arraycopy(c3677l.f7749l, 0, bArr, 0, 128);
        this.f7753l = c3677l.f7753l;
        this.f7750l = AbstractC14024l.crashlytics(c3677l.f7750l);
        this.f7747l = c3677l.f7747l;
        this.f7743l = AbstractC14024l.crashlytics(c3677l.f7743l);
        this.f7746l = AbstractC14024l.crashlytics(c3677l.f7746l);
        this.f7752l = c3677l.f7752l;
        this.f7748l = c3677l.f7748l;
        this.f7754l = c3677l.f7754l;
    }

    public final void amazon(int i) {
        long j = i;
        long j2 = this.f7752l + j;
        this.f7752l = j2;
        if (AbstractC6660l.crashlytics(j2, j) < 0) {
            this.f7748l++;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        long[] jArr;
        int length = bArr.length;
        int i2 = this.f7747l;
        int i3 = 0;
        if (i > length - i2) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        this.f7754l = -1L;
        int i4 = this.f7753l;
        if (i4 > 0) {
            amazon(i4);
        }
        loadAd(0, this.f7749l);
        int i5 = i2 >>> 3;
        int i6 = i2 & 7;
        int i7 = i;
        while (true) {
            jArr = this.f7745l;
            if (i3 >= i5) {
                break;
            }
            AbstractC10000l.pro(jArr[i3], bArr, i7);
            i7 += 8;
            i3++;
        }
        if (i6 > 0) {
            long j = jArr[i5];
            int i8 = (i + i2) - i6;
            bArr[i8] = (byte) j;
            for (int i9 = 1; i9 < i6; i9++) {
                j >>>= 8;
                bArr[i8 + i9] = (byte) j;
            }
        }
        reset();
        return i2;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return 128;
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f7747l;
    }

    public final void loadAd(int i, byte[] bArr) {
        C3677l c3677l = this;
        long[] jArr = c3677l.f7745l;
        int length = jArr.length;
        long[] jArr2 = c3677l.f7744l;
        System.arraycopy(jArr, 0, jArr2, 0, length);
        int length2 = jArr.length;
        long[] jArr3 = f7741l;
        System.arraycopy(jArr3, 0, jArr2, length2, 4);
        jArr2[12] = c3677l.f7752l ^ jArr3[4];
        jArr2[13] = c3677l.f7748l ^ jArr3[5];
        jArr2[14] = c3677l.f7754l ^ jArr3[6];
        jArr2[15] = jArr3[7] ^ c3677l.f7751l;
        long[] jArr4 = new long[16];
        AbstractC10000l.tapsense(i, bArr, jArr4);
        int i2 = 0;
        while (i2 < 12) {
            byte[][] bArr2 = f7742l;
            byte[] bArr3 = bArr2[i2];
            long[] jArr5 = jArr4;
            int i3 = i2;
            c3677l.yandex(jArr4[bArr3[0]], jArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i3];
            yandex(jArr5[bArr4[2]], jArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i3];
            yandex(jArr5[bArr5[4]], jArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i3];
            yandex(jArr5[bArr6[6]], jArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i3];
            yandex(jArr5[bArr7[8]], jArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i3];
            yandex(jArr5[bArr8[10]], jArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i3];
            yandex(jArr5[bArr9[12]], jArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i3];
            long j = jArr5[bArr10[14]];
            long j2 = jArr5[bArr10[15]];
            c3677l = this;
            c3677l.yandex(j, j2, 3, 4, 9, 14);
            i2 = i3 + 1;
            jArr4 = jArr5;
        }
        for (int i4 = 0; i4 < jArr.length; i4++) {
            jArr[i4] = (jArr[i4] ^ jArr2[i4]) ^ jArr2[i4 + 8];
        }
    }

    public final void purchase() {
        long[] jArr = f7741l;
        long j = jArr[0] ^ ((long) (16842752 | this.f7747l));
        long[] jArr2 = this.f7745l;
        jArr2[0] = j;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        long j2 = jArr[4];
        jArr2[4] = j2;
        jArr2[5] = jArr[5];
        byte[] bArr = this.f7746l;
        if (bArr != null) {
            jArr2[4] = j2 ^ AbstractC10000l.subscription(0, bArr);
            jArr2[5] = jArr2[5] ^ AbstractC10000l.subscription(8, bArr);
        }
        long j3 = jArr[6];
        jArr2[6] = j3;
        jArr2[7] = jArr[7];
        byte[] bArr2 = this.f7743l;
        if (bArr2 != null) {
            jArr2[6] = AbstractC10000l.subscription(0, bArr2) ^ j3;
            jArr2[7] = jArr2[7] ^ AbstractC10000l.subscription(8, bArr2);
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f7753l = 0;
        this.f7754l = 0L;
        this.f7751l = 0L;
        this.f7752l = 0L;
        this.f7748l = 0L;
        Arrays.fill(this.f7744l, 0L);
        byte[] bArr = this.f7749l;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.f7750l;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f7753l = 128;
        }
        purchase();
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.f7753l;
        byte[] bArr2 = this.f7749l;
        if (i4 != 0) {
            i3 = 128 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f7753l += i2;
                return;
            } else {
                System.arraycopy(bArr, i, bArr2, i4, i3);
                amazon(128);
                loadAd(0, bArr2);
                this.f7753l = 0;
                Arrays.fill(bArr2, (byte) 0);
            }
        } else {
            i3 = 0;
        }
        int i5 = i2 + i;
        int i6 = i5 - 128;
        int i7 = i + i3;
        while (i7 < i6) {
            amazon(128);
            loadAd(i7, bArr);
            i7 += 128;
        }
        int i8 = i5 - i7;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f7753l += i8;
    }

    public final void yandex(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.f7744l;
        long j3 = jArr[i] + jArr[i2] + j;
        jArr[i] = j3;
        long jRotateRight = Long.rotateRight(jArr[i4] ^ j3, 32);
        jArr[i4] = jRotateRight;
        long j4 = jArr[i3] + jRotateRight;
        jArr[i3] = j4;
        long jRotateRight2 = Long.rotateRight(jArr[i2] ^ j4, 24);
        jArr[i2] = jRotateRight2;
        long j5 = jArr[i] + jRotateRight2 + j2;
        jArr[i] = j5;
        long jRotateRight3 = Long.rotateRight(jArr[i4] ^ j5, 16);
        jArr[i4] = jRotateRight3;
        long j6 = jArr[i3] + jRotateRight3;
        jArr[i3] = j6;
        jArr[i2] = Long.rotateRight(jArr[i2] ^ j6, 63);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f7753l;
        int i2 = 128 - i;
        byte[] bArr = this.f7749l;
        if (i2 != 0) {
            this.f7753l = i + 1;
            bArr[i] = b;
            return;
        }
        amazon(128);
        loadAd(0, bArr);
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = b;
        this.f7753l = 1;
    }

    public C3677l(int i) {
        this.f7747l = 64;
        this.f7746l = null;
        this.f7743l = null;
        this.f7750l = null;
        this.f7749l = new byte[128];
        this.f7753l = 0;
        this.f7744l = new long[16];
        this.f7745l = new long[8];
        this.f7752l = 0L;
        this.f7748l = 0L;
        this.f7754l = 0L;
        this.f7751l = 0L;
        if (i < 8 || i > 512 || i % 8 != 0) {
            C8339l.metrica("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
            throw null;
        }
        this.f7747l = i / 8;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        purchase();
    }
}
