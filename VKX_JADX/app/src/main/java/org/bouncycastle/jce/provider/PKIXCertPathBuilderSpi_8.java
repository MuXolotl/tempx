package org.bouncycastle.jce.provider;

import defpackage.C13698l;
import defpackage.C14155l;
import defpackage.C18229l;
import defpackage.C5384l;
import defpackage.C7633l;
import defpackage.InterfaceC12575l;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXCertPathBuilderSpi_8 extends CertPathBuilderSpi {
    private Exception certPathException;
    private final InterfaceC12575l helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathBuilderSpi_8(boolean z) {
        this.helper = new C7633l();
        this.isForCRLCheck = z;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    public CertPathBuilderResult build(X509Certificate x509Certificate, C14155l c14155l, List list) {
        CertPathBuilderResult certPathBuilderResultBuild = null;
        if (list.contains(x509Certificate)) {
            return null;
        }
        Set set = c14155l.f27679l;
        int i = c14155l.f27678l;
        C5384l c5384l = c14155l.f27680l;
        if (set.contains(x509Certificate)) {
            return null;
        }
        if (i != -1 && list.size() - 1 > i) {
            return null;
        }
        list.add(x509Certificate);
        try {
            try {
                CertificateFactory certificateFactory = new CertificateFactory();
                PKIXCertPathValidatorSpi_8 pKIXCertPathValidatorSpi_8 = new PKIXCertPathValidatorSpi_8(this.isForCRLCheck);
                if (CertPathValidatorUtilities.isIssuerTrustAnchor(x509Certificate, c5384l.f11526l, c5384l.f11525l.getSigProvider())) {
                    try {
                        CertPath certPathEngineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) pKIXCertPathValidatorSpi_8.engineValidate(certPathEngineGenerateCertPath, c14155l);
                            return new PKIXCertPathBuilderResult(certPathEngineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
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
                        hashSet.addAll(CertPathValidatorUtilities.findIssuerCerts(x509Certificate, c5384l.f11525l.getCertStores(), arrayList));
                        if (hashSet.isEmpty()) {
                            throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext() && certPathBuilderResultBuild == null) {
                            certPathBuilderResultBuild = build((X509Certificate) it.next(), c14155l, list);
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
            } catch (Exception unused) {
                throw new RuntimeException("Exception creating support classes.");
            }
        } catch (AnnotatedException e5) {
            this.certPathException = e5;
        }
        this.certPathException = e5;
        if (certPathBuilderResultBuild == null) {
            list.remove(x509Certificate);
        }
        return certPathBuilderResultBuild;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        C14155l c14155l;
        Exception exc;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            new ArrayList();
            new HashMap();
            new ArrayList();
            new HashMap();
            CertSelector targetCertConstraints = pKIXBuilderParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
            }
            if (pKIXBuilderParameters.getDate() == null) {
                new Date();
            }
            pKIXBuilderParameters.isRevocationEnabled();
            pKIXBuilderParameters.getTrustAnchors();
            c14155l = new C14155l(new C13698l(pKIXBuilderParameters));
        } else {
            if (!(certPathParameters instanceof C14155l)) {
                throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + C14155l.class.getName() + ".");
            }
            c14155l = (C14155l) certPathParameters;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CertPathValidatorUtilities.findTargets(c14155l).iterator();
        CertPathBuilderResult certPathBuilderResultBuild = null;
        while (it.hasNext() && certPathBuilderResultBuild == null) {
            certPathBuilderResultBuild = build((X509Certificate) it.next(), c14155l, arrayList);
        }
        if (certPathBuilderResultBuild == null && (exc = this.certPathException) != null) {
            if (exc instanceof AnnotatedException) {
                throw new CertPathBuilderException(this.certPathException.getMessage(), this.certPathException.getCause());
            }
            throw new CertPathBuilderException("Possible certificate chain could not be validated.", this.certPathException);
        }
        if (certPathBuilderResultBuild == null && this.certPathException == null) {
            throw new CertPathBuilderException("Unable to find certificate chain.");
        }
        return certPathBuilderResultBuild;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    public PKIXCertPathBuilderSpi_8() {
        this(false);
    }
}
