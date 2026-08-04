package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2854l implements InterfaceC9273l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final int[] f6193l = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final byte[][] f6194l = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f6195l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f6196l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f6197l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f6198l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6199l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f6200l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int[] f6201l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f6202l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f6203l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f6204l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f6205l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f6206l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f6207l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int[] f6208l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f6209l;

    public C2854l(C2854l c2854l) {
        this.f6200l = 32;
        this.f6199l = 0;
        this.f6196l = null;
        this.f6204l = null;
        this.f6203l = null;
        this.f6207l = 1;
        this.f6197l = 1;
        byte[] bArr = new byte[64];
        this.f6198l = bArr;
        this.f6206l = 0;
        this.f6201l = new int[16];
        int[] iArr = new int[8];
        this.f6208l = iArr;
        this.f6205l = 0;
        this.f6195l = 0;
        this.f6209l = 0;
        this.f6202l = 0;
        System.arraycopy(c2854l.f6208l, 0, iArr, 0, 8);
        System.arraycopy(c2854l.f6198l, 0, bArr, 0, 64);
        this.f6206l = c2854l.f6206l;
        this.f6199l = c2854l.f6199l;
        this.f6203l = AbstractC14024l.crashlytics(c2854l.f6203l);
        this.f6200l = c2854l.f6200l;
        this.f6205l = c2854l.f6205l;
        this.f6195l = c2854l.f6195l;
        this.f6209l = c2854l.f6209l;
        this.f6196l = AbstractC14024l.crashlytics(c2854l.f6196l);
        this.f6204l = AbstractC14024l.crashlytics(c2854l.f6204l);
        this.f6207l = c2854l.f6207l;
        this.f6197l = c2854l.f6197l;
    }

    public final void amazon(int i) {
        int i2 = this.f6205l + i;
        this.f6205l = i2;
        if (AbstractC14289l.admob(i2, i) < 0) {
            this.f6195l++;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        int[] iArr;
        int length = bArr.length;
        int i2 = this.f6200l;
        int i3 = 0;
        if (i > length - i2) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        this.f6209l = -1;
        int i4 = this.f6206l;
        if (i4 > 0) {
            amazon(i4);
        }
        loadAd(0, this.f6198l);
        int i5 = i2 >>> 2;
        int i6 = i2 & 3;
        int i7 = i;
        while (true) {
            iArr = this.f6208l;
            if (i3 >= i5) {
                break;
            }
            AbstractC10000l.smaato(iArr[i3], i7, bArr);
            i7 += 4;
            i3++;
        }
        if (i6 > 0) {
            int i8 = iArr[i5];
            int i9 = (i + i2) - i6;
            bArr[i9] = (byte) i8;
            for (int i10 = 1; i10 < i6; i10++) {
                i8 >>>= 8;
                bArr[i9 + i10] = (byte) i8;
            }
        }
        reset();
        return i2;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return 64;
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f6200l;
    }

    public final void loadAd(int i, byte[] bArr) {
        C2854l c2854l = this;
        int[] iArr = c2854l.f6208l;
        int length = iArr.length;
        int[] iArr2 = c2854l.f6201l;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int length2 = iArr.length;
        int[] iArr3 = f6193l;
        System.arraycopy(iArr3, 0, iArr2, length2, 4);
        iArr2[12] = c2854l.f6205l ^ iArr3[4];
        iArr2[13] = c2854l.f6195l ^ iArr3[5];
        iArr2[14] = c2854l.f6209l ^ iArr3[6];
        iArr2[15] = c2854l.f6202l ^ iArr3[7];
        int[] iArr4 = new int[16];
        AbstractC10000l.startapp(i, bArr, iArr4);
        int i2 = 0;
        while (i2 < 10) {
            byte[][] bArr2 = f6194l;
            byte[] bArr3 = bArr2[i2];
            int[] iArr5 = iArr4;
            int i3 = i2;
            c2854l.yandex(iArr4[bArr3[0]], iArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i3];
            yandex(iArr5[bArr4[2]], iArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i3];
            yandex(iArr5[bArr5[4]], iArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i3];
            yandex(iArr5[bArr6[6]], iArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i3];
            yandex(iArr5[bArr7[8]], iArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i3];
            yandex(iArr5[bArr8[10]], iArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i3];
            yandex(iArr5[bArr9[12]], iArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i3];
            int i4 = iArr5[bArr10[14]];
            int i5 = iArr5[bArr10[15]];
            c2854l = this;
            c2854l.yandex(i4, i5, 3, 4, 9, 14);
            i2 = i3 + 1;
            iArr4 = iArr5;
        }
        for (int i6 = 0; i6 < iArr.length; i6++) {
            iArr[i6] = (iArr[i6] ^ iArr2[i6]) ^ iArr2[i6 + 8];
        }
    }

    public final void purchase(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 != null && bArr3.length > 0) {
            int length = bArr3.length;
            this.f6199l = length;
            if (length > 32) {
                C8339l.metrica("Keys > 32 bytes are not supported");
                return;
            }
            byte[] bArr4 = new byte[length];
            this.f6203l = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            System.arraycopy(bArr3, 0, this.f6198l, 0, this.f6199l);
            this.f6206l = 64;
        }
        int[] iArr = f6193l;
        int i = iArr[0] ^ (((this.f6199l << 8) | this.f6200l) | ((this.f6207l << 16) | (this.f6197l << 24)));
        int[] iArr2 = this.f6208l;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        if (bArr != null) {
            if (bArr.length != 8) {
                C8339l.metrica("Salt length must be exactly 8 bytes");
                return;
            }
            byte[] bArr5 = new byte[8];
            this.f6196l = bArr5;
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
            iArr2[4] = iArr2[4] ^ AbstractC10000l.metrica(0, bArr);
            iArr2[5] = AbstractC10000l.metrica(4, bArr) ^ iArr2[5];
        }
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
        if (bArr2 != null) {
            if (bArr2.length != 8) {
                C8339l.metrica("Personalization length must be exactly 8 bytes");
                return;
            }
            byte[] bArr6 = new byte[8];
            this.f6204l = bArr6;
            System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
            iArr2[6] = iArr2[6] ^ AbstractC10000l.metrica(0, bArr2);
            iArr2[7] = iArr2[7] ^ AbstractC10000l.metrica(4, bArr2);
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f6206l = 0;
        this.f6209l = 0;
        this.f6202l = 0;
        this.f6205l = 0;
        this.f6195l = 0;
        Arrays.fill(this.f6201l, 0);
        byte[] bArr = this.f6198l;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.f6203l;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f6206l = 64;
        }
        purchase(this.f6196l, this.f6204l, this.f6203l);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.f6206l;
        byte[] bArr2 = this.f6198l;
        if (i4 != 0) {
            i3 = 64 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f6206l += i2;
                return;
            } else {
                System.arraycopy(bArr, i, bArr2, i4, i3);
                amazon(64);
                loadAd(0, bArr2);
                this.f6206l = 0;
                Arrays.fill(bArr2, (byte) 0);
            }
        } else {
            i3 = 0;
        }
        int i5 = i2 + i;
        int i6 = i5 - 64;
        int i7 = i + i3;
        while (i7 < i6) {
            amazon(64);
            loadAd(i7, bArr);
            i7 += 64;
        }
        int i8 = i5 - i7;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f6206l += i8;
    }

    public final void yandex(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f6201l;
        int i7 = iArr[i3] + iArr[i4] + i;
        iArr[i3] = i7;
        int iRotateRight = Integer.rotateRight(iArr[i6] ^ i7, 16);
        iArr[i6] = iRotateRight;
        int i8 = iArr[i5] + iRotateRight;
        iArr[i5] = i8;
        int iRotateRight2 = Integer.rotateRight(iArr[i4] ^ i8, 12);
        iArr[i4] = iRotateRight2;
        int i9 = iArr[i3] + iRotateRight2 + i2;
        iArr[i3] = i9;
        int iRotateRight3 = Integer.rotateRight(iArr[i6] ^ i9, 8);
        iArr[i6] = iRotateRight3;
        int i10 = iArr[i5] + iRotateRight3;
        iArr[i5] = i10;
        iArr[i4] = Integer.rotateRight(iArr[i4] ^ i10, 7);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f6206l;
        int i2 = 64 - i;
        byte[] bArr = this.f6198l;
        if (i2 != 0) {
            this.f6206l = i + 1;
            bArr[i] = b;
            return;
        }
        amazon(64);
        loadAd(0, bArr);
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = b;
        this.f6206l = 1;
    }

    public C2854l(int i) {
        this.f6200l = 32;
        this.f6199l = 0;
        this.f6196l = null;
        this.f6204l = null;
        this.f6203l = null;
        this.f6207l = 1;
        this.f6197l = 1;
        this.f6198l = new byte[64];
        this.f6206l = 0;
        this.f6201l = new int[16];
        this.f6208l = new int[8];
        this.f6205l = 0;
        this.f6195l = 0;
        this.f6209l = 0;
        this.f6202l = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            C8339l.metrica("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
            throw null;
        }
        this.f6200l = i / 8;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        purchase(null, null, null);
    }
}
