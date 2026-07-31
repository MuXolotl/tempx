package defpackage;

/* JADX INFO: renamed from: lَٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10423l extends C15461l {
    public final int metrica;

    public C10423l(InterfaceC10952l interfaceC10952l) {
        if (interfaceC10952l instanceof AbstractC6568l) {
            C8339l.metrica("CTSBlockCipher can only accept ECB, or CBC ciphers");
            throw null;
        }
        this.firebase = interfaceC10952l;
        int iLicense = interfaceC10952l.license();
        this.metrica = iLicense;
        this.admob = new byte[iLicense * 2];
        this.subs = 0;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int admob(byte b, byte[] bArr, int i) {
        int i2 = this.subs;
        byte[] bArr2 = this.admob;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int iTapsense = this.firebase.tapsense(0, i, bArr2, bArr);
            byte[] bArr3 = this.admob;
            int i4 = this.metrica;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            this.subs = i4;
            i3 = iTapsense;
        }
        byte[] bArr4 = this.admob;
        int i5 = this.subs;
        this.subs = i5 + 1;
        bArr4[i5] = b;
        return i3;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int crashlytics(int i) {
        return i + this.subs;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int purchase(int i) {
        int i2 = i + this.subs;
        byte[] bArr = this.admob;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int subs(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return 0;
        }
        int iLicense = this.firebase.license();
        int iPurchase = purchase(i2);
        if (iPurchase > 0 && i3 + iPurchase > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        byte[] bArr3 = this.admob;
        int length = bArr3.length;
        int i5 = this.subs;
        int i6 = length - i5;
        if (i2 > i6) {
            System.arraycopy(bArr, i, bArr3, i5, i6);
            i += i6;
            i2 -= i6;
            if (bArr == bArr2 && AbstractC14024l.ad(i, i2, i3, iPurchase)) {
                bArr = new byte[i2];
                System.arraycopy(bArr2, i, bArr, 0, i2);
                i = 0;
            }
            int iTapsense = this.firebase.tapsense(0, i3, this.admob, bArr2);
            byte[] bArr4 = this.admob;
            System.arraycopy(bArr4, iLicense, bArr4, 0, iLicense);
            this.subs = iLicense;
            while (i2 > iLicense) {
                System.arraycopy(bArr, i, this.admob, this.subs, iLicense);
                iTapsense += this.firebase.tapsense(0, i3 + iTapsense, this.admob, bArr2);
                byte[] bArr5 = this.admob;
                System.arraycopy(bArr5, iLicense, bArr5, 0, iLicense);
                i2 -= iLicense;
                i += iLicense;
            }
            i4 = iTapsense;
        }
        System.arraycopy(bArr, i, this.admob, this.subs, i2);
        this.subs += i2;
        return i4;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int yandex(byte[] bArr, int i) {
        if (this.subs + i > bArr.length) {
            C18073l.ad("output buffer to small in doFinal");
            return 0;
        }
        int iLicense = this.firebase.license();
        int i2 = this.subs;
        int i3 = i2 - iLicense;
        byte[] bArr2 = new byte[iLicense];
        if (this.isPro) {
            if (i2 < iLicense) {
                C10754l.ad("need at least one block of input for CTS");
                return 0;
            }
            this.firebase.tapsense(0, 0, this.admob, bArr2);
            int i4 = this.subs;
            if (i4 > iLicense) {
                while (true) {
                    byte[] bArr3 = this.admob;
                    if (i4 == bArr3.length) {
                        break;
                    }
                    bArr3[i4] = bArr2[i4 - iLicense];
                    i4++;
                }
                for (int i5 = iLicense; i5 != this.subs; i5++) {
                    byte[] bArr4 = this.admob;
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr2[i5 - iLicense]);
                }
                InterfaceC10952l interfaceC10952l = this.firebase;
                if (interfaceC10952l instanceof C4998l) {
                    ((C4998l) interfaceC10952l).f10232l.tapsense(iLicense, i, this.admob, bArr);
                } else {
                    interfaceC10952l.tapsense(iLicense, i, this.admob, bArr);
                }
                System.arraycopy(bArr2, 0, bArr, i + iLicense, i3);
            } else {
                System.arraycopy(bArr2, 0, bArr, i, iLicense);
            }
        } else {
            if (i2 < iLicense) {
                C10754l.ad("need at least one block of input for CTS");
                return 0;
            }
            byte[] bArr5 = new byte[iLicense];
            InterfaceC10952l interfaceC10952l2 = this.firebase;
            if (i2 > iLicense) {
                if (interfaceC10952l2 instanceof C4998l) {
                    ((C4998l) interfaceC10952l2).f10232l.tapsense(0, 0, this.admob, bArr2);
                } else {
                    interfaceC10952l2.tapsense(0, 0, this.admob, bArr2);
                }
                for (int i6 = iLicense; i6 != this.subs; i6++) {
                    int i7 = i6 - iLicense;
                    bArr5[i7] = (byte) (bArr2[i7] ^ this.admob[i6]);
                }
                System.arraycopy(this.admob, iLicense, bArr2, 0, i3);
                this.firebase.tapsense(0, i, bArr2, bArr);
                System.arraycopy(bArr5, 0, bArr, i + iLicense, i3);
            } else {
                interfaceC10952l2.tapsense(0, 0, this.admob, bArr2);
                System.arraycopy(bArr2, 0, bArr, i, iLicense);
            }
        }
        int i8 = this.subs;
        isPro();
        return i8;
    }
}
