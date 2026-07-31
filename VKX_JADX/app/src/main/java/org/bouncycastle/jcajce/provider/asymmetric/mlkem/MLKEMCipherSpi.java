package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.C10198l;
import defpackage.C10352l;
import defpackage.C10548l;
import defpackage.C11467l;
import defpackage.C13409l;
import defpackage.C13568l;
import defpackage.C17837l;
import defpackage.C18073l;
import defpackage.C18493l;
import defpackage.C4249l;
import defpackage.C7610l;
import defpackage.C8339l;
import defpackage.InterfaceC12184l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC8134l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.jcajce.provider.asymmetric.util.WrapUtil;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private C10548l kemGen;
    private C17837l kemParameterSpec;
    private final C18493l mlkemParameters;
    private BCMLKEMPrivateKey unwrapKey;
    private BCMLKEMPublicKey wrapKey;

    public static class Base extends MLKEMCipherSpi {
        public Base() {
            super("MLKEM");
        }
    }

    public static class MLKEM1024 extends MLKEMCipherSpi {
        public MLKEM1024() {
            super(C18493l.f36120l);
        }
    }

    public static class MLKEM512 extends MLKEMCipherSpi {
        public MLKEM512() {
            super(C18493l.f36119l);
        }
    }

    public static class MLKEM768 extends MLKEMCipherSpi {
        public MLKEM768() {
            super(C18493l.f36121l);
        }
    }

    public MLKEMCipherSpi(C18493l c18493l) {
        this.mlkemParameters = c18493l;
        this.algorithmName = c18493l.f36123l;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 2048;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e) {
                throw new IllegalStateException(e.toString(), e);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            this.kemParameterSpec = new C17837l(new C10198l(InterfaceC15427l.f30178l, new C10198l(InterfaceC8134l.yandex)), new byte[0]);
        } else {
            if (!(algorithmParameterSpec instanceof C17837l)) {
                throw new InvalidAlgorithmParameterException(AbstractC0653l.ads(new StringBuilder(), this.algorithmName, " can only accept KTSParameterSpec"));
            }
            this.kemParameterSpec = (C17837l) algorithmParameterSpec;
        }
        if (i == 3) {
            if (!(key instanceof BCMLKEMPublicKey)) {
                throw new InvalidKeyException(AbstractC0653l.ads(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCMLKEMPublicKey) key;
            this.kemGen = new C10548l(secureRandom);
        } else if (i != 4) {
            C11467l.license("Cipher only valid for wrapping/unwrapping");
            return;
        } else {
            if (!(key instanceof BCMLKEMPrivateKey)) {
                throw new InvalidKeyException(AbstractC0653l.ads(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
            }
            this.unwrapKey = (BCMLKEMPrivateKey) key;
        }
        C18493l c18493l = this.mlkemParameters;
        if (c18493l != null) {
            String str = C7610l.yandex(c18493l.f36123l).f15658l;
            if (!str.equals(key.getAlgorithm())) {
                throw new InvalidKeyException("cipher locked to ".concat(str));
            }
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(AbstractC14814l.startapp("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(AbstractC15560l.Signature("Padding ", str, " unknown"));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        byte[] bArrRemoteconfig = null;
        try {
            if (i != 3) {
                C18073l.smaato("only SECRET_KEY supported");
                return null;
            }
            try {
                C13568l c13568l = new C13568l(this.unwrapKey.getKeyParams());
                C13409l c13409l = (C13409l) c13568l.f26580l;
                bArrRemoteconfig = c13568l.remoteconfig(AbstractC14024l.vip(0, c13409l.isPro, bArr));
                InterfaceC12184l keyUnwrapper = WrapUtil.getKeyUnwrapper(this.kemParameterSpec, bArrRemoteconfig);
                byte[] bArrVip = AbstractC14024l.vip(c13409l.isPro, bArr.length, bArr);
                SecretKeySpec secretKeySpec = new SecretKeySpec(keyUnwrapper.unwrap(bArrVip, 0, bArrVip.length), str);
                Arrays.fill(bArrRemoteconfig, (byte) 0);
                return secretKeySpec;
            } catch (IllegalArgumentException e) {
                throw new NoSuchAlgorithmException("unable to extract KTS secret: " + e.getMessage());
            } catch (C10352l e2) {
                throw new InvalidKeyException("unable to extract KTS secret: " + e2.getMessage());
            }
        } catch (Throwable th) {
            AbstractC14024l.loadAd(bArrRemoteconfig);
            throw th;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws Throwable {
        C4249l c4249l = null;
        byte[] bArr = null;
        c4249l = null;
        if (key.getEncoded() == null) {
            C18073l.smaato("Cannot wrap key, null encoding.");
            return null;
        }
        try {
            try {
                C4249l c4249lYandex = this.kemGen.yandex(this.wrapKey.getKeyParams());
                try {
                    C17837l c17837l = this.kemParameterSpec;
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c4249lYandex.f8721l);
                    if (c4249lYandex.f8722l.get()) {
                        C8339l.smaato("data has been destroyed");
                        bArrCrashlytics = null;
                    }
                    InterfaceC12184l keyWrapper = WrapUtil.getKeyWrapper(c17837l, bArrCrashlytics);
                    byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(c4249lYandex.f8720l);
                    if (c4249lYandex.f8722l.get()) {
                        C8339l.smaato("data has been destroyed");
                    } else {
                        bArr = bArrCrashlytics2;
                    }
                    byte[] encoded = key.getEncoded();
                    try {
                        byte[] bArrMopub = AbstractC14024l.mopub(bArr, keyWrapper.wrap(encoded, 0, encoded.length));
                        Arrays.fill(encoded, (byte) 0);
                        try {
                            c4249lYandex.destroy();
                        } catch (DestroyFailedException unused) {
                        }
                        return bArrMopub;
                    } catch (Throwable th) {
                        AbstractC14024l.loadAd(encoded);
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    c4249l = c4249lYandex;
                    throw new IllegalBlockSizeException("unable to generate KTS secret: " + e.getMessage());
                } catch (Throwable th2) {
                    th = th2;
                    c4249l = c4249lYandex;
                    if (c4249l != null) {
                        try {
                            c4249l.destroy();
                        } catch (DestroyFailedException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    public MLKEMCipherSpi(String str) {
        this.mlkemParameters = null;
        this.algorithmName = str;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(C17837l.class);
            } catch (Exception unused) {
                C8339l.remoteconfig(algorithmParameters);
                return;
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i, key, parameterSpec, secureRandom);
    }
}
