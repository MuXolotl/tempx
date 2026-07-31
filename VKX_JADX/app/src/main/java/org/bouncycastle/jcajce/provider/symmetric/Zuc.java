package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC4338l;
import defpackage.C17748l;
import defpackage.C18017l;
import defpackage.C2934l;
import defpackage.C4336l;
import defpackage.C6649l;
import defpackage.C7092l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class Zuc {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Zuc IV";
        }
    }

    public static class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new C18017l());
        }
    }

    public static class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$ZucMac256", "Mac.ZUC-256", AbstractC11043l.subs(str, "$ZucMac128", "Mac.ZUC-128", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.ZUC-256", AbstractC11043l.subs(str, "$KeyGen256", "KeyGenerator.ZUC-256", AbstractC11043l.subs(str, "$Zuc256", "Cipher.ZUC-256", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.ZUC-128", AbstractC11043l.subs(str, "$KeyGen128", "KeyGenerator.ZUC-128", AbstractC11043l.subs(str, "$Zuc128", "Cipher.ZUC-128", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", AbstractC4338l.advert("Mac.ZUC-256-64", AbstractC4338l.advert("Alg.Alias.Mac.ZUC-256-128", "ZUC-256", configurableProvider, str, "$ZucMac256_64"), configurableProvider, str, "$ZucMac256_32"));
        }
    }

    public static class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new C4336l(0), 16, 128);
        }
    }

    public static class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            C7092l c7092l = new C7092l(0);
            c7092l.f34569l = C17748l.f34567l;
            super(c7092l, 25, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new C2934l());
        }
    }

    public static class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new C6649l(128));
        }
    }

    public static class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new C6649l(32));
        }
    }

    public static class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new C6649l(64));
        }
    }

    private Zuc() {
    }
}
