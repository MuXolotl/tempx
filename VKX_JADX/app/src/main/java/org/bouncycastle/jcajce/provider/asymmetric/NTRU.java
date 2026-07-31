package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC12900l;
import defpackage.C2595l;
import defpackage.Cfor;
import defpackage.InterfaceC2522l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class NTRU {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntru.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyGeneratorSpi");
            StringBuilder sb = new StringBuilder("Alg.Alias.KeyGenerator.");
            Cfor cfor = InterfaceC2522l.f5415l;
            StringBuilder sbLicense = AbstractC12900l.license(cfor, "NTRU", "Alg.Alias.KeyGenerator.", sb, configurableProvider);
            Cfor cfor2 = InterfaceC2522l.f5388l;
            StringBuilder sbLicense2 = AbstractC12900l.license(cfor2, "NTRU", "Alg.Alias.KeyGenerator.", sbLicense, configurableProvider);
            Cfor cfor3 = InterfaceC2522l.f5456l;
            StringBuilder sbLicense3 = AbstractC12900l.license(cfor3, "NTRU", "Alg.Alias.KeyGenerator.", sbLicense2, configurableProvider);
            Cfor cfor4 = InterfaceC2522l.f5451l;
            StringBuilder sbLicense4 = AbstractC12900l.license(cfor4, "NTRU", "Alg.Alias.KeyGenerator.", sbLicense3, configurableProvider);
            Cfor cfor5 = InterfaceC2522l.f5374l;
            StringBuilder sbLicense5 = AbstractC12900l.license(cfor5, "NTRU", "Alg.Alias.KeyGenerator.", sbLicense4, configurableProvider);
            Cfor cfor6 = InterfaceC2522l.f5422l;
            StringBuilder sbLicense6 = AbstractC12900l.license(cfor6, "NTRU", "Alg.Alias.KeyGenerator.", sbLicense5, configurableProvider);
            Cfor cfor7 = InterfaceC2522l.f5372l;
            sbLicense6.append(cfor7);
            configurableProvider.addAlgorithm(sbLicense6.toString(), "NTRU");
            C2595l c2595l = new C2595l(4);
            configurableProvider.addAlgorithm("Cipher.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUCipherSpi$Base");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor2, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor3, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor4, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor5, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor6, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor7, "NTRU");
            registerOid(configurableProvider, cfor, "NTRU", c2595l);
            registerOid(configurableProvider, cfor2, "NTRU", c2595l);
            registerOid(configurableProvider, cfor3, "NTRU", c2595l);
            registerOid(configurableProvider, cfor4, "NTRU", c2595l);
            registerOid(configurableProvider, cfor5, "NTRU", c2595l);
            registerOid(configurableProvider, cfor6, "NTRU", c2595l);
            registerOid(configurableProvider, cfor7, "NTRU", c2595l);
        }
    }
}
