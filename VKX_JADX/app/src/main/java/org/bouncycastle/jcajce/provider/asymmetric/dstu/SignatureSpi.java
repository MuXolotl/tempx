package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import defpackage.AbstractC14024l;
import defpackage.AbstractC8831l;
import defpackage.C11327l;
import defpackage.C14772l;
import defpackage.C18567l;
import defpackage.C18725l;
import defpackage.C6114l;
import defpackage.C9594l;
import defpackage.Ccase;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11004l;
import defpackage.InterfaceC11795l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC18049l;
import defpackage.InterfaceC9719l;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi implements InterfaceC0543l, InterfaceC18049l {
    private InterfaceC16922l digest;
    private InterfaceC11795l signer = new C9594l();

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
        AbstractC8831l abstractC8831lGeneratePrivateKeyParameter;
        boolean z = privateKey instanceof BCDSTU4145PrivateKey;
        byte[] bArr = C14772l.f28855l;
        if (z || (privateKey instanceof InterfaceC11004l)) {
            abstractC8831lGeneratePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
            C18567l c18567l = new C18567l(expandSbox(AbstractC14024l.crashlytics(bArr)));
            this.digest = c18567l;
        } else {
            abstractC8831lGeneratePrivateKeyParameter = null;
        }
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
        InterfaceC9719l interfaceC9719lGeneratePublicKeyParameter;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            interfaceC9719lGeneratePublicKeyParameter = bCDSTU4145PublicKey.engineGetKeyParameters();
            this.digest = new C18567l(expandSbox(bCDSTU4145PublicKey.getSbox()));
        } else {
            interfaceC9719lGeneratePublicKeyParameter = ECUtil.generatePublicKeyParameter(publicKey);
            this.digest = new C18567l(expandSbox(AbstractC14024l.crashlytics(C14772l.f28855l)));
        }
        this.signer.init(false, interfaceC9719lGeneratePublicKeyParameter);
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
            BigInteger[] bigIntegerArrCrashlytics = this.signer.crashlytics(bArr);
            byte[] byteArray = bigIntegerArrCrashlytics[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrCrashlytics[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) * 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new C11327l(bArr2).getEncoded();
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
            byte[] bArr3 = ((Cthrow) Ccase.advert(bArr)).f36593l;
            byte[] bArr4 = new byte[bArr3.length / 2];
            byte[] bArr5 = new byte[bArr3.length / 2];
            System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length / 2);
            System.arraycopy(bArr3, bArr3.length / 2, bArr4, 0, bArr3.length / 2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr4), new BigInteger(1, bArr5)};
            return this.signer.admob(bigIntegerArr[0], bigIntegerArr[1], bArr2);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    public byte[] expandSbox(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr2[i2] = (byte) ((bArr[i] >> 4) & 15);
            bArr2[i2 + 1] = (byte) (bArr[i] & 15);
        }
        return bArr2;
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
