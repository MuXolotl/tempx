package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import defpackage.AbstractC2017l;
import defpackage.AbstractC8831l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C18715l;
import defpackage.C18725l;
import defpackage.C6114l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC11004l;
import defpackage.InterfaceC11795l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC18049l;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class ECGOST2012SignatureSpi512 extends SignatureSpi implements InterfaceC0543l, InterfaceC18049l {
    private int size = 128;
    private int halfSize = 64;
    private InterfaceC16922l digest = new C18715l();
    private InterfaceC11795l signer = new C18595l(18, false);

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
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
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof InterfaceC11004l)) {
            C18073l.smaato("cannot recognise key type in ECGOST-2012-512 signer");
            return;
        }
        AbstractC2017l abstractC2017l = (AbstractC2017l) ECUtil.generatePrivateKeyParameter(privateKey);
        if (abstractC2017l.f4542l.f16362l.bitLength() < 505) {
            C18073l.smaato("key too weak for ECGOST-2012-512");
            return;
        }
        this.digest.reset();
        SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
        InterfaceC11795l interfaceC11795l = this.signer;
        if (secureRandom != null) {
            interfaceC11795l.init(true, new C6114l(abstractC2017l, secureRandom));
        } else {
            interfaceC11795l.init(true, abstractC2017l);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AbstractC2017l abstractC2017l;
        if (publicKey instanceof InterfaceC0885l) {
            abstractC2017l = (AbstractC2017l) generatePublicKeyParameter(publicKey);
        } else {
            try {
                abstractC2017l = (AbstractC2017l) ECUtil.generatePublicKeyParameter(BouncyCastleProvider.getPublicKey(C17029l.vip(publicKey.getEncoded())));
            } catch (Exception unused) {
                C18073l.smaato("cannot recognise key type in ECGOST-2012-512 signer");
                return;
            }
        }
        if (abstractC2017l.f4542l.f16362l.bitLength() < 505) {
            C18073l.smaato("key too weak for ECGOST-2012-512");
        } else {
            this.digest.reset();
            this.signer.init(false, abstractC2017l);
        }
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
            byte[] bArr2 = new byte[this.size];
            BigInteger[] bigIntegerArrCrashlytics = this.signer.crashlytics(bArr);
            byte[] byteArray = bigIntegerArrCrashlytics[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrCrashlytics[1].toByteArray();
            byte b = byteArray2[0];
            int i = this.halfSize;
            if (b != 0) {
                System.arraycopy(byteArray2, 0, bArr2, i - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, i - (byteArray2.length - 1), byteArray2.length - 1);
            }
            byte b2 = byteArray[0];
            int i2 = this.size;
            if (b2 != 0) {
                System.arraycopy(byteArray, 0, bArr2, i2 - byteArray.length, byteArray.length);
                return bArr2;
            }
            System.arraycopy(byteArray, 1, bArr2, i2 - (byteArray.length - 1), byteArray.length - 1);
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
            int i = this.halfSize;
            byte[] bArr3 = new byte[i];
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr, 0, bArr4, 0, i);
            int i2 = this.halfSize;
            System.arraycopy(bArr, i2, bArr3, 0, i2);
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
