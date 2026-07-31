package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC0653l;
import defpackage.Cfor;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class CompositeSignatures {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.";
    private static final Map<String, String> compositesAttributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("Signature.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$COMPOSITE");
            for (Cfor cfor : CompositeIndex.getSupportedIdentifiers()) {
                String algorithmName = CompositeIndex.getAlgorithmName(cfor);
                String strReplace = algorithmName.replace('-', '_');
                configurableProvider.addAlgorithm("Alg.Alias.KeyFactory", cfor, "COMPOSITE");
                configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.".concat(algorithmName), "COMPOSITE");
                configurableProvider.addAlgorithm("KeyPairGenerator.".concat(algorithmName), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyPairGeneratorSpi$" + strReplace);
                configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator", cfor, algorithmName);
                configurableProvider.addAlgorithm("Signature.".concat(algorithmName), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$" + strReplace);
                configurableProvider.addAlgorithm("Alg.Alias.Signature", cfor, algorithmName);
                configurableProvider.addAlgorithm(AbstractC0653l.ads(new StringBuilder("Signature."), algorithmName, "-PREHASH"), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$" + strReplace + "_PREHASH");
                configurableProvider.addKeyInfoConverter(cfor, new KeyFactorySpi());
            }
        }
    }

    static {
        HashMap map = new HashMap();
        compositesAttributes = map;
        map.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
