package defpackage;

/* JADX INFO: renamed from: lؗ۠ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5206l extends C3479l {
    @Override // defpackage.C3479l
    public final int crashlytics() {
        return 24;
    }

    @Override // defpackage.C3479l, defpackage.InterfaceC12774l
    public final String getAlgorithmName() {
        return "XSalsa20";
    }

    @Override // defpackage.C3479l
    public final void mopub(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            C8339l.metrica("XSalsa20 doesn't support re-init with null key");
            return;
        }
        if (bArr.length != 32) {
            C8339l.metrica("XSalsa20 requires a 256 bit key");
            return;
        }
        super.mopub(bArr, bArr2);
        int[] iArr = this.f7366l;
        AbstractC10000l.adcel(bArr2, 8, iArr, 8, 2);
        int[] iArr2 = new int[iArr.length];
        C3479l.billing(20, iArr, iArr2);
        iArr[1] = iArr2[0] - iArr[0];
        iArr[2] = iArr2[5] - iArr[5];
        iArr[3] = iArr2[10] - iArr[10];
        iArr[4] = iArr2[15] - iArr[15];
        iArr[11] = iArr2[6] - iArr[6];
        iArr[12] = iArr2[7] - iArr[7];
        iArr[13] = iArr2[8] - iArr[8];
        iArr[14] = iArr2[9] - iArr[9];
        AbstractC10000l.adcel(bArr2, 16, iArr, 6, 2);
    }
}
