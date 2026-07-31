package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import defpackage.AbstractC14024l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC8776l;
import defpackage.C10198l;
import defpackage.C16833l;
import defpackage.C16842l;
import defpackage.C17029l;
import defpackage.C17711l;
import defpackage.C17951l;
import defpackage.C18073l;
import defpackage.C18119l;
import defpackage.C2657l;
import defpackage.C4875l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.C9556l;
import defpackage.Cfor;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC6796l;
import defpackage.InterfaceC8134l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final String ML_DSA_44 = "ML-DSA-44";
    private static final String ML_DSA_65 = "ML-DSA-65";
    private static final String ML_DSA_87 = "ML-DSA-87";
    private static final HashMap<Cfor, AlgorithmParameterSpec> algorithmsParameterSpecs;
    private static final Map<String, String> canonicalNames;
    private static final HashMap<Cfor, byte[]> domainSeparators;
    private static final byte[] prefix = AbstractC8535l.yandex("436f6d706f73697465416c676f726974686d5369676e61747572657332303235");
    private Cfor algorithm;
    private String[] algs;
    private InterfaceC16922l baseDigest;
    private Signature[] componentSignatures;
    private Key compositeKey;
    private C16833l contextSpec;
    private byte[] domain;
    private AlgorithmParameters engineParams;
    private InterfaceC12575l helper;
    private final boolean isPrehash;
    private InterfaceC16922l preHashDigest;
    private final SecureRandom random;
    private boolean unprimed;

    public static final class COMPOSITE extends SignatureSpi {
        public COMPOSITE() {
            super(null, null, false);
        }
    }

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static final class MLDSA44_ECDSA_P256_SHA256 extends SignatureSpi {
        public MLDSA44_ECDSA_P256_SHA256() {
            super(InterfaceC6796l.subs, new C2657l());
        }
    }

    public static final class MLDSA44_ECDSA_P256_SHA256_PREHASH extends SignatureSpi {
        public MLDSA44_ECDSA_P256_SHA256_PREHASH() {
            super(InterfaceC6796l.subs, new C2657l(), true);
        }
    }

    public static final class MLDSA44_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA44_Ed25519_SHA512() {
            super(InterfaceC6796l.admob, new C17711l());
        }
    }

    public static final class MLDSA44_Ed25519_SHA512_PREHASH extends SignatureSpi {
        public MLDSA44_Ed25519_SHA512_PREHASH() {
            super(InterfaceC6796l.admob, new C17711l(), true);
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256() {
            super(InterfaceC6796l.mopub, new C2657l());
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256_PREHASH extends SignatureSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256_PREHASH() {
            super(InterfaceC6796l.mopub, new C2657l(), true);
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PSS_SHA256() {
            super(InterfaceC6796l.billing, new C2657l());
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256_PREHASH extends SignatureSpi {
        public MLDSA44_RSA2048_PSS_SHA256_PREHASH() {
            super(InterfaceC6796l.billing, new C2657l(), true);
        }
    }

    public static final class MLDSA65_ECDSA_P256_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_P256_SHA512() {
            super(InterfaceC6796l.vip, new C17711l());
        }
    }

    public static final class MLDSA65_ECDSA_P256_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_ECDSA_P256_SHA512_PREHASH() {
            super(InterfaceC6796l.vip, new C17711l(), true);
        }
    }

    public static final class MLDSA65_ECDSA_P384_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_P384_SHA512() {
            super(InterfaceC6796l.metrica, new C17711l());
        }
    }

    public static final class MLDSA65_ECDSA_P384_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_ECDSA_P384_SHA512_PREHASH() {
            super(InterfaceC6796l.metrica, new C17711l(), true);
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA512() {
            super(InterfaceC6796l.startapp, new C17711l());
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA512_PREHASH() {
            super(InterfaceC6796l.startapp, new C17711l(), true);
        }
    }

    public static final class MLDSA65_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA65_Ed25519_SHA512() {
            super(InterfaceC6796l.adcel, new C17711l());
        }
    }

    public static final class MLDSA65_Ed25519_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_Ed25519_SHA512_PREHASH() {
            super(InterfaceC6796l.adcel, new C17711l(), true);
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA512 extends SignatureSpi {
        public MLDSA65_RSA3072_PKCS15_SHA512() {
            super(InterfaceC6796l.firebase, new C17711l());
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA3072_PKCS15_SHA512_PREHASH() {
            super(InterfaceC6796l.firebase, new C17711l(), true);
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA512 extends SignatureSpi {
        public MLDSA65_RSA3072_PSS_SHA512() {
            super(InterfaceC6796l.isPro, new C17711l());
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA3072_PSS_SHA512_PREHASH() {
            super(InterfaceC6796l.isPro, new C17711l(), true);
        }
    }

    public static final class MLDSA65_RSA4096_PKCS15_SHA512 extends SignatureSpi {
        public MLDSA65_RSA4096_PKCS15_SHA512() {
            super(InterfaceC6796l.remoteconfig, new C17711l());
        }
    }

    public static final class MLDSA65_RSA4096_PKCS15_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA4096_PKCS15_SHA512_PREHASH() {
            super(InterfaceC6796l.remoteconfig, new C17711l(), true);
        }
    }

    public static final class MLDSA65_RSA4096_PSS_SHA512 extends SignatureSpi {
        public MLDSA65_RSA4096_PSS_SHA512() {
            super(InterfaceC6796l.smaato, new C17711l());
        }
    }

    public static final class MLDSA65_RSA4096_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA4096_PSS_SHA512_PREHASH() {
            super(InterfaceC6796l.smaato, new C17711l(), true);
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_P384_SHA512() {
            super(InterfaceC6796l.ads, new C17711l());
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_ECDSA_P384_SHA512_PREHASH() {
            super(InterfaceC6796l.ads, new C17711l(), true);
        }
    }

    public static final class MLDSA87_ECDSA_P521_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_P521_SHA512() {
            super(InterfaceC6796l.pro, new C17711l());
        }
    }

    public static final class MLDSA87_ECDSA_P521_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_ECDSA_P521_SHA512_PREHASH() {
            super(InterfaceC6796l.pro, new C17711l(), true);
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA512() {
            super(InterfaceC6796l.subscription, new C17711l());
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA512_PREHASH() {
            super(InterfaceC6796l.subscription, new C17711l(), true);
        }
    }

    public static final class MLDSA87_Ed448_SHAKE256 extends SignatureSpi {
        public MLDSA87_Ed448_SHAKE256() {
            super(InterfaceC6796l.tapsense, new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static final class MLDSA87_Ed448_SHAKE256_PREHASH extends SignatureSpi {
        public MLDSA87_Ed448_SHAKE256_PREHASH() {
            super(InterfaceC6796l.tapsense, new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES), true);
        }
    }

    public static final class MLDSA87_RSA3072_PSS_SHA512 extends SignatureSpi {
        public MLDSA87_RSA3072_PSS_SHA512() {
            super(InterfaceC6796l.Signature, new C17711l());
        }
    }

    public static final class MLDSA87_RSA3072_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_RSA3072_PSS_SHA512_PREHASH() {
            super(InterfaceC6796l.Signature, new C17711l(), true);
        }
    }

    public static final class MLDSA87_RSA4096_PSS_SHA512 extends SignatureSpi {
        public MLDSA87_RSA4096_PSS_SHA512() {
            super(InterfaceC6796l.license, new C17711l());
        }
    }

    public static final class MLDSA87_RSA4096_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_RSA4096_PSS_SHA512_PREHASH() {
            super(InterfaceC6796l.license, new C17711l(), true);
        }
    }

    static {
        HashMap map = new HashMap();
        canonicalNames = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        domainSeparators = linkedHashMap;
        HashMap<Cfor, AlgorithmParameterSpec> map2 = new HashMap<>();
        algorithmsParameterSpecs = map2;
        map.put("MLDSA44", ML_DSA_44);
        map.put("MLDSA65", ML_DSA_65);
        map.put("MLDSA87", ML_DSA_87);
        map.put(InterfaceC8134l.f16997transient.inmobi(), ML_DSA_44);
        map.put(InterfaceC8134l.f16986protected.inmobi(), ML_DSA_65);
        map.put(InterfaceC8134l.f17000while.inmobi(), ML_DSA_87);
        Cfor cfor = InterfaceC6796l.billing;
        linkedHashMap.put(cfor, AbstractC8535l.yandex("434f4d505349472d4d4c44534134342d525341323034382d5053532d534841323536"));
        linkedHashMap.put(InterfaceC6796l.mopub, AbstractC8535l.yandex("434f4d505349472d4d4c44534134342d525341323034382d504b435331352d534841323536"));
        linkedHashMap.put(InterfaceC6796l.admob, AbstractC8535l.yandex("434f4d505349472d4d4c44534134342d456432353531392d534841353132"));
        linkedHashMap.put(InterfaceC6796l.subs, AbstractC8535l.yandex("434f4d505349472d4d4c44534134342d45434453412d503235362d534841323536"));
        Cfor cfor2 = InterfaceC6796l.isPro;
        linkedHashMap.put(cfor2, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d525341333037322d5053532d534841353132"));
        linkedHashMap.put(InterfaceC6796l.firebase, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d525341333037322d504b435331352d534841353132"));
        Cfor cfor3 = InterfaceC6796l.smaato;
        linkedHashMap.put(cfor3, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d525341343039362d5053532d534841353132"));
        linkedHashMap.put(InterfaceC6796l.remoteconfig, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d525341343039362d504b435331352d534841353132"));
        linkedHashMap.put(InterfaceC6796l.vip, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d45434453412d503235362d534841353132"));
        linkedHashMap.put(InterfaceC6796l.metrica, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d45434453412d503338342d534841353132"));
        linkedHashMap.put(InterfaceC6796l.startapp, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d45434453412d42503235362d534841353132"));
        linkedHashMap.put(InterfaceC6796l.adcel, AbstractC8535l.yandex("434f4d505349472d4d4c44534136352d456432353531392d534841353132"));
        linkedHashMap.put(InterfaceC6796l.subscription, AbstractC8535l.yandex("434f4d505349472d4d4c44534138372d45434453412d42503338342d534841353132"));
        linkedHashMap.put(InterfaceC6796l.tapsense, AbstractC8535l.yandex("434f4d505349472d4d4c44534138372d45643434382d5348414b45323536"));
        Cfor cfor4 = InterfaceC6796l.Signature;
        linkedHashMap.put(cfor4, AbstractC8535l.yandex("434f4d505349472d4d4c44534138372d525341333037322d5053532d534841353132"));
        Cfor cfor5 = InterfaceC6796l.license;
        linkedHashMap.put(cfor5, AbstractC8535l.yandex("434f4d505349472d4d4c44534138372d525341343039362d5053532d534841353132"));
        linkedHashMap.put(InterfaceC6796l.ads, AbstractC8535l.yandex("434f4d505349472d4d4c44534138372d45434453412d503338342d534841353132"));
        linkedHashMap.put(InterfaceC6796l.pro, AbstractC8535l.yandex("434f4d505349472d4d4c44534138372d45434453412d503532312d534841353132"));
        map2.put(cfor, new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        map2.put(cfor2, new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        map2.put(cfor3, new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        map2.put(cfor5, new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        map2.put(cfor4, new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
    }

    public SignatureSpi(Cfor cfor, InterfaceC16922l interfaceC16922l, boolean z) {
        this.random = AbstractC8776l.loadAd();
        this.helper = new C7633l();
        this.engineParams = null;
        this.unprimed = true;
        this.algorithm = cfor;
        this.isPrehash = z;
        if (cfor != null) {
            this.baseDigest = interfaceC16922l;
            this.preHashDigest = z ? new NullDigest(interfaceC16922l.getDigestSize()) : interfaceC16922l;
            this.domain = domainSeparators.get(cfor);
            String[] pairing = CompositeIndex.getPairing(cfor);
            this.algs = pairing;
            this.componentSignatures = new Signature[pairing.length];
        }
    }

    private void baseSigInit() {
        try {
            this.componentSignatures[0].setParameter(new C16833l(this.domain));
            AlgorithmParameterSpec algorithmParameterSpec = algorithmsParameterSpecs.get(this.algorithm);
            if (algorithmParameterSpec != null) {
                this.componentSignatures[1].setParameter(algorithmParameterSpec);
            }
            this.unprimed = false;
        } catch (InvalidAlgorithmParameterException unused) {
            C8339l.smaato("unable to set context on ML-DSA");
        }
    }

    private void createComponentSignatures(List list, List<Provider> list2) {
        int i = 0;
        try {
            if (list2 != null) {
                while (i != this.componentSignatures.length) {
                    Provider provider = list2.get(i);
                    Signature[] signatureArr = this.componentSignatures;
                    if (provider == null) {
                        signatureArr[i] = getDefaultSignature(this.algs[i], list.get(i));
                    } else {
                        signatureArr[i] = Signature.getInstance(this.algs[i], list2.get(i));
                    }
                    i++;
                }
                return;
            }
            while (true) {
                Signature[] signatureArr2 = this.componentSignatures;
                if (i == signatureArr2.length) {
                    return;
                }
                signatureArr2[i] = getDefaultSignature(this.algs[i], list.get(i));
                i++;
            }
        } catch (GeneralSecurityException e) {
            C4875l.remoteconfig(e.getMessage(), e);
        }
    }

    private String getCanonicalName(String str) {
        String str2 = canonicalNames.get(str);
        return str2 != null ? str2 : str;
    }

    private Signature getDefaultSignature(String str, Object obj) {
        return obj instanceof InterfaceC14821l ? this.helper.createSignature(str) : Signature.getInstance(str);
    }

    private void processPreHashedMessage(byte[] bArr) throws SignatureException {
        int digestSize = this.baseDigest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        try {
            this.preHashDigest.doFinal(bArr2, 0);
            int i = 0;
            while (true) {
                Signature[] signatureArr = this.componentSignatures;
                if (i >= signatureArr.length) {
                    return;
                }
                Signature signature = signatureArr[i];
                signature.update(prefix);
                signature.update(this.domain);
                C16833l c16833l = this.contextSpec;
                if (c16833l == null) {
                    signature.update((byte) 0);
                } else {
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c16833l.f32862l);
                    signature.update((byte) bArrCrashlytics.length);
                    signature.update(bArrCrashlytics);
                }
                if (bArr != null) {
                    signature.update(bArr, 0, bArr.length);
                }
                signature.update(bArr2, 0, digestSize);
                i++;
            }
        } catch (IllegalStateException e) {
            throw new SignatureException(e.getMessage());
        }
    }

    private void sigInitSign() throws InvalidKeyException {
        C16842l c16842l = (C16842l) this.compositeKey;
        int i = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i >= signatureArr.length) {
                this.unprimed = true;
                return;
            } else {
                signatureArr[i].initSign((PrivateKey) c16842l.f32871l.get(i));
                i++;
            }
        }
    }

    private void sigInitVerify() throws InvalidKeyException {
        C9556l c9556l = (C9556l) this.compositeKey;
        int i = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i >= signatureArr.length) {
                this.unprimed = true;
                return;
            } else {
                signatureArr[i].initVerify((PublicKey) c9556l.f19473l.get(i));
                i++;
            }
        }
    }

    public static byte[][] splitCompositeSignature(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        int length = bArr.length - i;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        System.arraycopy(bArr, i, bArr3, 0, length);
        return new byte[][]{bArr2, bArr3};
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.contextSpec != null) {
            try {
                AlgorithmParameters algorithmParametersAdvert = this.helper.advert("CONTEXT");
                this.engineParams = algorithmParametersAdvert;
                algorithmParametersAdvert.init(this.contextSpec);
            } catch (Exception e) {
                throw new IllegalStateException(e.toString(), e);
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof C16842l)) {
            C18073l.smaato("Private key is not composite.");
            return;
        }
        this.compositeKey = privateKey;
        C16842l c16842l = (C16842l) privateKey;
        Cfor cfor = this.algorithm;
        C10198l c10198l = c16842l.f32870l;
        if (cfor == null) {
            Cfor cfor2 = c10198l.f20787l;
            this.algorithm = cfor2;
            InterfaceC16922l digest = CompositeIndex.getDigest(cfor2);
            this.baseDigest = digest;
            if (this.isPrehash) {
                digest = new NullDigest(digest.getDigestSize());
            }
            this.preHashDigest = digest;
            this.domain = domainSeparators.get(cfor2);
            String[] pairing = CompositeIndex.getPairing(cfor2);
            this.algs = pairing;
            this.componentSignatures = new Signature[pairing.length];
        } else if (!c10198l.f20787l.ad(cfor)) {
            C18073l.smaato("provided composite public key cannot be used with the composite signature algorithm");
            return;
        }
        createComponentSignatures(c16842l.f32871l, null);
        sigInitSign();
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof C9556l)) {
            C18073l.smaato("public key is not composite");
            return;
        }
        this.compositeKey = publicKey;
        C9556l c9556l = (C9556l) publicKey;
        Cfor cfor = this.algorithm;
        if (cfor == null) {
            Cfor cfor2 = C17029l.vip(c9556l.getEncoded()).f33175l.f20787l;
            this.algorithm = cfor2;
            InterfaceC16922l digest = CompositeIndex.getDigest(cfor2);
            this.baseDigest = digest;
            if (this.isPrehash) {
                digest = new NullDigest(digest.getDigestSize());
            }
            this.preHashDigest = digest;
            this.domain = domainSeparators.get(cfor2);
            String[] pairing = CompositeIndex.getPairing(cfor2);
            this.algs = pairing;
            this.componentSignatures = new Signature[pairing.length];
        } else if (!c9556l.f19472l.f20787l.ad(cfor)) {
            C18073l.smaato("provided composite public key cannot be used with the composite signature algorithm");
            return;
        }
        createComponentSignatures(c9556l.f19473l, null);
        sigInitVerify();
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        String str;
        if (!this.unprimed) {
            str = "attempt to set parameter after update";
        } else {
            if (algorithmParameterSpec instanceof C16833l) {
                this.contextSpec = (C16833l) algorithmParameterSpec;
                try {
                    if (this.compositeKey instanceof PublicKey) {
                        sigInitVerify();
                        return;
                    } else {
                        sigInitSign();
                        return;
                    }
                } catch (InvalidKeyException e) {
                    throw new InvalidAlgorithmParameterException("keys invalid on reset: " + e.getMessage(), e);
                }
            }
            byte[] bArr = (byte[]) AccessController.doPrivileged(new C18119l(algorithmParameterSpec, 1));
            if (bArr != null) {
                this.contextSpec = new C16833l(bArr);
                try {
                    if (this.compositeKey instanceof PublicKey) {
                        sigInitVerify();
                    } else {
                        sigInitSign();
                    }
                } catch (InvalidKeyException e2) {
                    throw new InvalidAlgorithmParameterException("keys invalid on reset: " + e2.getMessage(), e2);
                }
            }
            str = "unknown parameterSpec passed to composite signature";
        }
        C18073l.pro(str);
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        this.random.nextBytes(new byte[32]);
        if (this.preHashDigest != null) {
            processPreHashedMessage(null);
        }
        byte[] bArrSign = this.componentSignatures[0].sign();
        byte[] bArrSign2 = this.componentSignatures[1].sign();
        byte[] bArr = new byte[bArrSign.length + bArrSign2.length];
        System.arraycopy(bArrSign, 0, bArr, 0, bArrSign.length);
        System.arraycopy(bArrSign2, 0, bArr, bArrSign.length, bArrSign2.length);
        return bArr;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        if (this.unprimed) {
            baseSigInit();
        }
        InterfaceC16922l interfaceC16922l = this.preHashDigest;
        if (interfaceC16922l != null) {
            interfaceC16922l.update(b);
            return;
        }
        int i = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i >= signatureArr.length) {
                return;
            }
            signatureArr[i].update(b);
            i++;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        int i;
        int i2 = 0;
        if (this.algs[0].indexOf("44") > 0) {
            i = 2420;
        } else if (this.algs[0].indexOf("65") > 0) {
            i = 3309;
        } else {
            i = this.algs[0].indexOf("87") > 0 ? 4627 : 0;
        }
        byte[][] bArrSplitCompositeSignature = splitCompositeSignature(bArr, i);
        if (this.preHashDigest != null) {
            processPreHashedMessage(null);
        }
        boolean z = false;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i2 >= signatureArr.length) {
                return !z;
            }
            if (!signatureArr[i2].verify(bArrSplitCompositeSignature[i2])) {
                z = true;
            }
            i2++;
        }
    }

    public static class NullDigest implements InterfaceC16922l {
        private final OpenByteArrayOutputStream bOut = new OpenByteArrayOutputStream();
        private final int expectedSize;

        public static class OpenByteArrayOutputStream extends ByteArrayOutputStream {
            private OpenByteArrayOutputStream() {
            }

            public void copy(byte[] bArr, int i) {
                System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i, size());
            }

            @Override // java.io.ByteArrayOutputStream
            public void reset() {
                super.reset();
                AbstractC14024l.loadAd(((ByteArrayOutputStream) this).buf);
            }
        }

        public NullDigest(int i) {
            this.expectedSize = i;
        }

        @Override // defpackage.InterfaceC16922l
        public int doFinal(byte[] bArr, int i) {
            int size = this.bOut.size();
            if (size != this.expectedSize) {
                C8339l.smaato("provided pre-hash digest is the wrong length");
                return 0;
            }
            this.bOut.copy(bArr, i);
            reset();
            return size;
        }

        @Override // defpackage.InterfaceC16922l
        public String getAlgorithmName() {
            return "NULL";
        }

        @Override // defpackage.InterfaceC16922l
        public int getDigestSize() {
            return this.bOut.size();
        }

        @Override // defpackage.InterfaceC16922l
        public void reset() {
            this.bOut.reset();
        }

        @Override // defpackage.InterfaceC16922l
        public void update(byte b) throws IOException {
            this.bOut.write(b);
        }

        @Override // defpackage.InterfaceC16922l
        public void update(byte[] bArr, int i, int i2) throws IOException {
            this.bOut.write(bArr, i, i2);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        if (this.unprimed) {
            baseSigInit();
        }
        InterfaceC16922l interfaceC16922l = this.preHashDigest;
        if (interfaceC16922l != null) {
            interfaceC16922l.update(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i3 >= signatureArr.length) {
                return;
            }
            signatureArr[i3].update(bArr, i, i2);
            i3++;
        }
    }

    public SignatureSpi(Cfor cfor, InterfaceC16922l interfaceC16922l) {
        this(cfor, interfaceC16922l, false);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
}
