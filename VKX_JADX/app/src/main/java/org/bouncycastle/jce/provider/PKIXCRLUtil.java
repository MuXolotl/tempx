package org.bouncycastle.jce.provider;

import defpackage.C1113l;
import defpackage.C14776l;
import defpackage.C18073l;
import defpackage.InterfaceC14413l;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class PKIXCRLUtil {
    public static Set findCRLs(C14776l c14776l, Date date, List list, List list2) throws AnnotatedException {
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            findCRLs(hashSet, c14776l, list2);
            findCRLs(hashSet, c14776l, list);
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    CRLSelector cRLSelector = c14776l.f28868l;
                    X509Certificate certificateChecking = cRLSelector instanceof X509CRLSelector ? ((X509CRLSelector) cRLSelector).getCertificateChecking() : null;
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e) {
            C18073l.startapp("Exception obtaining complete CRLs.", e);
            return null;
        }
    }

    private static void findCRLs(Set set, C14776l c14776l, List list) throws AnnotatedException {
        AnnotatedException annotatedException = null;
        boolean z = false;
        for (Object obj : list) {
            if (obj instanceof InterfaceC14413l) {
                set.addAll(((InterfaceC14413l) obj).getMatches(c14776l));
            } else {
                try {
                    set.addAll(((CertStore) obj).getCRLs(new C1113l(c14776l)));
                } catch (CertStoreException e) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e);
                }
            }
            z = true;
        }
        if (!z && annotatedException != null) {
            throw annotatedException;
        }
    }
}
