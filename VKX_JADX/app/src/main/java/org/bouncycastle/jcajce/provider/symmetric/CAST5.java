package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC8776l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C1196l;
import defpackage.C17132l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C3047l;
import defpackage.C4998l;
import defpackage.C7972l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.Csynchronized;
import defpackage.Cthrow;
import defpackage.InterfaceC4787l;
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
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class CAST5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("CAST5");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new C1196l(1)), 64);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C1196l(1));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST5", 128, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = CAST5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.CAST5", sb, configurableProvider);
            AbstractC11043l.vip(str, "$ECB", "Cipher.CAST5", AbstractC4338l.premium(configurableProvider, "AlgorithmParameterGenerator.CAST5", AbstractC4338l.advert("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5", configurableProvider, str, "$AlgParamGen"), "Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5"), configurableProvider);
            Cfor cfor = InterfaceC4787l.purchase;
            configurableProvider.addAlgorithm("Cipher", cfor, str + "$CBC");
            AbstractC11043l.vip(str, "$KeyGen", "KeyGenerator.CAST5", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator", cfor, "CAST5");
        }
    }

    private CAST5() {
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private int keyLength = 128;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (!isASN1FormatString(str)) {
                if (str.equals("RAW")) {
                    return engineGetEncoded();
                }
                return null;
            }
            byte[] bArrEngineGetEncoded = engineGetEncoded();
            int i = this.keyLength;
            C11327l c11327l = new C11327l(AbstractC14024l.crashlytics(bArrEngineGetEncoded));
            Cstrictfp cstrictfpM4580private = Cstrictfp.m4580private(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C11138l(c11327l, cstrictfpM4580private).metrica(new C7972l(2, byteArrayOutputStream), true);
            return byteArrayOutputStream.toByteArray();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            C3047l c3047l;
            if (!isASN1FormatString(str)) {
                if (str.equals("RAW")) {
                    engineInit(bArr);
                    return;
                } else {
                    C18262l.metrica("Unknown parameters format in IV parameters object");
                    return;
                }
            }
            Ccase ccaseAds = new Csynchronized(bArr).ads();
            if (ccaseAds != null) {
                Cclass cclassInmobi = Cclass.inmobi(ccaseAds);
                c3047l = new C3047l();
                c3047l.f6573l = (Cthrow) cclassInmobi.mo173throws(0);
                c3047l.f6574l = (Cstrictfp) cclassInmobi.mo173throws(1);
            } else {
                c3047l = null;
            }
            this.keyLength = c3047l.f6574l.m4585strictfp();
            this.iv = AbstractC14024l.crashlytics(c3047l.f6573l.f36593l);
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CAST5 Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            C17132l.startapp("unknown parameter spec passed to CAST5 parameters object.");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            byte[] bArr = this.iv;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
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
                C17132l.startapp("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
            }
        }
    }
}
