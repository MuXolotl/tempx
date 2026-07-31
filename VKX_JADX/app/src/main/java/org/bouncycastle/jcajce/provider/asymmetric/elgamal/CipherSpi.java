package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import defpackage.AbstractC15560l;
import defpackage.AbstractC9008l;
import defpackage.C10352l;
import defpackage.C10754l;
import defpackage.C13904l;
import defpackage.C18073l;
import defpackage.C1939l;
import defpackage.C3558l;
import defpackage.C6114l;
import defpackage.C8339l;
import defpackage.C9218l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC17495l;
import defpackage.InterfaceC5788l;
import defpackage.InterfaceC9719l;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

/* JADX INFO: loaded from: classes3.dex */
public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut = new BaseCipherSpi.ErasableOutputStream();
    private InterfaceC5788l cipher;
    private AlgorithmParameters engineParams;
    private AlgorithmParameterSpec paramSpec;

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new C9218l());
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new C3558l(new C9218l()));
        }
    }

    public CipherSpi(InterfaceC5788l interfaceC5788l) {
        this.cipher = interfaceC5788l;
    }

    private byte[] getOutput() {
        try {
            try {
                byte[] bArrProcessBlock = this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
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
            this.cipher = new C13904l(new C9218l(), digest, digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.paramSpec = oAEPParameterSpec;
        } else {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (bArr != null) {
            this.bOut.write(bArr, i, i2);
        }
        boolean z = this.cipher instanceof C9218l;
        BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.bOut;
        if (z) {
            if (erasableOutputStream.size() > this.cipher.getInputBlockSize() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (erasableOutputStream.size() > this.cipher.getInputBlockSize()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        byte[] output = getOutput();
        for (int i4 = 0; i4 != output.length; i4++) {
            bArr2[i3 + i4] = output[i4];
        }
        return output.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.cipher.getInputBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof InterfaceC17495l) {
            return ((InterfaceC17495l) key).getParameters().f27407l.bitLength();
        }
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        C8339l.metrica("not an ElGamal key!");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return this.cipher.getOutputBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("OAEP");
                this.engineParams = algorithmParametersCreateParametersInstance;
                algorithmParametersCreateParametersInstance.init(this.paramSpec);
            } catch (Exception e) {
                C10754l.Signature(e);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        InterfaceC9719l interfaceC9719lGeneratePrivateKeyParameter;
        if (key instanceof DHPublicKey) {
            interfaceC9719lGeneratePrivateKeyParameter = ElGamalUtil.generatePublicKeyParameter((PublicKey) key);
        } else {
            if (!(key instanceof DHPrivateKey)) {
                C18073l.smaato("unknown key type passed to ElGamal");
                return;
            }
            interfaceC9719lGeneratePrivateKeyParameter = ElGamalUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
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
            this.cipher = new C13904l(new C9218l(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        } else if (algorithmParameterSpec != null) {
            C18073l.pro("unknown parameter type.");
            return;
        }
        if (secureRandom != null) {
            interfaceC9719lGeneratePrivateKeyParameter = new C6114l(interfaceC9719lGeneratePrivateKeyParameter, secureRandom);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException(AbstractC15560l.tapsense("unknown opmode ", i, " passed to ElGamal"));
                    }
                }
            }
            this.cipher.init(false, interfaceC9719lGeneratePrivateKeyParameter);
            return;
        }
        this.cipher.init(true, interfaceC9719lGeneratePrivateKeyParameter);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String strMopub = AbstractC9008l.mopub(str);
        if (!strMopub.equals("NONE") && !strMopub.equals("ECB")) {
            throw new NoSuchAlgorithmException("can't support mode ".concat(str));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String strMopub = AbstractC9008l.mopub(str);
        if (strMopub.equals("NOPADDING")) {
            this.cipher = new C9218l();
            return;
        }
        if (strMopub.equals("PKCS1PADDING")) {
            this.cipher = new C3558l(new C9218l());
            return;
        }
        if (strMopub.equals("ISO9796-1PADDING")) {
            this.cipher = new C1939l(new C9218l());
            return;
        }
        if (strMopub.equals("OAEPPADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strMopub.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA1ANDMGF1PADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strMopub.equals("OAEPWITHSHA224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strMopub.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
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
                throw new NoSuchPaddingException(str.concat(" unavailable with ElGamal."));
            }
            initFromSpec(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        this.bOut.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        this.bOut.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            this.bOut.write(bArr, i, i2);
        }
        boolean z = this.cipher instanceof C9218l;
        BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.bOut;
        if (z) {
            if (erasableOutputStream.size() > this.cipher.getInputBlockSize() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (erasableOutputStream.size() > this.cipher.getInputBlockSize()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        return getOutput();
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
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
    }
}
