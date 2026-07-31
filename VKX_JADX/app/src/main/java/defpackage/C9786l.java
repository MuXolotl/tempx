package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٍۙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9786l extends AbstractC6568l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC10952l f19949l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f19950l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f19951l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19952l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f19953l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f19954l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f19955l;

    public C9786l(InterfaceC10952l interfaceC10952l, int i) {
        super(interfaceC10952l);
        if (i > interfaceC10952l.license() * 8 || i < 8 || i % 8 != 0) {
            C8339l.metrica(AbstractC15560l.tapsense("0FB", i, " not supported"));
            throw null;
        }
        this.f19949l = interfaceC10952l;
        this.f19951l = i / 8;
        this.f19953l = new byte[interfaceC10952l.license()];
        this.f19955l = new byte[interfaceC10952l.license()];
        this.f19950l = new byte[interfaceC10952l.license()];
    }

    public void amazon() {
        byte b;
        byte[] bArr = this.f19955l;
        int length = bArr.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }

    public void crashlytics() {
        byte[] bArr = this.f19953l;
        if (bArr.length < this.f19954l) {
            if (this.f19955l[bArr.length - 1] == bArr[bArr.length - 1]) {
                return;
            }
            C8339l.smaato("Counter in CTR/SIC mode out of range.");
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        int i = this.f19952l;
        InterfaceC10952l interfaceC10952l = this.f19949l;
        switch (i) {
            case 0:
                return interfaceC10952l.getAlgorithmName() + "/OFB" + (this.f19951l * 8);
            default:
                return interfaceC10952l.getAlgorithmName().concat("/SIC");
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        String strTapsense;
        int i = this.f19952l;
        InterfaceC10952l interfaceC10952l = this.f19949l;
        switch (i) {
            case 0:
                byte[] bArr = this.f19953l;
                if (!(interfaceC9719l instanceof C0272l)) {
                    reset();
                    if (interfaceC9719l != null) {
                        interfaceC10952l.init(true, interfaceC9719l);
                        return;
                    }
                    return;
                }
                C0272l c0272l = (C0272l) interfaceC9719l;
                byte[] bArr2 = c0272l.f1273l;
                if (bArr2.length < bArr.length) {
                    System.arraycopy(bArr2, 0, bArr, bArr.length - bArr2.length, bArr2.length);
                    for (int i2 = 0; i2 < bArr.length - bArr2.length; i2++) {
                        bArr[i2] = 0;
                    }
                } else {
                    System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
                }
                reset();
                InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
                if (interfaceC9719l2 != null) {
                    interfaceC10952l.init(true, interfaceC9719l2);
                    return;
                }
                return;
            default:
                int i3 = this.f19954l;
                if (interfaceC9719l instanceof C0272l) {
                    C0272l c0272l2 = (C0272l) interfaceC9719l;
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c0272l2.f1273l);
                    this.f19953l = bArrCrashlytics;
                    if (i3 >= bArrCrashlytics.length) {
                        int i4 = 8 > i3 / 2 ? i3 / 2 : 8;
                        if (i3 - bArrCrashlytics.length > i4) {
                            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (i3 - i4) + " bytes.");
                        }
                        InterfaceC9719l interfaceC9719l3 = c0272l2.f1272l;
                        if (interfaceC9719l3 != null) {
                            interfaceC10952l.init(true, interfaceC9719l3);
                        }
                        reset();
                        return;
                    }
                    strTapsense = AbstractC15560l.tapsense("CTR/SIC mode requires IV no greater than: ", i3, " bytes.");
                } else {
                    strTapsense = "CTR/SIC mode requires ParametersWithIV";
                }
                C8339l.metrica(strTapsense);
                return;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        switch (this.f19952l) {
            case 0:
                return this.f19951l;
            default:
                return this.f19949l.license();
        }
    }

    @Override // defpackage.AbstractC6568l
    public final byte loadAd(byte b) {
        int i = this.f19952l;
        InterfaceC10952l interfaceC10952l = this.f19949l;
        byte[] bArr = this.f19950l;
        byte[] bArr2 = this.f19955l;
        switch (i) {
            case 0:
                int i2 = this.f19951l;
                if (this.f19954l == 0) {
                    interfaceC10952l.tapsense(0, 0, bArr2, bArr);
                }
                int i3 = this.f19954l;
                int i4 = i3 + 1;
                this.f19954l = i4;
                byte b2 = (byte) (b ^ bArr[i3]);
                if (i4 == i2) {
                    this.f19954l = 0;
                    System.arraycopy(bArr2, i2, bArr2, 0, bArr2.length - i2);
                    System.arraycopy(bArr, 0, bArr2, bArr2.length - i2, i2);
                }
                return b2;
            default:
                int i5 = this.f19951l;
                if (i5 == 0) {
                    crashlytics();
                    interfaceC10952l.tapsense(0, 0, bArr2, bArr);
                    int i6 = this.f19951l;
                    this.f19951l = i6 + 1;
                    return (byte) (bArr[i6] ^ b);
                }
                int i7 = i5 + 1;
                this.f19951l = i7;
                byte b3 = (byte) (b ^ bArr[i5]);
                if (i7 == bArr2.length) {
                    this.f19951l = 0;
                    amazon();
                }
                return b3;
        }
    }

    @Override // defpackage.AbstractC6568l, defpackage.InterfaceC12774l
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte b;
        switch (this.f19952l) {
            case 1:
                if (i + i2 > bArr.length) {
                    C10754l.ad("input buffer too small");
                } else {
                    if (i3 + i2 <= bArr2.length) {
                        for (int i4 = 0; i4 < i2; i4++) {
                            int i5 = this.f19951l;
                            byte[] bArr3 = this.f19955l;
                            byte[] bArr4 = this.f19950l;
                            if (i5 == 0) {
                                crashlytics();
                                this.f19949l.tapsense(0, 0, bArr3, bArr4);
                                byte b2 = bArr[i + i4];
                                int i6 = this.f19951l;
                                this.f19951l = i6 + 1;
                                b = (byte) (b2 ^ bArr4[i6]);
                            } else {
                                byte b3 = bArr[i + i4];
                                int i7 = i5 + 1;
                                this.f19951l = i7;
                                b = (byte) (bArr4[i5] ^ b3);
                                if (i7 == bArr3.length) {
                                    this.f19951l = 0;
                                    amazon();
                                }
                            }
                            bArr2[i3 + i4] = b;
                        }
                        return i2;
                    }
                    C18073l.ad("output buffer too short");
                }
                return 0;
            default:
                super.processBytes(bArr, i, i2, bArr2, i3);
                return i2;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        int i = this.f19952l;
        InterfaceC10952l interfaceC10952l = this.f19949l;
        byte[] bArr = this.f19955l;
        switch (i) {
            case 0:
                byte[] bArr2 = this.f19953l;
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                this.f19954l = 0;
                interfaceC10952l.reset();
                break;
            default:
                Arrays.fill(bArr, (byte) 0);
                byte[] bArr3 = this.f19953l;
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                interfaceC10952l.reset();
                this.f19951l = 0;
                break;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        switch (this.f19952l) {
            case 0:
                processBytes(bArr, i, this.f19951l, bArr2, i2);
                return this.f19951l;
            default:
                int i3 = this.f19954l;
                int i4 = this.f19951l;
                int i5 = this.f19954l;
                if (i4 != 0) {
                    processBytes(bArr, i, i5, bArr2, i2);
                    return i3;
                }
                if (i + i5 > bArr.length) {
                    C10754l.ad("input buffer too small");
                } else {
                    if (i2 + i5 <= bArr2.length) {
                        InterfaceC10952l interfaceC10952l = this.f19949l;
                        byte[] bArr3 = this.f19955l;
                        byte[] bArr4 = this.f19950l;
                        interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                        for (int i6 = 0; i6 < i3; i6++) {
                            bArr2[i2 + i6] = (byte) (bArr[i + i6] ^ bArr4[i6]);
                        }
                        amazon();
                        return i3;
                    }
                    C18073l.ad("output buffer too short");
                }
                return 0;
        }
    }

    public C9786l(InterfaceC10952l interfaceC10952l) {
        super(interfaceC10952l);
        this.f19949l = interfaceC10952l;
        int iLicense = interfaceC10952l.license();
        this.f19954l = iLicense;
        this.f19953l = new byte[iLicense];
        this.f19955l = new byte[iLicense];
        this.f19950l = new byte[iLicense];
        this.f19951l = 0;
    }
}
