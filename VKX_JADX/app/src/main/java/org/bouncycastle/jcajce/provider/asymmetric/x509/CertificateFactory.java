package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC2426l;
import defpackage.AbstractC7016l;
import defpackage.AbstractC9027l;
import defpackage.C0649l;
import defpackage.C10818l;
import defpackage.C14148l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.C8389l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfinal;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Cstrictfp;
import defpackage.Csynchronized;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12575l;
import defpackage.ad;
import defpackage.applovin;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil PEM_CERT_PARSER = new PEMUtil("CERTIFICATE");
    private static final PEMUtil PEM_CRL_PARSER = new PEMUtil("CRL");
    private static final PEMUtil PEM_PKCS7_PARSER = new PEMUtil("PKCS7");
    private final InterfaceC12575l bcHelper = new C7633l();
    private Cinterface sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;
    private Cinterface sCrlData = null;
    private int sCrlDataObjectCount = 0;
    private InputStream currentCrlStream = null;

    private CRL doGenerateCRL(InputStream inputStream, boolean z) throws CRLException {
        InputStream inputStream2 = this.currentCrlStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentCrlStream = inputStream;
            this.sCrlData = null;
            this.sCrlDataObjectCount = 0;
        }
        try {
            Cinterface cinterface = this.sCrlData;
            if (cinterface != null) {
                if (this.sCrlDataObjectCount != cinterface.f842l.length) {
                    return getCRL();
                }
                this.sCrlData = null;
                this.sCrlDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(AbstractC7016l.crashlytics(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? readPEMCRL(inputStream, z) : readDERCRL(new Csynchronized(inputStream, AbstractC2426l.subs(inputStream), true));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    private Certificate doGenerateCertificate(InputStream inputStream, boolean z) throws ExCertificateException {
        InputStream inputStream2 = this.currentStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentStream = inputStream;
            this.sData = null;
            this.sDataObjectCount = 0;
        }
        try {
            Cinterface cinterface = this.sData;
            if (cinterface != null) {
                if (this.sDataObjectCount != cinterface.f842l.length) {
                    return getCertificate();
                }
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(AbstractC7016l.crashlytics(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? readPEMCertificate(inputStream, z) : readDERCertificate(new Csynchronized(inputStream));
        } catch (Exception e) {
            throw new ExCertificateException(AbstractC12900l.admob(e, new StringBuilder("parsing issue: ")), e);
        }
    }

    private CRL getCRL(Cclass cclass) {
        C8389l c8389l = null;
        if (cclass == null) {
            return null;
        }
        if (cclass.size() <= 1 || !(cclass.mo173throws(0) instanceof Cfor) || !cclass.mo173throws(0).equals(InterfaceC0543l.f1902l)) {
            return createCRL(C0649l.vip(cclass));
        }
        Cclass cclassAppmetrica = Cclass.appmetrica((Cfinal) cclass.mo173throws(1), true);
        if (cclassAppmetrica != null) {
            Cclass cclassInmobi = Cclass.inmobi(cclassAppmetrica);
            C8389l c8389l2 = new C8389l();
            Enumeration enumerationMo170package = cclassInmobi.mo170package();
            c8389l2.f17346l = (Cstrictfp) enumerationMo170package.nextElement();
            c8389l2.f17345l = (Cinterface) enumerationMo170package.nextElement();
            c8389l2.f17344l = C14148l.vip(enumerationMo170package.nextElement());
            while (enumerationMo170package.hasMoreElements()) {
                Ccase ccase = (Ccase) enumerationMo170package.nextElement();
                if (ccase instanceof Cfinal) {
                    Cfinal cfinal = (Cfinal) ccase;
                    int i = cfinal.f821l;
                    ad adVar = Cinterface.f840l;
                    if (i == 0) {
                        AbstractC9027l.loadAd(cfinal);
                        Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin);
                        c8389l2.f17348l = (Cinterface) ccaseApplovin;
                    } else {
                        if (i != 1) {
                            C8339l.metrica(AbstractC0653l.vip(i, "unknown tag value "));
                            return null;
                        }
                        AbstractC9027l.loadAd(cfinal);
                        Ccase ccaseApplovin2 = cfinal.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin2);
                        c8389l2.f17347l = (Cinterface) ccaseApplovin2;
                    }
                } else {
                    c8389l2.f17349l = (Cinterface) ccase;
                }
            }
            c8389l = c8389l2;
        }
        this.sCrlData = c8389l.f17347l;
        return getCRL();
    }

    private Certificate getCertificate(Cclass cclass) {
        C8389l c8389l = null;
        if (cclass == null) {
            return null;
        }
        if (cclass.size() <= 1 || !(cclass.mo173throws(0) instanceof Cfor) || !cclass.mo173throws(0).equals(InterfaceC0543l.f1902l)) {
            return new X509CertificateObject(this.bcHelper, C10818l.vip(cclass));
        }
        Cclass cclassAppmetrica = Cclass.appmetrica((Cfinal) cclass.mo173throws(1), true);
        if (cclassAppmetrica != null) {
            Cclass cclassInmobi = Cclass.inmobi(cclassAppmetrica);
            C8389l c8389l2 = new C8389l();
            Enumeration enumerationMo170package = cclassInmobi.mo170package();
            c8389l2.f17346l = (Cstrictfp) enumerationMo170package.nextElement();
            c8389l2.f17345l = (Cinterface) enumerationMo170package.nextElement();
            c8389l2.f17344l = C14148l.vip(enumerationMo170package.nextElement());
            while (enumerationMo170package.hasMoreElements()) {
                Ccase ccase = (Ccase) enumerationMo170package.nextElement();
                if (ccase instanceof Cfinal) {
                    Cfinal cfinal = (Cfinal) ccase;
                    int i = cfinal.f821l;
                    ad adVar = Cinterface.f840l;
                    if (i == 0) {
                        AbstractC9027l.loadAd(cfinal);
                        Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin);
                        c8389l2.f17348l = (Cinterface) ccaseApplovin;
                    } else {
                        if (i != 1) {
                            C8339l.metrica(AbstractC0653l.vip(i, "unknown tag value "));
                            return null;
                        }
                        AbstractC9027l.loadAd(cfinal);
                        Ccase ccaseApplovin2 = cfinal.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin2);
                        c8389l2.f17347l = (Cinterface) ccaseApplovin2;
                    }
                } else {
                    c8389l2.f17349l = (Cinterface) ccase;
                }
            }
            c8389l = c8389l2;
        }
        this.sData = c8389l.f17348l;
        return getCertificate();
    }

    private CRL readDERCRL(Csynchronized csynchronized) {
        return getCRL(Cclass.inmobi(csynchronized.ads()));
    }

    private Certificate readDERCertificate(Csynchronized csynchronized) {
        return getCertificate(Cclass.inmobi(csynchronized.ads()));
    }

    private CRL readPEMCRL(InputStream inputStream, boolean z) {
        return getCRL(PEM_CRL_PARSER.readPEMObject(inputStream, z));
    }

    private Certificate readPEMCertificate(InputStream inputStream, boolean z) {
        return getCertificate(PEM_CERT_PARSER.readPEMObject(inputStream, z));
    }

    public CRL createCRL(C0649l c0649l) {
        return new X509CRLObject(this.bcHelper, c0649l);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) {
        return doGenerateCRL(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL crlDoGenerateCRL = doGenerateCRL(bufferedInputStream, arrayList.isEmpty());
            if (crlDoGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(crlDoGenerateCRL);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) {
        return doGenerateCertificate(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) throws ExCertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificateDoGenerateCertificate = doGenerateCertificate(bufferedInputStream, arrayList.isEmpty());
            if (certificateDoGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(certificateDoGenerateCertificate);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }

    public static class ExCertificateException extends CertificateException {
        private Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public ExCertificateException(Throwable th) {
            this.cause = th;
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    private CRL getCRL() {
        Cinterface cinterface = this.sCrlData;
        if (cinterface == null) {
            return null;
        }
        int i = this.sCrlDataObjectCount;
        applovin[] applovinVarArr = cinterface.f842l;
        if (i >= applovinVarArr.length) {
            return null;
        }
        this.sCrlDataObjectCount = i + 1;
        return createCRL(C0649l.vip(applovinVarArr[i]));
    }

    private Certificate getCertificate() {
        applovin applovinVar;
        if (this.sData == null) {
            return null;
        }
        do {
            int i = this.sDataObjectCount;
            applovin[] applovinVarArr = this.sData.f842l;
            if (i >= applovinVarArr.length) {
                return null;
            }
            this.sDataObjectCount = i + 1;
            applovinVar = applovinVarArr[i];
        } while (!(applovinVar instanceof Cclass));
        return new X509CertificateObject(this.bcHelper, C10818l.vip(applovinVar));
    }
}
