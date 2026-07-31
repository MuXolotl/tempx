package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class LMS {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.lms.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbVip = AbstractC12900l.vip(configurableProvider, "KeyFactory.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi", "Alg.Alias.KeyFactory.");
            Cfor cfor = InterfaceC0543l.f1892l;
            AbstractC11043l.metrica(sbVip, cfor, configurableProvider, "LMS");
            configurableProvider.addAlgorithm("KeyPairGenerator.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + cfor, "LMS");
            configurableProvider.addAlgorithm("Signature.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi$generic");
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + cfor, "LMS");
        }
    }
}
