package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٜٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14269l implements InterfaceC12774l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f27935l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f27936l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f27937l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f27938l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27939l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int[] f27940l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f27941l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f27942l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int[] f27943l;

    public static int firebase(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public static int isPro(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public static void remoteconfig(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
    }

    public static void smaato(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
    }

    public static int yandex(int i, int i2) {
        return (i - i2) & 511;
    }

    public void admob() {
        String str;
        int[] iArr = this.f27943l;
        int[] iArr2 = this.f27940l;
        if (this.f27938l.length != 16) {
            str = "The key must be 128 bits long";
        } else {
            if (this.f27935l.length == 16) {
                this.f27937l = 0;
                this.f27936l = 0;
                int[] iArr3 = new int[1280];
                for (int i = 0; i < 16; i++) {
                    int i2 = i >> 2;
                    iArr3[i2] = ((this.f27938l[i] & 255) << ((i & 3) * 8)) | iArr3[i2];
                }
                System.arraycopy(iArr3, 0, iArr3, 4, 4);
                int i3 = 0;
                while (true) {
                    byte[] bArr = this.f27935l;
                    if (i3 >= bArr.length || i3 >= 16) {
                        break;
                    }
                    int i4 = (i3 >> 2) + 8;
                    iArr3[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr3[i4];
                    i3++;
                }
                System.arraycopy(iArr3, 8, iArr3, 12, 4);
                for (int i5 = 16; i5 < 1280; i5++) {
                    int i6 = iArr3[i5 - 2];
                    int iIsPro = ((i6 >>> 10) ^ (isPro(i6, 17) ^ isPro(i6, 19))) + iArr3[i5 - 7];
                    int i7 = iArr3[i5 - 15];
                    iArr3[i5] = iIsPro + ((i7 >>> 3) ^ (isPro(i7, 7) ^ isPro(i7, 18))) + iArr3[i5 - 16] + i5;
                }
                System.arraycopy(iArr3, PSKKeyManager.MAX_KEY_LENGTH_BYTES, iArr2, 0, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                System.arraycopy(iArr3, 768, iArr, 0, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                for (int i8 = 0; i8 < 512; i8++) {
                    iArr2[i8] = vip();
                }
                for (int i9 = 0; i9 < 512; i9++) {
                    iArr[i9] = vip();
                }
                this.f27936l = 0;
                return;
            }
            str = "The IV must be 128 bits long";
        }
        C8339l.metrica(str);
    }

    public int amazon() {
        int[] iArr = this.f27940l;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 7) | (i2 << 25);
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = (i4 >>> 6) | (i5 << 26);
        return i5 ^ ((((i ^ i3) ^ ((i2 >>> 6) | (i4 << 26))) ^ i6) ^ ((i4 >>> 17) | (i5 << 15)));
    }

    public int billing() {
        int[] iArr = this.f27943l;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 3) | (i2 << 29);
        int i4 = (i >>> 11) | (i2 << 21);
        int i5 = (i >>> 13) | (i2 << 19);
        int i6 = (i >>> 17) | (i2 << 15);
        int i7 = (i >>> 18) | (i2 << 14);
        int i8 = (i >>> 26) | (i2 << 6);
        int i9 = (i >>> 27) | (i2 << 5);
        int i10 = iArr[2];
        int i11 = (i2 >>> 8) | (i10 << 24);
        int i12 = (i2 >>> 16) | (i10 << 16);
        int i13 = (i2 >>> 24) | (i10 << 8);
        int i14 = (i2 >>> 27) | (i10 << 5);
        int i15 = (i2 >>> 29) | (i10 << 3);
        int i16 = iArr[3];
        return (((((((i16 ^ (((i ^ i8) ^ i13) ^ ((i10 >>> 27) | (i16 << 5)))) ^ (i3 & ((i10 >>> 3) | (i16 << 29)))) ^ (i4 & i5)) ^ (i6 & i7)) ^ (i9 & i14)) ^ (i11 & i12)) ^ (i15 & ((i10 >>> 1) | (i16 << 31)))) ^ (((i10 >>> 4) | (i16 << 28)) & ((i10 >>> 20) | (i16 << 12)));
    }

    public int crashlytics() {
        int[] iArr = this.f27943l;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 1) | (i2 << 15);
        int i4 = (i >>> 2) | (i2 << 14);
        int i5 = (i >>> 4) | (i2 << 12);
        int i6 = (i >>> 10) | (i2 << 6);
        int i7 = iArr[2];
        int i8 = (i2 >>> 15) | (i7 << 1);
        int i9 = iArr[3];
        int i10 = (i7 >>> 11) | (i9 << 5);
        int i11 = iArr[4];
        int i12 = (i9 >>> 8) | (i11 << 8);
        int i13 = (i11 << 1) | (i9 >>> 15);
        int[] iArr2 = this.f27940l;
        int i14 = iArr2[0] >>> 3;
        int i15 = iArr2[1];
        int i16 = i14 | (i15 << 13);
        int i17 = iArr2[2];
        int i18 = (i15 >>> 9) | (i17 << 7);
        int i19 = (iArr2[3] << 2) | (i17 >>> 14);
        int i20 = iArr2[4];
        int i21 = i19 & i20;
        int i22 = ((((i18 ^ i13) ^ (i16 & i20)) ^ i21) ^ (i20 & i13)) ^ ((i16 & i18) & i19);
        int i23 = i16 & i19;
        return ((((((((((((i20 & i23) ^ i22) ^ (i23 & i13)) ^ ((i18 & i19) & i13)) ^ (i13 & i21)) ^ i3) ^ i4) ^ i5) ^ i6) ^ i8) ^ i10) ^ i12) & 65535;
    }

    @Override // defpackage.InterfaceC12774l
    public final String getAlgorithmName() {
        switch (this.f27939l) {
            case 0:
                return "Grain-128";
            case 1:
                return "Grain v1";
            case 2:
                return "HC-128";
            default:
                return "HC-256";
        }
    }

    @Override // defpackage.InterfaceC12774l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        String str;
        String str2;
        String strSubscription;
        InterfaceC9719l interfaceC9719l2;
        switch (this.f27939l) {
            case 0:
                if (interfaceC9719l instanceof C0272l) {
                    C0272l c0272l = (C0272l) interfaceC9719l;
                    byte[] bArr = c0272l.f1273l;
                    if (bArr == null || bArr.length != 12) {
                        str = "Grain-128 requires exactly 12 bytes of IV";
                    } else {
                        InterfaceC9719l interfaceC9719l3 = c0272l.f1272l;
                        if (interfaceC9719l3 instanceof C13886l) {
                            byte[] bArr2 = ((C13886l) interfaceC9719l3).f27156l;
                            if (bArr2.length != 16) {
                                str = "Grain-128 key must be 128 bits long";
                            } else if (!(interfaceC9719l instanceof EnumC2441l)) {
                                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                                byte[] bArr3 = new byte[bArr2.length];
                                this.f27935l = bArr3;
                                this.f27938l = new byte[bArr2.length];
                                this.f27940l = new int[4];
                                this.f27943l = new int[4];
                                this.f27941l = new byte[4];
                                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                                System.arraycopy(bArr2, 0, this.f27938l, 0, bArr2.length);
                                reset();
                            } else {
                                C8339l.metrica("params should not be CryptoServicePurpose");
                            }
                        } else {
                            str = "Grain-128 init parameters must include a key";
                        }
                    }
                } else {
                    str = "Grain-128 Init parameters must include an IV";
                }
                C8339l.metrica(str);
                break;
            case 1:
                if (interfaceC9719l instanceof C0272l) {
                    C0272l c0272l2 = (C0272l) interfaceC9719l;
                    byte[] bArr4 = c0272l2.f1273l;
                    if (bArr4 == null || bArr4.length != 8) {
                        str2 = "Grain v1 requires exactly 8 bytes of IV";
                    } else {
                        InterfaceC9719l interfaceC9719l4 = c0272l2.f1272l;
                        if (interfaceC9719l4 instanceof C13886l) {
                            byte[] bArr5 = ((C13886l) interfaceC9719l4).f27156l;
                            if (bArr5.length == 10) {
                                byte[] bArr6 = new byte[bArr5.length];
                                this.f27935l = bArr6;
                                this.f27938l = new byte[bArr5.length];
                                this.f27940l = new int[5];
                                this.f27943l = new int[5];
                                this.f27941l = new byte[2];
                                System.arraycopy(bArr4, 0, bArr6, 0, bArr4.length);
                                System.arraycopy(bArr5, 0, this.f27938l, 0, bArr5.length);
                                if (!(interfaceC9719l instanceof EnumC2441l)) {
                                    ((C5911l) AbstractC8776l.purchase.get()).getClass();
                                    reset();
                                } else {
                                    C8339l.metrica("params should not be CryptoServicePurpose");
                                }
                            } else {
                                str2 = "Grain v1 key must be 80 bits long";
                            }
                        } else {
                            str2 = "Grain v1 init parameters must include a key";
                        }
                    }
                } else {
                    str2 = "Grain v1 init parameters must include an IV";
                }
                C8339l.metrica(str2);
                break;
            case 2:
                if (interfaceC9719l instanceof C0272l) {
                    C0272l c0272l3 = (C0272l) interfaceC9719l;
                    this.f27935l = c0272l3.f1273l;
                    InterfaceC9719l interfaceC9719l5 = c0272l3.f1272l;
                    if (interfaceC9719l5 instanceof C13886l) {
                        this.f27938l = ((C13886l) interfaceC9719l5).f27156l;
                        admob();
                        if (!(interfaceC9719l instanceof EnumC2441l)) {
                            ((C5911l) AbstractC8776l.purchase.get()).getClass();
                            this.f27942l = true;
                        } else {
                            C8339l.metrica("params should not be CryptoServicePurpose");
                        }
                    } else {
                        strSubscription = AbstractC5020l.subscription("Invalid parameter passed to HC128 init - ", interfaceC9719l);
                    }
                } else {
                    strSubscription = "no IV passed";
                }
                C8339l.metrica(strSubscription);
                break;
            default:
                if (interfaceC9719l instanceof C0272l) {
                    C0272l c0272l4 = (C0272l) interfaceC9719l;
                    this.f27935l = c0272l4.f1273l;
                    interfaceC9719l2 = c0272l4.f1272l;
                } else {
                    this.f27935l = new byte[0];
                    interfaceC9719l2 = interfaceC9719l;
                }
                if (!(interfaceC9719l2 instanceof C13886l)) {
                    C8339l.metrica(AbstractC5020l.subscription("Invalid parameter passed to HC256 init - ", interfaceC9719l));
                } else {
                    this.f27938l = ((C13886l) interfaceC9719l2).f27156l;
                    subs();
                    int length = this.f27938l.length;
                    if (!(interfaceC9719l instanceof EnumC2441l)) {
                        ((C5911l) AbstractC8776l.purchase.get()).getClass();
                        this.f27942l = true;
                    } else {
                        C8339l.metrica("params should not be CryptoServicePurpose");
                    }
                }
                break;
        }
    }

    public int loadAd() {
        int[] iArr = this.f27943l;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 2) | (i2 << 30);
        int i4 = (i >>> 12) | (i2 << 20);
        int i5 = (i >>> 15) | (i2 << 17);
        int i6 = iArr[2];
        int i7 = (i2 >>> 4) | (i6 << 28);
        int i8 = (i2 >>> 13) | (i6 << 19);
        int i9 = iArr[3];
        int i10 = (i6 >>> 9) | (i9 << 23);
        int i11 = (i6 >>> 25) | (i9 << 7);
        int i12 = (i9 << 1) | (i6 >>> 31);
        int[] iArr2 = this.f27940l;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        int i15 = (i13 >>> 8) | (i14 << 24);
        int i16 = (i13 >>> 13) | (i14 << 19);
        int i17 = (i13 >>> 20) | (i14 << 12);
        int i18 = iArr2[2];
        int i19 = iArr2[3];
        int i20 = i17 & i16;
        return (((((((((((i18 >>> 30) | (i19 << 2)) & (i12 & i4)) ^ (((i20 ^ (i4 & i15)) ^ (i12 & ((i14 >>> 10) | (i18 << 22)))) ^ (((i14 >>> 28) | (i18 << 4)) & ((i18 >>> 15) | (i19 << 17))))) ^ ((i18 >>> 29) | (i19 << 3))) ^ i3) ^ i5) ^ i7) ^ i8) ^ i6) ^ i10) ^ i11;
    }

    public int metrica() {
        int i;
        int i2;
        int[] iArr = this.f27943l;
        int[] iArr2 = this.f27940l;
        int i3 = this.f27936l;
        int i4 = i3 & 1023;
        if (i3 < 1024) {
            int i5 = iArr2[(i4 - 3) & 1023];
            int i6 = iArr2[(i4 - 1023) & 1023];
            iArr2[i4] = iArr2[(i4 - 10) & 1023] + (firebase(i6, 23) ^ firebase(i5, 10)) + iArr[(i5 ^ i6) & 1023] + iArr2[i4];
            int i7 = iArr2[(i4 - 12) & 1023];
            i = iArr[i7 & 255] + iArr[((i7 >> 8) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES] + iArr[((i7 >> 16) & 255) + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE] + iArr[((i7 >> 24) & 255) + 768];
            i2 = iArr2[i4];
        } else {
            int i8 = iArr[(i4 - 3) & 1023];
            int i9 = iArr[(i4 - 1023) & 1023];
            iArr[i4] = iArr[(i4 - 10) & 1023] + (firebase(i9, 23) ^ firebase(i8, 10)) + iArr2[(i8 ^ i9) & 1023] + iArr[i4];
            int i10 = iArr[(i4 - 12) & 1023];
            i = iArr2[i10 & 255] + iArr2[((i10 >> 8) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES] + iArr2[((i10 >> 16) & 255) + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE] + iArr2[((i10 >> 24) & 255) + 768];
            i2 = iArr[i4];
        }
        int i11 = i2 ^ i;
        this.f27936l = (this.f27936l + 1) & 2047;
        return i11;
    }

    public int mopub() {
        int[] iArr = this.f27943l;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 9) | (i2 << 7);
        int i4 = (i >>> 14) | (i2 << 2);
        int i5 = (i >>> 15) | (i2 << 1);
        int i6 = iArr[2];
        int i7 = (i2 >>> 5) | (i6 << 11);
        int i8 = (i2 >>> 12) | (i6 << 4);
        int i9 = iArr[3];
        int i10 = (i6 >>> 1) | (i9 << 15);
        int i11 = (i6 >>> 5) | (i9 << 11);
        int i12 = (i6 >>> 13) | (i9 << 3);
        int i13 = iArr[4];
        int i14 = (i9 >>> 4) | (i13 << 12);
        int i15 = (i9 >>> 12) | (i13 << 4);
        int i16 = (i9 >>> 14) | (i13 << 2);
        int i17 = (i13 << 1) | (i9 >>> 15);
        int i18 = i17 & i15;
        int i19 = (((i ^ (((((((((i16 ^ i15) ^ i14) ^ i12) ^ i11) ^ i10) ^ i8) ^ i7) ^ i4) ^ i3)) ^ i18) ^ (i11 & i10)) ^ (i5 & i3);
        int i20 = i15 & i14;
        int i21 = i10 & i8 & i7;
        return (((((((((i17 & i12) & i8) & i3) ^ ((i19 ^ (i20 & i12)) ^ i21)) ^ ((i20 & i11) & i10)) ^ ((i18 & i7) & i5)) ^ (((i18 & i14) & i12) & i11)) ^ ((i21 & i5) & i3)) ^ (((((i14 & i12) & i11) & i10) & i8) & i7)) & 65535;
    }

    @Override // defpackage.InterfaceC12774l
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        switch (this.f27939l) {
            case 0:
                if (!this.f27942l) {
                    C8339l.smaato("Grain-128 not initialised");
                } else if (i + i2 > bArr.length) {
                    C10754l.ad("input buffer too short");
                } else {
                    if (i3 + i2 <= bArr2.length) {
                        for (int i4 = 0; i4 < i2; i4++) {
                            int i5 = i3 + i4;
                            byte b = bArr[i + i4];
                            if (this.f27937l > 3) {
                                int iLoadAd = loadAd();
                                this.f27936l = iLoadAd;
                                byte[] bArr3 = this.f27941l;
                                bArr3[0] = (byte) iLoadAd;
                                bArr3[1] = (byte) (iLoadAd >> 8);
                                bArr3[2] = (byte) (iLoadAd >> 16);
                                bArr3[3] = (byte) (iLoadAd >> 24);
                                int[] iArr = this.f27943l;
                                smaato(iArr, billing() ^ this.f27940l[0]);
                                this.f27943l = iArr;
                                int[] iArr2 = this.f27940l;
                                smaato(iArr2, amazon());
                                this.f27940l = iArr2;
                                this.f27937l = 0;
                            }
                            byte[] bArr4 = this.f27941l;
                            int i6 = this.f27937l;
                            this.f27937l = i6 + 1;
                            bArr2[i5] = (byte) (b ^ bArr4[i6]);
                        }
                        return i2;
                    }
                    C18073l.ad("output buffer too short");
                }
                return 0;
            case 1:
                if (!this.f27942l) {
                    C8339l.smaato("Grain v1 not initialised");
                } else if (i + i2 > bArr.length) {
                    C10754l.ad("input buffer too short");
                } else {
                    if (i3 + i2 <= bArr2.length) {
                        for (int i7 = 0; i7 < i2; i7++) {
                            int i8 = i3 + i7;
                            byte b2 = bArr[i + i7];
                            if (this.f27937l > 1) {
                                int iCrashlytics = crashlytics();
                                this.f27936l = iCrashlytics;
                                byte[] bArr5 = this.f27941l;
                                bArr5[0] = (byte) iCrashlytics;
                                bArr5[1] = (byte) (iCrashlytics >> 8);
                                int[] iArr3 = this.f27943l;
                                remoteconfig(iArr3, mopub() ^ this.f27940l[0]);
                                this.f27943l = iArr3;
                                int[] iArr4 = this.f27940l;
                                remoteconfig(iArr4, purchase());
                                this.f27940l = iArr4;
                                this.f27937l = 0;
                            }
                            byte[] bArr6 = this.f27941l;
                            int i9 = this.f27937l;
                            this.f27937l = i9 + 1;
                            bArr2[i8] = (byte) (b2 ^ bArr6[i9]);
                        }
                        return i2;
                    }
                    C18073l.ad("output buffer too short");
                }
                return 0;
            case 2:
                if (!this.f27942l) {
                    C8339l.smaato("HC-128 not initialised");
                } else if (i + i2 > bArr.length) {
                    C10754l.ad("input buffer too short");
                } else {
                    if (i3 + i2 <= bArr2.length) {
                        for (int i10 = 0; i10 < i2; i10++) {
                            int i11 = i3 + i10;
                            byte b3 = bArr[i + i10];
                            byte[] bArr7 = this.f27941l;
                            if (this.f27937l == 0) {
                                int iVip = vip();
                                bArr7[0] = (byte) (iVip & 255);
                                bArr7[1] = (byte) ((iVip >> 8) & 255);
                                bArr7[2] = (byte) ((iVip >> 16) & 255);
                                bArr7[3] = (byte) ((iVip >> 24) & 255);
                            }
                            int i12 = this.f27937l;
                            byte b4 = bArr7[i12];
                            this.f27937l = (i12 + 1) & 3;
                            bArr2[i11] = (byte) (b3 ^ b4);
                        }
                        return i2;
                    }
                    C18073l.ad("output buffer too short");
                }
                return 0;
            default:
                if (!this.f27942l) {
                    C8339l.smaato("HC-256 not initialised");
                } else if (i + i2 > bArr.length) {
                    C10754l.ad("input buffer too short");
                } else {
                    if (i3 + i2 <= bArr2.length) {
                        for (int i13 = 0; i13 < i2; i13++) {
                            int i14 = i3 + i13;
                            byte b5 = bArr[i + i13];
                            byte[] bArr8 = this.f27941l;
                            if (this.f27937l == 0) {
                                int iMetrica = metrica();
                                bArr8[0] = (byte) (iMetrica & 255);
                                bArr8[1] = (byte) ((iMetrica >> 8) & 255);
                                bArr8[2] = (byte) ((iMetrica >> 16) & 255);
                                bArr8[3] = (byte) ((iMetrica >> 24) & 255);
                            }
                            int i15 = this.f27937l;
                            byte b6 = bArr8[i15];
                            this.f27937l = (i15 + 1) & 3;
                            bArr2[i14] = (byte) (b5 ^ b6);
                        }
                        return i2;
                    }
                    C18073l.ad("output buffer too short");
                }
                return 0;
        }
    }

    public int purchase() {
        int[] iArr = this.f27940l;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 13) | (i2 << 3);
        int i4 = iArr[2];
        int i5 = (i2 >>> 7) | (i4 << 9);
        int i6 = iArr[3];
        int i7 = (i4 >>> 6) | (i6 << 10);
        int i8 = iArr[4];
        int i9 = (i6 >>> 3) | (i8 << 13);
        return (((i8 << 2) | (i6 >>> 14)) ^ ((((i ^ i3) ^ i5) ^ i7) ^ i9)) & 65535;
    }

    @Override // defpackage.InterfaceC12774l
    public final void reset() {
        switch (this.f27939l) {
            case 0:
                this.f27937l = 4;
                byte[] bArr = this.f27938l;
                byte[] bArr2 = this.f27935l;
                bArr2[12] = -1;
                bArr2[13] = -1;
                bArr2[14] = -1;
                bArr2[15] = -1;
                this.f27938l = bArr;
                this.f27935l = bArr2;
                int i = 0;
                int i2 = 0;
                while (true) {
                    int[] iArr = this.f27943l;
                    if (i >= iArr.length) {
                        for (int i3 = 0; i3 < 8; i3++) {
                            this.f27936l = loadAd();
                            int[] iArr2 = this.f27943l;
                            smaato(iArr2, (billing() ^ this.f27940l[0]) ^ this.f27936l);
                            this.f27943l = iArr2;
                            int[] iArr3 = this.f27940l;
                            smaato(iArr3, amazon() ^ this.f27936l);
                            this.f27940l = iArr3;
                        }
                        this.f27942l = true;
                    } else {
                        byte[] bArr3 = this.f27938l;
                        int i4 = i2 + 3;
                        int i5 = i2 + 2;
                        int i6 = i2 + 1;
                        iArr[i] = (bArr3[i2] & 255) | (bArr3[i4] << 24) | ((bArr3[i5] << 16) & 16711680) | ((bArr3[i6] << 8) & 65280);
                        int[] iArr4 = this.f27940l;
                        byte[] bArr4 = this.f27935l;
                        iArr4[i] = (bArr4[i2] & 255) | (bArr4[i4] << 24) | ((bArr4[i5] << 16) & 16711680) | ((bArr4[i6] << 8) & 65280);
                        i2 += 4;
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                this.f27937l = 2;
                byte[] bArr5 = this.f27938l;
                byte[] bArr6 = this.f27935l;
                bArr6[8] = -1;
                bArr6[9] = -1;
                this.f27938l = bArr5;
                this.f27935l = bArr6;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f27943l;
                    if (i7 >= iArr5.length) {
                        for (int i9 = 0; i9 < 10; i9++) {
                            this.f27936l = crashlytics();
                            int[] iArr6 = this.f27943l;
                            remoteconfig(iArr6, (mopub() ^ this.f27940l[0]) ^ this.f27936l);
                            this.f27943l = iArr6;
                            int[] iArr7 = this.f27940l;
                            remoteconfig(iArr7, purchase() ^ this.f27936l);
                            this.f27940l = iArr7;
                        }
                        this.f27942l = true;
                    } else {
                        byte[] bArr7 = this.f27938l;
                        int i10 = i8 + 1;
                        iArr5[i7] = ((bArr7[i8] & 255) | (bArr7[i10] << 8)) & 65535;
                        int[] iArr8 = this.f27940l;
                        byte[] bArr8 = this.f27935l;
                        iArr8[i7] = ((bArr8[i8] & 255) | (bArr8[i10] << 8)) & 65535;
                        i8 += 2;
                        i7++;
                    }
                    break;
                }
                break;
            case 2:
                admob();
                break;
            default:
                subs();
                break;
        }
    }

    public void subs() {
        String str;
        byte[] bArr = this.f27938l;
        if (bArr.length == 32 || bArr.length == 16) {
            if (this.f27935l.length >= 16) {
                if (bArr.length != 32) {
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    byte[] bArr3 = this.f27938l;
                    System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
                    this.f27938l = bArr2;
                }
                byte[] bArr4 = this.f27935l;
                if (bArr4.length < 32) {
                    byte[] bArr5 = new byte[32];
                    System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                    byte[] bArr6 = this.f27935l;
                    System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
                    this.f27935l = bArr5;
                }
                this.f27937l = 0;
                this.f27936l = 0;
                int[] iArr = new int[2560];
                for (int i = 0; i < 32; i++) {
                    int i2 = i >> 2;
                    iArr[i2] = iArr[i2] | ((this.f27938l[i] & 255) << ((i & 3) * 8));
                }
                for (int i3 = 0; i3 < 32; i3++) {
                    int i4 = (i3 >> 2) + 8;
                    iArr[i4] = iArr[i4] | ((this.f27935l[i3] & 255) << ((i3 & 3) * 8));
                }
                for (int i5 = 16; i5 < 2560; i5++) {
                    int i6 = iArr[i5 - 2];
                    int i7 = iArr[i5 - 15];
                    iArr[i5] = ((i6 >>> 10) ^ (firebase(i6, 17) ^ firebase(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (firebase(i7, 7) ^ firebase(i7, 18))) + iArr[i5 - 16] + i5;
                }
                System.arraycopy(iArr, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, this.f27940l, 0, 1024);
                System.arraycopy(iArr, 1536, this.f27943l, 0, 1024);
                for (int i8 = 0; i8 < 4096; i8++) {
                    metrica();
                }
                this.f27936l = 0;
                return;
            }
            str = "The IV must be at least 128 bits long";
        } else {
            str = "The key must be 128/256 bits long";
        }
        C8339l.metrica(str);
    }

    public int vip() {
        int i;
        int i2;
        int[] iArr = this.f27943l;
        int[] iArr2 = this.f27940l;
        int i3 = this.f27936l;
        int i4 = i3 & 511;
        if (i3 < 512) {
            int i5 = iArr2[i4];
            int i6 = iArr2[yandex(i4, 3)];
            int i7 = iArr2[yandex(i4, 10)];
            iArr2[i4] = isPro(i7, 8) + (isPro(i6, 10) ^ isPro(iArr2[yandex(i4, 511)], 23)) + i5;
            int i8 = iArr2[yandex(i4, 12)];
            i = iArr[i8 & 255] + iArr[((i8 >> 16) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            i2 = iArr2[i4];
        } else {
            int i9 = iArr[i4];
            int i10 = iArr[yandex(i4, 3)];
            int i11 = iArr[yandex(i4, 10)];
            int i12 = iArr[yandex(i4, 511)];
            iArr[i4] = ((i11 >>> (-8)) | (i11 << 8)) + (((i10 >>> (-10)) | (i10 << 10)) ^ ((i12 >>> (-23)) | (i12 << 23))) + i9;
            int i13 = iArr[yandex(i4, 12)];
            i = iArr2[i13 & 255] + iArr2[((i13 >> 16) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            i2 = iArr[i4];
        }
        int i14 = i2 ^ i;
        this.f27936l = (this.f27936l + 1) & 1023;
        return i14;
    }
}
