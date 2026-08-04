package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l۠ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18617l implements isPro {
    public final byte[] admob;
    public byte[] amazon;
    public final byte[] billing;
    public boolean crashlytics;
    public final byte[] firebase;
    public final byte[] isPro;
    public int loadAd;
    public byte[] mopub;
    public byte[] purchase;
    public final C15295l remoteconfig;
    public final C15295l smaato;
    public final byte[] subs;
    public final int vip;
    public final InterfaceC10952l yandex;

    public C18617l(InterfaceC10952l interfaceC10952l) {
        int i = 4;
        this.smaato = new C15295l(i);
        this.remoteconfig = new C15295l(i);
        this.vip = 4;
        this.yandex = interfaceC10952l;
        this.loadAd = interfaceC10952l.license();
        this.mopub = new byte[interfaceC10952l.license()];
        this.amazon = new byte[interfaceC10952l.license()];
        this.purchase = new byte[interfaceC10952l.license()];
        this.billing = new byte[interfaceC10952l.license()];
        this.admob = new byte[interfaceC10952l.license()];
        this.subs = new byte[interfaceC10952l.license()];
        this.isPro = new byte[interfaceC10952l.license()];
        this.firebase = new byte[interfaceC10952l.license()];
        this.vip = 4;
    }

    public static void purchase(int i, byte[] bArr) {
        bArr[3] = (byte) (i >> 24);
        bArr[2] = (byte) (i >> 16);
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) i;
    }

    public final void amazon(int i, int i2, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i3 = 0;
        while (true) {
            byte[] bArr4 = this.firebase;
            int length = bArr4.length;
            bArr3 = this.isPro;
            if (i3 >= length) {
                break;
            }
            bArr3[i3] = (byte) (bArr3[i3] + bArr4[i3]);
            i3++;
        }
        InterfaceC10952l interfaceC10952l = this.yandex;
        byte[] bArr5 = this.subs;
        interfaceC10952l.tapsense(0, 0, bArr3, bArr5);
        for (int i4 = 0; i4 < interfaceC10952l.license(); i4++) {
            bArr2[i2 + i4] = (byte) (bArr5[i4] ^ bArr[i + i4]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c A[LOOP:0: B:24:0x0066->B:26:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d A[LOOP:1: B:30:0x009b->B:31:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1 A[LOOP:2: B:33:0x00ab->B:35:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7 A[LOOP:3: B:39:0x00c1->B:41:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df A[LOOP:5: B:45:0x00d9->B:47:0x00df, LOOP_END] */
    public final void billing(int i, int i2, byte[] bArr) {
        String str;
        String str2;
        String binaryString;
        byte[] bArr2;
        int i3;
        int iLicense;
        int i4;
        int i5;
        int i6;
        InterfaceC10952l interfaceC10952l = this.yandex;
        if (i < interfaceC10952l.license()) {
            str = "authText buffer too short";
        } else {
            if (i % interfaceC10952l.license() == 0) {
                byte[] bArr3 = this.mopub;
                int length = bArr3.length;
                int i7 = this.vip;
                byte[] bArr4 = this.admob;
                System.arraycopy(bArr3, 0, bArr4, 0, (length - i7) - 1);
                byte[] bArr5 = this.subs;
                purchase(i2, bArr5);
                System.arraycopy(bArr5, 0, bArr4, (this.mopub.length - i7) - 1, 4);
                int length2 = bArr4.length - 1;
                int i8 = this.loadAd;
                StringBuilder sb = new StringBuilder("1");
                if (i8 == 8) {
                    str2 = "010";
                } else if (i8 == 16) {
                    str2 = "011";
                } else if (i8 == 32) {
                    str2 = "100";
                } else {
                    if (i8 != 48) {
                        if (i8 == 64) {
                            str2 = "110";
                        }
                        binaryString = Integer.toBinaryString(i7 - 1);
                        while (binaryString.length() < 4) {
                            binaryString = new StringBuilder(binaryString).insert(0, "0").toString();
                        }
                        sb.append(binaryString);
                        bArr4[length2] = (byte) Integer.parseInt(sb.toString(), 2);
                        bArr2 = this.billing;
                        interfaceC10952l.tapsense(0, 0, bArr4, bArr2);
                        purchase(i, bArr5);
                        if (i <= interfaceC10952l.license() - i7) {
                            for (i5 = 0; i5 < i; i5++) {
                                int i9 = i5 + i7;
                                bArr5[i9] = (byte) (bArr5[i9] ^ bArr[i5]);
                            }
                            for (i6 = 0; i6 < interfaceC10952l.license(); i6++) {
                                bArr2[i6] = (byte) (bArr2[i6] ^ bArr5[i6]);
                            }
                            interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
                            return;
                        }
                        for (i3 = 0; i3 < interfaceC10952l.license(); i3++) {
                            bArr2[i3] = (byte) (bArr2[i3] ^ bArr5[i3]);
                        }
                        interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
                        iLicense = 0;
                        while (i != 0) {
                            for (i4 = 0; i4 < interfaceC10952l.license(); i4++) {
                                bArr2[i4] = (byte) (bArr2[i4] ^ bArr[i4 + iLicense]);
                            }
                            interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
                            iLicense += interfaceC10952l.license();
                            i -= interfaceC10952l.license();
                        }
                        return;
                    }
                    str2 = "101";
                }
                sb.append(str2);
                binaryString = Integer.toBinaryString(i7 - 1);
                while (binaryString.length() < 4) {
                    binaryString = new StringBuilder(binaryString).insert(0, "0").toString();
                }
                sb.append(binaryString);
                bArr4[length2] = (byte) Integer.parseInt(sb.toString(), 2);
                bArr2 = this.billing;
                interfaceC10952l.tapsense(0, 0, bArr4, bArr2);
                purchase(i, bArr5);
                if (i <= interfaceC10952l.license() - i7) {
                    while (i5 < i) {
                        int i10 = i5 + i7;
                        bArr5[i10] = (byte) (bArr5[i10] ^ bArr[i5]);
                    }
                    while (i6 < interfaceC10952l.license()) {
                        bArr2[i6] = (byte) (bArr2[i6] ^ bArr5[i6]);
                    }
                    interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
                    return;
                }
                while (i3 < interfaceC10952l.license()) {
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr5[i3]);
                }
                interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
                iLicense = 0;
                while (i != 0) {
                    while (i4 < interfaceC10952l.license()) {
                        bArr2[i4] = (byte) (bArr2[i4] ^ bArr[i4 + iLicense]);
                    }
                    interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
                    iLicense += interfaceC10952l.license();
                    i -= interfaceC10952l.license();
                }
                return;
            }
            str = "padding not supported";
        }
        C8339l.metrica(str);
    }

    public final void crashlytics(int i, byte[] bArr) {
        InterfaceC10952l interfaceC10952l;
        byte[] bArr2;
        int iLicense = 0;
        while (i > 0) {
            int i2 = 0;
            while (true) {
                interfaceC10952l = this.yandex;
                int iLicense2 = interfaceC10952l.license();
                bArr2 = this.billing;
                if (i2 < iLicense2) {
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[iLicense + i2]);
                    i2++;
                }
            }
            interfaceC10952l.tapsense(0, 0, bArr2, bArr2);
            i -= interfaceC10952l.license();
            iLicense += interfaceC10952l.license();
        }
    }

    @Override // defpackage.firebase
    public final int doFinal(byte[] bArr, int i) throws C10352l, IOException {
        int i2;
        int i3;
        int i4;
        C15295l c15295l = this.remoteconfig;
        byte[] bArrVip = c15295l.vip();
        int size = c15295l.size();
        if (bArrVip.length < size) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (bArr.length - i < size) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        C15295l c15295l2 = this.smaato;
        if (c15295l2.size() > 0) {
            if (this.crashlytics) {
                billing(c15295l2.size(), c15295l.size(), c15295l2.vip());
            } else {
                billing(c15295l2.size(), c15295l.size() - this.loadAd, c15295l2.vip());
            }
        }
        boolean z = this.crashlytics;
        byte[] bArr2 = this.billing;
        byte[] bArr3 = this.firebase;
        byte[] bArr4 = this.subs;
        byte[] bArr5 = this.isPro;
        InterfaceC10952l interfaceC10952l = this.yandex;
        if (z) {
            if (size % interfaceC10952l.license() != 0) {
                C10754l.ad("partial blocks not supported");
                return 0;
            }
            crashlytics(size, bArrVip);
            interfaceC10952l.tapsense(0, 0, this.mopub, bArr5);
            int iLicense = size;
            int iLicense2 = 0;
            while (iLicense > 0) {
                amazon(iLicense2, i, bArrVip, bArr);
                iLicense -= interfaceC10952l.license();
                iLicense2 += interfaceC10952l.license();
                i += interfaceC10952l.license();
            }
            for (int i5 = 0; i5 < bArr3.length; i5++) {
                bArr5[i5] = (byte) (bArr5[i5] + bArr3[i5]);
            }
            interfaceC10952l.tapsense(0, 0, bArr5, bArr4);
            int i6 = 0;
            while (true) {
                i4 = this.loadAd;
                if (i6 >= i4) {
                    break;
                }
                bArr[i + i6] = (byte) (bArr4[i6] ^ bArr2[i6]);
                i6++;
            }
            System.arraycopy(bArr2, 0, this.purchase, 0, i4);
            mopub();
            i2 = size + this.loadAd;
        } else {
            if ((size - this.loadAd) % interfaceC10952l.license() != 0) {
                C10754l.ad("partial blocks not supported");
                return 0;
            }
            interfaceC10952l.tapsense(0, 0, this.mopub, bArr5);
            int iLicense3 = size / interfaceC10952l.license();
            int iLicense4 = 0;
            for (int i7 = 0; i7 < iLicense3; i7++) {
                amazon(iLicense4, i, bArrVip, bArr);
                iLicense4 += interfaceC10952l.license();
                i += interfaceC10952l.license();
            }
            if (size > iLicense4) {
                for (int i8 = 0; i8 < bArr3.length; i8++) {
                    bArr5[i8] = (byte) (bArr5[i8] + bArr3[i8]);
                }
                interfaceC10952l.tapsense(0, 0, bArr5, bArr4);
                int i9 = 0;
                while (true) {
                    i3 = this.loadAd;
                    if (i9 >= i3) {
                        break;
                    }
                    bArr[i + i9] = (byte) (bArr4[i9] ^ bArrVip[iLicense4 + i9]);
                    i9++;
                }
                i += i3;
            }
            for (int i10 = 0; i10 < bArr3.length; i10++) {
                bArr5[i10] = (byte) (bArr5[i10] + bArr3[i10]);
            }
            interfaceC10952l.tapsense(0, 0, bArr5, bArr4);
            int i11 = this.loadAd;
            System.arraycopy(bArr, i - i11, bArr4, 0, i11);
            crashlytics(i - this.loadAd, bArr);
            System.arraycopy(bArr2, 0, this.purchase, 0, this.loadAd);
            int i12 = this.loadAd;
            byte[] bArr6 = new byte[i12];
            System.arraycopy(bArr4, 0, bArr6, 0, i12);
            if (!AbstractC14024l.smaato(this.purchase, bArr6)) {
                C11467l.remoteconfig("mac check failed");
                return 0;
            }
            mopub();
            i2 = size - this.loadAd;
        }
        mopub();
        return i2;
    }

    @Override // defpackage.firebase
    public final String getAlgorithmName() {
        return this.yandex.getAlgorithmName().concat("/KCCM");
    }

    @Override // defpackage.firebase
    public final int getOutputSize(int i) {
        return i + this.loadAd;
    }

    @Override // defpackage.isPro
    public final InterfaceC10952l getUnderlyingCipher() {
        return this.yandex;
    }

    @Override // defpackage.firebase
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) throws IOException {
        InterfaceC9719l interfaceC9719l2;
        boolean z2 = interfaceC9719l instanceof remoteconfig;
        InterfaceC10952l interfaceC10952l = this.yandex;
        if (z2) {
            remoteconfig remoteconfigVar = (remoteconfig) interfaceC9719l;
            int i = remoteconfigVar.f36562l;
            if (i > 512 || i < 64 || i % 8 != 0) {
                C8339l.metrica("Invalid mac size specified");
                return;
            }
            this.mopub = AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
            this.loadAd = i / 8;
            this.amazon = AbstractC14024l.crashlytics(remoteconfigVar.f36561l);
            interfaceC9719l2 = remoteconfigVar.f36559l;
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica("Invalid parameters specified");
                return;
            }
            C0272l c0272l = (C0272l) interfaceC9719l;
            this.mopub = c0272l.f1273l;
            this.loadAd = interfaceC10952l.license();
            this.amazon = null;
            interfaceC9719l2 = c0272l.f1272l;
        }
        this.purchase = new byte[this.loadAd];
        this.crashlytics = z;
        interfaceC10952l.init(true, interfaceC9719l2);
        this.firebase[0] = 1;
        byte[] bArr = this.amazon;
        if (bArr != null) {
            yandex(0, bArr.length, bArr);
        }
    }

    @Override // defpackage.firebase
    public final byte[] loadAd() {
        return AbstractC14024l.crashlytics(this.purchase);
    }

    public final void mopub() throws IOException {
        Arrays.fill(this.admob, (byte) 0);
        Arrays.fill(this.subs, (byte) 0);
        byte[] bArr = this.firebase;
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(this.billing, (byte) 0);
        bArr[0] = 1;
        this.remoteconfig.reset();
        this.smaato.reset();
        byte[] bArr2 = this.amazon;
        if (bArr2 != null) {
            yandex(0, bArr2.length, bArr2);
        }
    }

    @Override // defpackage.firebase
    public final int processByte(byte b, byte[] bArr, int i) throws IOException {
        this.remoteconfig.write(b);
        return 0;
    }

    @Override // defpackage.firebase
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        if (bArr.length >= i + i2) {
            this.remoteconfig.write(bArr, i, i2);
            return 0;
        }
        C10754l.ad("input buffer too short");
        return 0;
    }

    @Override // defpackage.firebase
    public final void yandex(int i, int i2, byte[] bArr) throws IOException {
        this.smaato.write(bArr, i, i2);
    }

    @Override // defpackage.firebase
    public final int getUpdateOutputSize(int i) {
        return i;
    }
}
