package org.bouncycastle.jce.provider;

import defpackage.AbstractC6251l;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class MultiCertStoreSpi extends CertStoreSpi {
    private AbstractC6251l params;

    public MultiCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        throw new InvalidAlgorithmParameterException("org.bouncycastle.jce.provider.MultiCertStoreSpi: parameter must be a MultiCertStoreParameters object\n" + certStoreParameters.toString());
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) {
        throw null;
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) {
        throw null;
    }
}
