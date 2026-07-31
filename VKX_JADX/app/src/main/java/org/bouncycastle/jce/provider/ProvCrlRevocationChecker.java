package org.bouncycastle.jce.provider;

import defpackage.C1405l;
import defpackage.C5384l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC9333l;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class ProvCrlRevocationChecker implements InterfaceC9333l {
    private Date currentDate = null;
    private final InterfaceC12575l helper;
    private C1405l params;

    public ProvCrlRevocationChecker(InterfaceC12575l interfaceC12575l) {
        this.helper = interfaceC12575l;
    }

    @Override // defpackage.InterfaceC9333l
    public void check(Certificate certificate) throws CertPathValidatorException {
        try {
            C1405l c1405l = this.params;
            C5384l c5384l = c1405l.yandex;
            Date date = this.currentDate;
            Date dateYandex = c1405l.yandex();
            X509Certificate x509Certificate = (X509Certificate) certificate;
            C1405l c1405l2 = this.params;
            RFC3280CertPathUtilities.checkCRLs(c1405l, c5384l, date, dateYandex, x509Certificate, c1405l2.purchase, c1405l2.billing, c1405l2.crashlytics.getCertificates(), this.helper);
        } catch (AnnotatedException e) {
            Throwable cause = e.getCause() != null ? e.getCause() : e;
            String message = e.getMessage();
            C1405l c1405l3 = this.params;
            throw new CertPathValidatorException(message, cause, c1405l3.crashlytics, c1405l3.amazon);
        }
    }

    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            throw new CertPathValidatorException("forward checking not supported");
        }
        this.params = null;
        this.currentDate = new Date();
    }

    @Override // defpackage.InterfaceC9333l
    public void initialize(C1405l c1405l) {
        this.params = c1405l;
        this.currentDate = new Date();
    }

    public void setParameter(String str, Object obj) {
    }
}
