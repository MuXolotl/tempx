package org.bouncycastle.jce.provider;

import defpackage.C1405l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC18410l;
import defpackage.InterfaceC18537l;
import defpackage.InterfaceC18562l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC8134l;
import defpackage.InterfaceC9172l;
import defpackage.InterfaceC9333l;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class ProvRevocationChecker extends PKIXRevocationChecker implements InterfaceC9333l {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final ProvCrlRevocationChecker crlChecker;
    private final InterfaceC12575l helper;
    private final ProvOcspRevocationChecker ocspChecker;
    private C1405l parameters;

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

    public ProvRevocationChecker(InterfaceC12575l interfaceC12575l) {
        this.helper = interfaceC12575l;
        this.crlChecker = new ProvCrlRevocationChecker(interfaceC12575l);
        this.ocspChecker = new ProvOcspRevocationChecker(this, interfaceC12575l);
    }

    private boolean hasOption(PKIXRevocationChecker.Option option) {
        return getOptions().contains(option);
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection<String> collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!hasOption(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (hasOption(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.crlChecker.check(certificate);
                    return;
                } catch (RecoverableCertPathValidatorException e) {
                    if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        throw e;
                    }
                    this.ocspChecker.check(certificate);
                    return;
                }
            }
            try {
                this.ocspChecker.check(certificate);
            } catch (RecoverableCertPathValidatorException e2) {
                if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                    throw e2;
                }
                this.crlChecker.check(certificate);
            }
        }
    }

    @Override // java.security.cert.PKIXRevocationChecker
    public List<CertPathValidatorException> getSoftFailExceptions() {
        return this.ocspChecker.getSoftFailExceptions();
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set<String> getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        this.parameters = null;
        this.crlChecker.init(z);
        this.ocspChecker.init(z);
    }

    @Override // defpackage.InterfaceC9333l
    public void initialize(C1405l c1405l) {
        this.parameters = c1405l;
        this.crlChecker.initialize(c1405l);
        this.ocspChecker.initialize(c1405l);
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }
}
