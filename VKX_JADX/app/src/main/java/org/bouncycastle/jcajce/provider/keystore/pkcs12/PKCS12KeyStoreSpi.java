package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import defpackage.AbstractC12489l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC16784l;
import defpackage.AbstractC17742l;
import defpackage.AbstractC5006l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC9008l;
import defpackage.AbstractC9361l;
import defpackage.C0361l;
import defpackage.C0655l;
import defpackage.C10198l;
import defpackage.C10320l;
import defpackage.C10411l;
import defpackage.C1074l;
import defpackage.C10754l;
import defpackage.C11138l;
import defpackage.C11172l;
import defpackage.C11327l;
import defpackage.C12459l;
import defpackage.C13016l;
import defpackage.C13905l;
import defpackage.C14148l;
import defpackage.C14512l;
import defpackage.C14849l;
import defpackage.C14998l;
import defpackage.C15143l;
import defpackage.C1561l;
import defpackage.C16023l;
import defpackage.C16258l;
import defpackage.C16472l;
import defpackage.C16770l;
import defpackage.C17029l;
import defpackage.C17203l;
import defpackage.C17711l;
import defpackage.C17967l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C18262l;
import defpackage.C18282l;
import defpackage.C2657l;
import defpackage.C2756l;
import defpackage.C2930l;
import defpackage.C3976l;
import defpackage.C4655l;
import defpackage.C4875l;
import defpackage.C5774l;
import defpackage.C5942l;
import defpackage.C6541l;
import defpackage.C6846l;
import defpackage.C6864l;
import defpackage.C6928l;
import defpackage.C7244l;
import defpackage.C7286l;
import defpackage.C7378l;
import defpackage.C7633l;
import defpackage.C7809l;
import defpackage.C8094l;
import defpackage.C8339l;
import defpackage.C9320l;
import defpackage.C9748l;
import defpackage.C9975l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Cstrictfp;
import defpackage.Csynchronized;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC18049l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC4787l;
import defpackage.InterfaceC5594l;
import defpackage.InterfaceC8134l;
import defpackage.InterfaceC9719l;
import defpackage.applovin;
import defpackage.appmetrica;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements InterfaceC0543l, InterfaceC18049l {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    static final int NULL = 0;
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private Cfor certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private Cfor keyAlgorithm;
    private IgnoresCaseHashtable keys;
    private IgnoresCaseHashtable localIds;
    private final InterfaceC12575l helper = new C7633l();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = AbstractC8776l.loadAd();
    private C10198l macAlgorithm = new C10198l(InterfaceC4502l.billing, C14998l.f29509l);
    private int itCount = 102400;
    private int saltLength = 20;

    public static class BCPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new C7633l(), new PKCS12KeyStoreSpi(new C7633l(), InterfaceC0543l.f1895l, InterfaceC0543l.f1911l));
        }
    }

    public static class BCPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            C7633l c7633l = new C7633l();
            C7633l c7633l2 = new C7633l();
            Cfor cfor = InterfaceC0543l.f1895l;
            super(c7633l, new PKCS12KeyStoreSpi(c7633l2, cfor, cfor));
        }
    }

    public static class BCPKCS12KeyStoreAES256 extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStoreAES256() {
            super(new C7633l(), new PKCS12KeyStoreSpi(new C7633l(), InterfaceC8134l.f16949for, InterfaceC8134l.ad));
        }
    }

    public static class BCPKCS12KeyStoreAES256GCM extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStoreAES256GCM() {
            super(new C7633l(), new PKCS12KeyStoreSpi(new C7633l(), InterfaceC8134l.f16939case, InterfaceC8134l.premium));
        }
    }

    public static class DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new C6928l(28), new PKCS12KeyStoreSpi(new C6928l(28), InterfaceC0543l.f1895l, InterfaceC0543l.f1911l));
        }
    }

    public static class DefPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore3DES() {
            C6928l c6928l = new C6928l(28);
            C6928l c6928l2 = new C6928l(28);
            Cfor cfor = InterfaceC0543l.f1895l;
            super(c6928l, new PKCS12KeyStoreSpi(c6928l2, cfor, cfor));
        }
    }

    public static class DefPKCS12KeyStoreAES256 extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStoreAES256() {
            super(new C7633l(), new PKCS12KeyStoreSpi(new C7633l(), InterfaceC8134l.f16949for, InterfaceC8134l.ad));
        }
    }

    public static class DefPKCS12KeyStoreAES256GCM extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStoreAES256GCM() {
            super(new C7633l(), new PKCS12KeyStoreSpi(new C7633l(), InterfaceC8134l.f16939case, InterfaceC8134l.premium));
        }
    }

    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        public DefaultSecretKeyProvider() {
            HashMap map = new HashMap();
            map.put(new Cfor("1.2.840.113533.7.66.10"), 128);
            map.put(InterfaceC0543l.f1872implements, 192);
            map.put(InterfaceC8134l.ad, 128);
            map.put(InterfaceC8134l.f16996throws, 192);
            Cfor cfor = InterfaceC8134l.f16949for;
            Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            map.put(cfor, numValueOf);
            map.put(InterfaceC8134l.premium, 128);
            map.put(InterfaceC8134l.f16939case, numValueOf);
            map.put(InterfaceC5594l.yandex, 128);
            map.put(InterfaceC5594l.loadAd, 192);
            map.put(InterfaceC5594l.crashlytics, numValueOf);
            map.put(InterfaceC11987l.purchase, numValueOf);
            this.KEY_SIZES = DesugarCollections.unmodifiableMap(map);
        }

        public int getKeySize(C10198l c10198l) {
            Integer num = (Integer) this.KEY_SIZES.get(c10198l.f20787l);
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : AbstractC9008l.amazon(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return new Hashtable(this.orig).keys();
        }

        public void put(String str, Object obj) {
            String strAmazon = str == null ? null : AbstractC9008l.amazon(str);
            String str2 = (String) this.keys.get(strAmazon);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(strAmazon, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : AbstractC9008l.amazon(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    public PKCS12KeyStoreSpi(InterfaceC12575l interfaceC12575l, Cfor cfor, Cfor cfor2) {
        this.keys = new IgnoresCaseHashtable();
        this.localIds = new IgnoresCaseHashtable();
        this.certs = new IgnoresCaseHashtable();
        this.keyAlgorithm = cfor;
        this.certAlgorithm = cfor2;
        try {
            this.certFact = interfaceC12575l.pro("X.509");
        } catch (Exception e) {
            C8339l.metrica(AbstractC5020l.ads(e, new StringBuilder("can't create cert factory - ")));
            throw null;
        }
    }

    private byte[] calculatePbeMac(Cfor cfor, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws IOException {
        String str;
        if (InterfaceC0543l.f1925while.ad(cfor)) {
            C5774l c5774lVip = C5774l.vip(this.macAlgorithm.f20786l);
            if (c5774lVip != null) {
                C10198l c10198l = c5774lVip.f12174l;
                if (InterfaceC0543l.f1923transient.ad(c10198l.f20787l)) {
                    C16770l c16770lVip = C16770l.vip(c10198l.f20786l);
                    if (c16770lVip.metrica() != null) {
                        C0361l c0361l = new C0361l(getPrf(c5774lVip.f12173l.f20787l));
                        C8094l c8094l = new C8094l(getPrf(c16770lVip.ads().f20787l));
                        c8094l.init(AbstractC9008l.billing(cArr), c16770lVip.tapsense(), AbstractC12489l.crashlytics(c16770lVip.f32782l.appmetrica()));
                        InterfaceC9719l interfaceC9719lGenerateDerivedParameters = c8094l.generateDerivedParameters(AbstractC16784l.admob(c16770lVip.metrica()) * 8);
                        AbstractC14024l.loadAd(c8094l.getPassword());
                        c0361l.init(interfaceC9719lGenerateDerivedParameters);
                        c0361l.update(bArr2, 0, bArr2.length);
                        byte[] bArr3 = new byte[c0361l.f1426l];
                        c0361l.doFinal(bArr3, 0);
                        return bArr3;
                    }
                    str = "Key length must be present when using PBMAC1.";
                }
            } else {
                str = "If the DigestAlgorithmIdentifier is id-PBMAC1, then the parameters field must contain valid PBMAC1-params parameters.";
            }
            C18262l.metrica(str);
            return null;
        }
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        C16023l c16023l = new C16023l(cArr, z);
        char[] cArr2 = c16023l.f31405l;
        try {
            Mac macStartapp = this.helper.startapp(cfor.inmobi());
            macStartapp.init(c16023l, pBEParameterSpec);
            macStartapp.update(bArr2);
            return macStartapp.doFinal();
        } finally {
            Arrays.fill(cArr2, (char) 0);
        }
    }

    private Cipher createCipher(int i, char[] cArr, C10198l c10198l) throws InvalidKeySpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        C4655l c4655lVip = C4655l.vip(c10198l.f20786l);
        C16770l c16770lVip = C16770l.vip(c4655lVip.f9473l.f35779l.f20786l);
        C9748l c9748l = c4655lVip.f9472l;
        C10198l c10198lVip = C10198l.vip(c9748l);
        SecretKeyFactory secretKeyFactorySignatures = this.helper.signatures(c4655lVip.f9473l.f35779l.f20787l.inmobi());
        byte[] bArrTapsense = c16770lVip.tapsense();
        int iCrashlytics = AbstractC12489l.crashlytics(c16770lVip.f32782l.appmetrica());
        int keySize = keySizeProvider.getKeySize(c10198lVip);
        C10198l c10198l2 = c16770lVip.f32784l;
        SecretKey secretKeyGenerateSecret = secretKeyFactorySignatures.generateSecret((c10198l2 == null || c10198l2.equals(C16770l.f32780l)) ? new PBEKeySpec(cArr, bArrTapsense, iCrashlytics, keySize) : new C13905l(cArr, bArrTapsense, iCrashlytics, keySize, c16770lVip.ads()));
        Cipher cipherSubs = this.helper.subs(c9748l.f19885l.f20787l.inmobi());
        applovin applovinVar = c9748l.f19885l.f20786l;
        if (applovinVar instanceof Cthrow) {
            cipherSubs.init(i, secretKeyGenerateSecret, new IvParameterSpec(Cthrow.premium(applovinVar).f36593l));
            return cipherSubs;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        if (cclassInmobi.mo173throws(1) instanceof Cfor) {
            C3976l c3976lVip = C3976l.vip(applovinVar);
            cipherSubs.init(i, secretKeyGenerateSecret, new C7244l(c3976lVip.f8163l, AbstractC14024l.crashlytics(c3976lVip.f8164l.f36593l)));
            return cipherSubs;
        }
        AlgorithmParameters algorithmParametersAdvert = this.helper.advert(c10198lVip.f20787l.inmobi());
        try {
            algorithmParametersAdvert.init(cclassInmobi.getEncoded());
            cipherSubs.init(i, secretKeyGenerateSecret, algorithmParametersAdvert);
            return cipherSubs;
        } catch (IOException e) {
            throw new InvalidKeySpecException(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C16258l createSafeBag(String str, Certificate certificate, boolean z) {
        boolean z2;
        C11327l c11327l = new C11327l(certificate.getEncoded());
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        boolean z3 = certificate instanceof InterfaceC12233l;
        Cfor cfor = InterfaceC0543l.f1888l;
        if (z3) {
            InterfaceC12233l interfaceC12233l = (InterfaceC12233l) certificate;
            C11172l c11172l = (C11172l) interfaceC12233l.getBagAttribute(cfor);
            if (z && ((c11172l == null || !c11172l.mopub().equals(str)) && str != null)) {
                interfaceC12233l.setBagAttribute(cfor, new C11172l(str));
            }
            Enumeration bagAttributeKeys = interfaceC12233l.getBagAttributeKeys();
            z2 = false;
            while (bagAttributeKeys.hasMoreElements()) {
                Cfor cfor2 = (Cfor) bagAttributeKeys.nextElement();
                if (!cfor2.ad(InterfaceC0543l.f1900l) && !cfor2.ad(InterfaceC4787l.pro)) {
                    appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
                    appmetricaVar2.purchase(cfor2);
                    appmetricaVar2.purchase(new C2930l(interfaceC12233l.getBagAttribute(cfor2)));
                    C11138l c11138l = new C11138l(appmetricaVar2);
                    c11138l.f22357l = -1;
                    appmetricaVar.purchase(c11138l);
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            appmetrica appmetricaVar3 = new appmetrica((byte) 0, 0);
            appmetricaVar3.purchase(cfor);
            C2930l c2930l = new C2930l(new C11172l(str));
            c2930l.f6383l = -1;
            appmetricaVar3.purchase(c2930l);
            C11138l c11138l2 = new C11138l(appmetricaVar3);
            c11138l2.f22357l = -1;
            appmetricaVar.purchase(c11138l2);
        }
        if (certificate instanceof X509Certificate) {
            Cthrow cthrowMetrica = C1074l.metrica(C17967l.vip(((X509Certificate) certificate).getTBSCertificate()).f34982l, C18229l.f35720l);
            C11138l c11138l3 = new C11138l(InterfaceC4787l.pro, cthrowMetrica != null ? new C2930l(C14849l.vip(cthrowMetrica.f36593l).metrica()) : new C2930l(C14512l.f28385l));
            c11138l3.f22357l = -1;
            appmetricaVar.purchase(c11138l3);
        }
        C11138l c11138l4 = new C11138l(InterfaceC0543l.f1901l, new C9320l(true, 0, c11327l));
        c11138l4.f22357l = -1;
        C2930l c2930l2 = new C2930l(appmetricaVar, true);
        c2930l2.f6383l = -1;
        return new C16258l(InterfaceC0543l.f1909l, c11138l4, c2930l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6846l createSubjectKeyId(PublicKey publicKey) {
        try {
            return new C6846l(getDigest(C17029l.vip(publicKey.getEncoded())));
        } catch (Exception unused) {
            C18073l.license("error creating key");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doStore(OutputStream outputStream, char[] cArr, boolean z, boolean z2) throws IOException {
        Cfor cfor;
        Cfor cfor2;
        C14998l c14998l;
        Cfor cfor3;
        Cfor cfor4;
        Cfor cfor5;
        String str;
        C10198l c10198l;
        Cfor cfor6;
        Cfor cfor7;
        C5942l c5942l;
        boolean z3;
        byte[] bArrWrapKey;
        C10198l c10198l2;
        boolean z4;
        int i;
        if (!z2) {
            syncFriendlyName();
        }
        int size = this.keys.size();
        String str2 = "BER";
        Cfor cfor8 = InterfaceC0543l.f1879l;
        if (size == 0) {
            if (cArr == null) {
                Enumeration enumerationKeys = this.certs.keys();
                appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
                while (enumerationKeys.hasMoreElements()) {
                    try {
                        String str3 = (String) enumerationKeys.nextElement();
                        appmetricaVar.purchase(createSafeBag(str3, (Certificate) this.certs.get(str3), z2));
                    } catch (CertificateEncodingException e) {
                        C18073l.isPro(e);
                        return;
                    }
                }
                if (!z) {
                    C14148l c14148l = new C14148l(cfor8, new C6864l(new C16472l(new C14148l(cfor8, new C6864l(new C16472l(appmetricaVar).getEncoded(), null))).getEncoded(), null));
                    appmetrica appmetricaVar2 = new appmetrica(3, 0);
                    appmetricaVar2.purchase(Cstrictfp.f36572l);
                    appmetricaVar2.purchase(c14148l);
                    new C16472l(appmetricaVar2).tapsense(outputStream, "BER");
                    return;
                }
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                C11138l c11138l2 = new C11138l(new C14148l(cfor8, new C11327l(c11138l.getEncoded())));
                c11138l2.f22357l = -1;
                C14148l c14148l2 = new C14148l(cfor8, new C11327l(c11138l2.getEncoded()));
                appmetrica appmetricaVar3 = new appmetrica(3, 0);
                appmetricaVar3.purchase(Cstrictfp.f36572l);
                appmetricaVar3.purchase(c14148l2);
                new C16472l(appmetricaVar3).tapsense(outputStream, "DER");
                return;
            }
        } else if (cArr == null) {
            C6541l.subs("no password supplied for PKCS#12 KeyStore");
            return;
        }
        appmetrica appmetricaVar4 = new appmetrica((byte) 0, 0);
        Enumeration enumerationKeys2 = this.keys.keys();
        while (true) {
            boolean zHasMoreElements = enumerationKeys2.hasMoreElements();
            cfor = InterfaceC0543l.f1923transient;
            cfor2 = InterfaceC0543l.f1915protected;
            c14998l = C14998l.f29509l;
            cfor3 = InterfaceC0543l.f1881l;
            cfor4 = InterfaceC0543l.f1888l;
            cfor5 = InterfaceC0543l.f1900l;
            str = str2;
            if (!zHasMoreElements) {
                break;
            }
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str4 = (String) enumerationKeys2.nextElement();
            Enumeration enumeration = enumerationKeys2;
            PrivateKey privateKey = (PrivateKey) this.keys.get(str4);
            if (isPBKDF2(this.keyAlgorithm)) {
                C16770l c16770l = new C16770l(bArr, MIN_ITERATIONS, getKeyLength(this.keyAlgorithm), new C10198l(cfor3, c14998l));
                Cfor cfor9 = this.keyAlgorithm;
                C9748l c9748l = new C9748l(cfor9, getAlgParams(cfor9));
                c10198l2 = new C10198l(cfor2, new C4655l(new C18282l(cfor, c16770l), c9748l));
                bArrWrapKey = wrapKey(c9748l, privateKey, c16770l, cArr);
            } else {
                C7286l c7286l = new C7286l(bArr, MIN_ITERATIONS);
                byte[] bArrWrapKey2 = wrapKey(this.keyAlgorithm.inmobi(), privateKey, c7286l, cArr);
                C10198l c10198l3 = new C10198l(this.keyAlgorithm, c7286l.billing());
                bArrWrapKey = bArrWrapKey2;
                c10198l2 = c10198l3;
            }
            C11327l c11327l = new C11327l(AbstractC14024l.crashlytics(bArrWrapKey));
            appmetrica appmetricaVar5 = new appmetrica((byte) 0, 0);
            if (privateKey instanceof InterfaceC12233l) {
                InterfaceC12233l interfaceC12233l = (InterfaceC12233l) privateKey;
                C11172l c11172l = (C11172l) interfaceC12233l.getBagAttribute(cfor4);
                if (z2 && (c11172l == null || !c11172l.mopub().equals(str4))) {
                    interfaceC12233l.setBagAttribute(cfor4, new C11172l(str4));
                }
                if (interfaceC12233l.getBagAttribute(cfor5) == null) {
                    interfaceC12233l.setBagAttribute(cfor5, createSubjectKeyId(engineGetCertificate(str4).getPublicKey()));
                }
                Enumeration bagAttributeKeys = interfaceC12233l.getBagAttributeKeys();
                z4 = false;
                while (bagAttributeKeys.hasMoreElements()) {
                    Cfor cfor10 = (Cfor) bagAttributeKeys.nextElement();
                    appmetrica appmetricaVar6 = new appmetrica((byte) 0, 0);
                    appmetricaVar6.purchase(cfor10);
                    appmetricaVar6.purchase(new C2930l(interfaceC12233l.getBagAttribute(cfor10)));
                    C11138l c11138l3 = new C11138l(appmetricaVar6);
                    c11138l3.f22357l = -1;
                    appmetricaVar5.purchase(c11138l3);
                    z4 = true;
                }
            } else {
                z4 = false;
            }
            if (z4) {
                i = -1;
            } else {
                appmetrica appmetricaVar7 = new appmetrica((byte) 0, 0);
                Certificate certificateEngineGetCertificate = engineGetCertificate(str4);
                appmetricaVar7.purchase(cfor5);
                appmetricaVar7.purchase(new C2930l(createSubjectKeyId(certificateEngineGetCertificate.getPublicKey())));
                C11138l c11138l4 = new C11138l(appmetricaVar7);
                i = -1;
                c11138l4.f22357l = -1;
                appmetricaVar5.purchase(c11138l4);
                appmetrica appmetricaVar8 = new appmetrica((byte) 0, 0);
                appmetricaVar8.purchase(cfor4);
                C2930l c2930l = new C2930l(new C11172l(str4));
                c2930l.f6383l = -1;
                appmetricaVar8.purchase(c2930l);
                C11138l c11138l5 = new C11138l(appmetricaVar8);
                c11138l5.f22357l = -1;
                appmetricaVar5.purchase(c11138l5);
            }
            C11138l c11138l6 = new C11138l(c10198l2, c11327l);
            c11138l6.f22357l = i;
            C2930l c2930l2 = new C2930l(appmetricaVar5, true);
            c2930l2.f6383l = i;
            appmetricaVar4.purchase(new C16258l(InterfaceC0543l.f1887l, c11138l6, c2930l2));
            str2 = str;
            enumerationKeys2 = enumeration;
            cfor8 = cfor8;
        }
        Cfor cfor11 = cfor8;
        C11138l c11138l7 = new C11138l(appmetricaVar4);
        c11138l7.f22357l = -1;
        C6864l c6864l = new C6864l(c11138l7.remoteconfig("DER"), null);
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        appmetrica appmetricaVar9 = new appmetrica((byte) 0, 0);
        if (isPBKDF2(this.certAlgorithm)) {
            C18282l c18282l = new C18282l(cfor, new C16770l(bArr2, MIN_ITERATIONS, getKeyLength(this.certAlgorithm), new C10198l(cfor3, c14998l)));
            Cfor cfor12 = this.certAlgorithm;
            c10198l = new C10198l(cfor2, new C4655l(c18282l, new C9748l(cfor12, getAlgParams(cfor12))));
        } else {
            C11327l c11327l2 = new C11327l(bArr2);
            Cstrictfp cstrictfpM4580private = Cstrictfp.m4580private(MIN_ITERATIONS);
            Cfor cfor13 = this.certAlgorithm;
            C11138l c11138l8 = new C11138l(c11327l2, cstrictfpM4580private);
            c11138l8.f22357l = -1;
            c10198l = new C10198l(cfor13, c11138l8);
        }
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys3 = this.keys.keys();
        while (true) {
            boolean zHasMoreElements2 = enumerationKeys3.hasMoreElements();
            cfor6 = InterfaceC0543l.f1909l;
            cfor7 = InterfaceC0543l.f1901l;
            if (!zHasMoreElements2) {
                break;
            }
            try {
                String str5 = (String) enumerationKeys3.nextElement();
                Certificate certificateEngineGetCertificate2 = engineGetCertificate(str5);
                C11327l c11327l3 = new C11327l(certificateEngineGetCertificate2.getEncoded());
                C10198l c10198l4 = c10198l;
                appmetrica appmetricaVar10 = new appmetrica((byte) 0, 0);
                if (certificateEngineGetCertificate2 instanceof InterfaceC12233l) {
                    InterfaceC12233l interfaceC12233l2 = (InterfaceC12233l) certificateEngineGetCertificate2;
                    C11172l c11172l2 = (C11172l) interfaceC12233l2.getBagAttribute(cfor4);
                    if (z2 && (c11172l2 == null || !c11172l2.mopub().equals(str5))) {
                        interfaceC12233l2.setBagAttribute(cfor4, new C11172l(str5));
                    }
                    if (interfaceC12233l2.getBagAttribute(cfor5) == null) {
                        interfaceC12233l2.setBagAttribute(cfor5, createSubjectKeyId(certificateEngineGetCertificate2.getPublicKey()));
                    }
                    Enumeration bagAttributeKeys2 = interfaceC12233l2.getBagAttributeKeys();
                    z3 = false;
                    while (bagAttributeKeys2.hasMoreElements()) {
                        Enumeration enumeration2 = bagAttributeKeys2;
                        Cfor cfor14 = (Cfor) bagAttributeKeys2.nextElement();
                        Enumeration enumeration3 = enumerationKeys3;
                        appmetrica appmetricaVar11 = new appmetrica((byte) 0, 0);
                        appmetricaVar11.purchase(cfor14);
                        appmetricaVar11.purchase(new C2930l(interfaceC12233l2.getBagAttribute(cfor14)));
                        C11138l c11138l9 = new C11138l(appmetricaVar11);
                        c11138l9.f22357l = -1;
                        appmetricaVar10.purchase(c11138l9);
                        bagAttributeKeys2 = enumeration2;
                        enumerationKeys3 = enumeration3;
                        c6864l = c6864l;
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                Enumeration enumeration4 = enumerationKeys3;
                C6864l c6864l2 = c6864l;
                if (!z3) {
                    appmetrica appmetricaVar12 = new appmetrica((byte) 0, 0);
                    appmetricaVar12.purchase(cfor5);
                    appmetricaVar12.purchase(new C2930l(createSubjectKeyId(certificateEngineGetCertificate2.getPublicKey())));
                    C11138l c11138l10 = new C11138l(appmetricaVar12);
                    c11138l10.f22357l = -1;
                    appmetricaVar10.purchase(c11138l10);
                    appmetrica appmetricaVar13 = new appmetrica((byte) 0, 0);
                    appmetricaVar13.purchase(cfor4);
                    C2930l c2930l3 = new C2930l(new C11172l(str5));
                    c2930l3.f6383l = -1;
                    appmetricaVar13.purchase(c2930l3);
                    C11138l c11138l11 = new C11138l(appmetricaVar13);
                    c11138l11.f22357l = -1;
                    appmetricaVar10.purchase(c11138l11);
                }
                C11138l c11138l12 = new C11138l(cfor7, new C9320l(true, 0, c11327l3));
                c11138l12.f22357l = -1;
                C2930l c2930l4 = new C2930l(appmetricaVar10, true);
                c2930l4.f6383l = -1;
                appmetricaVar9.purchase(new C16258l(cfor6, c11138l12, c2930l4));
                hashtable.put(certificateEngineGetCertificate2, certificateEngineGetCertificate2);
                c10198l = c10198l4;
                enumerationKeys3 = enumeration4;
                c6864l = c6864l2;
            } catch (CertificateEncodingException e2) {
                C18073l.isPro(e2);
                return;
            }
        }
        C10198l c10198l5 = c10198l;
        C6864l c6864l3 = c6864l;
        Enumeration enumerationKeys4 = this.certs.keys();
        while (enumerationKeys4.hasMoreElements()) {
            try {
                String str6 = (String) enumerationKeys4.nextElement();
                Certificate certificate = (Certificate) this.certs.get(str6);
                if (this.keys.get(str6) == null) {
                    appmetricaVar9.purchase(createSafeBag(str6, certificate, z2));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e3) {
                C18073l.isPro(e3);
                return;
            }
        }
        Set usedCertificateSet = getUsedCertificateSet();
        Enumeration enumerationKeys5 = this.chainCerts.keys();
        while (enumerationKeys5.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.chainCerts.get((CertId) enumerationKeys5.nextElement());
                if (usedCertificateSet.contains(certificate2) && hashtable.get(certificate2) == null) {
                    C11327l c11327l4 = new C11327l(certificate2.getEncoded());
                    appmetrica appmetricaVar14 = new appmetrica((byte) 0, 0);
                    if (certificate2 instanceof InterfaceC12233l) {
                        InterfaceC12233l interfaceC12233l3 = (InterfaceC12233l) certificate2;
                        Enumeration bagAttributeKeys3 = interfaceC12233l3.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            Cfor cfor15 = (Cfor) bagAttributeKeys3.nextElement();
                            if (!cfor15.ad(cfor5)) {
                                appmetrica appmetricaVar15 = new appmetrica((byte) 0, 0);
                                appmetricaVar15.purchase(cfor15);
                                appmetricaVar15.purchase(new C2930l(interfaceC12233l3.getBagAttribute(cfor15)));
                                C11138l c11138l13 = new C11138l(appmetricaVar15);
                                c11138l13.f22357l = -1;
                                appmetricaVar14.purchase(c11138l13);
                            }
                        }
                    }
                    C11138l c11138l14 = new C11138l(cfor7, new C9320l(true, 0, c11327l4));
                    c11138l14.f22357l = -1;
                    C2930l c2930l5 = new C2930l(appmetricaVar14, true);
                    c2930l5.f6383l = -1;
                    appmetricaVar9.purchase(new C16258l(cfor6, c11138l14, c2930l5));
                }
            } catch (CertificateEncodingException e4) {
                C18073l.isPro(e4);
                return;
            }
        }
        C11138l c11138l15 = new C11138l(appmetricaVar9);
        c11138l15.f22357l = -1;
        C6864l c6864l4 = new C6864l(cryptData(true, c10198l5, cArr, false, c11138l15.remoteconfig("DER")), null);
        appmetrica appmetricaVar16 = new appmetrica(3, 0);
        appmetricaVar16.purchase(cfor11);
        appmetricaVar16.purchase(c10198l5.billing());
        appmetricaVar16.purchase(new C10411l(2, 128, 0, c6864l4));
        C14148l[] c14148lArr = {new C14148l(cfor11, c6864l3), new C14148l(InterfaceC0543l.f1903l, new C16472l(Cstrictfp.f36573l, new C16472l(appmetricaVar16)))};
        int length = c14148lArr.length;
        C14148l[] c14148lArr2 = new C14148l[length];
        System.arraycopy(c14148lArr, 0, c14148lArr2, 0, length);
        String str7 = z ? "DER" : str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C16472l(c14148lArr2).tapsense(byteArrayOutputStream, str7);
        C14148l c14148l3 = new C14148l(cfor11, new C6864l(byteArrayOutputStream.toByteArray(), null));
        byte[] bArr3 = new byte[this.saltLength];
        this.random.nextBytes(bArr3);
        byte[] bArr4 = Cthrow.premium(AbstractC12489l.yandex(c14148l3)).f36593l;
        if (this.keyAlgorithm.ad(InterfaceC8134l.f16939case)) {
            c5942l = null;
        } else {
            try {
                c5942l = new C5942l(new C17203l(this.macAlgorithm, calculatePbeMac(this.macAlgorithm.f20787l, bArr3, this.itCount, cArr, false, bArr4)), bArr3, this.itCount);
            } catch (Exception e5) {
                C18262l.metrica(AbstractC5020l.ads(e5, new StringBuilder("error constructing MAC: ")));
                return;
            }
        }
        String str8 = z ? "DER" : str;
        appmetrica appmetricaVar17 = new appmetrica(3, 0);
        appmetricaVar17.purchase(Cstrictfp.f36572l);
        appmetricaVar17.purchase(c14148l3);
        if (c5942l != null) {
            appmetricaVar17.purchase(c5942l);
        }
        new C16472l(appmetricaVar17).tapsense(outputStream, str8);
    }

    private Ccase getAlgParams(Cfor cfor) {
        if (cfor.ad(InterfaceC8134l.ad) || cfor.ad(InterfaceC8134l.f16949for)) {
            byte[] bArr = new byte[16];
            this.random.nextBytes(bArr);
            return new C11327l(bArr);
        }
        if (!cfor.ad(InterfaceC8134l.premium) && !cfor.ad(InterfaceC8134l.f16939case)) {
            C8339l.smaato("unknown encryption OID in getAlgParams()");
            return null;
        }
        byte[] bArr2 = new byte[12];
        this.random.nextBytes(bArr2);
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr2);
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(new C11327l(bArrCrashlytics));
        appmetricaVar.purchase(Cstrictfp.m4580private(16));
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    private static byte[] getDigest(C17029l c17029l) {
        int i = AbstractC14832l.yandex;
        C0655l c0655l = new C0655l();
        byte[] bArr = new byte[20];
        byte[] bArrApplovin = c17029l.f33174l.applovin();
        c0655l.update(bArrApplovin, 0, bArrApplovin.length);
        c0655l.doFinal(bArr, 0);
        return bArr;
    }

    private static int getKeyLength(Cfor cfor) {
        return (cfor.ad(InterfaceC8134l.f16949for) || cfor.ad(InterfaceC8134l.f16939case)) ? 32 : 16;
    }

    private static InterfaceC16922l getPrf(Cfor cfor) {
        if (InterfaceC0543l.f1881l.ad(cfor)) {
            return new C2657l();
        }
        if (InterfaceC0543l.f1898l.ad(cfor)) {
            return new C17711l();
        }
        C8339l.metrica(AbstractC9361l.license("unknown prf id ", cfor));
        return null;
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationKeys.nextElement());
            for (int i = 0; i != certificateArrEngineGetCertificateChain.length; i++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i]);
            }
        }
        Enumeration enumerationKeys2 = this.certs.keys();
        while (enumerationKeys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) enumerationKeys2.nextElement()));
        }
        return hashSet;
    }

    private static boolean isPBKDF2(Cfor cfor) {
        return cfor.ad(InterfaceC8134l.f16949for) || cfor.ad(InterfaceC8134l.f16939case) || cfor.ad(InterfaceC8134l.ad) || cfor.ad(InterfaceC8134l.premium);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void processKeyBag(C16258l c16258l) throws IOException {
        String str;
        PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(C2756l.vip(c16258l.f31822l));
        Cthrow cthrow = null;
        String strMopub = null;
        if (privateKey instanceof InterfaceC12233l) {
            InterfaceC12233l interfaceC12233l = (InterfaceC12233l) privateKey;
            Cinterface cinterface = c16258l.f31821l;
            cinterface.getClass();
            applovin[] applovinVarArr = cinterface.f842l;
            int i = 0;
            Cthrow cthrow2 = null;
            while (i < applovinVarArr.length) {
                if (i >= applovinVarArr.length) {
                    C4875l.firebase();
                    return;
                }
                int i2 = i + 1;
                Cclass cclassInmobi = Cclass.inmobi(applovinVarArr[i]);
                Cfor cforM192throws = Cfor.m192throws(cclassInmobi.mo173throws(0));
                applovin[] applovinVarArr2 = Cinterface.applovin(cclassInmobi.mo173throws(1)).f842l;
                if (applovinVarArr2.length > 0) {
                    Ccase ccase = (Ccase) applovinVarArr2[0];
                    applovin bagAttribute = interfaceC12233l.getBagAttribute(cforM192throws);
                    if (bagAttribute == null) {
                        interfaceC12233l.setBagAttribute(cforM192throws, ccase);
                    } else if (!bagAttribute.billing().ad(ccase)) {
                        C18262l.metrica("attempt to add existing attribute with different value");
                        return;
                    }
                    if (cforM192throws.ad(InterfaceC0543l.f1888l)) {
                        strMopub = ((C11172l) ccase).mopub();
                        this.keys.put(strMopub, privateKey);
                    } else if (cforM192throws.ad(InterfaceC0543l.f1900l)) {
                        cthrow2 = (Cthrow) ccase;
                    }
                }
                i = i2;
            }
            str = strMopub;
            cthrow = cthrow2;
        } else {
            str = null;
        }
        byte[] bArr = cthrow.f36593l;
        C1561l c1561l = AbstractC8535l.yandex;
        String str2 = new String(AbstractC8535l.amazon(0, bArr.length, bArr));
        if (str == null) {
            this.keys.put(str2, privateKey);
        } else {
            this.localIds.put(str, str2);
        }
    }

    private boolean processShroudedKeyBag(C16258l c16258l, char[] cArr, boolean z) throws IOException {
        String strMopub;
        Ccase ccase;
        C7378l c7378lVip = C7378l.vip(c16258l.f31822l);
        PrivateKey privateKeyUnwrapKey = unwrapKey(c7378lVip.f15307l, AbstractC14024l.crashlytics(c7378lVip.f15306l.f36593l), cArr, z);
        Cinterface cinterface = c16258l.f31821l;
        Cthrow cthrow = null;
        if (cinterface != null) {
            applovin[] applovinVarArr = cinterface.f842l;
            int i = 0;
            strMopub = null;
            Cthrow cthrow2 = null;
            while (i < applovinVarArr.length) {
                if (i >= applovinVarArr.length) {
                    C4875l.firebase();
                    return false;
                }
                int i2 = i + 1;
                Cclass cclass = (Cclass) applovinVarArr[i];
                Cfor cfor = (Cfor) cclass.mo173throws(0);
                applovin[] applovinVarArr2 = ((Cinterface) cclass.mo173throws(1)).f842l;
                if (applovinVarArr2.length > 0) {
                    ccase = (Ccase) applovinVarArr2[0];
                    if (privateKeyUnwrapKey instanceof InterfaceC12233l) {
                        InterfaceC12233l interfaceC12233l = (InterfaceC12233l) privateKeyUnwrapKey;
                        applovin bagAttribute = interfaceC12233l.getBagAttribute(cfor);
                        if (bagAttribute == null) {
                            interfaceC12233l.setBagAttribute(cfor, ccase);
                        } else if (!bagAttribute.billing().ad(ccase)) {
                            C18262l.metrica("attempt to add existing attribute with different value");
                            return false;
                        }
                    }
                } else {
                    ccase = null;
                }
                if (cfor.ad(InterfaceC0543l.f1888l)) {
                    strMopub = ((C11172l) ccase).mopub();
                    this.keys.put(strMopub, privateKeyUnwrapKey);
                } else if (cfor.ad(InterfaceC0543l.f1900l)) {
                    cthrow2 = (Cthrow) ccase;
                }
                i = i2;
            }
            cthrow = cthrow2;
        } else {
            strMopub = null;
        }
        if (cthrow == null) {
            this.keys.put("unmarked", privateKeyUnwrapKey);
            return true;
        }
        byte[] bArr = cthrow.f36593l;
        C1561l c1561l = AbstractC8535l.yandex;
        String str = new String(AbstractC8535l.amazon(0, bArr.length, bArr));
        if (strMopub == null) {
            this.keys.put(str, privateKeyUnwrapKey);
            return false;
        }
        this.localIds.put(strMopub, str);
        return false;
    }

    private void syncFriendlyName() {
        Cfor cfor;
        applovin bagAttribute;
        applovin bagAttribute2;
        applovin bagAttribute3;
        Enumeration enumerationKeys = this.keys.keys();
        while (true) {
            boolean zHasMoreElements = enumerationKeys.hasMoreElements();
            cfor = InterfaceC0543l.f1888l;
            if (!zHasMoreElements) {
                break;
            }
            String str = (String) enumerationKeys.nextElement();
            PrivateKey privateKey = (PrivateKey) this.keys.get(str);
            if ((privateKey instanceof InterfaceC12233l) && (bagAttribute3 = ((InterfaceC12233l) privateKey).getBagAttribute(cfor)) != null && !str.equals(bagAttribute3.toString())) {
                this.keys.put(bagAttribute3.toString(), privateKey);
                this.keys.remove(str);
            }
        }
        Enumeration enumerationKeys2 = this.certs.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str2 = (String) enumerationKeys2.nextElement();
            Object obj = (Certificate) this.certs.get(str2);
            if ((obj instanceof InterfaceC12233l) && (bagAttribute2 = ((InterfaceC12233l) obj).getBagAttribute(cfor)) != null && !str2.equals(bagAttribute2.toString())) {
                this.certs.put(bagAttribute2.toString(), obj);
                this.certs.remove(str2);
            }
        }
        Enumeration enumerationKeys3 = this.keyCerts.keys();
        while (enumerationKeys3.hasMoreElements()) {
            String str3 = (String) enumerationKeys3.nextElement();
            Object obj2 = (Certificate) this.keyCerts.get(str3);
            if ((obj2 instanceof InterfaceC12233l) && (bagAttribute = ((InterfaceC12233l) obj2).getBagAttribute(cfor)) != null && !str3.equals(bagAttribute.toString())) {
                this.keyCerts.put(bagAttribute.toString(), obj2);
                this.keyCerts.remove(str3);
            }
        }
    }

    public byte[] cryptData(boolean z, C10198l c10198l, char[] cArr, boolean z2, byte[] bArr) throws IOException {
        String strAds;
        Cfor cfor = c10198l.f20787l;
        int i = z ? 1 : 2;
        if (!cfor.m195strictfp(InterfaceC0543l.f1907l)) {
            if (cfor.ad(InterfaceC0543l.f1915protected)) {
                try {
                    return createCipher(i, cArr, c10198l).doFinal(bArr);
                } catch (Exception e) {
                    strAds = AbstractC5020l.ads(e, new StringBuilder("exception decrypting data - "));
                }
            } else {
                strAds = AbstractC9361l.license("unknown PBE algorithm: ", cfor);
            }
            C18262l.metrica(strAds);
            return null;
        }
        C7286l c7286lVip = C7286l.vip(c10198l.f20786l);
        C16023l c16023l = new C16023l(cArr, z2);
        char[] cArr2 = c16023l.f31405l;
        try {
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(c7286lVip.f15133l.f36593l, AbstractC12489l.crashlytics(c7286lVip.f15134l.appmetrica()));
                Cipher cipherSubs = this.helper.subs(cfor.inmobi());
                cipherSubs.init(i, c16023l, pBEParameterSpec);
                byte[] bArrDoFinal = cipherSubs.doFinal(bArr);
                Arrays.fill(cArr2, (char) 0);
                return bArrDoFinal;
            } catch (Exception e2) {
                throw new IOException("exception decrypting data - " + e2.toString());
            }
        } catch (Throwable th) {
            Arrays.fill(cArr2, (char) 0);
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        String str2;
        Certificate certificate;
        Certificate certificate2 = (Certificate) this.certs.remove(str);
        if (certificate2 != null) {
            this.chainCerts.remove(new CertId(certificate2.getPublicKey()));
        }
        if (((Key) this.keys.remove(str)) == null || (str2 = (String) this.localIds.remove(str)) == null || (certificate = (Certificate) this.keyCerts.remove(str2)) == null) {
            return;
        }
        this.chainCerts.remove(new CertId(certificate.getPublicKey()));
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            C8339l.metrica("null alias passed to getCertificate.");
            return null;
        }
        Certificate certificate = (Certificate) this.certs.get(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.localIds.get(str);
        Hashtable hashtable = this.keyCerts;
        return str2 != null ? (Certificate) hashtable.get(str2) : (Certificate) hashtable.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationElements = this.certs.elements();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationElements.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationElements.nextElement();
            String str = (String) enumerationKeys.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration enumerationElements2 = this.keyCerts.elements();
        Enumeration enumerationKeys2 = this.keyCerts.keys();
        while (enumerationElements2.hasMoreElements()) {
            Certificate certificate3 = (Certificate) enumerationElements2.nextElement();
            String str2 = (String) enumerationKeys2.nextElement();
            if (certificate3.equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        Certificate certificateEngineGetCertificate;
        Certificate certificate;
        if (str == null) {
            C8339l.metrica("null alias passed to getCertificateChain.");
            return null;
        }
        if (!engineIsKeyEntry(str) || (certificateEngineGetCertificate = engineGetCertificate(str)) == null) {
            return null;
        }
        Vector vector = new Vector();
        while (certificateEngineGetCertificate != null) {
            X509Certificate x509Certificate = (X509Certificate) certificateEngineGetCertificate;
            byte[] extensionValue = x509Certificate.getExtensionValue(C18229l.f35721l.inmobi());
            if (extensionValue == null) {
                certificate = null;
            } else {
                Cthrow cthrow = C10320l.vip(Cthrow.premium(extensionValue).f36593l).f21046l;
                byte[] bArr = cthrow != null ? cthrow.f36593l : null;
                if (bArr != null) {
                    certificate = (Certificate) this.chainCerts.get(new CertId(bArr));
                } else {
                    certificate = null;
                }
            }
            if (certificate == null) {
                Principal issuerDN = x509Certificate.getIssuerDN();
                if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                    Enumeration enumerationKeys = this.chainCerts.keys();
                    while (enumerationKeys.hasMoreElements()) {
                        X509Certificate x509Certificate2 = (X509Certificate) this.chainCerts.get(enumerationKeys.nextElement());
                        if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                            try {
                                x509Certificate.verify(x509Certificate2.getPublicKey());
                                certificate = x509Certificate2;
                                break;
                            } catch (Exception unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (!vector.contains(certificateEngineGetCertificate)) {
                vector.addElement(certificateEngineGetCertificate);
                if (certificate != certificateEngineGetCertificate) {
                    certificateEngineGetCertificate = certificate;
                }
            }
            certificateEngineGetCertificate = null;
        }
        int size = vector.size();
        Certificate[] certificateArr = new Certificate[size];
        for (int i = 0; i != size; i++) {
            certificateArr[i] = (Certificate) vector.elementAt(i);
        }
        return certificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            C6541l.subs("alias == null");
            return null;
        }
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        C8339l.metrica("null alias passed to getKey.");
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0353  */
    /* JADX WARN: Code duplicated, block: B:121:0x035b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0361  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [throw] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v18, types: [org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.security.cert.Certificate] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        char[] cArr2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zProcessShroudedKeyBag;
        ?? r10;
        ?? Mopub;
        int i;
        boolean z4;
        applovin[] applovinVarArr;
        boolean z5;
        PKCS12KeyStoreSpi pKCS12KeyStoreSpi = this;
        if (inputStream == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(10);
        int i2 = bufferedInputStream.read();
        if (i2 < 0) {
            throw new EOFException("no data in keystore stream");
        }
        if (i2 != 48) {
            C18262l.metrica("stream does not represent a PKCS12 key store");
            return;
        }
        bufferedInputStream.reset();
        try {
            C9975l c9975lVip = C9975l.vip(new Csynchronized(bufferedInputStream).ads());
            C14148l c14148l = c9975lVip.f20366l;
            Vector vector = new Vector();
            C5942l c5942l = c9975lVip.f20365l;
            if (c5942l == null) {
                cArr2 = cArr;
                z = false;
                z2 = true;
            } else {
                if (cArr == null) {
                    C6541l.subs("no password supplied when one expected");
                    return;
                }
                C17203l c17203l = c5942l.f12509l;
                pKCS12KeyStoreSpi.macAlgorithm = c17203l.f33384l;
                byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c5942l.f12508l);
                pKCS12KeyStoreSpi.itCount = AbstractC12489l.crashlytics(c5942l.f12507l);
                pKCS12KeyStoreSpi.saltLength = bArrCrashlytics.length;
                byte[] bArr = Cthrow.premium(AbstractC12489l.yandex(c14148l)).f36593l;
                try {
                    cArr2 = cArr;
                    byte[] bArrCalculatePbeMac = pKCS12KeyStoreSpi.calculatePbeMac(pKCS12KeyStoreSpi.macAlgorithm.f20787l, bArrCrashlytics, pKCS12KeyStoreSpi.itCount, cArr2, false, bArr);
                    byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(c17203l.f33385l);
                    if (AbstractC14024l.smaato(bArrCalculatePbeMac, bArrCrashlytics2)) {
                        z = false;
                    } else {
                        if (cArr2.length > 0) {
                            throw AbstractC17742l.crashlytics("PKCS12 key store mac invalid - wrong password or corrupted file", new UnrecoverableKeyException("PKCS12 key store mac invalid"));
                        }
                        if (!AbstractC14024l.smaato(pKCS12KeyStoreSpi.calculatePbeMac(pKCS12KeyStoreSpi.macAlgorithm.f20787l, bArrCrashlytics, pKCS12KeyStoreSpi.itCount, cArr2, true, bArr), bArrCrashlytics2)) {
                            throw AbstractC17742l.crashlytics("PKCS12 key store mac invalid - wrong password or corrupted file", new UnrecoverableKeyException("PKCS12 key store mac invalid"));
                        }
                        z = true;
                    }
                    z2 = false;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    C18262l.metrica(AbstractC5020l.ads(e2, new StringBuilder("error constructing MAC: ")));
                    return;
                }
            }
            pKCS12KeyStoreSpi.keys = new IgnoresCaseHashtable();
            pKCS12KeyStoreSpi.localIds = new IgnoresCaseHashtable();
            Cfor cfor = c14148l.f27665l;
            Cfor cfor2 = InterfaceC0543l.f1879l;
            if (cfor.ad(cfor2)) {
                C14148l[] c14148lArr = C12459l.vip(Cthrow.premium(AbstractC12489l.yandex(c14148l)).f36593l).f24593l;
                int length = c14148lArr.length;
                C14148l[] c14148lArr2 = new C14148l[length];
                System.arraycopy(c14148lArr, 0, c14148lArr2, 0, length);
                int i3 = 0;
                zProcessShroudedKeyBag = false;
                z3 = true;
                while (i3 != length) {
                    boolean zAd = c14148lArr2[i3].f27665l.ad(cfor2);
                    Cfor cfor3 = InterfaceC0543l.f1884l;
                    Cfor cfor4 = InterfaceC0543l.f1909l;
                    Cfor cfor5 = InterfaceC0543l.f1887l;
                    if (zAd) {
                        boolean zProcessShroudedKeyBag2 = zProcessShroudedKeyBag;
                        boolean z6 = z3;
                        int i4 = 0;
                        for (Cclass cclassInmobi = Cclass.inmobi(Cthrow.premium(AbstractC12489l.yandex(c14148lArr2[i3])).f36593l); i4 != cclassInmobi.size(); cclassInmobi = cclassInmobi) {
                            C16258l c16258lVip = C16258l.vip(cclassInmobi.mo173throws(i4));
                            int i5 = i4;
                            Cfor cfor6 = c16258lVip.f31823l;
                            if (cfor6.ad(cfor5)) {
                                zProcessShroudedKeyBag2 = pKCS12KeyStoreSpi.processShroudedKeyBag(c16258lVip, cArr2, z);
                                z6 = false;
                            } else if (cfor6.ad(cfor4)) {
                                vector.addElement(c16258lVip);
                            } else if (cfor6.ad(cfor3)) {
                                pKCS12KeyStoreSpi.processKeyBag(c16258lVip);
                            } else {
                                System.out.println("extra in data " + cfor6);
                                System.out.println(AbstractC5006l.crashlytics(c16258lVip));
                            }
                            i4 = i5 + 1;
                            pKCS12KeyStoreSpi = this;
                            z = z;
                        }
                        pKCS12KeyStoreSpi = this;
                        z5 = z;
                        z3 = z6;
                        zProcessShroudedKeyBag = zProcessShroudedKeyBag2;
                    } else {
                        z5 = z;
                        if (c14148lArr2[i3].f27665l.ad(InterfaceC0543l.f1903l)) {
                            C13016l c13016lVip = C13016l.vip(AbstractC12489l.yandex(c14148lArr2[i3]));
                            C10198l c10198lVip = C10198l.vip(c13016lVip.f25489l.mo173throws(1));
                            byte[] bArr2 = AbstractC12489l.loadAd(c13016lVip).f36593l;
                            char[] cArr3 = cArr2;
                            pKCS12KeyStoreSpi = this;
                            byte[] bArrCryptData = pKCS12KeyStoreSpi.cryptData(false, c10198lVip, cArr3, z5, bArr2);
                            cArr2 = cArr3;
                            boolean z7 = z5;
                            Cclass cclassInmobi2 = Cclass.inmobi(bArrCryptData);
                            int i6 = 0;
                            while (i6 != cclassInmobi2.size()) {
                                C16258l c16258lVip2 = C16258l.vip(cclassInmobi2.mo173throws(i6));
                                Cclass cclass = cclassInmobi2;
                                Cfor cfor7 = c16258lVip2.f31823l;
                                if (cfor7.ad(cfor4)) {
                                    vector.addElement(c16258lVip2);
                                } else if (cfor7.ad(cfor5)) {
                                    zProcessShroudedKeyBag = pKCS12KeyStoreSpi.processShroudedKeyBag(c16258lVip2, cArr2, z7);
                                } else {
                                    if (cfor7.ad(cfor3)) {
                                        pKCS12KeyStoreSpi.processKeyBag(c16258lVip2);
                                    } else {
                                        System.out.println("extra in encryptedData " + cfor7);
                                        System.out.println(AbstractC5006l.crashlytics(c16258lVip2));
                                    }
                                    i6++;
                                    cclassInmobi2 = cclass;
                                    z7 = z7;
                                }
                                i6++;
                                cclassInmobi2 = cclass;
                                z7 = z7;
                            }
                            z5 = z7;
                            z3 = false;
                        } else {
                            pKCS12KeyStoreSpi = this;
                            System.out.println("extra " + c14148lArr2[i3].f27665l.inmobi());
                            System.out.println("extra ".concat(AbstractC5006l.crashlytics(AbstractC12489l.yandex(c14148lArr2[i3]))));
                        }
                    }
                    i3++;
                    z = z5;
                }
            } else {
                z3 = true;
                zProcessShroudedKeyBag = false;
            }
            AnonymousClass1 anonymousClass1 = null;
            pKCS12KeyStoreSpi.certs = new IgnoresCaseHashtable();
            pKCS12KeyStoreSpi.chainCerts = new Hashtable();
            pKCS12KeyStoreSpi.keyCerts = new Hashtable();
            int i7 = 0;
            while (i7 != vector.size()) {
                C16258l c16258l = (C16258l) vector.elementAt(i7);
                C15143l c15143lVip = C15143l.vip(c16258l.f31822l);
                if (!c15143lVip.f29697l.ad(InterfaceC0543l.f1901l)) {
                    C8339l.isPro(c15143lVip.f29697l, "Unsupported certificate type: ");
                    return;
                }
                try {
                    ?? GenerateCertificate = pKCS12KeyStoreSpi.certFact.generateCertificate(new ByteArrayInputStream(((Cthrow) c15143lVip.f29696l).f36593l));
                    Cinterface cinterface = c16258l.f31821l;
                    if (cinterface != null) {
                        applovin[] applovinVarArr2 = cinterface.f842l;
                        AnonymousClass1 anonymousClass2 = anonymousClass1;
                        Mopub = anonymousClass2;
                        int i8 = 0;
                        r10 = anonymousClass2;
                        while (i8 < applovinVarArr2.length) {
                            if (i8 >= applovinVarArr2.length) {
                                C4875l.firebase();
                                return;
                            }
                            i8++;
                            Cclass cclassInmobi3 = Cclass.inmobi(applovinVarArr2[i8]);
                            Cfor cforM192throws = Cfor.m192throws(cclassInmobi3.mo173throws(0));
                            Cinterface cinterfaceApplovin = Cinterface.applovin(cclassInmobi3.mo173throws(1));
                            applovin[] applovinVarArr3 = cinterfaceApplovin.f842l;
                            if (applovinVarArr3.length > 0) {
                                Ccase ccase = (Ccase) applovinVarArr3[0];
                                boolean z8 = GenerateCertificate instanceof InterfaceC12233l;
                                i = i7;
                                Cfor cfor8 = InterfaceC0543l.f1900l;
                                if (z8) {
                                    InterfaceC12233l interfaceC12233l = (InterfaceC12233l) GenerateCertificate;
                                    applovin bagAttribute = interfaceC12233l.getBagAttribute(cforM192throws);
                                    if (bagAttribute != null) {
                                        if (cforM192throws.ad(cfor8)) {
                                            byte[] bArr3 = ((Cthrow) ccase).f36593l;
                                            C1561l c1561l = AbstractC8535l.yandex;
                                            z4 = z3;
                                            String strPurchase = AbstractC8535l.purchase(0, bArr3.length, bArr3);
                                            if (!pKCS12KeyStoreSpi.keys.keys.containsKey(strPurchase) && !pKCS12KeyStoreSpi.localIds.keys.containsKey(strPurchase)) {
                                                i7 = i;
                                            }
                                        } else {
                                            z4 = z3;
                                        }
                                        if (!bagAttribute.billing().ad(ccase)) {
                                            C18262l.metrica("attempt to add existing attribute with different value");
                                            return;
                                        }
                                    } else {
                                        z4 = z3;
                                        applovinVarArr = applovinVarArr2;
                                        if (cinterfaceApplovin.f842l.length > 1) {
                                            interfaceC12233l.setBagAttribute(cforM192throws, cinterfaceApplovin);
                                        } else {
                                            interfaceC12233l.setBagAttribute(cforM192throws, ccase);
                                        }
                                        if (cforM192throws.ad(InterfaceC0543l.f1888l)) {
                                            Mopub = ((C11172l) ccase).mopub();
                                            r10 = r10;
                                        } else if (cforM192throws.ad(cfor8)) {
                                            r10 = r10;
                                            Mopub = Mopub;
                                            r10 = (Cthrow) ccase;
                                            Mopub = Mopub;
                                        }
                                    }
                                    z3 = z4;
                                    r10 = r10;
                                    Mopub = Mopub;
                                } else {
                                    z4 = z3;
                                }
                                applovinVarArr = applovinVarArr2;
                                if (cforM192throws.ad(InterfaceC0543l.f1888l)) {
                                    Mopub = ((C11172l) ccase).mopub();
                                    r10 = r10;
                                } else if (cforM192throws.ad(cfor8)) {
                                    r10 = r10;
                                    Mopub = Mopub;
                                    r10 = (Cthrow) ccase;
                                    Mopub = Mopub;
                                }
                            } else {
                                i = i7;
                                z4 = z3;
                                applovinVarArr = applovinVarArr2;
                                r10 = r10;
                                Mopub = Mopub;
                            }
                            r10 = r10;
                            Mopub = Mopub;
                            i7 = i;
                            applovinVarArr2 = applovinVarArr;
                            z3 = z4;
                            r10 = r10;
                            Mopub = Mopub;
                        }
                    } else {
                        r10 = 0;
                        Mopub = 0;
                    }
                    int i9 = i7;
                    boolean z9 = z3;
                    pKCS12KeyStoreSpi.chainCerts.put(pKCS12KeyStoreSpi.new CertId(GenerateCertificate.getPublicKey()), GenerateCertificate);
                    if (!zProcessShroudedKeyBag) {
                        if (r10 != 0) {
                            byte[] bArr4 = r10.f36593l;
                            C1561l c1561l2 = AbstractC8535l.yandex;
                            pKCS12KeyStoreSpi.keyCerts.put(new String(AbstractC8535l.amazon(0, bArr4.length, bArr4)), GenerateCertificate);
                        }
                        if (Mopub != 0) {
                            pKCS12KeyStoreSpi.certs.put(Mopub, GenerateCertificate);
                        }
                    } else if (pKCS12KeyStoreSpi.keyCerts.isEmpty()) {
                        byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(pKCS12KeyStoreSpi.createSubjectKeyId(GenerateCertificate.getPublicKey()).f14309l);
                        C1561l c1561l3 = AbstractC8535l.yandex;
                        String str = new String(AbstractC8535l.amazon(0, bArrCrashlytics3.length, bArrCrashlytics3));
                        pKCS12KeyStoreSpi.keyCerts.put(str, GenerateCertificate);
                        IgnoresCaseHashtable ignoresCaseHashtable = pKCS12KeyStoreSpi.keys;
                        ignoresCaseHashtable.put(str, ignoresCaseHashtable.remove("unmarked"));
                    }
                    i7 = i9 + 1;
                    z3 = z9;
                    anonymousClass1 = null;
                } catch (Exception e3) {
                    C10754l.Signature(e3);
                    return;
                }
            }
            boolean z10 = z3;
            if (!z2 || !z10 || cArr2 == null || cArr2.length == 0 || AbstractC8151l.crashlytics("org.bouncycastle.pkcs12.ignore_useless_passwd")) {
                return;
            }
            C18262l.metrica("password supplied for keystore that does not require one");
        } catch (Exception e4) {
            C18262l.metrica(e4.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(InputStream inputStream) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.keys.get(str) != null) {
            throw new KeyStoreException(AbstractC15560l.Signature("There is a key entry with the name ", str, "."));
        }
        this.certs.put(str, certificate);
        this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            this.certs.put(str, certificateArr[0]);
            for (int i = 0; i != certificateArr.length; i++) {
                this.chainCerts.put(new CertId(certificateArr[i].getPublicKey()), certificateArr[i]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        C7809l c7809l;
        char[] password;
        if (loadStoreParameter == null) {
            C8339l.metrica("'param' arg cannot be null");
            return;
        }
        boolean z = loadStoreParameter instanceof C7809l;
        if (!z && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            C8339l.metrica("No support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
            return;
        }
        if (z) {
            c7809l = (C7809l) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            c7809l = new C7809l(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding(), jDKPKCS12StoreParameter.isOverwriteFriendlyName());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                C8339l.metrica("No support for protection parameter of type ".concat(protectionParameter.getClass().getName()));
                return;
            }
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        doStore(c7809l.getOutputStream(), password, c7809l.isForDEREncoding(), c7809l.isOverwriteFriendlyName());
    }

    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public PrivateKey unwrapKey(C10198l c10198l, byte[] bArr, char[] cArr, boolean z) throws IOException {
        Cipher cipherCreateCipher;
        Cfor cfor = c10198l.f20787l;
        try {
            if (cfor.m195strictfp(InterfaceC0543l.f1907l)) {
                C7286l c7286lVip = C7286l.vip(c10198l.f20786l);
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(c7286lVip.f15133l.f36593l, AbstractC12489l.crashlytics(c7286lVip.f15134l.appmetrica()));
                cipherCreateCipher = this.helper.subs(cfor.inmobi());
                cipherCreateCipher.init(4, new C16023l(cArr, z), pBEParameterSpec);
            } else {
                if (!cfor.ad(InterfaceC0543l.f1915protected)) {
                    C18262l.metrica(AbstractC9361l.license("exception unwrapping private key - cannot recognise: ", cfor));
                    return null;
                }
                cipherCreateCipher = createCipher(4, cArr, c10198l);
            }
            return (PrivateKey) cipherCreateCipher.unwrap(bArr, "", 2);
        } catch (InvalidKeyException e) {
            throw AbstractC17742l.crashlytics("exception unwrapping private key:" + e.getMessage(), new UnrecoverableKeyException(e.toString()));
        } catch (Exception e2) {
            throw AbstractC17742l.crashlytics("exception unwrapping private key: " + e2.getMessage(), e2);
        }
    }

    public byte[] wrapKey(C9748l c9748l, Key key, C16770l c16770l, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, c16770l.tapsense(), AbstractC12489l.crashlytics(c16770l.f32782l.appmetrica()), AbstractC16784l.admob(c16770l.metrica()) * 8);
        try {
            SecretKeyFactory secretKeyFactorySignatures = this.helper.signatures("PBKDF2withHMacSHA256");
            InterfaceC12575l interfaceC12575l = this.helper;
            C10198l c10198l = c9748l.f19885l;
            C10198l c10198l2 = c9748l.f19885l;
            Cipher cipherSubs = interfaceC12575l.subs(c10198l.f20787l.inmobi());
            AlgorithmParameters algorithmParametersAdvert = this.helper.advert(c10198l2.f20787l.inmobi());
            algorithmParametersAdvert.init(c10198l2.f20786l.billing().getEncoded());
            cipherSubs.init(3, secretKeyFactorySignatures.generateSecret(pBEKeySpec), algorithmParametersAdvert);
            return cipherSubs.wrap(key);
        } catch (Exception e) {
            C18262l.metrica(AbstractC5020l.ads(e, new StringBuilder("exception encrypting data - ")));
            return null;
        }
    }

    public class CertId {
        byte[] id;

        public CertId(PublicKey publicKey) {
            this.id = AbstractC14024l.crashlytics(PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).f14309l);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return Arrays.equals(this.id, ((CertId) obj).id);
            }
            return false;
        }

        public int hashCode() {
            return AbstractC14024l.ads(this.id);
        }

        public CertId(byte[] bArr) {
            this.id = bArr;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new RuntimeException("operation not supported");
    }

    public byte[] wrapKey(String str, Key key, C7286l c7286l, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory secretKeyFactorySignatures = this.helper.signatures(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(c7286l.f15133l.f36593l, AbstractC12489l.crashlytics(c7286l.f15134l.appmetrica()));
            Cipher cipherSubs = this.helper.subs(str);
            cipherSubs.init(3, secretKeyFactorySignatures.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherSubs.wrap(key);
        } catch (Exception e) {
            C18262l.metrica(AbstractC5020l.ads(e, new StringBuilder("exception encrypting data - ")));
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        doStore(outputStream, cArr, false, true);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else {
            C8339l.metrica("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
        }
    }
}
