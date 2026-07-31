package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC14832l;
import defpackage.C0655l;
import defpackage.C10032l;
import defpackage.C13420l;
import defpackage.C16162l;
import defpackage.C17711l;
import defpackage.C18725l;
import defpackage.C2657l;
import defpackage.C3077l;
import defpackage.C4871l;
import defpackage.C5153l;
import defpackage.C5880l;
import defpackage.C9102l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC5788l;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class ISOSignatureSpi extends SignatureSpi {
    private C13420l signer;

    public static class MD5WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MD5WithRSAEncryption() {
            super(new C3077l(), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class RIPEMD160WithRSAEncryption extends ISOSignatureSpi {
        public RIPEMD160WithRSAEncryption() {
            super(new C4871l(), new C16162l());
        }
    }

    public static class SHA1WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SHA1WithRSAEncryption() {
            super(new C0655l(), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class SHA224WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SHA224WithRSAEncryption() {
            super(new C9102l(), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class SHA256WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SHA256WithRSAEncryption() {
            super(new C2657l(), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class SHA384WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SHA384WithRSAEncryption() {
            super(new C5153l(), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class SHA512WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SHA512WithRSAEncryption() {
            super(new C17711l(), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class SHA512_224WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SHA512_224WithRSAEncryption() {
            super(new C10032l(224, 0), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class SHA512_256WithRSAEncryption extends ISOSignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SHA512_256WithRSAEncryption() {
            super(new C10032l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0), new C16162l());
            int i = AbstractC14832l.yandex;
        }
    }

    public static class WhirlpoolWithRSAEncryption extends ISOSignatureSpi {
        public WhirlpoolWithRSAEncryption() {
            super(new C5880l(), new C16162l());
        }
    }

    public ISOSignatureSpi(InterfaceC16922l interfaceC16922l, InterfaceC5788l interfaceC5788l) {
        C13420l c13420l = new C13420l();
        c13420l.f26327l = interfaceC5788l;
        c13420l.f26328l = interfaceC16922l;
        c13420l.f26324l = 188;
        this.signer = c13420l;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        this.signer.init(true, RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey));
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        this.signer.init(false, RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey));
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.crashlytics();
        } catch (Exception e) {
            C18725l.mopub(e);
            return null;
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

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
}
