package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC9361l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC15006l;
import defpackage.InterfaceC18049l;
import defpackage.InterfaceC4368l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC8134l;
import ealvatag.tag.datatype.DataTypes;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class RSA {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.rsa.";
    private static final Map<String, String> generalRsaAttributes;

    static {
        HashMap map = new HashMap();
        generalRsaAttributes = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        private void addDigestSignature(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
            String strFirebase = AbstractC12900l.firebase(str, "WITHRSA");
            String strFirebase2 = AbstractC12900l.firebase(str, "withRSA");
            String strFirebase3 = AbstractC12900l.firebase(str, "WithRSA");
            String strFirebase4 = AbstractC12900l.firebase(str, "/RSA");
            String strFirebase5 = AbstractC12900l.firebase(str, "WITHRSAENCRYPTION");
            String strFirebase6 = AbstractC12900l.firebase(str, "withRSAEncryption");
            String strFirebase7 = AbstractC12900l.firebase(str, "WithRSAEncryption");
            configurableProvider.addAlgorithm("Signature.".concat(strFirebase), str2);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strFirebase2), strFirebase);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strFirebase3), strFirebase);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strFirebase5), strFirebase);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strFirebase6), strFirebase);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strFirebase7), strFirebase);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strFirebase4), strFirebase);
            if (cfor != null) {
                configurableProvider.addAlgorithm("Alg.Alias.Signature." + cfor, strFirebase);
                AbstractC11043l.metrica(new StringBuilder("Alg.Alias.Signature.OID."), cfor, configurableProvider, strFirebase);
            }
            configurableProvider.addAttributes("Signature.".concat(strFirebase), RSA.generalRsaAttributes);
        }

        private void addISO9796Signature(ConfigurableProvider configurableProvider, String str, String str2) {
            StringBuilder sbSignatures = AbstractC4338l.signatures(str, "WITHRSA/ISO9796-2", configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, "WITHRSA/ISO9796-2", configurableProvider, AbstractC15560l.Signature("Alg.Alias.Signature.", str, "withRSA/ISO9796-2"), "Alg.Alias.Signature."), str, "WithRSA/ISO9796-2"), "Signature.");
            sbSignatures.append(str);
            sbSignatures.append("WITHRSA/ISO9796-2");
            configurableProvider.addAlgorithm(sbSignatures.toString(), str2);
            configurableProvider.addAttributes(AbstractC15560l.Signature("Signature.", str, "WITHRSA/ISO9796-2"), RSA.generalRsaAttributes);
        }

        private void addPSSSignature(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
            String strStartapp = AbstractC14814l.startapp("WITHRSAAND", str2);
            if (str2.equals("MGF1")) {
                configurableProvider.addAlgorithm(AbstractC0653l.ads(AbstractC4338l.signatures(str, strStartapp, configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, strStartapp, configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, strStartapp, configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, strStartapp, configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, strStartapp, configurableProvider, AbstractC15560l.Signature("Alg.Alias.Signature.", str, "withRSA/PSS"), "Alg.Alias.Signature."), str, "WithRSA/PSS"), "Alg.Alias.Signature."), str, "WITHRSA/PSS"), "Alg.Alias.Signature."), str, "withRSASSA-PSS"), "Alg.Alias.Signature."), str, "WithRSASSA-PSS"), "Alg.Alias.Signature."), str, "WITHRSASSA-PSS"), str + strStartapp);
            }
            configurableProvider.addAlgorithm(AbstractC9361l.ad(AbstractC4338l.signatures(str, strStartapp, configurableProvider, AbstractC9361l.ad(AbstractC4338l.signatures(str, strStartapp, configurableProvider, AbstractC14814l.adcel("Alg.Alias.Signature.", str, "withRSAand", str2), "Alg.Alias.Signature."), str, "WithRSAAnd", str2), "Signature."), str, "WITHRSAAND", str2), str3);
            StringBuilder sb = new StringBuilder("Signature.");
            sb.append(str);
            configurableProvider.addAttributes(AbstractC0653l.ads(sb, "WITHRSAAND", str2), RSA.generalRsaAttributes);
        }

        private void addX931Signature(ConfigurableProvider configurableProvider, String str, String str2) {
            StringBuilder sbSignatures = AbstractC4338l.signatures(str, "WITHRSA/X9.31", configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, "WITHRSA/X9.31", configurableProvider, AbstractC15560l.Signature("Alg.Alias.Signature.", str, "withRSA/X9.31"), "Alg.Alias.Signature."), str, "WithRSA/X9.31"), "Signature.");
            sbSignatures.append(str);
            sbSignatures.append("WITHRSA/X9.31");
            configurableProvider.addAlgorithm(sbSignatures.toString(), str2);
            configurableProvider.addAttributes(AbstractC15560l.Signature("Signature.", str, "WITHRSA/X9.31"), RSA.generalRsaAttributes);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
            configurableProvider.addAlgorithm("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-224WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-256WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-384WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-512WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
            configurableProvider.addAttributes("Cipher.RSA", RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            Cfor cfor = InterfaceC0543l.f1922throw;
            configurableProvider.addAlgorithm("Cipher", cfor, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding", RSA.generalRsaAttributes);
            Cfor cfor2 = InterfaceC18049l.f35345l;
            configurableProvider.addAlgorithm("Cipher", cfor2, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding", RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
            configurableProvider.addAlgorithm("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
            configurableProvider.addAlgorithm("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding", RSA.generalRsaAttributes);
            Cfor cfor3 = InterfaceC0543l.f1866continue;
            configurableProvider.addAlgorithm("Cipher", cfor3, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding", RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding", RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//RAW", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
            configurableProvider.addAlgorithm("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyFactory.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi$PSS");
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            registerOid(configurableProvider, cfor, "RSA", keyFactorySpi);
            registerOid(configurableProvider, cfor2, "RSA", keyFactorySpi);
            registerOid(configurableProvider, cfor3, "RSA", keyFactorySpi);
            Cfor cfor4 = InterfaceC0543l.f1918static;
            registerOid(configurableProvider, cfor4, "RSA", keyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, cfor, "RSA");
            registerOidAlgorithmParameters(configurableProvider, cfor2, "RSA");
            registerOidAlgorithmParameters(configurableProvider, cfor3, "OAEP");
            registerOidAlgorithmParameters(configurableProvider, cfor4, "PSS");
            configurableProvider.addAlgorithm("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA", RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + cfor4, "RSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + cfor4, "RSASSA-PSS");
            configurableProvider.addAlgorithm("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA", RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS", RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RAWRSA", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSA", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
            addPSSSignature(configurableProvider, "SHA224", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
            addPSSSignature(configurableProvider, "SHA256", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
            addPSSSignature(configurableProvider, "SHA384", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
            addPSSSignature(configurableProvider, "SHA512", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
            addPSSSignature(configurableProvider, "SHA512(224)", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
            addPSSSignature(configurableProvider, "SHA512(256)", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
            addPSSSignature(configurableProvider, "SHA3-224", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
            addPSSSignature(configurableProvider, "SHA3-256", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
            addPSSSignature(configurableProvider, "SHA3-384", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
            addPSSSignature(configurableProvider, "SHA3-512", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
            addPSSSignature(configurableProvider, "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHAKE128WithRSAPSS", InterfaceC15006l.yandex);
            addPSSSignature(configurableProvider, "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHAKE256WithRSAPSS", InterfaceC15006l.loadAd);
            addPSSSignature(configurableProvider, "SHA224", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA256", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA384", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA512", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA512(224)", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA512(256)", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA224", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA256", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA384", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA512", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA512(224)", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA512(256)", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA3-224", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA3-256", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA3-384", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA3-512", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSAandSHAKE128");
            addPSSSignature(configurableProvider, "SHA3-224", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA3-256", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA3-384", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSAandSHAKE256");
            addPSSSignature(configurableProvider, "SHA3-512", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSAandSHAKE256");
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD2")) {
                addDigestSignature(configurableProvider, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", InterfaceC0543l.f1863catch);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD4")) {
                addDigestSignature(configurableProvider, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", InterfaceC0543l.f1868else);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD5")) {
                addDigestSignature(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", InterfaceC0543l.f1862case);
                addISO9796Signature(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "SHA1")) {
                configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
                configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
                addPSSSignature(configurableProvider, "SHA1", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
                addPSSSignature(configurableProvider, "SHA1", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSAandSHAKE128");
                addPSSSignature(configurableProvider, "SHA1", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSAandSHAKE256");
                addDigestSignature(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", InterfaceC0543l.f1920switch);
                addISO9796Signature(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
                StringBuilder sb = new StringBuilder("Alg.Alias.Signature.");
                Cfor cfor5 = InterfaceC4502l.admob;
                AbstractC11043l.metrica(AbstractC12900l.license(cfor5, "SHA1WITHRSA", "Alg.Alias.Signature.OID.", sb, configurableProvider), cfor5, configurableProvider, "SHA1WITHRSA");
                addX931Signature(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
            }
            addDigestSignature(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", InterfaceC0543l.f1871goto);
            addDigestSignature(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", InterfaceC0543l.f1867default);
            addDigestSignature(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", InterfaceC0543l.f1869final);
            addDigestSignature(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", InterfaceC0543l.f1914new);
            addDigestSignature(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", InterfaceC0543l.f1919super);
            addDigestSignature(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", InterfaceC0543l.f1873import);
            addDigestSignature(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", InterfaceC8134l.f16948finally);
            addDigestSignature(configurableProvider, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", InterfaceC8134l.f16994this);
            addDigestSignature(configurableProvider, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", InterfaceC8134l.f16998try);
            addDigestSignature(configurableProvider, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", InterfaceC8134l.f16938break);
            addISO9796Signature(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD128")) {
                addDigestSignature(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", InterfaceC4368l.purchase);
                addDigestSignature(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", null);
                addX931Signature(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
                addX931Signature(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD160")) {
                addDigestSignature(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", InterfaceC4368l.amazon);
                addDigestSignature(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", null);
                configurableProvider.addAlgorithm("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
                configurableProvider.addAlgorithm("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
                addX931Signature(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
                addX931Signature(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD256")) {
                addDigestSignature(configurableProvider, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", InterfaceC4368l.billing);
                addDigestSignature(configurableProvider, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", null);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "WHIRLPOOL")) {
                addISO9796Signature(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                addISO9796Signature(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                addX931Signature(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
                addX931Signature(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            }
        }

        private void addPSSSignature(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
            configurableProvider.addAlgorithm(AbstractC0653l.ads(AbstractC4338l.signatures(str, "WITHRSAPSS", configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, "WITHRSAPSS", configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, "WITHRSAPSS", configurableProvider, AbstractC0653l.ads(AbstractC4338l.signatures(str, "WITHRSAPSS", configurableProvider, AbstractC15560l.Signature("Alg.Alias.Signature.", str, "withRSA/PSS"), "Alg.Alias.Signature."), str, "WithRSA/PSS"), "Alg.Alias.Signature."), str, "withRSASSA-PSS"), "Alg.Alias.Signature."), str, "WithRSASSA-PSS"), "Alg.Alias.Signature."), str, "WITHRSASSA-PSS"), str + "WITHRSAPSS");
            configurableProvider.addAlgorithm(DataTypes.OBJ_SIGNATURE, cfor, str2);
            configurableProvider.addAlgorithm("Signature." + str + "WITHRSAPSS", str2);
            configurableProvider.addAttributes(AbstractC15560l.Signature("Signature.", str, "WITHRSAPSS"), RSA.generalRsaAttributes);
        }
    }
}
