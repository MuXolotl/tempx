package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lُؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4998l extends AbstractC18213l implements InterfaceC11654l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f10229l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f10230l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f10231l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC10952l f10232l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f10233l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f10234l;

    public C4998l(InterfaceC10952l interfaceC10952l) {
        this.f10232l = interfaceC10952l;
        int iLicense = interfaceC10952l.license();
        this.f10233l = iLicense;
        this.f10231l = new byte[iLicense];
        this.f10230l = new byte[iLicense];
        this.f10229l = new byte[iLicense];
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return this.f10232l.getAlgorithmName().concat("/CBC");
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        boolean z2 = this.f10234l;
        this.f10234l = z;
        boolean z3 = interfaceC9719l instanceof C0272l;
        byte[] bArr = this.f10231l;
        if (z3) {
            C0272l c0272l = (C0272l) interfaceC9719l;
            byte[] bArr2 = c0272l.f1273l;
            if (bArr2.length != this.f10233l) {
                C8339l.metrica("initialisation vector must be the same length as block size");
                return;
            } else {
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                interfaceC9719l = c0272l.f1272l;
            }
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        reset();
        if (interfaceC9719l != null) {
            this.f10232l.init(z, interfaceC9719l);
        } else {
            if (z2 == z) {
                return;
            }
            C8339l.metrica("cannot change encrypting state without providing key.");
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f10232l.license();
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        byte[] bArr = this.f10230l;
        byte[] bArr2 = this.f10231l;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        Arrays.fill(this.f10229l, (byte) 0);
        this.f10232l.reset();
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        boolean z = this.f10234l;
        InterfaceC10952l interfaceC10952l = this.f10232l;
        int i3 = this.f10233l;
        if (z) {
            if (i + i3 > bArr.length) {
                C10754l.ad("input buffer too short");
                return 0;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                byte[] bArr3 = this.f10230l;
                bArr3[i4] = (byte) (bArr3[i4] ^ bArr[i + i4]);
            }
            int iTapsense = interfaceC10952l.tapsense(0, i2, this.f10230l, bArr2);
            byte[] bArr4 = this.f10230l;
            System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
            return iTapsense;
        }
        if (i + i3 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        System.arraycopy(bArr, i, this.f10229l, 0, i3);
        int iTapsense2 = interfaceC10952l.tapsense(i, i2, bArr, bArr2);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i2 + i5;
            bArr2[i6] = (byte) (bArr2[i6] ^ this.f10230l[i5]);
        }
        byte[] bArr5 = this.f10230l;
        this.f10230l = this.f10229l;
        this.f10229l = bArr5;
        return iTapsense2;
    }
}
