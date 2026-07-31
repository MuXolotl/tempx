package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC2880l;
import defpackage.C0709l;
import defpackage.C11505l;
import defpackage.C2657l;
import defpackage.C6114l;
import defpackage.C6476l;
import defpackage.C7633l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC9719l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes3.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {
    private AlgorithmParameters engineParams;
    private final InterfaceC12575l helper = new C7633l();
    private AbstractC2880l paramSpec;
    private final C6476l signer;

    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new C6476l(new C2657l()));
        }
    }

    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new C6476l(new C0709l()));
        }
    }

    public GMSignatureSpi(C6476l c6476l) {
        this.signer = c6476l;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        InterfaceC9719l interfaceC9719lGeneratePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            interfaceC9719lGeneratePrivateKeyParameter = new C6114l(interfaceC9719lGeneratePrivateKeyParameter, secureRandom);
        }
        this.signer.init(true, interfaceC9719lGeneratePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        this.signer.init(false, ECUtils.generatePublicKeyParameter(publicKey));
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
            throw new SignatureException("unable to create signature: " + e.getMessage());
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
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
    }
}
