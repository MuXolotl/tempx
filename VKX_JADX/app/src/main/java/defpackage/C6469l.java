package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lؙٔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6469l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f13502l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f13503l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f13504l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f13505l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f13506l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f13507l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Serializable f13508l;

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "GOST3412_2015/CBC";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048 A[PHI: r7
  0x0048: PHI (r7v1 lٍٟٞ) = (r7v0 lٍٟٞ), (r7v3 lٍٟٞ) binds: [B:12:0x0046, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        C1196l c1196l = (C1196l) this.f13503l;
        int i = this.f13504l;
        this.f13507l = z;
        if (interfaceC9719l instanceof C0272l) {
            C0272l c0272l = (C0272l) interfaceC9719l;
            byte[] bArr = c0272l.f1273l;
            if (bArr.length < i) {
                C8339l.metrica("Parameter m must blockSize <= m");
                return;
            }
            int length = bArr.length;
            this.f13505l = length;
            this.f13506l = new byte[length];
            this.f13508l = new byte[length];
            ?? Crashlytics = AbstractC14024l.crashlytics(bArr);
            this.f13508l = Crashlytics;
            System.arraycopy(Crashlytics, 0, (byte[]) this.f13506l, 0, Crashlytics.length);
            interfaceC9719l = c0272l.f1272l;
            if (interfaceC9719l != null) {
                c1196l.init(z, interfaceC9719l);
            }
        } else {
            this.f13505l = i;
            byte[] bArr2 = new byte[i];
            this.f13506l = bArr2;
            ?? r1 = new byte[i];
            this.f13508l = r1;
            System.arraycopy(r1, 0, bArr2, 0, r1.length);
            if (interfaceC9719l != null) {
                c1196l.init(z, interfaceC9719l);
            }
        }
        this.f13502l = true;
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return this.f13504l;
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
        if (this.f13502l) {
            byte[] bArr = (byte[]) this.f13508l;
            System.arraycopy(bArr, 0, (byte[]) this.f13506l, 0, bArr.length);
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        C1196l c1196l = (C1196l) this.f13503l;
        int length = this.f13504l;
        boolean z = this.f13507l;
        byte[] bArr3 = (byte[]) this.f13506l;
        if (z) {
            byte[] bArrRemoteconfig = AbstractC14024l.remoteconfig(length, bArr3);
            if (bArr.length < length + i) {
                length = bArr.length - i;
            }
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i, bArr4, 0, length);
            byte[] bArr5 = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                bArr5[i3] = (byte) (bArr4[i3] ^ bArrRemoteconfig[i3]);
            }
            byte[] bArr6 = new byte[length];
            c1196l.tapsense(0, 0, bArr5, bArr6);
            System.arraycopy(bArr6, 0, bArr2, i2, length);
            if (bArr2.length > i2 + length) {
                yandex(bArr6);
            }
            return length;
        }
        byte[] bArrRemoteconfig2 = AbstractC14024l.remoteconfig(length, bArr3);
        if (bArr.length < length + i) {
            length = bArr.length - i;
        }
        byte[] bArr7 = new byte[length];
        System.arraycopy(bArr, i, bArr7, 0, length);
        byte[] bArr8 = new byte[length];
        c1196l.tapsense(0, 0, bArr7, bArr8);
        byte[] bArr9 = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr9[i4] = (byte) (bArr8[i4] ^ bArrRemoteconfig2[i4]);
        }
        System.arraycopy(bArr9, 0, bArr2, i2, length);
        if (bArr2.length > i2 + length) {
            yandex(bArr7);
        }
        return length;
    }

    public void yandex(byte[] bArr) {
        byte[] bArr2 = (byte[]) this.f13506l;
        int i = this.f13505l - this.f13504l;
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, bArr2.length - i, bArr3, 0, i);
        System.arraycopy(bArr3, 0, (byte[]) this.f13506l, 0, i);
        System.arraycopy(bArr, 0, (byte[]) this.f13506l, i, this.f13505l - i);
    }
}
