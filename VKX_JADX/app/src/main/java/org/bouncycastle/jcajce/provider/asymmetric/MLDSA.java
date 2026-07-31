package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.Cfor;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSA {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.mldsa.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$Pure");
            configurableProvider.addAlgorithm("KeyPairGenerator.ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$Pure");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.MLDSA", "ML-DSA");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.MLDSA", "ML-DSA");
            configurableProvider.addAlgorithm("KeyFactory.HASH-ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$Hash");
            configurableProvider.addAlgorithm("KeyPairGenerator.HASH-ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$Hash");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.SHA512WITHMLDSA", "HASH-ML-DSA");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.SHA512WITHMLDSA", "HASH-ML-DSA");
            Cfor cfor = InterfaceC8134l.f16997transient;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-44", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA44", cfor, new MLDSAKeyFactorySpi.MLDSA44());
            Cfor cfor2 = InterfaceC8134l.f16986protected;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-65", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA65", cfor2, new MLDSAKeyFactorySpi.MLDSA65());
            Cfor cfor3 = InterfaceC8134l.f17000while;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-87", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA87", cfor3, new MLDSAKeyFactorySpi.MLDSA87());
            Cfor cfor4 = InterfaceC8134l.f16951implements;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-44-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA44", cfor4, new MLDSAKeyFactorySpi.HashMLDSA44());
            Cfor cfor5 = InterfaceC8134l.f16942const;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-65-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA65", cfor5, new MLDSAKeyFactorySpi.HashMLDSA65());
            Cfor cfor6 = InterfaceC8134l.f16988return;
            addKeyFactoryAlgorithm(configurableProvider, "ML-DSA-87-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA87", cfor6, new MLDSAKeyFactorySpi.HashMLDSA87());
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-44", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA44", cfor);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-65", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA65", cfor2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-87", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA87", cfor3);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-44-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA44withSHA512", cfor4);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-65-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA65withSHA512", cfor5);
            addKeyPairGeneratorAlgorithm(configurableProvider, "ML-DSA-87-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA87withSHA512", cfor6);
            addSignatureAlgorithm(configurableProvider, "ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA", (Cfor) null);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-44", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA44", cfor);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-65", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA65", cfor2);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-87", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA87", cfor3);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.MLDSA", "ML-DSA");
            addSignatureAlgorithm(configurableProvider, "ML-DSA-CALCULATE-MU", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSACalcMu", (Cfor) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.MLDSA-CALCULATE-MU", "ML-DSA-CALCULATE-MU");
            addSignatureAlgorithm(configurableProvider, "ML-DSA-EXTERNAL-MU", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSAExtMu", (Cfor) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.MLDSA-EXTERNAL-MU", "ML-DSA-EXTERNAL-MU");
            addSignatureAlgorithm(configurableProvider, "HASH-ML-DSA", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA", (Cfor) null);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-44-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA44", cfor4);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-65-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA65", cfor5);
            addSignatureAlgorithm(configurableProvider, "ML-DSA-87-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA87", cfor6);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA", "HASH-ML-DSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA44", "ML-DSA-44-WITH-SHA512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA65", "ML-DSA-65-WITH-SHA512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHMLDSA87", "ML-DSA-87-WITH-SHA512");
            MLDSAKeyFactorySpi.Hash hash = new MLDSAKeyFactorySpi.Hash();
            configurableProvider.addKeyInfoConverter(cfor, hash);
            configurableProvider.addKeyInfoConverter(cfor2, hash);
            configurableProvider.addKeyInfoConverter(cfor3, hash);
            configurableProvider.addKeyInfoConverter(cfor4, hash);
            configurableProvider.addKeyInfoConverter(cfor5, hash);
            configurableProvider.addKeyInfoConverter(cfor6, hash);
        }
    }
}
