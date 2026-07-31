package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC8831l;
import defpackage.C11104l;
import defpackage.C11505l;
import defpackage.C11919l;
import defpackage.C1438l;
import defpackage.C18073l;
import defpackage.C18480l;
import defpackage.C6254l;
import defpackage.C9298l;
import defpackage.InterfaceC14091l;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private final String algorithm;
    private InterfaceC14091l signer;

    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super("Ed25519");
        }
    }

    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super("Ed448");
        }
    }

    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super(null);
        }
    }

    public SignatureSpi(String str) {
        this.algorithm = str;
    }

    private static AbstractC8831l getLwEdDSAKeyPrivate(PrivateKey privateKey) {
        return EdECUtil.generatePrivateKeyParameter(privateKey);
    }

    private static AbstractC8831l getLwEdDSAKeyPublic(PublicKey publicKey) {
        return EdECUtil.generatePublicKeyParameter(publicKey);
    }

    private InterfaceC14091l getSigner(String str) throws InvalidKeyException {
        String str2 = this.algorithm;
        if (str2 == null || str.equals(str2)) {
            return str.equals("Ed448") ? new C18480l(EMPTY_CONTEXT) : new C11919l((byte) 0, 2);
        }
        throw new InvalidKeyException("inappropriate key for " + this.algorithm);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        String str;
        AbstractC8831l lwEdDSAKeyPrivate = getLwEdDSAKeyPrivate(privateKey);
        if (lwEdDSAKeyPrivate instanceof C1438l) {
            str = "Ed25519";
        } else {
            if (!(lwEdDSAKeyPrivate instanceof C9298l)) {
                C18073l.smaato("unsupported private key type");
                return;
            }
            str = "Ed448";
        }
        this.signer = getSigner(str);
        this.signer.init(true, lwEdDSAKeyPrivate);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        String str;
        AbstractC8831l lwEdDSAKeyPublic = getLwEdDSAKeyPublic(publicKey);
        if (lwEdDSAKeyPublic instanceof C6254l) {
            str = "Ed25519";
        } else {
            if (!(lwEdDSAKeyPublic instanceof C11104l)) {
                C18073l.smaato("unsupported public key type");
                return;
            }
            str = "Ed448";
        }
        this.signer = getSigner(str);
        this.signer.init(false, lwEdDSAKeyPublic);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.crashlytics();
        } catch (C11505l e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.signer.update(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        return this.signer.loadAd(bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }
}
