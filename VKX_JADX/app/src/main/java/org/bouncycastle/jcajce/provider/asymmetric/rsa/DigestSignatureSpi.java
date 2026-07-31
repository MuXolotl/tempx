package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14832l;
import defpackage.C0655l;
import defpackage.C10032l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C14998l;
import defpackage.C15058l;
import defpackage.C15587l;
import defpackage.C16162l;
import defpackage.C17175l;
import defpackage.C17711l;
import defpackage.C18725l;
import defpackage.C2339l;
import defpackage.C2657l;
import defpackage.C3077l;
import defpackage.C3558l;
import defpackage.C4871l;
import defpackage.C5153l;
import defpackage.C6080l;
import defpackage.C6963l;
import defpackage.C9102l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC4368l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC5788l;
import defpackage.InterfaceC8134l;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class DigestSignatureSpi extends SignatureSpi {
    private C10198l algId;
    private InterfaceC5788l cipher;
    private InterfaceC16922l digest;

    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(InterfaceC0543l.f1912l, new C15587l(), new C3558l(new C16162l()));
        }
    }

    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(InterfaceC0543l.f1893l, new C2339l(), new C3558l(new C16162l()));
        }
    }

    public static class MD5 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public MD5() {
            Cfor cfor = InterfaceC0543l.f1910l;
            int i = AbstractC14832l.yandex;
            super(cfor, new C3077l(), new C3558l(new C16162l()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(InterfaceC4368l.loadAd, new C17175l(), new C3558l(new C16162l()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(InterfaceC4368l.yandex, new C4871l(), new C3558l(new C16162l()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(InterfaceC4368l.crashlytics, new C15058l(), new C3558l(new C16162l()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public SHA1() {
            Cfor cfor = InterfaceC4502l.billing;
            int i = AbstractC14832l.yandex;
            super(cfor, new C0655l(), new C3558l(new C16162l()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public SHA224() {
            Cfor cfor = InterfaceC8134l.amazon;
            int i = AbstractC14832l.yandex;
            super(cfor, new C9102l(), new C3558l(new C16162l()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public SHA256() {
            Cfor cfor = InterfaceC8134l.yandex;
            int i = AbstractC14832l.yandex;
            super(cfor, new C2657l(), new C3558l(new C16162l()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public SHA384() {
            Cfor cfor = InterfaceC8134l.loadAd;
            int i = AbstractC14832l.yandex;
            super(cfor, new C5153l(), new C3558l(new C16162l()));
        }
    }

    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(InterfaceC8134l.mopub, AbstractC14832l.yandex(), new C3558l(new C16162l()));
        }
    }

    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(InterfaceC8134l.admob, AbstractC14832l.loadAd(), new C3558l(new C16162l()));
        }
    }

    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(InterfaceC8134l.subs, AbstractC14832l.crashlytics(), new C3558l(new C16162l()));
        }
    }

    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(InterfaceC8134l.isPro, AbstractC14832l.amazon(), new C3558l(new C16162l()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public SHA512() {
            Cfor cfor = InterfaceC8134l.crashlytics;
            int i = AbstractC14832l.yandex;
            super(cfor, new C17711l(), new C3558l(new C16162l()));
        }
    }

    public static class SHA512_224 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public SHA512_224() {
            Cfor cfor = InterfaceC8134l.purchase;
            int i = AbstractC14832l.yandex;
            super(cfor, new C10032l(224, 0), new C3558l(new C16162l()));
        }
    }

    public static class SHA512_256 extends DigestSignatureSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public SHA512_256() {
            Cfor cfor = InterfaceC8134l.billing;
            int i = AbstractC14832l.yandex;
            super(cfor, new C10032l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0), new C3558l(new C16162l()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new C6080l(), new C3558l(new C16162l()));
        }
    }

    public DigestSignatureSpi(Cfor cfor, InterfaceC16922l interfaceC16922l, InterfaceC5788l interfaceC5788l) {
        this.digest = interfaceC16922l;
        this.cipher = interfaceC5788l;
        this.algId = new C10198l(cfor, C14998l.f29509l);
    }

    private byte[] derEncode(byte[] bArr) {
        C10198l c10198l = this.algId;
        if (c10198l == null) {
            return bArr;
        }
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C11138l c11138l = new C11138l(c10198l, new C11327l(bArrCrashlytics));
        c11138l.f22357l = -1;
        c11138l.tapsense(byteArrayOutputStream, "DER");
        return byteArrayOutputStream.toByteArray();
    }

    private String getType(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(AbstractC0653l.ads(new StringBuilder("Supplied key ("), getType(privateKey), ") is not a RSAPrivateKey instance"));
        }
        C6963l c6963lGeneratePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
        this.digest.reset();
        this.cipher.init(true, c6963lGeneratePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException(AbstractC0653l.ads(new StringBuilder("Supplied key ("), getType(publicKey), ") is not a RSAPublicKey instance"));
        }
        C6963l c6963lGeneratePublicKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
        this.digest.reset();
        this.cipher.init(false, c6963lGeneratePublicKeyParameter);
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
            byte[] bArrDerEncode = derEncode(bArr);
            return this.cipher.processBlock(bArrDerEncode, 0, bArrDerEncode.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException("key too small for signature type");
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
    public boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArrDerEncode = derEncode(bArr2);
            if (bArrProcessBlock.length == bArrDerEncode.length) {
                return AbstractC14024l.smaato(bArrProcessBlock, bArrDerEncode);
            }
            if (bArrProcessBlock.length == bArrDerEncode.length - 2) {
                bArrDerEncode[1] = (byte) (bArrDerEncode[1] - 2);
                byte b = (byte) (bArrDerEncode[3] - 2);
                bArrDerEncode[3] = b;
                int i = b + 4;
                int i2 = b + 6;
                int i3 = 0;
                for (int i4 = 0; i4 < bArrDerEncode.length - i2; i4++) {
                    i3 |= bArrProcessBlock[i + i4] ^ bArrDerEncode[i2 + i4];
                }
                for (int i5 = 0; i5 < i; i5++) {
                    i3 |= bArrProcessBlock[i5] ^ bArrDerEncode[i5];
                }
                if (i3 == 0) {
                    return true;
                }
            } else {
                AbstractC14024l.smaato(bArrDerEncode, bArrDerEncode);
            }
            return false;
        } catch (Exception unused) {
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

    public DigestSignatureSpi(InterfaceC16922l interfaceC16922l, InterfaceC5788l interfaceC5788l) {
        this.digest = interfaceC16922l;
        this.cipher = interfaceC5788l;
        this.algId = null;
    }
}
