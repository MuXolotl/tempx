package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC12994l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC5020l;
import defpackage.C0649l;
import defpackage.C10198l;
import defpackage.C1074l;
import defpackage.C10818l;
import defpackage.C10915l;
import defpackage.C12541l;
import defpackage.C16145l;
import defpackage.C16457l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C18262l;
import defpackage.C2795l;
import defpackage.C8339l;
import defpackage.C9018l;
import defpackage.C9556l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.InterfaceC12575l;
import defpackage.advert;
import defpackage.applovin;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
abstract class X509CRLImpl extends X509CRL {
    protected InterfaceC12575l bcHelper;
    protected C0649l c;
    protected boolean isIndirect;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    public X509CRLImpl(InterfaceC12575l interfaceC12575l, C0649l c0649l, String str, byte[] bArr, boolean z) {
        this.bcHelper = interfaceC12575l;
        this.c = c0649l;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
        this.isIndirect = z;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, applovin applovinVar, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        C0649l c0649l = this.c;
        if (!X509SignatureUtil.areEquivalentAlgorithms(c0649l.f2108l, c0649l.f2109l.f12568l)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TbsCertList.");
        }
        X509SignatureUtil.setSignatureParameters(signature, applovinVar);
        signature.initVerify(publicKey);
        try {
            C16145l c16145l = new C16145l(4);
            c16145l.f31614l = signature;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c16145l, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
            this.c.f2109l.billing().tapsense(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        C0649l c0649l = this.c;
        if (!c0649l.f2108l.equals(c0649l.f2109l.f12568l)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        int i = 0;
        if ((publicKey instanceof C9556l) && X509SignatureUtil.isCompositeAlgorithm(this.c.f2108l)) {
            List list = ((C9556l) publicKey).f19473l;
            Cclass cclassInmobi = Cclass.inmobi(this.c.f2108l.f20786l);
            Cclass cclassInmobi2 = Cclass.inmobi(this.c.f2107l.inmobi());
            boolean z = false;
            while (i != list.size()) {
                if (list.get(i) != null) {
                    C10198l c10198lVip = C10198l.vip(cclassInmobi.mo173throws(i));
                    try {
                        checkSignature((PublicKey) list.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(c10198lVip)), c10198lVip.f20786l, advert.appmetrica(cclassInmobi2.mo173throws(i)).inmobi());
                        e = null;
                        z = true;
                    } catch (SignatureException e) {
                        e = e;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (z) {
                return;
            }
            C18073l.smaato("no matching key found");
            return;
        }
        if (!X509SignatureUtil.isCompositeAlgorithm(this.c.f2108l)) {
            Signature signatureCreateSignature = signatureCreator.createSignature(getSigAlgName());
            byte[] bArr = this.sigAlgParams;
            if (bArr == null) {
                checkSignature(publicKey, signatureCreateSignature, null, getSignature());
                return;
            }
            try {
                checkSignature(publicKey, signatureCreateSignature, Ccase.advert(bArr), getSignature());
                return;
            } catch (IOException e2) {
                throw new SignatureException(AbstractC5020l.adcel(e2, new StringBuilder("cannot decode signature parameters: ")));
            }
        }
        Cclass cclassInmobi3 = Cclass.inmobi(this.c.f2108l.f20786l);
        Cclass cclassInmobi4 = Cclass.inmobi(this.c.f2107l.inmobi());
        boolean z2 = false;
        while (i != cclassInmobi4.size()) {
            C10198l c10198lVip2 = C10198l.vip(cclassInmobi3.mo173throws(i));
            try {
                checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(c10198lVip2)), c10198lVip2.f20786l, advert.appmetrica(cclassInmobi4.mo173throws(i)).inmobi());
                e = null;
                z2 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                e = null;
            } catch (SignatureException e3) {
                e = e3;
            }
            if (e != null) {
                throw e;
            }
            i++;
        }
        if (z2) {
            return;
        }
        C18073l.smaato("no matching key found");
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

    public static byte[] getExtensionOctets(C0649l c0649l, Cfor cfor) {
        Cthrow cthrowMetrica = C1074l.metrica(c0649l.f2109l.f12567l, cfor);
        if (cthrowMetrica == null) {
            return null;
        }
        return cthrowMetrica.f36593l;
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

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
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

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        C10915l c10915lMetrica;
        C18229l c18229lVip;
        if (!certificate.getType().equals("X.509")) {
            C8339l.metrica("X.509 CRL used with non X.509 Cert");
            return false;
        }
        Enumeration enumerationMetrica = this.c.metrica();
        C10915l c10915lMetrica2 = this.c.f2109l.f12566l;
        if (enumerationMetrica.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (enumerationMetrica.hasMoreElements()) {
                C16457l c16457lMetrica = C16457l.metrica(enumerationMetrica.nextElement());
                if (this.isIndirect && c16457lMetrica.tapsense() && (c18229lVip = c16457lMetrica.vip().vip(C18229l.f35726l)) != null) {
                    c10915lMetrica2 = C10915l.metrica(C9018l.vip(c18229lVip.vip()).metrica()[0].f24470l);
                }
                if (c16457lMetrica.ads().m4586throws(serialNumber)) {
                    if (!(certificate instanceof X509Certificate)) {
                        try {
                            c10915lMetrica = C10818l.vip(certificate.getEncoded()).f21865l.f34978l;
                        } catch (CertificateEncodingException e) {
                            C18262l.startapp(e.getMessage(), "Cannot process certificate: ");
                            break;
                        }
                    } else {
                        c10915lMetrica = C10915l.metrica(x509Certificate.getIssuerX500Principal().getEncoded());
                    }
                    if (!c10915lMetrica2.equals(c10915lMetrica)) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007d  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a9 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:14:0x00a1, B:16:0x00a9, B:17:0x00ba, B:18:0x00bd, B:19:0x00c1, B:21:0x00c9, B:22:0x00eb, B:23:0x00ef, B:25:0x00f7, B:26:0x0100, B:28:0x0108, B:29:0x0111, B:31:0x0119, B:32:0x0122), top: B:43:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c1 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:14:0x00a1, B:16:0x00a9, B:17:0x00ba, B:18:0x00bd, B:19:0x00c1, B:21:0x00c9, B:22:0x00eb, B:23:0x00ef, B:25:0x00f7, B:26:0x0100, B:28:0x0108, B:29:0x0111, B:31:0x0119, B:32:0x0122), top: B:43:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00c9 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:14:0x00a1, B:16:0x00a9, B:17:0x00ba, B:18:0x00bd, B:19:0x00c1, B:21:0x00c9, B:22:0x00eb, B:23:0x00ef, B:25:0x00f7, B:26:0x0100, B:28:0x0108, B:29:0x0111, B:31:0x0119, B:32:0x0122), top: B:43:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00ef A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:14:0x00a1, B:16:0x00a9, B:17:0x00ba, B:18:0x00bd, B:19:0x00c1, B:21:0x00c9, B:22:0x00eb, B:23:0x00ef, B:25:0x00f7, B:26:0x0100, B:28:0x0108, B:29:0x0111, B:31:0x0119, B:32:0x0122), top: B:43:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00f7 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:14:0x00a1, B:16:0x00a9, B:17:0x00ba, B:18:0x00bd, B:19:0x00c1, B:21:0x00c9, B:22:0x00eb, B:23:0x00ef, B:25:0x00f7, B:26:0x0100, B:28:0x0108, B:29:0x0111, B:31:0x0119, B:32:0x0122), top: B:43:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0100 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:14:0x00a1, B:16:0x00a9, B:17:0x00ba, B:18:0x00bd, B:19:0x00c1, B:21:0x00c9, B:22:0x00eb, B:23:0x00ef, B:25:0x00f7, B:26:0x0100, B:28:0x0108, B:29:0x0111, B:31:0x0119, B:32:0x0122), top: B:43:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x0135
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.toString():java.lang.String");
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    Provider provider2 = provider;
                    X509CRLImpl x509CRLImpl = X509CRLImpl.this;
                    return provider2 != null ? Signature.getInstance(x509CRLImpl.getSigAlgName(), provider) : Signature.getInstance(x509CRLImpl.getSigAlgName());
                }
            });
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: " + e.getMessage());
        }
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CRLImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }
}
