package defpackage;

/* JADX INFO: renamed from: lؑۦً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0709l extends AbstractC7389l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int[] f2193l = new int[64];

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f2194l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int[] f2195l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int[] f2196l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int[] f2197l;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            f2193l[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            f2193l[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public C0709l(C0709l c0709l) {
        super(c0709l);
        int[] iArr = new int[8];
        this.f2196l = iArr;
        int[] iArr2 = new int[16];
        this.f2197l = iArr2;
        this.f2195l = new int[68];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        System.arraycopy(c0709l.f2196l, 0, iArr, 0, iArr.length);
        System.arraycopy(c0709l.f2197l, 0, iArr2, 0, iArr2.length);
        this.f2194l = c0709l.f2194l;
    }

    @Override // defpackage.AbstractC7389l
    public final void admob(int i, byte[] bArr) {
        int i2 = this.f2194l;
        this.f2194l = i2 + 1;
        this.f2197l[i2] = AbstractC10000l.yandex(i, bArr);
        if (this.f2194l >= 16) {
            billing();
        }
    }

    @Override // defpackage.AbstractC7389l
    public final void billing() {
        int[] iArr;
        int i;
        int[] iArr2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iArr = this.f2195l;
            i = 16;
            if (i3 >= 16) {
                break;
            }
            iArr[i3] = this.f2197l[i3];
            i3++;
        }
        for (int i4 = 16; i4 < 68; i4++) {
            int i5 = iArr[i4 - 3];
            int i6 = iArr[i4 - 13];
            int i7 = ((i5 >>> 17) | (i5 << 15)) ^ (iArr[i4 - 16] ^ iArr[i4 - 9]);
            iArr[i4] = (((i7 ^ ((i7 << 15) | (i7 >>> 17))) ^ ((i7 << 23) | (i7 >>> 9))) ^ ((i6 >>> 25) | (i6 << 7))) ^ iArr[i4 - 6];
        }
        int[] iArr3 = this.f2196l;
        int i8 = iArr3[0];
        int i9 = iArr3[1];
        int i10 = iArr3[2];
        char c = 3;
        int i11 = iArr3[3];
        char c2 = 4;
        int i12 = iArr3[4];
        char c3 = 5;
        int i13 = iArr3[5];
        int i14 = iArr3[6];
        int i15 = iArr3[7];
        int i16 = 0;
        while (true) {
            iArr2 = f2193l;
            if (i16 >= i) {
                break;
            }
            int i17 = (i8 << 12) | (i8 >>> 20);
            int i18 = i17 + i12 + iArr2[i16];
            int i19 = (i18 << 7) | (i18 >>> 25);
            char c4 = c;
            int i20 = i19 ^ i17;
            char c5 = c2;
            int i21 = iArr[i16];
            int i22 = i2;
            int iApplovin = AbstractC5020l.applovin((i8 ^ i9) ^ i10, i11, i20, i21 ^ iArr[i16 + 4]);
            int iApplovin2 = AbstractC5020l.applovin((i12 ^ i13) ^ i14, i15, i19, i21);
            int i23 = (i9 << 9) | (i9 >>> 23);
            int i24 = (i13 << 19) | (i13 >>> 13);
            int i25 = (iApplovin2 ^ ((iApplovin2 << 9) | (iApplovin2 >>> 23))) ^ ((iApplovin2 << 17) | (iApplovin2 >>> 15));
            i16++;
            i11 = i10;
            i13 = i12;
            c2 = c5;
            c = c4;
            c3 = c3;
            i12 = i25;
            i10 = i23;
            i15 = i14;
            i = 16;
            i14 = i24;
            i9 = i8;
            i8 = iApplovin;
            i2 = i22;
        }
        int i26 = i2;
        char c6 = c;
        char c7 = c2;
        char c8 = c3;
        int i27 = 16;
        while (i27 < 64) {
            int i28 = (i8 << 12) | (i8 >>> 20);
            int i29 = i28 + i12 + iArr2[i27];
            int i30 = (i29 >>> 25) | (i29 << 7);
            int i31 = iArr[i27];
            int iApplovin3 = AbstractC5020l.applovin(((i9 | i10) & i8) | (i9 & i10), i11, i28 ^ i30, iArr[i27 + 4] ^ i31);
            int iApplovin4 = AbstractC5020l.applovin((i12 & i13) | ((~i12) & i14), i15, i30, i31);
            int i32 = (i13 << 19) | (i13 >>> 13);
            int i33 = (iApplovin4 ^ ((iApplovin4 << 9) | (iApplovin4 >>> 23))) ^ ((iApplovin4 << 17) | (iApplovin4 >>> 15));
            i27++;
            i11 = i10;
            i13 = i12;
            i12 = i33;
            i10 = (i9 >>> 23) | (i9 << 9);
            i15 = i14;
            i9 = i8;
            i14 = i32;
            i8 = iApplovin3;
        }
        iArr3[i26] = iArr3[i26] ^ i8;
        iArr3[1] = iArr3[1] ^ i9;
        iArr3[2] = iArr3[2] ^ i10;
        iArr3[c6] = iArr3[c6] ^ i11;
        iArr3[c7] = iArr3[c7] ^ i12;
        iArr3[c8] = iArr3[c8] ^ i13;
        iArr3[6] = iArr3[6] ^ i14;
        iArr3[7] = iArr3[7] ^ i15;
        this.f2194l = i26;
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        purchase();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2196l;
            if (i2 >= iArr.length) {
                reset();
                return 32;
            }
            AbstractC10000l.isPro(iArr[i2], i, bArr);
            i += 4;
            i2++;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "SM3";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 32;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C0709l c0709l = (C0709l) interfaceC11512l;
        amazon(c0709l);
        int[] iArr = c0709l.f2196l;
        int[] iArr2 = this.f2196l;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = c0709l.f2197l;
        int[] iArr4 = this.f2197l;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.f2194l = c0709l.f2194l;
    }

    @Override // defpackage.AbstractC7389l
    public final void mopub(long j) {
        int i = this.f2194l;
        int[] iArr = this.f2197l;
        if (i > 14) {
            iArr[i] = 0;
            this.f2194l = i + 1;
            billing();
        }
        while (true) {
            int i2 = this.f2194l;
            if (i2 >= 14) {
                int i3 = i2 + 1;
                this.f2194l = i3;
                iArr[i2] = (int) (j >>> 32);
                this.f2194l = i2 + 2;
                iArr[i3] = (int) j;
                return;
            }
            iArr[i2] = 0;
            this.f2194l = i2 + 1;
        }
    }

    @Override // defpackage.AbstractC7389l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        int[] iArr = this.f2196l;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f2194l = 0;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C0709l(this);
    }

    public C0709l(EnumC2441l enumC2441l) {
        super(enumC2441l);
        this.f2196l = new int[8];
        this.f2197l = new int[16];
        this.f2195l = new int[68];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    public C0709l() {
        this(EnumC2441l.f5219l);
    }
}
