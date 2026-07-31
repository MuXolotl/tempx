package org.bouncycastle.jce.provider;

import defpackage.C10915l;
import defpackage.C18073l;
import defpackage.C5427l;
import defpackage.InterfaceC11126l;
import defpackage.InterfaceC1179l;
import defpackage.InterfaceC9124l;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
class PrincipalUtils {
    public static C10915l getCA(TrustAnchor trustAnchor) {
        return getX500Name(notNull(trustAnchor).getCA());
    }

    private static byte[] getEncoded(X500Principal x500Principal) {
        return notNull(notNull(x500Principal).getEncoded());
    }

    public static C10915l getEncodedIssuerPrincipal(Object obj) {
        return obj instanceof X509Certificate ? getIssuerPrincipal((X509Certificate) obj) : getIssuerPrincipal((InterfaceC9124l) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C10915l getIssuerPrincipal(X509Certificate x509Certificate) {
        return x509Certificate instanceof InterfaceC1179l ? notNull(((InterfaceC1179l) x509Certificate).getIssuerX500Name()) : getX500Name(notNull(x509Certificate).getIssuerX500Principal());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C10915l getSubjectPrincipal(X509Certificate x509Certificate) {
        return x509Certificate instanceof InterfaceC1179l ? notNull(((InterfaceC1179l) x509Certificate).getSubjectX500Name()) : getX500Name(notNull(x509Certificate).getSubjectX500Principal());
    }

    public static C10915l getX500Name(InterfaceC11126l interfaceC11126l, X500Principal x500Principal) {
        return notNull(C10915l.vip(interfaceC11126l, getEncoded(x500Principal)));
    }

    private static C10915l notNull(C10915l c10915l) {
        if (c10915l != null) {
            return c10915l;
        }
        C18073l.admob();
        return null;
    }

    private static InterfaceC9124l notNull(InterfaceC9124l interfaceC9124l) {
        if (interfaceC9124l != null) {
            return interfaceC9124l;
        }
        C18073l.admob();
        return null;
    }

    private static TrustAnchor notNull(TrustAnchor trustAnchor) {
        if (trustAnchor != null) {
            return trustAnchor;
        }
        C18073l.admob();
        return null;
    }

    private static X509CRL notNull(X509CRL x509crl) {
        if (x509crl != null) {
            return x509crl;
        }
        C18073l.admob();
        return null;
    }

    private static X509Certificate notNull(X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            return x509Certificate;
        }
        C18073l.admob();
        return null;
    }

    private static X500Principal notNull(X500Principal x500Principal) {
        if (x500Principal != null) {
            return x500Principal;
        }
        C18073l.admob();
        return null;
    }

    public static C10915l getX500Name(X500Principal x500Principal) {
        return notNull(C10915l.metrica(getEncoded(x500Principal)));
    }

    private static byte[] notNull(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        C18073l.admob();
        return null;
    }

    public static C10915l getIssuerPrincipal(X509CRL x509crl) {
        return getX500Name(notNull(x509crl).getIssuerX500Principal());
    }

    public static C10915l getIssuerPrincipal(InterfaceC9124l interfaceC9124l) {
        return getX500Name((X500Principal) ((C5427l) notNull(interfaceC9124l)).purchase().yandex()[0]);
    }
}
