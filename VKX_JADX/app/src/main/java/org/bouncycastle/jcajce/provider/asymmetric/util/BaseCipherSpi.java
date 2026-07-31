package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.C10352l;
import defpackage.C18073l;
import defpackage.C2756l;
import defpackage.C7633l;
import defpackage.InterfaceC12184l;
import defpackage.InterfaceC12575l;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseCipherSpi extends CipherSpi {
    private byte[] iv;
    private int ivSize;
    private Class[] availableSpecs = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private final InterfaceC12575l helper = new C7633l();
    protected AlgorithmParameters engineParams = null;
    protected InterfaceC12184l wrapEngine = null;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.advert(str);
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
        return key.getEncoded().length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
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
            } catch (NoSuchAlgorithmException e) {
                throw new InvalidKeyException("Unknown key type " + e.getMessage());
            } catch (NoSuchProviderException e2) {
                throw new InvalidKeyException("Unknown key type " + e2.getMessage());
            } catch (InvalidKeySpecException e3) {
                throw new InvalidKeyException("Unknown key type " + e3.getMessage());
            }
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException("unable to unwrap") { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.1
                @Override // java.lang.Throwable
                public synchronized Throwable getCause() {
                    return e4;
                }
            };
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        } catch (C10352l e6) {
            throw new InvalidKeyException(e6.getMessage());
        }
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
}
