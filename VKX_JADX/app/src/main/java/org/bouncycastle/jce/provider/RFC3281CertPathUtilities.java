package org.bouncycastle.jce.provider;

import defpackage.AbstractC15560l;
import defpackage.AbstractC5020l;
import defpackage.C0179l;
import defpackage.C11618l;
import defpackage.C11983l;
import defpackage.C12378l;
import defpackage.C13698l;
import defpackage.C1405l;
import defpackage.C14155l;
import defpackage.C1442l;
import defpackage.C1524l;
import defpackage.C15855l;
import defpackage.C1781l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C18707l;
import defpackage.C3368l;
import defpackage.C5384l;
import defpackage.C5427l;
import defpackage.C5970l;
import defpackage.C7823l;
import defpackage.C9018l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC17473l;
import defpackage.InterfaceC9124l;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertSelector;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = C18229l.f35719l.inmobi();
    private static final String NO_REV_AVAIL = C18229l.f35732l.inmobi();
    private static final String CRL_DISTRIBUTION_POINTS = C18229l.f35730l.inmobi();
    private static final String AUTHORITY_INFO_ACCESS = C18229l.f35712l.inmobi();

    public static void additionalChecks(InterfaceC9124l interfaceC9124l, Set set, Set set2) throws CertPathValidatorException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((C5427l) interfaceC9124l).loadAd(str) != null) {
                throw new CertPathValidatorException(AbstractC15560l.Signature("Attribute certificate contains prohibited attribute: ", str, "."));
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (((C5427l) interfaceC9124l).loadAd(str2) == null) {
                throw new CertPathValidatorException(AbstractC15560l.Signature("Attribute certificate does not contain necessary attribute: ", str2, "."));
            }
        }
    }

    private static void checkCRL(C0179l c0179l, InterfaceC9124l interfaceC9124l, C5384l c5384l, Date date, Date date2, X509Certificate x509Certificate, CertStatus certStatus, ReasonsMask reasonsMask, List list, InterfaceC12575l interfaceC12575l) throws AnnotatedException {
        C5427l c5427l;
        C5427l c5427l2 = (C5427l) interfaceC9124l;
        if (c5427l2.getExtensionValue(C3368l.f7170l.inmobi()) != null) {
            return;
        }
        if (date2.getTime() > date.getTime()) {
            C11983l.remoteconfig("Validation time is in future.");
            return;
        }
        C5384l c5384l2 = c5384l;
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(new C1405l(c5384l, date2, null, -1, x509Certificate, null), c0179l, c5427l2, c5384l2, date2).iterator();
        boolean z = false;
        AnnotatedException e = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                CertPathValidatorUtilities.checkCRLCriticalExtensions(x509crl, "CRL contains unsupported critical extensions.");
                ReasonsMask reasonsMaskProcessCRLD = RFC3280CertPathUtilities.processCRLD(x509crl, c0179l);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    c5427l = c5427l2;
                    try {
                        RFC3280CertPathUtilities.processCRLG(x509crl, RFC3280CertPathUtilities.processCRLF(x509crl, c5427l, null, null, c5384l2, list, interfaceC12575l));
                        c5384l.getClass();
                        if (c5427l.f11630l.getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        RFC3280CertPathUtilities.processCRLB1(c0179l, c5427l, x509crl);
                        RFC3280CertPathUtilities.processCRLB2(c0179l, c5427l, x509crl);
                        RFC3280CertPathUtilities.processCRLJ(date2, x509crl, c5427l, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(reasonsMaskProcessCRLD);
                        z = true;
                    } catch (AnnotatedException e2) {
                        e = e2;
                    }
                    c5384l2 = c5384l;
                    c5427l2 = c5427l;
                } else {
                    continue;
                }
            } catch (AnnotatedException e3) {
                e = e3;
                c5427l = c5427l2;
            }
        }
        if (!z) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[PHI: r9 r10 r11
  0x0119: PHI (r9v9 org.bouncycastle.jce.provider.CertStatus) = 
  (r9v8 org.bouncycastle.jce.provider.CertStatus)
  (r9v11 org.bouncycastle.jce.provider.CertStatus)
  (r9v8 org.bouncycastle.jce.provider.CertStatus)
 binds: [B:48:0x00d0, B:63:0x0114, B:50:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r10v1 org.bouncycastle.jce.provider.ReasonsMask) = 
  (r10v0 org.bouncycastle.jce.provider.ReasonsMask)
  (r10v3 org.bouncycastle.jce.provider.ReasonsMask)
  (r10v0 org.bouncycastle.jce.provider.ReasonsMask)
 binds: [B:48:0x00d0, B:63:0x0114, B:50:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r11v3 org.bouncycastle.jce.provider.AnnotatedException) = 
  (r11v2 org.bouncycastle.jce.provider.AnnotatedException)
  (r11v5 org.bouncycastle.jce.provider.AnnotatedException)
  (r11v2 org.bouncycastle.jce.provider.AnnotatedException)
 binds: [B:48:0x00d0, B:63:0x0114, B:50:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    public static void checkCRLs(InterfaceC9124l interfaceC9124l, C5384l c5384l, Date date, Date date2, X509Certificate x509Certificate, List list, InterfaceC12575l interfaceC12575l) throws CertPathValidatorException {
        boolean z;
        C5427l c5427l;
        CertStatus certStatus;
        AnnotatedException annotatedException;
        C5427l c5427l2;
        CertStatus certStatus2;
        int i;
        C0179l[] c0179lArr;
        if (c5384l.f11529l) {
            C5427l c5427l3 = (C5427l) interfaceC9124l;
            if (c5427l3.getExtensionValue(NO_REV_AVAIL) != null) {
                if (c5427l3.getExtensionValue(CRL_DISTRIBUTION_POINTS) != null || c5427l3.getExtensionValue(AUTHORITY_INFO_ACCESS) != null) {
                    throw new CertPathValidatorException("No rev avail extension is set, but also an AC revocation pointer.");
                }
                return;
            }
            try {
                C1781l c1781lMetrica = C1781l.metrica(CertPathValidatorUtilities.getExtensionValue(c5427l3, CRL_DISTRIBUTION_POINTS));
                Date date3 = date2;
                InterfaceC12575l interfaceC12575l2 = interfaceC12575l;
                try {
                    List<InterfaceC17473l> additionalStoresFromCRLDistributionPoint = CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(c1781lMetrica, c5384l, date3, interfaceC12575l2);
                    C15855l c15855l = new C15855l(c5384l);
                    Iterator<InterfaceC17473l> it = additionalStoresFromCRLDistributionPoint.iterator();
                    while (it.hasNext()) {
                        ((ArrayList) c15855l.f31107l).add((InterfaceC17473l) additionalStoresFromCRLDistributionPoint);
                    }
                    C5384l c5384l2 = new C5384l(c15855l);
                    CertStatus certStatus3 = new CertStatus();
                    ReasonsMask reasonsMask = new ReasonsMask();
                    boolean z2 = true;
                    int i2 = 0;
                    if (c1781lMetrica != null) {
                        try {
                            C0179l[] c0179lArrVip = c1781lMetrica.vip();
                            z = false;
                            AnnotatedException annotatedException2 = null;
                            while (i2 < c0179lArrVip.length && certStatus3.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
                                int i3 = i2;
                                C5384l c5384l3 = c5384l2;
                                try {
                                    C0179l c0179l = c0179lArrVip[i3];
                                    i = i3;
                                    InterfaceC12575l interfaceC12575l3 = interfaceC12575l2;
                                    Date date4 = date3;
                                    certStatus2 = certStatus3;
                                    c5427l2 = c5427l3;
                                    c0179lArr = c0179lArrVip;
                                    try {
                                        checkCRL(c0179l, c5427l2, c5384l3, date, date4, x509Certificate, certStatus2, reasonsMask, list, interfaceC12575l3);
                                        z = true;
                                    } catch (AnnotatedException e) {
                                        e = e;
                                        annotatedException2 = new AnnotatedException("No valid CRL for distribution point found.", e);
                                    }
                                } catch (AnnotatedException e2) {
                                    e = e2;
                                    c5427l2 = c5427l3;
                                    certStatus2 = certStatus3;
                                    i = i3;
                                    c0179lArr = c0179lArrVip;
                                }
                                i2 = i + 1;
                                c5384l2 = c5384l3;
                                c0179lArrVip = c0179lArr;
                                c5427l3 = c5427l2;
                                certStatus3 = certStatus2;
                                date3 = date2;
                                interfaceC12575l2 = interfaceC12575l;
                            }
                            c5427l = c5427l3;
                            certStatus = certStatus3;
                            annotatedException = annotatedException2;
                        } catch (Exception e3) {
                            throw new C1524l("Distribution points could not be read.", e3);
                        }
                    } else {
                        c5427l = c5427l3;
                        certStatus = certStatus3;
                        z = false;
                        annotatedException = null;
                    }
                    if (certStatus.getCertStatus() == 11) {
                        try {
                            if (reasonsMask.isAllReasons()) {
                                z2 = z;
                            } else {
                                try {
                                    CertStatus certStatus4 = certStatus;
                                    try {
                                        checkCRL(new C0179l(new C18707l(new C9018l(new C12378l(4, PrincipalUtils.getIssuerPrincipal(c5427l))))), c5427l, c5384l, date, date2, x509Certificate, certStatus4, reasonsMask, list, interfaceC12575l);
                                        certStatus = certStatus4;
                                        reasonsMask = reasonsMask;
                                    } catch (AnnotatedException e4) {
                                        e = e4;
                                        certStatus = certStatus4;
                                        reasonsMask = reasonsMask;
                                        annotatedException = new AnnotatedException("No valid CRL for distribution point found.", e);
                                        z2 = z;
                                    }
                                } catch (Exception e5) {
                                    throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e5);
                                }
                            }
                        } catch (AnnotatedException e6) {
                            e = e6;
                        }
                    } else {
                        z2 = z;
                    }
                    if (!z2) {
                        throw new C1524l("No valid CRL found.", annotatedException);
                    }
                    if (certStatus.getCertStatus() != 11) {
                        StringBuilder sbAdvert = AbstractC5020l.advert("Attribute certificate revocation after " + certStatus.getRevocationDate(), ", reason: ");
                        sbAdvert.append(RFC3280CertPathUtilities.crlReasons[certStatus.getCertStatus()]);
                        throw new CertPathValidatorException(sbAdvert.toString());
                    }
                    if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == 11) {
                        certStatus.setCertStatus(12);
                    }
                    if (certStatus.getCertStatus() == 12) {
                        throw new CertPathValidatorException("Attribute certificate status could not be determined.");
                    }
                } catch (AnnotatedException e7) {
                    throw new CertPathValidatorException("No additional CRL locations could be decoded from CRL distribution point extension.", e7);
                }
            } catch (AnnotatedException e8) {
                throw new CertPathValidatorException("CRL distribution point extension could not be read.", e8);
            }
        }
    }

    public static CertPath processAttrCert1(InterfaceC9124l interfaceC9124l, C5384l c5384l) throws CertPathValidatorException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5427l c5427l = (C5427l) interfaceC9124l;
        C7823l c7823l = c5427l.amazon().f3627l.f33333l;
        if ((c7823l != null ? C1442l.loadAd(c7823l.f16349l) : null) != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            C7823l c7823l2 = c5427l.amazon().f3627l.f33333l;
            x509CertSelector.setSerialNumber(c7823l2 != null ? c7823l2.f16348l.appmetrica() : null);
            C7823l c7823l3 = c5427l.amazon().f3627l.f33333l;
            for (Principal principal : c7823l3 != null ? C1442l.loadAd(c7823l3.f16349l) : null) {
                try {
                    if (principal instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) principal).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new C11618l((CertSelector) x509CertSelector.clone()), c5384l.f11525l.getCertStores());
                } catch (IOException e) {
                    throw new C1524l("Unable to encode X500 principal.", e);
                } catch (AnnotatedException e2) {
                    throw new C1524l("Public key certificate for attribute certificate cannot be searched.", e2);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (c5427l.amazon().yandex() != null) {
            C5970l c5970l = new C5970l();
            for (Principal principal2 : c5427l.amazon().yandex()) {
                try {
                    if (principal2 instanceof X500Principal) {
                        c5970l.setIssuer(((X500Principal) principal2).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new C11618l((CertSelector) c5970l.clone()), c5384l.f11525l.getCertStores());
                } catch (IOException e3) {
                    throw new C1524l("Unable to encode X500 principal.", e3);
                } catch (AnnotatedException e4) {
                    throw new C1524l("Public key certificate for attribute certificate cannot be searched.", e4);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        C15855l c15855l = new C15855l(c5384l);
        Iterator it = linkedHashSet.iterator();
        C1524l c1524l = null;
        CertPathBuilderResult certPathBuilderResultBuild = null;
        while (it.hasNext()) {
            C5970l c5970l2 = new C5970l();
            c5970l2.setCertificate((X509Certificate) it.next());
            c15855l.f31111l = new C11618l((CertSelector) c5970l2.clone());
            try {
                try {
                    certPathBuilderResultBuild = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new C14155l(new C13698l(new C5384l(c15855l))));
                } catch (InvalidAlgorithmParameterException e5) {
                    C18073l.license(e5.getMessage());
                    return null;
                } catch (CertPathBuilderException e6) {
                    c1524l = new C1524l("Certification path for public key certificate of attribute certificate could not be built.", e6);
                }
            } catch (NoSuchAlgorithmException e7) {
                throw new C1524l("Support class could not be created.", e7);
            } catch (NoSuchProviderException e8) {
                throw new C1524l("Support class could not be created.", e8);
            }
        }
        if (c1524l == null) {
            return certPathBuilderResultBuild.getCertPath();
        }
        throw c1524l;
    }

    public static CertPathValidatorResult processAttrCert2(CertPath certPath, C5384l c5384l) throws C1524l {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, c5384l);
            } catch (InvalidAlgorithmParameterException e) {
                C18073l.license(e.getMessage());
                return null;
            } catch (CertPathValidatorException e2) {
                throw new C1524l("Certification path for issuer certificate of attribute certificate could not be validated.", e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new C1524l("Support class could not be created.", e3);
        } catch (NoSuchProviderException e4) {
            throw new C1524l("Support class could not be created.", e4);
        }
    }

    public static void processAttrCert3(X509Certificate x509Certificate, C5384l c5384l) throws CertPathValidatorException {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && ((keyUsage.length <= 0 || !keyUsage[0]) && (keyUsage.length <= 1 || !keyUsage[1]))) {
            throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
        }
        if (x509Certificate.getBasicConstraints() != -1) {
            throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
        }
    }

    public static void processAttrCert4(X509Certificate x509Certificate, Set set) throws CertPathValidatorException {
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            if (x509Certificate.getSubjectX500Principal().getName("RFC2253").equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                z = true;
            }
        }
        if (!z) {
            throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
        }
    }

    public static void processAttrCert5(InterfaceC9124l interfaceC9124l, Date date) throws C1524l {
        try {
            ((C5427l) interfaceC9124l).yandex(date);
        } catch (CertificateExpiredException e) {
            throw new C1524l("Attribute certificate is not valid.", e);
        } catch (CertificateNotYetValidException e2) {
            throw new C1524l("Attribute certificate is not valid.", e2);
        }
    }

    public static void processAttrCert7(InterfaceC9124l interfaceC9124l, CertPath certPath, CertPath certPath2, C5384l c5384l, Set set) throws CertPathValidatorException {
        C5427l c5427l = (C5427l) interfaceC9124l;
        HashSet hashSetCrashlytics = c5427l.crashlytics(true);
        String str = TARGET_INFORMATION;
        if (hashSetCrashlytics.contains(str)) {
            try {
                Ccase extensionValue = CertPathValidatorUtilities.getExtensionValue(c5427l, str);
                if (extensionValue != null) {
                    Cclass.inmobi(extensionValue);
                }
            } catch (IllegalArgumentException e) {
                throw new C1524l("Target information extension could not be read.", e);
            } catch (AnnotatedException e2) {
                throw new C1524l("Target information extension could not be read.", e2);
            }
        }
        hashSetCrashlytics.remove(str);
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        if (hashSetCrashlytics.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + hashSetCrashlytics);
    }
}
