package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6834l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f14281l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public byte[] f14282l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte f14283l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte f14284l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte f14285l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public byte f14286l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f14287l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte f14288l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte f14289l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f14290l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public byte f14291l;

    @Override // defpackage.InterfaceC2232l
    public final int doFinal(byte[] bArr, int i) {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.f14281l;
            byte b = this.f14288l;
            byte b2 = this.f14284l;
            int i3 = b2 & 255;
            byte b3 = bArr2[(b + bArr2[i3]) & 255];
            this.f14288l = b3;
            byte b4 = this.f14291l;
            byte b5 = this.f14286l;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.f14291l = b6;
            byte b7 = this.f14289l;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.f14286l = b8;
            byte b9 = this.f14283l;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.f14289l = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.f14283l = b11;
            byte[] bArr3 = this.f14287l;
            byte b12 = this.f14285l;
            int i4 = b12 & 31;
            bArr3[i4] = (byte) (b11 ^ bArr3[i4]);
            int i5 = (b12 + 1) & 31;
            bArr3[i5] = (byte) (b10 ^ bArr3[i5]);
            int i6 = (b12 + 2) & 31;
            bArr3[i6] = (byte) (b8 ^ bArr3[i6]);
            int i7 = (b12 + 3) & 31;
            bArr3[i7] = (byte) (b6 ^ bArr3[i7]);
            this.f14285l = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[i3];
            int i8 = b3 & 255;
            bArr2[i3] = bArr2[i8];
            bArr2[i8] = b13;
            this.f14284l = (byte) ((b2 + 1) & 255);
        }
        for (int i9 = 0; i9 < 768; i9++) {
            byte[] bArr4 = this.f14281l;
            byte b14 = this.f14288l;
            int i10 = i9 & 255;
            byte b15 = bArr4[i10];
            byte b16 = bArr4[(b14 + b15 + this.f14287l[i9 & 31]) & 255];
            this.f14288l = b16;
            int i11 = b16 & 255;
            bArr4[i10] = bArr4[i11];
            bArr4[i11] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i12 = 0; i12 < 20; i12++) {
            byte[] bArr6 = this.f14281l;
            int i13 = i12 & 255;
            byte b17 = bArr6[(this.f14288l + bArr6[i13]) & 255];
            this.f14288l = b17;
            int i14 = b17 & 255;
            bArr5[i12] = bArr6[(bArr6[bArr6[i14] & 255] + 1) & 255];
            byte b18 = bArr6[i13];
            bArr6[i13] = bArr6[i14];
            bArr6[i14] = b18;
        }
        System.arraycopy(bArr5, 0, bArr, 0, 20);
        reset();
        return 20;
    }

    @Override // defpackage.InterfaceC2232l
    public final String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // defpackage.InterfaceC2232l
    public final int getMacSize() {
        return 20;
    }

    @Override // defpackage.InterfaceC2232l
    public final void init(InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica("VMPC-MAC Init parameters must include an IV");
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
        C13886l c13886l = (C13886l) interfaceC9719l2;
        if (!(interfaceC9719l2 instanceof C13886l)) {
            C8339l.metrica("VMPC-MAC Init parameters must include a key");
            return;
        }
        byte[] bArr = c0272l.f1273l;
        this.f14290l = bArr;
        if (bArr == null || bArr.length < 1 || bArr.length > 768) {
            C8339l.metrica("VMPC-MAC requires 1 to 768 bytes of IV");
        } else {
            this.f14282l = c13886l.f27156l;
            reset();
        }
    }

    @Override // defpackage.InterfaceC2232l
    public final void reset() {
        byte[] bArr = this.f14282l;
        byte[] bArr2 = this.f14290l;
        this.f14288l = (byte) 0;
        this.f14281l = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            this.f14281l[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f14281l;
            byte b = this.f14288l;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.f14288l = b3;
            int i4 = b3 & 255;
            bArr3[i3] = bArr3[i4];
            bArr3[i4] = b2;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.f14281l;
            byte b4 = this.f14288l;
            int i6 = i5 & 255;
            byte b5 = bArr4[i6];
            byte b6 = bArr4[(b4 + b5 + bArr2[i5 % bArr2.length]) & 255];
            this.f14288l = b6;
            int i7 = b6 & 255;
            bArr4[i6] = bArr4[i7];
            bArr4[i7] = b5;
        }
        this.f14284l = (byte) 0;
        this.f14291l = (byte) 0;
        this.f14286l = (byte) 0;
        this.f14289l = (byte) 0;
        this.f14283l = (byte) 0;
        this.f14285l = (byte) 0;
        this.f14287l = new byte[32];
        for (int i8 = 0; i8 < 32; i8++) {
            this.f14287l[i8] = 0;
        }
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte b) {
        byte[] bArr = this.f14281l;
        byte b2 = this.f14288l;
        byte b3 = this.f14284l;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.f14288l = b4;
        byte b5 = (byte) (b ^ bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255]);
        byte b6 = this.f14291l;
        byte b7 = this.f14286l;
        byte b8 = bArr[(b6 + b7) & 255];
        this.f14291l = b8;
        byte b9 = this.f14289l;
        byte b10 = bArr[(b7 + b9) & 255];
        this.f14286l = b10;
        byte b11 = this.f14283l;
        byte b12 = bArr[(b9 + b11) & 255];
        this.f14289l = b12;
        byte b13 = bArr[(b11 + b4 + b5) & 255];
        this.f14283l = b13;
        byte[] bArr2 = this.f14287l;
        byte b14 = this.f14285l;
        bArr2[b14 & 31] = (byte) (b13 ^ bArr2[b14 & 31]);
        bArr2[(b14 + 1) & 31] = (byte) (b12 ^ bArr2[(b14 + 1) & 31]);
        bArr2[(b14 + 2) & 31] = (byte) (b10 ^ bArr2[(b14 + 2) & 31]);
        bArr2[(b14 + 3) & 31] = (byte) (b8 ^ bArr2[(b14 + 3) & 31]);
        this.f14285l = (byte) ((b14 + 4) & 31);
        byte b15 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b15;
        this.f14284l = (byte) ((b3 + 1) & 255);
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            C10754l.ad("input buffer too short");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
