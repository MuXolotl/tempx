package defpackage;

/* JADX INFO: renamed from: lٕؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C15461l extends C0800l {
    public byte[] admob;
    public InterfaceC10952l firebase;
    public boolean isPro;
    public final boolean remoteconfig;
    public final InterfaceC11654l smaato;
    public int subs;
    public final boolean vip;

    public C15461l(InterfaceC10952l interfaceC10952l) {
        this.firebase = interfaceC10952l;
        if (interfaceC10952l instanceof InterfaceC11654l) {
            InterfaceC11654l interfaceC11654l = (InterfaceC11654l) interfaceC10952l;
            this.smaato = interfaceC11654l;
            this.admob = new byte[((AbstractC18213l) interfaceC11654l).license()];
        } else {
            this.smaato = null;
            this.admob = new byte[interfaceC10952l.license()];
        }
        boolean z = false;
        this.subs = 0;
        String algorithmName = interfaceC10952l.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.vip = z2;
        if (z2 || (interfaceC10952l instanceof InterfaceC12774l)) {
            this.remoteconfig = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z = true;
        }
        this.remoteconfig = z;
    }

    @Override // defpackage.C0800l
    public int admob(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.admob;
        int i2 = this.subs;
        int i3 = i2 + 1;
        this.subs = i3;
        bArr2[i2] = b;
        if (i3 == bArr2.length) {
            return firebase(i, bArr);
        }
        return 0;
    }

    @Override // defpackage.C0800l
    public final InterfaceC10952l amazon() {
        return this.firebase;
    }

    @Override // defpackage.C0800l
    public void billing(boolean z, InterfaceC9719l interfaceC9719l) {
        this.isPro = z;
        isPro();
        this.firebase.init(z, interfaceC9719l);
    }

    @Override // defpackage.C0800l
    public int crashlytics(int i) {
        if (!this.vip || !this.isPro) {
            return i + this.subs;
        }
        return this.firebase.license() + 2 + i + this.subs;
    }

    public final int firebase(int i, byte[] bArr) {
        this.subs = 0;
        InterfaceC11654l interfaceC11654l = this.smaato;
        if (interfaceC11654l == null) {
            return this.firebase.tapsense(0, i, this.admob, bArr);
        }
        byte[] bArr2 = this.admob;
        return ((AbstractC18213l) interfaceC11654l).yandex(bArr2, 0, bArr2.length / interfaceC11654l.license(), bArr, i);
    }

    @Override // defpackage.C0800l
    public final void isPro() {
        int i = 0;
        while (true) {
            byte[] bArr = this.admob;
            if (i >= bArr.length) {
                this.subs = 0;
                this.firebase.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.C0800l
    public final int loadAd() {
        return this.firebase.license();
    }

    @Override // defpackage.C0800l
    public int purchase(int i) {
        int length;
        int length2;
        int i2 = i + this.subs;
        if (this.vip) {
            boolean z = this.isPro;
            byte[] bArr = this.admob;
            if (z) {
                length2 = (i2 % bArr.length) - (this.firebase.license() + 2);
            } else {
                length = bArr.length;
            }
            return i2 - length2;
        }
        length = this.admob.length;
        length2 = i2 % length;
        return i2 - length2;
    }

    @Override // defpackage.C0800l
    public int subs(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        int iFirebase = 0;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return 0;
        }
        int iLicense = this.firebase.license();
        int iPurchase = purchase(i2);
        if (iPurchase > 0 && iPurchase + i3 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        byte[] bArr4 = this.admob;
        int length = bArr4.length;
        int i5 = this.subs;
        int i6 = length - i5;
        if (i2 > i6) {
            if (i5 != 0) {
                System.arraycopy(bArr, i, bArr4, i5, i6);
                i += i6;
                i2 -= i6;
            }
            if (bArr == bArr2) {
                bArr = new byte[i2];
                System.arraycopy(bArr2, i, bArr, 0, i2);
                i4 = 0;
            } else {
                i4 = i;
            }
            byte[] bArr5 = bArr;
            iFirebase = this.subs != 0 ? firebase(i3, bArr2) : 0;
            InterfaceC11654l interfaceC11654l = this.smaato;
            if (interfaceC11654l != null) {
                AbstractC18213l abstractC18213l = (AbstractC18213l) interfaceC11654l;
                int iLicense2 = (abstractC18213l.license() / iLicense) * (i2 / abstractC18213l.license());
                if (iLicense2 > 0) {
                    bArr3 = bArr2;
                    iFirebase += abstractC18213l.yandex(bArr5, i4, iLicense2, bArr3, i3 + iFirebase);
                    int i7 = iLicense2 * iLicense;
                    i2 -= i7;
                    i4 += i7;
                } else {
                    bArr3 = bArr2;
                }
                i = i4;
            } else {
                bArr3 = bArr2;
                i = i4;
                while (i2 > this.admob.length) {
                    iFirebase += this.firebase.tapsense(i, i3 + iFirebase, bArr5, bArr3);
                    i2 -= iLicense;
                    i += iLicense;
                }
            }
            bArr = bArr5;
        } else {
            bArr3 = bArr2;
        }
        System.arraycopy(bArr, i, this.admob, this.subs, i2);
        int i8 = this.subs + i2;
        this.subs = i8;
        return i8 == this.admob.length ? firebase(i3 + iFirebase, bArr3) + iFirebase : iFirebase;
    }

    @Override // defpackage.C0800l
    public int yandex(byte[] bArr, int i) {
        byte[] bArr2;
        int i2;
        int iYandex;
        int iLicense;
        try {
            int i3 = this.subs;
            if (i + i3 > bArr.length) {
                throw new C7727l("output buffer too short for doFinal()");
            }
            int i4 = 0;
            if (i3 != 0) {
                InterfaceC11654l interfaceC11654l = this.smaato;
                if (interfaceC11654l != null) {
                    int iLicense2 = i3 / interfaceC11654l.license();
                    bArr2 = bArr;
                    i2 = i;
                    iYandex = ((AbstractC18213l) interfaceC11654l).yandex(this.admob, 0, iLicense2, bArr2, i2);
                    iLicense = iLicense2 * interfaceC11654l.license();
                } else {
                    bArr2 = bArr;
                    i2 = i;
                    iYandex = 0;
                    iLicense = 0;
                }
                if (this.subs == iLicense) {
                    i4 = iYandex;
                } else {
                    if (!this.remoteconfig) {
                        throw new C10314l("data not block size aligned");
                    }
                    InterfaceC10952l interfaceC10952l = this.firebase;
                    byte[] bArr3 = this.admob;
                    interfaceC10952l.tapsense(iLicense, iLicense, bArr3, bArr3);
                    System.arraycopy(this.admob, iLicense, bArr2, i2 + iYandex, this.subs - iLicense);
                    int i5 = (this.subs - iLicense) + iYandex;
                    this.subs = 0;
                    i4 = i5;
                }
            }
            isPro();
            return i4;
        } catch (Throwable th) {
            isPro();
            throw th;
        }
    }
}
