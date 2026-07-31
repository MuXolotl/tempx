package org.bouncycastle.jce.provider;

import defpackage.AbstractC7180l;
import defpackage.C11618l;
import defpackage.C13698l;
import defpackage.C14155l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C5384l;
import defpackage.InterfaceC14413l;
import defpackage.InterfaceC9124l;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    private CertPathBuilderResult build(InterfaceC9124l interfaceC9124l, X509Certificate x509Certificate, C14155l c14155l, List list) {
        CertPathBuilderResult certPathBuilderResultBuild = null;
        if (list.contains(x509Certificate)) {
            return null;
        }
        Set set = c14155l.f27679l;
        int i = c14155l.f27678l;
        if (set.contains(x509Certificate)) {
            return null;
        }
        if (i != -1 && list.size() - 1 > i) {
            return null;
        }
        list.add(x509Certificate);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
            CertPathValidator certPathValidator = CertPathValidator.getInstance("RFC3281", BouncyCastleProvider.PROVIDER_NAME);
            try {
                C5384l c5384l = c14155l.f27680l;
                Set set2 = c5384l.f11526l;
                PKIXParameters pKIXParameters = c5384l.f11525l;
                if (CertPathValidatorUtilities.isIssuerTrustAnchor(x509Certificate, set2, pKIXParameters.getSigProvider())) {
                    try {
                        CertPath certPathGenerateCertPath = certificateFactory.generateCertPath((List<? extends Certificate>) list);
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) certPathValidator.validate(certPathGenerateCertPath, c14155l);
                            return new PKIXCertPathBuilderResult(certPathGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                        } catch (Exception e) {
                            throw new AnnotatedException("Certification path could not be validated.", e);
                        }
                    } catch (Exception e2) {
                        throw new AnnotatedException("Certification path could not be constructed from certificate list.", e2);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c5384l.f11527l);
                try {
                    arrayList.addAll(CertPathValidatorUtilities.getAdditionalStoresFromAltNames(x509Certificate.getExtensionValue(C18229l.f35728l.inmobi()), c5384l.f11530l));
                    HashSet hashSet = new HashSet();
                    try {
                        hashSet.addAll(CertPathValidatorUtilities.findIssuerCerts(x509Certificate, pKIXParameters.getCertStores(), arrayList));
                        if (hashSet.isEmpty()) {
                            throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext() && certPathBuilderResultBuild == null) {
                            X509Certificate x509Certificate2 = (X509Certificate) it.next();
                            if (!x509Certificate2.getIssuerX500Principal().equals(x509Certificate2.getSubjectX500Principal())) {
                                certPathBuilderResultBuild = build(interfaceC9124l, x509Certificate2, c14155l, list);
                            }
                        }
                        if (certPathBuilderResultBuild == null) {
                            list.remove(x509Certificate);
                        }
                        return certPathBuilderResultBuild;
                    } catch (AnnotatedException e3) {
                        throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e3);
                    }
                } catch (CertificateParsingException e4) {
                    throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", e4);
                }
            } catch (AnnotatedException e5) {
                this.certPathException = new AnnotatedException("No valid certification path could be build.", e5);
            }
            this.certPathException = new AnnotatedException("No valid certification path could be build.", e5);
            if (certPathBuilderResultBuild == null) {
                list.remove(x509Certificate);
            }
            return certPathBuilderResultBuild;
        } catch (Exception unused) {
            C18073l.license("Exception creating support classes.");
            return null;
        }
    }

    public static Collection findCertificates(AbstractC7180l abstractC7180l, List list) {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof InterfaceC14413l) {
                hashSet.addAll(((InterfaceC14413l) obj).getMatches(abstractC7180l));
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        boolean z = certPathParameters instanceof PKIXBuilderParameters;
        if (!z && !(certPathParameters instanceof C14155l)) {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + C14155l.class.getName() + ".");
        }
        new ArrayList();
        C14155l c14155l = z ? new C14155l(new C13698l((PKIXBuilderParameters) certPathParameters)) : (C14155l) certPathParameters;
        new ArrayList();
        C11618l c11618l = c14155l.f27680l.f11524l;
        throw new CertPathBuilderException("TargetConstraints must be an instance of " + AbstractC7180l.class.getName() + " for " + getClass().getName() + " class.");
    }
}
