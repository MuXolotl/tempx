package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC5020l;
import defpackage.AbstractC9008l;
import defpackage.C11138l;
import defpackage.C14148l;
import defpackage.C2930l;
import defpackage.C3370l;
import defpackage.C7633l;
import defpackage.C8389l;
import defpackage.C9926l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cstrictfp;
import defpackage.Csynchronized;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12575l;
import defpackage.applovin;
import defpackage.appmetrica;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final InterfaceC12575l helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = DesugarCollections.unmodifiableList(arrayList);
    }

    public PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        C7633l c7633l = new C7633l();
        Provider provider = (Provider) c7633l.f16631l;
        this.helper = c7633l;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: ".concat(str));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509", provider);
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.certificates.add(certificateGenerateCertificate);
                    }
                }
            } else {
                Ccase ccaseAds = new Csynchronized(inputStream).ads();
                if (!(ccaseAds instanceof Cclass)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration enumerationMo170package = ((Cclass) ccaseAds).mo170package();
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory certificateFactory2 = java.security.cert.CertificateFactory.getInstance("X.509", provider);
                while (enumerationMo170package.hasMoreElements()) {
                    this.certificates.add(0, certificateFactory2.generateCertificate(new ByteArrayInputStream(((applovin) enumerationMo170package.nextElement()).billing().remoteconfig("DER"))));
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e.toString());
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e2.toString());
        }
    }

    private List sortCerts(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
            for (int i = 1; i != list.size(); i++) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    ArrayList arrayList = new ArrayList(list.size());
                    ArrayList arrayList2 = new ArrayList(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 == list.size()) {
                                arrayList.add(x509Certificate);
                                list.remove(i2);
                                break;
                            }
                            if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                break;
                            }
                            i3++;
                        }
                    }
                    if (arrayList.size() <= 1) {
                        for (int i4 = 0; i4 != arrayList.size(); i4++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                    arrayList.add(x509Certificate2);
                                    list.remove(i5);
                                    break;
                                }
                            }
                        }
                        if (list.size() <= 0) {
                            return arrayList;
                        }
                    }
                    return arrayList2;
                }
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            }
        }
        return list;
    }

    private Ccase toASN1Object(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new Csynchronized(x509Certificate.getEncoded()).ads();
        } catch (Exception e) {
            throw new CertificateEncodingException(AbstractC5020l.ads(e, new StringBuilder("Exception while encoding certificate: ")));
        }
    }

    private byte[] toDEREncoded(applovin applovinVar) throws CertificateEncodingException {
        try {
            return applovinVar.billing().remoteconfig("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: " + e);
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        int i = 0;
        if (str.equalsIgnoreCase("PkiPath")) {
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                appmetricaVar.purchase(toASN1Object((X509Certificate) listIterator.previous()));
            }
            C11138l c11138l = new C11138l(appmetricaVar);
            c11138l.f22357l = -1;
            return toDEREncoded(c11138l);
        }
        if (str.equalsIgnoreCase("PKCS7")) {
            C14148l c14148l = new C14148l(InterfaceC0543l.f1879l, null);
            appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
            while (i != this.certificates.size()) {
                appmetricaVar2.purchase(toASN1Object((X509Certificate) this.certificates.get(i)));
                i++;
            }
            Cstrictfp cstrictfp = Cstrictfp.f36575l;
            C2930l c2930l = new C2930l();
            C2930l c2930l2 = new C2930l(appmetricaVar2, true);
            c2930l2.f6383l = -1;
            C2930l c2930l3 = new C2930l();
            C8389l c8389l = new C8389l();
            c8389l.f17346l = cstrictfp;
            c8389l.f17345l = c2930l;
            c8389l.f17344l = c14148l;
            c8389l.f17348l = c2930l2;
            c8389l.f17347l = null;
            c8389l.f17349l = c2930l3;
            return toDEREncoded(new C14148l(InterfaceC0543l.f1902l, c8389l));
        }
        if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: ".concat(str));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3370l c3370l = new C3370l(new OutputStreamWriter(byteArrayOutputStream));
        c3370l.f7175l = new char[64];
        String str2 = AbstractC9008l.yandex;
        while (i != this.certificates.size()) {
            try {
                byte[] encoded = ((X509Certificate) this.certificates.get(i)).getEncoded();
                List list2 = C9926l.amazon;
                C9926l c9926l = new C9926l();
                c9926l.yandex = "CERTIFICATE";
                c9926l.loadAd = DesugarCollections.unmodifiableList(list2);
                c9926l.crashlytics = encoded;
                c3370l.yandex(c9926l);
                i++;
            } catch (Exception unused) {
                throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
            }
        }
        c3370l.close();
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }

    public PKIXCertPath(List list) {
        super("X.509");
        this.helper = new C7633l();
        this.certificates = sortCerts(new ArrayList(list));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }
}
