package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC9361l;
import defpackage.C13905l;
import defpackage.C16770l;
import defpackage.C17132l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C18725l;
import defpackage.C2862l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.EnumC16675l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC13724l;
import defpackage.InterfaceC6796l;
import defpackage.InterfaceC8134l;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class PBEPBKDF2 {
    private static final Map prfCodes;

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPBKDF2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.PBKDF2", sb.toString());
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            Cfor cfor = InterfaceC0543l.f1923transient;
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(cfor, "PBKDF2", str, sb2, configurableProvider), "$PBKDF2withUTF8", configurableProvider, "SecretKeyFactory.PBKDF2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", "PBKDF2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + cfor, "PBKDF2");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            AbstractC4338l.applovin(sb3, "$PBKDF2with8BIT", configurableProvider, "SecretKeyFactory.PBKDF2WITHASCII");
            AbstractC11043l.vip(str, "$PBKDF2withSM3", "SecretKeyFactory.PBKDF2WITHHMACSM3", AbstractC11043l.subs(str, "$PBKDF2withGOST3411", "SecretKeyFactory.PBKDF2WITHHMACGOST3411", AbstractC11043l.subs(str, "$PBKDF2withSHA3_512", "SecretKeyFactory.PBKDF2WITHHMACSHA3-512", AbstractC11043l.subs(str, "$PBKDF2withSHA3_384", "SecretKeyFactory.PBKDF2WITHHMACSHA3-384", AbstractC11043l.subs(str, "$PBKDF2withSHA3_256", "SecretKeyFactory.PBKDF2WITHHMACSHA3-256", AbstractC11043l.subs(str, "$PBKDF2withSHA3_224", "SecretKeyFactory.PBKDF2WITHHMACSHA3-224", AbstractC11043l.subs(str, "$PBKDF2withSHA512_256", "SecretKeyFactory.PBKDF2WITHHMACSHA512-256", AbstractC11043l.subs(str, "$PBKDF2withSHA512_224", "SecretKeyFactory.PBKDF2WITHHMACSHA512-224", AbstractC11043l.subs(str, "$PBKDF2withSHA512", "SecretKeyFactory.PBKDF2WITHHMACSHA512", AbstractC11043l.subs(str, "$PBKDF2withSHA384", "SecretKeyFactory.PBKDF2WITHHMACSHA384", AbstractC11043l.subs(str, "$PBKDF2withSHA256", "SecretKeyFactory.PBKDF2WITHHMACSHA256", AbstractC11043l.subs(str, "$PBKDF2withSHA224", "SecretKeyFactory.PBKDF2WITHHMACSHA224", AbstractC4338l.premium(configurableProvider, "Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII", "Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII"), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
        }
    }

    public static class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super("PBKDF2", 1);
        }
    }

    public static class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super("PBKDF2", 5, 6);
        }
    }

    public static class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super("PBKDF2", 5, 7);
        }
    }

    public static class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super("PBKDF2", 5, 4);
        }
    }

    public static class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super("PBKDF2", 5, 8);
        }
    }

    public static class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super("PBKDF2", 5, 10);
        }
    }

    public static class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super("PBKDF2", 5, 11);
        }
    }

    public static class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super("PBKDF2", 5, 12);
        }
    }

    public static class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super("PBKDF2", 5, 13);
        }
    }

    public static class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super("PBKDF2", 5, 9);
        }
    }

    public static class PBKDF2withSHA512_224 extends BasePBKDF2 {
        public PBKDF2withSHA512_224() {
            super("PBKDF2", 5, 15);
        }
    }

    public static class PBKDF2withSHA512_256 extends BasePBKDF2 {
        public PBKDF2withSHA512_256() {
            super("PBKDF2", 5, 16);
        }
    }

    public static class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super("PBKDF2", 5, 14);
        }
    }

    public static class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super("PBKDF2", 5);
        }
    }

    static {
        HashMap map = new HashMap();
        prfCodes = map;
        map.put(InterfaceC11987l.loadAd, 6);
        map.put(InterfaceC0543l.f1905l, 1);
        map.put(InterfaceC0543l.f1881l, 4);
        map.put(InterfaceC0543l.f1883l, 7);
        map.put(InterfaceC0543l.f1906l, 8);
        map.put(InterfaceC0543l.f1898l, 9);
        map.put(InterfaceC0543l.f1899l, 15);
        map.put(InterfaceC0543l.f1877l, 16);
        map.put(InterfaceC8134l.vip, 11);
        map.put(InterfaceC8134l.remoteconfig, 10);
        map.put(InterfaceC8134l.metrica, 12);
        map.put(InterfaceC8134l.startapp, 13);
        map.put(InterfaceC6796l.amazon, 2);
        map.put(InterfaceC13724l.subscription, 14);
    }

    private PBEPBKDF2() {
    }

    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int defaultDigest;
        private int scheme;

        public BasePBKDF2(String str, int i, int i2) {
            super(str, InterfaceC0543l.f1923transient);
            this.scheme = i;
            this.defaultDigest = i2;
        }

        private int getDigestCode(Cfor cfor) throws InvalidKeySpecException {
            Integer num = (Integer) PBEPBKDF2.prfCodes.get(cfor);
            if (num != null) {
                return num.intValue();
            }
            throw new InvalidKeySpecException(AbstractC9361l.license("Invalid KeySpec: unknown PRF algorithm ", cfor));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                C18073l.subscription("Invalid KeySpec");
                return null;
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                return new C2862l(pBEKeySpec.getPassword(), this.scheme == 1 ? EnumC16675l.f32698l : EnumC16675l.f32697l);
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                C8339l.metrica("password empty");
                return null;
            }
            if (pBEKeySpec instanceof C13905l) {
                int digestCode = getDigestCode(((C13905l) pBEKeySpec).f27206l.f20787l);
                int keyLength = pBEKeySpec.getKeyLength();
                return new BCPBEKey(this.algName, this.algOid, this.scheme, digestCode, keyLength, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, digestCode, keyLength));
            }
            int i = this.defaultDigest;
            int keyLength2 = pBEKeySpec.getKeyLength();
            return new BCPBEKey(this.algName, this.algOid, this.scheme, i, keyLength2, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, i, keyLength2));
        }

        public BasePBKDF2(String str, int i) {
            this(str, i, 1);
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        C16770l params;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.params.remoteconfig("DER");
            } catch (IOException e) {
                C18725l.purchase(e, "Oooops! ");
                return null;
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C17132l.startapp("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
            } else {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.params = new C16770l(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount(), 0, null);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "PBKDF2 Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new PBEParameterSpec(this.params.tapsense(), this.params.f32782l.appmetrica().intValue());
            }
            C17132l.startapp("unknown parameter spec passed to PBKDF2 PBE parameters object.");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            this.params = C16770l.vip(Ccase.advert(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                engineInit(bArr);
            } else {
                C18262l.metrica("Unknown parameters format in PBKDF2 parameters object");
            }
        }
    }
}
