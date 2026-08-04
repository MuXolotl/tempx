package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٍؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1736l implements firebase {
    public static final byte[] smaato = new byte[15];
    public long admob;
    public final byte[] amazon;
    public final byte[] billing;
    public final byte[] crashlytics;
    public int firebase;
    public int isPro;
    public final C7626l loadAd;
    public byte[] mopub;
    public final byte[] purchase;
    public long subs;
    public final C11628l yandex;

    public C1736l() {
        C7626l c7626l = new C7626l();
        this.crashlytics = new byte[32];
        this.amazon = new byte[12];
        this.purchase = new byte[80];
        this.billing = new byte[16];
        this.isPro = 0;
        this.yandex = new C11628l();
        this.loadAd = c7626l;
    }

    public final void amazon(int i) {
        int i2 = ((int) this.subs) & 15;
        C7626l c7626l = this.loadAd;
        if (i2 != 0) {
            c7626l.update(smaato, 0, 16 - i2);
        }
        byte[] bArr = new byte[16];
        AbstractC10000l.pro(this.admob, bArr, 0);
        AbstractC10000l.pro(this.subs, bArr, 8);
        c7626l.update(bArr, 0, 16);
        c7626l.doFinal(this.billing, 0);
        this.isPro = i;
    }

    public final void billing(boolean z, boolean z2) {
        Arrays.fill(this.purchase, (byte) 0);
        if (z) {
            Arrays.fill(this.billing, (byte) 0);
        }
        this.admob = 0L;
        this.subs = 0L;
        this.firebase = 0;
        switch (this.isPro) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.isPro = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.isPro = 5;
                break;
            default:
                C18073l.admob();
                return;
        }
        if (z2) {
            this.yandex.reset();
        }
        byte[] bArr = new byte[64];
        try {
            this.yandex.processBytes(bArr, 0, 64, bArr, 0);
            this.loadAd.init(new C13886l(bArr, 0, 32));
            Arrays.fill(bArr, (byte) 0);
            byte[] bArr2 = this.mopub;
            if (bArr2 != null) {
                yandex(0, bArr2.length, bArr2);
            }
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
    }

    public final void crashlytics() {
        int i = this.isPro;
        byte[] bArr = smaato;
        C7626l c7626l = this.loadAd;
        switch (i) {
            case 1:
            case 2:
                int i2 = ((int) this.admob) & 15;
                if (i2 != 0) {
                    c7626l.update(bArr, 0, 16 - i2);
                }
                this.isPro = 3;
                break;
            case 3:
            case 7:
                break;
            case 4:
                C8339l.smaato("ChaCha20Poly1305 cannot be reused for encryption");
                break;
            case 5:
            case 6:
                int i3 = ((int) this.admob) & 15;
                if (i3 != 0) {
                    c7626l.update(bArr, 0, 16 - i3);
                }
                this.isPro = 7;
                break;
            default:
                C18073l.admob();
                break;
        }
    }

    @Override // defpackage.firebase
    public final int doFinal(byte[] bArr, int i) throws C10352l {
        C1736l c1736l;
        int i2;
        if (bArr == null) {
            C6541l.subs("'out' cannot be null");
            return 0;
        }
        if (i < 0) {
            C8339l.metrica("'outOff' cannot be negative");
            return 0;
        }
        crashlytics();
        byte[] bArr2 = this.billing;
        Arrays.fill(bArr2, (byte) 0);
        int i3 = this.isPro;
        byte[] bArr3 = this.purchase;
        C7626l c7626l = this.loadAd;
        if (i3 == 3) {
            int i4 = this.firebase;
            int i5 = i4 + 16;
            if (i > bArr.length - i5) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            if (i4 > 0) {
                c1736l = this;
                c1736l.purchase(bArr3, 0, i4, bArr, i);
                c7626l.update(bArr, i, c1736l.firebase);
            } else {
                c1736l = this;
            }
            c1736l.amazon(4);
            System.arraycopy(bArr2, 0, bArr, i + c1736l.firebase, 16);
            i2 = i5;
        } else {
            if (i3 != 7) {
                C18073l.admob();
                return 0;
            }
            int i6 = this.firebase;
            if (i6 < 16) {
                C11467l.remoteconfig("data too short");
                return 0;
            }
            i2 = i6 - 16;
            if (i > bArr.length - i2) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            if (i2 > 0) {
                c7626l.update(bArr3, 0, i2);
                purchase(bArr3, 0, i2, bArr, i);
            }
            amazon(8);
            if (!AbstractC14024l.firebase(bArr2, 16, 0, bArr3, i2)) {
                C11467l.remoteconfig("mac check in ChaCha20Poly1305 failed");
                return 0;
            }
            c1736l = this;
        }
        c1736l.billing(false, true);
        return i2;
    }

    @Override // defpackage.firebase
    public final String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // defpackage.firebase
    public final int getOutputSize(int i) {
        int iMax = Math.max(0, i) + this.firebase;
        int i2 = this.isPro;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return iMax + 16;
        }
        if (i2 == 5 || i2 == 6 || i2 == 7) {
            return Math.max(0, iMax - 16);
        }
        C18073l.admob();
        return 0;
    }

    @Override // defpackage.firebase
    public final int getUpdateOutputSize(int i) {
        int iMax = Math.max(0, i) + this.firebase;
        int i2 = this.isPro;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                C18073l.admob();
                return 0;
            }
            iMax = Math.max(0, iMax - 16);
        }
        return iMax - (iMax % 64);
    }

    @Override // defpackage.firebase
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        C0272l c0272l;
        C13886l c13886l;
        byte[] bArrCrashlytics;
        if (interfaceC9719l instanceof remoteconfig) {
            remoteconfig remoteconfigVar = (remoteconfig) interfaceC9719l;
            int i = remoteconfigVar.f36562l;
            if (128 != i) {
                C8339l.metrica(AbstractC0653l.vip(i, "Invalid value for MAC size: "));
                return;
            }
            c13886l = remoteconfigVar.f36559l;
            bArrCrashlytics = AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
            c0272l = new C0272l(c13886l, bArrCrashlytics);
            this.mopub = AbstractC14024l.crashlytics(remoteconfigVar.f36561l);
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica("invalid parameters passed to ChaCha20Poly1305");
                return;
            }
            c0272l = (C0272l) interfaceC9719l;
            c13886l = (C13886l) c0272l.f1272l;
            bArrCrashlytics = c0272l.f1273l;
            this.mopub = null;
        }
        if (c13886l == null) {
            if (this.isPro == 0) {
                C8339l.metrica("Key must be specified in initial init");
                return;
            }
        } else if (32 != c13886l.f27156l.length) {
            C8339l.metrica("Key must be 256 bits");
            return;
        }
        if (bArrCrashlytics == null || 12 != bArrCrashlytics.length) {
            C8339l.metrica("Nonce must be 96 bits");
            return;
        }
        int i2 = this.isPro;
        byte[] bArr = this.crashlytics;
        byte[] bArr2 = this.amazon;
        if (i2 != 0 && z && Arrays.equals(bArr2, bArrCrashlytics) && (c13886l == null || Arrays.equals(bArr, c13886l.f27156l))) {
            C8339l.metrica("cannot reuse nonce for ChaCha20Poly1305 encryption");
            return;
        }
        if (c13886l != null) {
            byte[] bArr3 = c13886l.f27156l;
            if (bArr3.length != 32) {
                C8339l.metrica("len");
                return;
            }
            System.arraycopy(bArr3, 0, bArr, 0, 32);
        }
        System.arraycopy(bArrCrashlytics, 0, bArr2, 0, 12);
        this.yandex.init(true, c0272l);
        this.isPro = z ? 1 : 5;
        billing(true, false);
    }

    @Override // defpackage.firebase
    public final byte[] loadAd() {
        return AbstractC14024l.crashlytics(this.billing);
    }

    @Override // defpackage.firebase
    public final int processByte(byte b, byte[] bArr, int i) {
        crashlytics();
        int i2 = this.isPro;
        C7626l c7626l = this.loadAd;
        byte[] bArr2 = this.purchase;
        if (i2 == 3) {
            int i3 = this.firebase;
            bArr2[i3] = b;
            int i4 = i3 + 1;
            this.firebase = i4;
            if (i4 == 64) {
                purchase(bArr2, 0, 64, bArr, i);
                c7626l.update(bArr, i, 64);
                this.firebase = 0;
                return 64;
            }
        } else {
            if (i2 != 7) {
                C18073l.admob();
                return 0;
            }
            int i5 = this.firebase;
            bArr2[i5] = b;
            int i6 = i5 + 1;
            this.firebase = i6;
            if (i6 == bArr2.length) {
                c7626l.update(bArr2, 0, 64);
                purchase(bArr2, 0, 64, bArr, i);
                System.arraycopy(bArr2, 64, bArr2, 0, 16);
                this.firebase = 16;
                return 64;
            }
        }
        return 0;
    }

    @Override // defpackage.firebase
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        byte[] bArr4;
        int i4;
        int i5;
        int i6;
        byte[] bArr5 = bArr;
        int i7 = i;
        int i8 = i2;
        if (bArr5 == null) {
            C6541l.subs("'in' cannot be null");
            return 0;
        }
        if (i7 < 0) {
            C8339l.metrica("'inOff' cannot be negative");
            return 0;
        }
        if (i8 < 0) {
            C8339l.metrica("'len' cannot be negative");
            return 0;
        }
        if (i7 > bArr5.length - i8) {
            C10754l.ad("Input buffer too short");
            return 0;
        }
        if (i3 < 0) {
            C8339l.metrica("'outOff' cannot be negative");
            return 0;
        }
        if (bArr5 == bArr2 && AbstractC14024l.ad(i7, i8, i3, getUpdateOutputSize(i8))) {
            bArr5 = new byte[i8];
            System.arraycopy(bArr2, i7, bArr5, 0, i8);
            i7 = 0;
        }
        byte[] bArr6 = bArr5;
        crashlytics();
        int i9 = this.isPro;
        C7626l c7626l = this.loadAd;
        byte[] bArr7 = this.purchase;
        if (i9 != 3) {
            if (i9 != 7) {
                C18073l.admob();
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = this.firebase;
                bArr7[i12] = bArr6[i7 + i11];
                int i13 = i12 + 1;
                this.firebase = i13;
                if (i13 == bArr7.length) {
                    c7626l.update(bArr7, 0, 64);
                    purchase(bArr7, 0, 64, bArr2, i3 + i10);
                    System.arraycopy(bArr7, 64, bArr7, 0, 16);
                    this.firebase = 16;
                    i10 += 64;
                }
            }
            return i10;
        }
        if (this.firebase == 0) {
            bArr3 = bArr7;
            bArr4 = bArr2;
            i4 = i8;
            i5 = 0;
            i6 = i7;
            break;
        }
        while (true) {
            if (i8 <= 0) {
                bArr3 = bArr7;
                bArr4 = bArr2;
                i4 = i8;
                i5 = 0;
                i6 = i7;
                break;
            }
            i4 = i8 - 1;
            int i14 = this.firebase;
            int i15 = i7 + 1;
            bArr7[i14] = bArr6[i7];
            int i16 = i14 + 1;
            this.firebase = i16;
            if (i16 == 64) {
                byte[] bArr8 = bArr7;
                bArr4 = bArr2;
                purchase(bArr8, 0, 64, bArr4, i3);
                bArr3 = bArr8;
                c7626l.update(bArr4, i3, 64);
                this.firebase = 0;
                i6 = i15;
                i5 = 64;
                break;
            }
            i8 = i4;
            i7 = i15;
            bArr7 = bArr7;
        }
        while (i4 >= 64) {
            int i17 = i3 + i5;
            purchase(bArr6, i6, 64, bArr4, i17);
            c7626l.update(bArr4, i17, 64);
            i6 += 64;
            i4 -= 64;
            i5 += 64;
        }
        if (i4 > 0) {
            System.arraycopy(bArr6, i6, bArr3, 0, i4);
            this.firebase = i4;
        }
        return i5;
    }

    public final void purchase(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 > bArr2.length - i2) {
            C18073l.ad("Output buffer too short");
            return;
        }
        this.yandex.processBytes(bArr, i, i2, bArr2, i3);
        long j = this.subs;
        long j2 = i2;
        if (AbstractC6660l.crashlytics(j, 274877906880L - j2) <= 0) {
            this.subs = j + j2;
        } else {
            C8339l.smaato("Limit exceeded");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0020 A[PHI: r2
  0x0020: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:8:0x000e, B:13:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.firebase
    public final void yandex(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            C6541l.subs("'in' cannot be null");
            return;
        }
        if (i < 0) {
            C8339l.metrica("'inOff' cannot be negative");
            return;
        }
        if (i2 < 0) {
            C8339l.metrica("'len' cannot be negative");
            return;
        }
        if (i > bArr.length - i2) {
            C10754l.ad("Input buffer too short");
            return;
        }
        int i3 = this.isPro;
        int i4 = 2;
        if (i3 == 1) {
            this.isPro = i4;
        } else if (i3 != 2) {
            if (i3 == 4) {
                C8339l.smaato("ChaCha20Poly1305 cannot be reused for encryption");
                return;
            }
            i4 = 6;
            if (i3 == 5) {
                this.isPro = i4;
            } else if (i3 != 6) {
                C18073l.admob();
                return;
            }
        }
        if (i2 > 0) {
            long j = this.admob;
            long j2 = i2;
            if (AbstractC6660l.crashlytics(j, (-1) - j2) > 0) {
                C8339l.smaato("Limit exceeded");
            } else {
                this.admob = j + j2;
                this.loadAd.update(bArr, i, i2);
            }
        }
    }
}
