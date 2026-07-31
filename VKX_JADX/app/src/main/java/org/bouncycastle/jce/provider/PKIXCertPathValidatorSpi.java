package org.bouncycastle.jce.provider;

import defpackage.C10915l;
import defpackage.C11618l;
import defpackage.C14155l;
import defpackage.C15855l;
import defpackage.C17967l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C5384l;
import defpackage.C7633l;
import defpackage.InterfaceC1179l;
import defpackage.InterfaceC12575l;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final InterfaceC12575l helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi(boolean z) {
        this.helper = new C7633l();
        this.isForCRLCheck = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) throws AnnotatedException {
        if (!(x509Certificate instanceof InterfaceC1179l)) {
            try {
                C17967l.vip(x509Certificate.getTBSCertificate());
                return;
            } catch (IllegalArgumentException e) {
                throw new AnnotatedException(e.getMessage());
            } catch (CertificateEncodingException e2) {
                C18073l.startapp("unable to process TBSCertificate", e2);
                return;
            }
        }
        try {
            if (((InterfaceC1179l) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            C18073l.startapp("unable to process TBSCertificate", e);
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        C5384l c5384l;
        C10915l ca;
        PublicKey cAPublicKey;
        HashSet hashSet;
        PKIXPolicyNode pKIXPolicyNodePrepareCertB;
        int iPrepareNextCertI1;
        int iPrepareNextCertI2;
        HashSet hashSet2;
        C10915l subjectPrincipal;
        if (certPathParameters instanceof PKIXParameters) {
            c5384l = new C5384l(new C15855l((PKIXParameters) certPathParameters));
        } else if (certPathParameters instanceof C14155l) {
            c5384l = ((C14155l) certPathParameters).f27680l;
        } else {
            if (!(certPathParameters instanceof C5384l)) {
                throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
            }
            c5384l = (C5384l) certPathParameters;
        }
        Set set = c5384l.f11526l;
        PKIXParameters pKIXParameters = c5384l.f11525l;
        if (set == null) {
            C18073l.pro("trustAnchors is null, this is not allowed for certification path validation.");
            return null;
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(c5384l, new Date());
        Set<String> initialPolicies = pKIXParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), c5384l.f11526l, pKIXParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor != null) {
                checkCertificate(trustAnchorFindTrustAnchor.getTrustedCert());
                C15855l c15855l = new C15855l(c5384l);
                c15855l.f31110l = Collections.singleton(trustAnchorFindTrustAnchor);
                C5384l c5384l2 = new C5384l(c15855l);
                int i = size + 1;
                ArrayList[] arrayListArr = new ArrayList[i];
                boolean z = false;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayListArr[i2] = new ArrayList();
                }
                HashSet hashSet3 = new HashSet();
                hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
                PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
                arrayListArr[0].add(pKIXPolicyNode);
                PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                HashSet hashSet4 = new HashSet();
                PKIXParameters pKIXParameters2 = c5384l2.f11525l;
                int i3 = pKIXParameters2.isExplicitPolicyRequired() ? 0 : i;
                int i4 = pKIXParameters2.isAnyPolicyInhibited() ? 0 : i;
                if (pKIXParameters2.isPolicyMappingInhibited()) {
                    i = 0;
                }
                X509Certificate trustedCert = trustAnchorFindTrustAnchor.getTrustedCert();
                try {
                    if (trustedCert != null) {
                        ca = PrincipalUtils.getSubjectPrincipal(trustedCert);
                        cAPublicKey = trustedCert.getPublicKey();
                    } else {
                        ca = PrincipalUtils.getCA(trustAnchorFindTrustAnchor);
                        cAPublicKey = trustAnchorFindTrustAnchor.getCAPublicKey();
                    }
                    try {
                        CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        int i5 = 1;
                        C11618l c11618l = c5384l2.f11524l;
                        if (c11618l != null) {
                            if (!c11618l.f23340l.match((X509Certificate) certificates.get(0))) {
                                C18073l.remoteconfig("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                                return null;
                            }
                            z = false;
                        }
                        List<PKIXCertPathChecker> certPathCheckers = pKIXParameters2.getCertPathCheckers();
                        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
                        while (it.hasNext()) {
                            it.next().init(z);
                        }
                        ProvCrlRevocationChecker provCrlRevocationChecker = c5384l2.f11529l ? new ProvCrlRevocationChecker(this.helper) : null;
                        int i6 = i;
                        int size2 = certificates.size() - 1;
                        int i7 = i3;
                        PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                        int iPrepareNextCertM = size;
                        X509Certificate x509Certificate = null;
                        while (size2 >= 0) {
                            int i8 = size - size2;
                            List<? extends Certificate> list = certificates;
                            X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                            boolean z2 = size2 == list.size() + (-1) ? i5 : 0;
                            try {
                                checkCertificate(x509Certificate2);
                                List<PKIXCertPathChecker> list2 = certPathCheckers;
                                int i9 = i7;
                                List<PKIXCertPathChecker> list3 = list2;
                                X509Certificate x509Certificate3 = trustedCert;
                                ArrayList[] arrayListArr2 = arrayListArr;
                                PublicKey publicKey = cAPublicKey;
                                iPrepareNextCertM = iPrepareNextCertM;
                                C10915l c10915l = ca;
                                TrustAnchor trustAnchor = trustAnchorFindTrustAnchor;
                                PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                RFC3280CertPathUtilities.processCertA(certPath, c5384l2, validityDate, provCrlRevocationChecker, size2, publicKey, z2, c10915l, x509Certificate3);
                                ProvCrlRevocationChecker provCrlRevocationChecker2 = provCrlRevocationChecker;
                                C10915l c10915l2 = c10915l;
                                C5384l c5384l3 = c5384l2;
                                Date date = validityDate;
                                int i10 = size2;
                                RFC3280CertPathUtilities.processCertBC(certPath, i10, pKIXNameConstraintValidator2, this.isForCRLCheck);
                                HashSet hashSet5 = hashSet4;
                                int iPrepareNextCertJ = i4;
                                PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath, i10, RFC3280CertPathUtilities.processCertD(certPath, i10, hashSet5, pKIXPolicyNode2, arrayListArr2, iPrepareNextCertJ, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath, i10, pKIXPolicyNodeProcessCertE, i9);
                                if (i8 != size) {
                                    try {
                                        if (x509Certificate2 != null) {
                                            hashSet4 = hashSet5;
                                            int i11 = i5;
                                            if (x509Certificate2.getVersion() == i11) {
                                                if (i8 != i11 || !x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                                                    throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i10);
                                                }
                                            }
                                            i4 = iPrepareNextCertJ;
                                            arrayListArr = arrayListArr2;
                                            i7 = i9;
                                            provCrlRevocationChecker = provCrlRevocationChecker2;
                                            i5 = 1;
                                            size2 = i10 - 1;
                                            certPathCheckers = list3;
                                            validityDate = date;
                                            c5384l2 = c5384l3;
                                            x509Certificate = x509Certificate2;
                                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                            trustAnchorFindTrustAnchor = trustAnchor;
                                            certificates = list;
                                            ca = c10915l2;
                                        } else {
                                            hashSet4 = hashSet5;
                                        }
                                        PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i10, this.helper);
                                        CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                        cAPublicKey = nextWorkingKey;
                                        list3 = list3;
                                        trustedCert = x509Certificate2;
                                        c10915l2 = subjectPrincipal;
                                        i9 = iPrepareNextCertI1;
                                        pKIXPolicyNode2 = pKIXPolicyNodePrepareCertB;
                                        i6 = iPrepareNextCertI2;
                                        i4 = iPrepareNextCertJ;
                                        arrayListArr = arrayListArr2;
                                        i7 = i9;
                                        provCrlRevocationChecker = provCrlRevocationChecker2;
                                        i5 = 1;
                                        size2 = i10 - 1;
                                        certPathCheckers = list3;
                                        validityDate = date;
                                        c5384l2 = c5384l3;
                                        x509Certificate = x509Certificate2;
                                        pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                        trustAnchorFindTrustAnchor = trustAnchor;
                                        certificates = list;
                                        ca = c10915l2;
                                    } catch (CertPathValidatorException e) {
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath, i10);
                                    }
                                    RFC3280CertPathUtilities.prepareNextCertA(certPath, i10);
                                    pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i10, arrayListArr2, pKIXPolicyNodeProcessCertE, i6);
                                    RFC3280CertPathUtilities.prepareNextCertG(certPath, i10, pKIXNameConstraintValidator2);
                                    int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i10, i9);
                                    int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i10, i6);
                                    int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i10, iPrepareNextCertJ);
                                    iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i10, iPrepareNextCertH1);
                                    iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i10, iPrepareNextCertH2);
                                    iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i10, iPrepareNextCertH3);
                                    RFC3280CertPathUtilities.prepareNextCertK(certPath, i10);
                                    iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i10, RFC3280CertPathUtilities.prepareNextCertL(certPath, i10, iPrepareNextCertM));
                                    RFC3280CertPathUtilities.prepareNextCertN(certPath, i10);
                                    Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                    if (criticalExtensionOIDs != null) {
                                        hashSet2 = new HashSet(criticalExtensionOIDs);
                                        hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                        hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                        hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                        hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                        hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                        hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                    } else {
                                        hashSet2 = new HashSet();
                                    }
                                    RFC3280CertPathUtilities.prepareNextCertO(certPath, i10, hashSet2, list3);
                                    subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                                cAPublicKey = publicKey;
                                trustedCert = x509Certificate3;
                                i4 = iPrepareNextCertJ;
                                arrayListArr = arrayListArr2;
                                i7 = i9;
                                provCrlRevocationChecker = provCrlRevocationChecker2;
                                i5 = 1;
                                size2 = i10 - 1;
                                certPathCheckers = list3;
                                validityDate = date;
                                c5384l2 = c5384l3;
                                x509Certificate = x509Certificate2;
                                pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                trustAnchorFindTrustAnchor = trustAnchor;
                                certificates = list;
                                ca = c10915l2;
                            } catch (AnnotatedException e2) {
                                throw new CertPathValidatorException(e2.getMessage(), e2.getUnderlyingException(), certPath, size2);
                            }
                        }
                        C5384l c5384l4 = c5384l2;
                        int i12 = size2;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        List<PKIXCertPathChecker> list4 = certPathCheckers;
                        TrustAnchor trustAnchor2 = trustAnchorFindTrustAnchor;
                        PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                        int i13 = i12 + 1;
                        int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i13, RFC3280CertPathUtilities.wrapupCertA(i7, x509Certificate));
                        Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                            hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                            hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                            hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                            hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                            hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                            hashSet.remove(C18229l.f35720l.inmobi());
                        } else {
                            hashSet = new HashSet();
                        }
                        RFC3280CertPathUtilities.wrapupCertF(certPath, i13, list4, hashSet);
                        PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, c5384l4, initialPolicies, i13, arrayListArr3, pKIXPolicyNode3, hashSet4);
                        if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor2, pKIXPolicyNodeWrapupCertG, x509Certificate.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i12);
                    } catch (CertPathValidatorException e3) {
                        C18073l.remoteconfig("Algorithm identifier of public key of trust anchor could not be read.", e3, certPath, -1);
                        return null;
                    }
                } catch (RuntimeException e4) {
                    C18073l.remoteconfig("Subject of trust anchor could not be (re)encoded.", e4, certPath, -1);
                    return null;
                }
            }
            try {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
            } catch (AnnotatedException e5) {
                e = e5;
            }
        } catch (AnnotatedException e6) {
            e = e6;
        }
        throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, certificates.size() - 1);
    }

    public PKIXCertPathValidatorSpi() {
        this(false);
    }
}
