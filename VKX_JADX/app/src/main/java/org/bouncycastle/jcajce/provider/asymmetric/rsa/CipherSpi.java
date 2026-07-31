package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC15560l;
import defpackage.AbstractC17826l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC9008l;
import defpackage.C10352l;
import defpackage.C10754l;
import defpackage.C13904l;
import defpackage.C16162l;
import defpackage.C18073l;
import defpackage.C1939l;
import defpackage.C6114l;
import defpackage.C6963l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC5788l;
import defpackage.InterfaceC9719l;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

/* JADX INFO: loaded from: classes3.dex */
public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut;
    private InterfaceC5788l cipher;
    private AlgorithmParameters engineParams;
    private final InterfaceC12575l helper;
    private InterfaceC9719l param;
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly;
    private boolean publicKeyOnly;
    private AbstractC17826l tlsRsaSpec;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super(new C1939l(new C16162l()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new C16162l());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new CustomPKCS1Encoding(new C16162l()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new CustomPKCS1Encoding(new C16162l()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new CustomPKCS1Encoding(new C16162l()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.helper = new C7633l();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.param = null;
        try {
            initFromSpec(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            C8339l.metrica(e.getMessage());
            throw null;
        }
    }

    private int getInputLimit() {
        InterfaceC5788l interfaceC5788l = this.cipher;
        return interfaceC5788l instanceof C16162l ? ((C16162l) interfaceC5788l).f31656l.subs() + 1 : interfaceC5788l.getInputBlockSize();
    }

    private byte[] getOutput() {
        try {
            try {
                byte[] bArrProcessBlock = this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
                if (bArrProcessBlock == null) {
                    throw new BadBlockException("unable to decrypt block", null);
                }
                this.bOut.erase();
                return bArrProcessBlock;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new BadBlockException("unable to decrypt block", e);
            } catch (C10352l e2) {
                throw new BadBlockException("unable to decrypt block", e2);
            }
        } catch (Throwable th) {
            this.bOut.erase();
            throw th;
        }
    }

    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        InterfaceC16922l digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.cipher = new C13904l(new C16162l(), digest, digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.paramSpec = oAEPParameterSpec;
        } else {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException, ShortBufferException {
        if (i3 > bArr2.length - engineGetOutputSize(bArr == null ? 0 : i2)) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        try {
            return this.cipher.getInputBlockSize();
        } catch (NullPointerException unused) {
            C8339l.smaato("RSA Cipher not initialised");
            return 0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        C8339l.metrica("not an RSA key!");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        try {
            return this.cipher.getOutputBlockSize();
        } catch (NullPointerException unused) {
            C8339l.smaato("RSA Cipher not initialised");
            return 0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters algorithmParametersAdvert = this.helper.advert("OAEP");
                this.engineParams = algorithmParametersAdvert;
                algorithmParametersAdvert.init(this.paramSpec);
            } catch (Exception e) {
                C10754l.Signature(e);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C6963l c6963lGeneratePrivateKeyParameter;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        if (key instanceof RSAPublicKey) {
            if (this.privateKeyOnly && i == 1) {
                C18073l.smaato("mode 1 requires RSAPrivateKey");
                return;
            }
            c6963lGeneratePrivateKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) key);
        } else if (!(key instanceof RSAPrivateKey)) {
            C18073l.smaato("unknown key type passed to RSA");
            return;
        } else {
            if (this.publicKeyOnly && i == 1) {
                C18073l.smaato("mode 2 requires RSAPublicKey");
                return;
            }
            c6963lGeneratePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) key);
        }
        this.param = c6963lGeneratePrivateKeyParameter;
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.paramSpec = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(InterfaceC0543l.f1864class.inmobi())) {
                C18073l.pro("unknown mask generation function specified");
                return;
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                C18073l.pro("unkown MGF parameters");
                return;
            }
            InterfaceC16922l digest = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            InterfaceC16922l digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.cipher = new C13904l(new C16162l(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        }
        InterfaceC9719l interfaceC9719l = this.param;
        this.param = secureRandom != null ? new C6114l(interfaceC9719l, secureRandom) : new C6114l(interfaceC9719l, AbstractC8776l.loadAd());
        this.bOut.reset();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException(AbstractC15560l.tapsense("unknown opmode ", i, " passed to RSA"));
                    }
                }
            }
            this.cipher.init(false, this.param);
            return;
        }
        this.cipher.init(true, this.param);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String strMopub = AbstractC9008l.mopub(str);
        if (strMopub.equals("NONE") || strMopub.equals("ECB")) {
            return;
        }
        if (strMopub.equals("1")) {
            this.privateKeyOnly = true;
            this.publicKeyOnly = false;
        } else {
            if (!strMopub.equals("2")) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(str));
            }
            this.privateKeyOnly = false;
            this.publicKeyOnly = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String strMopub = AbstractC9008l.mopub(str);
        if (strMopub.equals("NOPADDING")) {
            this.cipher = new C16162l();
            return;
        }
        if (strMopub.equals("PKCS1PADDING")) {
            this.cipher = new CustomPKCS1Encoding(new C16162l());
            return;
        }
        if (strMopub.equals("ISO9796-1PADDING")) {
            this.cipher = new C1939l(new C16162l());
            return;
        }
        if (strMopub.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPPADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strMopub.equals("OAEPWITHSHA1ANDMGF1PADDING") || strMopub.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strMopub.equals("OAEPWITHSHA224ANDMGF1PADDING") || strMopub.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA256ANDMGF1PADDING") || strMopub.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA384ANDMGF1PADDING") || strMopub.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA512ANDMGF1PADDING") || strMopub.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (strMopub.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else {
            if (!strMopub.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                throw new NoSuchPaddingException(str.concat(" unavailable with RSA."));
            }
            initFromSpec(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > getInputLimit() - this.bOut.size()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        this.bOut.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        engineUpdate(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            engineUpdate(bArr, i, i2);
        }
        return getOutput();
    }

    public CipherSpi(InterfaceC5788l interfaceC5788l) {
        this.helper = new C7633l();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.param = null;
        this.cipher = interfaceC5788l;
    }

    public CipherSpi(boolean z, boolean z2, InterfaceC5788l interfaceC5788l) {
        this.helper = new C7633l();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.param = null;
        this.publicKeyOnly = z;
        this.privateKeyOnly = z2;
        this.cipher = interfaceC5788l;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Eeeek! " + e.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString(), e);
            }
        } else {
            parameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }
}
