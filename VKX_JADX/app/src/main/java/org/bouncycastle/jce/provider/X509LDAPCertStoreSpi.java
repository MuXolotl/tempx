package org.bouncycastle.jce.provider;

import defpackage.AbstractC4989l;
import defpackage.AbstractC9137l;
import defpackage.AbstractC9361l;
import defpackage.C10818l;
import defpackage.C10938l;
import defpackage.Csynchronized;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class X509LDAPCertStoreSpi extends CertStoreSpi {
    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private AbstractC9137l params;

    public X509LDAPCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        throw new InvalidAlgorithmParameterException(X509LDAPCertStoreSpi.class.getName() + ": parameter must be a " + AbstractC9137l.class.getName() + " object\n" + certStoreParameters.toString());
    }

    private Set certSubjectSerialSearch(X509CertSelector x509CertSelector, String[] strArr, String str, String str2) throws CertStoreException {
        String name;
        String string;
        HashSet hashSet = new HashSet();
        try {
            if (x509CertSelector.getSubjectAsBytes() == null && x509CertSelector.getSubjectAsString() == null && x509CertSelector.getCertificate() == null) {
                hashSet.addAll(search(str, "*", strArr));
                return hashSet;
            }
            if (x509CertSelector.getCertificate() != null) {
                name = x509CertSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                string = x509CertSelector.getCertificate().getSerialNumber().toString();
            } else {
                name = x509CertSelector.getSubjectAsBytes() != null ? new X500Principal(x509CertSelector.getSubjectAsBytes()).getName("RFC1779") : x509CertSelector.getSubjectAsString();
                string = null;
            }
            hashSet.addAll(search(str, "*" + AbstractC4989l.yandex(name, str2) + "*", strArr));
            if (string == null) {
                return hashSet;
            }
            throw null;
        } catch (IOException e) {
            throw new CertStoreException("exception processing selector: " + e);
        }
    }

    private DirContext connectLDAP() {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", LDAP_PROVIDER);
        properties.setProperty("java.naming.batchsize", "0");
        throw null;
    }

    private Set getCACertificates(X509CertSelector x509CertSelector) {
        throw null;
    }

    private Set getCrossCertificates(X509CertSelector x509CertSelector) {
        throw null;
    }

    private Set getEndCertificates(X509CertSelector x509CertSelector) {
        throw null;
    }

    private Set search(String str, String str2, String[] strArr) throws Throwable {
        String strPro = AbstractC9361l.pro(str, "=", str2);
        DirContext dirContext = null;
        if (str == null) {
            strPro = null;
        }
        HashSet hashSet = new HashSet();
        try {
            try {
                DirContext dirContextConnectLDAP = connectLDAP();
                try {
                    SearchControls searchControls = new SearchControls();
                    searchControls.setSearchScope(2);
                    searchControls.setCountLimit(0L);
                    if (strArr.length <= 0) {
                        if (dirContextConnectLDAP != null) {
                            try {
                                dirContextConnectLDAP.close();
                            } catch (Exception unused) {
                            }
                        }
                        return hashSet;
                    }
                    String[] strArr2 = {strArr[0]};
                    searchControls.setReturningAttributes(strArr2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("(&(");
                    sb.append(strPro);
                    sb.append(")(");
                    sb.append(strArr2[0]);
                    sb.append("=*))");
                    if (strPro != null) {
                        throw null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("(");
                    sb2.append(strArr2[0]);
                    sb2.append("=*)");
                    throw null;
                } catch (Exception e) {
                    e = e;
                    dirContext = dirContextConnectLDAP;
                    throw new CertStoreException("Error getting results from LDAP directory " + e);
                } catch (Throwable th) {
                    th = th;
                    dirContext = dirContextConnectLDAP;
                    if (dirContext != null) {
                        try {
                            dirContext.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) {
        throw null;
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        if (!(certSelector instanceof X509CertSelector)) {
            throw new CertStoreException("selector is not a X509CertSelector");
        }
        X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
        HashSet hashSet = new HashSet();
        Set<byte[]> endCertificates = getEndCertificates(x509CertSelector);
        endCertificates.addAll(getCACertificates(x509CertSelector));
        endCertificates.addAll(getCrossCertificates(x509CertSelector));
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
            for (byte[] bArr : endCertificates) {
                if (bArr != null && bArr.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bArr);
                    try {
                        C10938l c10938lVip = C10938l.vip(new Csynchronized(bArr).ads());
                        arrayList.clear();
                        C10818l c10818l = c10938lVip.f22059l;
                        if (c10818l != null) {
                            arrayList.add(c10818l.getEncoded());
                        }
                        C10818l c10818l2 = c10938lVip.f22058l;
                        if (c10818l2 != null) {
                            arrayList.add(c10818l2.getEncoded());
                        }
                    } catch (IOException | IllegalArgumentException unused) {
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream((byte[]) it.next()));
                            if (x509CertSelector.match(certificateGenerateCertificate)) {
                                hashSet.add(certificateGenerateCertificate);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            return hashSet;
        } catch (Exception e) {
            throw new CertStoreException("certificate cannot be constructed from LDAP result: " + e);
        }
    }
}
