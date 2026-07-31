package org.bouncycastle.jce.provider;

import defpackage.AbstractC7180l;
import defpackage.AbstractC8577l;
import defpackage.C11618l;
import defpackage.C15855l;
import defpackage.C5384l;
import defpackage.C7633l;
import defpackage.InterfaceC12575l;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.util.Date;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi {
    private final InterfaceC12575l helper = new C7633l();

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws InvalidAlgorithmParameterException {
        if (!(certPathParameters instanceof C5384l)) {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + AbstractC8577l.class.getName() + " instance.");
        }
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        C5384l c5384l = certPathParameters instanceof PKIXParameters ? new C5384l(new C15855l((PKIXParameters) certPathParameters)) : (C5384l) certPathParameters;
        CertPathValidatorUtilities.getValidityDate(c5384l, new Date());
        C11618l c11618l = c5384l.f11524l;
        throw new InvalidAlgorithmParameterException("TargetConstraints must be an instance of " + AbstractC7180l.class.getName() + " for " + getClass().getName() + " class.");
    }
}
