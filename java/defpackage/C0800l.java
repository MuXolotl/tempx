package defpackage;

/* JADX INFO: renamed from: lؒؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0800l {
    public final InterfaceC10952l amazon;
    public final boolean billing;
    public boolean crashlytics;
    public int loadAd;
    public final boolean mopub;
    public final InterfaceC11654l purchase;
    public final byte[] yandex;

    public C0800l(InterfaceC10952l interfaceC10952l) {
        this.amazon = interfaceC10952l;
        if (interfaceC10952l instanceof InterfaceC11654l) {
            InterfaceC11654l interfaceC11654l = (InterfaceC11654l) interfaceC10952l;
            this.purchase = interfaceC11654l;
            this.yandex = new byte[((AbstractC18213l) interfaceC11654l).license()];
        } else {
            this.purchase = null;
            this.yandex = new byte[interfaceC10952l.license()];
        }
        boolean z = false;
        this.loadAd = 0;
        String algorithmName = interfaceC10952l.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.mopub = z2;
        if (z2 || (interfaceC10952l instanceof InterfaceC12774l)) {
            this.billing = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z = true;
        }
        this.billing = z;
    }

    public int admob(byte b, byte[] bArr, int i) {
        int i2 = this.loadAd;
        int i3 = i2 + 1;
        this.loadAd = i3;
        byte[] bArr2 = this.yandex;
        bArr2[i2] = b;
        if (i3 == bArr2.length) {
            return mopub(i, bArr);
        }
        return 0;
    }

    public InterfaceC10952l amazon() {
        return this.amazon;
    }

    public void billing(boolean z, InterfaceC9719l interfaceC9719l) {
        this.crashlytics = z;
        isPro();
        this.amazon.init(z, interfaceC9719l);
    }

    public int crashlytics(int i) {
        if (!this.mopub || !this.crashlytics) {
            return i + this.loadAd;
        }
        return this.amazon.license() + 2 + i + this.loadAd;
    }

    public void isPro() {
        int i = 0;
        while (true) {
            byte[] bArr = this.yandex;
            if (i >= bArr.length) {
                this.loadAd = 0;
                this.amazon.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    public int loadAd() {
        return this.amazon.license();
    }

    public final int mopub(int i, byte[] bArr) {
        this.loadAd = 0;
        byte[] bArr2 = this.yandex;
        InterfaceC11654l interfaceC11654l = this.purchase;
        if (interfaceC11654l == null) {
            return this.amazon.tapsense(0, i, bArr2, bArr);
        }
        return ((AbstractC18213l) interfaceC11654l).yandex(bArr2, 0, bArr2.length / interfaceC11654l.license(), bArr, i);
    }

    public int purchase(int i) {
        int i2 = i + this.loadAd;
        boolean z = this.mopub;
        byte[] bArr = this.yandex;
        return i2 - ((z && this.crashlytics) ? (i2 % bArr.length) - (this.amazon.license() + 2) : i2 % bArr.length);
    }

    public int subs(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        int iMopub = 0;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return 0;
        }
        int iLoadAd = loadAd();
        int iPurchase = purchase(i2);
        if (iPurchase > 0 && iPurchase + i3 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        byte[] bArr4 = this.yandex;
        int length = bArr4.length;
        int i5 = this.loadAd;
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
            iMopub = this.loadAd != 0 ? mopub(i3, bArr2) : 0;
            InterfaceC11654l interfaceC11654l = this.purchase;
            if (interfaceC11654l != null) {
                AbstractC18213l abstractC18213l = (AbstractC18213l) interfaceC11654l;
                int iLicense = (abstractC18213l.license() / iLoadAd) * (i2 / abstractC18213l.license());
                if (iLicense > 0) {
                    bArr3 = bArr2;
                    iMopub += abstractC18213l.yandex(bArr5, i4, iLicense, bArr3, i3 + iMopub);
                    int i7 = iLicense * iLoadAd;
                    i2 -= i7;
                    i4 += i7;
                } else {
                    bArr3 = bArr2;
                }
                i = i4;
            } else {
                bArr3 = bArr2;
                i = i4;
                while (i2 > bArr4.length) {
                    iMopub += this.amazon.tapsense(i, i3 + iMopub, bArr5, bArr3);
                    i2 -= iLoadAd;
                    i += iLoadAd;
                }
            }
            bArr = bArr5;
        } else {
            bArr3 = bArr2;
        }
        System.arraycopy(bArr, i, bArr4, this.loadAd, i2);
        int i8 = this.loadAd + i2;
        this.loadAd = i8;
        return i8 == bArr4.length ? mopub(i3 + iMopub, bArr3) + iMopub : iMopub;
    }

    public int yandex(byte[] bArr, int i) {
        byte[] bArr2;
        int i2;
        int iYandex;
        int iLicense;
        byte[] bArr3 = this.yandex;
        try {
            int i3 = this.loadAd;
            if (i + i3 > bArr.length) {
                throw new C7727l("output buffer too short for doFinal()");
            }
            int i4 = 0;
            if (i3 != 0) {
                InterfaceC11654l interfaceC11654l = this.purchase;
                if (interfaceC11654l != null) {
                    int iLicense2 = i3 / interfaceC11654l.license();
                    bArr2 = bArr;
                    i2 = i;
                    iYandex = ((AbstractC18213l) interfaceC11654l).yandex(this.yandex, 0, iLicense2, bArr2, i2);
                    iLicense = iLicense2 * interfaceC11654l.license();
                } else {
                    bArr2 = bArr;
                    i2 = i;
                    iYandex = 0;
                    iLicense = 0;
                }
                if (this.loadAd == iLicense) {
                    i4 = iYandex;
                } else {
                    if (!this.billing) {
                        throw new C10314l("data not block size aligned");
                    }
                    this.amazon.tapsense(iLicense, iLicense, bArr3, bArr3);
                    System.arraycopy(bArr3, iLicense, bArr2, i2 + iYandex, this.loadAd - iLicense);
                    int i5 = (this.loadAd - iLicense) + iYandex;
                    this.loadAd = 0;
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
