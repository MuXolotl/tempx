package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘؚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5332l extends AbstractC6568l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f11465l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC10952l f11466l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f11467l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f11468l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f11469l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f11470l;

    public C5332l(InterfaceC10952l interfaceC10952l) {
        super(interfaceC10952l);
        this.f11466l = interfaceC10952l;
        this.f11467l = new byte[interfaceC10952l.license()];
        this.f11465l = new byte[interfaceC10952l.license()];
        this.f11469l = new byte[interfaceC10952l.license()];
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return this.f11466l.getAlgorithmName().concat("/KCTR");
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.f11470l = true;
        if (!(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica("invalid parameter passed");
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr = c0272l.f1273l;
        byte[] bArr2 = this.f11467l;
        int length = bArr2.length - bArr.length;
        Arrays.fill(bArr2, (byte) 0);
        System.arraycopy(bArr, 0, bArr2, length, bArr.length);
        InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
        if (interfaceC9719l2 != null) {
            this.f11466l.init(true, interfaceC9719l2);
        }
        reset();
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f11466l.license();
    }

    @Override // defpackage.AbstractC6568l
    public final byte loadAd(byte b) {
        int i = this.f11468l;
        byte[] bArr = this.f11465l;
        byte[] bArr2 = this.f11469l;
        if (i != 0) {
            int i2 = i + 1;
            this.f11468l = i2;
            byte b2 = (byte) (b ^ bArr2[i]);
            if (i2 == bArr.length) {
                this.f11468l = 0;
            }
            return b2;
        }
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = i3 + 1;
            byte b3 = (byte) (bArr[i3] + 1);
            bArr[i3] = b3;
            if (b3 != 0) {
                break;
            }
            i3 = i4;
        }
        this.f11466l.tapsense(0, 0, bArr, bArr2);
        int i5 = this.f11468l;
        this.f11468l = i5 + 1;
        return (byte) (bArr2[i5] ^ b);
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        boolean z = this.f11470l;
        InterfaceC10952l interfaceC10952l = this.f11466l;
        if (z) {
            interfaceC10952l.tapsense(0, 0, this.f11467l, this.f11465l);
        }
        interfaceC10952l.reset();
        this.f11468l = 0;
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int length = bArr.length - i;
        InterfaceC10952l interfaceC10952l = this.f11466l;
        if (length < interfaceC10952l.license()) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (bArr2.length - i2 >= interfaceC10952l.license()) {
            processBytes(bArr, i, interfaceC10952l.license(), bArr2, i2);
            return interfaceC10952l.license();
        }
        C18073l.ad("output buffer too short");
        return 0;
    }
}
