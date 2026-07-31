package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import defpackage.AbstractC12900l;
import defpackage.C16842l;
import defpackage.C8339l;
import defpackage.C9556l;
import defpackage.Cfor;
import defpackage.InterfaceC6796l;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private final Cfor algorithm;
    private final KeyPairGenerator[] generators;
    private boolean parametersInitialized = false;
    private SecureRandom secureRandom;

    public static final class MLDSA44_ECDSA_P256_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA44_ECDSA_P256_SHA256() {
            super(InterfaceC6796l.subs);
        }
    }

    public static final class MLDSA44_Ed25519_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA44_Ed25519_SHA512() {
            super(InterfaceC6796l.admob);
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256() {
            super(InterfaceC6796l.mopub);
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256 extends KeyPairGeneratorSpi {
        public MLDSA44_RSA2048_PSS_SHA256() {
            super(InterfaceC6796l.billing);
        }
    }

    public static final class MLDSA65_ECDSA_P256_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_ECDSA_P256_SHA512() {
            super(InterfaceC6796l.vip);
        }
    }

    public static final class MLDSA65_ECDSA_P384_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_ECDSA_P384_SHA512() {
            super(InterfaceC6796l.metrica);
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA512() {
            super(InterfaceC6796l.startapp);
        }
    }

    public static final class MLDSA65_Ed25519_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_Ed25519_SHA512() {
            super(InterfaceC6796l.adcel);
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA3072_PKCS15_SHA512() {
            super(InterfaceC6796l.firebase);
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA3072_PSS_SHA512() {
            super(InterfaceC6796l.isPro);
        }
    }

    public static final class MLDSA65_RSA4096_PKCS15_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA4096_PKCS15_SHA512() {
            super(InterfaceC6796l.remoteconfig);
        }
    }

    public static final class MLDSA65_RSA4096_PSS_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA65_RSA4096_PSS_SHA512() {
            super(InterfaceC6796l.smaato);
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA87_ECDSA_P384_SHA512() {
            super(InterfaceC6796l.ads);
        }
    }

    public static final class MLDSA87_ECDSA_P521_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA87_ECDSA_P521_SHA512() {
            super(InterfaceC6796l.pro);
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA512() {
            super(InterfaceC6796l.subscription);
        }
    }

    public static final class MLDSA87_Ed448_SHAKE256 extends KeyPairGeneratorSpi {
        public MLDSA87_Ed448_SHAKE256() {
            super(InterfaceC6796l.tapsense);
        }
    }

    public static final class MLDSA87_RSA3072_PSS_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA87_RSA3072_PSS_SHA512() {
            super(InterfaceC6796l.Signature);
        }
    }

    public static final class MLDSA87_RSA4096_PSS_SHA512 extends KeyPairGeneratorSpi {
        public MLDSA87_RSA4096_PSS_SHA512() {
            super(InterfaceC6796l.license);
        }
    }

    public KeyPairGeneratorSpi(Cfor cfor) {
        this.algorithm = cfor;
        String[] pairing = CompositeIndex.getPairing(cfor);
        AlgorithmParameterSpec[] keyPairSpecs = CompositeIndex.getKeyPairSpecs(cfor);
        this.generators = new KeyPairGenerator[pairing.length];
        for (int i = 0; i != pairing.length; i++) {
            try {
                this.generators[i] = KeyPairGenerator.getInstance(CompositeIndex.getBaseName(pairing[i]), BouncyCastleProvider.PROVIDER_NAME);
                AlgorithmParameterSpec algorithmParameterSpec = keyPairSpecs[i];
                if (algorithmParameterSpec != null) {
                    this.generators[i].initialize(algorithmParameterSpec);
                }
            } catch (Exception e) {
                C8339l.smaato(AbstractC12900l.admob(e, new StringBuilder("unable to create base generator: ")));
                throw null;
            }
        }
    }

    private KeyPair getCompositeKeyPair() {
        KeyPairGenerator[] keyPairGeneratorArr = this.generators;
        PublicKey[] publicKeyArr = new PublicKey[keyPairGeneratorArr.length];
        PrivateKey[] privateKeyArr = new PrivateKey[keyPairGeneratorArr.length];
        int i = 0;
        while (true) {
            KeyPairGenerator[] keyPairGeneratorArr2 = this.generators;
            if (i >= keyPairGeneratorArr2.length) {
                return new KeyPair(new C9556l(this.algorithm, publicKeyArr), new C16842l(this.algorithm, privateKeyArr));
            }
            KeyPair keyPairGenerateKeyPair = keyPairGeneratorArr2[i].generateKeyPair();
            publicKeyArr[i] = keyPairGenerateKeyPair.getPublic();
            privateKeyArr[i] = keyPairGenerateKeyPair.getPrivate();
            i++;
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        return getCompositeKeyPair();
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null) {
            C8339l.metrica("Use initialize only for custom SecureRandom. AlgorithmParameterSpec must be null because it is determined by algorithm name.");
            return;
        }
        AlgorithmParameterSpec[] keyPairSpecs = CompositeIndex.getKeyPairSpecs(this.algorithm);
        for (int i = 0; i != keyPairSpecs.length; i++) {
            AlgorithmParameterSpec algorithmParameterSpec2 = keyPairSpecs[i];
            if (algorithmParameterSpec2 != null) {
                this.generators[i].initialize(algorithmParameterSpec2, secureRandom);
            }
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }
}
