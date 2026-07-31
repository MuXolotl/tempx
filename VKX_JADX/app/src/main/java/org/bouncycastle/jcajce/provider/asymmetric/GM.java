package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.InterfaceC13724l;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class GM {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.ec.";
    private static final Map<String, String> generalSm2Attributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyAgreement.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMKeyExchangeSpi$SM2");
            configurableProvider.addAlgorithm("KeyAgreement", InterfaceC13724l.amazon, "org.bouncycastle.jcajce.provider.asymmetric.ec.GMKeyExchangeSpi$SM2");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Signature.SHA256WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sha256WithSM2", "Alg.Alias.Signature."), InterfaceC13724l.Signature, configurableProvider, "SHA256WITHSM2");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2", "Alg.Alias.Signature."), InterfaceC13724l.tapsense, configurableProvider, "SM3WITHSM2");
            configurableProvider.addAlgorithm("KeyPairGenerator.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMKeyPairGeneratorSpi$SM2");
            configurableProvider.addAlgorithm("Cipher.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SM2WITHSM3", "SM2");
            AbstractC11043l.metrica(new StringBuilder("Alg.Alias.Cipher."), InterfaceC13724l.mopub, configurableProvider, "SM2");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHBLAKE2B", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b", "Alg.Alias.Cipher."), InterfaceC13724l.metrica, configurableProvider, "SM2WITHBLAKE2B");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHBLAKE2S", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s", "Alg.Alias.Cipher."), InterfaceC13724l.startapp, configurableProvider, "SM2WITHBLAKE2S");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHWHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool", "Alg.Alias.Cipher."), InterfaceC13724l.vip, configurableProvider, "SM2WITHWHIRLPOOL");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHMD5", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5", "Alg.Alias.Cipher."), InterfaceC13724l.adcel, configurableProvider, "SM2WITHMD5");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHRIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD", "Alg.Alias.Cipher."), InterfaceC13724l.remoteconfig, configurableProvider, "SM2WITHRIPEMD160");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1", "Alg.Alias.Cipher."), InterfaceC13724l.admob, configurableProvider, "SM2WITHSHA1");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHSHA224", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224", "Alg.Alias.Cipher."), InterfaceC13724l.subs, configurableProvider, "SM2WITHSHA224");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256", "Alg.Alias.Cipher."), InterfaceC13724l.isPro, configurableProvider, "SM2WITHSHA256");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384", "Alg.Alias.Cipher."), InterfaceC13724l.firebase, configurableProvider, "SM2WITHSHA384");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Cipher.SM2WITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512", "Alg.Alias.Cipher."), InterfaceC13724l.smaato, configurableProvider, "SM2WITHSHA512");
        }
    }

    static {
        HashMap map = new HashMap();
        generalSm2Attributes = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
