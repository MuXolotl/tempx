package org.conscrypt;

import defpackage.AbstractC0653l;
import defpackage.AbstractC15560l;
import defpackage.C18073l;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class OpenSSLAeadCipherChaCha20 extends OpenSSLAeadCipher {
    public OpenSSLAeadCipherChaCha20() {
        super(OpenSSLCipher.Mode.POLY1305);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) throws InvalidKeyException {
        if (i != 32) {
            throw new InvalidKeyException(AbstractC15560l.tapsense("Unsupported key size: ", i, " bytes (must be 32)"));
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode != OpenSSLCipher.Mode.POLY1305) {
            throw new NoSuchAlgorithmException("Mode must be Poly1305");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLAeadCipher
    public long getEVP_AEAD(int i) {
        if (i == 32) {
            return NativeCrypto.EVP_aead_chacha20_poly1305();
        }
        C18073l.license(AbstractC0653l.vip(i, "Unexpected key length: "));
        return 0L;
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        boolean zIsEncrypting = isEncrypting();
        int i2 = this.bufCount;
        return zIsEncrypting ? i2 + i + 16 : Math.max(0, (i2 + i) - 16);
    }
}
