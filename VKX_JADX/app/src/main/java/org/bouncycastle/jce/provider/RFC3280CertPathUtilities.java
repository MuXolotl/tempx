package org.bouncycastle.jce.provider;

import defpackage.AbstractC5020l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC9027l;
import defpackage.C0179l;
import defpackage.C10915l;
import defpackage.C11138l;
import defpackage.C11144l;
import defpackage.C11618l;
import defpackage.C11983l;
import defpackage.C12378l;
import defpackage.C1314l;
import defpackage.C13698l;
import defpackage.C1405l;
import defpackage.C14155l;
import defpackage.C1524l;
import defpackage.C15765l;
import defpackage.C15855l;
import defpackage.C16138l;
import defpackage.C1781l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C18707l;
import defpackage.C2095l;
import defpackage.C2275l;
import defpackage.C5384l;
import defpackage.C5722l;
import defpackage.C8047l;
import defpackage.C9018l;
import defpackage.C9548l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cdefault;
import defpackage.Cfinal;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Cnative;
import defpackage.Cstrictfp;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC17473l;
import defpackage.InterfaceC9333l;
import defpackage.ad;
import defpackage.applovin;
import defpackage.appmetrica;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;

/* JADX INFO: loaded from: classes3.dex */
class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final String CERTIFICATE_POLICIES = C18229l.f35723l.inmobi();
    public static final String POLICY_MAPPINGS = C18229l.f35718l.inmobi();
    public static final String INHIBIT_ANY_POLICY = C18229l.f35715l.inmobi();
    public static final String ISSUING_DISTRIBUTION_POINT = C18229l.f35729l.inmobi();
    public static final String FRESHEST_CRL = C18229l.f35716l.inmobi();
    public static final String DELTA_CRL_INDICATOR = C18229l.f35722l.inmobi();
    public static final String POLICY_CONSTRAINTS = C18229l.f35731l.inmobi();
    public static final String BASIC_CONSTRAINTS = C18229l.f35714l.inmobi();
    public static final String CRL_DISTRIBUTION_POINTS = C18229l.f35730l.inmobi();
    public static final String SUBJECT_ALTERNATIVE_NAME = C18229l.f35724l.inmobi();
    public static final String NAME_CONSTRAINTS = C18229l.f35713l.inmobi();
    public static final String AUTHORITY_KEY_IDENTIFIER = C18229l.f35721l.inmobi();
    public static final String KEY_USAGE = C18229l.f35725l.inmobi();
    public static final String CRL_NUMBER = C18229l.f35717l.inmobi();
    public static final String REASON_CODE = C18229l.f35727l.inmobi();
    static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    private static void checkCRL(C1405l c1405l, C0179l c0179l, C5384l c5384l, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, InterfaceC12575l interfaceC12575l) throws AnnotatedException {
        if (date2.getTime() > date.getTime()) {
            C11983l.remoteconfig("Validation time is in future.");
            return;
        }
        C5384l c5384l2 = c5384l;
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(c1405l, c0179l, x509Certificate, c5384l2, date2).iterator();
        boolean z = false;
        AnnotatedException e = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                CertPathValidatorUtilities.checkCRLCriticalExtensions(x509crl, "CRL contains unsupported critical extensions.");
                ReasonsMask reasonsMaskProcessCRLD = processCRLD(x509crl, c0179l);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    processCRLG(x509crl, processCRLF(x509crl, x509Certificate, x509Certificate2, publicKey, c5384l2, list, interfaceC12575l));
                    c5384l.getClass();
                    if (x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                        throw new AnnotatedException("No valid CRL for current time found.");
                    }
                    processCRLB1(c0179l, x509Certificate, x509crl);
                    processCRLB2(c0179l, x509Certificate, x509crl);
                    processCRLJ(date2, x509crl, x509Certificate, certStatus);
                    if (certStatus.getCertStatus() == 8) {
                        certStatus.setCertStatus(11);
                    }
                    reasonsMask.addReasons(reasonsMaskProcessCRLD);
                    z = true;
                    c5384l2 = c5384l;
                }
            } catch (AnnotatedException e2) {
                e = e2;
            }
        }
        if (!z) {
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public static void checkCRLs(C1405l c1405l, C5384l c5384l, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, List list, InterfaceC12575l interfaceC12575l) throws AnnotatedException {
        AnnotatedException e;
        int i;
        CertStatus certStatus;
        boolean z;
        int i2;
        int i3;
        C0179l[] c0179lArr;
        List list2;
        ?? r14;
        ?? r15;
        try {
            X509Certificate x509Certificate3 = x509Certificate;
            C1781l c1781lMetrica = C1781l.metrica(getExtensionValue(x509Certificate3, CRL_DISTRIBUTION_POINTS));
            Date date3 = date2;
            try {
                List<InterfaceC17473l> additionalStoresFromCRLDistributionPoint = CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(c1781lMetrica, c5384l, date3, interfaceC12575l);
                C15855l c15855l = new C15855l(c5384l);
                Iterator<InterfaceC17473l> it = additionalStoresFromCRLDistributionPoint.iterator();
                while (it.hasNext()) {
                    ((ArrayList) c15855l.f31107l).add(it.next());
                }
                C5384l c5384l2 = new C5384l(c15855l);
                CertStatus certStatus2 = new CertStatus();
                ReasonsMask reasonsMask = new ReasonsMask();
                boolean z2 = true;
                int i4 = 0;
                int i5 = 11;
                if (c1781lMetrica != null) {
                    try {
                        C0179l[] c0179lArrVip = c1781lMetrica.vip();
                        e = null;
                        boolean z3 = false;
                        while (i4 < c0179lArrVip.length && certStatus2.getCertStatus() == i5 && !reasonsMask.isAllReasons()) {
                            C0179l[] c0179lArr2 = c0179lArrVip;
                            try {
                                C0179l c0179l = c0179lArr2[i4];
                                list2 = list;
                                i2 = i4;
                                i3 = i5;
                                c0179lArr = c0179lArr2;
                                ReasonsMask reasonsMask2 = reasonsMask;
                                try {
                                    checkCRL(c1405l, c0179l, c5384l2, date, date3, x509Certificate3, x509Certificate2, publicKey, certStatus2, reasonsMask2, list2, interfaceC12575l);
                                    reasonsMask = reasonsMask2;
                                    z3 = true;
                                } catch (AnnotatedException e2) {
                                    e = e2;
                                    reasonsMask = reasonsMask2;
                                    list2 = list2;
                                }
                            } catch (AnnotatedException e3) {
                                e = e3;
                                i2 = i4;
                                i3 = i5;
                                c0179lArr = c0179lArr2;
                                list2 = list2;
                            }
                            i5 = i3;
                            i4 = i2 + 1;
                            date3 = date2;
                            certStatus2 = certStatus2;
                            c0179lArrVip = c0179lArr;
                            x509Certificate3 = x509Certificate;
                        }
                        i = i5;
                        certStatus = certStatus2;
                        z = z3;
                    } catch (Exception e4) {
                        C18073l.startapp("Distribution points could not be read.", e4);
                        return;
                    }
                } else {
                    i = 11;
                    certStatus = certStatus2;
                    z = false;
                    e = null;
                }
                if (certStatus.getCertStatus() == i) {
                    try {
                        if (!reasonsMask.isAllReasons()) {
                            try {
                                try {
                                    r15 = i;
                                    checkCRL(c1405l, new C0179l(new C18707l(new C9018l(new C12378l(4, PrincipalUtils.getIssuerPrincipal(x509Certificate))))), c5384l, date, date2, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, interfaceC12575l);
                                } catch (AnnotatedException e5) {
                                    e = e5;
                                    r14 = i;
                                    z2 = z;
                                    r15 = r14;
                                }
                            } catch (RuntimeException e6) {
                                throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e6);
                            }
                        }
                        r14 = i;
                    } catch (AnnotatedException e7) {
                        e = e7;
                        r14 = list2;
                    }
                    z2 = z;
                    r15 = r14;
                } else {
                    r14 = i;
                    z2 = z;
                    r15 = r14;
                }
                if (!z2) {
                    if (e != null) {
                        throw e;
                    }
                    C18073l.startapp("No valid CRL found.", e);
                } else {
                    if (certStatus.getCertStatus() == r15) {
                        if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == r15) {
                            certStatus.setCertStatus(12);
                        }
                        if (certStatus.getCertStatus() != 12) {
                            return;
                        }
                        C11983l.remoteconfig("Certificate status could not be determined.");
                        return;
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    StringBuilder sbAdvert = AbstractC5020l.advert("Certificate revocation after " + simpleDateFormat.format(certStatus.getRevocationDate()), ", reason: ");
                    sbAdvert.append(crlReasons[certStatus.getCertStatus()]);
                    throw new AnnotatedException(sbAdvert.toString());
                }
            } catch (AnnotatedException e8) {
                C18073l.startapp("No additional CRL locations could be decoded from CRL distribution point extension.", e8);
            }
        } catch (Exception e9) {
            C18073l.startapp("CRL distribution point extension could not be read.", e9);
        }
    }

    private static Ccase getExtensionValue(X509Extension x509Extension, String str) {
        return CertPathValidatorUtilities.getExtensionValue(x509Extension, str);
    }

    private static String getUnsupportedCriticalExtensionMessage(Set set) {
        StringBuilder sb = new StringBuilder("Certificate has unsupported critical extension: [");
        Iterator it = set.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((String) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static PKIXPolicyNode prepareCertB(CertPath certPath, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, int i2) throws CertPathValidatorException {
        Exception exc;
        String str;
        Set qualifierSet;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size() - i;
        try {
            Cclass cclassInmobi = Cclass.inmobi(getExtensionValue(x509Certificate, POLICY_MAPPINGS));
            if (cclassInmobi != null) {
                HashMap map = new HashMap();
                for (int i3 = 0; i3 < cclassInmobi.size(); i3++) {
                    Cclass cclass = (Cclass) cclassInmobi.mo173throws(i3);
                    String strInmobi = ((Cfor) cclass.mo173throws(0)).inmobi();
                    String strInmobi2 = ((Cfor) cclass.mo173throws(1)).inmobi();
                    HashSet hashSet = (HashSet) map.get(strInmobi);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(strInmobi, hashSet);
                    }
                    hashSet.add(strInmobi2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    HashSet hashSet2 = (HashSet) entry.getValue();
                    if (i2 <= 0) {
                        List list = listArr[size];
                        int size2 = list.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(size2);
                            if (pKIXPolicyNode2.getValidPolicy().equals(str2)) {
                                ((PKIXPolicyNode) pKIXPolicyNode2.getParent()).removeChild(pKIXPolicyNode2);
                                list.remove(size2);
                            }
                        }
                        pKIXPolicyNode = CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
                    } else {
                        PKIXPolicyNode pKIXPolicyNodeFindValidPolicy = CertPathValidatorUtilities.findValidPolicy(listArr[size].iterator(), str2);
                        if (pKIXPolicyNodeFindValidPolicy != null) {
                            pKIXPolicyNodeFindValidPolicy.setExpectedPolicies(hashSet2);
                        } else {
                            PKIXPolicyNode pKIXPolicyNodeFindValidPolicy2 = CertPathValidatorUtilities.findValidPolicy(listArr[size].iterator(), ANY_POLICY);
                            if (pKIXPolicyNodeFindValidPolicy2 == null) {
                                continue;
                            } else {
                                try {
                                    Enumeration enumerationMo170package = Cclass.inmobi(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).mo170package();
                                    while (true) {
                                        if (!enumerationMo170package.hasMoreElements()) {
                                            qualifierSet = null;
                                            break;
                                        }
                                        try {
                                            C1314l c1314lVip = C1314l.vip(enumerationMo170package.nextElement());
                                            if (ANY_POLICY.equals(c1314lVip.f3403l.inmobi())) {
                                                try {
                                                    qualifierSet = CertPathValidatorUtilities.getQualifierSet(c1314lVip.f3402l);
                                                    break;
                                                } catch (CertPathValidatorException e) {
                                                    exc = e;
                                                    str = "Policy qualifier info set could not be decoded.";
                                                    C18073l.remoteconfig(str, exc, certPath, i);
                                                    return null;
                                                }
                                            }
                                        } catch (Exception e2) {
                                            throw new CertPathValidatorException("Policy information could not be decoded.", e2, certPath, i);
                                        }
                                    }
                                    boolean zHasCriticalExtension = CertPathValidatorUtilities.hasCriticalExtension(x509Certificate, CERTIFICATE_POLICIES);
                                    PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNodeFindValidPolicy2.getParent();
                                    if (ANY_POLICY.equals(pKIXPolicyNode3.getValidPolicy())) {
                                        PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), size, hashSet2, pKIXPolicyNode3, qualifierSet, str2, zHasCriticalExtension);
                                        pKIXPolicyNode3.addChild(pKIXPolicyNode4);
                                        listArr[size].add(pKIXPolicyNode4);
                                    }
                                } catch (AnnotatedException e3) {
                                    exc = e3;
                                    str = "Certificate policies extension could not be decoded.";
                                }
                            }
                        }
                    }
                }
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e4) {
            exc = e4;
            str = "Policy mappings extension could not be decoded.";
        }
    }

    public static void prepareNextCertA(CertPath certPath, int i) throws CertPathValidatorException {
        String str;
        try {
            Cclass cclassInmobi = Cclass.inmobi(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_MAPPINGS));
            if (cclassInmobi != null) {
                for (int i2 = 0; i2 < cclassInmobi.size(); i2++) {
                    try {
                        Cclass cclassInmobi2 = Cclass.inmobi(cclassInmobi.mo173throws(i2));
                        Cfor cforM192throws = Cfor.m192throws(cclassInmobi2.mo173throws(0));
                        Cfor cforM192throws2 = Cfor.m192throws(cclassInmobi2.mo173throws(1));
                        if (ANY_POLICY.equals(cforM192throws.inmobi())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i);
                        }
                        if (ANY_POLICY.equals(cforM192throws2.inmobi())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i);
                        }
                    } catch (Exception e) {
                        e = e;
                        str = "Policy mappings extension contents could not be decoded.";
                        C18073l.remoteconfig(str, e, certPath, i);
                        return;
                    }
                }
            }
        } catch (AnnotatedException e2) {
            e = e2;
            str = "Policy mappings extension could not be decoded.";
        }
    }

    public static void prepareNextCertG(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator) throws C1524l {
        String str;
        C5722l[] c5722lArr;
        try {
            Cclass cclassInmobi = Cclass.inmobi(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), NAME_CONSTRAINTS));
            C5722l[] c5722lArr2 = null;
            C15765l c15765lMetrica = cclassInmobi != null ? C15765l.metrica(cclassInmobi) : null;
            if (c15765lMetrica == null) {
                return;
            }
            C5722l[] c5722lArr3 = c15765lMetrica.f30947l;
            if (c5722lArr3 != null) {
                int length = c5722lArr3.length;
                c5722lArr = new C5722l[length];
                System.arraycopy(c5722lArr3, 0, c5722lArr, 0, length);
            } else {
                c5722lArr = null;
            }
            if (c5722lArr != null) {
                try {
                    pKIXNameConstraintValidator.intersectPermittedSubtree(c5722lArr);
                } catch (Exception e) {
                    e = e;
                    str = "Permitted subtrees could not be built from name constraints extension.";
                    C18073l.remoteconfig(str, e, certPath, i);
                    return;
                }
            }
            C5722l[] c5722lArr4 = c15765lMetrica.f30946l;
            if (c5722lArr4 != null) {
                int length2 = c5722lArr4.length;
                C5722l[] c5722lArr5 = new C5722l[length2];
                System.arraycopy(c5722lArr4, 0, c5722lArr5, 0, length2);
                c5722lArr2 = c5722lArr5;
            }
            if (c5722lArr2 != null) {
                for (int i2 = 0; i2 != c5722lArr2.length; i2++) {
                    try {
                        pKIXNameConstraintValidator.addExcludedSubtree(c5722lArr2[i2]);
                    } catch (Exception e2) {
                        e = e2;
                        str = "Excluded subtrees could not be built from name constraints extension.";
                        C18073l.remoteconfig(str, e, certPath, i);
                        return;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = "Name constraints extension could not be decoded.";
        }
    }

    public static int prepareNextCertH1(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertH2(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertH3(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertI1(CertPath certPath, int i, int i2) throws C1524l {
        String str;
        try {
            Cclass cclassInmobi = Cclass.inmobi(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (cclassInmobi != null) {
                Enumeration enumerationMo170package = cclassInmobi.mo170package();
                while (enumerationMo170package.hasMoreElements()) {
                    try {
                        Cfinal cfinalInmobi = Cfinal.inmobi(enumerationMo170package.nextElement());
                        if (cfinalInmobi.f821l == 0) {
                            ad adVar = Cstrictfp.f36571l;
                            AbstractC9027l.loadAd(cfinalInmobi);
                            Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
                            adVar.m230l(ccaseApplovin);
                            int iM4585strictfp = ((Cstrictfp) ccaseApplovin).m4585strictfp();
                            if (iM4585strictfp < i2) {
                                return iM4585strictfp;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str = "Policy constraints extension contents cannot be decoded.";
                        C18073l.remoteconfig(str, e, certPath, i);
                        return 0;
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            e = e2;
            str = "Policy constraints extension cannot be decoded.";
        }
    }

    public static int prepareNextCertI2(CertPath certPath, int i, int i2) throws C1524l {
        String str;
        try {
            Cclass cclassInmobi = Cclass.inmobi(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (cclassInmobi != null) {
                Enumeration enumerationMo170package = cclassInmobi.mo170package();
                while (enumerationMo170package.hasMoreElements()) {
                    try {
                        Cfinal cfinalInmobi = Cfinal.inmobi(enumerationMo170package.nextElement());
                        if (cfinalInmobi.f821l == 1) {
                            ad adVar = Cstrictfp.f36571l;
                            AbstractC9027l.loadAd(cfinalInmobi);
                            Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
                            adVar.m230l(ccaseApplovin);
                            int iM4585strictfp = ((Cstrictfp) ccaseApplovin).m4585strictfp();
                            if (iM4585strictfp < i2) {
                                return iM4585strictfp;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str = "Policy constraints extension contents cannot be decoded.";
                        C18073l.remoteconfig(str, e, certPath, i);
                        return 0;
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            e = e2;
            str = "Policy constraints extension cannot be decoded.";
        }
    }

    public static int prepareNextCertJ(CertPath certPath, int i, int i2) throws C1524l {
        int iM4585strictfp;
        try {
            Cstrictfp cstrictfpPremium = Cstrictfp.premium(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), INHIBIT_ANY_POLICY));
            return (cstrictfpPremium == null || (iM4585strictfp = cstrictfpPremium.m4585strictfp()) >= i2) ? i2 : iM4585strictfp;
        } catch (Exception e) {
            C18073l.remoteconfig("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
            return 0;
        }
    }

    public static void prepareNextCertK(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            C11144l c11144lVip = C11144l.vip(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), BASIC_CONSTRAINTS));
            if (c11144lVip == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i);
            }
            if (!c11144lVip.metrica()) {
                throw new CertPathValidatorException("Not a CA certificate", null, certPath, i);
            }
        } catch (Exception e) {
            C18073l.remoteconfig("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int prepareNextCertL(CertPath certPath, int i, int i2) throws C1524l {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i))) {
            return i2;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        C18073l.remoteconfig("Max path length not greater than zero", null, certPath, i);
        return 0;
    }

    public static int prepareNextCertM(CertPath certPath, int i, int i2) throws C1524l {
        Cstrictfp cstrictfp;
        try {
            C11144l c11144lVip = C11144l.vip(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), BASIC_CONSTRAINTS));
            return (c11144lVip == null || !c11144lVip.metrica() || (cstrictfp = c11144lVip.f22395l) == null) ? i2 : Math.min(i2, cstrictfp.m4584package());
        } catch (Exception e) {
            C18073l.remoteconfig("Basic constraints extension cannot be decoded.", e, certPath, i);
            return 0;
        }
    }

    public static void prepareNextCertN(CertPath certPath, int i) throws C1524l {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                C18073l.remoteconfig("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i);
            }
        }
    }

    public static void prepareNextCertO(CertPath certPath, int i, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new C1524l(getUnsupportedCriticalExtensionMessage(set), null, certPath, i);
        }
    }

    public static void processCRLB1(C0179l c0179l, Object obj, X509CRL x509crl) throws AnnotatedException {
        Ccase extensionValue = getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z = true;
        boolean z2 = extensionValue != null && C2275l.metrica(extensionValue).f4969l;
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            C9018l c9018l = c0179l.f1126l;
            if (c9018l != null) {
                boolean z3 = false;
                for (C12378l c12378l : c9018l.metrica()) {
                    if (c12378l.f24469l == 4) {
                        try {
                            if (Arrays.equals(c12378l.f24470l.billing().getEncoded(), encoded)) {
                                z3 = true;
                            }
                        } catch (IOException e) {
                            C18073l.startapp("CRL issuer information from distribution point cannot be decoded.", e);
                            return;
                        }
                    }
                }
                if (z3 && !z2) {
                    C11983l.remoteconfig("Distribution point contains cRLIssuer field but CRL is not indirect.");
                    return;
                } else {
                    if (!z3) {
                        C11983l.remoteconfig("CRL issuer of CRL does not match CRL issuer of distribution point.");
                        return;
                    }
                    z = z3;
                }
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z = false;
            }
            if (z) {
                return;
            }
            C11983l.remoteconfig("Cannot find matching CRL issuer for certificate.");
        } catch (IOException e2) {
            throw new AnnotatedException(AbstractC5020l.adcel(e2, new StringBuilder("Exception encoding CRL issuer: ")), e2);
        }
    }

    public static void processCRLB2(C0179l c0179l, Object obj, X509CRL x509crl) throws AnnotatedException {
        C12378l[] c12378lArrMetrica;
        try {
            C2275l c2275lMetrica = C2275l.metrica(getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (c2275lMetrica != null) {
                if (c2275lMetrica.f4968l == null) {
                    break;
                }
                C18707l c18707l = C2275l.metrica(c2275lMetrica).f4968l;
                ArrayList arrayList = new ArrayList();
                int i = c18707l.f36468l;
                Cnative cnative = c18707l.f36469l;
                int i2 = 0;
                if (i == 0) {
                    for (C12378l c12378l : C9018l.vip(cnative).metrica()) {
                        arrayList.add(c12378l);
                    }
                }
                if (c18707l.f36468l == 1) {
                    try {
                        Cclass cclassInmobi = Cclass.inmobi(PrincipalUtils.getIssuerPrincipal(x509crl));
                        int size = cclassInmobi.size();
                        appmetrica appmetricaVar = new appmetrica(size + 1, 0);
                        for (int i3 = 0; i3 < size; i3++) {
                            appmetricaVar.purchase(cclassInmobi.mo173throws(i3));
                        }
                        appmetricaVar.purchase(cnative);
                        C11138l c11138l = new C11138l(appmetricaVar);
                        c11138l.f22357l = -1;
                        arrayList.add(new C12378l(C10915l.metrica(c11138l)));
                    } catch (Exception e) {
                        C18073l.startapp("Could not read CRL issuer.", e);
                        return;
                    }
                }
                C18707l c18707l2 = c0179l.f1128l;
                C9018l c9018l = c0179l.f1126l;
                if (c18707l2 != null) {
                    int i4 = c18707l2.f36468l;
                    Cnative cnative2 = c18707l2.f36469l;
                    C12378l[] c12378lArrMetrica2 = i4 == 0 ? C9018l.vip(cnative2).metrica() : null;
                    if (i4 == 1) {
                        if (c9018l != null) {
                            c12378lArrMetrica = c9018l.metrica();
                        } else {
                            c12378lArrMetrica = new C12378l[1];
                            try {
                                c12378lArrMetrica[0] = new C12378l(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                            } catch (Exception e2) {
                                C18073l.startapp("Could not read certificate issuer.", e2);
                                return;
                            }
                        }
                        c12378lArrMetrica2 = c12378lArrMetrica;
                        for (int i5 = 0; i5 < c12378lArrMetrica2.length; i5++) {
                            Enumeration enumerationMo170package = Cclass.inmobi(c12378lArrMetrica2[i5].f24470l.billing()).mo170package();
                            appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
                            while (enumerationMo170package.hasMoreElements()) {
                                appmetricaVar2.purchase((applovin) enumerationMo170package.nextElement());
                            }
                            appmetricaVar2.purchase(cnative2);
                            C11138l c11138l2 = new C11138l(appmetricaVar2);
                            c11138l2.f22357l = -1;
                            c12378lArrMetrica2[i5] = new C12378l(C10915l.metrica(c11138l2));
                        }
                    }
                    if (c12378lArrMetrica2 != null) {
                        while (true) {
                            if (i2 < c12378lArrMetrica2.length) {
                                if (arrayList.contains(c12378lArrMetrica2[i2])) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    C11983l.remoteconfig("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    return;
                }
                if (c9018l == null) {
                    C11983l.remoteconfig("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                    return;
                }
                C12378l[] c12378lArrMetrica3 = c9018l.metrica();
                while (true) {
                    if (i2 >= c12378lArrMetrica3.length) {
                        C11983l.remoteconfig("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        return;
                    } else if (arrayList.contains(c12378lArrMetrica3[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                }
                try {
                    C11144l c11144lVip = C11144l.vip(getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (c2275lMetrica.f4967l && c11144lVip != null && c11144lVip.metrica()) {
                            C11983l.remoteconfig("CA Cert CRL only contains user certificates.");
                            return;
                        } else if (c2275lMetrica.f4965l && (c11144lVip == null || !c11144lVip.metrica())) {
                            C11983l.remoteconfig("End CRL only contains CA certificates.");
                            return;
                        }
                    }
                    if (c2275lMetrica.f4971l) {
                        C11983l.remoteconfig("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e3) {
                    C18073l.startapp("Basic constraints extension could not be decoded.", e3);
                }
            }
        } catch (Exception e4) {
            C18073l.startapp("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2) throws AnnotatedException {
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            C2275l c2275lMetrica = C2275l.metrica(getExtensionValue(x509crl2, str));
            if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                C11983l.remoteconfig("Complete CRL issuer does not match delta CRL issuer.");
                return;
            }
            try {
                C2275l c2275lMetrica2 = C2275l.metrica(getExtensionValue(x509crl, str));
                if (c2275lMetrica != null ? !c2275lMetrica.equals(c2275lMetrica2) : c2275lMetrica2 != null) {
                    C11983l.remoteconfig("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                    return;
                }
                try {
                    String str2 = AUTHORITY_KEY_IDENTIFIER;
                    Ccase extensionValue = getExtensionValue(x509crl2, str2);
                    try {
                        Ccase extensionValue2 = getExtensionValue(x509crl, str2);
                        if (extensionValue == null) {
                            C11983l.remoteconfig("CRL authority key identifier is null.");
                        } else if (extensionValue2 == null) {
                            C11983l.remoteconfig("Delta CRL authority key identifier is null.");
                        } else {
                            if (extensionValue.ad(extensionValue2)) {
                                return;
                            }
                            C11983l.remoteconfig("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                        }
                    } catch (AnnotatedException e) {
                        C18073l.startapp("Authority key identifier extension could not be extracted from delta CRL.", e);
                    }
                } catch (AnnotatedException e2) {
                    C18073l.startapp("Authority key identifier extension could not be extracted from complete CRL.", e2);
                }
            } catch (Exception e3) {
                C18073l.startapp("Issuing distribution point extension from delta CRL could not be decoded.", e3);
            }
        } catch (Exception e4) {
            C18073l.startapp("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, C0179l c0179l) throws AnnotatedException {
        C2095l c2095l;
        try {
            C2275l c2275lMetrica = C2275l.metrica(getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (c2275lMetrica != null && (c2095l = c2275lMetrica.f4970l) != null && c0179l.f1127l != null) {
                return new ReasonsMask(c0179l.f1127l).intersect(new ReasonsMask(c2095l));
            }
            if ((c2275lMetrica == null || c2275lMetrica.f4970l == null) && c0179l.f1127l == null) {
                return ReasonsMask.allReasons;
            }
            return (c0179l.f1127l == null ? ReasonsMask.allReasons : new ReasonsMask(c0179l.f1127l)).intersect(c2275lMetrica == null ? ReasonsMask.allReasons : new ReasonsMask(c2275lMetrica.f4970l));
        } catch (Exception e) {
            C18073l.startapp("Issuing distribution point extension could not be decoded.", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, C5384l c5384l, List list, InterfaceC12575l interfaceC12575l) throws AnnotatedException {
        boolean zPurchase;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            C11618l c11618l = new C11618l((CertSelector) x509CertSelector.clone());
            LinkedHashSet<X509Certificate> linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, c11618l, c5384l.f11527l);
                CertPathValidatorUtilities.findCertificates(linkedHashSet, c11618l, c5384l.f11525l.getCertStores());
                linkedHashSet.add(x509Certificate);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (X509Certificate x509Certificate2 : linkedHashSet) {
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            C15855l c15855l = new C15855l(c5384l);
                            c15855l.f31111l = new C11618l((CertSelector) x509CertSelector2.clone());
                            if (list.contains(x509Certificate2)) {
                                c15855l.f31109l = false;
                            } else {
                                c15855l.f31109l = true;
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new C14155l(new C13698l(new C5384l(c15855l)))).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, interfaceC12575l));
                        } catch (CertPathBuilderException e) {
                            C18073l.startapp("CertPath for CRL signer failed to validate.", e);
                            return null;
                        } catch (CertPathValidatorException e2) {
                            C18073l.startapp("Public key of issuer certificate of CRL could not be retrieved.", e2);
                            return null;
                        } catch (Exception e3) {
                            throw new AnnotatedException(e3.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null) {
                        try {
                            String strLoadAd = AbstractC8151l.loadAd("org.bouncycastle.x509.allow_ca_without_crl_sign");
                            zPurchase = strLoadAd == null ? true : AbstractC8151l.purchase(strLoadAd);
                        } catch (AccessControlException unused) {
                            zPurchase = false;
                        }
                        if (zPurchase) {
                            hashSet.add(arrayList2.get(i));
                        } else {
                            annotatedException = new AnnotatedException("No key usage extension on CRL issuer certificate.");
                        }
                    } else if (keyUsage.length <= 6 || !keyUsage[6]) {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    } else {
                        hashSet.add(arrayList2.get(i));
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    C11983l.remoteconfig("Cannot find a valid issuer certificate.");
                    return null;
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e4) {
                C18073l.startapp("Issuer certificate for CRL cannot be searched.", e4);
                return null;
            }
        } catch (IOException e5) {
            C18073l.startapp("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
            return null;
        }
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        C18073l.startapp("Cannot verify CRL.", e);
        return null;
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        C18073l.startapp("Cannot verify delta CRL.", e);
        return null;
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    public static void processCertA(CertPath certPath, C5384l c5384l, Date date, InterfaceC9333l interfaceC9333l, int i, PublicKey publicKey, boolean z, C10915l c10915l, X509Certificate x509Certificate) throws C1524l {
        String str;
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i);
        if (!z) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, c5384l.f11525l.getSigProvider());
            } catch (GeneralSecurityException e) {
                e = e;
                str = "Could not validate certificate signature.";
                C18073l.remoteconfig(str, e, certPath, i);
            }
        }
        try {
            c5384l.getClass();
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, 0, certPath, i);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (interfaceC9333l != null) {
                    interfaceC9333l.initialize(new C1405l(c5384l, validCertDateFromValidityModel, certPath, i, x509Certificate, publicKey));
                    interfaceC9333l.check(x509Certificate2);
                }
                C10915l issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (issuerPrincipal.equals(c10915l)) {
                    return;
                }
                throw new C1524l("IssuerName(" + issuerPrincipal + ") does not match SubjectName(" + c10915l + ") of signing certificate.", null, certPath, i);
            } catch (CertificateExpiredException e2) {
                throw new C1524l("Could not validate certificate: " + e2.getMessage(), e2, certPath, i);
            } catch (CertificateNotYetValidException e3) {
                throw new C1524l("Could not validate certificate: " + e3.getMessage(), e3, certPath, i);
            }
        } catch (AnnotatedException e4) {
            e = e4;
            str = "Could not validate time of certificate.";
            C18073l.remoteconfig(str, e, certPath, i);
        }
    }

    public static void processCertBC(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        if ((size - i < size || z) && CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
            return;
        }
        try {
            Cclass cclassInmobi = Cclass.inmobi(PrincipalUtils.getSubjectPrincipal(x509Certificate));
            try {
                pKIXNameConstraintValidator.checkPermittedDN(cclassInmobi);
                pKIXNameConstraintValidator.checkExcludedDN(cclassInmobi);
                try {
                    C9018l c9018lVip = C9018l.vip(getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                    C10915l c10915lMetrica = C10915l.metrica(cclassInmobi);
                    Cfor cfor = C9548l.f19457l;
                    C16138l[] c16138lArr = c10915lMetrica.f22039l;
                    int length = c16138lArr.length;
                    C16138l[] c16138lArr2 = new C16138l[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 != c16138lArr.length; i3++) {
                        C16138l c16138l = c16138lArr[i3];
                        Cinterface cinterface = c16138l.f31596l;
                        int length2 = cinterface.f842l.length;
                        for (int i4 = 0; i4 < length2; i4++) {
                            if (C8047l.vip(cinterface.f842l[i4]).f16751l.ad(cfor)) {
                                c16138lArr2[i2] = c16138l;
                                i2++;
                                break;
                            }
                        }
                    }
                    if (i2 < length) {
                        C16138l[] c16138lArr3 = new C16138l[i2];
                        System.arraycopy(c16138lArr2, 0, c16138lArr3, 0, i2);
                        c16138lArr2 = c16138lArr3;
                    }
                    for (int i5 = 0; i5 != c16138lArr2.length; i5++) {
                        String strMopub = ((Cdefault) c16138lArr2[i5].vip().f16750l).mopub();
                        try {
                            pKIXNameConstraintValidator.checkPermittedEmail(strMopub);
                            pKIXNameConstraintValidator.checkExcludedEmail(strMopub);
                        } catch (PKIXNameConstraintValidatorException e) {
                            throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                        }
                    }
                    if (c9018lVip != null) {
                        try {
                            C12378l[] c12378lArrMetrica = c9018lVip.metrica();
                            for (int i6 = 0; i6 < c12378lArrMetrica.length; i6++) {
                                try {
                                    pKIXNameConstraintValidator.checkPermitted(c12378lArrMetrica[i6]);
                                    pKIXNameConstraintValidator.checkExcluded(c12378lArrMetrica[i6]);
                                } catch (PKIXNameConstraintValidatorException e2) {
                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                }
                            }
                        } catch (Exception e3) {
                            throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                        }
                    }
                } catch (Exception e4) {
                    throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                }
            } catch (PKIXNameConstraintValidatorException e5) {
                throw new CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
            }
        } catch (Exception e6) {
            throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
        }
    }

    public static PKIXPolicyNode processCertD(CertPath certPath, int i, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i2, boolean z) throws C1524l {
        String str;
        String strInmobi;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i3 = size - i;
        try {
            Cclass cclassInmobi = Cclass.inmobi(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (cclassInmobi == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration enumerationMo170package = cclassInmobi.mo170package();
            HashSet hashSet = new HashSet();
            while (enumerationMo170package.hasMoreElements()) {
                C1314l c1314lVip = C1314l.vip(enumerationMo170package.nextElement());
                Cfor cfor = c1314lVip.f3403l;
                hashSet.add(cfor.inmobi());
                if (!ANY_POLICY.equals(cfor.inmobi())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(c1314lVip.f3402l);
                        if (!CertPathValidatorUtilities.processCertD1i(i3, listArr, cfor, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i3, listArr, cfor, qualifierSet);
                        }
                    } catch (CertPathValidatorException e) {
                        e = e;
                        str = "Policy qualifier info set could not be built.";
                        C18073l.remoteconfig(str, e, certPath, i);
                        return null;
                    }
                }
            }
            if (set.isEmpty() || set.contains(ANY_POLICY)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i2 > 0 || ((i3 < size || z) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration enumerationMo170package2 = cclassInmobi.mo170package();
                while (enumerationMo170package2.hasMoreElements()) {
                    C1314l c1314lVip2 = C1314l.vip(enumerationMo170package2.nextElement());
                    if (ANY_POLICY.equals(c1314lVip2.f3403l.inmobi())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(c1314lVip2.f3402l);
                        List list = listArr[i3 - 1];
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i4);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    strInmobi = (String) obj2;
                                } else if (obj2 instanceof Cfor) {
                                    strInmobi = ((Cfor) obj2).inmobi();
                                }
                                String str2 = strInmobi;
                                if (CertPathValidatorUtilities.findValidPolicy(pKIXPolicyNode2.getChildren(), str2) == null) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i3, hashSet3, pKIXPolicyNode2, qualifierSet2, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i3].add(pKIXPolicyNode3);
                                }
                            }
                        }
                        break;
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNodeRemoveChildlessPolicyNodes = CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, i3);
            if (CertPathValidatorUtilities.hasCriticalExtension(x509Certificate, CERTIFICATE_POLICIES)) {
                List list2 = listArr[i3];
                for (int i5 = 0; i5 < list2.size(); i5++) {
                    ((PKIXPolicyNode) list2.get(i5)).setCritical(true);
                }
            }
            return pKIXPolicyNodeRemoveChildlessPolicyNodes;
        } catch (AnnotatedException e2) {
            e = e2;
            str = "Could not read certificate policies extension from certificate.";
        }
    }

    public static PKIXPolicyNode processCertE(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode) throws C1524l {
        try {
            if (Cclass.inmobi(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e) {
            C18073l.remoteconfig("Could not read certificate policies extension from certificate.", e, certPath, i);
            return null;
        }
    }

    public static void processCertF(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode, int i2) throws C1524l {
        if (i2 > 0 || pKIXPolicyNode != null) {
            return;
        }
        C18073l.remoteconfig("No valid policy tree found when one expected.", null, certPath, i);
    }

    public static int wrapupCertA(int i, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i == 0) ? i : i - 1;
    }

    public static int wrapupCertB(CertPath certPath, int i, int i2) throws C1524l {
        String str;
        try {
            Cclass cclassInmobi = Cclass.inmobi(getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (cclassInmobi != null) {
                Enumeration enumerationMo170package = cclassInmobi.mo170package();
                while (enumerationMo170package.hasMoreElements()) {
                    Cfinal cfinal = (Cfinal) enumerationMo170package.nextElement();
                    if (cfinal.f821l == 0) {
                        try {
                            ad adVar = Cstrictfp.f36571l;
                            AbstractC9027l.loadAd(cfinal);
                            Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                            adVar.m230l(ccaseApplovin);
                            if (((Cstrictfp) ccaseApplovin).m4585strictfp() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            e = e;
                            str = "Policy constraints requireExplicitPolicy field could not be decoded.";
                            C18073l.remoteconfig(str, e, certPath, i);
                            return 0;
                        }
                    }
                }
            }
            return i2;
        } catch (AnnotatedException e2) {
            e = e2;
            str = "Policy constraints could not be decoded.";
        }
    }

    public static void wrapupCertF(CertPath certPath, int i, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new C1524l(e.getMessage(), e, certPath, i);
            } catch (Exception e2) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new C1524l(getUnsupportedCriticalExtensionMessage(set), null, certPath, i);
        }
    }

    public static PKIXPolicyNode wrapupCertG(CertPath certPath, C5384l c5384l, Set set, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws C1524l {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (!c5384l.f11525l.isExplicitPolicyRequired()) {
                return null;
            }
            C18073l.remoteconfig("Explicit policy requested but none available.", null, certPath, i);
            return null;
        }
        if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
            HashSet<PKIXPolicyNode> hashSet = new HashSet();
            for (List list : listArr) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i2);
                    if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) children.next();
                            if (!ANY_POLICY.equals(pKIXPolicyNode3.getValidPolicy())) {
                                hashSet.add(pKIXPolicyNode3);
                            }
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode4 : hashSet) {
                if (!set.contains(pKIXPolicyNode4.getValidPolicy())) {
                    pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                }
            }
            return CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
        }
        if (!c5384l.f11525l.isExplicitPolicyRequired()) {
            return pKIXPolicyNode;
        }
        if (set2.isEmpty()) {
            C18073l.remoteconfig("Explicit policy requested but none available.", null, certPath, i);
            return null;
        }
        HashSet hashSet2 = new HashSet();
        for (List list2 : listArr) {
            for (int i3 = 0; i3 < list2.size(); i3++) {
                PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i3);
                if (ANY_POLICY.equals(pKIXPolicyNode5.getValidPolicy())) {
                    Iterator children2 = pKIXPolicyNode5.getChildren();
                    while (children2.hasNext()) {
                        hashSet2.add(children2.next());
                    }
                }
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            set2.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
        }
        return CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
    }
}
