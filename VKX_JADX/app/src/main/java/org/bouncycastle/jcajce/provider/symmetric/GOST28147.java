package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC9008l;
import defpackage.C0800l;
import defpackage.C10358l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C17132l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C18390l;
import defpackage.C3267l;
import defpackage.C3797l;
import defpackage.C3976l;
import defpackage.C4998l;
import defpackage.C6344l;
import defpackage.C6541l;
import defpackage.C7244l;
import defpackage.C7972l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC18410l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class GOST28147 {
    private static Map<Cfor, String> oidMappings = new HashMap();
    private static Map<String, Cfor> nameMappings = new HashMap();

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        byte[] iv = new byte[8];
        byte[] sBox = C10358l.amazon("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(this.iv);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GOST28147");
                byte[] bArr = this.sBox;
                byte[] bArr2 = this.iv;
                C7244l c7244l = new C7244l();
                c7244l.f15069l = null;
                c7244l.f15068l = null;
                byte[] bArr3 = new byte[bArr.length];
                c7244l.f15068l = bArr3;
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                byte[] bArr4 = new byte[bArr2.length];
                c7244l.f15069l = bArr4;
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                algorithmParametersCreateParametersInstance.init(c7244l);
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof C7244l) {
                this.sBox = AbstractC14024l.crashlytics(((C7244l) algorithmParameterSpec).f15068l);
            } else {
                C18073l.pro("parameter spec not supported");
            }
        }
    }

    public static class AlgParams extends BaseAlgParams {
        private byte[] iv;
        private Cfor sBox = InterfaceC11987l.mopub;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof C7244l)) {
                C17132l.startapp("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                return;
            }
            this.iv = AbstractC14024l.crashlytics(((C7244l) algorithmParameterSpec).f15069l);
            try {
                this.sBox = BaseAlgParams.getSBoxOID(AbstractC14024l.crashlytics(((C7244l) algorithmParameterSpec).f15068l));
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == C7244l.class || cls == AlgorithmParameterSpec.class) {
                return new C7244l(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public byte[] localGetEncoded() {
            byte[] bArr = this.iv;
            Cfor cfor = this.sBox;
            C11327l c11327l = new C11327l(AbstractC14024l.crashlytics(bArr));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C11138l(c11327l, cfor).metrica(new C7972l(2, byteArrayOutputStream), true);
            return byteArrayOutputStream.toByteArray();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public void localInit(byte[] bArr) throws IOException {
            Ccase ccaseAdvert = Ccase.advert(bArr);
            if (ccaseAdvert instanceof Cthrow) {
                this.iv = Cthrow.premium(ccaseAdvert).f36593l;
            } else {
                if (!(ccaseAdvert instanceof Cclass)) {
                    C18262l.metrica("Unable to recognize parameters");
                    return;
                }
                C3976l c3976lVip = C3976l.vip(ccaseAdvert);
                this.sBox = c3976lVip.f8163l;
                this.iv = AbstractC14024l.crashlytics(c3976lVip.f8164l.f36593l);
            }
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new C10358l()), 64);
        }
    }

    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new C3267l(24));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C10358l());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new C0800l(new C18390l(new C10358l())), 64);
        }
    }

    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new C3797l(24));
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C6344l(2));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$ECB", "Cipher.GOST28147", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            StringBuilder sb2 = new StringBuilder("Cipher.");
            Cfor cfor = InterfaceC11987l.purchase;
            sb2.append(cfor);
            configurableProvider.addAlgorithm(sb2.toString(), str + "$GCFB");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            AbstractC4338l.applovin(sb3, "$KeyGen", configurableProvider, "KeyGenerator.GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + cfor, "GOST28147");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            StringBuilder sbIsVip = AbstractC4338l.isVip("$AlgParams", "AlgorithmParameters.GOST28147", str, sb4, configurableProvider);
            sbIsVip.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", sbIsVip.toString());
            StringBuilder sbLicense = AbstractC12900l.license(cfor, "GOST28147", "Cipher.", AbstractC12900l.license(cfor, "GOST28147", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameters."), configurableProvider), configurableProvider);
            sbLicense.append(InterfaceC11987l.amazon);
            StringBuilder sbSignatures = AbstractC4338l.signatures(str, "$CryptoProWrap", configurableProvider, sbLicense.toString(), "Cipher.");
            sbSignatures.append(InterfaceC11987l.crashlytics);
            configurableProvider.addAlgorithm(sbSignatures.toString(), str + "$GostWrap");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            AbstractC4338l.applovin(sb5, "$Mac", configurableProvider, "Mac.GOST28147MAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        oidMappings.put(InterfaceC11987l.billing, "E-TEST");
        Map<Cfor, String> map = oidMappings;
        Cfor cfor = InterfaceC11987l.mopub;
        map.put(cfor, "E-A");
        Map<Cfor, String> map2 = oidMappings;
        Cfor cfor2 = InterfaceC11987l.admob;
        map2.put(cfor2, "E-B");
        Map<Cfor, String> map3 = oidMappings;
        Cfor cfor3 = InterfaceC11987l.subs;
        map3.put(cfor3, "E-C");
        Map<Cfor, String> map4 = oidMappings;
        Cfor cfor4 = InterfaceC11987l.isPro;
        map4.put(cfor4, "E-D");
        Map<Cfor, String> map5 = oidMappings;
        Cfor cfor5 = InterfaceC18410l.ads;
        map5.put(cfor5, "PARAM-Z");
        nameMappings.put("E-A", cfor);
        nameMappings.put("E-B", cfor2);
        nameMappings.put("E-C", cfor3);
        nameMappings.put("E-D", cfor4);
        nameMappings.put("PARAM-Z", cfor5);
    }

    private GOST28147() {
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("GOST28147", i, new C18017l());
        }

        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private Cfor sBox = InterfaceC11987l.mopub;

        public static Cfor getSBoxOID(byte[] bArr) {
            Hashtable hashtable = C10358l.f21149l;
            Enumeration enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                String str = (String) enumerationKeys.nextElement();
                if (Arrays.equals((byte[]) hashtable.get(str), bArr)) {
                    return getSBoxOID(str);
                }
            }
            C8339l.metrica("SBOX provided did not map to a known one");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            C18262l.metrica(AbstractC14814l.startapp("Unknown parameter format: ", str));
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof C7244l)) {
                C17132l.startapp("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                return;
            }
            this.iv = AbstractC14024l.crashlytics(((C7244l) algorithmParameterSpec).f15069l);
            try {
                this.sBox = getSBoxOID(AbstractC14024l.crashlytics(((C7244l) algorithmParameterSpec).f15068l));
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == C7244l.class || cls == AlgorithmParameterSpec.class) {
                return new C7244l(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        public byte[] localGetEncoded() {
            byte[] bArr = this.iv;
            Cfor cfor = this.sBox;
            C11327l c11327l = new C11327l(AbstractC14024l.crashlytics(bArr));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C11138l(c11327l, cfor).metrica(new C7972l(2, byteArrayOutputStream), true);
            return byteArrayOutputStream.toByteArray();
        }

        public abstract void localInit(byte[] bArr);

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        public static Cfor getSBoxOID(String str) {
            Cfor cfor = str != null ? (Cfor) GOST28147.nameMappings.get(AbstractC9008l.mopub(str)) : null;
            if (cfor != null) {
                return cfor;
            }
            C8339l.metrica(AbstractC14814l.startapp("Unknown SBOX name: ", str));
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr, String str) throws IOException {
            if (bArr == null) {
                C6541l.subs("Encoded parameters cannot be null");
                return;
            }
            if (isASN1FormatString(str)) {
                try {
                    localInit(bArr);
                    return;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    C18262l.metrica(AbstractC12900l.admob(e2, new StringBuilder("Parameter parsing failed: ")));
                    return;
                }
            }
            C18262l.metrica(AbstractC14814l.startapp("Unknown parameter format: ", str));
        }
    }
}
