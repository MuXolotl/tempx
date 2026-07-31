package org.bouncycastle.jce.provider;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC2509l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8151l;
import defpackage.C10198l;
import defpackage.C10307l;
import defpackage.C10818l;
import defpackage.C10915l;
import defpackage.C11327l;
import defpackage.C11778l;
import defpackage.C12378l;
import defpackage.C1405l;
import defpackage.C14441l;
import defpackage.C14512l;
import defpackage.C14998l;
import defpackage.C1524l;
import defpackage.C15819l;
import defpackage.C15856l;
import defpackage.C16521l;
import defpackage.C17029l;
import defpackage.C17364l;
import defpackage.C18229l;
import defpackage.C2857l;
import defpackage.C4319l;
import defpackage.C4541l;
import defpackage.C4567l;
import defpackage.C5273l;
import defpackage.C5831l;
import defpackage.C6541l;
import defpackage.C8339l;
import defpackage.C8843l;
import defpackage.Cclass;
import defpackage.Cdefault;
import defpackage.Cfor;
import defpackage.Cnative;
import defpackage.Cpackage;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC18410l;
import defpackage.InterfaceC18537l;
import defpackage.InterfaceC18562l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC6306l;
import defpackage.InterfaceC8134l;
import defpackage.InterfaceC9172l;
import defpackage.InterfaceC9333l;
import defpackage.applovin;
import defpackage.inmobi;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class ProvOcspRevocationChecker implements InterfaceC9333l {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final InterfaceC12575l helper;
    private boolean isEnabledOCSP;
    private String ocspURL;
    private C1405l parameters;
    private final ProvRevocationChecker parent;

    static {
        HashMap map = new HashMap();
        oids = map;
        map.put(new Cfor("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        map.put(InterfaceC0543l.f1871goto, "SHA224WITHRSA");
        map.put(InterfaceC0543l.f1867default, "SHA256WITHRSA");
        map.put(InterfaceC0543l.f1869final, "SHA384WITHRSA");
        map.put(InterfaceC0543l.f1914new, "SHA512WITHRSA");
        map.put(InterfaceC11987l.remoteconfig, "GOST3411WITHGOST3410");
        map.put(InterfaceC11987l.vip, "GOST3411WITHECGOST3410");
        map.put(InterfaceC18410l.mopub, "GOST3411-2012-256WITHECGOST3410-2012-256");
        map.put(InterfaceC18410l.admob, "GOST3411-2012-512WITHECGOST3410-2012-512");
        map.put(InterfaceC18537l.yandex, "SHA1WITHPLAIN-ECDSA");
        map.put(InterfaceC18537l.loadAd, "SHA224WITHPLAIN-ECDSA");
        map.put(InterfaceC18537l.crashlytics, "SHA256WITHPLAIN-ECDSA");
        map.put(InterfaceC18537l.amazon, "SHA384WITHPLAIN-ECDSA");
        map.put(InterfaceC18537l.purchase, "SHA512WITHPLAIN-ECDSA");
        map.put(InterfaceC18537l.billing, "RIPEMD160WITHPLAIN-ECDSA");
        map.put(InterfaceC9172l.yandex, "SHA1WITHCVC-ECDSA");
        map.put(InterfaceC9172l.loadAd, "SHA224WITHCVC-ECDSA");
        map.put(InterfaceC9172l.crashlytics, "SHA256WITHCVC-ECDSA");
        map.put(InterfaceC9172l.amazon, "SHA384WITHCVC-ECDSA");
        map.put(InterfaceC9172l.purchase, "SHA512WITHCVC-ECDSA");
        map.put(InterfaceC18562l.yandex, "XMSS");
        map.put(InterfaceC18562l.loadAd, "XMSSMT");
        map.put(new Cfor("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        map.put(new Cfor("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        map.put(new Cfor("1.2.840.10040.4.3"), "SHA1WITHDSA");
        map.put(InterfaceC15427l.f30166l, "SHA1WITHECDSA");
        map.put(InterfaceC15427l.f30182l, "SHA224WITHECDSA");
        map.put(InterfaceC15427l.f30180l, "SHA256WITHECDSA");
        map.put(InterfaceC15427l.f30148l, "SHA384WITHECDSA");
        map.put(InterfaceC15427l.f30147l, "SHA512WITHECDSA");
        map.put(InterfaceC4502l.admob, "SHA1WITHRSA");
        map.put(InterfaceC4502l.mopub, "SHA1WITHDSA");
        map.put(InterfaceC8134l.f16941class, "SHA224WITHDSA");
        map.put(InterfaceC8134l.f16954interface, "SHA256WITHDSA");
    }

    public ProvOcspRevocationChecker(ProvRevocationChecker provRevocationChecker, InterfaceC12575l interfaceC12575l) {
        this.parent = provRevocationChecker;
        this.helper = interfaceC12575l;
    }

    private static byte[] calcKeyHash(MessageDigest messageDigest, PublicKey publicKey) {
        return messageDigest.digest(C17029l.vip(publicKey.getEncoded()).f33174l.applovin());
    }

    private C4567l createCertID(C10198l c10198l, C10818l c10818l, Cstrictfp cstrictfp) throws CertPathValidatorException {
        try {
            MessageDigest messageDigestCrashlytics = this.helper.crashlytics(AbstractC2509l.yandex(c10198l.f20787l));
            C11327l c11327l = new C11327l(messageDigestCrashlytics.digest(c10818l.f21865l.f34973l.remoteconfig("DER")));
            C11327l c11327l2 = new C11327l(messageDigestCrashlytics.digest(c10818l.f21865l.f34974l.f33174l.applovin()));
            C4567l c4567l = new C4567l();
            c4567l.f9266l = c10198l;
            c4567l.f9265l = c11327l;
            c4567l.f9264l = c11327l2;
            c4567l.f9267l = cstrictfp;
            return c4567l;
        } catch (Exception e) {
            throw new CertPathValidatorException("problem creating ID: " + e, e);
        }
    }

    private C10818l extractCert() throws CertPathValidatorException {
        try {
            return C10818l.vip(this.parameters.purchase.getEncoded());
        } catch (Exception e) {
            String strAdmob = AbstractC12900l.admob(e, new StringBuilder("cannot process signing cert: "));
            C1405l c1405l = this.parameters;
            throw new CertPathValidatorException(strAdmob, e, c1405l.crashlytics, c1405l.amazon);
        }
    }

    private static String getDigestName(Cfor cfor) {
        String strYandex = AbstractC2509l.yandex(cfor);
        int iIndexOf = strYandex.indexOf(45);
        return (iIndexOf <= 0 || strYandex.startsWith("SHA3")) ? strYandex : strYandex.substring(0, iIndexOf).concat(strYandex.substring(iIndexOf + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static URI getOcspResponderURI(X509Certificate x509Certificate) {
        C5273l c5273l;
        C5831l c5831l;
        byte[] extensionValue = x509Certificate.getExtensionValue(C18229l.f35712l.inmobi());
        if (extensionValue != null) {
            byte[] bArr = Cthrow.premium(extensionValue).f36593l;
            if (bArr instanceof C5273l) {
                c5273l = (C5273l) bArr;
            } else if (bArr != 0) {
                Cclass cclassInmobi = Cclass.inmobi(bArr);
                C5273l c5273l2 = new C5273l();
                if (cclassInmobi.size() < 1) {
                    C8339l.metrica("sequence may not be empty");
                    return null;
                }
                c5273l2.f11360l = new C5831l[cclassInmobi.size()];
                for (int i = 0; i != cclassInmobi.size(); i++) {
                    C5831l[] c5831lArr = c5273l2.f11360l;
                    applovin applovinVarMo173throws = cclassInmobi.mo173throws(i);
                    Cfor cfor = C5831l.f12285l;
                    if (applovinVarMo173throws instanceof C5831l) {
                        c5831l = (C5831l) applovinVarMo173throws;
                    } else if (applovinVarMo173throws != null) {
                        Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                        C5831l c5831l2 = new C5831l();
                        c5831l2.f12287l = null;
                        c5831l2.f12286l = null;
                        if (cclassInmobi2.size() != 2) {
                            C8339l.metrica("wrong number of elements in sequence");
                            return null;
                        }
                        c5831l2.f12287l = Cfor.m192throws(cclassInmobi2.mo173throws(0));
                        c5831l2.f12286l = C12378l.vip(cclassInmobi2.mo173throws(1));
                        c5831l = c5831l2;
                    } else {
                        c5831l = null;
                    }
                    c5831lArr[i] = c5831l;
                }
                c5273l = c5273l2;
            } else {
                c5273l = null;
            }
            C5831l[] c5831lArr2 = c5273l.f11360l;
            int length = c5831lArr2.length;
            C5831l[] c5831lArr3 = new C5831l[length];
            System.arraycopy(c5831lArr2, 0, c5831lArr3, 0, c5831lArr2.length);
            for (int i2 = 0; i2 != length; i2++) {
                C5831l c5831l3 = c5831lArr3[i2];
                if (C5831l.f12285l.ad(c5831l3.f12287l)) {
                    C12378l c12378l = c5831l3.f12286l;
                    if (c12378l.f24469l == 6) {
                        try {
                            return new URI(((Cdefault) c12378l.f24470l).mopub());
                        } catch (URISyntaxException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private static String getSignatureName(C10198l c10198l) {
        applovin applovinVar = c10198l.f20786l;
        Cfor cfor = c10198l.f20787l;
        if (applovinVar != null && !C14998l.f29509l.pro(applovinVar) && cfor.ad(InterfaceC0543l.f1918static)) {
            return AbstractC0653l.ads(new StringBuilder(), getDigestName(C10307l.vip(applovinVar).f21018l.f20787l), "WITHRSAANDMGF1");
        }
        Map map = oids;
        return map.containsKey(cfor) ? (String) map.get(cfor) : cfor.inmobi();
    }

    private static X509Certificate getSignerCert(C14441l c14441l, X509Certificate x509Certificate, X509Certificate x509Certificate2, InterfaceC12575l interfaceC12575l) {
        Cnative cnative = c14441l.f28285l.f6211l.f32293l;
        byte[] bArr = cnative instanceof Cthrow ? ((Cthrow) cnative).f36593l : null;
        if (bArr != null) {
            MessageDigest messageDigestCrashlytics = interfaceC12575l.crashlytics("SHA1");
            if (x509Certificate2 != null && Arrays.equals(bArr, calcKeyHash(messageDigestCrashlytics, x509Certificate2.getPublicKey()))) {
                return x509Certificate2;
            }
            if (x509Certificate != null && Arrays.equals(bArr, calcKeyHash(messageDigestCrashlytics, x509Certificate.getPublicKey()))) {
                return x509Certificate;
            }
        } else {
            C4319l c4319l = C4319l.f8858l;
            C10915l c10915lVip = C10915l.vip(c4319l, cnative instanceof Cthrow ? null : C10915l.metrica(cnative));
            if (x509Certificate2 != null && c10915lVip.equals(C10915l.vip(c4319l, x509Certificate2.getSubjectX500Principal().getEncoded()))) {
                return x509Certificate2;
            }
            if (x509Certificate != null && c10915lVip.equals(C10915l.vip(c4319l, x509Certificate.getSubjectX500Principal().getEncoded()))) {
                return x509Certificate;
            }
        }
        return null;
    }

    private static boolean isEqualAlgId(C10198l c10198l, C10198l c10198l2) {
        if (c10198l == c10198l2 || c10198l.equals(c10198l2)) {
            return true;
        }
        if (!c10198l.f20787l.ad(c10198l2.f20787l)) {
            return false;
        }
        applovin applovinVar = c10198l.f20786l;
        applovin applovinVar2 = c10198l2.f20786l;
        if (applovinVar == applovinVar2) {
            return true;
        }
        C14998l c14998l = C14998l.f29509l;
        if (applovinVar == null) {
            return c14998l.pro(applovinVar2);
        }
        if (c14998l.pro(applovinVar) && applovinVar2 == null) {
            return true;
        }
        return applovinVar.equals(applovinVar2);
    }

    private static boolean responderMatches(C16521l c16521l, X509Certificate x509Certificate, InterfaceC12575l interfaceC12575l) {
        Cnative cnative = c16521l.f32293l;
        byte[] bArr = cnative instanceof Cthrow ? ((Cthrow) cnative).f36593l : null;
        if (bArr != null) {
            return Arrays.equals(bArr, calcKeyHash(interfaceC12575l.crashlytics("SHA1"), x509Certificate.getPublicKey()));
        }
        C4319l c4319l = C4319l.f8858l;
        return C10915l.vip(c4319l, cnative instanceof Cthrow ? null : C10915l.metrica(cnative)).equals(C10915l.vip(c4319l, x509Certificate.getSubjectX500Principal().getEncoded()));
    }

    public static boolean validatedOcspResponse(C14441l c14441l, C1405l c1405l, byte[] bArr, X509Certificate x509Certificate, InterfaceC12575l interfaceC12575l) throws CertPathValidatorException {
        try {
            Cclass cclass = c14441l.f28286l;
            C2857l c2857l = c14441l.f28285l;
            Signature signatureCreateSignature = interfaceC12575l.createSignature(getSignatureName(c14441l.f28284l));
            X509Certificate x509Certificate2 = c1405l.purchase;
            int i = c1405l.amazon;
            CertPath certPath = c1405l.crashlytics;
            X509Certificate signerCert = getSignerCert(c14441l, x509Certificate2, x509Certificate, interfaceC12575l);
            if (signerCert == null && cclass == null) {
                throw new CertPathValidatorException("OCSP responder certificate not found");
            }
            if (signerCert != null) {
                signatureCreateSignature.initVerify(signerCert.getPublicKey());
            } else {
                X509Certificate x509Certificate3 = (X509Certificate) interfaceC12575l.pro("X.509").generateCertificate(new ByteArrayInputStream(cclass.mo173throws(0).billing().getEncoded()));
                x509Certificate3.verify(c1405l.purchase.getPublicKey());
                x509Certificate3.checkValidity(c1405l.yandex());
                if (!responderMatches(c2857l.f6211l, x509Certificate3, interfaceC12575l)) {
                    throw new CertPathValidatorException("responder certificate does not match responderID", null, certPath, i);
                }
                List<String> extendedKeyUsage = x509Certificate3.getExtendedKeyUsage();
                if (extendedKeyUsage == null || !extendedKeyUsage.contains(C14512l.f28384l.f28386l.inmobi())) {
                    throw new CertPathValidatorException("responder certificate not valid for signing OCSP responses", null, certPath, i);
                }
                signatureCreateSignature.initVerify(x509Certificate3);
            }
            signatureCreateSignature.update(c2857l.remoteconfig("DER"));
            if (!signatureCreateSignature.verify(c14441l.f28283l.inmobi())) {
                return false;
            }
            if (bArr != null && !Arrays.equals(bArr, c2857l.f6216l.vip(InterfaceC6306l.loadAd).f35733l.f36593l)) {
                throw new CertPathValidatorException("nonce mismatch in OCSP response", null, certPath, i);
            }
            return true;
        } catch (IOException e) {
            throw new CertPathValidatorException(AbstractC5020l.adcel(e, new StringBuilder("OCSP response failure: ")), e, c1405l.crashlytics, c1405l.amazon);
        } catch (CertPathValidatorException e2) {
            throw e2;
        } catch (GeneralSecurityException e3) {
            throw new CertPathValidatorException("OCSP response failure: " + e3.getMessage(), e3, c1405l.crashlytics, c1405l.amazon);
        }
    }

    @Override // defpackage.InterfaceC9333l
    public void check(Certificate certificate) {
        byte[] bArr;
        boolean z;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        Map<X509Certificate, byte[]> ocspResponses = this.parent.getOcspResponses();
        URI ocspResponder = this.parent.getOcspResponder();
        if (ocspResponder == null) {
            if (this.ocspURL != null) {
                try {
                    ocspResponder = new URI(this.ocspURL);
                } catch (URISyntaxException e) {
                    String str = "configuration error: " + e.getMessage();
                    C1405l c1405l = this.parameters;
                    throw new CertPathValidatorException(str, e, c1405l.crashlytics, c1405l.amazon);
                }
            } else {
                ocspResponder = getOcspResponderURI(x509Certificate);
            }
        }
        URI uri = ocspResponder;
        if (ocspResponses.get(x509Certificate) != null || uri == null) {
            List<Extension> ocspExtensions = this.parent.getOcspExtensions();
            bArr = null;
            for (int i = 0; i != ocspExtensions.size(); i++) {
                Extension extensionPurchase = C6541l.purchase(ocspExtensions.get(i));
                byte[] value = extensionPurchase.getValue();
                if (InterfaceC6306l.loadAd.inmobi().equals(extensionPurchase.getId())) {
                    bArr = value;
                }
            }
            z = false;
        } else {
            if (this.ocspURL == null && this.parent.getOcspResponder() == null && !this.isEnabledOCSP) {
                C1405l c1405l2 = this.parameters;
                throw new RecoverableCertPathValidatorException("OCSP disabled by \"ocsp.enable\" setting", null, c1405l2.crashlytics, c1405l2.amazon);
            }
            try {
                ocspResponses.put(x509Certificate, OcspCache.getOcspResponse(createCertID(new C10198l(InterfaceC4502l.billing), extractCert(), new Cstrictfp(x509Certificate.getSerialNumber())), this.parameters, uri, this.parent.getOcspResponderCert(), this.parent.getOcspExtensions(), this.helper).getEncoded());
                z = true;
                bArr = null;
            } catch (IOException e2) {
                C1405l c1405l3 = this.parameters;
                throw new CertPathValidatorException("unable to encode OCSP response", e2, c1405l3.crashlytics, c1405l3.amazon);
            }
        }
        if (ocspResponses.isEmpty()) {
            C1405l c1405l4 = this.parameters;
            throw new RecoverableCertPathValidatorException("no OCSP response found for any certificate", null, c1405l4.crashlytics, c1405l4.amazon);
        }
        C17364l c17364lVip = C17364l.vip(ocspResponses.get(x509Certificate));
        Cstrictfp cstrictfp = new Cstrictfp(x509Certificate.getSerialNumber());
        if (c17364lVip == null) {
            C1405l c1405l5 = this.parameters;
            throw new RecoverableCertPathValidatorException("no OCSP response found for certificate", null, c1405l5.crashlytics, c1405l5.amazon);
        }
        C15856l c15856l = c17364lVip.f33832l;
        if (c15856l.f31115l.appmetrica() != 0) {
            StringBuilder sb = new StringBuilder("OCSP response failed: ");
            inmobi inmobiVar = c15856l.f31115l;
            inmobiVar.getClass();
            sb.append(new BigInteger(inmobiVar.f838l));
            String string = sb.toString();
            C1405l c1405l6 = this.parameters;
            throw new CertPathValidatorException(string, null, c1405l6.crashlytics, c1405l6.amazon);
        }
        C8843l c8843lVip = C8843l.vip(c17364lVip.f33831l);
        if (c8843lVip.f18175l.ad(InterfaceC6306l.yandex)) {
            try {
                C14441l c14441lVip = C14441l.vip(c8843lVip.f18174l.f36593l);
                if (!z && !validatedOcspResponse(c14441lVip, this.parameters, bArr, this.parent.getOcspResponderCert(), this.helper)) {
                    return;
                }
                Cclass cclass = C2857l.vip(c14441lVip.f28285l).f6214l;
                C4567l c4567lCreateCertID = null;
                for (int i2 = 0; i2 != cclass.size(); i2++) {
                    C11778l c11778lVip = C11778l.vip(cclass.mo173throws(i2));
                    C4567l c4567l = c11778lVip.f23575l;
                    if (cstrictfp.ad(c4567l.f9267l)) {
                        Cpackage cpackage = c11778lVip.f23577l;
                        if (cpackage != null && this.parameters.yandex().after(cpackage.appmetrica())) {
                            throw new C1524l("OCSP response expired");
                        }
                        if (c4567lCreateCertID == null || !isEqualAlgId(c4567lCreateCertID.f9266l, c4567l.f9266l)) {
                            c4567lCreateCertID = createCertID(c4567l, extractCert(), cstrictfp);
                        }
                        if (c4567lCreateCertID.equals(c4567l)) {
                            C4541l c4541l = c11778lVip.f23574l;
                            int i3 = c4541l.f9177l;
                            if (i3 == 0) {
                                return;
                            }
                            if (i3 != 1) {
                                C1405l c1405l7 = this.parameters;
                                throw new CertPathValidatorException("certificate revoked, details unknown", null, c1405l7.crashlytics, c1405l7.amazon);
                            }
                            C15819l c15819lVip = C15819l.vip(c4541l.f9176l);
                            String str2 = "certificate revoked, reason=(" + c15819lVip.f31068l + "), date=" + c15819lVip.f31069l.appmetrica();
                            C1405l c1405l8 = this.parameters;
                            throw new CertPathValidatorException(str2, null, c1405l8.crashlytics, c1405l8.amazon);
                        }
                    }
                }
            } catch (CertPathValidatorException e3) {
                throw e3;
            } catch (Exception e4) {
                C1405l c1405l9 = this.parameters;
                throw new CertPathValidatorException("unable to process OCSP response", e4, c1405l9.crashlytics, c1405l9.amazon);
            }
        }
    }

    public List<CertPathValidatorException> getSoftFailExceptions() {
        return null;
    }

    public Set<String> getSupportedExtensions() {
        return null;
    }

    public void init(boolean z) {
        if (z) {
            throw new CertPathValidatorException("forward checking not supported");
        }
        this.parameters = null;
        this.isEnabledOCSP = AbstractC8151l.crashlytics("ocsp.enable");
        this.ocspURL = AbstractC8151l.loadAd("ocsp.responderURL");
    }

    @Override // defpackage.InterfaceC9333l
    public void initialize(C1405l c1405l) {
        this.parameters = c1405l;
        this.isEnabledOCSP = AbstractC8151l.crashlytics("ocsp.enable");
        this.ocspURL = AbstractC8151l.loadAd("ocsp.responderURL");
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }

    private C4567l createCertID(C4567l c4567l, C10818l c10818l, Cstrictfp cstrictfp) {
        return createCertID(c4567l.f9266l, c10818l, cstrictfp);
    }
}
