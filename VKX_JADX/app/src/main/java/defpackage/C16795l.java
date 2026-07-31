package defpackage;

/* JADX INFO: renamed from: lٖۧۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16795l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f32817l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f32818l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f32819l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f32820l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f32821l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC10952l f32822l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f32823l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f32824l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32825l;

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return this.f32822l.getAlgorithmName().concat(this.f32824l ? "/PGPCFBwithIV" : "/PGPCFB");
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        InterfaceC10952l interfaceC10952l = this.f32822l;
        byte[] bArr = this.f32821l;
        this.f32819l = z;
        if (!(interfaceC9719l instanceof C0272l)) {
            reset();
            interfaceC10952l.init(true, interfaceC9719l);
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr2 = c0272l.f1273l;
        if (bArr2.length < bArr.length) {
            System.arraycopy(bArr2, 0, bArr, bArr.length - bArr2.length, bArr2.length);
            for (int i = 0; i < bArr.length - bArr2.length; i++) {
                bArr[i] = 0;
            }
        } else {
            System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        }
        reset();
        interfaceC10952l.init(true, c0272l.f1272l);
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f32822l.license();
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        this.f32825l = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f32820l;
            if (i == bArr.length) {
                this.f32822l.reset();
                return;
            }
            if (this.f32824l) {
                bArr[i] = 0;
            } else {
                bArr[i] = this.f32821l[i];
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f32820l;
        int i3 = this.f32818l;
        InterfaceC10952l interfaceC10952l = this.f32822l;
        byte[] bArr4 = this.f32817l;
        boolean z = this.f32824l;
        boolean z2 = this.f32819l;
        int i4 = 0;
        if (!z) {
            if (z2) {
                if (i + i3 > bArr.length) {
                    C10754l.ad("input buffer too short");
                    return 0;
                }
                if (i2 + i3 > bArr2.length) {
                    C18073l.ad("output buffer too short");
                    return 0;
                }
                interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                for (int i5 = 0; i5 < i3; i5++) {
                    bArr2[i2 + i5] = yandex(bArr[i + i5], i5);
                }
                while (i4 < i3) {
                    bArr3[i4] = bArr2[i2 + i4];
                    i4++;
                }
                return i3;
            }
            if (i + i3 > bArr.length) {
                C10754l.ad("input buffer too short");
                return 0;
            }
            if (i2 + i3 > bArr2.length) {
                C18073l.ad("output buffer too short");
                return 0;
            }
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            for (int i6 = 0; i6 < i3; i6++) {
                bArr2[i2 + i6] = yandex(bArr[i + i6], i6);
            }
            while (i4 < i3) {
                bArr3[i4] = bArr[i + i4];
                i4++;
            }
            return i3;
        }
        if (z2) {
            byte[] bArr5 = this.f32821l;
            if (i + i3 > bArr.length) {
                C10754l.ad("input buffer too short");
                return 0;
            }
            int i7 = this.f32825l;
            if (i7 != 0) {
                if (i7 < i3 + 2) {
                    return i3;
                }
                if (i2 + i3 > bArr2.length) {
                    C18073l.ad("output buffer too short");
                    return 0;
                }
                interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                for (int i8 = 0; i8 < i3; i8++) {
                    bArr2[i2 + i8] = yandex(bArr[i + i8], i8);
                }
                System.arraycopy(bArr2, i2, bArr3, 0, i3);
                return i3;
            }
            int i9 = i3 * 2;
            if (i9 + i2 + 2 > bArr2.length) {
                C18073l.ad("output buffer too short");
                return 0;
            }
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            for (int i10 = 0; i10 < i3; i10++) {
                bArr2[i2 + i10] = yandex(bArr5[i10], i10);
            }
            System.arraycopy(bArr2, i2, bArr3, 0, i3);
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            int i11 = i2 + i3;
            bArr2[i11] = yandex(bArr5[i3 - 2], 0);
            bArr2[i11 + 1] = yandex(bArr5[i3 - 1], 1);
            System.arraycopy(bArr2, i2 + 2, bArr3, 0, i3);
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            for (int i12 = 0; i12 < i3; i12++) {
                bArr2[i11 + 2 + i12] = yandex(bArr[i + i12], i12);
            }
            System.arraycopy(bArr2, i11 + 2, bArr3, 0, i3);
            int i13 = i9 + 2;
            this.f32825l += i13;
            return i13;
        }
        byte[] bArr6 = this.f32823l;
        if (i + i3 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + i3 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        int i14 = this.f32825l;
        if (i14 == 0) {
            for (int i15 = 0; i15 < i3; i15++) {
                bArr3[i15] = bArr[i + i15];
            }
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            this.f32825l += i3;
            return 0;
        }
        if (i14 == i3) {
            System.arraycopy(bArr, i, bArr6, 0, i3);
            int i16 = i3 - 2;
            System.arraycopy(bArr3, 2, bArr3, 0, i16);
            bArr3[i16] = bArr6[0];
            bArr3[i3 - 1] = bArr6[1];
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            for (int i17 = 0; i17 < i16; i17++) {
                bArr2[i2 + i17] = yandex(bArr6[i17 + 2], i17);
            }
            System.arraycopy(bArr6, 2, bArr3, 0, i16);
            this.f32825l += 2;
            return i16;
        }
        if (i14 >= i3 + 2) {
            System.arraycopy(bArr, i, bArr6, 0, i3);
            int i18 = i3 - 2;
            bArr2[i2] = yandex(bArr6[0], i18);
            bArr2[i2 + 1] = yandex(bArr6[1], i3 - 1);
            System.arraycopy(bArr6, 0, bArr3, i18, 2);
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            for (int i19 = 0; i19 < i18; i19++) {
                bArr2[i2 + i19 + 2] = yandex(bArr6[i19 + 2], i19);
            }
            System.arraycopy(bArr6, 2, bArr3, 0, i18);
        }
        return i3;
    }

    public final byte yandex(byte b, int i) {
        return (byte) (this.f32817l[i] ^ b);
    }
}
