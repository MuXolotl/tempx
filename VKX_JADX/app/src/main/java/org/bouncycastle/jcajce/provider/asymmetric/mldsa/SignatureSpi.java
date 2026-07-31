package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import defpackage.AbstractC14024l;
import defpackage.AbstractC7766l;
import defpackage.AbstractC8831l;
import defpackage.C10314l;
import defpackage.C10380l;
import defpackage.C10754l;
import defpackage.C13812l;
import defpackage.C16791l;
import defpackage.C17029l;
import defpackage.C17951l;
import defpackage.C18073l;
import defpackage.C18725l;
import defpackage.C4124l;
import defpackage.C5775l;
import defpackage.InterfaceC9719l;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    protected C13812l parameters;
    protected C10380l signer;

    public static class MLDSA extends SignatureSpi {
        public MLDSA() {
            super(new C10380l());
        }
    }

    public static class MLDSA44 extends SignatureSpi {
        public MLDSA44() {
            super(new C10380l(), C13812l.amazon);
        }
    }

    public static class MLDSA65 extends SignatureSpi {
        public MLDSA65() {
            super(new C10380l(), C13812l.purchase);
        }
    }

    public static class MLDSA87 extends SignatureSpi {
        public MLDSA87() {
            super(new C10380l(), C13812l.billing);
        }
    }

    public static class MLDSACalcMu extends SignatureSpi {
        public MLDSACalcMu() {
            super(new C10380l());
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public byte[] engineSign() throws SignatureException {
            try {
                C10380l c10380l = this.signer;
                C5775l c5775l = c10380l.f21183l;
                C17951l c17951l = c10380l.f21182l;
                c5775l.getClass();
                byte[] bArr = new byte[64];
                c17951l.crashlytics(0, 64, bArr);
                c10380l.amazon();
                return bArr;
            } catch (Exception e) {
                C18725l.mopub(e);
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) {
            C10380l c10380l = this.signer;
            c10380l.getClass();
            if (bArr.length != 64) {
                C10754l.ad("mu value must be 64 bytes");
                return false;
            }
            byte[] bArr2 = new byte[64];
            c10380l.f21183l.loadAd.doFinal(bArr2, 0);
            boolean zSmaato = AbstractC14024l.smaato(bArr2, bArr);
            c10380l.amazon();
            return zSmaato;
        }
    }

    public SignatureSpi(C10380l c10380l, C13812l c13812l) {
        super(C16791l.yandex(c13812l.loadAd).f32815l);
        this.signer = c10380l;
        this.parameters = c13812l;
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
    public boolean engineVerify(byte[] bArr) {
        return this.signer.loadAd(bArr);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, InterfaceC9719l interfaceC9719l) {
        this.signer.init(z, interfaceC9719l);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        ((java.security.SignatureSpi) this).appRandom = secureRandom;
        if (!(privateKey instanceof BCMLDSAPrivateKey)) {
            C18073l.smaato("unknown private key passed to ML-DSA");
            return;
        }
        BCMLDSAPrivateKey bCMLDSAPrivateKey = (BCMLDSAPrivateKey) privateKey;
        this.keyParams = bCMLDSAPrivateKey.getKeyParams();
        C13812l c13812l = this.parameters;
        if (c13812l != null) {
            String str = C16791l.yandex(c13812l.loadAd).f32815l;
            if (!str.equals(bCMLDSAPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(str));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b) {
        this.signer.update(b);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCMLDSAPublicKey) {
            this.keyParams = ((BCMLDSAPublicKey) publicKey).getKeyParams();
        } else {
            try {
                AbstractC8831l abstractC8831lYandex = AbstractC7766l.yandex(C17029l.vip(publicKey.getEncoded()));
                this.keyParams = abstractC8831lYandex;
                publicKey = new BCMLDSAPublicKey((C4124l) abstractC8831lYandex);
            } catch (Exception unused) {
                C18073l.smaato("unknown public key passed to ML-DSA");
                return;
            }
        }
        C13812l c13812l = this.parameters;
        if (c13812l != null) {
            String str = C16791l.yandex(c13812l.loadAd).f32815l;
            if (!str.equals(publicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(str));
            }
        }
    }

    public static class MLDSAExtMu extends SignatureSpi {
        private ByteArrayOutputStream bOut;

        public MLDSAExtMu() {
            super(new C10380l());
            this.bOut = new ByteArrayOutputStream(64);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public byte[] engineSign() throws SignatureException {
            try {
                byte[] byteArray = this.bOut.toByteArray();
                this.bOut.reset();
                return this.signer.yandex(byteArray);
            } catch (C10314l e) {
                throw new SignatureException(e.getMessage());
            } catch (Exception e2) {
                C18725l.mopub(e2);
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) throws SignatureException {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            try {
                return this.signer.purchase(byteArray, bArr);
            } catch (C10314l e) {
                throw new SignatureException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        public void updateEngine(byte b) {
            this.bOut.write(b);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        public void updateEngine(byte[] bArr, int i, int i2) {
            this.bOut.write(bArr, i, i2);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }

    public SignatureSpi(C10380l c10380l) {
        super("MLDSA");
        this.signer = c10380l;
        this.parameters = null;
    }
}
