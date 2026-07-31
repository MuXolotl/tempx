package org.bouncycastle.jce.provider;

import defpackage.C1405l;
import defpackage.InterfaceC9333l;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

/* JADX INFO: loaded from: classes3.dex */
class WrappedRevocationChecker implements InterfaceC9333l {
    private final PKIXCertPathChecker checker;

    public WrappedRevocationChecker(PKIXCertPathChecker pKIXCertPathChecker) {
        this.checker = pKIXCertPathChecker;
    }

    @Override // defpackage.InterfaceC9333l
    public void check(Certificate certificate) throws CertPathValidatorException {
        this.checker.check(certificate);
    }

    @Override // defpackage.InterfaceC9333l
    public void initialize(C1405l c1405l) throws CertPathValidatorException {
        this.checker.init(false);
    }

    public void setParameter(String str, Object obj) {
    }
}
