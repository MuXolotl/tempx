package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.C0800l;
import defpackage.C11919l;
import defpackage.C12196l;
import defpackage.C13516l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2283l;
import defpackage.C3066l;
import defpackage.C4998l;
import defpackage.C5501l;
import defpackage.C6717l;
import defpackage.C7383l;
import defpackage.C7626l;
import defpackage.C9786l;
import defpackage.Cfor;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC17788l;
import defpackage.adcel;
import defpackage.isPro;
import defpackage.pro;
import defpackage.smaato;
import defpackage.startapp;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ARIA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("ARIA");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ARIA IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new pro()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((isPro) C7383l.purchase(new pro()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new C0800l(new C6717l(new pro(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new pro();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(C2283l.isPro(new pro()));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C5501l(11, C2283l.isPro(new pro())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.ARIA", sb, configurableProvider);
            Cfor cfor = InterfaceC17788l.loadAd;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", cfor, "ARIA");
            Cfor cfor2 = InterfaceC17788l.billing;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", cfor2, "ARIA");
            Cfor cfor3 = InterfaceC17788l.isPro;
            AbstractC4338l.applovin(AbstractC5020l.signatures(configurableProvider, "Alg.Alias.AlgorithmParameters", "ARIA", str, cfor3), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor3, "ARIA");
            Cfor cfor4 = InterfaceC17788l.amazon;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor4, "ARIA");
            Cfor cfor5 = InterfaceC17788l.admob;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor5, "ARIA");
            Cfor cfor6 = InterfaceC17788l.smaato;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor6, "ARIA");
            Cfor cfor7 = InterfaceC17788l.crashlytics;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor7, "ARIA");
            Cfor cfor8 = InterfaceC17788l.mopub;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor8, "ARIA");
            Cfor cfor9 = InterfaceC17788l.firebase;
            AbstractC4338l.applovin(AbstractC5020l.signatures(configurableProvider, "Alg.Alias.AlgorithmParameterGenerator", "ARIA", str, cfor9), "$ECB", configurableProvider, "Cipher.ARIA");
            Cfor cfor10 = InterfaceC17788l.yandex;
            AbstractC11043l.adcel(configurableProvider, str, "$ECB", "Cipher", cfor10);
            Cfor cfor11 = InterfaceC17788l.purchase;
            AbstractC11043l.adcel(configurableProvider, str, "$ECB", "Cipher", cfor11);
            Cfor cfor12 = InterfaceC17788l.subs;
            configurableProvider.addAlgorithm("Cipher", cfor12, str + "$ECB");
            AbstractC4338l.applovin(AbstractC4338l.isVip("$RFC3211Wrap", "Cipher.ARIARFC3211WRAP", str, AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC5020l.pro(cfor5, "$OFB", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC5020l.pro(cfor9, "$CFB", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC5020l.pro(cfor7, "$CFB", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC5020l.pro(cfor2, "$CBC", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(new StringBuilder(), str, "$CBC"), str, cfor), configurableProvider), str, "$CBC"), str, cfor3), configurableProvider), str, "$CFB"), str, cfor8), configurableProvider), str, "$OFB"), str, cfor4), configurableProvider), str, "$OFB"), str, cfor6), configurableProvider), "$Wrap", configurableProvider, "Cipher.ARIAWRAP");
            Cfor cfor13 = InterfaceC17788l.subscription;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor13, "ARIAWRAP");
            Cfor cfor14 = InterfaceC17788l.tapsense;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor14, "ARIAWRAP");
            Cfor cfor15 = InterfaceC17788l.Signature;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor15, "ARIAWRAP");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAPPAD", AbstractC4338l.advert("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP", configurableProvider, str, "$WrapPad"));
            Cfor cfor16 = InterfaceC17788l.license;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor16, "ARIAWRAPPAD");
            Cfor cfor17 = InterfaceC17788l.pro;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor17, "ARIAWRAPPAD");
            Cfor cfor18 = InterfaceC17788l.ad;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor18, "ARIAWRAPPAD");
            StringBuilder sbSignatures = AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor4, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor8, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor3, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor11, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor18, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor16, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor14, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC4338l.advert("KeyGenerator.ARIA", AbstractC4338l.advert("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD", configurableProvider, str, "$KeyGen"), configurableProvider, str, "$KeyGen128"), str, cfor13), configurableProvider), str, "$KeyGen256"), str, cfor15), configurableProvider), str, "$KeyGen192"), str, cfor17), configurableProvider), str, "$KeyGen128"), str, cfor10), configurableProvider), str, "$KeyGen256"), str, cfor12), configurableProvider), str, "$KeyGen192"), str, cfor2), configurableProvider), str, "$KeyGen128"), str, cfor7), configurableProvider), str, "$KeyGen256"), str, cfor9), configurableProvider), str, "$KeyGen192"), str, cfor5);
            sbSignatures.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", cfor6, sbSignatures.toString());
            Cfor cfor19 = InterfaceC17788l.startapp;
            AbstractC11043l.adcel(configurableProvider, str, "$KeyGen128", "KeyGenerator", cfor19);
            Cfor cfor20 = InterfaceC17788l.adcel;
            AbstractC11043l.adcel(configurableProvider, str, "$KeyGen192", "KeyGenerator", cfor20);
            Cfor cfor21 = InterfaceC17788l.ads;
            AbstractC11043l.adcel(configurableProvider, str, "$KeyGen256", "KeyGenerator", cfor21);
            Cfor cfor22 = InterfaceC17788l.remoteconfig;
            AbstractC11043l.adcel(configurableProvider, str, "$KeyGen128", "KeyGenerator", cfor22);
            Cfor cfor23 = InterfaceC17788l.vip;
            AbstractC11043l.adcel(configurableProvider, str, "$KeyGen192", "KeyGenerator", cfor23);
            Cfor cfor24 = InterfaceC17788l.metrica;
            configurableProvider.addAlgorithm("KeyGenerator", cfor24, str + "$KeyGen256");
            AbstractC11043l.vip(str, "$KeyFactory", "SecretKeyFactory.ARIA", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor2, "ARIA");
            StringBuilder sbSignatures2 = AbstractC5020l.signatures(configurableProvider, "Alg.Alias.SecretKeyFactory", "ARIA", str, cfor3);
            sbSignatures2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIACCM", sbSignatures2.toString());
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(cfor21, "ARIACCM", str, AbstractC12900l.license(cfor20, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator.", AbstractC12900l.license(cfor19, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), configurableProvider), configurableProvider), configurableProvider), "$CCM", configurableProvider, "Cipher.ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor19, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor20, "CCM");
            StringBuilder sbSignatures3 = AbstractC5020l.signatures(configurableProvider, "Alg.Alias.Cipher", "CCM", str, cfor21);
            sbSignatures3.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIAGCM", sbSignatures3.toString());
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(cfor24, "ARIAGCM", str, AbstractC12900l.license(cfor23, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator.", AbstractC12900l.license(cfor22, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), configurableProvider), configurableProvider), configurableProvider), "$GCM", configurableProvider, "Cipher.ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor23, "ARIAGCM");
            StringBuilder sbSignatures4 = AbstractC5020l.signatures(configurableProvider, "Alg.Alias.Cipher", "ARIAGCM", str, cfor24);
            sbSignatures4.append("$GMAC");
            addGMacAlgorithm(configurableProvider, "ARIA", sbSignatures4.toString(), AbstractC12900l.firebase(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "ARIA", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new C0800l(new C9786l(new pro(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(new pro()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new C11919l((InterfaceC10952l) new pro()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new startapp(new pro()));
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new adcel(new pro()));
        }
    }

    private ARIA() {
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("ARIA", i, new C18017l());
        }

        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private C3066l ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            C18262l.metrica("unknown format specified");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = C3066l.vip(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof smaato)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                smaato smaatoVar = (smaato) algorithmParameterSpec;
                this.ccmParams = new C3066l(smaatoVar.getIV(), smaatoVar.f36569l / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.billing()) : new smaato(AbstractC14024l.crashlytics(this.ccmParams.f6596l), this.ccmParams.f6595l * 8);
            }
            if (cls == smaato.class) {
                return new smaato(AbstractC14024l.crashlytics(this.ccmParams.f6596l), this.ccmParams.f6595l * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(AbstractC14024l.crashlytics(this.ccmParams.f6596l));
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            this.ccmParams = C3066l.vip(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.ccmParams = C3066l.vip(bArr);
            } else {
                C18262l.metrica("unknown format specified");
            }
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private C12196l gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            C18262l.metrica("unknown format specified");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = C12196l.vip(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof smaato)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                smaato smaatoVar = (smaato) algorithmParameterSpec;
                this.gcmParams = new C12196l(smaatoVar.getIV(), smaatoVar.f36569l / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.billing()) : new smaato(AbstractC14024l.crashlytics(this.gcmParams.f24239l), this.gcmParams.f24238l * 8);
            }
            if (cls == smaato.class) {
                return new smaato(AbstractC14024l.crashlytics(this.gcmParams.f24239l), this.gcmParams.f24238l * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(AbstractC14024l.crashlytics(this.gcmParams.f24239l));
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            this.gcmParams = C12196l.vip(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.gcmParams = C12196l.vip(bArr);
            } else {
                C18262l.metrica("unknown format specified");
            }
        }
    }
}
