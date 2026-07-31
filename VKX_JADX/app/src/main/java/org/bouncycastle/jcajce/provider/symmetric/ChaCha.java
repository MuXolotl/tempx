package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.C11628l;
import defpackage.C1736l;
import defpackage.C18017l;
import defpackage.C6173l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.firebase;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ChaCha {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    public static class AlgParamsCC1305 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha20-Poly1305 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C6173l(), 8);
        }
    }

    public static class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new C11628l(), 12);
        }
    }

    public static class BaseCC20P1305 extends BaseBlockCipher {
        public BaseCC20P1305() {
            super((firebase) new C1736l(), true, 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new C18017l());
        }
    }

    public static class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.CHACHA7539", AbstractC11043l.subs(str, "$KeyGen7539", "KeyGenerator.CHACHA7539", AbstractC11043l.subs(str, "$Base7539", "Cipher.CHACHA7539", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.CHACHA", AbstractC11043l.subs(str, "$Base", "Cipher.CHACHA", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.KeyGenerator.");
            Cfor cfor = InterfaceC0543l.f1880l;
            StringBuilder sbIsVip = AbstractC4338l.isVip("$BaseCC20P1305", "Cipher.CHACHA20-POLY1305", str, AbstractC12900l.remoteconfig(cfor, "CHACHA7539", str, sb2, configurableProvider), configurableProvider);
            sbIsVip.append("$AlgParamsCC1305");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", sbIsVip.toString());
            AbstractC11043l.metrica(AbstractC12900l.license(cfor, "CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.OID.", AbstractC12900l.license(cfor, "CHACHA20-POLY1305", "Alg.Alias.Cipher.OID.", AbstractC12900l.license(cfor, "CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.", new StringBuilder("Alg.Alias.Cipher."), configurableProvider), configurableProvider), configurableProvider), cfor, configurableProvider, "CHACHA20-POLY1305");
        }
    }

    private ChaCha() {
    }
}
