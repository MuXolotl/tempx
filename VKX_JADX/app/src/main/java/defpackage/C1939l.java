package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lِؓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1939l implements InterfaceC5788l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f4412l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f4413l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC5788l f4414l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public BigInteger f4415l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f4416l = 0;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final BigInteger f4411l = BigInteger.valueOf(16);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final BigInteger f4408l = BigInteger.valueOf(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final byte[] f4409l = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final byte[] f4410l = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public C1939l(InterfaceC5788l interfaceC5788l) {
        this.f4414l = interfaceC5788l;
    }

    @Override // defpackage.InterfaceC5788l
    public final int getInputBlockSize() {
        int inputBlockSize = this.f4414l.getInputBlockSize();
        return this.f4413l ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // defpackage.InterfaceC5788l
    public final int getOutputBlockSize() {
        int outputBlockSize = this.f4414l.getOutputBlockSize();
        return this.f4413l ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    @Override // defpackage.InterfaceC5788l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        C6963l c6963l = interfaceC9719l instanceof C6114l ? (C6963l) ((C6114l) interfaceC9719l).f12903l : (C6963l) interfaceC9719l;
        this.f4414l.init(z, interfaceC9719l);
        BigInteger bigInteger = c6963l.f14630l;
        this.f4415l = bigInteger;
        this.f4412l = bigInteger.bitLength();
        this.f4413l = z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0104  */
    /* JADX WARN: Code duplicated, block: B:35:0x0140  */
    /* JADX WARN: Code duplicated, block: B:37:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x015b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0176 A[LOOP:3: B:43:0x0174->B:44:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0185  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC5788l
    public final byte[] processBlock(byte[] bArr, int i, int i2) throws C10352l {
        byte[] byteArray;
        String str;
        int length;
        int i3;
        boolean z;
        int i4;
        int length2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2 = this.f4413l;
        InterfaceC5788l interfaceC5788l = this.f4414l;
        byte[] bArr2 = f4409l;
        if (z2) {
            int i9 = this.f4412l;
            int i10 = (i9 + 7) / 8;
            byte[] bArr3 = new byte[i10];
            int i11 = this.f4416l + 1;
            int i12 = (i9 + 13) / 16;
            int i13 = 0;
            while (i13 < i12) {
                if (i13 > i12 - i2) {
                    int i14 = i12 - i13;
                    System.arraycopy(bArr, (i + i2) - i14, bArr3, i10 - i12, i14);
                } else {
                    System.arraycopy(bArr, i, bArr3, i10 - (i13 + i2), i2);
                }
                i13 += i2;
            }
            for (int i15 = i10 - (i12 * 2); i15 != i10; i15 += 2) {
                byte b = bArr3[(i15 / 2) + (i10 - i12)];
                bArr3[i15] = (byte) ((bArr2[(b & 255) >>> 4] << 4) | bArr2[b & 15]);
                bArr3[i15 + 1] = b;
            }
            int i16 = i10 - (i2 * 2);
            bArr3[i16] = (byte) (bArr3[i16] ^ i11);
            int i17 = i10 - 1;
            bArr3[i17] = (byte) ((bArr3[i17] << 4) | 6);
            int i18 = 8 - ((this.f4412l - 1) % 8);
            if (i18 != 8) {
                byte b2 = (byte) (bArr3[0] & (255 >>> i18));
                bArr3[0] = b2;
                bArr3[0] = (byte) ((128 >>> i18) | b2);
                i8 = 0;
            } else {
                bArr3[0] = 0;
                bArr3[1] = (byte) (bArr3[1] | 128);
                i8 = 1;
            }
            return interfaceC5788l.processBlock(bArr3, i8, i10 - i8);
        }
        byte[] bArrProcessBlock = interfaceC5788l.processBlock(bArr, i, i2);
        int i19 = (this.f4412l + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrProcessBlock);
        BigInteger bigInteger2 = f4411l;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = f4408l;
        byte[] bArr4 = null;
        if (bigIntegerMod.equals(bigInteger3)) {
            byteArray = bigInteger.toByteArray();
            if (byteArray[0] == 0) {
                int length3 = byteArray.length - 1;
                byte[] bArr5 = new byte[length3];
                System.arraycopy(byteArray, 1, bArr5, 0, length3);
                byteArray = bArr5;
            }
            if ((byteArray[byteArray.length - 1] & 15) == 6) {
                byteArray[byteArray.length - 1] = (byte) (((byteArray[byteArray.length - 1] & 255) >>> 4) | (f4410l[(byteArray[byteArray.length - 2] & 255) >> 4] << 4));
                byte b3 = byteArray[1];
                byteArray[0] = (byte) (bArr2[b3 & 15] | (bArr2[(b3 & 255) >>> 4] << 4));
                i3 = 1;
                z = false;
                i4 = 0;
                for (length = byteArray.length - 1; length >= byteArray.length - (i19 * 2); length -= 2) {
                    byte b4 = byteArray[length];
                    i6 = length - 1;
                    i7 = ((bArr2[b4 & 15] | (bArr2[(b4 & 255) >>> 4] << 4)) ^ byteArray[i6]) & 255;
                    if (i7 == 0) {
                        if (z) {
                            str = "invalid tsums in block";
                        } else {
                            z = true;
                            i3 = i7;
                            i4 = i6;
                        }
                    }
                }
                byteArray[i4] = 0;
                length2 = (byteArray.length - i4) / 2;
                bArr4 = new byte[length2];
                for (i5 = 0; i5 < length2; i5++) {
                    bArr4[i5] = byteArray[(i5 * 2) + i4 + 1];
                }
                this.f4416l = i3 - 1;
            } else {
                str = "invalid forcing byte in block";
            }
            C11467l.remoteconfig(str);
        } else {
            if (this.f4415l.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                bigInteger = this.f4415l.subtract(bigInteger);
                byteArray = bigInteger.toByteArray();
                if (byteArray[0] == 0) {
                    int length4 = byteArray.length - 1;
                    byte[] bArr6 = new byte[length4];
                    System.arraycopy(byteArray, 1, bArr6, 0, length4);
                    byteArray = bArr6;
                }
                if ((byteArray[byteArray.length - 1] & 15) == 6) {
                    byteArray[byteArray.length - 1] = (byte) (((byteArray[byteArray.length - 1] & 255) >>> 4) | (f4410l[(byteArray[byteArray.length - 2] & 255) >> 4] << 4));
                    byte b5 = byteArray[1];
                    byteArray[0] = (byte) (bArr2[b5 & 15] | (bArr2[(b5 & 255) >>> 4] << 4));
                    i3 = 1;
                    z = false;
                    i4 = 0;
                    while (length >= byteArray.length - (i19 * 2)) {
                        byte b6 = byteArray[length];
                        i6 = length - 1;
                        i7 = ((bArr2[b6 & 15] | (bArr2[(b6 & 255) >>> 4] << 4)) ^ byteArray[i6]) & 255;
                        if (i7 == 0) {
                            if (z) {
                                z = true;
                                i3 = i7;
                                i4 = i6;
                            } else {
                                str = "invalid tsums in block";
                            }
                        }
                    }
                    byteArray[i4] = 0;
                    length2 = (byteArray.length - i4) / 2;
                    bArr4 = new byte[length2];
                    while (i5 < length2) {
                        bArr4[i5] = byteArray[(i5 * 2) + i4 + 1];
                    }
                    this.f4416l = i3 - 1;
                } else {
                    str = "invalid forcing byte in block";
                }
            } else {
                str = "resulting integer iS or (modulus - iS) is not congruent to 6 mod 16";
            }
            C11467l.remoteconfig(str);
        }
        return bArr4;
    }
}
