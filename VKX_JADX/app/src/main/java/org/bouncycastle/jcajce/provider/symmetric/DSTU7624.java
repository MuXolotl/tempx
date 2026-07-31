package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.C0800l;
import defpackage.C10973l;
import defpackage.C13237l;
import defpackage.C14785l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C18617l;
import defpackage.C4998l;
import defpackage.C5332l;
import defpackage.C6717l;
import defpackage.C7963l;
import defpackage.C9786l;
import defpackage.Cfor;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC18706l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU7624 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private final int ivLength;

        public AlgParamGen(int i) {
            this.ivLength = i / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.ivLength];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DSTU7624");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    public static class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    public static class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "DSTU7624 IV";
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new C4998l(new C7963l(128)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new C4998l(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES)), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new C4998l(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)), AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new C18617l(new C7963l(128)));
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new C18617l(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new C18617l(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)));
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new C0800l(new C6717l(new C7963l(128), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new C0800l(new C6717l(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES), PSKKeyManager.MAX_KEY_LENGTH_BYTES)), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new C0800l(new C6717l(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE), AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)), AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new C0800l(new C5332l(new C7963l(128))), 128);
        }
    }

    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new C0800l(new C5332l(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES))), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new C0800l(new C5332l(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE))), AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C7963l(128);
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new C7963l(128));
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new C7963l(128));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new C13237l(new C7963l(128)));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new C13237l(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new C13237l(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C14785l(new C13237l(new C7963l(128)), 128, 11));
        }
    }

    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new C14785l(new C13237l(new C7963l(128)), 128, 11));
        }
    }

    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new C14785l(new C13237l(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES)), PSKKeyManager.MAX_KEY_LENGTH_BYTES, 11));
        }
    }

    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new C14785l(new C13237l(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)), AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 11));
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.DSTU7624", sb, configurableProvider);
            Cfor cfor = InterfaceC18706l.ads;
            AbstractC11043l.adcel(configurableProvider, str, "$AlgParams", "AlgorithmParameters", cfor);
            Cfor cfor2 = InterfaceC18706l.subscription;
            AbstractC11043l.adcel(configurableProvider, str, "$AlgParams", "AlgorithmParameters", cfor2);
            Cfor cfor3 = InterfaceC18706l.tapsense;
            configurableProvider.addAlgorithm("AlgorithmParameters", cfor3, str + "$AlgParams");
            AbstractC4338l.applovin(AbstractC4338l.isVip("$ECB_256", "Cipher.DSTU7624-256", str, AbstractC4338l.isVip("$ECB_128", "Cipher.DSTU7624-128", str, AbstractC4338l.isVip("$ECB_128", "Cipher.DSTU7624", str, AbstractC5020l.signatures(configurableProvider, "AlgorithmParameterGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor2, "$AlgParamGen256", "AlgorithmParameterGenerator", AbstractC5020l.signatures(configurableProvider, "AlgorithmParameterGenerator", AbstractC0653l.ads(AbstractC11043l.subs(str, "$AlgParamGen128", "AlgorithmParameterGenerator.DSTU7624", new StringBuilder(), configurableProvider), str, "$AlgParamGen128"), str, cfor), configurableProvider), str, "$AlgParamGen512"), str, cfor3), configurableProvider), configurableProvider), configurableProvider), "$ECB_512", configurableProvider, "Cipher.DSTU7624-512");
            Cfor cfor4 = InterfaceC18706l.subs;
            AbstractC11043l.adcel(configurableProvider, str, "$ECB128", "Cipher", cfor4);
            Cfor cfor5 = InterfaceC18706l.isPro;
            AbstractC11043l.adcel(configurableProvider, str, "$ECB256", "Cipher", cfor5);
            Cfor cfor6 = InterfaceC18706l.firebase;
            configurableProvider.addAlgorithm("Cipher", cfor6, str + "$ECB512");
            configurableProvider.addAlgorithm("Cipher", cfor3, AbstractC0653l.ads(AbstractC5020l.pro(cfor2, "$CBC256", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(new StringBuilder(), str, "$CBC128"), str, cfor), configurableProvider), str, "$CBC512"));
            Cfor cfor7 = InterfaceC18706l.Signature;
            AbstractC11043l.adcel(configurableProvider, str, "$OFB128", "Cipher", cfor7);
            Cfor cfor8 = InterfaceC18706l.license;
            AbstractC11043l.adcel(configurableProvider, str, "$OFB256", "Cipher", cfor8);
            Cfor cfor9 = InterfaceC18706l.pro;
            AbstractC11043l.adcel(configurableProvider, str, "$OFB512", "Cipher", cfor9);
            Cfor cfor10 = InterfaceC18706l.metrica;
            AbstractC11043l.adcel(configurableProvider, str, "$CFB128", "Cipher", cfor10);
            Cfor cfor11 = InterfaceC18706l.startapp;
            AbstractC11043l.adcel(configurableProvider, str, "$CFB256", "Cipher", cfor11);
            Cfor cfor12 = InterfaceC18706l.adcel;
            AbstractC11043l.adcel(configurableProvider, str, "$CFB512", "Cipher", cfor12);
            Cfor cfor13 = InterfaceC18706l.smaato;
            AbstractC11043l.adcel(configurableProvider, str, "$CTR128", "Cipher", cfor13);
            Cfor cfor14 = InterfaceC18706l.remoteconfig;
            AbstractC11043l.adcel(configurableProvider, str, "$CTR256", "Cipher", cfor14);
            Cfor cfor15 = InterfaceC18706l.vip;
            AbstractC11043l.adcel(configurableProvider, str, "$CTR512", "Cipher", cfor15);
            Cfor cfor16 = InterfaceC18706l.signatures;
            AbstractC11043l.adcel(configurableProvider, str, "$CCM128", "Cipher", cfor16);
            Cfor cfor17 = InterfaceC18706l.premium;
            AbstractC11043l.adcel(configurableProvider, str, "$CCM256", "Cipher", cfor17);
            Cfor cfor18 = InterfaceC18706l.applovin;
            configurableProvider.addAlgorithm("Cipher", cfor18, str + "$CCM512");
            AbstractC11043l.vip(str, "$Wrap", "Cipher.DSTU7624KW", new StringBuilder(), configurableProvider);
            StringBuilder sbVip = AbstractC12900l.vip(configurableProvider, "Cipher.DSTU7624-128KW", AbstractC4338l.advert("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW", configurableProvider, str, "$Wrap128"), "Alg.Alias.Cipher.");
            Cfor cfor19 = InterfaceC18706l.appmetrica;
            sbVip.append(cfor19.inmobi());
            configurableProvider.addAlgorithm(sbVip.toString(), "DSTU7624-128KW");
            StringBuilder sbVip2 = AbstractC12900l.vip(configurableProvider, "Cipher.DSTU7624-256KW", AbstractC4338l.advert("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW", configurableProvider, str, "$Wrap256"), "Alg.Alias.Cipher.");
            Cfor cfor20 = InterfaceC18706l.inmobi;
            sbVip2.append(cfor20.inmobi());
            configurableProvider.addAlgorithm(sbVip2.toString(), "DSTU7624-256KW");
            StringBuilder sbVip3 = AbstractC12900l.vip(configurableProvider, "Cipher.DSTU7624-512KW", AbstractC4338l.advert("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW", configurableProvider, str, "$Wrap512"), "Alg.Alias.Cipher.");
            Cfor cfor21 = InterfaceC18706l.f36467throws;
            sbVip3.append(cfor21.inmobi());
            configurableProvider.addAlgorithm(sbVip3.toString(), "DSTU7624-512KW");
            StringBuilder sbVip4 = AbstractC12900l.vip(configurableProvider, "Mac.DSTU7624-128GMAC", AbstractC4338l.advert("Mac.DSTU7624GMAC", AbstractC4338l.advert("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW", configurableProvider, str, "$GMAC"), configurableProvider, str, "$GMAC128"), "Alg.Alias.Mac.");
            Cfor cfor22 = InterfaceC18706l.ad;
            sbVip4.append(cfor22.inmobi());
            configurableProvider.addAlgorithm(sbVip4.toString(), "DSTU7624-128GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-256GMAC", str + "$GMAC256");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.Mac.");
            Cfor cfor23 = InterfaceC18706l.advert;
            sb2.append(cfor23.inmobi());
            configurableProvider.addAlgorithm(sb2.toString(), "DSTU7624-256GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-512GMAC", str + "$GMAC512");
            StringBuilder sb3 = new StringBuilder("Alg.Alias.Mac.");
            Cfor cfor24 = InterfaceC18706l.isVip;
            sb3.append(cfor24.inmobi());
            configurableProvider.addAlgorithm(sb3.toString(), "DSTU7624-512GMAC");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            configurableProvider.addAlgorithm("KeyGenerator", cfor24, AbstractC0653l.ads(AbstractC5020l.pro(cfor23, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor18, "$KeyGen512", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor16, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor14, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor12, "$KeyGen512", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor10, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor8, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor3, "$KeyGen512", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor5, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor21, "$KeyGen512", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor19, "$KeyGen128", "KeyGenerator", AbstractC4338l.isVip("$KeyGen", "KeyGenerator.DSTU7624", str, sb4, configurableProvider), configurableProvider), str, "$KeyGen256"), str, cfor20), configurableProvider), str, "$KeyGen128"), str, cfor4), configurableProvider), str, "$KeyGen512"), str, cfor6), configurableProvider), str, "$KeyGen256"), str, cfor2), configurableProvider), str, "$KeyGen128"), str, cfor7), configurableProvider), str, "$KeyGen512"), str, cfor9), configurableProvider), str, "$KeyGen256"), str, cfor11), configurableProvider), str, "$KeyGen128"), str, cfor13), configurableProvider), str, "$KeyGen512"), str, cfor15), configurableProvider), str, "$KeyGen256"), str, cfor17), configurableProvider), str, "$KeyGen128"), str, cfor22), configurableProvider), str, "$KeyGen512"));
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new C0800l(new C9786l(new C7963l(128), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new C0800l(new C9786l(new C7963l(PSKKeyManager.MAX_KEY_LENGTH_BYTES), PSKKeyManager.MAX_KEY_LENGTH_BYTES)), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new C0800l(new C9786l(new C7963l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE), AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)), AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C10973l(128));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new C10973l(128));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new C10973l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new C10973l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    private DSTU7624() {
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("DSTU7624", i, new C18017l());
        }

        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }
}
