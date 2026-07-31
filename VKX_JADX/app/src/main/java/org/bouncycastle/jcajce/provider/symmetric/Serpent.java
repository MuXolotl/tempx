package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.C0800l;
import defpackage.C13516l;
import defpackage.C18017l;
import defpackage.C2283l;
import defpackage.C4087l;
import defpackage.C4998l;
import defpackage.C5501l;
import defpackage.C6717l;
import defpackage.C7626l;
import defpackage.C9786l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC2572l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Serpent IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new C4087l(0)), 128);
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, new C4998l(new C4087l(0)), 128);
        }
    }

    public static class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(192, new C4998l(new C4087l(0)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C4998l(new C4087l(0)), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new C0800l(new C6717l(new C4087l(0), 128)), 128);
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(128, new C0800l(new C6717l(new C4087l(0), 128)), 128);
        }
    }

    public static class CFB192 extends BaseBlockCipher {
        public CFB192() {
            super(192, new C0800l(new C6717l(new C4087l(0), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C0800l(new C6717l(new C4087l(0), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C4087l(0);
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(128, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB128.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C4087l(0);
                }
            });
        }
    }

    public static class ECB192 extends BaseBlockCipher {
        public ECB192() {
            super(192, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB192.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C4087l(0);
                }
            });
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB256.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C4087l(0);
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new C18017l());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$TAlgParams", "AlgorithmParameters.Tnepres", AbstractC11043l.subs(str, "$TKeyGen", "KeyGenerator.Tnepres", AbstractC11043l.subs(str, "$TECB", "Cipher.Tnepres", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.Serpent", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.Serpent", AbstractC11043l.subs(str, "$ECB", "Cipher.Serpent", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            AbstractC11043l.adcel(configurableProvider, str, "$ECB128", "Cipher", InterfaceC2572l.crashlytics);
            AbstractC11043l.adcel(configurableProvider, str, "$ECB192", "Cipher", InterfaceC2572l.mopub);
            AbstractC11043l.adcel(configurableProvider, str, "$ECB256", "Cipher", InterfaceC2572l.firebase);
            AbstractC11043l.adcel(configurableProvider, str, "$CBC128", "Cipher", InterfaceC2572l.amazon);
            AbstractC11043l.adcel(configurableProvider, str, "$CBC192", "Cipher", InterfaceC2572l.admob);
            AbstractC11043l.adcel(configurableProvider, str, "$CBC256", "Cipher", InterfaceC2572l.smaato);
            AbstractC11043l.adcel(configurableProvider, str, "$CFB128", "Cipher", InterfaceC2572l.billing);
            AbstractC11043l.adcel(configurableProvider, str, "$CFB192", "Cipher", InterfaceC2572l.isPro);
            AbstractC11043l.adcel(configurableProvider, str, "$CFB256", "Cipher", InterfaceC2572l.vip);
            AbstractC11043l.adcel(configurableProvider, str, "$OFB128", "Cipher", InterfaceC2572l.purchase);
            AbstractC11043l.adcel(configurableProvider, str, "$OFB192", "Cipher", InterfaceC2572l.subs);
            configurableProvider.addAlgorithm("Cipher", InterfaceC2572l.remoteconfig, str + "$OFB256");
            addGMacAlgorithm(configurableProvider, "SERPENT", AbstractC0653l.ads(new StringBuilder(), str, "$SerpentGMAC"), AbstractC12900l.firebase(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "TNEPRES", AbstractC12900l.firebase(str, "$TSerpentGMAC"), AbstractC12900l.firebase(str, "$TKeyGen"));
            addPoly1305Algorithm(configurableProvider, "SERPENT", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new C0800l(new C9786l(new C4087l(0), 128)), 128);
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(128, new C0800l(new C9786l(new C4087l(0), 128)), 128);
        }
    }

    public static class OFB192 extends BaseBlockCipher {
        public OFB192() {
            super(192, new C0800l(new C9786l(new C4087l(0), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C0800l(new C9786l(new C4087l(0), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(new C4087l(0)));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new C5501l(11, C2283l.isPro(new C4087l(0))));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C4087l(1);
                }
            });
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new C18017l());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new C5501l(11, C2283l.isPro(new C4087l(1))));
        }
    }

    private Serpent() {
    }
}
