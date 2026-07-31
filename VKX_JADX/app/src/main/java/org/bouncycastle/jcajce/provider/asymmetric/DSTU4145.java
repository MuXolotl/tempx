package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.Cfor;
import defpackage.InterfaceC18706l;
import org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145 {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.dstu.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
            Cfor cfor = InterfaceC18706l.yandex;
            registerOid(configurableProvider, cfor, "DSTU4145", new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, cfor, "DSTU4145");
            Cfor cfor2 = InterfaceC18706l.loadAd;
            registerOid(configurableProvider, cfor2, "DSTU4145", new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, cfor2, "DSTU4145");
            configurableProvider.addAlgorithm("KeyPairGenerator.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
            configurableProvider.addAlgorithm("Signature.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
            addSignatureAlgorithm(configurableProvider, "GOST3411", "DSTU4145LE", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe", cfor);
            addSignatureAlgorithm(configurableProvider, "GOST3411", "DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi", cfor2);
        }
    }
}
