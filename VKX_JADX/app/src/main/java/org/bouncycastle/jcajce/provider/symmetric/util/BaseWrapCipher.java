package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC0653l;
import defpackage.AbstractC1176l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.C0272l;
import defpackage.C10352l;
import defpackage.C10754l;
import defpackage.C13886l;
import defpackage.C18073l;
import defpackage.C2756l;
import defpackage.C6114l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.InterfaceC12184l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC9719l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final InterfaceC12575l helper;
    private byte[] iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected InterfaceC12184l wrapEngine;
    private ErasableOutputStream wrapStream;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        public InvalidKeyOrParametersException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public BaseWrapCipher(int i, InterfaceC12184l interfaceC12184l, int i2) {
        this.availableSpecs = new Class[]{AbstractC1176l.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new C7633l();
        this.pbeKeySize = i;
        this.wrapEngine = interfaceC12184l;
        this.ivSize = i2;
    }

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.advert(str);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        byte[] bArrWrap;
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream == null) {
            C8339l.smaato("not supported in a wrapping mode");
            return 0;
        }
        erasableOutputStream.write(bArr, i, i2);
        try {
            boolean z = this.forWrapping;
            InterfaceC12184l interfaceC12184l = this.wrapEngine;
            if (z) {
                try {
                    bArrWrap = interfaceC12184l.wrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                } catch (Exception e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                }
            } else {
                try {
                    bArrWrap = interfaceC12184l.unwrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                } catch (C10352l e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            }
            if (bArrWrap.length + i3 > bArr2.length) {
                throw new ShortBufferException("output buffer too short for input.");
            }
            System.arraycopy(bArrWrap, 0, bArr2, i3, bArrWrap.length);
            int length = bArrWrap.length;
            this.wrapStream.erase();
            return length;
        } catch (Throwable th) {
            this.wrapStream.erase();
            throw th;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return AbstractC14024l.crashlytics(this.iv);
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.iv != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = algorithmParametersCreateParametersInstance;
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(this.iv));
            } catch (Exception e) {
                C10754l.Signature(e);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyOrParametersException, InvalidAlgorithmParameterException {
        InterfaceC9719l c13886l;
        int i2;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                c13886l = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else {
                if (bCPBEKey.getParam() == null) {
                    C18073l.pro("PBE requires PBE parameters to be set.");
                    return;
                }
                c13886l = bCPBEKey.getParam();
            }
        } else {
            c13886l = new C13886l(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.iv = iv;
            c13886l = new C0272l(c13886l, iv);
        }
        if ((c13886l instanceof C13886l) && (i2 = this.ivSize) != 0 && (i == 3 || i == 1)) {
            byte[] bArr = new byte[i2];
            this.iv = bArr;
            secureRandom.nextBytes(bArr);
            c13886l = new C0272l(c13886l, this.iv);
        }
        if (secureRandom != null) {
            c13886l = new C6114l(c13886l, secureRandom);
        }
        try {
            if (i != 1) {
                if (i == 2) {
                    this.wrapEngine.init(false, c13886l);
                    this.wrapStream = new ErasableOutputStream();
                } else if (i == 3) {
                    this.wrapEngine.init(true, c13886l);
                    this.wrapStream = null;
                } else {
                    if (i != 4) {
                        throw new InvalidParameterException("Unknown mode parameter passed to init.");
                    }
                    this.wrapEngine.init(false, c13886l);
                    this.wrapStream = null;
                }
                this.forWrapping = false;
                return;
            }
            this.wrapEngine.init(true, c13886l);
            this.wrapStream = new ErasableOutputStream();
            this.forWrapping = true;
        } catch (Exception e) {
            throw new InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(AbstractC14814l.startapp("can't support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(AbstractC15560l.Signature("Padding ", str, " unknown."));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        try {
            InterfaceC12184l interfaceC12184l = this.wrapEngine;
            byte[] bArrEngineDoFinal = interfaceC12184l == null ? engineDoFinal(bArr, 0, bArr.length) : interfaceC12184l.unwrap(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            if (str.equals("") && i == 2) {
                try {
                    C2756l c2756lVip = C2756l.vip(bArrEngineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(c2756lVip);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + c2756lVip.f5961l.f20787l + " not supported");
                } catch (Exception unused) {
                    C18073l.smaato("Invalid key encoding.");
                    return null;
                }
            }
            try {
                KeyFactory keyFactoryPremium = this.helper.premium(str);
                if (i == 1) {
                    return keyFactoryPremium.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                }
                if (i == 2) {
                    return keyFactoryPremium.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                throw new InvalidKeyException(AbstractC0653l.vip(i, "Unknown key type "));
            } catch (NoSuchProviderException e) {
                throw new InvalidKeyException("Unknown key type " + e.getMessage());
            } catch (InvalidKeySpecException e2) {
                throw new InvalidKeyException("Unknown key type " + e2.getMessage());
            }
        } catch (BadPaddingException e3) {
            throw new InvalidKeyException(e3.getMessage());
        } catch (IllegalBlockSizeException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (C10352l e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i, i2);
            return 0;
        }
        C8339l.smaato("not supported in a wrapping mode");
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            C18073l.smaato("Cannot wrap key, null encoding.");
            return null;
        }
        try {
            InterfaceC12184l interfaceC12184l = this.wrapEngine;
            return interfaceC12184l == null ? engineDoFinal(encoded, 0, encoded.length) : interfaceC12184l.wrap(encoded, 0, encoded.length);
        } catch (BadPaddingException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i, i2);
            return null;
        }
        C8339l.smaato("not supported in a wrapping mode");
        return null;
    }

    public BaseWrapCipher(int i, InterfaceC12184l interfaceC12184l) {
        this(i, interfaceC12184l, 0);
    }

    public BaseWrapCipher() {
        this.availableSpecs = new Class[]{AbstractC1176l.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new C7633l();
    }

    public BaseWrapCipher(InterfaceC12184l interfaceC12184l) {
        this(interfaceC12184l, 0);
    }

    public BaseWrapCipher(InterfaceC12184l interfaceC12184l, int i) {
        this.availableSpecs = new Class[]{AbstractC1176l.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new C7633l();
        this.wrapEngine = interfaceC12184l;
        this.ivSize = i;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrUnwrap;
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream == null) {
            C8339l.smaato("not supported in a wrapping mode");
            return null;
        }
        if (bArr != null) {
            erasableOutputStream.write(bArr, i, i2);
        }
        try {
            boolean z = this.forWrapping;
            InterfaceC12184l interfaceC12184l = this.wrapEngine;
            if (z) {
                try {
                    bArrUnwrap = interfaceC12184l.wrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                } catch (Exception e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                }
            } else {
                try {
                    bArrUnwrap = interfaceC12184l.unwrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                } catch (C10352l e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            }
            this.wrapStream.erase();
            return bArrUnwrap;
        } catch (Throwable th) {
            this.wrapStream.erase();
            throw th;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyOrParametersException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyOrParametersException, InvalidAlgorithmParameterException {
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
        this.engineParams = algorithmParameters;
        engineInit(i, key, algorithmParameterSpecExtractSpec, secureRandom);
    }
}
