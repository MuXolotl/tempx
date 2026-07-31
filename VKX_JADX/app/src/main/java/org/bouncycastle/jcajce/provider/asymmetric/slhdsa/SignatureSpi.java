package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import defpackage.AbstractC14024l;
import defpackage.AbstractC6716l;
import defpackage.C11702l;
import defpackage.C1180l;
import defpackage.C14788l;
import defpackage.C18073l;
import defpackage.C18097l;
import defpackage.C6114l;
import defpackage.C8339l;
import defpackage.C9314l;
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
    private final ByteArrayOutputStream bOut;
    private final C14788l signer;

    public static class Direct extends SignatureSpi {
        public Direct() {
            super(new C14788l());
        }
    }

    public SignatureSpi(C14788l c14788l) {
        super("SLH-DSA");
        this.bOut = new ByteArrayOutputStream();
        this.signer = c14788l;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        if (!(this.keyParams instanceof C1180l)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            try {
                byte[] bArrYandex = this.signer.yandex(this.bOut.toByteArray());
                this.isInitState = true;
                this.bOut.reset();
                return bArrYandex;
            } catch (Exception e) {
                throw new SignatureException(e.toString());
            }
        } catch (Throwable th) {
            this.isInitState = true;
            this.bOut.reset();
            throw th;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        if (!(this.keyParams instanceof C9314l)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            C14788l c14788l = this.signer;
            return AbstractC6716l.subs((C18097l) c14788l.crashlytics.f16541l, c14788l.billing, c14788l.mopub, c14788l.yandex, this.bOut.toByteArray(), bArr);
        } finally {
            this.isInitState = true;
            this.bOut.reset();
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, InterfaceC9719l interfaceC9719l) {
        C18097l c18097l;
        C14788l c14788l = this.signer;
        if (interfaceC9719l instanceof C11702l) {
            c14788l.getClass();
            C11702l c11702l = (C11702l) interfaceC9719l;
            InterfaceC9719l interfaceC9719l2 = c11702l.f23447l;
            byte[] bArr = c11702l.f23446l;
            int length = bArr.length;
            if (length > 255) {
                C8339l.metrica("context too long");
                return;
            }
            byte[] bArr2 = new byte[length + 2];
            c14788l.yandex = bArr2;
            bArr2[0] = 0;
            bArr2[1] = (byte) length;
            if (bArr.length != length) {
                C8339l.metrica("len");
                return;
            } else {
                System.arraycopy(bArr, 0, bArr2, 2, length);
                interfaceC9719l = interfaceC9719l2;
            }
        } else {
            c14788l.yandex = C14788l.isPro;
        }
        if (z) {
            c14788l.crashlytics = null;
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                c14788l.amazon = (C1180l) c6114l.f12903l;
                c14788l.purchase = c6114l.f12904l;
            } else {
                c14788l.amazon = (C1180l) interfaceC9719l;
                c14788l.purchase = null;
            }
            c14788l.admob = AbstractC14024l.crashlytics(c14788l.amazon.f3172l.yandex);
            c14788l.subs = AbstractC14024l.crashlytics(c14788l.amazon.f3172l.loadAd);
            c14788l.billing = AbstractC14024l.crashlytics(c14788l.amazon.f3173l.yandex);
            c14788l.mopub = AbstractC14024l.crashlytics(c14788l.amazon.f3173l.loadAd);
            c18097l = (C18097l) c14788l.amazon.f16541l;
            c14788l.loadAd = new byte[c18097l.loadAd.crashlytics()];
        } else {
            C9314l c9314l = (C9314l) interfaceC9719l;
            c14788l.crashlytics = c9314l;
            c14788l.amazon = null;
            c14788l.purchase = null;
            c14788l.admob = null;
            c14788l.subs = null;
            c14788l.billing = AbstractC14024l.crashlytics(c9314l.f19126l);
            c14788l.mopub = AbstractC14024l.crashlytics(c14788l.crashlytics.f19127l);
            c18097l = (C18097l) c14788l.crashlytics.f16541l;
        }
        if (c18097l.crashlytics == 0) {
            this.bOut.reset();
        } else {
            C8339l.metrica("\"pure\" slh-dsa must use non pre-hash parameters");
        }
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
        this.bOut.write(b);
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
        this.bOut.write(bArr, i, i2);
    }
}
