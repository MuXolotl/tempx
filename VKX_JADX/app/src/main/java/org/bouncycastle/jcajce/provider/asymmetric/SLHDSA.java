package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC12900l;
import defpackage.Cfor;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSA {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Pure");
            configurableProvider.addAlgorithm("KeyPairGenerator.SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Pure");
            configurableProvider.addAlgorithm("KeyFactory.HASH-SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Hash");
            configurableProvider.addAlgorithm("KeyPairGenerator.HASH-SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Hash");
            SLHDSAKeyFactorySpi.Hash hash = new SLHDSAKeyFactorySpi.Hash();
            Cfor cfor = InterfaceC8134l.f16981l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_128s", cfor, hash);
            Cfor cfor2 = InterfaceC8134l.f16967l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_128f", cfor2, hash);
            Cfor cfor3 = InterfaceC8134l.f16980l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_192s", cfor3, hash);
            Cfor cfor4 = InterfaceC8134l.f16978l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_192f", cfor4, hash);
            Cfor cfor5 = InterfaceC8134l.f16961l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_256s", cfor5, hash);
            Cfor cfor6 = InterfaceC8134l.f16959l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_256f", cfor6, hash);
            Cfor cfor7 = InterfaceC8134l.f16979l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_128s", cfor7, hash);
            Cfor cfor8 = InterfaceC8134l.f16971l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_128f", cfor8, hash);
            Cfor cfor9 = InterfaceC8134l.f16972l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_192s", cfor9, hash);
            Cfor cfor10 = InterfaceC8134l.f16955l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_192f", cfor10, hash);
            Cfor cfor11 = InterfaceC8134l.f16957l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_256s", cfor11, hash);
            Cfor cfor12 = InterfaceC8134l.f16975l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_256f", cfor12, hash);
            Cfor cfor13 = InterfaceC8134l.f16976l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_128s", cfor13, hash);
            Cfor cfor14 = InterfaceC8134l.f16956l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_128f", cfor14, hash);
            Cfor cfor15 = InterfaceC8134l.f16970l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_192s", cfor15, hash);
            Cfor cfor16 = InterfaceC8134l.f16969l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_192f", cfor16, hash);
            Cfor cfor17 = InterfaceC8134l.f16963l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_256s", cfor17, hash);
            Cfor cfor18 = InterfaceC8134l.f16973l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_256f", cfor18, hash);
            Cfor cfor19 = InterfaceC8134l.f16974l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_128s", cfor19, hash);
            Cfor cfor20 = InterfaceC8134l.f16964l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_128f", cfor20, hash);
            Cfor cfor21 = InterfaceC8134l.f16965l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_192s", cfor21, hash);
            Cfor cfor22 = InterfaceC8134l.f16960l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_192f", cfor22, hash);
            Cfor cfor23 = InterfaceC8134l.f16962l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_256s", cfor23, hash);
            Cfor cfor24 = InterfaceC8134l.f16966l;
            addKeyFactoryAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_256f", cfor24, hash);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_128s", cfor);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_128f", cfor2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_192s", cfor3);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_192f", cfor4);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_256s", cfor5);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_256f", cfor6);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_128s", cfor7);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_128f", cfor8);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_192s", cfor9);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_192f", cfor10);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_256s", cfor11);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_256f", cfor12);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128S-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_128s", cfor13);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-128F-WITH-SHA256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_128f", cfor14);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_192s", cfor15);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-192F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_192f", cfor16);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256S-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_256s", cfor17);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHA2-256F-WITH-SHA512", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_256f", cfor18);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128S-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_128s", cfor19);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-128F-WITH-SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_128f", cfor20);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_192s", cfor21);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-192F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_192f", cfor22);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256S-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_256s", cfor23);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SLH-DSA-SHAKE-256F-WITH-SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_256f", cfor24);
            String[] strArr = {"SLH-DSA-SHA2-128S", "SLH-DSA-SHA2-128F", "SLH-DSA-SHA2-192S", "SLH-DSA-SHA2-192F", "SLH-DSA-SHA2-256S", "SLH-DSA-SHA2-256F", "SLH-DSA-SHAKE-128S", "SLH-DSA-SHAKE-128F", "SLH-DSA-SHAKE-192S", "SLH-DSA-SHAKE-192F", "SLH-DSA-SHAKE-256S", "SLH-DSA-SHAKE-256F"};
            String[] strArr2 = {"SLH-DSA-SHA2-128S-WITH-SHA256", "SLH-DSA-SHA2-128F-WITH-SHA256", "SLH-DSA-SHA2-192S-WITH-SHA512", "SLH-DSA-SHA2-192F-WITH-SHA512", "SLH-DSA-SHA2-256S-WITH-SHA512", "SLH-DSA-SHA2-256F-WITH-SHA512", "SLH-DSA-SHAKE-128S-WITH-SHAKE128", "SLH-DSA-SHAKE-128F-WITH-SHAKE128", "SLH-DSA-SHAKE-192S-WITH-SHAKE256", "SLH-DSA-SHAKE-192F-WITH-SHAKE256", "SLH-DSA-SHAKE-256S-WITH-SHAKE256", "SLH-DSA-SHAKE-256F-WITH-SHAKE256"};
            addSignatureAlgorithm(configurableProvider, "SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SignatureSpi$Direct", (Cfor) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SLHDSA", "SLH-DSA");
            addSignatureAlgorithm(configurableProvider, "HASH-SLH-DSA", "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.HashSignatureSpi$Direct", (Cfor) null);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.HASHWITHSLHDSA", "HASH-SLH-DSA");
            for (int i = 0; i != 12; i++) {
                configurableProvider.addAlgorithm("Alg.Alias.Signature." + strArr[i], "SLH-DSA");
            }
            for (int i2 = 0; i2 != 12; i2++) {
                configurableProvider.addAlgorithm("Alg.Alias.Signature." + strArr2[i2], "HASH-SLH-DSA");
            }
            boolean z = true;
            char c = 2;
            Cfor[] cforArr = {InterfaceC8134l.f16981l, InterfaceC8134l.f16967l, InterfaceC8134l.f16980l, InterfaceC8134l.f16978l, InterfaceC8134l.f16961l, InterfaceC8134l.f16959l, InterfaceC8134l.f16979l, InterfaceC8134l.f16971l, InterfaceC8134l.f16972l, InterfaceC8134l.f16955l, InterfaceC8134l.f16957l, InterfaceC8134l.f16975l};
            int i3 = 0;
            while (i3 != 12) {
                StringBuilder sbLicense = AbstractC12900l.license(cforArr[i3], "SLH-DSA", "Alg.Alias.Signature.OID.", new StringBuilder("Alg.Alias.Signature."), configurableProvider);
                sbLicense.append(cforArr[i3]);
                configurableProvider.addAlgorithm(sbLicense.toString(), "SLH-DSA");
                i3++;
                z = z;
                c = c;
            }
            Cfor[] cforArr2 = new Cfor[12];
            cforArr2[0] = InterfaceC8134l.f16976l;
            cforArr2[z ? 1 : 0] = InterfaceC8134l.f16956l;
            cforArr2[c] = InterfaceC8134l.f16974l;
            cforArr2[3] = InterfaceC8134l.f16964l;
            cforArr2[4] = InterfaceC8134l.f16970l;
            cforArr2[5] = InterfaceC8134l.f16969l;
            cforArr2[6] = InterfaceC8134l.f16965l;
            cforArr2[7] = InterfaceC8134l.f16960l;
            cforArr2[8] = InterfaceC8134l.f16963l;
            cforArr2[9] = InterfaceC8134l.f16973l;
            cforArr2[10] = InterfaceC8134l.f16962l;
            cforArr2[11] = InterfaceC8134l.f16966l;
            for (int i4 = 0; i4 != 12; i4++) {
                StringBuilder sbLicense2 = AbstractC12900l.license(cforArr2[i4], "HASH-SLH-DSA", "Alg.Alias.Signature.OID.", new StringBuilder("Alg.Alias.Signature."), configurableProvider);
                sbLicense2.append(cforArr2[i4]);
                configurableProvider.addAlgorithm(sbLicense2.toString(), "HASH-SLH-DSA");
            }
        }
    }
}
