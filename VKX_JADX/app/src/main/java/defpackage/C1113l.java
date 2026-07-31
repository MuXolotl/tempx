package defpackage;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* JADX INFO: renamed from: lؙؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1113l extends X509CRLSelector {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14776l f3050l;

    public C1113l(C14776l c14776l) {
        this.f3050l = c14776l;
        CRLSelector cRLSelector = c14776l.f28868l;
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            setCertificateChecking(x509CRLSelector.getCertificateChecking());
            setDateAndTime(x509CRLSelector.getDateAndTime());
            setIssuers(x509CRLSelector.getIssuers());
            setMinCRLNumber(x509CRLSelector.getMinCRL());
            setMaxCRLNumber(x509CRLSelector.getMaxCRL());
        }
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public final boolean match(CRL crl) {
        C14776l c14776l = this.f3050l;
        if (c14776l == null) {
            return crl != null;
        }
        return c14776l.mopub(crl);
    }
}
