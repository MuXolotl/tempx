package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C12381l;
import defpackage.C1577l;
import defpackage.C17132l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C1955l;
import defpackage.C4998l;
import defpackage.C5008l;
import defpackage.C7972l;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC4787l;
import defpackage.appmetrica;
import java.io.ByteArrayOutputStream;
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
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class IDEA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("IDEA");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new C5008l(11)), 64);
        }
    }

    public static class CFB8Mac extends BaseMac {
        public CFB8Mac() {
            super(new C1577l(new C5008l(11)));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C5008l(11));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("IDEA", 128, new C18017l());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C1955l(new C5008l(11)));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = IDEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.IDEA", AbstractC11043l.subs(str, "$AlgParamGen", "AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", AbstractC11043l.subs(str, "$AlgParamGen", "AlgorithmParameterGenerator.IDEA", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            AbstractC11043l.vip(str, "$ECB", "Cipher.IDEA", AbstractC4338l.premium(configurableProvider, "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE"), configurableProvider);
            Cfor cfor = InterfaceC4787l.billing;
            configurableProvider.addAlgorithm("Cipher", cfor, str + "$CBC");
            AbstractC4338l.applovin(AbstractC4338l.isVip("$PBEWithSHAAndIDEAKeyGen", "SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", str, AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.IDEA", AbstractC11043l.subs(str, "$PBEWithSHAAndIDEA", "Cipher.PBEWITHSHAANDIDEA-CBC", new StringBuilder(), configurableProvider), configurableProvider), str, "$KeyGen"), str, cfor), configurableProvider), "$Mac", configurableProvider, "Mac.IDEAMAC");
            configurableProvider.addAlgorithm("Mac.IDEAMAC/CFB8", AbstractC4338l.advert("Alg.Alias.Mac.IDEA", "IDEAMAC", configurableProvider, str, "$CFB8Mac"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }
    }

    public static class PBEWithSHAAndIDEA extends BaseBlockCipher {
        public PBEWithSHAAndIDEA() {
            super(new C4998l(new C5008l(11)), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
        public PBEWithSHAAndIDEAKeyGen() {
            super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
        }
    }

    private IDEA() {
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (!isASN1FormatString(str)) {
                if (!str.equals("RAW")) {
                    return null;
                }
                byte[] bArr = this.iv;
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return bArr2;
            }
            C11327l c11327l = new C11327l(AbstractC14024l.crashlytics(engineGetEncoded("RAW")));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            appmetrica appmetricaVar = new appmetrica(1, 0);
            appmetricaVar.purchase(c11327l);
            C11138l c11138l = new C11138l(appmetricaVar);
            c11138l.f22357l = -1;
            c11138l.metrica(new C7972l(2, byteArrayOutputStream), true);
            return byteArrayOutputStream.toByteArray();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            C12381l c12381l;
            if (str.equals("RAW")) {
                engineInit(bArr);
                return;
            }
            if (!str.equals("ASN.1")) {
                C18262l.metrica("Unknown parameters format in IV parameters object");
                return;
            }
            if (bArr instanceof C12381l) {
                c12381l = (C12381l) bArr;
            } else if (bArr != 0) {
                Cclass cclassInmobi = Cclass.inmobi(bArr);
                C12381l c12381l2 = new C12381l();
                if (cclassInmobi.size() == 1) {
                    c12381l2.f24471l = (Cthrow) cclassInmobi.mo173throws(0);
                } else {
                    c12381l2.f24471l = null;
                }
                c12381l = c12381l2;
            } else {
                c12381l = null;
            }
            Cthrow cthrow = c12381l.f24471l;
            engineInit(cthrow != null ? AbstractC14024l.crashlytics(cthrow.f36593l) : null);
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "IDEA Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            C17132l.startapp("unknown parameter spec passed to IV parameters object.");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            byte[] bArr2 = new byte[bArr.length];
            this.iv = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                C17132l.startapp("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
        }
    }
}
