package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.Cfor;
import defpackage.InterfaceC2716l;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class EdEC {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.edec.";
    private static final Map<String, String> edxAttributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$XDH");
            configurableProvider.addAlgorithm("KeyFactory.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X448");
            configurableProvider.addAlgorithm("KeyFactory.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X25519");
            configurableProvider.addAlgorithm("KeyFactory.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$EdDSA");
            configurableProvider.addAlgorithm("KeyFactory.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$Ed448");
            configurableProvider.addAlgorithm("KeyFactory.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$Ed25519");
            configurableProvider.addAlgorithm("Signature.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$EdDSA");
            configurableProvider.addAlgorithm("Signature.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
            configurableProvider.addAlgorithm("Signature.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
            Cfor cfor = InterfaceC2716l.amazon;
            configurableProvider.addAlgorithm("Alg.Alias.Signature", cfor, "ED448");
            Cfor cfor2 = InterfaceC2716l.crashlytics;
            configurableProvider.addAlgorithm("Alg.Alias.Signature", cfor2, "ED25519");
            configurableProvider.addAlgorithm("KeyPairGenerator.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$EdDSA");
            configurableProvider.addAlgorithm("KeyPairGenerator.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            configurableProvider.addAlgorithm("KeyPairGenerator.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            configurableProvider.addAlgorithm("KeyPairGenerator", cfor, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            configurableProvider.addAlgorithm("KeyPairGenerator", cfor2, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            configurableProvider.addAlgorithm("KeyAgreement.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$XDH");
            configurableProvider.addAlgorithm("KeyAgreement.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            configurableProvider.addAlgorithm("KeyAgreement.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            Cfor cfor3 = InterfaceC2716l.loadAd;
            configurableProvider.addAlgorithm("KeyAgreement", cfor3, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            Cfor cfor4 = InterfaceC2716l.yandex;
            configurableProvider.addAlgorithm("KeyAgreement", cfor4, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA384CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA512CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA256CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA384CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256KDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512KDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519UWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519UwithSHA256KDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448UWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448UwithSHA512KDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448withSHA512HKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512HKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519withSHA256HKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256HKDF");
            configurableProvider.addAlgorithm("KeyPairGenerator.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$XDH");
            configurableProvider.addAlgorithm("KeyPairGenerator.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448");
            configurableProvider.addAlgorithm("KeyPairGenerator.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519");
            configurableProvider.addAlgorithm("KeyPairGenerator", cfor3, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448");
            configurableProvider.addAlgorithm("KeyPairGenerator", cfor4, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519");
            configurableProvider.addAlgorithm("Cipher.XIES", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIES");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA1", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIES");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIES");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA256", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA256");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA256");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA384", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA384");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA384");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA512", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA512");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA512");
            configurableProvider.addAlgorithm("Cipher.XIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA1andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA1ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA256andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA256andAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA256ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA256andAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA384andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA384andAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA384ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA384andAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESwithSHA512andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA512andAESCBC");
            configurableProvider.addAlgorithm("Cipher.XIESWITHSHA512ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher$XIESwithSHA512andAESCBC");
            registerOid(configurableProvider, cfor3, "XDH", new KeyFactorySpi.X448());
            registerOid(configurableProvider, cfor4, "XDH", new KeyFactorySpi.X25519());
            registerOid(configurableProvider, cfor, "EDDSA", new KeyFactorySpi.Ed448());
            registerOid(configurableProvider, cfor2, "EDDSA", new KeyFactorySpi.Ed25519());
        }
    }

    static {
        HashMap map = new HashMap();
        edxAttributes = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
