package defpackage;

/* JADX INFO: renamed from: lٌؐۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8470l extends C15461l {
    public final InterfaceC12684l metrica;

    public C8470l(InterfaceC10952l interfaceC10952l, InterfaceC12684l interfaceC12684l) {
        this.firebase = interfaceC10952l;
        this.metrica = interfaceC12684l;
        this.admob = new byte[interfaceC10952l.license()];
        this.subs = 0;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int admob(byte b, byte[] bArr, int i) {
        int i2 = this.subs;
        byte[] bArr2 = this.admob;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int iTapsense = this.firebase.tapsense(0, i, bArr2, bArr);
            this.subs = 0;
            i3 = iTapsense;
        }
        byte[] bArr3 = this.admob;
        int i4 = this.subs;
        this.subs = i4 + 1;
        bArr3[i4] = b;
        return i3;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final void billing(boolean z, InterfaceC9719l interfaceC9719l) {
        InterfaceC10952l interfaceC10952l;
        this.isPro = z;
        isPro();
        boolean z2 = interfaceC9719l instanceof C6114l;
        InterfaceC12684l interfaceC12684l = this.metrica;
        if (z2) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            interfaceC12684l.smaato(c6114l.f12904l);
            interfaceC10952l = this.firebase;
            interfaceC9719l = c6114l.f12903l;
        } else {
            interfaceC12684l.smaato(null);
            interfaceC10952l = this.firebase;
        }
        interfaceC10952l.init(z, interfaceC9719l);
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int crashlytics(int i) {
        int i2 = i + this.subs;
        byte[] bArr = this.admob;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!this.isPro) {
            return i2;
        }
        return i2 + bArr.length;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int purchase(int i) {
        int i2 = i + this.subs;
        byte[] bArr = this.admob;
        int length = i2 % bArr.length;
        return length == 0 ? Math.max(0, i2 - bArr.length) : i2 - length;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int subs(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iTapsense = 0;
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
        int i4 = this.subs;
        int i5 = length - i4;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            i += i5;
            i2 -= i5;
            if (bArr == bArr2 && AbstractC14024l.ad(i, i2, i3, iPurchase)) {
                bArr = new byte[i2];
                System.arraycopy(bArr2, i, bArr, 0, i2);
                i = 0;
            }
            int iTapsense2 = this.firebase.tapsense(0, i3, this.admob, bArr2);
            this.subs = 0;
            iTapsense = iTapsense2;
            while (i2 > this.admob.length) {
                iTapsense += this.firebase.tapsense(i, i3 + iTapsense, bArr, bArr2);
                i2 -= iLicense;
                i += iLicense;
            }
        }
        System.arraycopy(bArr, i, this.admob, this.subs, i2);
        this.subs += i2;
        return iTapsense;
    }

    @Override // defpackage.C15461l, defpackage.C0800l
    public final int yandex(byte[] bArr, int i) {
        int iTapsense;
        int iLicense = this.firebase.license();
        boolean z = this.isPro;
        int i2 = this.subs;
        InterfaceC12684l interfaceC12684l = this.metrica;
        if (!z) {
            if (i2 != iLicense) {
                isPro();
                C10754l.ad("last block incomplete in decryption");
                return 0;
            }
            InterfaceC10952l interfaceC10952l = this.firebase;
            byte[] bArr2 = this.admob;
            int iTapsense2 = interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
            this.subs = 0;
            try {
                int iBilling = iTapsense2 - interfaceC12684l.billing(this.admob);
                System.arraycopy(this.admob, 0, bArr, i, iBilling);
                return iBilling;
            } finally {
                isPro();
            }
        }
        if (i2 != iLicense) {
            iTapsense = 0;
        } else {
            if ((iLicense * 2) + i > bArr.length) {
                isPro();
                C18073l.ad("output buffer too short");
                return 0;
            }
            iTapsense = this.firebase.tapsense(0, i, this.admob, bArr);
            this.subs = 0;
        }
        interfaceC12684l.crashlytics(this.subs, this.admob);
        int iTapsense3 = this.firebase.tapsense(0, i + iTapsense, this.admob, bArr) + iTapsense;
        isPro();
        return iTapsense3;
    }

    public C8470l(InterfaceC10952l interfaceC10952l) {
        this(interfaceC10952l, new C9912l(7));
    }
}
