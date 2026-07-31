package defpackage;

/* JADX INFO: renamed from: lَُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10224l extends C1196l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final int[] f20838l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int[] f20839l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final int[] f20840l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final int[] f20841l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final int[] f20842l;

    public C10224l() {
        super(1);
        this.f20842l = new int[48];
        this.f20839l = new int[48];
        this.f20840l = new int[192];
        this.f20841l = new int[192];
        this.f20838l = new int[8];
    }

    @Override // defpackage.C1196l, defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return "CAST6";
    }

    @Override // defpackage.C1196l, defpackage.InterfaceC10952l
    public final int license() {
        return 16;
    }

    @Override // defpackage.C1196l
    public final int metrica(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int[] iArr;
        int[] iArr2;
        int iCrashlytics = C1196l.crashlytics(i, bArr);
        int iCrashlytics2 = C1196l.crashlytics(i + 4, bArr);
        int iCrashlytics3 = C1196l.crashlytics(i + 8, bArr);
        int iCrashlytics4 = C1196l.crashlytics(i + 12, bArr);
        int i4 = 0;
        while (true) {
            iArr = this.f20842l;
            iArr2 = this.f20839l;
            if (i4 >= 6) {
                break;
            }
            int i5 = (11 - i4) * 4;
            iCrashlytics3 ^= C1196l.amazon(iCrashlytics4, iArr2[i5], iArr[i5]);
            int i6 = i5 + 1;
            iCrashlytics2 ^= C1196l.purchase(iCrashlytics3, iArr2[i6], iArr[i6]);
            int i7 = i5 + 2;
            iCrashlytics ^= C1196l.billing(iCrashlytics2, iArr2[i7], iArr[i7]);
            int i8 = i5 + 3;
            iCrashlytics4 ^= C1196l.amazon(iCrashlytics, iArr2[i8], iArr[i8]);
            i4++;
        }
        for (i3 = 6; i3 < 12; i3++) {
            int i9 = (11 - i3) * 4;
            int i10 = i9 + 3;
            iCrashlytics4 ^= C1196l.amazon(iCrashlytics, iArr2[i10], iArr[i10]);
            int i11 = i9 + 2;
            iCrashlytics ^= C1196l.billing(iCrashlytics2, iArr2[i11], iArr[i11]);
            int i12 = i9 + 1;
            iCrashlytics2 ^= C1196l.purchase(iCrashlytics3, iArr2[i12], iArr[i12]);
            iCrashlytics3 ^= C1196l.amazon(iCrashlytics4, iArr2[i9], iArr[i9]);
        }
        int[] iArr3 = {iCrashlytics, iCrashlytics2, iCrashlytics3, iCrashlytics4};
        C1196l.yandex(iArr3[0], i2, bArr2);
        C1196l.yandex(iArr3[1], i2 + 4, bArr2);
        C1196l.yandex(iArr3[2], i2 + 8, bArr2);
        C1196l.yandex(iArr3[3], i2 + 12, bArr2);
        return 16;
    }

    @Override // defpackage.C1196l
    public final void premium(byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i = 1518500249;
        int i2 = 19;
        char c = 0;
        int i3 = 0;
        while (true) {
            iArr = this.f20840l;
            iArr2 = this.f20841l;
            if (i3 >= 24) {
                break;
            }
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = (i3 * 8) + i4;
                iArr2[i5] = i;
                i += 1859775393;
                iArr[i5] = i2;
                i2 = (i2 + 17) & 31;
            }
            i3++;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i6 = 0;
        while (true) {
            iArr3 = this.f20838l;
            if (i6 >= 8) {
                break;
            }
            iArr3[i6] = C1196l.crashlytics(i6 * 4, bArr2);
            i6++;
        }
        int i7 = 0;
        while (i7 < 12) {
            int i8 = i7 * 16;
            int iAmazon = iArr3[6] ^ C1196l.amazon(iArr3[7], iArr2[i8], iArr[i8]);
            iArr3[6] = iAmazon;
            int i9 = i8 + 1;
            int iPurchase = C1196l.purchase(iAmazon, iArr2[i9], iArr[i9]) ^ iArr3[5];
            iArr3[5] = iPurchase;
            int i10 = i8 + 2;
            char c2 = c;
            int iBilling = C1196l.billing(iPurchase, iArr2[i10], iArr[i10]) ^ iArr3[4];
            iArr3[4] = iBilling;
            int i11 = i8 + 3;
            int iAmazon2 = C1196l.amazon(iBilling, iArr2[i11], iArr[i11]) ^ iArr3[3];
            iArr3[3] = iAmazon2;
            int i12 = i8 + 4;
            int iPurchase2 = C1196l.purchase(iAmazon2, iArr2[i12], iArr[i12]) ^ iArr3[2];
            iArr3[2] = iPurchase2;
            int i13 = i8 + 5;
            int iBilling2 = C1196l.billing(iPurchase2, iArr2[i13], iArr[i13]) ^ iArr3[1];
            iArr3[1] = iBilling2;
            int i14 = i8 + 6;
            int iAmazon3 = C1196l.amazon(iBilling2, iArr2[i14], iArr[i14]) ^ iArr3[c2];
            iArr3[c2] = iAmazon3;
            int i15 = i8 + 7;
            int iPurchase3 = C1196l.purchase(iAmazon3, iArr2[i15], iArr[i15]) ^ iArr3[7];
            iArr3[7] = iPurchase3;
            int i16 = ((i7 * 2) + 1) * 8;
            int iAmazon4 = C1196l.amazon(iPurchase3, iArr2[i16], iArr[i16]) ^ iArr3[6];
            iArr3[6] = iAmazon4;
            int i17 = i16 + 1;
            int iPurchase4 = C1196l.purchase(iAmazon4, iArr2[i17], iArr[i17]) ^ iArr3[5];
            iArr3[5] = iPurchase4;
            int i18 = i16 + 2;
            int iBilling3 = C1196l.billing(iPurchase4, iArr2[i18], iArr[i18]) ^ iArr3[4];
            iArr3[4] = iBilling3;
            int i19 = i16 + 3;
            int iAmazon5 = C1196l.amazon(iBilling3, iArr2[i19], iArr[i19]) ^ iArr3[3];
            iArr3[3] = iAmazon5;
            int i20 = i16 + 4;
            int iPurchase5 = C1196l.purchase(iAmazon5, iArr2[i20], iArr[i20]) ^ iArr3[2];
            iArr3[2] = iPurchase5;
            int i21 = i16 + 5;
            int iBilling4 = C1196l.billing(iPurchase5, iArr2[i21], iArr[i21]) ^ iArr3[1];
            iArr3[1] = iBilling4;
            int i22 = i16 + 6;
            int iAmazon6 = C1196l.amazon(iBilling4, iArr2[i22], iArr[i22]) ^ iArr3[c2];
            iArr3[c2] = iAmazon6;
            int i23 = i16 + 7;
            iArr3[7] = C1196l.purchase(iAmazon6, iArr2[i23], iArr[i23]) ^ iArr3[7];
            int i24 = i7 * 4;
            int i25 = iArr3[c2] & 31;
            int[] iArr4 = this.f20842l;
            iArr4[i24] = i25;
            int i26 = i24 + 1;
            iArr4[i26] = iArr3[2] & 31;
            int i27 = i24 + 2;
            iArr4[i27] = iArr3[4] & 31;
            int i28 = i24 + 3;
            iArr4[i28] = iArr3[6] & 31;
            int i29 = iArr3[7];
            int[] iArr5 = this.f20839l;
            iArr5[i24] = i29;
            iArr5[i26] = iArr3[5];
            iArr5[i27] = iArr3[3];
            iArr5[i28] = iArr3[1];
            i7++;
            c = c2;
        }
    }

    @Override // defpackage.C1196l
    public final int startapp(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int[] iArr;
        int[] iArr2;
        int iCrashlytics = C1196l.crashlytics(i, bArr);
        int iCrashlytics2 = C1196l.crashlytics(i + 4, bArr);
        int iCrashlytics3 = C1196l.crashlytics(i + 8, bArr);
        int iCrashlytics4 = C1196l.crashlytics(i + 12, bArr);
        int i4 = 0;
        while (true) {
            iArr = this.f20842l;
            iArr2 = this.f20839l;
            if (i4 >= 6) {
                break;
            }
            int i5 = i4 * 4;
            iCrashlytics3 ^= C1196l.amazon(iCrashlytics4, iArr2[i5], iArr[i5]);
            int i6 = i5 + 1;
            iCrashlytics2 ^= C1196l.purchase(iCrashlytics3, iArr2[i6], iArr[i6]);
            int i7 = i5 + 2;
            iCrashlytics ^= C1196l.billing(iCrashlytics2, iArr2[i7], iArr[i7]);
            int i8 = i5 + 3;
            iCrashlytics4 ^= C1196l.amazon(iCrashlytics, iArr2[i8], iArr[i8]);
            i4++;
        }
        for (i3 = 6; i3 < 12; i3++) {
            int i9 = i3 * 4;
            int i10 = i9 + 3;
            iCrashlytics4 ^= C1196l.amazon(iCrashlytics, iArr2[i10], iArr[i10]);
            int i11 = i9 + 2;
            iCrashlytics ^= C1196l.billing(iCrashlytics2, iArr2[i11], iArr[i11]);
            int i12 = i9 + 1;
            iCrashlytics2 ^= C1196l.purchase(iCrashlytics3, iArr2[i12], iArr[i12]);
            iCrashlytics3 ^= C1196l.amazon(iCrashlytics4, iArr2[i9], iArr[i9]);
        }
        int[] iArr3 = {iCrashlytics, iCrashlytics2, iCrashlytics3, iCrashlytics4};
        C1196l.yandex(iArr3[0], i2, bArr2);
        C1196l.yandex(iArr3[1], i2 + 4, bArr2);
        C1196l.yandex(iArr3[2], i2 + 8, bArr2);
        C1196l.yandex(iArr3[3], i2 + 12, bArr2);
        return 16;
    }

    @Override // defpackage.C1196l, defpackage.InterfaceC10952l
    public final void reset() {
    }
}
