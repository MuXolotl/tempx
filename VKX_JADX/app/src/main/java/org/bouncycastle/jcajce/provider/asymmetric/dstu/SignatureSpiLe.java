package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import defpackage.C11327l;
import defpackage.C18725l;
import defpackage.Ccase;
import defpackage.Cthrow;
import java.io.IOException;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpiLe extends SignatureSpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = Cthrow.premium(super.engineSign()).f36593l;
        reverseBytes(bArr);
        try {
            return new C11327l(bArr).getEncoded();
        } catch (Exception e) {
            C18725l.mopub(e);
            return null;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] bArr2 = ((Cthrow) Ccase.advert(bArr)).f36593l;
            reverseBytes(bArr2);
            try {
                return super.engineVerify(new C11327l(bArr2).getEncoded());
            } catch (SignatureException e) {
                throw e;
            } catch (Exception e2) {
                C18725l.mopub(e2);
                return false;
            }
        } catch (IOException unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    public void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }
}
