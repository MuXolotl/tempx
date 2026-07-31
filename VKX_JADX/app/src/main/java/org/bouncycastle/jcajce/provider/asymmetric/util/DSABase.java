package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.C18725l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11795l;
import defpackage.InterfaceC15270l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC18049l;
import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DSABase extends SignatureSpi implements InterfaceC0543l, InterfaceC18049l {
    protected InterfaceC16922l digest;
    protected InterfaceC15270l encoding;
    protected InterfaceC11795l signer;

    public DSABase(InterfaceC16922l interfaceC16922l, InterfaceC11795l interfaceC11795l, InterfaceC15270l interfaceC15270l) {
        this.digest = interfaceC16922l;
        this.signer = interfaceC11795l;
        this.encoding = interfaceC15270l;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
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
            return this.encoding.admob(this.signer.getOrder(), bigIntegerArrCrashlytics[0], bigIntegerArrCrashlytics[1]);
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
            BigInteger[] bigIntegerArrYandex = this.encoding.yandex(this.signer.getOrder(), bArr);
            return this.signer.admob(bigIntegerArrYandex[0], bigIntegerArrYandex[1], bArr2);
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
