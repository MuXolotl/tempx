package defpackage;

/* JADX INFO: renamed from: lْؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13155l extends AbstractC6568l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f25751l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C1196l f25752l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f25753l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f25754l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public byte[] f25755l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f25756l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f25757l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f25758l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f25759l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f25760l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final byte[] f25761l;

    public C13155l(C1196l c1196l, int i) {
        super(c1196l);
        this.f25759l = false;
        if (i < 0 || i > 128) {
            C8339l.metrica(AbstractC0653l.vip(128, "Parameter bitBlockSize must be in range 0 < bitBlockSize <= "));
            throw null;
        }
        this.f25757l = 16;
        this.f25752l = c1196l;
        int i2 = i / 8;
        this.f25754l = i2;
        this.f25761l = new byte[i2];
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        StringBuilder sb = new StringBuilder("GOST3412_2015/CFB");
        this.f25752l.getClass();
        sb.append(this.f25757l * 8);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.f25753l = z;
        boolean z2 = interfaceC9719l instanceof C0272l;
        C1196l c1196l = this.f25752l;
        int i = this.f25757l;
        if (z2) {
            C0272l c0272l = (C0272l) interfaceC9719l;
            byte[] bArr = c0272l.f1273l;
            if (bArr.length < i) {
                C8339l.metrica("Parameter m must blockSize <= m");
                return;
            }
            int length = bArr.length;
            this.f25751l = length;
            this.f25756l = new byte[length];
            this.f25760l = new byte[length];
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
            this.f25760l = bArrCrashlytics;
            System.arraycopy(bArrCrashlytics, 0, this.f25756l, 0, bArrCrashlytics.length);
            InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
            if (interfaceC9719l2 != null) {
                c1196l.init(true, interfaceC9719l2);
            }
        } else {
            int i2 = i * 2;
            this.f25751l = i2;
            byte[] bArr2 = new byte[i2];
            this.f25756l = bArr2;
            byte[] bArr3 = new byte[i2];
            this.f25760l = bArr3;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            if (interfaceC9719l != null) {
                c1196l.init(true, interfaceC9719l);
            }
        }
        this.f25759l = true;
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f25754l;
    }

    @Override // defpackage.AbstractC6568l
    public final byte loadAd(byte b) {
        int i = this.f25758l;
        int i2 = this.f25754l;
        if (i == 0) {
            byte[] bArrRemoteconfig = AbstractC14024l.remoteconfig(this.f25757l, this.f25756l);
            byte[] bArr = new byte[bArrRemoteconfig.length];
            this.f25752l.tapsense(0, 0, bArrRemoteconfig, bArr);
            this.f25755l = AbstractC14024l.remoteconfig(i2, bArr);
        }
        byte[] bArr2 = this.f25755l;
        int i3 = this.f25758l;
        byte b2 = (byte) (bArr2[i3] ^ b);
        int i4 = i3 + 1;
        this.f25758l = i4;
        if (this.f25753l) {
            b = b2;
        }
        byte[] bArr3 = this.f25761l;
        bArr3[i3] = b;
        if (i4 == i2) {
            this.f25758l = 0;
            byte[] bArr4 = this.f25756l;
            int i5 = this.f25751l - i2;
            byte[] bArr5 = new byte[i5];
            System.arraycopy(bArr4, bArr4.length - i5, bArr5, 0, i5);
            System.arraycopy(bArr5, 0, this.f25756l, 0, i5);
            System.arraycopy(bArr3, 0, this.f25756l, i5, this.f25751l - i5);
        }
        return b2;
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        this.f25758l = 0;
        AbstractC14024l.loadAd(this.f25761l);
        AbstractC14024l.loadAd(this.f25755l);
        if (this.f25759l) {
            byte[] bArr = this.f25760l;
            System.arraycopy(bArr, 0, this.f25756l, 0, bArr.length);
            this.f25752l.getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        processBytes(bArr, i, this.f25754l, bArr2, i2);
        return this.f25754l;
    }
}
