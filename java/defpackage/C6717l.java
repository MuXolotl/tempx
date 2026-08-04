package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؙۙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6717l extends AbstractC6568l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f14078l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC10952l f14079l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f14080l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f14081l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f14082l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f14083l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f14084l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f14085l;

    public C6717l(InterfaceC10952l interfaceC10952l, int i) {
        super(interfaceC10952l);
        this.f14079l = null;
        if (i > interfaceC10952l.license() * 8 || i < 8 || i % 8 != 0) {
            C8339l.metrica(AbstractC15560l.tapsense("CFB", i, " not supported"));
            throw null;
        }
        this.f14079l = interfaceC10952l;
        int i2 = i / 8;
        this.f14085l = i2;
        this.f14081l = new byte[interfaceC10952l.license()];
        this.f14078l = new byte[interfaceC10952l.license()];
        this.f14083l = new byte[interfaceC10952l.license()];
        this.f14082l = new byte[i2];
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return this.f14079l.getAlgorithmName() + "/CFB" + (this.f14085l * 8);
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.f14080l = z;
        boolean z2 = interfaceC9719l instanceof C0272l;
        InterfaceC10952l interfaceC10952l = this.f14079l;
        if (!z2) {
            reset();
            if (interfaceC9719l != null) {
                interfaceC10952l.init(true, interfaceC9719l);
                return;
            }
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr = c0272l.f1273l;
        int length = bArr.length;
        byte[] bArr2 = this.f14081l;
        if (length < bArr2.length) {
            System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
            for (int i = 0; i < bArr2.length - bArr.length; i++) {
                bArr2[i] = 0;
            }
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }
        reset();
        InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
        if (interfaceC9719l2 != null) {
            interfaceC10952l.init(true, interfaceC9719l2);
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f14085l;
    }

    @Override // defpackage.AbstractC6568l
    public final byte loadAd(byte b) {
        boolean z = this.f14080l;
        InterfaceC10952l interfaceC10952l = this.f14079l;
        byte[] bArr = this.f14078l;
        byte[] bArr2 = this.f14083l;
        byte[] bArr3 = this.f14082l;
        int i = this.f14085l;
        if (z) {
            if (this.f14084l == 0) {
                interfaceC10952l.tapsense(0, 0, bArr, bArr2);
            }
            int i2 = this.f14084l;
            byte b2 = (byte) (b ^ bArr2[i2]);
            int i3 = i2 + 1;
            this.f14084l = i3;
            bArr3[i2] = b2;
            if (i3 == i) {
                this.f14084l = 0;
                System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                System.arraycopy(bArr3, 0, bArr, bArr.length - i, i);
            }
            return b2;
        }
        if (this.f14084l == 0) {
            interfaceC10952l.tapsense(0, 0, bArr, bArr2);
        }
        int i4 = this.f14084l;
        bArr3[i4] = b;
        int i5 = i4 + 1;
        this.f14084l = i5;
        byte b3 = (byte) (b ^ bArr2[i4]);
        if (i5 == i) {
            this.f14084l = 0;
            System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
            System.arraycopy(bArr3, 0, bArr, bArr.length - i, i);
        }
        return b3;
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        byte[] bArr = this.f14078l;
        byte[] bArr2 = this.f14081l;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        Arrays.fill(this.f14082l, (byte) 0);
        this.f14084l = 0;
        this.f14079l.reset();
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        processBytes(bArr, i, this.f14085l, bArr2, i2);
        return this.f14085l;
    }
}
