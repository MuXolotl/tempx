package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15587l implements InterfaceC9273l, InterfaceC11512l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final byte[] f30427l = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f30428l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f30429l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC2441l f30430l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f30431l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f30432l;

    public C15587l(C15587l c15587l) {
        this.f30429l = new byte[48];
        this.f30428l = new byte[16];
        this.f30431l = new byte[16];
        this.f30430l = c15587l.f30430l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        amazon(c15587l);
    }

    public final void amazon(C15587l c15587l) {
        byte[] bArr = c15587l.f30429l;
        System.arraycopy(bArr, 0, this.f30429l, 0, bArr.length);
        byte[] bArr2 = c15587l.f30428l;
        System.arraycopy(bArr2, 0, this.f30428l, 0, bArr2.length);
        this.f30432l = c15587l.f30432l;
        byte[] bArr3 = c15587l.f30431l;
        System.arraycopy(bArr3, 0, this.f30431l, 0, bArr3.length);
    }

    public final void billing(byte[] bArr) {
        byte[] bArr2 = this.f30431l;
        byte b = bArr2[15];
        for (int i = 0; i < 16; i++) {
            b = (byte) (f30427l[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = this.f30428l;
        int length = bArr2.length;
        int i2 = this.f30432l;
        byte b = (byte) (length - i2);
        while (i2 < bArr2.length) {
            bArr2[i2] = b;
            i2++;
        }
        billing(bArr2);
        purchase(bArr2);
        purchase(this.f30431l);
        System.arraycopy(this.f30429l, 0, bArr, i, 16);
        reset();
        return 16;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "MD2";
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return 16;
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 16;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        amazon((C15587l) interfaceC11512l);
    }

    public final void purchase(byte[] bArr) {
        byte[] bArr2;
        int i = 0;
        while (true) {
            bArr2 = this.f30429l;
            if (i >= 16) {
                break;
            }
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte b = (byte) (f30427l[i2] ^ bArr2[i4]);
                bArr2[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f30429l;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.f30432l = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f30428l;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f30431l;
            if (i3 == bArr3.length) {
                return;
            }
            bArr3[i3] = 0;
            i3++;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        while (this.f30432l != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 >= 16) {
            byte[] bArr2 = this.f30428l;
            System.arraycopy(bArr, i, bArr2, 0, 16);
            billing(bArr2);
            purchase(bArr2);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C15587l(this);
    }

    public C15587l(EnumC2441l enumC2441l) {
        this.f30429l = new byte[48];
        this.f30428l = new byte[16];
        this.f30431l = new byte[16];
        this.f30430l = enumC2441l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    public C15587l() {
        this(EnumC2441l.f5219l);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f30432l;
        int i2 = i + 1;
        this.f30432l = i2;
        byte[] bArr = this.f30428l;
        bArr[i] = b;
        if (i2 == 16) {
            billing(bArr);
            purchase(bArr);
            this.f30432l = 0;
        }
    }
}
