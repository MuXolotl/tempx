package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.C0235l;
import defpackage.C2860l;
import defpackage.C6692l;
import defpackage.Cfor;
import defpackage.InterfaceC2522l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class Dilithium {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.dilithium.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi");
            Cfor cfor = InterfaceC2522l.f5453l;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base2", cfor, new C6692l(cfor));
            Cfor cfor2 = InterfaceC2522l.f5455l;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base3", cfor2, new C0235l(cfor2));
            Cfor cfor3 = InterfaceC2522l.f5346l;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base5", cfor3, new C2860l(cfor3));
            configurableProvider.addAlgorithm("KeyPairGenerator.DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi");
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base2", cfor);
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base3", cfor2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base5", cfor3);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base", InterfaceC2522l.f5349l);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base2", cfor);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base3", cfor2);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base5", cfor3);
        }
    }
}
