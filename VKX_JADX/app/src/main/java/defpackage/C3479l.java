package defpackage;

/* JADX INFO: renamed from: lؕٙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3479l implements InterfaceC12774l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int[] f7362l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f7364l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f7365l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7370l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f7367l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int[] f7366l = new int[16];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int[] f7363l = new int[16];

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f7369l = new byte[64];

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f7368l = false;

    static {
        int[] iArr = new int[8];
        AbstractC10000l.startapp(0, AbstractC9008l.crashlytics("expand 16-byte kexpand 32-byte k"), iArr);
        f7362l = iArr;
        AbstractC9008l.crashlytics("expand 32-byte k");
        AbstractC9008l.crashlytics("expand 16-byte k");
    }

    public static void amazon(int[] iArr, int i) {
        int i2 = (i - 16) / 4;
        int[] iArr2 = f7362l;
        iArr[0] = iArr2[i2];
        iArr[1] = iArr2[i2 + 1];
        iArr[2] = iArr2[i2 + 2];
        iArr[3] = iArr2[i2 + 3];
    }

    public static void billing(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            C11983l.crashlytics();
            return;
        }
        if (iArr2.length != 16) {
            C11983l.crashlytics();
            return;
        }
        if (i % 2 != 0) {
            C8339l.metrica("Number of rounds must be even");
            return;
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        char c = 3;
        int i5 = iArr[3];
        char c2 = 4;
        int i6 = iArr[4];
        char c3 = 5;
        int i7 = iArr[5];
        char c4 = 6;
        int i8 = iArr[6];
        int i9 = 7;
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = 9;
        int i13 = iArr[9];
        int i14 = iArr[10];
        int i15 = iArr[11];
        int i16 = iArr[12];
        int i17 = 13;
        int i18 = iArr[13];
        int i19 = iArr[14];
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i19;
        int iRotateLeft3 = i18;
        int iRotateLeft4 = i16;
        int iRotateLeft5 = i15;
        int iRotateLeft6 = i14;
        int i20 = i13;
        int i21 = i11;
        int i22 = i10;
        int i23 = i8;
        int iRotateLeft7 = i7;
        int i24 = i6;
        int i25 = i5;
        int i26 = i4;
        int i27 = i3;
        int iRotateLeft8 = i2;
        int i28 = i;
        while (i28 > 0) {
            char c5 = c;
            int iRotateLeft9 = Integer.rotateLeft(iRotateLeft8 + iRotateLeft4, i9) ^ i24;
            int iRotateLeft10 = i21 ^ Integer.rotateLeft(iRotateLeft9 + iRotateLeft8, i12);
            char c6 = c2;
            int iRotateLeft11 = iRotateLeft4 ^ Integer.rotateLeft(iRotateLeft10 + iRotateLeft9, i17);
            char c7 = c3;
            char c8 = c4;
            int iRotateLeft12 = iRotateLeft8 ^ Integer.rotateLeft(iRotateLeft11 + iRotateLeft10, 18);
            int iRotateLeft13 = i20 ^ Integer.rotateLeft(iRotateLeft7 + i27, i9);
            int iRotateLeft14 = iRotateLeft3 ^ Integer.rotateLeft(iRotateLeft13 + iRotateLeft7, i12);
            int iRotateLeft15 = Integer.rotateLeft(iRotateLeft14 + iRotateLeft13, i17) ^ i27;
            int iRotateLeft16 = Integer.rotateLeft(iRotateLeft15 + iRotateLeft14, 18) ^ iRotateLeft7;
            int iRotateLeft17 = iRotateLeft2 ^ Integer.rotateLeft(iRotateLeft6 + i23, 7);
            int iRotateLeft18 = i26 ^ Integer.rotateLeft(iRotateLeft17 + iRotateLeft6, 9);
            int iRotateLeft19 = i23 ^ Integer.rotateLeft(iRotateLeft18 + iRotateLeft17, 13);
            int iRotateLeft20 = iRotateLeft6 ^ Integer.rotateLeft(iRotateLeft19 + iRotateLeft18, 18);
            int iRotateLeft21 = i25 ^ Integer.rotateLeft(iRotateLeft + iRotateLeft5, 7);
            int iRotateLeft22 = i22 ^ Integer.rotateLeft(iRotateLeft21 + iRotateLeft, 9);
            int iRotateLeft23 = iRotateLeft5 ^ Integer.rotateLeft(iRotateLeft22 + iRotateLeft21, 13);
            int iRotateLeft24 = iRotateLeft ^ Integer.rotateLeft(iRotateLeft23 + iRotateLeft22, 18);
            int iRotateLeft25 = iRotateLeft15 ^ Integer.rotateLeft(iRotateLeft12 + iRotateLeft21, 7);
            int iRotateLeft26 = Integer.rotateLeft(iRotateLeft25 + iRotateLeft12, 9) ^ iRotateLeft18;
            int iRotateLeft27 = iRotateLeft21 ^ Integer.rotateLeft(iRotateLeft26 + iRotateLeft25, 13);
            iRotateLeft8 = iRotateLeft12 ^ Integer.rotateLeft(iRotateLeft27 + iRotateLeft26, 18);
            int iRotateLeft28 = Integer.rotateLeft(iRotateLeft16 + iRotateLeft9, 7) ^ iRotateLeft19;
            int iRotateLeft29 = Integer.rotateLeft(iRotateLeft28 + iRotateLeft16, 9) ^ iRotateLeft22;
            int iRotateLeft30 = iRotateLeft9 ^ Integer.rotateLeft(iRotateLeft29 + iRotateLeft28, 13);
            iRotateLeft7 = iRotateLeft16 ^ Integer.rotateLeft(iRotateLeft30 + iRotateLeft29, 18);
            iRotateLeft5 = iRotateLeft23 ^ Integer.rotateLeft(iRotateLeft20 + iRotateLeft13, 7);
            int iRotateLeft31 = Integer.rotateLeft(iRotateLeft5 + iRotateLeft20, 9) ^ iRotateLeft10;
            int iRotateLeft32 = Integer.rotateLeft(iRotateLeft31 + iRotateLeft5, 13) ^ iRotateLeft13;
            iRotateLeft6 = iRotateLeft20 ^ Integer.rotateLeft(iRotateLeft32 + iRotateLeft31, 18);
            iRotateLeft4 = iRotateLeft11 ^ Integer.rotateLeft(iRotateLeft24 + iRotateLeft17, 7);
            iRotateLeft3 = iRotateLeft14 ^ Integer.rotateLeft(iRotateLeft4 + iRotateLeft24, 9);
            iRotateLeft2 = iRotateLeft17 ^ Integer.rotateLeft(iRotateLeft3 + iRotateLeft4, 13);
            iRotateLeft = iRotateLeft24 ^ Integer.rotateLeft(iRotateLeft2 + iRotateLeft3, 18);
            i28 -= 2;
            i21 = iRotateLeft31;
            i27 = iRotateLeft25;
            i23 = iRotateLeft28;
            i24 = iRotateLeft30;
            i22 = iRotateLeft29;
            i20 = iRotateLeft32;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i9 = 7;
            i26 = iRotateLeft26;
            i25 = iRotateLeft27;
            i12 = 9;
            i17 = 13;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = iRotateLeft8 + iArr[0];
        iArr2[1] = i27 + iArr[1];
        iArr2[2] = i26 + iArr[2];
        iArr2[c9] = i25 + iArr[c9];
        iArr2[c10] = i24 + iArr[c10];
        iArr2[c11] = iRotateLeft7 + iArr[c11];
        iArr2[c12] = i23 + iArr[c12];
        iArr2[7] = i22 + iArr[7];
        iArr2[8] = i21 + iArr[8];
        iArr2[9] = i20 + iArr[9];
        iArr2[10] = iRotateLeft6 + iArr[10];
        iArr2[11] = iRotateLeft5 + iArr[11];
        iArr2[12] = iRotateLeft4 + iArr[12];
        iArr2[13] = iRotateLeft3 + iArr[13];
        iArr2[14] = iRotateLeft2 + iArr[14];
        iArr2[15] = iRotateLeft + iArr[15];
    }

    public int crashlytics() {
        return 8;
    }

    @Override // defpackage.InterfaceC12774l
    public String getAlgorithmName() {
        return "Salsa20";
    }

    @Override // defpackage.InterfaceC12774l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica(getAlgorithmName().concat(" Init parameters must include an IV"));
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr = c0272l.f1273l;
        if (bArr == null || bArr.length != crashlytics()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + crashlytics() + " bytes of IV");
        }
        InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
        if (interfaceC9719l2 == null) {
            if (!this.f7368l) {
                C8339l.smaato(getAlgorithmName().concat(" KeyParameter can not be null for first initialisation"));
                return;
            }
            mopub(null, bArr);
        } else {
            if (!(interfaceC9719l2 instanceof C13886l)) {
                C8339l.metrica(getAlgorithmName().concat(" Init parameters must contain a KeyParameter (or null for re-init)"));
                return;
            }
            byte[] bArr2 = ((C13886l) interfaceC9719l2).f27156l;
            mopub(bArr2, bArr);
            getAlgorithmName();
            int length = bArr2.length;
            if (interfaceC9719l instanceof EnumC2441l) {
                C8339l.metrica("params should not be CryptoServicePurpose");
                return;
            }
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
        reset();
        this.f7368l = true;
    }

    public void loadAd(byte[] bArr) {
        int[] iArr = this.f7366l;
        int[] iArr2 = this.f7363l;
        billing(20, iArr, iArr2);
        AbstractC10000l.remoteconfig(bArr, iArr2);
    }

    public void mopub(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f7366l;
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                C8339l.metrica(getAlgorithmName().concat(" requires 128 bit or 256 bit key"));
                return;
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr2 = f7362l;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            AbstractC10000l.adcel(bArr, 0, iArr, 1, 4);
            AbstractC10000l.adcel(bArr, bArr.length - 16, iArr, 11, 4);
        }
        AbstractC10000l.adcel(bArr2, 0, iArr, 6, 2);
    }

    @Override // defpackage.InterfaceC12774l
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f7368l) {
            C8339l.smaato(getAlgorithmName().concat(" not initialised"));
            return 0;
        }
        if (i + i2 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        int i4 = this.f7370l + i2;
        this.f7370l = i4;
        if (i4 < i2 && i4 >= 0) {
            int i5 = this.f7364l + 1;
            this.f7364l = i5;
            if (i5 == 0) {
                int i6 = this.f7365l + 1;
                this.f7365l = i6;
                if ((i6 & 32) != 0) {
                    throw new C18529l("2^70 byte limit per IV would be exceeded; Change IV");
                }
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = this.f7367l;
            byte[] bArr3 = this.f7369l;
            bArr2[i7 + i3] = (byte) (bArr3[i8] ^ bArr[i7 + i]);
            int i9 = (i8 + 1) & 63;
            this.f7367l = i9;
            if (i9 == 0) {
                yandex();
                loadAd(bArr3);
            }
        }
        return i2;
    }

    public void purchase() {
        int[] iArr = this.f7366l;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    @Override // defpackage.InterfaceC12774l
    public final void reset() {
        this.f7367l = 0;
        this.f7370l = 0;
        this.f7364l = 0;
        this.f7365l = 0;
        purchase();
        loadAd(this.f7369l);
    }

    public void yandex() {
        int[] iArr = this.f7366l;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }
}
