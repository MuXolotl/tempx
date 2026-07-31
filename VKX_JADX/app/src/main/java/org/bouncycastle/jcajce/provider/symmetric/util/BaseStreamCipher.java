package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC15560l;
import defpackage.AbstractC8776l;
import defpackage.C0272l;
import defpackage.C10314l;
import defpackage.C10754l;
import defpackage.C13886l;
import defpackage.C16023l;
import defpackage.C18073l;
import defpackage.C8339l;
import defpackage.InterfaceC12774l;
import defpackage.InterfaceC9719l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class BaseStreamCipher extends BaseWrapCipher implements PBE {
    private Class[] availableSpecs;
    private InterfaceC12774l cipher;
    private int digest;
    private int ivLength;
    private C0272l ivParam;
    private int keySizeInBits;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    public BaseStreamCipher(InterfaceC12774l interfaceC12774l, int i, int i2, int i3) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.cipher = interfaceC12774l;
        this.ivLength = i;
        this.keySizeInBits = i2;
        this.digest = i3;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        int i4;
        if (i3 + i2 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            i4 = i2;
            this.cipher.processBytes(bArr, i, i4, bArr2, i3);
        } else {
            i4 = i2;
        }
        this.cipher.reset();
        return i4;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        C0272l c0272l = this.ivParam;
        if (c0272l != null) {
            return c0272l.f1273l;
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    algorithmParametersCreateParametersInstance.init(this.pbeSpec);
                    return algorithmParametersCreateParametersInstance;
                } catch (Exception unused) {
                    return null;
                }
            }
            if (this.ivParam != null) {
                String algorithmName = this.cipher.getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                if (algorithmName.startsWith("ChaCha7539")) {
                    algorithmName = "ChaCha7539";
                } else if (algorithmName.startsWith("Grain")) {
                    algorithmName = "Grainv1";
                } else if (algorithmName.startsWith("HC")) {
                    int iIndexOf = algorithmName.indexOf(45);
                    algorithmName = algorithmName.substring(0, iIndexOf).concat(algorithmName.substring(iIndexOf + 1));
                }
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance2 = createParametersInstance(algorithmName);
                    this.engineParams = algorithmParametersCreateParametersInstance2;
                    algorithmParametersCreateParametersInstance2.init(new IvParameterSpec(this.ivParam.f1273l));
                } catch (Exception e) {
                    C10754l.Signature(e);
                    return null;
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        InterfaceC9719l interfaceC9719lMakePBEParameters;
        InterfaceC9719l c13886l;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Key for algorithm " + key.getAlgorithm() + " not suitable for symmetric enryption.");
        }
        if (key instanceof C16023l) {
            this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            interfaceC9719lMakePBEParameters = PBE.Util.makePBEParameters(((C16023l) key).getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
        } else {
            if (key instanceof BCPBEKey) {
                BCPBEKey bCPBEKey = (BCPBEKey) key;
                this.pbeAlgorithm = bCPBEKey.getOID() != null ? bCPBEKey.getOID().inmobi() : bCPBEKey.getAlgorithm();
                if (bCPBEKey.getParam() != null) {
                    c13886l = bCPBEKey.getParam();
                    this.pbeSpec = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    C18073l.pro("PBE requires PBE parameters to be set.");
                    return;
                } else {
                    InterfaceC9719l interfaceC9719lMakePBEParameters2 = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getAlgorithmName());
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                    c13886l = interfaceC9719lMakePBEParameters2;
                }
                if (bCPBEKey.getIvSize() != 0) {
                    this.ivParam = (C0272l) c13886l;
                }
            } else if (algorithmParameterSpec == null) {
                if (this.digest > 0) {
                    C18073l.smaato("Algorithm requires a PBE key");
                    return;
                }
                c13886l = new C13886l(key.getEncoded());
            } else if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                C18073l.pro("unknown parameter type.");
                return;
            } else {
                C0272l c0272l = new C0272l(new C13886l(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = c0272l;
                interfaceC9719lMakePBEParameters = c0272l;
            }
            interfaceC9719lMakePBEParameters = c13886l;
        }
        if (this.ivLength != 0 && !(interfaceC9719lMakePBEParameters instanceof C0272l)) {
            if (secureRandom == null) {
                secureRandom = AbstractC8776l.loadAd();
            }
            if (i != 1 && i != 3) {
                C18073l.pro("no IV set when one expected");
                return;
            }
            int i2 = this.ivLength;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            C0272l c0272l2 = new C0272l(interfaceC9719lMakePBEParameters, bArr, 0, i2);
            this.ivParam = c0272l2;
            interfaceC9719lMakePBEParameters = c0272l2;
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new InvalidParameterException("unknown opmode " + i + " passed");
                        }
                    }
                }
                this.cipher.init(false, interfaceC9719lMakePBEParameters);
                return;
            }
            this.cipher.init(true, interfaceC9719lMakePBEParameters);
        } catch (Exception e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!str.equalsIgnoreCase("ECB") && !str.equals("NONE")) {
            throw new NoSuchAlgorithmException("can't support mode ".concat(str));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!str.equalsIgnoreCase("NoPadding")) {
            throw new NoSuchPaddingException(AbstractC15560l.Signature("Padding ", str, " unknown."));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            return i2;
        } catch (C10314l e) {
            C8339l.smaato(e.getMessage());
            return 0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            this.cipher.reset();
            return new byte[0];
        }
        byte[] bArrEngineUpdate = engineUpdate(bArr, i, i2);
        this.cipher.reset();
        return bArrEngineUpdate;
    }

    public BaseStreamCipher(InterfaceC12774l interfaceC12774l, int i, int i2) {
        this(interfaceC12774l, i, i2, -1);
    }

    public BaseStreamCipher(InterfaceC12774l interfaceC12774l, int i) {
        this(interfaceC12774l, i, -1, -1);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpecExtractSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpecExtractSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpecExtractSpec == null) {
                C8339l.remoteconfig(algorithmParameters);
                return;
            }
        } else {
            algorithmParameterSpecExtractSpec = null;
        }
        engineInit(i, key, algorithmParameterSpecExtractSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }
}
