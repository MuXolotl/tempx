package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import defpackage.AbstractC8831l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18567l;
import defpackage.C18595l;
import defpackage.C18725l;
import defpackage.C6114l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC11004l;
import defpackage.InterfaceC11795l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC18049l;
import defpackage.InterfaceC3016l;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi implements InterfaceC0543l, InterfaceC18049l {
    private InterfaceC16922l digest = new C18567l();
    private InterfaceC11795l signer = new C18595l(18, false);

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECGOST3410PublicKey ? ((BCECGOST3410PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        AbstractC8831l abstractC8831lGeneratePrivateKeyParameter = privateKey instanceof InterfaceC11004l ? ECUtil.generatePrivateKeyParameter(privateKey) : GOST3410Util.generatePrivateKeyParameter(privateKey);
        this.digest.reset();
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        InterfaceC11795l interfaceC11795l = this.signer;
        if (secureRandom != null) {
            interfaceC11795l.init(true, new C6114l(abstractC8831lGeneratePrivateKeyParameter, secureRandom));
        } else {
            interfaceC11795l.init(true, abstractC8831lGeneratePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AbstractC8831l abstractC8831lGeneratePublicKeyParameter;
        if (publicKey instanceof InterfaceC0885l) {
            abstractC8831lGeneratePublicKeyParameter = generatePublicKeyParameter(publicKey);
        } else if (publicKey instanceof InterfaceC3016l) {
            abstractC8831lGeneratePublicKeyParameter = GOST3410Util.generatePublicKeyParameter(publicKey);
        } else {
            try {
                abstractC8831lGeneratePublicKeyParameter = ECUtil.generatePublicKeyParameter(BouncyCastleProvider.getPublicKey(C17029l.vip(publicKey.getEncoded())));
            } catch (Exception unused) {
                C18073l.smaato("can't recognise key type in DSA based signer");
                return;
            }
        }
        this.digest.reset();
        this.signer.init(false, abstractC8831lGeneratePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[64];
            BigInteger[] bigIntegerArrCrashlytics = this.signer.crashlytics(bArr);
            byte[] byteArray = bigIntegerArrCrashlytics[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrCrashlytics[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, 32 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, 32 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, 64 - byteArray.length, byteArray.length);
                return bArr2;
            }
            System.arraycopy(byteArray, 1, bArr2, 64 - (byteArray.length - 1), byteArray.length - 1);
            return bArr2;
        } catch (Exception e) {
            C18725l.mopub(e);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            System.arraycopy(bArr, 32, bArr3, 0, 32);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.signer.admob(bigIntegerArr[0], bigIntegerArr[1], bArr2);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
}
