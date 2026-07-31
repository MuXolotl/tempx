package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import defpackage.C10043l;
import defpackage.C1180l;
import defpackage.C18073l;
import defpackage.C9314l;
import defpackage.InterfaceC9719l;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;

/* JADX INFO: loaded from: classes3.dex */
public class HashSignatureSpi extends BaseDeterministicOrRandomSignature {
    private final C10043l signer;

    public static class Direct extends HashSignatureSpi {
        public Direct() {
            super(new C10043l());
        }
    }

    public HashSignatureSpi(C10043l c10043l) {
        super("HASH-SLH-DSA");
        this.signer = c10043l;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        if (!(this.keyParams instanceof C1180l)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            try {
                byte[] bArrCrashlytics = this.signer.crashlytics();
                this.isInitState = true;
                return bArrCrashlytics;
            } catch (Exception e) {
                throw new SignatureException(e.toString());
            }
        } catch (Throwable th) {
            this.isInitState = true;
            throw th;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        if (!(this.keyParams instanceof C9314l)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            return this.signer.loadAd(bArr);
        } finally {
            this.isInitState = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, InterfaceC9719l interfaceC9719l) {
        this.signer.init(z, interfaceC9719l);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        ((java.security.SignatureSpi) this).appRandom = secureRandom;
        if (privateKey instanceof BCSLHDSAPrivateKey) {
            this.keyParams = ((BCSLHDSAPrivateKey) privateKey).getKeyParams();
        } else {
            C18073l.smaato("unknown private key passed to SLH-DSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b) {
        this.signer.update(b);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCSLHDSAPublicKey) {
            this.keyParams = ((BCSLHDSAPublicKey) publicKey).getKeyParams();
        } else {
            C18073l.smaato("unknown public key passed to SLH-DSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }
}
