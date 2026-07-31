package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.C18017l;
import defpackage.C9214l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class ARC4 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C9214l(), 0);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("RC4", 128, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ARC4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Base", "Cipher.ARC4", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", InterfaceC0543l.f1917return, "ARC4");
            AbstractC11043l.vip(str, "$KeyGen", "KeyGenerator.ARC4", AbstractC4338l.premium(configurableProvider, "Alg.Alias.Cipher.ARCFOUR", "ARC4", "Alg.Alias.Cipher.RC4", "ARC4"), configurableProvider);
            StringBuilder sbSubs = AbstractC11043l.subs(str, "$PBEWithSHAAnd128BitKeyFactory", "SecretKeyFactory.PBEWITHSHAAND128BITRC4", AbstractC4338l.premium(configurableProvider, "Alg.Alias.KeyGenerator.RC4", "ARC4", "Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4"), configurableProvider);
            sbSubs.append(str);
            sbSubs.append("$PBEWithSHAAnd40BitKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC4", sbSubs.toString());
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            Cfor cfor = InterfaceC0543l.f1889l;
            StringBuilder sbLicense = AbstractC12900l.license(cfor, "PKCS12PBE", "Alg.Alias.AlgorithmParameters.", sb2, configurableProvider);
            Cfor cfor2 = InterfaceC0543l.f1908l;
            AbstractC11043l.metrica(sbLicense, cfor2, configurableProvider, "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
            AbstractC11043l.vip(str, "$PBEWithSHAAnd40Bit", "Cipher.PBEWITHSHAAND40BITRC4", AbstractC11043l.subs(str, "$PBEWithSHAAnd128Bit", "Cipher.PBEWITHSHAAND128BITRC4", AbstractC4338l.premium(configurableProvider, "Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE"), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor2, "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor2, "PBEWITHSHAAND40BITRC4");
        }
    }

    public static class PBEWithSHAAnd128Bit extends BaseStreamCipher {
        public PBEWithSHAAnd128Bit() {
            super(new C9214l(), 0, 128, 1);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", InterfaceC0543l.f1889l, true, 2, 1, 128, 0);
        }
    }

    public static class PBEWithSHAAnd40Bit extends BaseStreamCipher {
        public PBEWithSHAAnd40Bit() {
            super(new C9214l(), 0, 40, 1);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", InterfaceC0543l.f1889l, true, 2, 1, 40, 0);
        }
    }

    private ARC4() {
    }
}
