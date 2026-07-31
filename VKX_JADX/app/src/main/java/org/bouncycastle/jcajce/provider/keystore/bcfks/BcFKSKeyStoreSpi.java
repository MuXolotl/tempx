package org.bouncycastle.jcajce.provider.keystore.bcfks;

import defpackage.AbstractC11186l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC13766l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC17656l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC9008l;
import defpackage.AbstractC9361l;
import defpackage.C10198l;
import defpackage.C10818l;
import defpackage.C11138l;
import defpackage.C11467l;
import defpackage.C11912l;
import defpackage.C12692l;
import defpackage.C13353l;
import defpackage.C13886l;
import defpackage.C14947l;
import defpackage.C14998l;
import defpackage.C15037l;
import defpackage.C16770l;
import defpackage.C17711l;
import defpackage.C18262l;
import defpackage.C18282l;
import defpackage.C18584l;
import defpackage.C2213l;
import defpackage.C2756l;
import defpackage.C3066l;
import defpackage.C4604l;
import defpackage.C4655l;
import defpackage.C6541l;
import defpackage.C6928l;
import defpackage.C7127l;
import defpackage.C7378l;
import defpackage.C7633l;
import defpackage.C7939l;
import defpackage.C7972l;
import defpackage.C8094l;
import defpackage.C8339l;
import defpackage.C8480l;
import defpackage.C8621l;
import defpackage.C8629l;
import defpackage.C8901l;
import defpackage.C9748l;
import defpackage.C9775l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cnative;
import defpackage.Cstrictfp;
import defpackage.Csynchronized;
import defpackage.EnumC13481l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11004l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC12977l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC17788l;
import defpackage.InterfaceC18049l;
import defpackage.InterfaceC1898l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC4787l;
import defpackage.InterfaceC5594l;
import defpackage.InterfaceC8134l;
import defpackage.advert;
import defpackage.applovin;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;

/* JADX INFO: loaded from: classes3.dex */
class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private static final Map<String, Cfor> oidMap;
    private static final Map<Cfor, String> publicAlgMap;
    private Date creationDate;
    private final InterfaceC12575l helper;
    private C10198l hmacAlgorithm;
    private C18282l hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private C10198l signatureAlgorithm;
    private InterfaceC12977l validator;
    private PublicKey verificationKey;
    private final Map<String, C8480l> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();
    private Cfor storeEncryptionAlgorithm = InterfaceC8134l.f16992switch;

    public static class DefCompat extends AdaptingKeyStoreSpi {
        public DefCompat() {
            super(new C6928l(28), new BcFKSKeyStoreSpi(new C6928l(28)));
        }
    }

    public static class DefSharedCompat extends AdaptingKeyStoreSpi {
        public DefSharedCompat() {
            super(new C6928l(28), new BcFKSKeyStoreSpi(new C6928l(28)));
        }
    }

    public static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        public ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public static class StdCompat extends AdaptingKeyStoreSpi {
        public StdCompat() {
            super(new C6928l(28), new BcFKSKeyStoreSpi(new C7633l()));
        }
    }

    public static class StdSharedCompat extends AdaptingKeyStoreSpi {
        public StdSharedCompat() {
            super(new C7633l(), new BcFKSKeyStoreSpi(new C7633l()));
        }
    }

    static {
        HashMap map = new HashMap();
        oidMap = map;
        HashMap map2 = new HashMap();
        publicAlgMap = map2;
        Cfor cfor = InterfaceC4502l.purchase;
        map.put("DESEDE", cfor);
        map.put("TRIPLEDES", cfor);
        map.put("TDEA", cfor);
        map.put("HMACSHA1", InterfaceC0543l.f1905l);
        map.put("HMACSHA224", InterfaceC0543l.f1883l);
        map.put("HMACSHA256", InterfaceC0543l.f1881l);
        map.put("HMACSHA384", InterfaceC0543l.f1906l);
        map.put("HMACSHA512", InterfaceC0543l.f1898l);
        Cfor cfor2 = InterfaceC0543l.f1899l;
        map.put("HMACSHA512/224", cfor2);
        Cfor cfor3 = InterfaceC0543l.f1877l;
        map.put("HMACSHA512/256", cfor3);
        map.put("HMACSHA512(224)", cfor2);
        map.put("HMACSHA512(256)", cfor3);
        map.put("HMACSHA3-224", InterfaceC8134l.remoteconfig);
        map.put("HMACSHA3-256", InterfaceC8134l.vip);
        map.put("HMACSHA3-384", InterfaceC8134l.metrica);
        map.put("HMACSHA3-512", InterfaceC8134l.startapp);
        map.put("KMAC128", InterfaceC8134l.tapsense);
        map.put("KMAC256", InterfaceC8134l.Signature);
        map.put("SEED", InterfaceC1898l.yandex);
        map.put("CAMELLIA.128", InterfaceC5594l.yandex);
        map.put("CAMELLIA.192", InterfaceC5594l.loadAd);
        map.put("CAMELLIA.256", InterfaceC5594l.crashlytics);
        map.put("ARIA.128", InterfaceC17788l.loadAd);
        map.put("ARIA.192", InterfaceC17788l.billing);
        map.put("ARIA.256", InterfaceC17788l.isPro);
        map2.put(InterfaceC0543l.f1922throw, "RSA");
        map2.put(InterfaceC15427l.f30173l, "EC");
        map2.put(InterfaceC4502l.subs, "DH");
        map2.put(InterfaceC0543l.f1860abstract, "DH");
        map2.put(InterfaceC15427l.f30177l, "DSA");
        CERTIFICATE = BigInteger.valueOf(0L);
        PRIVATE_KEY = BigInteger.valueOf(1L);
        SECRET_KEY = BigInteger.valueOf(2L);
        PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
    }

    public BcFKSKeyStoreSpi(InterfaceC12575l interfaceC12575l) {
        this.helper = interfaceC12575l;
    }

    private byte[] calculateMac(byte[] bArr, C10198l c10198l, C18282l c18282l, char[] cArr) throws IOException {
        String strInmobi = c10198l.f20787l.inmobi();
        Mac macStartapp = this.helper.startapp(strInmobi);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            macStartapp.init(new SecretKeySpec(generateKey(c18282l, "INTEGRITY_CHECK", cArr, -1), strInmobi));
            return macStartapp.doFinal(bArr);
        } catch (InvalidKeyException e) {
            C11467l.smaato(e.getMessage(), "Cannot set up MAC calculation: ");
            return null;
        }
    }

    private Cipher createCipher(String str, byte[] bArr) throws InvalidKeyException {
        Cipher cipherSubs = this.helper.subs(str);
        cipherSubs.init(1, new SecretKeySpec(bArr, "AES"));
        return cipherSubs;
    }

    private C11912l createPrivateKeySequence(C7378l c7378l, Certificate[] certificateArr) {
        C10818l[] c10818lArr = new C10818l[certificateArr.length];
        for (int i = 0; i != certificateArr.length; i++) {
            c10818lArr[i] = C10818l.vip(certificateArr[i].getEncoded());
        }
        return new C11912l(c7378l, c10818lArr);
    }

    private Certificate decodeCertificate(Object obj) {
        InterfaceC12575l interfaceC12575l = this.helper;
        if (interfaceC12575l != null) {
            try {
                return interfaceC12575l.pro("X.509").generateCertificate(new ByteArrayInputStream(C10818l.vip(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(C10818l.vip(obj).getEncoded()));
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, C10198l c10198l, char[] cArr, byte[] bArr) throws IOException {
        AlgorithmParameters algorithmParametersAdvert;
        Cipher cipherSubs;
        if (!c10198l.f20787l.ad(InterfaceC0543l.f1915protected)) {
            C18262l.metrica("BCFKS KeyStore cannot recognize protection algorithm.");
            return null;
        }
        C4655l c4655lVip = C4655l.vip(c10198l.f20786l);
        C9748l c9748l = c4655lVip.f9472l;
        try {
            C10198l c10198l2 = c9748l.f19885l;
            C10198l c10198l3 = c9748l.f19885l;
            if (c10198l2.f20787l.ad(InterfaceC8134l.f16992switch)) {
                cipherSubs = this.helper.subs("AES/CCM/NoPadding");
                algorithmParametersAdvert = this.helper.advert("CCM");
                algorithmParametersAdvert.init(C3066l.vip(c10198l3.f20786l).getEncoded());
            } else {
                if (!c10198l3.f20787l.ad(InterfaceC8134l.f16943continue)) {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                algorithmParametersAdvert = null;
                cipherSubs = this.helper.subs("AESKWP");
            }
            C18282l c18282l = c4655lVip.f9473l;
            if (cArr == null) {
                cArr = new char[0];
            }
            cipherSubs.init(2, new SecretKeySpec(generateKey(c18282l, str, cArr, 32), "AES"), algorithmParametersAdvert);
            return cipherSubs.doFinal(bArr);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString());
        }
    }

    private Date extractCreationDate(C8480l c8480l, Date date) {
        try {
            return c8480l.f17523l.appmetrica();
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(C18282l c18282l, String str, char[] cArr, int i) throws IOException {
        byte[] bArrPKCS12PasswordToBytes = AbstractC11186l.PKCS12PasswordToBytes(cArr);
        byte[] bArrPKCS12PasswordToBytes2 = AbstractC11186l.PKCS12PasswordToBytes(str.toCharArray());
        boolean zAd = InterfaceC4787l.tapsense.ad(c18282l.f35779l.f20787l);
        C10198l c10198l = c18282l.f35779l;
        if (zAd) {
            C8629l c8629lVip = C8629l.vip(c10198l.f20786l);
            BigInteger bigInteger = c8629lVip.f17786l;
            BigInteger bigInteger2 = c8629lVip.f17783l;
            if (bigInteger != null) {
                i = bigInteger.intValue();
            } else if (i == -1) {
                C18262l.metrica("no keyLength found in ScryptParams");
                return null;
            }
            int i2 = i;
            return AbstractC13766l.purchase(AbstractC14024l.mopub(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), c8629lVip.f17784l.intValue(), bigInteger2.intValue(), AbstractC14024l.crashlytics(c8629lVip.f17785l), bigInteger2.intValue(), i2);
        }
        if (!c10198l.f20787l.ad(InterfaceC0543l.f1923transient)) {
            C18262l.metrica("BCFKS KeyStore: unrecognized MAC PBKD.");
            return null;
        }
        C16770l c16770lVip = C16770l.vip(c10198l.f20786l);
        BigInteger bigIntegerMetrica = c16770lVip.metrica();
        Cstrictfp cstrictfp = c16770lVip.f32782l;
        if (bigIntegerMetrica != null) {
            i = c16770lVip.metrica().intValue();
        } else if (i == -1) {
            C18262l.metrica("no keyLength found in PBKDF2Params");
            return null;
        }
        if (c16770lVip.ads().f20787l.ad(InterfaceC0543l.f1898l)) {
            C8094l c8094l = new C8094l(new C17711l());
            c8094l.init(AbstractC14024l.mopub(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), c16770lVip.tapsense(), cstrictfp.appmetrica().intValue());
            return ((C13886l) c8094l.generateDerivedParameters(i * 8)).f27156l;
        }
        if (!c16770lVip.ads().f20787l.ad(InterfaceC8134l.startapp)) {
            C11467l.smaato(c16770lVip.ads().f20787l, "BCFKS KeyStore: unrecognized MAC PBKD PRF: ");
            return null;
        }
        C8094l c8094l2 = new C8094l(new C4604l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        c8094l2.init(AbstractC14024l.mopub(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), c16770lVip.tapsense(), cstrictfp.appmetrica().intValue());
        return ((C13886l) c8094l2.generateDerivedParameters(i * 8)).f27156l;
    }

    private C18282l generatePkbdAlgorithmIdentifier(C18282l c18282l, int i) {
        Cfor cfor = InterfaceC4787l.tapsense;
        boolean zAd = cfor.ad(c18282l.f35779l.f20787l);
        C10198l c10198l = c18282l.f35779l;
        if (zAd) {
            C8629l c8629lVip = C8629l.vip(c10198l.f20786l);
            byte[] bArr = new byte[AbstractC14024l.crashlytics(c8629lVip.f17785l).length];
            getDefaultSecureRandom().nextBytes(bArr);
            return new C18282l(cfor, new C8629l(bArr, c8629lVip.f17784l, c8629lVip.f17783l, c8629lVip.f17787l, BigInteger.valueOf(i)));
        }
        C16770l c16770lVip = C16770l.vip(c10198l.f20786l);
        byte[] bArr2 = new byte[c16770lVip.tapsense().length];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new C18282l(InterfaceC0543l.f1923transient, new C16770l(bArr2, c16770lVip.f32782l.appmetrica().intValue(), i, c16770lVip.ads()));
    }

    private C10198l generateSignatureAlgId(Key key, EnumC13481l enumC13481l) throws IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof InterfaceC11004l) {
            if (enumC13481l == EnumC13481l.f26469l) {
                return new C10198l(InterfaceC15427l.f30147l);
            }
            if (enumC13481l == EnumC13481l.f26474l) {
                return new C10198l(InterfaceC8134l.f16987public);
            }
        }
        if (key instanceof DSAKey) {
            if (enumC13481l == EnumC13481l.f26472l) {
                return new C10198l(InterfaceC8134l.f16944default);
            }
            if (enumC13481l == EnumC13481l.f26471l) {
                return new C10198l(InterfaceC8134l.f16991super);
            }
        }
        if (key instanceof RSAKey) {
            EnumC13481l enumC13481l2 = EnumC13481l.f26473l;
            C14998l c14998l = C14998l.f29509l;
            if (enumC13481l == enumC13481l2) {
                return new C10198l(InterfaceC0543l.f1914new, c14998l);
            }
            if (enumC13481l == EnumC13481l.f26475l) {
                return new C10198l(InterfaceC8134l.f16938break, c14998l);
            }
        }
        C18262l.metrica("unknown signature algorithm");
        return null;
    }

    private SecureRandom getDefaultSecureRandom() {
        return AbstractC8776l.loadAd();
    }

    private C7939l getEncryptedObjectStoreData(C10198l c10198l, char[] cArr) throws NoSuchAlgorithmException, IOException {
        C8480l[] c8480lArr = (C8480l[]) this.entries.values().toArray(new C8480l[this.entries.size()]);
        C18282l c18282lGeneratePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] bArrGenerateKey = generateKey(c18282lGeneratePkbdAlgorithmIdentifier, "STORE_ENCRYPTION", cArr, 32);
        C8901l c8901l = new C8901l(c10198l, this.creationDate, this.lastModifiedDate, new C9775l(c8480lArr));
        try {
            Cfor cfor = this.storeEncryptionAlgorithm;
            Cfor cfor2 = InterfaceC8134l.f16992switch;
            if (!cfor.ad(cfor2)) {
                return new C7939l(new C10198l(InterfaceC0543l.f1915protected, new C4655l(c18282lGeneratePkbdAlgorithmIdentifier, new C9748l(InterfaceC8134l.f16943continue))), createCipher("AESKWP", bArrGenerateKey).doFinal(c8901l.getEncoded()));
            }
            Cipher cipherCreateCipher = createCipher("AES/CCM/NoPadding", bArrGenerateKey);
            return new C7939l(new C10198l(InterfaceC0543l.f1915protected, new C4655l(c18282lGeneratePkbdAlgorithmIdentifier, new C9748l(cfor2, C3066l.vip(cipherCreateCipher.getParameters().getEncoded())))), cipherCreateCipher.doFinal(c8901l.getEncoded()));
        } catch (InvalidKeyException e) {
            throw new IOException(e.toString());
        } catch (NoSuchProviderException e2) {
            throw new IOException(e2.toString());
        } catch (BadPaddingException e3) {
            throw new IOException(e3.toString());
        } catch (IllegalBlockSizeException e4) {
            throw new IOException(e4.toString());
        } catch (NoSuchPaddingException e5) {
            throw new NoSuchAlgorithmException(e5.toString());
        }
    }

    private static String getPublicKeyAlg(Cfor cfor) {
        String str = publicAlgMap.get(cfor);
        return str != null ? str : cfor.inmobi();
    }

    private boolean isSimilarHmacPbkd(AbstractC17656l abstractC17656l, C18282l c18282l) {
        throw null;
    }

    private void verifyMac(byte[] bArr, C7127l c7127l, char[] cArr) throws IOException {
        if (AbstractC14024l.smaato(calculateMac(bArr, c7127l.f14934l, c7127l.f14933l, cArr), AbstractC14024l.crashlytics(c7127l.f14932l.f36593l))) {
            return;
        }
        C18262l.metrica("BCFKS KeyStore corrupted: MAC calculation failed");
    }

    private void verifySig(applovin applovinVar, C12692l c12692l, PublicKey publicKey) throws SignatureException, InvalidKeyException, IOException {
        Signature signatureCreateSignature = this.helper.createSignature(c12692l.f25016l.f20787l.inmobi());
        signatureCreateSignature.initVerify(publicKey);
        signatureCreateSignature.update(applovinVar.billing().remoteconfig("DER"));
        advert advertVar = c12692l.f25014l;
        if (signatureCreateSignature.verify(new C13353l(advertVar.applovin(), advertVar.firebase()).inmobi())) {
            return;
        }
        C18262l.metrica("BCFKS KeyStore corrupted: signature calculation failed");
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (str != null) {
            return this.entries.containsKey(str);
        }
        C6541l.subs("alias value is null");
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.entries.get(str) == null) {
            return;
        }
        this.privateKeyCache.remove(str);
        this.entries.remove(str);
        this.lastModifiedDate = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        C8480l c8480l = this.entries.get(str);
        if (c8480l == null) {
            return null;
        }
        BigInteger bigInteger = c8480l.f17525l;
        if (!bigInteger.equals(PRIVATE_KEY) && !bigInteger.equals(PROTECTED_PRIVATE_KEY)) {
            if (bigInteger.equals(CERTIFICATE)) {
                return decodeCertificate(c8480l.vip());
            }
            return null;
        }
        C10818l[] c10818lArr = C11912l.vip(c8480l.vip()).f23753l;
        C10818l[] c10818lArr2 = new C10818l[c10818lArr.length];
        System.arraycopy(c10818lArr, 0, c10818lArr2, 0, c10818lArr.length);
        return decodeCertificate(c10818lArr2[0]);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate != null) {
            try {
                byte[] encoded = certificate.getEncoded();
                for (String str : this.entries.keySet()) {
                    C8480l c8480l = this.entries.get(str);
                    BigInteger bigInteger = c8480l.f17525l;
                    if (bigInteger.equals(CERTIFICATE)) {
                        if (Arrays.equals(c8480l.vip(), encoded)) {
                            return str;
                        }
                    } else if (bigInteger.equals(PRIVATE_KEY) || bigInteger.equals(PROTECTED_PRIVATE_KEY)) {
                        try {
                            C10818l[] c10818lArr = C11912l.vip(c8480l.vip()).f23753l;
                            C10818l[] c10818lArr2 = new C10818l[c10818lArr.length];
                            System.arraycopy(c10818lArr, 0, c10818lArr2, 0, c10818lArr.length);
                            if (Arrays.equals(c10818lArr2[0].f21866l.getEncoded(), encoded)) {
                                return str;
                            }
                        } catch (IOException unused) {
                            continue;
                        }
                    }
                }
            } catch (CertificateEncodingException unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        C8480l c8480l = this.entries.get(str);
        if (c8480l == null) {
            return null;
        }
        BigInteger bigInteger = c8480l.f17525l;
        if (!bigInteger.equals(PRIVATE_KEY) && !bigInteger.equals(PROTECTED_PRIVATE_KEY)) {
            return null;
        }
        C10818l[] c10818lArr = C11912l.vip(c8480l.vip()).f23753l;
        int length = c10818lArr.length;
        C10818l[] c10818lArr2 = new C10818l[length];
        System.arraycopy(c10818lArr, 0, c10818lArr2, 0, c10818lArr.length);
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i = 0; i != length; i++) {
            x509CertificateArr[i] = decodeCertificate(c10818lArr2[i]);
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        C8480l c8480l = this.entries.get(str);
        if (c8480l == null) {
            return null;
        }
        try {
            return c8480l.f17527l.appmetrica();
        } catch (ParseException unused) {
            return new Date();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException {
        C8621l c8621l;
        C8480l c8480l = this.entries.get(str);
        C14947l c14947l = null;
        if (c8480l == null) {
            return null;
        }
        BigInteger bigInteger = c8480l.f17525l;
        if (bigInteger.equals(PRIVATE_KEY) || bigInteger.equals(PROTECTED_PRIVATE_KEY)) {
            PrivateKey privateKey = this.privateKeyCache.get(str);
            if (privateKey != null) {
                return privateKey;
            }
            C7378l c7378lVip = C7378l.vip(C11912l.vip(c8480l.vip()).f23754l);
            try {
                C2756l c2756lVip = C2756l.vip(decryptData("PRIVATE_KEY_ENCRYPTION", c7378lVip.f15307l, cArr, AbstractC14024l.crashlytics(c7378lVip.f15306l.f36593l)));
                PrivateKey privateKeyGeneratePrivate = this.helper.premium(getPublicKeyAlg(c2756lVip.f5961l.f20787l)).generatePrivate(new PKCS8EncodedKeySpec(c2756lVip.getEncoded()));
                this.privateKeyCache.put(str, privateKeyGeneratePrivate);
                return privateKeyGeneratePrivate;
            } catch (Exception e) {
                throw new UnrecoverableKeyException(AbstractC12900l.admob(e, AbstractC5020l.isVip("BCFKS KeyStore unable to recover private key (", str, "): ")));
            }
        }
        if (!bigInteger.equals(SECRET_KEY) && !bigInteger.equals(PROTECTED_SECRET_KEY)) {
            throw new UnrecoverableKeyException(AbstractC15560l.Signature("BCFKS KeyStore unable to recover secret key (", str, "): type not recognized"));
        }
        byte[] bArrVip = c8480l.vip();
        if (bArrVip instanceof C8621l) {
            c8621l = (C8621l) bArrVip;
        } else {
            c8621l = bArrVip != 0 ? new C8621l(Cclass.inmobi(bArrVip)) : null;
        }
        try {
            byte[] bArrDecryptData = decryptData("SECRET_KEY_ENCRYPTION", c8621l.f17770l, cArr, AbstractC14024l.crashlytics(c8621l.f17769l.f36593l));
            if (bArrDecryptData instanceof C14947l) {
                c14947l = (C14947l) bArrDecryptData;
            } else if (bArrDecryptData != 0) {
                c14947l = new C14947l(Cclass.inmobi(bArrDecryptData));
            }
            return this.helper.signatures(c14947l.f29420l.inmobi()).generateSecret(new SecretKeySpec(AbstractC14024l.crashlytics(c14947l.f29419l.f36593l), c14947l.f29420l.inmobi()));
        } catch (Exception e2) {
            throw new UnrecoverableKeyException(AbstractC12900l.admob(e2, AbstractC5020l.isVip("BCFKS KeyStore unable to recover secret key (", str, "): ")));
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        C8480l c8480l = this.entries.get(str);
        if (c8480l != null) {
            return c8480l.f17525l.equals(CERTIFICATE);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        C8480l c8480l = this.entries.get(str);
        if (c8480l == null) {
            return false;
        }
        BigInteger bigInteger = c8480l.f17525l;
        return bigInteger.equals(PRIVATE_KEY) || bigInteger.equals(SECRET_KEY) || bigInteger.equals(PROTECTED_PRIVATE_KEY) || bigInteger.equals(PROTECTED_SECRET_KEY);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        C10198l c10198l;
        C8901l c8901lVip;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.verificationKey = null;
            this.hmacAlgorithm = new C10198l(InterfaceC0543l.f1898l, C14998l.f29509l);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(InterfaceC0543l.f1923transient, 64);
            return;
        }
        try {
            Ccase ccaseAds = new Csynchronized(inputStream).ads();
            C2213l c2213l = ccaseAds != null ? new C2213l(Cclass.inmobi(ccaseAds)) : null;
            C18584l c18584l = c2213l.f4890l;
            Cnative cnative = c2213l.f4891l;
            int i = c18584l.f36282l;
            Cnative cnative2 = c18584l.f36281l;
            if (i == 0) {
                C7127l c7127l = cnative2 instanceof C7127l ? (C7127l) cnative2 : cnative2 != null ? new C7127l(Cclass.inmobi(cnative2)) : null;
                c10198l = c7127l.f14934l;
                this.hmacAlgorithm = c10198l;
                this.hmacPkbdAlgorithm = c7127l.f14933l;
                try {
                    verifyMac(cnative.billing().getEncoded(), c7127l, cArr);
                } catch (NoSuchProviderException e) {
                    C18262l.metrica(e.getMessage());
                    return;
                }
            } else {
                if (i != 1) {
                    C18262l.metrica("BCFKS KeyStore unable to recognize integrity check.");
                    return;
                }
                C12692l c12692l = cnative2 instanceof C12692l ? (C12692l) cnative2 : cnative2 != null ? new C12692l(Cclass.inmobi(cnative2)) : null;
                c10198l = c12692l.f25016l;
                try {
                    Cclass cclass = c12692l.f25015l;
                    if (cclass != null) {
                        int size = cclass.size();
                        C10818l[] c10818lArr = new C10818l[size];
                        for (int i2 = 0; i2 != size; i2++) {
                            c10818lArr[i2] = C10818l.vip(cclass.mo173throws(i2));
                        }
                    }
                    verifySig(cnative, c12692l, this.verificationKey);
                } catch (GeneralSecurityException e2) {
                    throw new IOException("error verifying signature: " + e2.getMessage(), e2);
                }
            }
            if (cnative instanceof C7939l) {
                C7939l c7939l = (C7939l) cnative;
                c8901lVip = C8901l.vip(decryptData("STORE_ENCRYPTION", c7939l.f16540l, cArr, c7939l.f16539l.f36593l));
            } else {
                c8901lVip = C8901l.vip(cnative);
            }
            try {
                this.creationDate = c8901lVip.f18288l.appmetrica();
                this.lastModifiedDate = c8901lVip.f18292l.appmetrica();
                if (!c8901lVip.f18289l.equals(c10198l)) {
                    C18262l.metrica("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                    return;
                }
                Iterator it = c8901lVip.f18291l.iterator();
                while (true) {
                    C15037l c15037l = (C15037l) it;
                    if (!c15037l.hasNext()) {
                        return;
                    }
                    Object next = c15037l.next();
                    C8480l c8480l = next instanceof C8480l ? (C8480l) next : next != null ? new C8480l(Cclass.inmobi(next)) : null;
                    this.entries.put(c8480l.f17524l, c8480l);
                }
            } catch (ParseException unused) {
                C18262l.metrica("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e3) {
            C18262l.metrica(e3.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date dateExtractCreationDate;
        C8480l c8480l = this.entries.get(str);
        Date date = new Date();
        if (c8480l == null) {
            dateExtractCreationDate = date;
        } else {
            if (!c8480l.f17525l.equals(CERTIFICATE)) {
                throw new KeyStoreException(AbstractC14814l.startapp("BCFKS KeyStore already has a key entry with alias ", str));
            }
            dateExtractCreationDate = extractCreationDate(c8480l, date);
        }
        try {
            this.entries.put(str, new C8480l(CERTIFICATE, str, dateExtractCreationDate, date, certificate.getEncoded()));
            this.lastModifiedDate = date;
        } catch (CertificateEncodingException e) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e.getMessage(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        C14947l c14947l;
        C8621l c8621l;
        C7378l c7378l;
        Date date = new Date();
        C8480l c8480l = this.entries.get(str);
        Date dateExtractCreationDate = c8480l != null ? extractCreationDate(c8480l, date) : date;
        this.privateKeyCache.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                C18282l c18282lGeneratePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(InterfaceC0543l.f1923transient, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrGenerateKey = generateKey(c18282lGeneratePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                Cfor cfor = this.storeEncryptionAlgorithm;
                Cfor cfor2 = InterfaceC8134l.f16992switch;
                if (cfor.ad(cfor2)) {
                    Cipher cipherCreateCipher = createCipher("AES/CCM/NoPadding", bArrGenerateKey);
                    c7378l = new C7378l(new C10198l(InterfaceC0543l.f1915protected, new C4655l(c18282lGeneratePkbdAlgorithmIdentifier, new C9748l(cfor2, C3066l.vip(cipherCreateCipher.getParameters().getEncoded())))), cipherCreateCipher.doFinal(encoded));
                } else {
                    c7378l = new C7378l(new C10198l(InterfaceC0543l.f1915protected, new C4655l(c18282lGeneratePkbdAlgorithmIdentifier, new C9748l(InterfaceC8134l.f16943continue))), createCipher("AESKWP", bArrGenerateKey).doFinal(encoded));
                }
                this.entries.put(str, new C8480l(PRIVATE_KEY, str, dateExtractCreationDate, date, createPrivateKeySequence(c7378l, certificateArr).getEncoded()));
            } catch (Exception e) {
                throw new ExtKeyStoreException(AbstractC5020l.ads(e, new StringBuilder("BCFKS KeyStore exception storing private key: ")), e);
            }
        } else {
            if (!(key instanceof SecretKey)) {
                throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
            }
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                C18282l c18282lGeneratePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(InterfaceC0543l.f1923transient, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrGenerateKey2 = generateKey(c18282lGeneratePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String strMopub = AbstractC9008l.mopub(key.getAlgorithm());
                if (strMopub.indexOf("AES") > -1) {
                    c14947l = new C14947l(InterfaceC8134l.license, encoded2);
                } else {
                    Map<String, Cfor> map = oidMap;
                    Cfor cfor3 = map.get(strMopub);
                    if (cfor3 != null) {
                        c14947l = new C14947l(cfor3, encoded2);
                    } else {
                        Cfor cfor4 = map.get(strMopub + "." + (encoded2.length * 8));
                        if (cfor4 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + strMopub + ") for storage.");
                        }
                        c14947l = new C14947l(cfor4, encoded2);
                    }
                }
                Cfor cfor5 = this.storeEncryptionAlgorithm;
                Cfor cfor6 = InterfaceC8134l.f16992switch;
                if (cfor5.ad(cfor6)) {
                    Cipher cipherCreateCipher2 = createCipher("AES/CCM/NoPadding", bArrGenerateKey2);
                    c8621l = new C8621l(new C10198l(InterfaceC0543l.f1915protected, new C4655l(c18282lGeneratePkbdAlgorithmIdentifier2, new C9748l(cfor6, C3066l.vip(cipherCreateCipher2.getParameters().getEncoded())))), cipherCreateCipher2.doFinal(c14947l.getEncoded()));
                } else {
                    c8621l = new C8621l(new C10198l(InterfaceC0543l.f1915protected, new C4655l(c18282lGeneratePkbdAlgorithmIdentifier2, new C9748l(InterfaceC8134l.f16943continue))), createCipher("AESKWP", bArrGenerateKey2).doFinal(c14947l.getEncoded()));
                }
                this.entries.put(str, new C8480l(SECRET_KEY, str, dateExtractCreationDate, date, c8621l.getEncoded()));
            } catch (Exception e2) {
                throw new ExtKeyStoreException(AbstractC5020l.ads(e2, new StringBuilder("BCFKS KeyStore exception storing private key: ")), e2);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
        C18282l c18282l;
        BigInteger bigIntegerMetrica;
        if (this.creationDate == null) {
            C18262l.metrica("KeyStore not initialized");
            return;
        }
        C7939l encryptedObjectStoreData = getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
        boolean zAd = InterfaceC4787l.tapsense.ad(this.hmacPkbdAlgorithm.f35779l.f20787l);
        C18282l c18282l2 = this.hmacPkbdAlgorithm;
        if (zAd) {
            C8629l c8629lVip = C8629l.vip(c18282l2.f35779l.f20786l);
            c18282l = this.hmacPkbdAlgorithm;
            bigIntegerMetrica = c8629lVip.f17786l;
        } else {
            C16770l c16770lVip = C16770l.vip(c18282l2.f35779l.f20786l);
            c18282l = this.hmacPkbdAlgorithm;
            bigIntegerMetrica = c16770lVip.metrica();
        }
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(c18282l, bigIntegerMetrica.intValue());
        try {
            C18584l c18584l = new C18584l(new C7127l(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C11138l c11138l = new C11138l(encryptedObjectStoreData, c18584l);
            c11138l.f22357l = -1;
            c11138l.metrica(new C7972l(2, byteArrayOutputStream), true);
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.flush();
        } catch (NoSuchProviderException e) {
            C11467l.smaato(e.getMessage(), "cannot calculate mac: ");
        }
    }

    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new C6928l(28));
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws ExtKeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new C6928l(28));
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new C7633l());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws ExtKeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
            super(new C7633l());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements InterfaceC0543l, InterfaceC18049l {
        private final Map<String, byte[]> cache;
        private final byte[] seedKey;

        public SharedKeyStoreSpi(InterfaceC12575l interfaceC12575l) {
            super(interfaceC12575l);
            try {
                byte[] bArr = new byte[32];
                this.seedKey = bArr;
                interfaceC12575l.adcel().nextBytes(bArr);
                this.cache = new HashMap();
            } catch (GeneralSecurityException e) {
                throw new IllegalArgumentException("can't create random - " + e.toString());
            }
        }

        private byte[] calculateMac(String str, char[] cArr) {
            byte[] bArrMopub;
            if (cArr != null) {
                bArrMopub = AbstractC14024l.mopub(AbstractC9008l.billing(cArr), AbstractC9008l.billing(str.toCharArray()));
            } else {
                byte[] bArr = this.seedKey;
                String str2 = AbstractC9008l.yandex;
                bArrMopub = AbstractC14024l.mopub(bArr, AbstractC9008l.billing(str.toCharArray()));
            }
            return AbstractC13766l.purchase(bArrMopub, 16384, 8, this.seedKey, 1, 32);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException {
            try {
                byte[] bArrCalculateMac = calculateMac(str, cArr);
                if (this.cache.containsKey(str) && !AbstractC14024l.smaato(this.cache.get(str), bArrCalculateMac)) {
                    throw new UnrecoverableKeyException(AbstractC15560l.Signature("unable to recover key (", str, ")"));
                }
                Key keyEngineGetKey = super.engineGetKey(str, cArr);
                if (keyEngineGetKey != null && !this.cache.containsKey(str)) {
                    this.cache.put(str, bArrCalculateMac);
                }
                return keyEngineGetKey;
            } catch (InvalidKeyException e) {
                StringBuilder sbIsVip = AbstractC5020l.isVip("unable to recover key (", str, "): ");
                sbIsVip.append(e.getMessage());
                throw new UnrecoverableKeyException(sbIsVip.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }
    }

    private C18282l generatePkbdAlgorithmIdentifier(Cfor cfor, int i) {
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        Cfor cfor2 = InterfaceC0543l.f1923transient;
        if (cfor2.ad(cfor)) {
            return new C18282l(cfor2, new C16770l(bArr, 51200, i, new C10198l(InterfaceC0543l.f1898l, C14998l.f29509l)));
        }
        C8339l.smaato(AbstractC9361l.license("unknown derivation algorithm: ", cfor));
        return null;
    }

    private C18282l generatePkbdAlgorithmIdentifier(AbstractC17656l abstractC17656l, int i) {
        Cfor cfor = InterfaceC4787l.yandex;
        throw null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        throw new IllegalArgumentException("no support for 'parameter' of type ".concat(loadStoreParameter.getClass().getName()));
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else {
            C8339l.metrica("no support for 'parameter' of type ".concat(loadStoreParameter.getClass().getName()));
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws ExtKeyStoreException {
        Date date = new Date();
        C8480l c8480l = this.entries.get(str);
        Date dateExtractCreationDate = c8480l != null ? extractCreationDate(c8480l, date) : date;
        if (certificateArr != null) {
            try {
                C7378l c7378lVip = C7378l.vip(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new C8480l(PROTECTED_PRIVATE_KEY, str, dateExtractCreationDate, date, createPrivateKeySequence(c7378lVip, certificateArr).getEncoded()));
                } catch (Exception e) {
                    throw new ExtKeyStoreException(AbstractC5020l.ads(e, new StringBuilder("BCFKS KeyStore exception storing protected private key: ")), e);
                }
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
            }
        } else {
            try {
                this.entries.put(str, new C8480l(PROTECTED_SECRET_KEY, str, dateExtractCreationDate, date, bArr));
            } catch (Exception e3) {
                throw new ExtKeyStoreException(AbstractC5020l.ads(e3, new StringBuilder("BCFKS KeyStore exception storing protected private key: ")), e3);
            }
        }
        this.lastModifiedDate = date;
    }
}
