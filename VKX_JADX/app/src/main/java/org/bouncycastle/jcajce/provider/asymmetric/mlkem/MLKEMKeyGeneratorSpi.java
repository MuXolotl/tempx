package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import defpackage.AbstractC14284l;
import defpackage.AbstractC14682l;
import defpackage.C18493l;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMKeyGeneratorSpi extends KeyGeneratorSpi {
    private AbstractC14682l extSpec;
    private AbstractC14284l genSpec;
    private final C18493l mlkemParameters;
    private SecureRandom random;

    public static class MLKEM1024 extends MLKEMKeyGeneratorSpi {
        public MLKEM1024() {
            super(C18493l.f36120l);
        }
    }

    public static class MLKEM512 extends MLKEMKeyGeneratorSpi {
        public MLKEM512() {
            super(C18493l.f36119l);
        }
    }

    public static class MLKEM768 extends MLKEMKeyGeneratorSpi {
        public MLKEM768() {
            super(C18493l.f36121l);
        }
    }

    public MLKEMKeyGeneratorSpi(C18493l c18493l) {
        this.mlkemParameters = c18493l;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        this.random = secureRandom;
        throw new InvalidAlgorithmParameterException("unknown spec");
    }

    public MLKEMKeyGeneratorSpi() {
        this(null);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
