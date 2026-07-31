package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC8776l;
import defpackage.C1577l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C1955l;
import defpackage.C4998l;
import defpackage.appmetrica;
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
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class RC5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("RC5");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "RC5 IV";
        }
    }

    public static class CBC32 extends BaseBlockCipher {
        public CBC32() {
            super(new C4998l(new appmetrica((byte) 0, 9)), 64);
        }
    }

    public static class CFB8Mac32 extends BaseMac {
        public CFB8Mac32() {
            super(new C1577l(new appmetrica((byte) 0, 9)));
        }
    }

    public static class ECB32 extends BaseBlockCipher {
        public ECB32() {
            super(new appmetrica((byte) 0, 9));
        }
    }

    public static class ECB64 extends BaseBlockCipher {
        public ECB64() {
            appmetrica appmetricaVar = new appmetrica((char) 0, 10);
            appmetricaVar.f489l = 12;
            appmetricaVar.f492l = null;
            super(appmetricaVar);
        }
    }

    public static class KeyGen32 extends BaseKeyGenerator {
        public KeyGen32() {
            super("RC5", 128, new C18017l());
        }
    }

    public static class KeyGen64 extends BaseKeyGenerator {
        public KeyGen64() {
            super("RC5-64", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mac32 extends BaseMac {
        public Mac32() {
            super(new C1955l(new appmetrica((byte) 0, 9)));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = RC5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$ECB32", "Cipher.RC5", sb, configurableProvider);
            AbstractC11043l.vip(str, "$Mac32", "Mac.RC5MAC", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.RC5-64", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.RC5", AbstractC11043l.subs(str, "$KeyGen64", "KeyGenerator.RC5-64", AbstractC4338l.premium(configurableProvider, "KeyGenerator.RC5", AbstractC4338l.advert("Cipher.RC5-64", AbstractC4338l.advert("Alg.Alias.Cipher.RC5-32", "RC5", configurableProvider, str, "$ECB64"), configurableProvider, str, "$KeyGen32"), "Alg.Alias.KeyGenerator.RC5-32", "RC5"), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.RC5MAC/CFB8", AbstractC4338l.advert("Alg.Alias.Mac.RC5", "RC5MAC", configurableProvider, str, "$CFB8Mac32"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }

    private RC5() {
    }
}
