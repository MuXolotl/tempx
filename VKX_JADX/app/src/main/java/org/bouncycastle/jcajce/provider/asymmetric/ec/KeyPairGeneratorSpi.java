package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC11918l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C1054l;
import defpackage.C10825l;
import defpackage.C11467l;
import defpackage.C12726l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C4148l;
import defpackage.C6051l;
import defpackage.C6265l;
import defpackage.C7100l;
import defpackage.C7838l;
import defpackage.C8374l;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }

    public static class EC extends KeyPairGeneratorSpi {
        private static final Hashtable ecParameters;
        String algorithm;
        ProviderConfiguration configuration;
        Object ecParams;
        C6265l engine;
        boolean initialised;
        C1054l param;
        SecureRandom random;
        int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(192, new ECGenParameterSpec("prime192v1"));
            hashtable.put(239, new ECGenParameterSpec("prime239v1"));
            hashtable.put(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), new ECGenParameterSpec("prime256v1"));
            hashtable.put(224, new ECGenParameterSpec("P-224"));
            hashtable.put(384, new ECGenParameterSpec("P-384"));
            hashtable.put(521, new ECGenParameterSpec("P-521"));
        }

        public EC() {
            super("EC");
            this.engine = new C6265l();
            this.ecParams = null;
            this.strength = 239;
            this.random = AbstractC8776l.loadAd();
            this.initialised = false;
            this.algorithm = "EC";
            this.configuration = BouncyCastleProvider.CONFIGURATION;
        }

        public C1054l createKeyGenParamsBC(C12726l c12726l, SecureRandom secureRandom) {
            return new C1054l(new C7838l(c12726l.f25097l, c12726l.f25095l, c12726l.f25099l, c12726l.f25098l, null), secureRandom);
        }

        public C1054l createKeyGenParamsJCE(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            C7100l domainParametersFromName;
            if ((eCParameterSpec instanceof C10825l) && (domainParametersFromName = ECUtils.getDomainParametersFromName(((C10825l) eCParameterSpec).f21882l, this.configuration)) != null) {
                return createKeyGenParamsJCE(domainParametersFromName, secureRandom);
            }
            AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new C1054l(new C7838l(abstractC11918lConvertCurve, EC5Util.convertPoint(abstractC11918lConvertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), null), secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            C18595l c18595lPurchase = this.engine.purchase();
            C4148l c4148l = (C4148l) ((AbstractC8831l) c18595lPurchase.f36317l);
            C8374l c8374l = (C8374l) ((AbstractC8831l) c18595lPurchase.f36316l);
            Object obj = this.ecParams;
            if (obj instanceof C12726l) {
                C12726l c12726l = (C12726l) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.algorithm, c4148l, c12726l, this.configuration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.algorithm, c8374l, bCECPublicKey, c12726l, this.configuration));
            }
            if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.algorithm, c4148l, this.configuration), new BCECPrivateKey(this.algorithm, c8374l, this.configuration));
            }
            ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
            BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.algorithm, c4148l, eCParameterSpec, this.configuration);
            return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.algorithm, c8374l, bCECPublicKey2, eCParameterSpec, this.configuration));
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            C1054l c1054lCreateKeyGenParamsJCE;
            C12726l ecImplicitlyCa;
            if (algorithmParameterSpec != null) {
                if (algorithmParameterSpec instanceof C12726l) {
                    this.ecParams = algorithmParameterSpec;
                    ecImplicitlyCa = (C12726l) algorithmParameterSpec;
                } else if (algorithmParameterSpec instanceof ECParameterSpec) {
                    this.ecParams = algorithmParameterSpec;
                    c1054lCreateKeyGenParamsJCE = createKeyGenParamsJCE((ECParameterSpec) algorithmParameterSpec, secureRandom);
                    this.param = c1054lCreateKeyGenParamsJCE;
                } else if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    initializeNamedCurve(((ECGenParameterSpec) algorithmParameterSpec).getName(), secureRandom);
                } else if (algorithmParameterSpec instanceof C6051l) {
                    initializeNamedCurve(((C6051l) algorithmParameterSpec).f12824l, secureRandom);
                } else {
                    String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                    if (nameFrom == null) {
                        C11467l.pro(algorithmParameterSpec, "invalid parameterSpec: ");
                        return;
                    }
                    initializeNamedCurve(nameFrom, secureRandom);
                }
                this.engine.mo274throws(this.param);
                this.initialised = true;
            }
            ecImplicitlyCa = this.configuration.getEcImplicitlyCa();
            if (ecImplicitlyCa == null) {
                C18073l.pro("null parameter passed but no implicitCA set");
                return;
            }
            this.ecParams = null;
            c1054lCreateKeyGenParamsJCE = createKeyGenParamsBC(ecImplicitlyCa, secureRandom);
            this.param = c1054lCreateKeyGenParamsJCE;
            this.engine.mo274throws(this.param);
            this.initialised = true;
        }

        public void initializeNamedCurve(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            C7100l domainParametersFromName = ECUtils.getDomainParametersFromName(str, this.configuration);
            if (domainParametersFromName == null) {
                throw new InvalidAlgorithmParameterException(AbstractC14814l.startapp("unknown curve name: ", str));
            }
            this.ecParams = new C10825l(str, domainParametersFromName.f14871l.f6465l, domainParametersFromName.f14870l.vip(), domainParametersFromName.f14874l, domainParametersFromName.f14873l, null);
            this.param = createKeyGenParamsJCE(domainParametersFromName, secureRandom);
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.engine = new C6265l();
            this.ecParams = null;
            this.strength = 239;
            this.random = AbstractC8776l.loadAd();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = providerConfiguration;
        }

        public C1054l createKeyGenParamsJCE(C7100l c7100l, SecureRandom secureRandom) {
            return new C1054l(new C7838l(c7100l.f14871l.f6465l, c7100l.f14870l.vip(), c7100l.f14874l, c7100l.f14873l, null), secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
            String str;
            this.strength = i;
            this.random = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(Integer.valueOf(i));
            if (eCGenParameterSpec != null) {
                try {
                    initialize(eCGenParameterSpec, secureRandom);
                    return;
                } catch (InvalidAlgorithmParameterException unused) {
                    str = "key size not configurable.";
                }
            } else {
                str = "unknown key size.";
            }
            C11467l.license(str);
        }
    }
}
