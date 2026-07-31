package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import defpackage.C13812l;
import defpackage.C16791l;
import defpackage.C18073l;
import defpackage.C18725l;
import defpackage.C4022l;
import defpackage.InterfaceC9719l;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;

/* JADX INFO: loaded from: classes3.dex */
public class HashSignatureSpi extends BaseDeterministicOrRandomSignature {
    private C13812l parameters;
    private C4022l signer;

    public static class MLDSA extends HashSignatureSpi {
        public MLDSA() {
            super(new C4022l());
        }
    }

    public static class MLDSA44 extends HashSignatureSpi {
        public MLDSA44() {
            super(new C4022l(), C13812l.mopub);
        }
    }

    public static class MLDSA65 extends HashSignatureSpi {
        public MLDSA65() {
            super(new C4022l(), C13812l.admob);
        }
    }

    public static class MLDSA87 extends HashSignatureSpi {
        public MLDSA87() {
            super(new C4022l(), C13812l.subs);
        }
    }

    public HashSignatureSpi(C4022l c4022l, C13812l c13812l) {
        super(C16791l.yandex(c13812l.loadAd).f32815l);
        this.signer = c4022l;
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
        if (!(publicKey instanceof BCMLDSAPublicKey)) {
            C18073l.smaato("unknown public key passed to ML-DSA");
            return;
        }
        BCMLDSAPublicKey bCMLDSAPublicKey = (BCMLDSAPublicKey) publicKey;
        this.keyParams = bCMLDSAPublicKey.getKeyParams();
        C13812l c13812l = this.parameters;
        if (c13812l != null) {
            String str = C16791l.yandex(c13812l.loadAd).f32815l;
            if (!str.equals(bCMLDSAPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(str));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }

    public HashSignatureSpi(C4022l c4022l) {
        super("HashMLDSA");
        this.signer = c4022l;
        this.parameters = null;
    }
}
