package defpackage;

/* JADX INFO: renamed from: l٘ۜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18213l implements InterfaceC11654l {
    public final int yandex(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iLicense = license();
        int i4 = i2 * iLicense;
        if (bArr == bArr2) {
            bArr = new byte[i4];
            System.arraycopy(bArr2, i, bArr, 0, i4);
            i = 0;
        }
        int iTapsense = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            iTapsense += tapsense(i, i3 + iTapsense, bArr, bArr2);
            i += iLicense;
        }
        return iTapsense;
    }
}
