package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC12994l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.C0655l;
import defpackage.C0709l;
import defpackage.C17711l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2657l;
import defpackage.C2854l;
import defpackage.C3077l;
import defpackage.C3677l;
import defpackage.C4871l;
import defpackage.C5153l;
import defpackage.C5880l;
import defpackage.C6114l;
import defpackage.C6630l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.C9102l;
import defpackage.InterfaceC11004l;
import defpackage.InterfaceC12575l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class GMCipherSpi extends CipherSpi {
    private C6630l engine;
    private AbstractC8831l key;
    private SecureRandom random;
    private final InterfaceC12575l helper = new C7633l();
    private int state = -1;
    private ErasableOutputStream buffer = new ErasableOutputStream();

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new C6630l(new C0709l()));
        }
    }

    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new C6630l(new C3677l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)));
        }
    }

    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new C6630l(new C2854l(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new C6630l(new C3077l()));
        }
    }

    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new C6630l(new C4871l()));
        }
    }

    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new C6630l(new C0655l()));
        }
    }

    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new C6630l(new C9102l()));
        }
    }

    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new C6630l(new C2657l()));
        }
    }

    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new C6630l(new C5153l()));
        }
    }

    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new C6630l(new C17711l()));
        }
    }

    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new C6630l(new C5880l()));
        }
    }

    public GMCipherSpi(C6630l c6630l) {
        this.engine = c6630l;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrAmazon;
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        try {
            int i3 = this.state;
            if (i3 == 1 || i3 == 3) {
                try {
                    this.engine.loadAd(true, new C6114l(this.key, this.random));
                    bArrAmazon = this.engine.amazon(this.buffer.size(), this.buffer.getBuf());
                } catch (Exception e) {
                    throw new BadBlockException("unable to process block", e);
                }
            } else {
                if (i3 != 2 && i3 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                try {
                    this.engine.loadAd(false, this.key);
                    bArrAmazon = this.engine.amazon(this.buffer.size(), this.buffer.getBuf());
                } catch (Exception e2) {
                    throw new BadBlockException("unable to process block", e2);
                }
            }
            this.buffer.erase();
            return bArrAmazon;
        } catch (Throwable th) {
            this.buffer.erase();
            throw th;
        }
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
        if (key instanceof InterfaceC11004l) {
            return ((InterfaceC11004l) key).getParameters().f25097l.smaato();
        }
        C8339l.metrica("not an EC key");
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int i2 = this.state;
        if (i2 == 1 || i2 == 3) {
            C6630l c6630l = this.engine;
            return c6630l.yandex.getDigestSize() + (c6630l.purchase * 2) + 1 + i;
        }
        if (i2 != 2 && i2 != 4) {
            C8339l.smaato("cipher not initialised");
            return 0;
        }
        C6630l c6630l2 = this.engine;
        return c6630l2.yandex.getDigestSize() + (c6630l2.purchase * 2) + 1 + i;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException {
        AbstractC8831l abstractC8831lGeneratePublicKeyParameter;
        if (i == 1 || i == 3) {
            if (!(key instanceof PublicKey)) {
                C18073l.smaato("must be passed public EC key for encryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i != 2 && i != 4) {
            C18073l.smaato("must be passed EC key");
            return;
        } else {
            if (!(key instanceof PrivateKey)) {
                C18073l.smaato("must be passed private EC key for decryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = abstractC8831lGeneratePublicKeyParameter;
        if (secureRandom != null) {
            this.random = secureRandom;
        } else {
            this.random = AbstractC8776l.loadAd();
        }
        this.state = i;
        this.buffer.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        if (AbstractC9008l.mopub(str).equals("NONE")) {
            return;
        }
        C8339l.metrica("can't support mode ".concat(str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!AbstractC9008l.mopub(str).equals("NOPADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        this.buffer.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            C18262l.startapp(e.getMessage(), "cannot handle supplied parameter spec: ");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters != null) {
            throw new InvalidAlgorithmParameterException("cannot recognise parameters: ".concat(algorithmParameters.getClass().getName()));
        }
        engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }
}
