package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.C3254l;
import defpackage.C7191l;
import defpackage.Cfor;
import defpackage.InterfaceC2522l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class Falcon {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.falcon.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi");
            Cfor cfor = InterfaceC2522l.f5439l;
            addKeyFactoryAlgorithm(configurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon512", cfor, new C7191l(cfor));
            Cfor cfor2 = InterfaceC2522l.f5343l;
            addKeyFactoryAlgorithm(configurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon1024", cfor2, new C3254l(cfor2));
            configurableProvider.addAlgorithm("KeyPairGenerator.FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi");
            addKeyPairGeneratorAlgorithm(configurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon512", cfor);
            addKeyPairGeneratorAlgorithm(configurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon1024", cfor2);
            addSignatureAlgorithm(configurableProvider, "FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Base", InterfaceC2522l.f5353l);
            addSignatureAlgorithm(configurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon512", cfor);
            addSignatureAlgorithm(configurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon1024", cfor2);
            registerSignatureOid(configurableProvider, InterfaceC2522l.f5464l, "FALCON-512");
            registerSignatureOid(configurableProvider, InterfaceC2522l.f5437l, "FALCON-1024");
        }
    }
}
