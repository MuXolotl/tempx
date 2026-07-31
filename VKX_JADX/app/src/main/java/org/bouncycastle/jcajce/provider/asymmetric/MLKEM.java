package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.Cfor;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEM {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.mlkem.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.MLKEM", "ML-KEM");
            Cfor cfor = InterfaceC8134l.f16958l;
            addKeyFactoryAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM512", cfor, new MLKEMKeyFactorySpi.MLKEM512());
            Cfor cfor2 = InterfaceC8134l.f16977l;
            addKeyFactoryAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM768", cfor2, new MLKEMKeyFactorySpi.MLKEM768());
            Cfor cfor3 = InterfaceC8134l.f16968l;
            addKeyFactoryAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM1024", cfor3, new MLKEMKeyFactorySpi.MLKEM1024());
            configurableProvider.addAlgorithm("KeyPairGenerator.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.MLKEM", "ML-KEM");
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM512", cfor);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM768", cfor2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM1024", cfor3);
            configurableProvider.addAlgorithm("KeyGenerator.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi");
            addKeyGeneratorAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM512", cfor);
            addKeyGeneratorAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM768", cfor2);
            addKeyGeneratorAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM1024", cfor3);
            MLKEMKeyFactorySpi mLKEMKeyFactorySpi = new MLKEMKeyFactorySpi();
            configurableProvider.addAlgorithm("Cipher.ML-KEM", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$Base");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.MLKEM", "ML-KEM");
            addCipherAlgorithm(configurableProvider, "ML-KEM-512", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM512", cfor);
            addCipherAlgorithm(configurableProvider, "ML-KEM-768", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM768", cfor2);
            addCipherAlgorithm(configurableProvider, "ML-KEM-1024", "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM1024", cfor3);
            configurableProvider.addKeyInfoConverter(cfor, mLKEMKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(cfor2, mLKEMKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(cfor3, mLKEMKeyFactorySpi);
        }
    }
}
