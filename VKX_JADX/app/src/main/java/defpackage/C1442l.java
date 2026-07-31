package defpackage;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: lؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1442l implements CertSelector, InterfaceC0168l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17146l f3627l;

    public C1442l(Cclass cclass) {
        this.f3627l = C17146l.vip(cclass);
    }

    public static boolean crashlytics(C12541l c12541l, C9018l c9018l) {
        C12378l[] c12378lArrMetrica = c9018l.metrica();
        for (int i = 0; i != c12378lArrMetrica.length; i++) {
            C12378l c12378l = c12378lArrMetrica[i];
            if (c12378l.f24469l == 4) {
                try {
                    try {
                        if (new C12541l(Cclass.inmobi(new Csynchronized(c12378l.f24470l.billing().getEncoded()).ads())).equals(c12541l)) {
                            return true;
                        }
                    } catch (IllegalArgumentException e) {
                        throw new IOException("not an ASN.1 Sequence: " + e);
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public static Principal[] loadAd(C9018l c9018l) {
        C12378l[] c12378lArrMetrica = c9018l.metrica();
        ArrayList arrayList = new ArrayList(c12378lArrMetrica.length);
        for (int i = 0; i != c12378lArrMetrica.length; i++) {
            if (c12378lArrMetrica[i].f24469l == 4) {
                try {
                    arrayList.add(new X500Principal(c12378lArrMetrica[i].f24470l.billing().getEncoded()));
                } catch (IOException unused) {
                    C18073l.license("badly formed Name object");
                    return null;
                }
            }
        }
        Object[] array = arrayList.toArray(new Object[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 != array.length; i2++) {
            Object obj = array[i2];
            if (obj instanceof Principal) {
                arrayList2.add(obj);
            }
        }
        return (Principal[]) arrayList2.toArray(new Principal[arrayList2.size()]);
    }

    @Override // java.security.cert.CertSelector
    public final Object clone() {
        return new C1442l((Cclass) this.f3627l.billing());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1442l) {
            return this.f3627l.equals(((C1442l) obj).f3627l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3627l.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (crashlytics(new defpackage.C12541l(defpackage.C9130l.ads(defpackage.C18240l.vip(defpackage.Ccase.advert(r0.getTBSCertificate())).f35749l)), r3) != false) goto L22;
     */
    @Override // java.security.cert.CertSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean match(java.security.cert.Certificate r7) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            r6 = this;
            lٕٗٔ r6 = r6.f3627l
            boolean r0 = r7 instanceof java.security.cert.X509Certificate
            r1 = 0
            if (r0 != 0) goto L9
            goto Lbc
        L9:
            r0 = r7
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            lًؙؕ r2 = r6.f33333l     // Catch: java.lang.Throwable -> Lbc
            lٌۙٝ r3 = r6.f33332l
            lؙۦٙ r4 = r6.f33331l
            r5 = 1
            if (r2 == 0) goto L4e
            strictfp r7 = r2.f16348l     // Catch: java.lang.Throwable -> Lbc
            java.math.BigInteger r2 = r0.getSerialNumber()     // Catch: java.lang.Throwable -> Lbc
            boolean r7 = r7.m4586throws(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto Lbc
            byte[] r7 = r0.getTBSCertificate()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            case r7 = defpackage.Ccase.advert(r7)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            l٘۟ۘ r7 = defpackage.C18240l.vip(r7)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            lُّۨ r0 = new lُّۨ     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            lًٌُ r7 = r7.f35750l     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            lٌِۢ r7 = defpackage.C9130l.ads(r7)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            r0.<init>(r7)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            lًؙؕ r6 = r6.f33333l     // Catch: java.lang.Throwable -> Lbc
            lٌۙٝ r6 = r6.f16349l     // Catch: java.lang.Throwable -> Lbc
            boolean r6 = crashlytics(r0, r6)     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto Lbc
            goto L6d
        L43:
            r6 = move-exception
            java.security.cert.CertificateEncodingException r7 = new java.security.cert.CertificateEncodingException     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbc
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lbc
            throw r7     // Catch: java.lang.Throwable -> Lbc
        L4e:
            if (r3 == 0) goto L79
            byte[] r6 = r0.getTBSCertificate()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            case r6 = defpackage.Ccase.advert(r6)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            l٘۟ۘ r6 = defpackage.C18240l.vip(r6)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            lُّۨ r0 = new lُّۨ     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            lًٌُ r6 = r6.f35749l     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            lٌِۢ r6 = defpackage.C9130l.ads(r6)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            r0.<init>(r6)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            boolean r6 = crashlytics(r0, r3)     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto L79
        L6d:
            return r5
        L6e:
            r6 = move-exception
            java.security.cert.CertificateEncodingException r7 = new java.security.cert.CertificateEncodingException     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbc
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lbc
            throw r7     // Catch: java.lang.Throwable -> Lbc
        L79:
            if (r4 == 0) goto Lbc
            lٍَٟ r6 = r4.f14427l
            for r6 = r6.f20787l
            java.lang.String r6 = r6.inmobi()
            java.lang.String r0 = "BC"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6, r0)
            if (r4 == 0) goto L92
            inmobi r0 = r4.f14429l     // Catch: java.lang.Throwable -> Lbc
            int r0 = r0.appmetrica()     // Catch: java.lang.Throwable -> Lbc
            goto L93
        L92:
            r0 = -1
        L93:
            if (r0 == 0) goto La0
            if (r0 == r5) goto L98
            goto Lab
        L98:
            byte[] r7 = r7.getEncoded()     // Catch: java.lang.Throwable -> Lbc
            r6.update(r7)     // Catch: java.lang.Throwable -> Lbc
            goto Lab
        La0:
            java.security.PublicKey r7 = r7.getPublicKey()     // Catch: java.lang.Throwable -> Lbc
            byte[] r7 = r7.getEncoded()     // Catch: java.lang.Throwable -> Lbc
            r6.update(r7)     // Catch: java.lang.Throwable -> Lbc
        Lab:
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb8
            advert r7 = r4.f14430l     // Catch: java.lang.Throwable -> Lbc
            byte[] r7 = r7.applovin()     // Catch: java.lang.Throwable -> Lbc
            goto Lb9
        Lb8:
            r7 = 0
        Lb9:
            java.util.Arrays.equals(r6, r7)     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1442l.match(java.security.cert.Certificate):boolean");
    }

    @Override // defpackage.InterfaceC0168l
    public final boolean mopub(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    public final Principal[] yandex() {
        C9018l c9018l = this.f3627l.f33332l;
        if (c9018l != null) {
            return loadAd(c9018l);
        }
        return null;
    }
}
