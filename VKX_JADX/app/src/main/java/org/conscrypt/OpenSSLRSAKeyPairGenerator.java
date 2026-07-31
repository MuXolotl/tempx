package org.conscrypt;

import defpackage.C18073l;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenSSLRSAKeyPairGenerator extends KeyPairGeneratorSpi {
    private byte[] publicExponent = {1, 0, 1};
    private int modulusBits = 2048;

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.RSA_generate_key_ex(this.modulusBits, this.publicExponent));
        return new KeyPair(new OpenSSLRSAPublicKey(openSSLKey), OpenSSLRSAPrivateKey.getInstance(openSSLKey));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            C18073l.pro("Only RSAKeyGenParameterSpec supported");
            return;
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        BigInteger publicExponent = rSAKeyGenParameterSpec.getPublicExponent();
        if (publicExponent != null) {
            this.publicExponent = publicExponent.toByteArray();
        }
        this.modulusBits = rSAKeyGenParameterSpec.getKeysize();
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.modulusBits = i;
    }
}
