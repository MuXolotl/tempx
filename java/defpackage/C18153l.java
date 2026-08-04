package defpackage;

import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: renamed from: lٜ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18153l implements InterfaceC14091l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final byte f35540l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC16922l f35541l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f35542l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f35543l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC16922l f35544l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC16922l f35545l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final byte[] f35546l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public SecureRandom f35547l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC5788l f35548l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public byte[] f35549l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f35550l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f35551l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final byte[] f35552l;

    public C18153l(InterfaceC5788l interfaceC5788l, InterfaceC16922l interfaceC16922l, InterfaceC16922l interfaceC16922l2, int i, byte b) {
        this.f35548l = interfaceC5788l;
        this.f35545l = interfaceC16922l;
        this.f35544l = interfaceC16922l;
        this.f35541l = interfaceC16922l2;
        int digestSize = interfaceC16922l.getDigestSize();
        this.f35551l = digestSize;
        this.f35542l = interfaceC16922l2.getDigestSize();
        this.f35543l = i;
        this.f35546l = new byte[i];
        this.f35552l = new byte[i + 8 + digestSize];
        this.f35540l = b;
    }

    public static void amazon(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    public static void yandex(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    @Override // defpackage.InterfaceC14091l
    public final byte[] crashlytics() {
        InterfaceC16922l interfaceC16922l = this.f35545l;
        int digestSize = interfaceC16922l.getDigestSize();
        int i = this.f35551l;
        if (digestSize != i) {
            C18073l.admob();
            return null;
        }
        byte[] bArr = this.f35552l;
        int length = bArr.length - i;
        int i2 = this.f35543l;
        interfaceC16922l.doFinal(bArr, length - i2);
        byte[] bArr2 = this.f35546l;
        if (i2 != 0) {
            this.f35547l.nextBytes(bArr2);
            System.arraycopy(bArr2, 0, bArr, bArr.length - i2, i2);
        }
        byte[] bArr3 = new byte[i];
        int length2 = bArr.length;
        InterfaceC16922l interfaceC16922l2 = this.f35544l;
        interfaceC16922l2.update(bArr, 0, length2);
        interfaceC16922l2.doFinal(bArr3, 0);
        byte[] bArr4 = this.f35549l;
        bArr4[(((bArr4.length - i2) - 1) - i) - 1] = 1;
        System.arraycopy(bArr2, 0, bArr4, ((bArr4.length - i2) - i) - 1, i2);
        byte[] bArrPurchase = purchase(bArr3, 0, i, (this.f35549l.length - i) - 1);
        int i3 = 0;
        while (true) {
            int length3 = bArrPurchase.length;
            byte[] bArr5 = this.f35549l;
            if (i3 == length3) {
                System.arraycopy(bArr3, 0, bArr5, (bArr5.length - i) - 1, i);
                byte[] bArr6 = this.f35549l;
                bArr6[0] = (byte) ((255 >>> ((bArr6.length * 8) - this.f35550l)) & bArr6[0]);
                bArr6[bArr6.length - 1] = this.f35540l;
                byte[] bArrProcessBlock = this.f35548l.processBlock(bArr6, 0, bArr6.length);
                amazon(this.f35549l);
                return bArrProcessBlock;
            }
            bArr5[i3] = (byte) (bArr5[i3] ^ bArrPurchase[i3]);
            i3++;
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (interfaceC9719l instanceof C6114l) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            InterfaceC9719l interfaceC9719l2 = c6114l.f12903l;
            this.f35547l = c6114l.f12904l;
            interfaceC9719l = interfaceC9719l2;
        } else if (z) {
            this.f35547l = AbstractC8776l.loadAd();
        }
        this.f35548l.init(z, interfaceC9719l);
        int iBitLength = ((C6963l) interfaceC9719l).f14630l.bitLength();
        int i = iBitLength - 1;
        this.f35550l = i;
        if (i < (this.f35543l * 8) + (this.f35551l * 8) + 9) {
            C8339l.metrica("key too small for specified hash and salt lengths");
        } else {
            this.f35549l = new byte[(iBitLength + 6) / 8];
            this.f35545l.reset();
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final boolean loadAd(byte[] bArr) {
        byte[] bArr2;
        InterfaceC16922l interfaceC16922l = this.f35545l;
        int digestSize = interfaceC16922l.getDigestSize();
        int i = this.f35551l;
        if (digestSize != i) {
            C18073l.admob();
            return false;
        }
        byte[] bArr3 = this.f35552l;
        int length = bArr3.length - i;
        int i2 = this.f35543l;
        interfaceC16922l.doFinal(bArr3, length - i2);
        try {
            byte[] bArrProcessBlock = this.f35548l.processBlock(bArr, 0, bArr.length);
            byte[] bArr4 = this.f35549l;
            Arrays.fill(bArr4, 0, bArr4.length - bArrProcessBlock.length, (byte) 0);
            byte[] bArr5 = this.f35549l;
            System.arraycopy(bArrProcessBlock, 0, bArr5, bArr5.length - bArrProcessBlock.length, bArrProcessBlock.length);
            byte[] bArr6 = this.f35549l;
            int length2 = 255 >>> ((bArr6.length * 8) - this.f35550l);
            byte b = bArr6[0];
            if ((b & 255) != (b & length2) || bArr6[bArr6.length - 1] != this.f35540l) {
                amazon(bArr6);
                return false;
            }
            byte[] bArrPurchase = purchase(bArr6, (bArr6.length - i) - 1, i, (bArr6.length - i) - 1);
            int i3 = 0;
            while (true) {
                int length3 = bArrPurchase.length;
                bArr2 = this.f35549l;
                if (i3 == length3) {
                    break;
                }
                bArr2[i3] = (byte) (bArr2[i3] ^ bArrPurchase[i3]);
                i3++;
            }
            bArr2[0] = (byte) (bArr2[0] & length2);
            int i4 = 0;
            while (true) {
                byte[] bArr7 = this.f35549l;
                if (i4 == ((bArr7.length - i) - i2) - 2) {
                    if (bArr7[((bArr7.length - i) - i2) - 2] != 1) {
                        amazon(bArr7);
                        return false;
                    }
                    System.arraycopy(bArr7, ((bArr7.length - i2) - i) - 1, bArr3, bArr3.length - i2, i2);
                    int length4 = bArr3.length;
                    InterfaceC16922l interfaceC16922l2 = this.f35544l;
                    interfaceC16922l2.update(bArr3, 0, length4);
                    interfaceC16922l2.doFinal(bArr3, bArr3.length - i);
                    int length5 = (this.f35549l.length - i) - 1;
                    for (int length6 = bArr3.length - i; length6 != bArr3.length; length6++) {
                        if ((this.f35549l[length5] ^ bArr3[length6]) != 0) {
                            amazon(bArr3);
                            amazon(this.f35549l);
                            return false;
                        }
                        length5++;
                    }
                    amazon(bArr3);
                    amazon(this.f35549l);
                    return true;
                }
                if (bArr7[i4] != 0) {
                    amazon(bArr7);
                    return false;
                }
                i4++;
            }
        } catch (Exception unused) {
        }
    }

    public final byte[] purchase(byte[] bArr, int i, int i2, int i3) {
        InterfaceC16922l interfaceC16922l = this.f35541l;
        if (interfaceC16922l instanceof InterfaceC0363l) {
            byte[] bArr2 = new byte[i3];
            interfaceC16922l.update(bArr, i, i2);
            ((InterfaceC0363l) interfaceC16922l).crashlytics(0, i3, bArr2);
            return bArr2;
        }
        byte[] bArr3 = new byte[i3];
        int i4 = this.f35542l;
        byte[] bArr4 = new byte[i4];
        byte[] bArr5 = new byte[4];
        interfaceC16922l.reset();
        int i5 = 0;
        while (i5 < i3 / i4) {
            yandex(i5, bArr5);
            interfaceC16922l.update(bArr, i, i2);
            interfaceC16922l.update(bArr5, 0, 4);
            interfaceC16922l.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i5 * i4, i4);
            i5++;
        }
        int i6 = i4 * i5;
        if (i6 < i3) {
            yandex(i5, bArr5);
            interfaceC16922l.update(bArr, i, i2);
            interfaceC16922l.update(bArr5, 0, 4);
            interfaceC16922l.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i6, i3 - i6);
        }
        return bArr3;
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte b) {
        this.f35545l.update(b);
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte[] bArr, int i, int i2) {
        this.f35545l.update(bArr, i, i2);
    }
}
