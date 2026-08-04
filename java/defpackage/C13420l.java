package defpackage;

/* JADX INFO: renamed from: lْٖۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13420l implements InterfaceC14091l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f26324l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f26325l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte[] f26326l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC5788l f26327l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC16922l f26328l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f26329l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f26330l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f26331l;

    public static void yandex(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    public final void amazon(byte[] bArr) {
        this.f26325l = 0;
        yandex(this.f26331l);
        yandex(bArr);
    }

    @Override // defpackage.InterfaceC14091l
    public final byte[] crashlytics() {
        int i;
        int length;
        int i2;
        int i3;
        byte[] bArr;
        InterfaceC16922l interfaceC16922l = this.f26328l;
        int digestSize = interfaceC16922l.getDigestSize();
        int i4 = this.f26324l;
        byte[] bArr2 = this.f26329l;
        if (i4 == 188) {
            length = (bArr2.length - digestSize) - 1;
            interfaceC16922l.doFinal(bArr2, length);
            byte[] bArr3 = this.f26329l;
            bArr3[bArr3.length - 1] = -68;
            i = 8;
        } else {
            int length2 = (bArr2.length - digestSize) - 2;
            interfaceC16922l.doFinal(bArr2, length2);
            byte[] bArr4 = this.f26329l;
            bArr4[bArr4.length - 2] = (byte) (i4 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i4;
            i = 16;
            length = length2;
        }
        int i5 = this.f26325l;
        int i6 = ((((digestSize + i5) * 8) + i) + 4) - this.f26330l;
        byte[] bArr5 = this.f26331l;
        byte[] bArr6 = this.f26329l;
        if (i6 > 0) {
            int i7 = i5 - ((i6 + 7) / 8);
            i2 = length - i7;
            System.arraycopy(bArr5, 0, bArr6, i2, i7);
            this.f26326l = new byte[i7];
            i3 = 96;
        } else {
            i2 = length - i5;
            System.arraycopy(bArr5, 0, bArr6, i2, i5);
            this.f26326l = new byte[this.f26325l];
            i3 = 64;
        }
        int i8 = i2 - 1;
        if (i8 > 0) {
            int i9 = i8;
            while (true) {
                bArr = this.f26329l;
                if (i9 == 0) {
                    break;
                }
                bArr[i9] = -69;
                i9--;
            }
            bArr[i8] = (byte) (bArr[i8] ^ 1);
            bArr[0] = 11;
            bArr[0] = (byte) (i3 | 11);
        } else {
            byte[] bArr7 = this.f26329l;
            bArr7[0] = 10;
            bArr7[0] = (byte) (i3 | 10);
        }
        InterfaceC5788l interfaceC5788l = this.f26327l;
        byte[] bArr8 = this.f26329l;
        byte[] bArrProcessBlock = interfaceC5788l.processBlock(bArr8, 0, bArr8.length);
        byte[] bArr9 = this.f26331l;
        byte[] bArr10 = this.f26326l;
        System.arraycopy(bArr9, 0, bArr10, 0, bArr10.length);
        this.f26325l = 0;
        yandex(this.f26331l);
        yandex(this.f26329l);
        return bArrProcessBlock;
    }

    @Override // defpackage.InterfaceC14091l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        C6963l c6963l = (C6963l) interfaceC9719l;
        this.f26327l.init(z, c6963l);
        int iBitLength = c6963l.f14630l.bitLength();
        this.f26330l = iBitLength;
        int i = (iBitLength + 7) / 8;
        this.f26329l = new byte[i];
        int i2 = this.f26324l;
        InterfaceC16922l interfaceC16922l = this.f26328l;
        if (i2 == 188) {
            this.f26331l = new byte[(i - interfaceC16922l.getDigestSize()) - 2];
        } else {
            this.f26331l = new byte[(i - interfaceC16922l.getDigestSize()) - 3];
        }
        interfaceC16922l.reset();
        this.f26325l = 0;
        yandex(this.f26331l);
        byte[] bArr = this.f26326l;
        if (bArr != null) {
            yandex(bArr);
        }
        this.f26326l = null;
    }

    @Override // defpackage.InterfaceC14091l
    public final boolean loadAd(byte[] bArr) {
        int i;
        boolean z;
        InterfaceC16922l interfaceC16922l = this.f26328l;
        try {
            byte[] bArrProcessBlock = this.f26327l.processBlock(bArr, 0, bArr.length);
            if (((bArrProcessBlock[0] & 192) ^ 64) != 0) {
                amazon(bArrProcessBlock);
                return false;
            }
            if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
                amazon(bArrProcessBlock);
                return false;
            }
            if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                i = 2;
                int i2 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
                Integer num = (Integer) AbstractC14898l.yandex.get(interfaceC16922l.getAlgorithmName());
                if (num == null) {
                    C8339l.metrica("unrecognised hash in signature");
                    return false;
                }
                int iIntValue = num.intValue();
                if (i2 != iIntValue && (iIntValue != 15052 || i2 != 16588)) {
                    C8339l.smaato(AbstractC0653l.vip(i2, "signer initialised with wrong digest for trailer "));
                    return false;
                }
            }
            int i3 = 0;
            while (i3 != bArrProcessBlock.length && ((bArrProcessBlock[i3] & 15) ^ 10) != 0) {
                i3++;
            }
            int i4 = i3 + 1;
            int digestSize = interfaceC16922l.getDigestSize();
            byte[] bArr2 = new byte[digestSize];
            int length = (bArrProcessBlock.length - i) - digestSize;
            int i5 = length - i4;
            if (i5 <= 0) {
                amazon(bArrProcessBlock);
                return false;
            }
            if ((bArrProcessBlock[0] & 32) != 0) {
                interfaceC16922l.doFinal(bArr2, 0);
                boolean z2 = true;
                for (int i6 = 0; i6 != digestSize; i6++) {
                    int i7 = length + i6;
                    byte b = (byte) (bArrProcessBlock[i7] ^ bArr2[i6]);
                    bArrProcessBlock[i7] = b;
                    if (b != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    amazon(bArrProcessBlock);
                    return false;
                }
                byte[] bArr3 = new byte[i5];
                this.f26326l = bArr3;
                System.arraycopy(bArrProcessBlock, i4, bArr3, 0, i5);
            } else {
                if (this.f26325l > i5) {
                    amazon(bArrProcessBlock);
                    return false;
                }
                interfaceC16922l.reset();
                interfaceC16922l.update(bArrProcessBlock, i4, i5);
                interfaceC16922l.doFinal(bArr2, 0);
                boolean z3 = true;
                for (int i8 = 0; i8 != digestSize; i8++) {
                    int i9 = length + i8;
                    byte b2 = (byte) (bArrProcessBlock[i9] ^ bArr2[i8]);
                    bArrProcessBlock[i9] = b2;
                    if (b2 != 0) {
                        z3 = false;
                    }
                }
                if (!z3) {
                    amazon(bArrProcessBlock);
                    return false;
                }
                byte[] bArr4 = new byte[i5];
                this.f26326l = bArr4;
                System.arraycopy(bArrProcessBlock, i4, bArr4, 0, i5);
            }
            int i10 = this.f26325l;
            if (i10 != 0) {
                byte[] bArr5 = this.f26331l;
                byte[] bArr6 = this.f26326l;
                if (i10 > bArr5.length) {
                    z = bArr5.length <= bArr6.length;
                    for (int i11 = 0; i11 != this.f26331l.length; i11++) {
                        if (bArr5[i11] != bArr6[i11]) {
                            z = false;
                        }
                    }
                } else {
                    z = i10 == bArr6.length;
                    for (int i12 = 0; i12 != bArr6.length; i12++) {
                        if (bArr5[i12] != bArr6[i12]) {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    amazon(bArrProcessBlock);
                    return false;
                }
            }
            yandex(this.f26331l);
            yandex(bArrProcessBlock);
            this.f26325l = 0;
            return true;
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.f26325l < this.f26331l.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.f26328l.update(bArr, i, i2);
        this.f26325l += i2;
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte b) {
        this.f26328l.update(b);
        int i = this.f26325l;
        byte[] bArr = this.f26331l;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.f26325l = i + 1;
    }
}
