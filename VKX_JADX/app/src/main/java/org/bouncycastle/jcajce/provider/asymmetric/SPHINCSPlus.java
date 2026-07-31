package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC12900l;
import defpackage.C2595l;
import defpackage.Cfor;
import defpackage.InterfaceC2522l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class SPHINCSPlus {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.sphincsplus.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.SPHINCS+", "SPHINCSPLUS");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.SPHINCS+", "SPHINCSPLUS");
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHA2-128S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_128s", InterfaceC2522l.f5491static);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHA2-128F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_128f", InterfaceC2522l.f5334interface);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHA2-192S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_192s", InterfaceC2522l.f5327final);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHA2-192F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_192f", InterfaceC2522l.f5324default);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHA2-256S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_256s", InterfaceC2522l.f5330goto);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHA2-256F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_256f", InterfaceC2522l.f5485new);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHAKE-128S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_128s", InterfaceC2522l.f5332import);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHAKE-128F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_128f", InterfaceC2522l.f5493super);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHAKE-192S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_192s", InterfaceC2522l.f5333instanceof);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHAKE-192F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_192f", InterfaceC2522l.f5317abstract);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHAKE-256S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_256s", InterfaceC2522l.f5328finally);
            addKeyPairGeneratorAlgorithm(configurableProvider, "SPHINCS+-SHAKE-256F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_256f", InterfaceC2522l.f5489public);
            addSignatureAlgorithm(configurableProvider, "SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SignatureSpi$Direct", InterfaceC2522l.isPro);
            for (int i = 1; i <= 36; i++) {
                StringBuilder sb = new StringBuilder("Alg.Alias.Signature.");
                Cfor cfor = InterfaceC2522l.isPro;
                sb.append(cfor);
                sb.append(".");
                sb.append(i);
                configurableProvider.addAlgorithm(sb.toString(), "SPHINCSPLUS");
                configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + cfor + "." + i, "SPHINCSPLUS");
            }
            int i2 = 6;
            Cfor[] cforArr = {InterfaceC2522l.f5491static, InterfaceC2522l.f5334interface, InterfaceC2522l.f5332import, InterfaceC2522l.f5493super, InterfaceC2522l.f5327final, InterfaceC2522l.f5324default, InterfaceC2522l.f5333instanceof, InterfaceC2522l.f5317abstract, InterfaceC2522l.f5330goto, InterfaceC2522l.f5485new, InterfaceC2522l.f5328finally, InterfaceC2522l.f5489public};
            for (int i3 = 0; i3 != 12; i3++) {
                StringBuilder sbLicense = AbstractC12900l.license(cforArr[i3], "SPHINCSPLUS", "Alg.Alias.Signature.OID.", new StringBuilder("Alg.Alias.Signature."), configurableProvider);
                sbLicense.append(cforArr[i3]);
                configurableProvider.addAlgorithm(sbLicense.toString(), "SPHINCSPLUS");
            }
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SPHINCS+", "SPHINCSPLUS");
            C2595l c2595l = new C2595l(i2);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.firebase, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.smaato, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.remoteconfig, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.vip, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.metrica, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.startapp, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.adcel, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.ads, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.subscription, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.tapsense, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.Signature, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.license, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.pro, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.ad, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.advert, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.isVip, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.signatures, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.premium, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.applovin, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.appmetrica, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.inmobi, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5498throws, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5486package, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5495synchronized, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5492strictfp, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5501volatile, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5484native, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5487private, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5326extends, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5329for, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5497throw, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5320catch, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5325else, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5319case, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5494switch, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5323continue, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5491static, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5334interface, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5327final, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5324default, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5330goto, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5485new, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5332import, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5493super, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5333instanceof, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5317abstract, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5328finally, "SPHINCSPLUS", c2595l);
            registerKeyFactoryOid(configurableProvider, InterfaceC2522l.f5489public, "SPHINCSPLUS", c2595l);
            registerOidAlgorithmParameters(configurableProvider, InterfaceC2522l.isPro, "SPHINCSPLUS");
        }
    }
}
