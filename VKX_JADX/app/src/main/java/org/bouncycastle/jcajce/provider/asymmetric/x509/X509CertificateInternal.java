package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.C10818l;
import defpackage.C11144l;
import defpackage.InterfaceC12575l;
import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes3.dex */
class X509CertificateInternal extends X509CertificateImpl {
    private final byte[] encoding;
    private final CertificateEncodingException exception;

    public X509CertificateInternal(InterfaceC12575l interfaceC12575l, C10818l c10818l, C11144l c11144l, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(interfaceC12575l, c10818l, c11144l, zArr, str, bArr);
        this.encoding = bArr2;
        this.exception = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        CertificateEncodingException certificateEncodingException = this.exception;
        if (certificateEncodingException != null) {
            throw certificateEncodingException;
        }
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
