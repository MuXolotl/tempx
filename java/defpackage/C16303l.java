package defpackage;

import java.util.Arrays;
import java.util.Vector;

/* JADX INFO: renamed from: lَٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16303l implements isPro {
    public byte[] Signature;
    public long adcel;
    public byte[] admob;
    public byte[] ads;
    public int amazon;
    public Vector billing;
    public boolean crashlytics;
    public byte[] firebase;
    public byte[] isPro;
    public byte[] license;
    public InterfaceC10952l loadAd;
    public int metrica;
    public byte[] mopub;
    public byte[] purchase;
    public byte[] remoteconfig;
    public byte[] smaato;
    public long startapp;
    public byte[] subs;
    public byte[] subscription;
    public byte[] tapsense;
    public int vip;
    public InterfaceC10952l yandex;

    public static void amazon(int i, byte[] bArr) {
        bArr[i] = -128;
        while (true) {
            i++;
            if (i >= 16) {
                return;
            } else {
                bArr[i] = 0;
            }
        }
    }

    public static void billing(byte[] bArr, byte[] bArr2) {
        AbstractC15269l.mopub(bArr2, 16, bArr);
    }

    public static byte[] crashlytics(byte[] bArr) {
        int i = 16;
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                bArr2[15] = (byte) (bArr2[15] ^ (135 >>> ((1 - i2) << 3)));
                return bArr2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    @Override // defpackage.firebase
    public final int doFinal(byte[] bArr, int i) throws C10352l {
        byte[] bArr2;
        InterfaceC10952l interfaceC10952l = this.yandex;
        byte[] bArr3 = this.tapsense;
        if (this.crashlytics) {
            bArr2 = null;
        } else {
            int i2 = this.metrica;
            int i3 = this.amazon;
            if (i2 < i3) {
                C11467l.remoteconfig("data too short");
                return 0;
            }
            int i4 = i2 - i3;
            this.metrica = i4;
            bArr2 = new byte[i3];
            System.arraycopy(this.remoteconfig, i4, bArr2, 0, i3);
        }
        int i5 = this.vip;
        if (i5 > 0) {
            amazon(i5, this.smaato);
            billing(this.ads, this.mopub);
            billing(this.smaato, this.ads);
            byte[] bArr4 = this.smaato;
            interfaceC10952l.tapsense(0, 0, bArr4, bArr4);
            billing(this.subscription, this.smaato);
        }
        int i6 = this.metrica;
        if (i6 > 0) {
            if (this.crashlytics) {
                amazon(i6, this.remoteconfig);
                billing(this.Signature, this.remoteconfig);
            }
            billing(bArr3, this.mopub);
            byte[] bArr5 = new byte[16];
            interfaceC10952l.tapsense(0, 0, bArr3, bArr5);
            billing(this.remoteconfig, bArr5);
            int length = bArr.length;
            int i7 = this.metrica;
            if (length < i + i7) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            System.arraycopy(this.remoteconfig, 0, bArr, i, i7);
            if (!this.crashlytics) {
                amazon(this.metrica, this.remoteconfig);
                billing(this.Signature, this.remoteconfig);
            }
        }
        billing(this.Signature, bArr3);
        billing(this.Signature, this.admob);
        byte[] bArr6 = this.Signature;
        interfaceC10952l.tapsense(0, 0, bArr6, bArr6);
        billing(this.Signature, this.subscription);
        int i8 = this.amazon;
        byte[] bArr7 = new byte[i8];
        this.license = bArr7;
        System.arraycopy(this.Signature, 0, bArr7, 0, i8);
        int i9 = this.metrica;
        if (this.crashlytics) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.amazon;
            if (length2 < i10 + i11) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            System.arraycopy(this.license, 0, bArr, i10, i11);
            i9 += this.amazon;
        } else if (!AbstractC14024l.smaato(this.license, bArr2)) {
            C11467l.remoteconfig("mac check in OCB failed");
            return 0;
        }
        interfaceC10952l.reset();
        this.loadAd.reset();
        byte[] bArr8 = this.smaato;
        if (bArr8 != null) {
            Arrays.fill(bArr8, (byte) 0);
        }
        byte[] bArr9 = this.remoteconfig;
        if (bArr9 != null) {
            Arrays.fill(bArr9, (byte) 0);
        }
        this.vip = 0;
        this.metrica = 0;
        this.startapp = 0L;
        this.adcel = 0L;
        byte[] bArr10 = this.ads;
        if (bArr10 != null) {
            Arrays.fill(bArr10, (byte) 0);
        }
        byte[] bArr11 = this.subscription;
        if (bArr11 != null) {
            Arrays.fill(bArr11, (byte) 0);
        }
        System.arraycopy(this.firebase, 0, bArr3, 0, 16);
        byte[] bArr12 = this.Signature;
        if (bArr12 != null) {
            Arrays.fill(bArr12, (byte) 0);
        }
        byte[] bArr13 = this.purchase;
        if (bArr13 != null) {
            yandex(0, bArr13.length, bArr13);
        }
        return i9;
    }

    @Override // defpackage.firebase
    public final String getAlgorithmName() {
        return this.loadAd.getAlgorithmName().concat("/OCB");
    }

    @Override // defpackage.firebase
    public final int getOutputSize(int i) {
        int i2 = i + this.metrica;
        boolean z = this.crashlytics;
        int i3 = this.amazon;
        if (z) {
            return i2 + i3;
        }
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.isPro
    public final InterfaceC10952l getUnderlyingCipher() {
        return this.loadAd;
    }

    @Override // defpackage.firebase
    public final int getUpdateOutputSize(int i) {
        int i2 = i + this.metrica;
        if (!this.crashlytics) {
            int i3 = this.amazon;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // defpackage.firebase
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        byte[] bArrCrashlytics;
        C13886l c13886l;
        byte[] bArr = this.firebase;
        byte[] bArr2 = this.isPro;
        InterfaceC10952l interfaceC10952l = this.yandex;
        boolean z2 = this.crashlytics;
        this.crashlytics = z;
        this.license = null;
        if (interfaceC9719l instanceof remoteconfig) {
            remoteconfig remoteconfigVar = (remoteconfig) interfaceC9719l;
            bArrCrashlytics = AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
            this.purchase = AbstractC14024l.crashlytics(remoteconfigVar.f36561l);
            int i = remoteconfigVar.f36562l;
            if (i < 64 || i > 128 || i % 8 != 0) {
                C8339l.metrica(AbstractC0653l.vip(i, "Invalid value for MAC size: "));
                return;
            } else {
                this.amazon = i / 8;
                c13886l = remoteconfigVar.f36559l;
            }
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica("invalid parameters passed to OCB");
                return;
            }
            C0272l c0272l = (C0272l) interfaceC9719l;
            bArrCrashlytics = c0272l.f1273l;
            this.purchase = null;
            this.amazon = 16;
            c13886l = (C13886l) c0272l.f1272l;
        }
        this.smaato = new byte[16];
        this.remoteconfig = new byte[z ? 16 : this.amazon + 16];
        if (bArrCrashlytics == null) {
            bArrCrashlytics = new byte[0];
        }
        if (bArrCrashlytics.length > 15) {
            C8339l.metrica("IV must be no more than 15 bytes");
            return;
        }
        if (c13886l != null) {
            interfaceC10952l.init(true, c13886l);
            this.loadAd.init(z, c13886l);
            this.subs = null;
        } else if (z2 != z) {
            C8339l.metrica("cannot change encrypting state without providing key.");
            return;
        }
        byte[] bArr3 = new byte[16];
        this.mopub = bArr3;
        interfaceC10952l.tapsense(0, 0, bArr3, bArr3);
        this.admob = crashlytics(this.mopub);
        Vector vector = new Vector();
        this.billing = vector;
        vector.addElement(crashlytics(this.admob));
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArrCrashlytics, 0, bArr4, 16 - bArrCrashlytics.length, bArrCrashlytics.length);
        bArr4[0] = (byte) (this.amazon << 4);
        int length = 15 - bArrCrashlytics.length;
        bArr4[length] = (byte) (bArr4[length] | 1);
        byte b = bArr4[15];
        int i2 = b & 63;
        bArr4[15] = (byte) (b & 192);
        byte[] bArr5 = this.subs;
        if (bArr5 == null || !Arrays.equals(bArr4, bArr5)) {
            byte[] bArr6 = new byte[16];
            this.subs = bArr4;
            interfaceC10952l.tapsense(0, 0, bArr4, bArr6);
            System.arraycopy(bArr6, 0, bArr2, 0, 16);
            int i3 = 0;
            while (i3 < 8) {
                int i4 = i3 + 16;
                byte b2 = bArr6[i3];
                i3++;
                bArr2[i4] = (byte) (b2 ^ bArr6[i3]);
            }
        }
        int i5 = i2 % 8;
        int i6 = i2 / 8;
        if (i5 == 0) {
            System.arraycopy(bArr2, i6, bArr, 0, 16);
        } else {
            for (int i7 = 0; i7 < 16; i7++) {
                int i8 = bArr2[i6] & 255;
                i6++;
                bArr[i7] = (byte) ((i8 << i5) | ((bArr2[i6] & 255) >>> (8 - i5)));
            }
        }
        this.vip = 0;
        this.metrica = 0;
        this.startapp = 0L;
        this.adcel = 0L;
        this.ads = new byte[16];
        this.subscription = new byte[16];
        System.arraycopy(bArr, 0, this.tapsense, 0, 16);
        this.Signature = new byte[16];
        byte[] bArr7 = this.purchase;
        if (bArr7 != null) {
            yandex(0, bArr7.length, bArr7);
        }
    }

    @Override // defpackage.firebase
    public final byte[] loadAd() {
        byte[] bArr = this.license;
        return bArr == null ? new byte[this.amazon] : AbstractC14024l.crashlytics(bArr);
    }

    @Override // defpackage.firebase
    public final int processByte(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.remoteconfig;
        int i2 = this.metrica;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.metrica = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        purchase(i, bArr);
        return 16;
    }

    @Override // defpackage.firebase
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            C10754l.ad("Input buffer too short");
            return 0;
        }
        if (bArr == bArr2 && AbstractC14024l.ad(i, i2, i3, getUpdateOutputSize(i2))) {
            bArr = new byte[i2];
            System.arraycopy(bArr2, i, bArr, 0, i2);
            i = 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte[] bArr3 = this.remoteconfig;
            int i6 = this.metrica;
            bArr3[i6] = bArr[i + i5];
            int i7 = i6 + 1;
            this.metrica = i7;
            if (i7 == bArr3.length) {
                purchase(i3 + i4, bArr2);
                i4 += 16;
            }
        }
        return i4;
    }

    public final void purchase(int i, byte[] bArr) {
        Vector vector;
        byte[] bArr2 = this.tapsense;
        if (bArr.length < i + 16) {
            C18073l.ad("Output buffer too short");
            return;
        }
        if (this.crashlytics) {
            billing(this.Signature, this.remoteconfig);
            this.metrica = 0;
        }
        long j = this.adcel + 1;
        this.adcel = j;
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        while (true) {
            int size = this.billing.size();
            vector = this.billing;
            if (iNumberOfTrailingZeros < size) {
                break;
            } else {
                vector.addElement(crashlytics((byte[]) vector.lastElement()));
            }
        }
        billing(bArr2, (byte[]) vector.elementAt(iNumberOfTrailingZeros));
        billing(this.remoteconfig, bArr2);
        InterfaceC10952l interfaceC10952l = this.loadAd;
        byte[] bArr3 = this.remoteconfig;
        interfaceC10952l.tapsense(0, 0, bArr3, bArr3);
        billing(this.remoteconfig, bArr2);
        System.arraycopy(this.remoteconfig, 0, bArr, i, 16);
        if (this.crashlytics) {
            return;
        }
        billing(this.Signature, this.remoteconfig);
        byte[] bArr4 = this.remoteconfig;
        System.arraycopy(bArr4, 16, bArr4, 0, this.amazon);
        this.metrica = this.amazon;
    }

    @Override // defpackage.firebase
    public final void yandex(int i, int i2, byte[] bArr) {
        Vector vector;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.smaato;
            int i4 = this.vip;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.vip = i5;
            if (i5 == bArr2.length) {
                long j = this.startapp + 1;
                this.startapp = j;
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                while (true) {
                    int size = this.billing.size();
                    vector = this.billing;
                    if (iNumberOfTrailingZeros < size) {
                        break;
                    } else {
                        vector.addElement(crashlytics((byte[]) vector.lastElement()));
                    }
                }
                billing(this.ads, (byte[]) vector.elementAt(iNumberOfTrailingZeros));
                billing(this.smaato, this.ads);
                InterfaceC10952l interfaceC10952l = this.yandex;
                byte[] bArr3 = this.smaato;
                interfaceC10952l.tapsense(0, 0, bArr3, bArr3);
                billing(this.subscription, this.smaato);
                this.vip = 0;
            }
        }
    }
}
