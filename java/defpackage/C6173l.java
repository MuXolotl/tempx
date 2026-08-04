package defpackage;

/* JADX INFO: renamed from: lؙؐۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6173l extends C3479l {
    public static void admob(int[] iArr, int[] iArr2) {
        int i = 16;
        if (iArr.length != 16) {
            C11983l.crashlytics();
            return;
        }
        if (iArr2.length != 16) {
            C11983l.crashlytics();
            return;
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        char c = 3;
        int i5 = iArr[3];
        char c2 = 4;
        int iRotateLeft = iArr[4];
        char c3 = 5;
        int iRotateLeft2 = iArr[5];
        char c4 = 6;
        int iRotateLeft3 = iArr[6];
        int i6 = 7;
        int iRotateLeft4 = iArr[7];
        int i7 = 8;
        int i8 = iArr[8];
        int i9 = iArr[9];
        int i10 = iArr[10];
        int i11 = iArr[11];
        int iRotateLeft5 = iArr[12];
        int iRotateLeft6 = iArr[13];
        int iRotateLeft7 = iArr[14];
        int iRotateLeft8 = iArr[15];
        int i12 = 20;
        while (i12 > 0) {
            int i13 = i2 + iRotateLeft;
            char c5 = c;
            int iRotateLeft9 = Integer.rotateLeft(iRotateLeft5 ^ i13, i);
            int i14 = i8 + iRotateLeft9;
            int iRotateLeft10 = Integer.rotateLeft(iRotateLeft ^ i14, 12);
            int i15 = i13 + iRotateLeft10;
            int iRotateLeft11 = Integer.rotateLeft(iRotateLeft9 ^ i15, i7);
            int i16 = i14 + iRotateLeft11;
            int iRotateLeft12 = Integer.rotateLeft(iRotateLeft10 ^ i16, i6);
            int i17 = i3 + iRotateLeft2;
            char c6 = c2;
            int iRotateLeft13 = Integer.rotateLeft(iRotateLeft6 ^ i17, i);
            int i18 = i9 + iRotateLeft13;
            int iRotateLeft14 = Integer.rotateLeft(iRotateLeft2 ^ i18, 12);
            int i19 = i17 + iRotateLeft14;
            int iRotateLeft15 = Integer.rotateLeft(iRotateLeft13 ^ i19, i7);
            int i20 = i18 + iRotateLeft15;
            int iRotateLeft16 = Integer.rotateLeft(iRotateLeft14 ^ i20, i6);
            int i21 = i4 + iRotateLeft3;
            char c7 = c3;
            int iRotateLeft17 = Integer.rotateLeft(iRotateLeft7 ^ i21, i);
            int i22 = i10 + iRotateLeft17;
            char c8 = c4;
            int iRotateLeft18 = Integer.rotateLeft(iRotateLeft3 ^ i22, 12);
            int i23 = i21 + iRotateLeft18;
            int iRotateLeft19 = Integer.rotateLeft(iRotateLeft17 ^ i23, i7);
            int i24 = i22 + iRotateLeft19;
            int iRotateLeft20 = Integer.rotateLeft(iRotateLeft18 ^ i24, i6);
            int i25 = i5 + iRotateLeft4;
            int iRotateLeft21 = Integer.rotateLeft(iRotateLeft8 ^ i25, i);
            int i26 = i11 + iRotateLeft21;
            int iRotateLeft22 = Integer.rotateLeft(iRotateLeft4 ^ i26, 12);
            int i27 = i25 + iRotateLeft22;
            int iRotateLeft23 = Integer.rotateLeft(iRotateLeft21 ^ i27, i7);
            int i28 = i26 + iRotateLeft23;
            int iRotateLeft24 = Integer.rotateLeft(iRotateLeft22 ^ i28, 7);
            int i29 = i15 + iRotateLeft16;
            int iRotateLeft25 = Integer.rotateLeft(iRotateLeft23 ^ i29, 16);
            int i30 = i24 + iRotateLeft25;
            int iRotateLeft26 = Integer.rotateLeft(iRotateLeft16 ^ i30, 12);
            i2 = i29 + iRotateLeft26;
            iRotateLeft8 = Integer.rotateLeft(iRotateLeft25 ^ i2, 8);
            i10 = i30 + iRotateLeft8;
            iRotateLeft2 = Integer.rotateLeft(iRotateLeft26 ^ i10, 7);
            int i31 = i19 + iRotateLeft20;
            int iRotateLeft27 = Integer.rotateLeft(iRotateLeft11 ^ i31, 16);
            int i32 = i28 + iRotateLeft27;
            int iRotateLeft28 = Integer.rotateLeft(iRotateLeft20 ^ i32, 12);
            i3 = i31 + iRotateLeft28;
            iRotateLeft5 = Integer.rotateLeft(iRotateLeft27 ^ i3, 8);
            i11 = i32 + iRotateLeft5;
            iRotateLeft3 = Integer.rotateLeft(iRotateLeft28 ^ i11, 7);
            int i33 = i23 + iRotateLeft24;
            int iRotateLeft29 = Integer.rotateLeft(iRotateLeft15 ^ i33, 16);
            int i34 = i16 + iRotateLeft29;
            int iRotateLeft30 = Integer.rotateLeft(iRotateLeft24 ^ i34, 12);
            i4 = i33 + iRotateLeft30;
            iRotateLeft6 = Integer.rotateLeft(iRotateLeft29 ^ i4, 8);
            i8 = i34 + iRotateLeft6;
            iRotateLeft4 = Integer.rotateLeft(iRotateLeft30 ^ i8, 7);
            int i35 = i27 + iRotateLeft12;
            int iRotateLeft31 = Integer.rotateLeft(iRotateLeft19 ^ i35, 16);
            int i36 = i20 + iRotateLeft31;
            int iRotateLeft32 = Integer.rotateLeft(iRotateLeft12 ^ i36, 12);
            i5 = i35 + iRotateLeft32;
            iRotateLeft7 = Integer.rotateLeft(iRotateLeft31 ^ i5, 8);
            i9 = i36 + iRotateLeft7;
            iRotateLeft = Integer.rotateLeft(iRotateLeft32 ^ i9, 7);
            i12 -= 2;
            i = 16;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i6 = 7;
            i7 = 8;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = i2 + iArr[0];
        iArr2[1] = i3 + iArr[1];
        iArr2[2] = i4 + iArr[2];
        iArr2[c9] = i5 + iArr[c9];
        iArr2[c10] = iRotateLeft + iArr[c10];
        iArr2[c11] = iRotateLeft2 + iArr[c11];
        iArr2[c12] = iRotateLeft3 + iArr[c12];
        iArr2[7] = iRotateLeft4 + iArr[7];
        iArr2[8] = i8 + iArr[8];
        iArr2[9] = i9 + iArr[9];
        iArr2[10] = i10 + iArr[10];
        iArr2[11] = i11 + iArr[11];
        iArr2[12] = iRotateLeft5 + iArr[12];
        iArr2[13] = iRotateLeft6 + iArr[13];
        iArr2[14] = iRotateLeft7 + iArr[14];
        iArr2[15] = iRotateLeft8 + iArr[15];
    }

    @Override // defpackage.C3479l, defpackage.InterfaceC12774l
    public final String getAlgorithmName() {
        return "ChaCha20";
    }

    @Override // defpackage.C3479l
    public final void loadAd(byte[] bArr) {
        int[] iArr = this.f7366l;
        int[] iArr2 = this.f7363l;
        admob(iArr, iArr2);
        AbstractC10000l.remoteconfig(bArr, iArr2);
    }

    @Override // defpackage.C3479l
    public final void mopub(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f7366l;
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                C8339l.metrica("ChaCha20".concat(" requires 128 bit or 256 bit key"));
                return;
            } else {
                C3479l.amazon(iArr, bArr.length);
                AbstractC10000l.adcel(bArr, 0, iArr, 4, 4);
                AbstractC10000l.adcel(bArr, bArr.length - 16, iArr, 8, 4);
            }
        }
        AbstractC10000l.adcel(bArr2, 0, iArr, 14, 2);
    }

    @Override // defpackage.C3479l
    public final void purchase() {
        int[] iArr = this.f7366l;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // defpackage.C3479l
    public final void yandex() {
        int[] iArr = this.f7366l;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }
}
