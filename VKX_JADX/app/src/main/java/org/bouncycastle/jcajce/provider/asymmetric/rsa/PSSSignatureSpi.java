package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.C10754l;
import defpackage.C11505l;
import defpackage.C16162l;
import defpackage.C18073l;
import defpackage.C18153l;
import defpackage.C6114l;
import defpackage.C6963l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC5788l;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

/* JADX INFO: loaded from: classes3.dex */
public class PSSSignatureSpi extends SignatureSpi {
    private InterfaceC16922l contentDigest;
    private AlgorithmParameters engineParams;
    private final InterfaceC12575l helper;
    private boolean isInitState;
    private boolean isRaw;
    private C6963l key;
    private InterfaceC16922l mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private C18153l pss;
    private SecureRandom random;
    private int saltLength;
    private InterfaceC5788l signer;
    private byte trailer;

    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new C16162l(), null);
        }
    }

    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new C16162l(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA1withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA1", "SHAKE128", null, 20, 1));
        }
    }

    public static class SHA1withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA1", "SHAKE256", null, 20, 1));
        }
    }

    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    public static class SHA224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA-224", "SHAKE128", null, 28, 1));
        }
    }

    public static class SHA224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA-224", "SHAKE256", null, 28, 1));
        }
    }

    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA-256", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHA256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA-256", "SHAKE256", null, 32, 1));
        }
    }

    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    public static class SHA384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA-384", "SHAKE128", null, 48, 1));
        }
    }

    public static class SHA384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA-384", "SHAKE256", null, 48, 1));
        }
    }

    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    public static class SHA3_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA3-224", "SHAKE128", null, 28, 1));
        }
    }

    public static class SHA3_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA3-224", "SHAKE256", null, 28, 1));
        }
    }

    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    public static class SHA3_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA3-256", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHA3_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA3-256", "SHAKE256", null, 32, 1));
        }
    }

    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    public static class SHA3_384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA3-384", "SHAKE128", null, 48, 1));
        }
    }

    public static class SHA3_384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA3-384", "SHAKE256", null, 48, 1));
        }
    }

    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    public static class SHA3_512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA3-512", "SHAKE128", null, 64, 1));
        }
    }

    public static class SHA3_512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA3-512", "SHAKE256", null, 64, 1));
        }
    }

    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    public static class SHA512_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA-512(224)", "SHAKE128", null, 28, 1));
        }
    }

    public static class SHA512_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA-512(224)", "SHAKE256", null, 28, 1));
        }
    }

    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    public static class SHA512_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA-512(256)", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHA512_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA-512(256)", "SHAKE256", null, 32, 1));
        }
    }

    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new C16162l(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    public static class SHA512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE128() {
            super(new C16162l(), new PSSParameterSpec("SHA-512", "SHAKE128", null, 64, 1));
        }
    }

    public static class SHA512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE256() {
            super(new C16162l(), new PSSParameterSpec("SHA-512", "SHAKE256", null, 64, 1));
        }
    }

    public static class SHAKE128WithRSAPSS extends PSSSignatureSpi {
        public SHAKE128WithRSAPSS() {
            super(new C16162l(), new PSSParameterSpec("SHAKE128", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHAKE256WithRSAPSS extends PSSSignatureSpi {
        public SHAKE256WithRSAPSS() {
            super(new C16162l(), new PSSParameterSpec("SHAKE256", "SHAKE256", null, 64, 1));
        }
    }

    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new C16162l(), null, true);
        }
    }

    public PSSSignatureSpi(InterfaceC5788l interfaceC5788l, PSSParameterSpec pSSParameterSpec, boolean z) {
        this.helper = new C7633l();
        this.isInitState = true;
        this.signer = interfaceC5788l;
        this.originalSpec = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.paramSpec = PSSParameterSpec.DEFAULT;
        } else {
            this.paramSpec = pSSParameterSpec;
        }
        boolean zEquals = "MGF1".equals(this.paramSpec.getMGFAlgorithm());
        PSSParameterSpec pSSParameterSpec2 = this.paramSpec;
        this.mgfDigest = DigestFactory.getDigest(zEquals ? pSSParameterSpec2.getDigestAlgorithm() : pSSParameterSpec2.getMGFAlgorithm());
        this.saltLength = this.paramSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        this.isRaw = z;
        setupContentDigest();
    }

    private byte getTrailer(int i) {
        if (i == 1) {
            return (byte) -68;
        }
        C8339l.metrica("unknown trailer field");
        return (byte) 0;
    }

    private void setupContentDigest() {
        InterfaceC16922l digest = DigestFactory.getDigest(this.paramSpec.getDigestAlgorithm());
        this.contentDigest = digest;
        if (this.isRaw) {
            this.contentDigest = new NullPssDigest(digest);
        }
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters algorithmParametersAdvert = this.helper.advert("PSS");
                this.engineParams = algorithmParametersAdvert;
                algorithmParametersAdvert.init(this.paramSpec);
            } catch (Exception e) {
                C10754l.Signature(e);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            C18073l.smaato("Supplied key is not a RSAPrivateKey instance");
            return;
        }
        this.key = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
        C18153l c18153l = new C18153l(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
        this.pss = c18153l;
        SecureRandom secureRandom = this.random;
        C6963l c6963l = this.key;
        if (secureRandom != null) {
            c18153l.init(true, new C6114l(c6963l, secureRandom));
        } else {
            c18153l.init(true, c6963l);
        }
        this.isInitState = true;
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            C18073l.smaato("Supplied key is not a RSAPublicKey instance");
            return;
        }
        this.key = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
        C18153l c18153l = new C18153l(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
        this.pss = c18153l;
        c18153l.init(false, this.key);
        this.isInitState = true;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        String digestAlgorithm;
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            C18073l.pro("Only PSSParameterSpec supported");
            return;
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
        PSSParameterSpec pSSParameterSpec2 = this.originalSpec;
        if (pSSParameterSpec2 != null && !DigestFactory.isSameDigest(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("parameter must be using " + this.originalSpec.getDigestAlgorithm());
        }
        if (pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") || pSSParameterSpec.getMGFAlgorithm().equals(InterfaceC0543l.f1864class.inmobi())) {
            if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                C18073l.pro("unknown MGF parameters");
                return;
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (!DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                C18073l.pro("digest algorithm for MGF should be the same as for PSS parameters.");
                return;
            }
            digestAlgorithm = mGF1ParameterSpec.getDigestAlgorithm();
        } else {
            if (!pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") && !pSSParameterSpec.getMGFAlgorithm().equals("SHAKE256")) {
                C18073l.pro("unknown mask generation function specified");
                return;
            }
            digestAlgorithm = pSSParameterSpec.getMGFAlgorithm();
        }
        InterfaceC16922l digest = DigestFactory.getDigest(digestAlgorithm);
        if (digest == null) {
            throw new InvalidAlgorithmParameterException("no match on MGF algorithm: " + pSSParameterSpec.getMGFAlgorithm());
        }
        this.engineParams = null;
        this.paramSpec = pSSParameterSpec;
        this.mgfDigest = digest;
        this.saltLength = pSSParameterSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        setupContentDigest();
        if (this.key != null) {
            C18153l c18153l = new C18153l(this.signer, this.contentDigest, digest, this.saltLength, this.trailer);
            this.pss = c18153l;
            C6963l c6963l = this.key;
            if (c6963l.f18137l) {
                c18153l.init(true, c6963l);
            } else {
                c18153l.init(false, c6963l);
            }
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        this.isInitState = true;
        try {
            return this.pss.crashlytics();
        } catch (C11505l e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.pss.update(b);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        this.isInitState = true;
        return this.pss.loadAd(bArr);
    }

    public static class NullPssDigest implements InterfaceC16922l {
        private InterfaceC16922l baseDigest;
        private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        private boolean oddTime = true;

        public NullPssDigest(InterfaceC16922l interfaceC16922l) {
            this.baseDigest = interfaceC16922l;
        }

        @Override // defpackage.InterfaceC16922l
        public int doFinal(byte[] bArr, int i) {
            byte[] byteArray = this.bOut.toByteArray();
            if (this.oddTime) {
                System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
            } else {
                this.baseDigest.update(byteArray, 0, byteArray.length);
                this.baseDigest.doFinal(bArr, i);
            }
            reset();
            this.oddTime = !this.oddTime;
            return byteArray.length;
        }

        @Override // defpackage.InterfaceC16922l
        public String getAlgorithmName() {
            return "NULL";
        }

        public int getByteLength() {
            return 0;
        }

        @Override // defpackage.InterfaceC16922l
        public int getDigestSize() {
            return this.baseDigest.getDigestSize();
        }

        @Override // defpackage.InterfaceC16922l
        public void reset() {
            this.bOut.reset();
            this.baseDigest.reset();
        }

        @Override // defpackage.InterfaceC16922l
        public void update(byte b) {
            this.bOut.write(b);
        }

        @Override // defpackage.InterfaceC16922l
        public void update(byte[] bArr, int i, int i2) {
            this.bOut.write(bArr, i, i2);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.pss.update(bArr, i, i2);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    public PSSSignatureSpi(InterfaceC5788l interfaceC5788l, PSSParameterSpec pSSParameterSpec) {
        this(interfaceC5788l, pSSParameterSpec, false);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
}
