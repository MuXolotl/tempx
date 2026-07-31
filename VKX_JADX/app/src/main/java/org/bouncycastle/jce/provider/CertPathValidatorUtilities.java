package org.bouncycastle.jce.provider;

import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC8151l;
import defpackage.C0179l;
import defpackage.C10198l;
import defpackage.C10915l;
import defpackage.C11618l;
import defpackage.C11983l;
import defpackage.C12378l;
import defpackage.C1405l;
import defpackage.C14155l;
import defpackage.C14776l;
import defpackage.C1524l;
import defpackage.C17029l;
import defpackage.C17772l;
import defpackage.C1781l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C18707l;
import defpackage.C18725l;
import defpackage.C3558l;
import defpackage.C5384l;
import defpackage.C5417l;
import defpackage.C5427l;
import defpackage.C5836l;
import defpackage.C7972l;
import defpackage.C9018l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cdefault;
import defpackage.Cfor;
import defpackage.Cpackage;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.InterfaceC12085l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC14413l;
import defpackage.InterfaceC17473l;
import defpackage.InterfaceC9124l;
import defpackage.applovin;
import defpackage.inmobi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final String CERTIFICATE_POLICIES = C18229l.f35723l.inmobi();
    protected static final String BASIC_CONSTRAINTS = C18229l.f35714l.inmobi();
    protected static final String POLICY_MAPPINGS = C18229l.f35718l.inmobi();
    protected static final String SUBJECT_ALTERNATIVE_NAME = C18229l.f35724l.inmobi();
    protected static final String NAME_CONSTRAINTS = C18229l.f35713l.inmobi();
    protected static final String KEY_USAGE = C18229l.f35725l.inmobi();
    protected static final String INHIBIT_ANY_POLICY = C18229l.f35715l.inmobi();
    protected static final String ISSUING_DISTRIBUTION_POINT = C18229l.f35729l.inmobi();
    protected static final String DELTA_CRL_INDICATOR = C18229l.f35722l.inmobi();
    protected static final String POLICY_CONSTRAINTS = C18229l.f35731l.inmobi();
    protected static final String FRESHEST_CRL = C18229l.f35716l.inmobi();
    protected static final String CRL_DISTRIBUTION_POINTS = C18229l.f35730l.inmobi();
    protected static final String AUTHORITY_KEY_IDENTIFIER = C18229l.f35721l.inmobi();
    protected static final String CRL_NUMBER = C18229l.f35717l.inmobi();
    protected static final String REASON_CODE = C18229l.f35727l.inmobi();
    static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    public static void checkCRLCriticalExtensions(X509CRL x509crl, String str) throws AnnotatedException {
        int size;
        if (x509crl.hasUnsupportedCriticalExtension()) {
            C11983l.remoteconfig(str);
            return;
        }
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null || (size = criticalExtensionOIDs.size()) <= 0) {
            return;
        }
        if (criticalExtensionOIDs.contains(ISSUING_DISTRIBUTION_POINT)) {
            size--;
        }
        if (criticalExtensionOIDs.contains(DELTA_CRL_INDICATOR)) {
            size--;
        }
        if (size <= 0) {
            return;
        }
        C11983l.remoteconfig(str);
    }

    public static void checkCRLEntryCriticalExtensions(X509CRLEntry x509CRLEntry, String str) throws AnnotatedException {
        if (x509CRLEntry.hasUnsupportedCriticalExtension()) {
            C11983l.remoteconfig(str);
        }
    }

    public static void checkCRLsNotEmpty(C1405l c1405l, Set set, Object obj) throws RecoverableCertPathValidatorException {
        if (set.isEmpty()) {
            if (obj instanceof InterfaceC9124l) {
                throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + ((C5427l) ((InterfaceC9124l) obj)).purchase().yandex()[0] + "\"", null, c1405l.crashlytics, c1405l.amazon);
            }
            throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + C5836l.f12290l.yandex(PrincipalUtils.getIssuerPrincipal((X509Certificate) obj)) + "\"", null, c1405l.crashlytics, c1405l.amazon);
        }
    }

    public static void findCertificates(Set set, C11618l c11618l, List list) throws AnnotatedException {
        for (Object obj : list) {
            if (obj instanceof InterfaceC14413l) {
                set.addAll(((InterfaceC14413l) obj).getMatches(c11618l));
            } else {
                try {
                    set.addAll(((CertStore) obj).getCertificates(new C17772l(c11618l)));
                } catch (CertStoreException e) {
                    C18073l.startapp("Problem while picking certificates from certificate store.", e);
                    return;
                }
            }
        }
    }

    public static Collection findIssuerCerts(X509Certificate x509Certificate, List<CertStore> list, List<Object> list2) throws AnnotatedException {
        String str;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509Certificate).getEncoded());
            C11618l c11618l = new C11618l((CertSelector) x509CertSelector.clone());
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                findCertificates(linkedHashSet, c11618l, list);
                findCertificates(linkedHashSet, c11618l, list2);
                return linkedHashSet;
            } catch (AnnotatedException e) {
                e = e;
                str = "Issuer certificate cannot be searched.";
                C18073l.startapp(str, e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            str = "Subject criteria for certificate selector to find issuer certificate could not be set.";
        }
    }

    public static Collection findTargets(C14155l c14155l) throws CertPathBuilderException {
        C5384l c5384l = c14155l.f27680l;
        C11618l c11618l = c5384l.f11524l;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            findCertificates(linkedHashSet, c11618l, c5384l.f11527l);
            findCertificates(linkedHashSet, c11618l, c5384l.f11525l.getCertStores());
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
            CertSelector certSelector = c11618l.f23340l;
            X509Certificate certificate = certSelector instanceof X509CertSelector ? ((X509CertSelector) certSelector).getCertificate() : null;
            if (certificate != null) {
                return Collections.singleton(certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (AnnotatedException e) {
            throw new C5417l("Error finding target certificate.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c A[PHI: r5
  0x003c: PHI (r5v5 lًٌُ) = (r5v1 lًٌُ), (r5v1 lًٌُ), (r5v1 lًٌُ), (r5v2 lًٌُ), (r5v2 lًٌُ), (r5v1 lًٌُ) binds: [B:13:0x0042, B:15:0x0048, B:17:0x004e, B:34:0x003c, B:21:0x006a, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception e = null;
        C10915l c10915lMetrica = null;
        PublicKey cAPublicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    cAPublicKey = trustAnchor.getTrustedCert().getPublicKey();
                } else {
                    trustAnchor = null;
                }
            } else if (trustAnchor.getCA() == null || trustAnchor.getCAName() == null || trustAnchor.getCAPublicKey() == null) {
                trustAnchor = null;
            } else {
                if (c10915lMetrica == null) {
                    c10915lMetrica = C10915l.metrica(issuerX500Principal.getEncoded());
                }
                try {
                    if (c10915lMetrica.equals(C10915l.metrica(trustAnchor.getCA().getEncoded()))) {
                        cAPublicKey = trustAnchor.getCAPublicKey();
                    } else {
                        trustAnchor = null;
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            if (cAPublicKey != null) {
                try {
                    verifyX509Certificate(x509Certificate, cAPublicKey, str);
                } catch (Exception e2) {
                    e = e2;
                    trustAnchor = null;
                    cAPublicKey = null;
                }
            }
        }
        if (trustAnchor != null || e == null) {
            return trustAnchor;
        }
        C18073l.startapp("TrustAnchor found but certificate validation failed.", e);
        return null;
    }

    public static PKIXPolicyNode findValidPolicy(Iterator it, String str) {
        while (it.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) it.next();
            if (str.equals(pKIXPolicyNode.getValidPolicy())) {
                return pKIXPolicyNode;
            }
        }
        return null;
    }

    public static List<Object> getAdditionalStoresFromAltNames(byte[] bArr, Map<C12378l, Object> map) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        C12378l[] c12378lArrMetrica = C9018l.vip(Cthrow.premium(bArr).f36593l).metrica();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != c12378lArrMetrica.length; i++) {
            if (map.get(c12378lArrMetrica[i]) != null) {
                C18725l.loadAd();
                return null;
            }
        }
        return arrayList;
    }

    public static List<InterfaceC17473l> getAdditionalStoresFromCRLDistributionPoint(C1781l c1781l, C5384l c5384l, Date date, InterfaceC12575l interfaceC12575l) throws AnnotatedException {
        if (c1781l == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            C0179l[] c0179lArrVip = c1781l.vip();
            ArrayList arrayList = new ArrayList();
            Map map = c5384l.f11523l;
            if (!map.isEmpty()) {
                for (C0179l c0179l : c0179lArrVip) {
                    C18707l c18707l = c0179l.f1128l;
                    if (c18707l != null && c18707l.f36468l == 0) {
                        for (C12378l c12378l : C9018l.vip(c18707l.f36469l).metrica()) {
                            InterfaceC17473l interfaceC17473l = (InterfaceC17473l) map.get(c12378l);
                            if (interfaceC17473l != null) {
                                arrayList.add(interfaceC17473l);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && AbstractC8151l.crashlytics("org.bouncycastle.x509.enableCRLDP")) {
                try {
                    CertificateFactory certificateFactoryPro = interfaceC12575l.pro("X.509");
                    for (C0179l c0179l2 : c0179lArrVip) {
                        C18707l c18707l2 = c0179l2.f1128l;
                        if (c18707l2 != null && c18707l2.f36468l == 0) {
                            for (C12378l c12378l2 : C9018l.vip(c18707l2.f36469l).metrica()) {
                                if (c12378l2.f24469l == 6) {
                                    try {
                                        InterfaceC17473l crl = CrlCache.getCrl(certificateFactoryPro, date, new URI(((Cdefault) c12378l2.f24470l).mopub()));
                                        if (crl == null) {
                                            break;
                                        }
                                        arrayList.add(crl);
                                        break;
                                    } catch (Exception unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    throw new AnnotatedException(AbstractC12900l.admob(e, new StringBuilder("cannot create certificate factory: ")), e);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            C18073l.startapp("Distribution points could not be read.", e2);
            return null;
        }
    }

    public static C10198l getAlgorithmIdentifier(PublicKey publicKey) throws C1524l {
        try {
            return C17029l.vip(publicKey.getEncoded()).f33175l;
        } catch (Exception e) {
            throw new C1524l("Subject public key cannot be decoded.", e);
        }
    }

    public static void getCRLIssuersFromDistributionPoint(C0179l c0179l, Collection collection, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList arrayList = new ArrayList();
        C9018l c9018l = c0179l.f1126l;
        if (c9018l != null) {
            for (C12378l c12378l : c9018l.metrica()) {
                if (c12378l.f24469l == 4) {
                    try {
                        arrayList.add(C10915l.metrica(c12378l.f24470l.billing().getEncoded()));
                    } catch (IOException e) {
                        C18073l.startapp("CRL issuer information from distribution point cannot be decoded.", e);
                        return;
                    }
                }
            }
        } else if (c0179l.f1128l == null) {
            C11983l.remoteconfig("CRL issuer is omitted from distribution point but no distributionPoint field present.");
            return;
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((C10915l) it2.next()).getEncoded());
            } catch (IOException e2) {
                C18073l.startapp("Cannot decode CRL issuer information.", e2);
                return;
            }
        }
    }

    public static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        X509CRLEntry revokedCertificate;
        inmobi inmobiVarApplovin;
        try {
            if (X509CRLObject.isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(certificateIssuer == null ? PrincipalUtils.getIssuerPrincipal(x509crl) : PrincipalUtils.getX500Name(certificateIssuer))) {
                    return;
                }
            } else if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(PrincipalUtils.getIssuerPrincipal(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj))) == null) {
                return;
            }
            if (revokedCertificate.hasExtensions()) {
                checkCRLEntryCriticalExtensions(revokedCertificate, "CRL entry has unsupported critical extensions.");
                try {
                    inmobiVarApplovin = inmobi.applovin(getExtensionValue(revokedCertificate, REASON_CODE));
                } catch (Exception e) {
                    C18073l.startapp("Reason code CRL entry extension could not be decoded.", e);
                    return;
                }
            } else {
                inmobiVarApplovin = null;
            }
            int iAppmetrica = inmobiVarApplovin == null ? 0 : inmobiVarApplovin.appmetrica();
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || iAppmetrica == 0 || iAppmetrica == 1 || iAppmetrica == 2 || iAppmetrica == 10) {
                certStatus.setCertStatus(iAppmetrica);
                certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
            }
        } catch (CRLException e2) {
            C18073l.startapp("Failed check for indirect CRL.", e2);
        }
    }

    public static Set getCompleteCRLs(C1405l c1405l, C0179l c0179l, Object obj, C5384l c5384l, Date date) throws AnnotatedException, RecoverableCertPathValidatorException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(PrincipalUtils.getEncodedIssuerPrincipal(obj));
            getCRLIssuersFromDistributionPoint(c0179l, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            C3558l c3558l = new C3558l(x509CRLSelector);
            c3558l.f7487l = true;
            Set setFindCRLs = PKIXCRLUtil.findCRLs(new C14776l(c3558l), date, c5384l.f11525l.getCertStores(), c5384l.f11522l);
            checkCRLsNotEmpty(c1405l, setFindCRLs, obj);
            return setFindCRLs;
        } catch (AnnotatedException e) {
            C18073l.startapp("Could not get issuer information from distribution point.", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public static Set getDeltaCRLs(Date date, X509CRL x509crl, List<CertStore> list, List<InterfaceC17473l> list2, InterfaceC12575l interfaceC12575l) throws AnnotatedException {
        String str;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            try {
                Ccase extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                BigInteger bigIntegerApplovin = extensionValue != null ? Cstrictfp.premium(extensionValue).applovin() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    x509CRLSelector.setMinCRLNumber(bigIntegerApplovin != null ? bigIntegerApplovin.add(BigInteger.valueOf(1L)) : null);
                    C3558l c3558l = new C3558l(x509CRLSelector);
                    c3558l.f7484l = AbstractC14024l.crashlytics(extensionValue2);
                    c3558l.f7486l = true;
                    c3558l.f7485l = bigIntegerApplovin;
                    c3558l.f7483l = true;
                    C14776l c14776l = new C14776l(c3558l);
                    Set deltaCRLs = getDeltaCRLs(PKIXCRLUtil.findCRLs(c14776l, date, list, list2));
                    if (!deltaCRLs.isEmpty() || !AbstractC8151l.crashlytics("org.bouncycastle.x509.enableCRLDP")) {
                        return deltaCRLs;
                    }
                    try {
                        CertificateFactory certificateFactoryPro = interfaceC12575l.pro("X.509");
                        for (C0179l c0179l : C1781l.metrica(extensionValue2).vip()) {
                            C18707l c18707l = c0179l.f1128l;
                            if (c18707l != null && c18707l.f36468l == 0) {
                                for (C12378l c12378l : C9018l.vip(c18707l.f36469l).metrica()) {
                                    if (c12378l.f24469l == 6) {
                                        try {
                                            InterfaceC17473l crl = CrlCache.getCrl(certificateFactoryPro, date, new URI(((Cdefault) c12378l.f24470l).mopub()));
                                            if (crl == null) {
                                                break;
                                            }
                                            deltaCRLs = getDeltaCRLs(PKIXCRLUtil.findCRLs(c14776l, date, Collections.EMPTY_LIST, Collections.singletonList(crl)));
                                            break;
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        return deltaCRLs;
                    } catch (Exception e) {
                        throw new AnnotatedException(AbstractC12900l.admob(e, new StringBuilder("cannot create certificate factory: ")), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = "Issuing distribution point extension value could not be read.";
                    C18073l.startapp(str, e);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                str = "CRL number extension could not be extracted from CRL.";
            }
        } catch (IOException e4) {
            e = e4;
            str = "Cannot extract issuer from CRL.";
        }
    }

    public static Ccase getExtensionValue(X509Extension x509Extension, String str) {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    public static PublicKey getNextWorkingKey(List list, int i, InterfaceC12575l interfaceC12575l) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i >= list.size()) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
            if (!(publicKey2 instanceof DSAPublicKey)) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            dSAPublicKey = (DSAPublicKey) publicKey2;
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return interfaceC12575l.premium("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            C18073l.license(e.getMessage());
            return null;
        }
    }

    private static Ccase getObject(String str, byte[] bArr) throws AnnotatedException {
        try {
            return Ccase.advert(Cthrow.premium(bArr).f36593l);
        } catch (Exception e) {
            throw new AnnotatedException(AbstractC14814l.startapp("exception processing extension ", str), e);
        }
    }

    public static final Set getQualifierSet(Cclass cclass) throws C1524l {
        HashSet hashSet = new HashSet();
        if (cclass != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C7972l c7972l = new C7972l(2, byteArrayOutputStream);
            Enumeration enumerationMo170package = cclass.mo170package();
            while (enumerationMo170package.hasMoreElements()) {
                try {
                    applovin applovinVar = (applovin) enumerationMo170package.nextElement();
                    if (applovinVar == null) {
                        throw new IOException("null object detected");
                    }
                    applovinVar.billing().metrica(c7972l, true);
                    hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                    byteArrayOutputStream.reset();
                } catch (IOException e) {
                    throw new C1524l("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) {
        return ((X509Certificate) obj).getSerialNumber();
    }

    public static Date getValidCertDateFromValidityModel(Date date, int i, CertPath certPath, int i2) throws AnnotatedException {
        if (1 != i || i2 <= 0) {
            return date;
        }
        int i3 = i2 - 1;
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i3);
        if (i3 == 0) {
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(InterfaceC12085l.yandex.inmobi());
                Cpackage cpackageInmobi = extensionValue != null ? Cpackage.inmobi(Ccase.advert(extensionValue)) : null;
                if (cpackageInmobi != null) {
                    try {
                        return cpackageInmobi.appmetrica();
                    } catch (ParseException e) {
                        C18073l.startapp("Date from date of cert gen extension could not be parsed.", e);
                        return null;
                    }
                }
            } catch (IOException unused) {
                C11983l.remoteconfig("Date of cert gen extension could not be read.");
                return null;
            } catch (IllegalArgumentException unused2) {
                C11983l.remoteconfig("Date of cert gen extension could not be read.");
                return null;
            }
        }
        return x509Certificate.getNotBefore();
    }

    public static Date getValidityDate(C5384l c5384l, Date date) {
        Date date2 = c5384l.f11521l;
        Date date3 = date2 == null ? null : new Date(date2.getTime());
        return date3 == null ? date : date3;
    }

    private static boolean hasCriticalExtension(Set set, String str) {
        return set != null && set.contains(str);
    }

    public static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        return hasCriticalExtension(x509crl, DELTA_CRL_INDICATOR);
    }

    public static boolean isIssuerTrustAnchor(X509Certificate x509Certificate, Set set, String str) {
        try {
            return findTrustAnchor(x509Certificate, set, str) != null;
        } catch (Exception unused) {
        }
    }

    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static boolean processCertD1i(int i, List[] listArr, Cfor cfor, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i2);
            if (pKIXPolicyNode.getExpectedPolicies().contains(cfor.inmobi())) {
                HashSet hashSet = new HashSet();
                hashSet.add(cfor.inmobi());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNode, set, cfor.inmobi(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    public static void processCertD1ii(int i, List[] listArr, Cfor cfor, Set set) {
        PKIXPolicyNode pKIXPolicyNodeFindValidPolicy = findValidPolicy(listArr[i - 1].iterator(), "2.5.29.32.0");
        if (pKIXPolicyNodeFindValidPolicy != null) {
            String strInmobi = cfor.inmobi();
            HashSet hashSet = new HashSet();
            hashSet.add(strInmobi);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNodeFindValidPolicy, set, strInmobi, false);
            pKIXPolicyNodeFindValidPolicy.addChild(pKIXPolicyNode);
            listArr[i].add(pKIXPolicyNode);
        }
    }

    public static PKIXPolicyNode removeChildlessPolicyNodes(PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i) {
        if (pKIXPolicyNode == null) {
            return null;
        }
        while (true) {
            i--;
            if (i < 0) {
                return pKIXPolicyNode;
            }
            List list = listArr[i];
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(size);
                    if (!pKIXPolicyNode2.hasChildren()) {
                        list.remove(size);
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
                        if (pKIXPolicyNode3 == null) {
                            return null;
                        }
                        pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
                    }
                }
            }
        }
    }

    public static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        if (pKIXPolicyNode == null) {
            return null;
        }
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (List list : listArr) {
            list.clear();
        }
        return null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    public static boolean hasCriticalExtension(X509Certificate x509Certificate, String str) {
        return hasCriticalExtension(x509Certificate.getCriticalExtensionOIDs(), str);
    }

    public static boolean hasCriticalExtension(X509CRL x509crl, String str) {
        return hasCriticalExtension(x509crl.getCriticalExtensionOIDs(), str);
    }

    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) {
        return findTrustAnchor(x509Certificate, set, null);
    }

    private static Set getDeltaCRLs(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            if (isDeltaCRL(x509crl)) {
                hashSet.add(x509crl);
            }
        }
        return hashSet;
    }
}
