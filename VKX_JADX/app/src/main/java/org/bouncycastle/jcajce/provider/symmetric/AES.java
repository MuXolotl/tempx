package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.C10348l;
import defpackage.C10352l;
import defpackage.C10551l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C11919l;
import defpackage.C12196l;
import defpackage.C13516l;
import defpackage.C15461l;
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
import defpackage.C7972l;
import defpackage.C9786l;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.InterfaceC0484l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC2232l;
import defpackage.InterfaceC2522l;
import defpackage.InterfaceC8134l;
import defpackage.InterfaceC9719l;
import defpackage.adcel;
import defpackage.appmetrica;
import defpackage.isPro;
import defpackage.metrica;
import defpackage.smaato;
import defpackage.startapp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
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
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class AES {
    private static final Map<String, String> generalAesAttributes;

    public static class AESCCMMAC extends BaseMac {
        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    public static class AESCCMMAC128 extends BaseMac {
        public AESCCMMAC128() {
            super(128, new CCMMac());
        }
    }

    public static class AESCCMMAC192 extends BaseMac {
        public AESCCMMAC192() {
            super(192, new CCMMac());
        }
    }

    public static class AESCCMMAC256 extends BaseMac {
        public AESCCMMAC256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new CCMMac());
        }
    }

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new C10348l(metrica.loadAd()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new C5501l(11, C2283l.isPro(metrica.loadAd())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("AES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            SecureRandom secureRandomLoadAd = this.random;
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
            this.random = secureRandomLoadAd;
            byte[] bArr = new byte[12];
            secureRandomLoadAd.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("CCM");
                byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                appmetrica appmetricaVar = new appmetrica(2, 0);
                appmetricaVar.purchase(new C11327l(bArrCrashlytics));
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                c11138l.metrica(new C7972l(2, byteArrayOutputStream), true);
                algorithmParametersCreateParametersInstance.init(byteArrayOutputStream.toByteArray());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            SecureRandom secureRandomLoadAd = this.random;
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
            this.random = secureRandomLoadAd;
            byte[] bArr = new byte[12];
            secureRandomLoadAd.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GCM");
                byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                appmetrica appmetricaVar = new appmetrica(2, 0);
                appmetricaVar.purchase(new C11327l(bArrCrashlytics));
                appmetricaVar.purchase(Cstrictfp.m4580private(16));
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                c11138l.metrica(new C7972l(2, byteArrayOutputStream), true);
                algorithmParametersCreateParametersInstance.init(byteArrayOutputStream.toByteArray());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "AES IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(metrica.loadAd()), 128);
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, new C4998l(metrica.loadAd()), 128);
        }
    }

    public static class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(192, new C4998l(metrica.loadAd()), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(192, new C4998l(metrica.loadAd()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((isPro) C7383l.purchase(metrica.loadAd()), false, 12);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(128, C7383l.purchase(metrica.loadAd()), false, 12);
        }
    }

    public static class CCM192 extends BaseBlockCipher {
        public CCM192() {
            super(192, C7383l.purchase(metrica.loadAd()), false, 12);
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, C7383l.purchase(metrica.loadAd()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new C15461l(new C6717l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(128, new C15461l(new C6717l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class CFB192 extends BaseBlockCipher {
        public CFB192() {
            super(192, new C15461l(new C6717l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C15461l(new C6717l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return metrica.loadAd();
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(128, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB128.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return metrica.loadAd();
                }
            });
        }
    }

    public static class ECB192 extends BaseBlockCipher {
        public ECB192() {
            super(192, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB192.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return metrica.loadAd();
                }
            });
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB256.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return metrica.loadAd();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(C2283l.isPro(metrica.loadAd()));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(128, C2283l.isPro(metrica.loadAd()));
        }
    }

    public static class GCM192 extends BaseBlockCipher {
        public GCM192() {
            super(192, C2283l.isPro(metrica.loadAd()));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, C2283l.isPro(metrica.loadAd()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
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
        private static final String PREFIX = AES.class.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.AES", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            Cfor cfor = InterfaceC8134l.ad;
            StringBuilder sbLicense = AbstractC12900l.license(cfor, "AES", "Alg.Alias.AlgorithmParameters.", sb2, configurableProvider);
            Cfor cfor2 = InterfaceC8134l.f16996throws;
            StringBuilder sbLicense2 = AbstractC12900l.license(cfor2, "AES", "Alg.Alias.AlgorithmParameters.", sbLicense, configurableProvider);
            Cfor cfor3 = InterfaceC8134l.f16949for;
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(cfor3, "AES", str, sbLicense2, configurableProvider);
            sbRemoteconfig.append("$AlgParamsGCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", sbRemoteconfig.toString());
            StringBuilder sb3 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            Cfor cfor4 = InterfaceC8134l.premium;
            StringBuilder sbLicense3 = AbstractC12900l.license(cfor4, "GCM", "Alg.Alias.AlgorithmParameters.", sb3, configurableProvider);
            Cfor cfor5 = InterfaceC8134l.f16999volatile;
            StringBuilder sbLicense4 = AbstractC12900l.license(cfor5, "GCM", "Alg.Alias.AlgorithmParameters.", sbLicense3, configurableProvider);
            Cfor cfor6 = InterfaceC8134l.f16939case;
            StringBuilder sbRemoteconfig2 = AbstractC12900l.remoteconfig(cfor6, "GCM", str, sbLicense4, configurableProvider);
            sbRemoteconfig2.append("$AlgParamsCCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", sbRemoteconfig2.toString());
            StringBuilder sb4 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            Cfor cfor7 = InterfaceC8134l.applovin;
            StringBuilder sbLicense5 = AbstractC12900l.license(cfor7, "CCM", "Alg.Alias.AlgorithmParameters.", sb4, configurableProvider);
            Cfor cfor8 = InterfaceC8134l.f16982native;
            StringBuilder sbLicense6 = AbstractC12900l.license(cfor8, "CCM", "Alg.Alias.AlgorithmParameters.", sbLicense5, configurableProvider);
            Cfor cfor9 = InterfaceC8134l.f16992switch;
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(cfor9, "CCM", str, sbLicense6, configurableProvider), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + cfor, "AES");
            StringBuilder sbLicense7 = AbstractC12900l.license(cfor2, "AES", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), configurableProvider);
            sbLicense7.append(cfor3);
            configurableProvider.addAlgorithm(sbLicense7.toString(), "AES");
            configurableProvider.addAttributes("Cipher.AES", AES.generalAesAttributes);
            AbstractC11043l.vip(str, "$ECB", "Cipher.AES", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            Cfor cfor10 = InterfaceC8134l.pro;
            AbstractC11043l.adcel(configurableProvider, str, "$ECB128", "Cipher", cfor10);
            Cfor cfor11 = InterfaceC8134l.inmobi;
            AbstractC11043l.adcel(configurableProvider, str, "$ECB192", "Cipher", cfor11);
            Cfor cfor12 = InterfaceC8134l.f16946extends;
            configurableProvider.addAlgorithm("Cipher", cfor12, str + "$ECB256");
            configurableProvider.addAlgorithm("Cipher", cfor3, AbstractC0653l.ads(AbstractC5020l.pro(cfor2, "$CBC192", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(new StringBuilder(), str, "$CBC128"), str, cfor), configurableProvider), str, "$CBC256"));
            Cfor cfor13 = InterfaceC8134l.advert;
            AbstractC11043l.adcel(configurableProvider, str, "$OFB128", "Cipher", cfor13);
            Cfor cfor14 = InterfaceC8134l.f16984package;
            AbstractC11043l.adcel(configurableProvider, str, "$OFB192", "Cipher", cfor14);
            Cfor cfor15 = InterfaceC8134l.f16995throw;
            AbstractC11043l.adcel(configurableProvider, str, "$OFB256", "Cipher", cfor15);
            Cfor cfor16 = InterfaceC8134l.isVip;
            AbstractC11043l.adcel(configurableProvider, str, "$CFB128", "Cipher", cfor16);
            Cfor cfor17 = InterfaceC8134l.f16993synchronized;
            AbstractC11043l.adcel(configurableProvider, str, "$CFB192", "Cipher", cfor17);
            Cfor cfor18 = InterfaceC8134l.f16940catch;
            configurableProvider.addAlgorithm("Cipher", cfor18, str + "$CFB256");
            configurableProvider.addAttributes("Cipher.AESWRAP", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAP", str + "$Wrap");
            Cfor cfor19 = InterfaceC8134l.signatures;
            AbstractC11043l.adcel(configurableProvider, str, "$Wrap128", "Cipher", cfor19);
            Cfor cfor20 = InterfaceC8134l.f16990strictfp;
            AbstractC11043l.adcel(configurableProvider, str, "$Wrap192", "Cipher", cfor20);
            Cfor cfor21 = InterfaceC8134l.f16945else;
            AbstractC11043l.adcel(configurableProvider, str, "$Wrap256", "Cipher", cfor21);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", AES.generalAesAttributes);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            AbstractC4338l.applovin(sb5, "$WrapPad", configurableProvider, "Cipher.AESWRAPPAD");
            Cfor cfor22 = InterfaceC8134l.appmetrica;
            AbstractC11043l.adcel(configurableProvider, str, "$WrapPad128", "Cipher", cfor22);
            Cfor cfor23 = InterfaceC8134l.f16985private;
            AbstractC11043l.adcel(configurableProvider, str, "$WrapPad192", "Cipher", cfor23);
            Cfor cfor24 = InterfaceC8134l.f16943continue;
            AbstractC11043l.adcel(configurableProvider, str, "$WrapPad256", "Cipher", cfor24);
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CCM", AbstractC4338l.advert("Cipher.AESRFC5649WRAP", AbstractC4338l.advert("Cipher.AESRFC3211WRAP", AbstractC4338l.advert("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD", configurableProvider, str, "$RFC3211Wrap"), configurableProvider, str, "$RFC5649Wrap"), configurableProvider, str, "$AlgParamGenCCM"));
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + cfor7, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + cfor8, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + cfor9, "CCM");
            configurableProvider.addAttributes("Cipher.CCM", AES.generalAesAttributes);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            StringBuilder sbPro = AbstractC5020l.pro(cfor9, "$CCM256", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC5020l.pro(cfor7, "$CCM128", "Cipher", AbstractC4338l.isVip("$CCM", "Cipher.CCM", str, sb6, configurableProvider), configurableProvider), str, "$CCM192"), str, cfor8), configurableProvider);
            sbPro.append(str);
            sbPro.append("$AlgParamGenGCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", sbPro.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + cfor4, "GCM");
            StringBuilder sbLicense8 = AbstractC12900l.license(cfor5, "GCM", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), configurableProvider);
            sbLicense8.append(cfor6);
            configurableProvider.addAlgorithm(sbLicense8.toString(), "GCM");
            configurableProvider.addAttributes("Cipher.GCM", AES.generalAesAttributes);
            StringBuilder sbIsVip = AbstractC4338l.isVip("$AESCMAC", "Mac.AESCMAC", str, AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor23, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.AESWRAPPAD", AbstractC5020l.pro(cfor9, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor7, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor5, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor21, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor19, "$KeyGen128", "KeyGenerator", AbstractC4338l.isVip("$KeyGen", "KeyGenerator.AESWRAP", str, AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor15, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor12, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor14, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor11, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor13, "$KeyGen128", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor10, "$KeyGen128", "KeyGenerator", AbstractC4338l.isVip("$KeyGen256", "KeyGenerator.2.16.840.1.101.3.4.42", str, AbstractC4338l.isVip("$KeyGen192", "KeyGenerator.2.16.840.1.101.3.4.22", str, AbstractC4338l.isVip("$KeyGen128", "KeyGenerator.2.16.840.1.101.3.4.2", str, AbstractC4338l.isVip("$KeyGen", "KeyGenerator.AES", str, AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC5020l.pro(cfor5, "$GCM192", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC11043l.subs(str, "$GCM", "Cipher.GCM", new StringBuilder(), configurableProvider), str, "$GCM128"), str, cfor4), configurableProvider), str, "$GCM256"), str, cfor6), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$KeyGen128"), str, cfor), configurableProvider), str, "$KeyGen128"), str, cfor16), configurableProvider), str, "$KeyGen192"), str, cfor2), configurableProvider), str, "$KeyGen192"), str, cfor17), configurableProvider), str, "$KeyGen256"), str, cfor3), configurableProvider), str, "$KeyGen256"), str, cfor18), configurableProvider), configurableProvider), str, "$KeyGen192"), str, cfor20), configurableProvider), str, "$KeyGen128"), str, cfor4), configurableProvider), str, "$KeyGen256"), str, cfor6), configurableProvider), str, "$KeyGen192"), str, cfor8), configurableProvider), configurableProvider), str, "$KeyGen128"), str, cfor22), configurableProvider), str, "$KeyGen256"), str, cfor24), configurableProvider);
            sbIsVip.append("$AESCCMMAC");
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", sbIsVip.toString());
            StringBuilder sbSignatures = AbstractC4338l.signatures(str, "$AESCCMMAC128", configurableProvider, "Mac." + cfor7.inmobi(), "Mac.");
            sbSignatures.append(cfor8.inmobi());
            StringBuilder sbSignatures2 = AbstractC4338l.signatures(str, "$AESCCMMAC192", configurableProvider, sbSignatures.toString(), "Mac.");
            sbSignatures2.append(cfor9.inmobi());
            configurableProvider.addAlgorithm(sbSignatures2.toString(), str + "$AESCCMMAC256");
            Cfor cfor25 = InterfaceC2522l.yandex;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor25, "PBEWITHSHAAND128BITAES-CBC-BC");
            Cfor cfor26 = InterfaceC2522l.loadAd;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor26, "PBEWITHSHAAND192BITAES-CBC-BC");
            Cfor cfor27 = InterfaceC2522l.crashlytics;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor27, "PBEWITHSHAAND256BITAES-CBC-BC");
            Cfor cfor28 = InterfaceC2522l.amazon;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            Cfor cfor29 = InterfaceC2522l.purchase;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            Cfor cfor30 = InterfaceC2522l.billing;
            AbstractC4338l.applovin(AbstractC4338l.isVip("$PBEWithSHA256AESCBC192", "Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", str, AbstractC4338l.isVip("$PBEWithSHA256AESCBC128", "Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", str, AbstractC4338l.isVip("$PBEWithSHA1AESCBC256", "Cipher.PBEWITHSHAAND256BITAES-CBC-BC", str, AbstractC4338l.isVip("$PBEWithSHA1AESCBC192", "Cipher.PBEWITHSHAAND192BITAES-CBC-BC", str, AbstractC4338l.isVip("$PBEWithSHA1AESCBC128", "Cipher.PBEWITHSHAAND128BITAES-CBC-BC", str, AbstractC5020l.signatures(configurableProvider, "Alg.Alias.Cipher", "PBEWITHSHA256AND256BITAES-CBC-BC", str, cfor30), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), "$PBEWithSHA256AESCBC256", configurableProvider, "Cipher.PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            AbstractC11043l.vip(str, "$KeyFactory", "SecretKeyFactory.AES", AbstractC11043l.subs(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", AbstractC11043l.subs(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", AbstractC11043l.subs(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", AbstractC4338l.premium(configurableProvider, "Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC", "Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC"), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("SecretKeyFactory", InterfaceC8134l.license, str + "$KeyFactory");
            AbstractC11043l.vip(str, "$PBEWithSHA256And256BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", AbstractC11043l.subs(str, "$PBEWithSHA256And192BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", AbstractC11043l.subs(str, "$PBEWithSHA256And128BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", AbstractC11043l.subs(str, "$PBEWithSHAAnd256BitAESBC", "SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", AbstractC11043l.subs(str, "$PBEWithSHAAnd192BitAESBC", "SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", AbstractC11043l.subs(str, "$PBEWithSHAAnd128BitAESBC", "SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", AbstractC11043l.subs(str, "$PBEWithMD5And256BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", AbstractC11043l.subs(str, "$PBEWithMD5And192BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", AbstractC11043l.subs(str, "$PBEWithMD5And128BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", new StringBuilder(), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor25, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor26, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor27, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor25.inmobi(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor26.inmobi(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor27.inmobi(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor28.inmobi(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor29.inmobi(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor30.inmobi(), "PKCS12PBE");
            addGMacAlgorithm(configurableProvider, "AES", str + "$AESGMAC", AbstractC12900l.firebase(str, "$KeyGen128"));
            addPoly1305Algorithm(configurableProvider, "AES", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new C15461l(new C9786l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(128, new C15461l(new C9786l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class OFB192 extends BaseBlockCipher {
        public OFB192() {
            super(192, new C15461l(new C9786l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C15461l(new C9786l(metrica.loadAd(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(new C4998l(metrica.loadAd()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new C4998l(metrica.loadAd()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new C4998l(metrica.loadAd()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new C4998l(metrica.loadAd()), 2, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new C4998l(metrica.loadAd()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new C4998l(metrica.loadAd()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new C4998l(metrica.loadAd()), 2, 4, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(metrica.loadAd()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new C11919l((InterfaceC10952l) metrica.loadAd()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new C10551l(metrica.loadAd()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new startapp(0));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new startapp(0));
        }
    }

    public static class Wrap192 extends BaseWrapCipher {
        public Wrap192() {
            super(new startapp(0));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new startapp(0));
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new adcel());
        }
    }

    public static class WrapPad128 extends BaseWrapCipher {
        public WrapPad128() {
            super(new adcel());
        }
    }

    public static class WrapPad192 extends BaseWrapCipher {
        public WrapPad192() {
            super(new adcel());
        }
    }

    public static class WrapPad256 extends BaseWrapCipher {
        public WrapPad256() {
            super(new adcel());
        }
    }

    static {
        HashMap map = new HashMap();
        generalAesAttributes = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        map.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }

    public static class CCMMac implements InterfaceC2232l {
        private final InterfaceC0484l ccm = C7383l.purchase(metrica.loadAd());
        private int macLength = 8;

        @Override // defpackage.InterfaceC2232l
        public int doFinal(byte[] bArr, int i) {
            try {
                return ((C7383l) this.ccm).doFinal(bArr, 0);
            } catch (C10352l e) {
                throw new IllegalStateException("exception on doFinal(): " + e.toString());
            }
        }

        @Override // defpackage.InterfaceC2232l
        public String getAlgorithmName() {
            return ((C7383l) this.ccm).getAlgorithmName().concat("Mac");
        }

        @Override // defpackage.InterfaceC2232l
        public int getMacSize() {
            return this.macLength;
        }

        @Override // defpackage.InterfaceC2232l
        public void init(InterfaceC9719l interfaceC9719l) {
            ((C7383l) this.ccm).init(true, interfaceC9719l);
            this.macLength = ((C7383l) this.ccm).loadAd().length;
        }

        @Override // defpackage.InterfaceC2232l
        public void reset() {
            C7383l c7383l = (C7383l) this.ccm;
            c7383l.yandex.reset();
            c7383l.subs.reset();
            c7383l.isPro.reset();
        }

        @Override // defpackage.InterfaceC2232l
        public void update(byte b) throws IOException {
            ((C7383l) this.ccm).subs.write(b);
        }

        @Override // defpackage.InterfaceC2232l
        public void update(byte[] bArr, int i, int i2) throws IOException {
            ((C7383l) this.ccm).yandex(i, i2, bArr);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("AES", i, new C18017l());
        }

        public KeyGen() {
            this(192);
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
