package defpackage;

import java.security.InvalidKeyException;

/* JADX INFO: renamed from: lؗؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4641l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f9443l;

    public C4641l(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.f9443l = i2;
        if (bArr.length != 32) {
            C18073l.smaato("The key length in bytes must be 32.");
            throw null;
        }
        this.f29554l = AbstractC0784l.purchase(bArr);
        this.f29555l = i;
    }

    @Override // defpackage.AbstractC15029l
    public final int[] crashlytics(int[] iArr, int i) {
        switch (this.f9443l) {
            case 0:
                if (iArr.length != 3) {
                    C18073l.adcel("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    return null;
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f29554l;
                int[] iArr4 = AbstractC0784l.yandex;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    C18073l.adcel("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    return null;
                }
                int[] iArr5 = new int[16];
                int[] iArrLoadAd = AbstractC0784l.loadAd((int[]) this.f29554l, iArr);
                int[] iArr6 = AbstractC0784l.yandex;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(iArrLoadAd, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // defpackage.AbstractC15029l
    public final int firebase() {
        switch (this.f9443l) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
