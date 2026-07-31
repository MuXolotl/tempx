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
import defpackage.InterfaceC9333l;
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
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    private final InterfaceC12575l helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8(boolean z) {
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

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        C5384l c5384l;
        C10915l ca;
        PublicKey cAPublicKey;
        HashSet hashSet;
        HashSet hashSet2;
        PKIXPolicyNode pKIXPolicyNode;
        int iPrepareNextCertI1;
        int iPrepareNextCertJ;
        HashSet hashSet3;
        C10915l subjectPrincipal;
        CertPath certPath2 = certPath;
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
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath2, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(c5384l, new Date());
        Set<String> initialPolicies = pKIXParameters.getInitialPolicies();
        int i = 1;
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), c5384l.f11526l, pKIXParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor != null) {
                checkCertificate(trustAnchorFindTrustAnchor.getTrustedCert());
                C15855l c15855l = new C15855l(c5384l);
                c15855l.f31110l = Collections.singleton(trustAnchorFindTrustAnchor);
                C5384l c5384l2 = new C5384l(c15855l);
                ArrayList arrayList = new ArrayList();
                PKIXParameters pKIXParameters2 = c5384l2.f11525l;
                Iterator<PKIXCertPathChecker> it = pKIXParameters2.getCertPathCheckers().iterator();
                InterfaceC9333l provRevocationChecker = null;
                while (true) {
                    int i2 = i;
                    if (!it.hasNext()) {
                        if (c5384l2.f11529l && provRevocationChecker == null) {
                            provRevocationChecker = new ProvRevocationChecker(this.helper);
                        }
                        int iPrepareNextCertI2 = size + 1;
                        ArrayList[] arrayListArr = new ArrayList[iPrepareNextCertI2];
                        for (int i3 = 0; i3 < iPrepareNextCertI2; i3++) {
                            arrayListArr[i3] = new ArrayList();
                        }
                        HashSet hashSet4 = new HashSet();
                        hashSet4.add(RFC3280CertPathUtilities.ANY_POLICY);
                        PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), 0, hashSet4, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
                        arrayListArr[0].add(pKIXPolicyNode2);
                        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                        HashSet hashSet5 = new HashSet();
                        int i4 = pKIXParameters2.isExplicitPolicyRequired() ? 0 : iPrepareNextCertI2;
                        int i5 = pKIXParameters2.isAnyPolicyInhibited() ? 0 : iPrepareNextCertI2;
                        if (pKIXParameters2.isPolicyMappingInhibited()) {
                            iPrepareNextCertI2 = 0;
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
                                Date date = validityDate;
                                C11618l c11618l = c5384l2.f11524l;
                                if (c11618l != null) {
                                    if (!c11618l.f23340l.match((X509Certificate) certificates.get(0))) {
                                        C18073l.remoteconfig("Target certificate in certification path does not match targetConstraints.", null, certPath2, 0);
                                        return null;
                                    }
                                }
                                PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                                int iPrepareNextCertM = size;
                                int size2 = certificates.size() - 1;
                                X509Certificate x509Certificate = null;
                                while (size2 >= 0) {
                                    int i6 = size - size2;
                                    List<? extends Certificate> list = certificates;
                                    X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                                    boolean z = size2 == list.size() + (-1) ? i2 : 0;
                                    try {
                                        checkCertificate(x509Certificate2);
                                        int i7 = iPrepareNextCertM;
                                        Date date2 = date;
                                        PublicKey publicKey = cAPublicKey;
                                        ArrayList arrayList2 = arrayList;
                                        InterfaceC9333l interfaceC9333l = provRevocationChecker;
                                        C10915l c10915l = ca;
                                        TrustAnchor trustAnchor = trustAnchorFindTrustAnchor;
                                        int i8 = i4;
                                        ArrayList[] arrayListArr2 = arrayListArr;
                                        X509Certificate x509Certificate3 = trustedCert;
                                        Set<String> set2 = initialPolicies;
                                        int i9 = iPrepareNextCertI2;
                                        certPath2 = certPath;
                                        RFC3280CertPathUtilities.processCertA(certPath2, c5384l2, date2, interfaceC9333l, size2, publicKey, z, c10915l, x509Certificate3);
                                        C10915l c10915l2 = c10915l;
                                        C5384l c5384l3 = c5384l2;
                                        int i10 = size2;
                                        RFC3280CertPathUtilities.processCertBC(certPath2, i10, pKIXNameConstraintValidator, this.isForCRLCheck);
                                        HashSet hashSet6 = hashSet5;
                                        int i11 = i5;
                                        PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath2, i10, RFC3280CertPathUtilities.processCertD(certPath2, i10, hashSet6, pKIXPolicyNode3, arrayListArr2, i11, this.isForCRLCheck));
                                        RFC3280CertPathUtilities.processCertF(certPath2, i10, pKIXPolicyNodeProcessCertE, i8);
                                        if (i6 != size) {
                                            try {
                                                if (x509Certificate2 != null) {
                                                    hashSet2 = hashSet6;
                                                    int i12 = i2;
                                                    if (x509Certificate2.getVersion() == i12) {
                                                        if (i6 != i12 || !x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                                                            throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath2, i10);
                                                        }
                                                    }
                                                    size2 = i10 - 1;
                                                    c5384l2 = c5384l3;
                                                    arrayListArr = arrayListArr2;
                                                    PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode;
                                                    hashSet5 = hashSet2;
                                                    pKIXPolicyNode3 = pKIXPolicyNode4;
                                                    date = date2;
                                                    x509Certificate = x509Certificate2;
                                                    trustAnchorFindTrustAnchor = trustAnchor;
                                                    initialPolicies = set2;
                                                    certificates = list;
                                                    provRevocationChecker = interfaceC9333l;
                                                    ca = c10915l2;
                                                    i2 = 1;
                                                } else {
                                                    hashSet2 = hashSet6;
                                                }
                                                i4 = iPrepareNextCertI1;
                                                PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath2.getCertificates(), i10, this.helper);
                                                CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                                cAPublicKey = nextWorkingKey;
                                                i5 = iPrepareNextCertJ;
                                                trustedCert = x509Certificate2;
                                                arrayList = arrayList2;
                                                c10915l2 = subjectPrincipal;
                                                size2 = i10 - 1;
                                                c5384l2 = c5384l3;
                                                arrayListArr = arrayListArr2;
                                                PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode;
                                                hashSet5 = hashSet2;
                                                pKIXPolicyNode3 = pKIXPolicyNode5;
                                                date = date2;
                                                x509Certificate = x509Certificate2;
                                                trustAnchorFindTrustAnchor = trustAnchor;
                                                initialPolicies = set2;
                                                certificates = list;
                                                provRevocationChecker = interfaceC9333l;
                                                ca = c10915l2;
                                                i2 = 1;
                                            } catch (CertPathValidatorException e) {
                                                throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath2, i10);
                                            }
                                            RFC3280CertPathUtilities.prepareNextCertA(certPath2, i10);
                                            PKIXPolicyNode pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath2, i10, arrayListArr2, pKIXPolicyNodeProcessCertE, i9);
                                            RFC3280CertPathUtilities.prepareNextCertG(certPath2, i10, pKIXNameConstraintValidator);
                                            int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath2, i10, i8);
                                            int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath2, i10, i9);
                                            int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath2, i10, i11);
                                            iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath2, i10, iPrepareNextCertH1);
                                            iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath2, i10, iPrepareNextCertH2);
                                            iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath2, i10, iPrepareNextCertH3);
                                            RFC3280CertPathUtilities.prepareNextCertK(certPath2, i10);
                                            iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath2, i10, RFC3280CertPathUtilities.prepareNextCertL(certPath2, i10, i7));
                                            RFC3280CertPathUtilities.prepareNextCertN(certPath2, i10);
                                            Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                            if (criticalExtensionOIDs != null) {
                                                hashSet3 = new HashSet(criticalExtensionOIDs);
                                                hashSet3.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                                hashSet3.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                                hashSet3.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                                hashSet3.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                                hashSet3.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                                hashSet3.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                                hashSet3.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                                hashSet3.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                                hashSet3.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                                hashSet3.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                            } else {
                                                hashSet3 = new HashSet();
                                            }
                                            RFC3280CertPathUtilities.prepareNextCertO(certPath2, i10, hashSet3, arrayList2);
                                            subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                            pKIXPolicyNode = pKIXPolicyNodePrepareCertB;
                                        } else {
                                            hashSet2 = hashSet6;
                                        }
                                        arrayList = arrayList2;
                                        iPrepareNextCertM = i7;
                                        pKIXPolicyNode = pKIXPolicyNodeProcessCertE;
                                        i5 = i11;
                                        iPrepareNextCertI2 = i9;
                                        i4 = i8;
                                        cAPublicKey = publicKey;
                                        trustedCert = x509Certificate3;
                                        size2 = i10 - 1;
                                        c5384l2 = c5384l3;
                                        arrayListArr = arrayListArr2;
                                        PKIXPolicyNode pKIXPolicyNode6 = pKIXPolicyNode;
                                        hashSet5 = hashSet2;
                                        pKIXPolicyNode3 = pKIXPolicyNode6;
                                        date = date2;
                                        x509Certificate = x509Certificate2;
                                        trustAnchorFindTrustAnchor = trustAnchor;
                                        initialPolicies = set2;
                                        certificates = list;
                                        provRevocationChecker = interfaceC9333l;
                                        ca = c10915l2;
                                        i2 = 1;
                                    } catch (AnnotatedException e2) {
                                        throw new CertPathValidatorException(e2.getMessage(), e2.getUnderlyingException(), certPath, size2);
                                    }
                                }
                                ArrayList[] arrayListArr3 = arrayListArr;
                                C5384l c5384l4 = c5384l2;
                                int i13 = size2;
                                Set<String> set3 = initialPolicies;
                                TrustAnchor trustAnchor2 = trustAnchorFindTrustAnchor;
                                PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNode3;
                                HashSet hashSet7 = hashSet5;
                                int i14 = i13 + 1;
                                int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath2, i14, RFC3280CertPathUtilities.wrapupCertA(i4, x509Certificate));
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
                                RFC3280CertPathUtilities.wrapupCertF(certPath2, i14, arrayList, hashSet);
                                X509Certificate x509Certificate4 = x509Certificate;
                                PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath2, c5384l4, set3, i14, arrayListArr3, pKIXPolicyNode7, hashSet7);
                                if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                                    return new PKIXCertPathValidatorResult(trustAnchor2, pKIXPolicyNodeWrapupCertG, x509Certificate4.getPublicKey());
                                }
                                throw new CertPathValidatorException("Path processing failed on policy.", null, certPath2, i13);
                            } catch (CertPathValidatorException e3) {
                                C18073l.remoteconfig("Algorithm identifier of public key of trust anchor could not be read.", e3, certPath2, -1);
                                return null;
                            }
                        } catch (RuntimeException e4) {
                            C18073l.remoteconfig("Subject of trust anchor could not be (re)encoded.", e4, certPath2, -1);
                            return null;
                        }
                    }
                    PKIXCertPathChecker next = it.next();
                    next.init(false);
                    if (!C18073l.ads(next)) {
                        arrayList.add(next);
                    } else {
                        if (provRevocationChecker != null) {
                            throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                        }
                        provRevocationChecker = next instanceof InterfaceC9333l ? (InterfaceC9333l) next : new WrappedRevocationChecker(next);
                    }
                    i = i2;
                }
            } else {
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath2, -1);
                } catch (AnnotatedException e5) {
                    e = e5;
                }
            }
        } catch (AnnotatedException e6) {
            e = e6;
        }
        throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath2, certificates.size() - 1);
    }

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }
}
