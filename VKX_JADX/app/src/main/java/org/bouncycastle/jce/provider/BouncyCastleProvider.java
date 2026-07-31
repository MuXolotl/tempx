package org.bouncycastle.jce.provider;

import defpackage.AbstractC12900l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC9008l;
import defpackage.AbstractC9361l;
import defpackage.C0161l;
import defpackage.C0934l;
import defpackage.C10876l;
import defpackage.C15365l;
import defpackage.C17029l;
import defpackage.C2595l;
import defpackage.C2756l;
import defpackage.C7388l;
import defpackage.C8339l;
import defpackage.Cfor;
import defpackage.EnumC2441l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC13726l;
import defpackage.InterfaceC15464l;
import defpackage.InterfaceC18562l;
import defpackage.InterfaceC2522l;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class BouncyCastleProvider extends Provider implements ConfigurableProvider {
    private static final String ASYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.asymmetric.";
    private static final String DIGEST_PACKAGE = "org.bouncycastle.jcajce.provider.digest.";
    private static final String KDF_PACKAGE = "org.bouncycastle.jcajce.provider.kdf.";
    private static final String KEYSTORE_PACKAGE = "org.bouncycastle.jcajce.provider.keystore.";
    private static final String SECURE_RANDOM_PACKAGE = "org.bouncycastle.jcajce.provider.drbg.";
    private static final String SYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.symmetric.";
    private Map<String, Provider.Service> serviceMap;
    private static final Logger LOG = Logger.getLogger(BouncyCastleProvider.class.getName());
    private static String info = "BouncyCastle Security Provider v1.84";
    public static final ProviderConfiguration CONFIGURATION = new BouncyCastleProviderConfiguration();
    private static final Map keyInfoConverters = new HashMap();
    private static final Class revChkClass = ClassUtil.loadClass(BouncyCastleProvider.class, "java.security.cert.PKIXRevocationChecker");
    private static final String[] SYMMETRIC_GENERIC = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT", "HKDF"};
    private static final String[] SYMMETRIC_MACS = {"SipHash", "SipHash128", "Poly1305"};
    private static final InterfaceC15464l[] SYMMETRIC_CIPHERS = {service("AES", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("ARC4", 20), service("ARIA", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("Blowfish", 128), service("Camellia", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("CAST5", 128), service("CAST6", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("ChaCha", 128), service("DES", 56), service("DESede", 112), service("GOST28147", 128), service("Grainv1", 128), service("Grain128", 128), service("HC128", 128), service("HC256", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("IDEA", 128), service("Noekeon", 128), service("RC2", 128), service("RC5", 128), service("RC6", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("Rijndael", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("Salsa20", 128), service("SEED", 128), service("Serpent", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("Shacal2", 128), service("Skipjack", 80), service("SM4", 128), service("TEA", 128), service("Twofish", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("Threefish", 128), service("VMPC", 128), service("VMPCKSA3", 128), service("XTEA", 128), service("XSalsa20", 128), service("OpenSSLPBKDF", 128), service("DSTU7624", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("GOST3412_2015", PSKKeyManager.MAX_KEY_LENGTH_BYTES), service("Zuc", 128)};
    private static final String[] ASYMMETRIC_GENERIC = {"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures", "NoSig"};
    private static final String[] ASYMMETRIC_CIPHERS = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "NTRU", "Falcon", "CONTEXT", "SLHDSA", "MLDSA", "MLKEM", "SPHINCSPlus"};
    private static final String[] DIGESTS = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
    public static final String PROVIDER_NAME = "BC";
    private static final String[] KEYSTORES = {PROVIDER_NAME, "BCFKS", "PKCS12"};
    private static final String[] SECURE_RANDOMS = {"DRBG"};
    private static final String[] KDFS = {"HKDF", "PBKDF2", "SCRYPT"};

    public static class JcaCryptoService implements InterfaceC15464l {
        private final int bitsOfSecurity;
        private final String name;

        public JcaCryptoService(String str, int i) {
            this.name = str;
            this.bitsOfSecurity = i;
        }

        public int bitsOfSecurity() {
            return this.bitsOfSecurity;
        }

        public Object getParams() {
            return null;
        }

        public EnumC2441l getPurpose() {
            return EnumC2441l.f5219l;
        }

        @Override // defpackage.InterfaceC15464l
        public String getServiceName() {
            return this.name;
        }
    }

    public BouncyCastleProvider() {
        super(PROVIDER_NAME, 1.84d, info);
        this.serviceMap = new ConcurrentHashMap();
        AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jce.provider.BouncyCastleProvider.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                BouncyCastleProvider.this.setup();
                return null;
            }
        });
    }

    private static AsymmetricKeyInfoConverter getAsymmetricKeyInfoConverter(Cfor cfor) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        Map map = keyInfoConverters;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(cfor);
        }
        return asymmetricKeyInfoConverter;
    }

    public static PrivateKey getPrivateKey(C2756l c2756l) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(c2756l.f5961l.f20787l);
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePrivate(c2756l);
    }

    public static PublicKey getPublicKey(C17029l c17029l) {
        if (c17029l.f33175l.f20787l.m195strictfp(InterfaceC2522l.f5500try)) {
            return new C2595l(5).generatePublic(c17029l);
        }
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(c17029l.f33175l.f20787l);
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePublic(c17029l);
    }

    private void loadAlgorithms(String str, InterfaceC15464l[] interfaceC15464lArr) {
        for (int i = 0; i != interfaceC15464lArr.length; i++) {
            InterfaceC15464l interfaceC15464l = interfaceC15464lArr[i];
            AbstractC8776l.yandex();
            loadServiceClass(str, interfaceC15464l.getServiceName());
        }
    }

    private void loadPQCKeys() {
        AbstractC12900l.pro(this, InterfaceC2522l.isPro);
        AbstractC12900l.pro(this, InterfaceC2522l.firebase);
        AbstractC12900l.pro(this, InterfaceC2522l.smaato);
        AbstractC12900l.pro(this, InterfaceC2522l.remoteconfig);
        AbstractC12900l.pro(this, InterfaceC2522l.vip);
        AbstractC12900l.pro(this, InterfaceC2522l.metrica);
        AbstractC12900l.pro(this, InterfaceC2522l.startapp);
        AbstractC12900l.pro(this, InterfaceC2522l.adcel);
        AbstractC12900l.pro(this, InterfaceC2522l.ads);
        AbstractC12900l.pro(this, InterfaceC2522l.subscription);
        AbstractC12900l.pro(this, InterfaceC2522l.tapsense);
        AbstractC12900l.pro(this, InterfaceC2522l.Signature);
        AbstractC12900l.pro(this, InterfaceC2522l.license);
        AbstractC12900l.pro(this, InterfaceC2522l.pro);
        AbstractC12900l.pro(this, InterfaceC2522l.ad);
        AbstractC12900l.pro(this, InterfaceC2522l.advert);
        AbstractC12900l.pro(this, InterfaceC2522l.isVip);
        AbstractC12900l.pro(this, InterfaceC2522l.signatures);
        AbstractC12900l.pro(this, InterfaceC2522l.premium);
        AbstractC12900l.pro(this, InterfaceC2522l.applovin);
        AbstractC12900l.pro(this, InterfaceC2522l.appmetrica);
        AbstractC12900l.pro(this, InterfaceC2522l.inmobi);
        AbstractC12900l.pro(this, InterfaceC2522l.f5498throws);
        AbstractC12900l.pro(this, InterfaceC2522l.f5486package);
        AbstractC12900l.pro(this, InterfaceC2522l.f5495synchronized);
        AbstractC12900l.pro(this, InterfaceC2522l.f5492strictfp);
        AbstractC12900l.pro(this, InterfaceC2522l.f5501volatile);
        AbstractC12900l.pro(this, InterfaceC2522l.f5484native);
        AbstractC12900l.pro(this, InterfaceC2522l.f5487private);
        AbstractC12900l.pro(this, InterfaceC2522l.f5326extends);
        AbstractC12900l.pro(this, InterfaceC2522l.f5329for);
        AbstractC12900l.pro(this, InterfaceC2522l.f5497throw);
        AbstractC12900l.pro(this, InterfaceC2522l.f5320catch);
        AbstractC12900l.pro(this, InterfaceC2522l.f5325else);
        AbstractC12900l.pro(this, InterfaceC2522l.f5319case);
        AbstractC12900l.pro(this, InterfaceC2522l.f5494switch);
        AbstractC12900l.pro(this, InterfaceC2522l.f5323continue);
        AbstractC12900l.pro(this, InterfaceC2522l.f5491static);
        AbstractC12900l.pro(this, InterfaceC2522l.f5327final);
        addKeyInfoConverter(InterfaceC2522l.f5330goto, new C2595l(6));
        AbstractC12900l.pro(this, new Cfor("1.3.9999.6.4.10"));
        AbstractC12900l.pro(this, InterfaceC2522l.f5493super);
        AbstractC12900l.pro(this, InterfaceC2522l.f5317abstract);
        AbstractC12900l.pro(this, InterfaceC2522l.f5489public);
        addKeyInfoConverter(InterfaceC13726l.yandex, new C2595l(7));
        addKeyInfoConverter(InterfaceC13726l.loadAd, new C2595l(3));
        int i = 8;
        addKeyInfoConverter(InterfaceC13726l.crashlytics, new C2595l(i));
        addKeyInfoConverter(InterfaceC18562l.yandex, new C2595l(i));
        int i2 = 9;
        addKeyInfoConverter(InterfaceC13726l.amazon, new C2595l(i2));
        addKeyInfoConverter(InterfaceC18562l.loadAd, new C2595l(i2));
        addKeyInfoConverter(InterfaceC0543l.f1892l, new C2595l(2));
        addKeyInfoConverter(InterfaceC2522l.f5500try, new C2595l(5));
        Cfor cfor = InterfaceC2522l.f5464l;
        addKeyInfoConverter(cfor, new C0934l(cfor));
        Cfor cfor2 = InterfaceC2522l.f5437l;
        addKeyInfoConverter(cfor2, new C0934l(cfor2));
        Cfor cfor3 = InterfaceC2522l.f5439l;
        addKeyInfoConverter(cfor3, new C0934l(cfor3));
        Cfor cfor4 = InterfaceC2522l.f5343l;
        addKeyInfoConverter(cfor4, new C0934l(cfor4));
        addKeyInfoConverter(InterfaceC2522l.f5453l, new C15365l());
        addKeyInfoConverter(InterfaceC2522l.f5455l, new C15365l());
        addKeyInfoConverter(InterfaceC2522l.f5346l, new C15365l());
        addKeyInfoConverter(InterfaceC2522l.f5435l, new C15365l());
        addKeyInfoConverter(InterfaceC2522l.f5432l, new C15365l());
        addKeyInfoConverter(InterfaceC2522l.f5384l, new C15365l());
        int i3 = 1;
        addKeyInfoConverter(InterfaceC2522l.f5380l, new C2595l(i3));
        addKeyInfoConverter(InterfaceC2522l.f5381l, new C2595l(i3));
        addKeyInfoConverter(InterfaceC2522l.f5469l, new C2595l(i3));
        addKeyInfoConverter(InterfaceC2522l.f5470l, new C2595l(i3));
        addKeyInfoConverter(InterfaceC2522l.f5482l, new C2595l(i3));
        int i4 = 0;
        addKeyInfoConverter(InterfaceC2522l.f5454l, new C2595l(i4));
        addKeyInfoConverter(InterfaceC2522l.f5423l, new C2595l(i4));
        addKeyInfoConverter(InterfaceC2522l.f5440l, new C2595l(i4));
        addKeyInfoConverter(InterfaceC2522l.f5476l, new C7388l());
        addKeyInfoConverter(InterfaceC2522l.f5473l, new C7388l());
        addKeyInfoConverter(InterfaceC2522l.f5361l, new C7388l());
        addKeyInfoConverter(InterfaceC2522l.f5387l, new C10876l());
        addKeyInfoConverter(InterfaceC2522l.f5409l, new C10876l());
        addKeyInfoConverter(InterfaceC2522l.f5350l, new C10876l());
        int i5 = 4;
        addKeyInfoConverter(InterfaceC2522l.f5388l, new C2595l(i5));
        addKeyInfoConverter(InterfaceC2522l.f5456l, new C2595l(i5));
        addKeyInfoConverter(InterfaceC2522l.f5451l, new C2595l(i5));
        addKeyInfoConverter(InterfaceC2522l.f5422l, new C2595l(i5));
        addKeyInfoConverter(InterfaceC2522l.f5477l, new C0161l());
        addKeyInfoConverter(InterfaceC2522l.f5420l, new C0161l());
        addKeyInfoConverter(InterfaceC2522l.f5446l, new C0161l());
        addKeyInfoConverter(InterfaceC2522l.f5336l, new C0161l());
        AbstractC12900l.Signature(this, InterfaceC2522l.f5402l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5478l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5340l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5370l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5378l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5407l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5483l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5427l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5362l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5430l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5364l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5377l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5369l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5390l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5436l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5341l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5465l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5393l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5382l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5429l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5399l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5352l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5414l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5466l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5443l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5344l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5366l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5345l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5367l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5474l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5395l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5452l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5383l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5379l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5354l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5418l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5416l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5457l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5357l);
        AbstractC12900l.Signature(this, InterfaceC2522l.f5368l);
    }

    private void loadServiceClass(String str, String str2) {
        Class clsLoadClass = ClassUtil.loadClass(BouncyCastleProvider.class, str + str2 + "$Mappings");
        if (clsLoadClass != null) {
            try {
                ((AlgorithmProvider) clsLoadClass.newInstance()).configure(this);
            } catch (Exception e) {
                throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e);
            }
        }
    }

    private static InterfaceC15464l service(String str, int i) {
        return new JcaCryptoService(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        String str;
        String str2;
        loadAlgorithms(DIGEST_PACKAGE, DIGESTS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_GENERIC);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_MACS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_CIPHERS);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_GENERIC);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_CIPHERS);
        loadAlgorithms(KEYSTORE_PACKAGE, KEYSTORES);
        loadAlgorithms(SECURE_RANDOM_PACKAGE, SECURE_RANDOMS);
        loadAlgorithms(KDF_PACKAGE, KDFS);
        loadPQCKeys();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = revChkClass;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, Cfor cfor, String str2, Map<String, String> map) {
        addAlgorithm(str, cfor, str2);
        addAttributes(str + "." + cfor, map);
        addAttributes(str + ".OID." + cfor, map);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        put(str + " ImplementedIn", "Software");
        for (String str2 : map.keySet()) {
            String strPro = AbstractC9361l.pro(str, " ", str2);
            if (containsKey(strPro)) {
                C8339l.smaato(AbstractC15560l.Signature("duplicate provider attribute key (", strPro, ") found"));
                return;
            }
            put(strPro, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(Cfor cfor, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = keyInfoConverters;
        synchronized (map) {
            map.put(cfor, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(Cfor cfor) {
        return (AsymmetricKeyInfoConverter) keyInfoConverters.get(cfor);
    }

    @Override // java.security.Provider
    public final Provider.Service getService(final String str, final String str2) {
        Provider.Service service;
        final String strPro = AbstractC9361l.pro(str, ".", AbstractC9008l.mopub(str2));
        Provider.Service service2 = this.serviceMap.get(strPro);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            try {
                service = (Provider.Service) (!this.serviceMap.containsKey(strPro) ? AccessController.doPrivileged(new PrivilegedAction<Provider.Service>() { // from class: org.bouncycastle.jce.provider.BouncyCastleProvider.2
                    @Override // java.security.PrivilegedAction
                    public Provider.Service run() {
                        Provider.Service service3 = BouncyCastleProvider.super.getService(str, str2);
                        if (service3 == null || service3.getClassName() == null) {
                            return null;
                        }
                        BouncyCastleProvider.this.serviceMap.put(strPro, service3);
                        BouncyCastleProvider.this.remove(service3.getType() + "." + service3.getAlgorithm());
                        BouncyCastleProvider.this.putService(service3);
                        return service3;
                    }
                }) : this.serviceMap.get(strPro));
            } catch (Throwable th) {
                throw th;
            }
        }
        return service;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        if (containsKey(str + "." + str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Alg.Alias.");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return containsKey(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        ProviderConfiguration providerConfiguration = CONFIGURATION;
        synchronized (providerConfiguration) {
            ((BouncyCastleProviderConfiguration) providerConfiguration).setParameter(str, obj);
        }
    }

    private void loadAlgorithms(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            loadServiceClass(str, strArr[i]);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, Cfor cfor, String str2) {
        addAlgorithm(str + "." + cfor, str2);
        addAlgorithm(str + ".OID." + cfor, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (containsKey(str)) {
            C8339l.smaato(AbstractC15560l.Signature("duplicate provider key (", str, ") found"));
        } else {
            put(str, str2);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2, Map<String, String> map) {
        addAlgorithm(str, str2);
        addAttributes(str, map);
    }
}
