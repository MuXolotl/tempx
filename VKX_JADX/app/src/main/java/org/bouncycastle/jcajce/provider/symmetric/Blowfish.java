package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.C10348l;
import defpackage.C10973l;
import defpackage.C18017l;
import defpackage.C4998l;
import defpackage.Cfor;
import defpackage.InterfaceC4787l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class Blowfish {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Blowfish IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new C10973l((byte) 0, 0)), 64);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C10348l(new C10973l((byte) 0, 0)));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C10973l((byte) 0, 0));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Blowfish", 128, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Blowfish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$ECB", "Cipher.BLOWFISH", AbstractC11043l.subs(str, "$CMAC", "Mac.BLOWFISHCMAC", sb, configurableProvider), configurableProvider);
            Cfor cfor = InterfaceC4787l.admob;
            configurableProvider.addAlgorithm("Cipher", cfor, str + "$CBC");
            AbstractC11043l.vip(str, "$KeyGen", "KeyGenerator.BLOWFISH", new StringBuilder(), configurableProvider);
            AbstractC4338l.applovin(AbstractC5020l.signatures(configurableProvider, "Alg.Alias.KeyGenerator", "BLOWFISH", str, cfor), "$AlgParams", configurableProvider, "AlgorithmParameters.BLOWFISH");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", cfor, "BLOWFISH");
        }
    }

    private Blowfish() {
    }
}
