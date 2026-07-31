package org.bouncycastle.jce.provider;

import defpackage.C9313l;
import defpackage.InterfaceC0168l;
import defpackage.InterfaceC14413l;
import defpackage.InterfaceC17473l;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

/* JADX INFO: loaded from: classes3.dex */
class CrlCache {
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<InterfaceC17473l>> cache = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static class LocalCRLStore<T extends CRL> implements InterfaceC17473l, Iterable {
        private Collection<CRL> _local;

        public LocalCRLStore(InterfaceC14413l interfaceC14413l) {
            this._local = new ArrayList(interfaceC14413l.getMatches(null));
        }

        @Override // defpackage.InterfaceC14413l
        public Collection getMatches(InterfaceC0168l interfaceC0168l) {
            if (interfaceC0168l == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl : this._local) {
                if (interfaceC0168l.mopub(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        @Override // java.lang.Iterable
        public Iterator<CRL> iterator() {
            return getMatches(null).iterator();
        }
    }

    public static synchronized InterfaceC17473l getCrl(CertificateFactory certificateFactory, Date date, URI uri) {
        try {
            WeakReference<InterfaceC17473l> weakReference = cache.get(uri);
            InterfaceC17473l interfaceC17473l = weakReference != null ? weakReference.get() : null;
            if (interfaceC17473l != null) {
                Iterator it = interfaceC17473l.getMatches(null).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        return interfaceC17473l;
                    }
                    Date nextUpdate = ((X509CRL) it.next()).getNextUpdate();
                    if (nextUpdate != null && nextUpdate.before(date)) {
                        break;
                    }
                }
            }
            Collection crlsFromLDAP = uri.getScheme().equals("ldap") ? getCrlsFromLDAP(certificateFactory, uri) : getCrls(certificateFactory, uri);
            C9313l c9313l = new C9313l();
            c9313l.f19125l = new ArrayList(crlsFromLDAP);
            LocalCRLStore localCRLStore = new LocalCRLStore(c9313l);
            cache.put(uri, new WeakReference<>(localCRLStore));
            return localCRLStore;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static Collection getCrls(CertificateFactory certificateFactory, URI uri) throws IOException, CRLException {
        URLConnection uRLConnectionOpenConnection = uri.toURL().openConnection();
        uRLConnectionOpenConnection.setConnectTimeout(DEFAULT_TIMEOUT);
        uRLConnectionOpenConnection.setReadTimeout(DEFAULT_TIMEOUT);
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Collection<? extends CRL> collectionGenerateCRLs = certificateFactory.generateCRLs(inputStream);
        inputStream.close();
        return collectionGenerateCRLs;
    }

    private static Collection getCrlsFromLDAP(CertificateFactory certificateFactory, URI uri) throws CRLException {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
            }
            throw new CRLException("no CRL returned from: " + uri);
        } catch (NamingException e) {
            throw new CRLException("issue connecting to: " + uri.toString(), e);
        }
    }
}
