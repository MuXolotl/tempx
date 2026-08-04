package defpackage;

/* JADX INFO: renamed from: lٕۤؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16025l implements InterfaceC10952l, InterfaceC7882l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final byte[] f31406l = {-128, 27, 54, 108, -40, -85, 77, -102, 47, 94, -68, 99, -58, -105, 53, 106, -44};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f31407l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f31408l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f31409l;

    public C16025l() {
        this.f31407l = new int[4];
        this.f31409l = false;
    }

    @Override // defpackage.InterfaceC7882l
    public InterfaceC14356l admob(InterfaceC14356l interfaceC14356l) {
        AbstractC8859l abstractC8859l = (AbstractC8859l) this.f31407l;
        C2772l c2772l = interfaceC14356l instanceof C2772l ? (C2772l) interfaceC14356l : null;
        if (c2772l == null) {
            c2772l = new C2772l();
            c2772l.yandex = false;
            c2772l.loadAd = false;
            c2772l.crashlytics = false;
        }
        if (!c2772l.yandex) {
            if (!c2772l.loadAd) {
                if (!this.f31409l && !abstractC8859l.ads()) {
                    c2772l.yandex = true;
                    return c2772l;
                }
                c2772l.loadAd = true;
            }
            if (this.f31408l && !c2772l.crashlytics) {
                if (!abstractC8859l.subscription()) {
                    c2772l.yandex = true;
                    return c2772l;
                }
                c2772l.crashlytics = true;
            }
        }
        return c2772l;
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        int[] iArr = (int[]) this.f31407l;
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to Noekeon init - ", interfaceC9719l));
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        if (bArr.length != 16) {
            C8339l.metrica("Key length not 128 bits.");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = AbstractC10000l.yandex(i, bArr);
            i += 4;
        }
        if (!z) {
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            int i7 = i3 ^ i5;
            int iRotateLeft = i7 ^ (Integer.rotateLeft(i7, 8) ^ Integer.rotateLeft(i7, 24));
            int i8 = i4 ^ i6;
            int iRotateLeft2 = (Integer.rotateLeft(i8, 8) ^ Integer.rotateLeft(i8, 24)) ^ i8;
            iArr[0] = i3 ^ iRotateLeft2;
            iArr[1] = i4 ^ iRotateLeft;
            iArr[2] = i5 ^ iRotateLeft2;
            iArr[3] = i6 ^ iRotateLeft;
        }
        this.f31408l = z;
        this.f31409l = true;
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 16;
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = (int[]) this.f31407l;
        if (!this.f31409l) {
            C8339l.smaato("Noekeon not initialised");
            return 0;
        }
        if (i > bArr.length - 16) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 > bArr2.length - 16) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        boolean z = this.f31408l;
        byte[] bArr3 = f31406l;
        int i3 = 0;
        int i4 = 8;
        if (z) {
            int iYandex = AbstractC10000l.yandex(i, bArr);
            int iYandex2 = AbstractC10000l.yandex(i + 4, bArr);
            int iYandex3 = AbstractC10000l.yandex(i + 8, bArr);
            int iYandex4 = AbstractC10000l.yandex(i + 12, bArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            while (true) {
                int i9 = iYandex ^ (bArr3[i3] & 255);
                int i10 = i9 ^ iYandex3;
                int iRotateLeft = i10 ^ (Integer.rotateLeft(i10, 8) ^ Integer.rotateLeft(i10, 24));
                int i11 = iYandex2 ^ i6;
                int i12 = iYandex3 ^ i7;
                int i13 = iYandex4 ^ i8;
                int i14 = i11 ^ i13;
                int iRotateLeft2 = i14 ^ (Integer.rotateLeft(i14, 8) ^ Integer.rotateLeft(i14, 24));
                int i15 = (i9 ^ i5) ^ iRotateLeft2;
                int i16 = i11 ^ iRotateLeft;
                int i17 = i12 ^ iRotateLeft2;
                int i18 = i13 ^ iRotateLeft;
                int i19 = i3 + 1;
                if (i19 > 16) {
                    AbstractC10000l.isPro(i15, i2, bArr2);
                    AbstractC10000l.isPro(i16, i2 + 4, bArr2);
                    AbstractC10000l.isPro(i17, i2 + 8, bArr2);
                    AbstractC10000l.isPro(i18, i2 + 12, bArr2);
                    return 16;
                }
                int iRotateLeft3 = Integer.rotateLeft(i16, 1);
                int iRotateLeft4 = Integer.rotateLeft(i17, 5);
                int iRotateLeft5 = Integer.rotateLeft(i18, 2);
                int i20 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
                int i21 = ~i20;
                int i22 = i15 ^ (iRotateLeft4 & i21);
                int i23 = (iRotateLeft4 ^ (i21 ^ iRotateLeft5)) ^ i22;
                int i24 = i20 ^ (i22 | i23);
                int i25 = iRotateLeft5 ^ (i23 & i24);
                int iRotateLeft6 = Integer.rotateLeft(i24, 31);
                int iRotateLeft7 = Integer.rotateLeft(i23, 27);
                iYandex4 = Integer.rotateLeft(i22, 30);
                iYandex = i25;
                i3 = i19;
                iYandex3 = iRotateLeft7;
                iYandex2 = iRotateLeft6;
            }
        } else {
            int iYandex5 = AbstractC10000l.yandex(i, bArr);
            int iYandex6 = AbstractC10000l.yandex(i + 4, bArr);
            int iYandex7 = AbstractC10000l.yandex(i + 8, bArr);
            int iYandex8 = AbstractC10000l.yandex(i + 12, bArr);
            int i26 = iArr[0];
            int i27 = iArr[1];
            int i28 = iArr[2];
            int i29 = iArr[3];
            int i30 = 16;
            while (true) {
                int i31 = iYandex5 ^ iYandex7;
                int iRotateLeft8 = i31 ^ (Integer.rotateLeft(i31, i4) ^ Integer.rotateLeft(i31, 24));
                int i32 = iYandex6 ^ i27;
                int i33 = iYandex8 ^ i29;
                int i34 = i32 ^ i33;
                int iRotateLeft9 = i34 ^ (Integer.rotateLeft(i34, i4) ^ Integer.rotateLeft(i34, 24));
                int i35 = i32 ^ iRotateLeft8;
                int i36 = (iYandex7 ^ i28) ^ iRotateLeft9;
                int i37 = i33 ^ iRotateLeft8;
                int i38 = ((iYandex5 ^ i26) ^ iRotateLeft9) ^ (bArr3[i30] & 255);
                i30--;
                if (i30 < 0) {
                    AbstractC10000l.isPro(i38, i2, bArr2);
                    AbstractC10000l.isPro(i35, i2 + 4, bArr2);
                    AbstractC10000l.isPro(i36, i2 + 8, bArr2);
                    AbstractC10000l.isPro(i37, i2 + 12, bArr2);
                    return 16;
                }
                int iRotateLeft10 = Integer.rotateLeft(i35, 1);
                int iRotateLeft11 = Integer.rotateLeft(i36, 5);
                int iRotateLeft12 = Integer.rotateLeft(i37, 2);
                int i39 = iRotateLeft10 ^ (iRotateLeft12 | iRotateLeft11);
                int i40 = ~i39;
                int i41 = i38 ^ (iRotateLeft11 & i40);
                int i42 = (iRotateLeft11 ^ (i40 ^ iRotateLeft12)) ^ i41;
                int i43 = i39 ^ (i41 | i42);
                int i44 = iRotateLeft12 ^ (i42 & i43);
                iYandex6 = Integer.rotateLeft(i43, 31);
                int iRotateLeft13 = Integer.rotateLeft(i42, 27);
                iYandex8 = Integer.rotateLeft(i41, 30);
                iYandex5 = i44;
                i4 = 8;
                iYandex7 = iRotateLeft13;
            }
        }
    }

    public C16025l(AbstractC8859l abstractC8859l, boolean z, boolean z2) {
        this.f31407l = abstractC8859l;
        this.f31409l = z;
        this.f31408l = z2;
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
    }
}
