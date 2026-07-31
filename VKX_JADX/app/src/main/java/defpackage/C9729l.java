package defpackage;

/* JADX INFO: renamed from: lٍٟٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9729l extends AbstractC6568l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f19843l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public byte[] f19844l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C1196l f19845l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19846l = 0;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f19847l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f19848l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f19849l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f19850l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f19851l;

    public C9729l(C1196l c1196l) {
        super(c1196l);
        this.f19850l = 0;
        this.f19845l = c1196l;
        this.f19849l = 16;
        this.f19843l = 16;
        this.f19848l = new byte[16];
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        switch (this.f19846l) {
            case 0:
                this.f19845l.getClass();
                return "GOST3412_2015/GCTR";
            default:
                this.f19845l.getClass();
                return "GOST3412_2015/OFB";
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a A[PHI: r8
  0x004a: PHI (r8v2 lٍٟٞ) = (r8v0 lٍٟٞ), (r8v4 lٍٟٞ) binds: [B:13:0x0048, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        switch (this.f19846l) {
            case 0:
                int i = this.f19843l;
                C1196l c1196l = this.f19845l;
                int i2 = this.f19849l;
                if (interfaceC9719l instanceof C0272l) {
                    C0272l c0272l = (C0272l) interfaceC9719l;
                    this.f19851l = new byte[i2 / 2];
                    this.f19848l = new byte[i2];
                    this.f19844l = new byte[i];
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c0272l.f1273l);
                    this.f19851l = bArrCrashlytics;
                    if (bArrCrashlytics.length != i2 / 2) {
                        C8339l.metrica("Parameter IV length must be == blockSize/2");
                    } else {
                        System.arraycopy(bArrCrashlytics, 0, this.f19848l, 0, bArrCrashlytics.length);
                        for (int length = this.f19851l.length; length < i2; length++) {
                            this.f19848l[length] = 0;
                        }
                        InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
                        if (interfaceC9719l2 != null) {
                            c1196l.init(true, interfaceC9719l2);
                        }
                    }
                } else {
                    this.f19851l = new byte[i2 / 2];
                    this.f19848l = new byte[i2];
                    this.f19844l = new byte[i];
                    if (interfaceC9719l != null) {
                        c1196l.init(true, interfaceC9719l);
                    }
                }
                this.f19847l = true;
                break;
            default:
                C1196l c1196l2 = this.f19845l;
                int i3 = this.f19849l;
                if (interfaceC9719l instanceof C0272l) {
                    C0272l c0272l2 = (C0272l) interfaceC9719l;
                    byte[] bArr = c0272l2.f1273l;
                    if (bArr.length < i3) {
                        C8339l.metrica("Parameter m must blockSize <= m");
                    } else {
                        int length2 = bArr.length;
                        this.f19843l = length2;
                        this.f19848l = new byte[length2];
                        this.f19851l = new byte[length2];
                        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArr);
                        this.f19851l = bArrCrashlytics2;
                        System.arraycopy(bArrCrashlytics2, 0, this.f19848l, 0, bArrCrashlytics2.length);
                        interfaceC9719l = c0272l2.f1272l;
                        if (interfaceC9719l != null) {
                            c1196l2.init(true, interfaceC9719l);
                        }
                    }
                } else {
                    int i4 = i3 * 2;
                    this.f19843l = i4;
                    byte[] bArr2 = new byte[i4];
                    this.f19848l = bArr2;
                    byte[] bArr3 = new byte[i4];
                    this.f19851l = bArr3;
                    System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                    if (interfaceC9719l != null) {
                        c1196l2.init(true, interfaceC9719l);
                    }
                }
                this.f19847l = true;
                break;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        switch (this.f19846l) {
            case 0:
                return this.f19843l;
            default:
                return this.f19849l;
        }
    }

    @Override // defpackage.AbstractC6568l
    public final byte loadAd(byte b) {
        switch (this.f19846l) {
            case 0:
                int i = this.f19843l;
                if (this.f19850l == 0) {
                    byte[] bArr = this.f19848l;
                    byte[] bArr2 = new byte[bArr.length];
                    this.f19845l.tapsense(0, 0, bArr, bArr2);
                    this.f19844l = AbstractC14024l.remoteconfig(i, bArr2);
                }
                byte[] bArr3 = this.f19844l;
                int i2 = this.f19850l;
                byte b2 = (byte) (b ^ bArr3[i2]);
                int i3 = i2 + 1;
                this.f19850l = i3;
                if (i3 == i) {
                    this.f19850l = 0;
                    int length = this.f19848l.length - 1;
                    do {
                        byte[] bArr4 = this.f19848l;
                        byte b3 = (byte) (bArr4[length] + 1);
                        bArr4[length] = b3;
                        if (b3 == 0) {
                            length--;
                        }
                    } while (length != this.f19851l.length - 1);
                    C8339l.smaato("attempt to process too many blocks");
                    return (byte) 0;
                }
                return b2;
            default:
                int i4 = this.f19849l;
                byte[] bArr5 = this.f19844l;
                if (this.f19850l == 0) {
                    this.f19845l.tapsense(0, 0, AbstractC14024l.remoteconfig(i4, this.f19848l), bArr5);
                }
                int i5 = this.f19850l;
                byte b4 = (byte) (b ^ bArr5[i5]);
                int i6 = i5 + 1;
                this.f19850l = i6;
                if (i6 == i4) {
                    this.f19850l = 0;
                    byte[] bArr6 = this.f19848l;
                    int i7 = this.f19843l - i4;
                    byte[] bArr7 = new byte[i7];
                    System.arraycopy(bArr6, bArr6.length - i7, bArr7, 0, i7);
                    System.arraycopy(bArr7, 0, this.f19848l, 0, i7);
                    System.arraycopy(bArr5, 0, this.f19848l, i7, this.f19843l - i7);
                }
                return b4;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        switch (this.f19846l) {
            case 0:
                if (this.f19847l) {
                    byte[] bArr = this.f19851l;
                    System.arraycopy(bArr, 0, this.f19848l, 0, bArr.length);
                    for (int length = this.f19851l.length; length < this.f19849l; length++) {
                        this.f19848l[length] = 0;
                    }
                    this.f19850l = 0;
                    this.f19845l.getClass();
                }
                break;
            default:
                if (this.f19847l) {
                    byte[] bArr2 = this.f19851l;
                    System.arraycopy(bArr2, 0, this.f19848l, 0, bArr2.length);
                    AbstractC14024l.loadAd(this.f19844l);
                    this.f19850l = 0;
                    this.f19845l.getClass();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        switch (this.f19846l) {
            case 0:
                processBytes(bArr, i, this.f19843l, bArr2, i2);
                return this.f19843l;
            default:
                processBytes(bArr, i, this.f19849l, bArr2, i2);
                return this.f19849l;
        }
    }

    public /* synthetic */ C9729l(InterfaceC10952l interfaceC10952l) {
        super(interfaceC10952l);
    }
}
