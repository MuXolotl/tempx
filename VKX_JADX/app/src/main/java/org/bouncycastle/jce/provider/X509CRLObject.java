package org.bouncycastle.jce.provider;

import defpackage.AbstractC14024l;
import defpackage.C0649l;
import defpackage.C1074l;
import defpackage.C10818l;
import defpackage.C10915l;
import defpackage.C12541l;
import defpackage.C16457l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C2275l;
import defpackage.C2795l;
import defpackage.C8339l;
import defpackage.C9018l;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.applovin;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class X509CRLObject extends X509CRL {
    private C0649l c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    public X509CRLObject(C0649l c0649l) throws CRLException {
        this.c = c0649l;
        try {
            this.sigAlgName = X509SignatureUtil.getSignatureName(c0649l.f2108l);
            applovin applovinVar = c0649l.f2108l.f20786l;
            if (applovinVar != null) {
                this.sigAlgParams = applovinVar.billing().remoteconfig("DER");
            } else {
                this.sigAlgParams = null;
            }
            this.isIndirect = isIndirectCRL(this);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    private void doVerify(PublicKey publicKey, Signature signature) throws SignatureException, InvalidKeyException, CRLException {
        C0649l c0649l = this.c;
        if (!c0649l.f2108l.equals(c0649l.f2109l.f12568l)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("CRL does not verify with supplied public key.");
        }
    }

    private Set getExtensionOIDs(boolean z) {
        C1074l c1074l;
        if (getVersion() != 2 || (c1074l = this.c.f2109l.f12567l) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationElements = c1074l.f2957l.elements();
        while (enumerationElements.hasMoreElements()) {
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            if (z == c1074l.vip(cfor).f35734l) {
                hashSet.add(cfor.inmobi());
            }
        }
        return hashSet;
    }

    public static boolean isIndirectCRL(X509CRL x509crl) throws ExtCRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C18229l.f35729l.inmobi());
            return extensionValue != null && C2275l.metrica(Cthrow.premium(extensionValue).f36593l).f4969l;
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    private Set loadCRLEntries() {
        C18229l c18229lVip;
        HashSet hashSet = new HashSet();
        Enumeration enumerationMetrica = this.c.metrica();
        C10915l c10915lMetrica = null;
        while (enumerationMetrica.hasMoreElements()) {
            C16457l c16457l = (C16457l) enumerationMetrica.nextElement();
            hashSet.add(new X509CRLEntryObject(c16457l, this.isIndirect, c10915lMetrica));
            if (this.isIndirect && c16457l.tapsense() && (c18229lVip = c16457l.vip().vip(C18229l.f35726l)) != null) {
                c10915lMetrica = C10915l.metrica(C9018l.vip(c18229lVip.vip()).metrica()[0].f24470l);
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (this.isHashCodeSet && x509CRLObject.isHashCodeSet && x509CRLObject.hashCodeValue != this.hashCodeValue) {
            return false;
        }
        return this.c.equals(x509CRLObject.c);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.c.remoteconfig("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return X509SignatureUtil.getExtensionValue(this.c.f2109l.f12567l, str);
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new C12541l(C10915l.metrica(this.c.f2109l.f12566l.f22038l));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.f2109l.f12566l.getEncoded());
        } catch (IOException unused) {
            C8339l.smaato("can't encode issuer DN");
            return null;
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        C2795l c2795l = this.c.f2109l.f12570l;
        if (c2795l == null) {
            return null;
        }
        return c2795l.vip();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        C18229l c18229lVip;
        Enumeration enumerationMetrica = this.c.metrica();
        C10915l c10915lMetrica = null;
        while (enumerationMetrica.hasMoreElements()) {
            C16457l c16457l = (C16457l) enumerationMetrica.nextElement();
            if (c16457l.ads().m4586throws(bigInteger)) {
                return new X509CRLEntryObject(c16457l, this.isIndirect, c10915lMetrica);
            }
            if (this.isIndirect && c16457l.tapsense() && (c18229lVip = c16457l.vip().vip(C18229l.f35726l)) != null) {
                c10915lMetrica = C10915l.metrica(C9018l.vip(c18229lVip.vip()).metrica()[0].f24470l);
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set setLoadCRLEntries = loadCRLEntries();
        if (setLoadCRLEntries.isEmpty()) {
            return null;
        }
        return DesugarCollections.unmodifiableSet(setLoadCRLEntries);
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.c.f2108l.f20787l.inmobi();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return AbstractC14024l.crashlytics(this.sigAlgParams);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.c.f2107l.inmobi();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.c.f2109l.remoteconfig("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.c.f2109l.f12571l.vip();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        Cstrictfp cstrictfp = this.c.f2109l.f12569l;
        if (cstrictfp == null) {
            return 1;
        }
        return cstrictfp.m4585strictfp() + 1;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        C1074l c1074l;
        if (getVersion() != 2 || (c1074l = this.c.f2109l.f12567l) == null) {
            return false;
        }
        Enumeration enumerationElements = c1074l.f2957l.elements();
        while (enumerationElements.hasMoreElements()) {
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            if (!C18229l.f35729l.ad(cfor) && !C18229l.f35722l.ad(cfor) && c1074l.vip(cfor).f35734l) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.isHashCodeSet) {
            this.isHashCodeSet = true;
            this.hashCodeValue = super.hashCode();
        }
        return this.hashCodeValue;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        String str;
        C10915l c10915lMetrica;
        C18229l c18229lVip;
        if (certificate.getType().equals("X.509")) {
            Enumeration enumerationMetrica = this.c.metrica();
            C10915l c10915lMetrica2 = this.c.f2109l.f12566l;
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (enumerationMetrica.hasMoreElements()) {
                C16457l c16457lMetrica = C16457l.metrica(enumerationMetrica.nextElement());
                if (this.isIndirect && c16457lMetrica.tapsense() && (c18229lVip = c16457lMetrica.vip().vip(C18229l.f35726l)) != null) {
                    c10915lMetrica2 = C10915l.metrica(C9018l.vip(c18229lVip.vip()).metrica()[0].f24470l);
                }
                if (c16457lMetrica.ads().m4586throws(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        c10915lMetrica = C10915l.metrica(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            c10915lMetrica = C10818l.vip(certificate.getEncoded()).f21865l.f34978l;
                        } catch (CertificateEncodingException unused) {
                            str = "Cannot process certificate";
                            C18073l.license(str);
                        }
                    }
                    if (!c10915lMetrica2.equals(c10915lMetrica)) {
                        break;
                    }
                    return true;
                }
            }
            return false;
        }
        str = "X.509 CRL used with non X.509 Cert";
        C18073l.license(str);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e4 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:23:0x00dc, B:25:0x00e4, B:26:0x00f5, B:27:0x00f8, B:28:0x00fc, B:30:0x0104, B:31:0x0126, B:32:0x012a, B:34:0x0132, B:35:0x013b, B:37:0x0143, B:38:0x014c, B:40:0x0154, B:41:0x015d), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:23:0x00dc, B:25:0x00e4, B:26:0x00f5, B:27:0x00f8, B:28:0x00fc, B:30:0x0104, B:31:0x0126, B:32:0x012a, B:34:0x0132, B:35:0x013b, B:37:0x0143, B:38:0x014c, B:40:0x0154, B:41:0x015d), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0104 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:23:0x00dc, B:25:0x00e4, B:26:0x00f5, B:27:0x00f8, B:28:0x00fc, B:30:0x0104, B:31:0x0126, B:32:0x012a, B:34:0x0132, B:35:0x013b, B:37:0x0143, B:38:0x014c, B:40:0x0154, B:41:0x015d), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:32:0x012a A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:23:0x00dc, B:25:0x00e4, B:26:0x00f5, B:27:0x00f8, B:28:0x00fc, B:30:0x0104, B:31:0x0126, B:32:0x012a, B:34:0x0132, B:35:0x013b, B:37:0x0143, B:38:0x014c, B:40:0x0154, B:41:0x015d), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0132 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:23:0x00dc, B:25:0x00e4, B:26:0x00f5, B:27:0x00f8, B:28:0x00fc, B:30:0x0104, B:31:0x0126, B:32:0x012a, B:34:0x0132, B:35:0x013b, B:37:0x0143, B:38:0x014c, B:40:0x0154, B:41:0x015d), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:35:0x013b A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:23:0x00dc, B:25:0x00e4, B:26:0x00f5, B:27:0x00f8, B:28:0x00fc, B:30:0x0104, B:31:0x0126, B:32:0x012a, B:34:0x0132, B:35:0x013b, B:37:0x0143, B:38:0x014c, B:40:0x0154, B:41:0x015d), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x0172
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLObject.toString():java.lang.String");
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        doVerify(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws SignatureException, InvalidKeyException, CRLException {
        doVerify(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) throws SignatureException, InvalidKeyException, CRLException {
        doVerify(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
