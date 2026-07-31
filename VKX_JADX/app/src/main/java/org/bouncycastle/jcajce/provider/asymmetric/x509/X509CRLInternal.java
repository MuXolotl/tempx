package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.C0649l;
import defpackage.InterfaceC12575l;
import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes3.dex */
class X509CRLInternal extends X509CRLImpl {
    private final byte[] encoding;
    private final CRLException exception;

    public X509CRLInternal(InterfaceC12575l interfaceC12575l, C0649l c0649l, String str, byte[] bArr, boolean z, byte[] bArr2, CRLException cRLException) {
        super(interfaceC12575l, c0649l, str, bArr, z);
        this.encoding = bArr2;
        this.exception = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        CRLException cRLException = this.exception;
        if (cRLException != null) {
            throw cRLException;
        }
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
