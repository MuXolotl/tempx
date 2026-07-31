package org.bouncycastle.jcajce.provider.asymmetric.x509;

import androidx.car.app.model.Alert;
import defpackage.AbstractC12994l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC5006l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C10361l;
import defpackage.C10604l;
import defpackage.C1074l;
import defpackage.C10818l;
import defpackage.C10915l;
import defpackage.C11144l;
import defpackage.C12378l;
import defpackage.C12541l;
import defpackage.C16145l;
import defpackage.C17967l;
import defpackage.C18073l;
import defpackage.C18229l;
import defpackage.C4875l;
import defpackage.C5836l;
import defpackage.C8021l;
import defpackage.C8339l;
import defpackage.C9187l;
import defpackage.C9556l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cdefault;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.Csynchronized;
import defpackage.Cthrow;
import defpackage.InterfaceC1179l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC4787l;
import defpackage.advert;
import defpackage.applovin;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
abstract class X509CertificateImpl extends X509Certificate implements InterfaceC1179l {
    protected C11144l basicConstraints;
    protected InterfaceC12575l bcHelper;
    protected C10818l c;
    protected boolean[] keyUsage;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    public X509CertificateImpl(InterfaceC12575l interfaceC12575l, C10818l c10818l, C11144l c11144l, boolean[] zArr, String str, byte[] bArr) {
        this.bcHelper = interfaceC12575l;
        this.c = c10818l;
        this.basicConstraints = c11144l;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, applovin applovinVar, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        C10818l c10818l = this.c;
        if (!X509SignatureUtil.areEquivalentAlgorithms(c10818l.f21864l, c10818l.f21865l.f34979l)) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature, applovinVar);
        signature.initVerify(publicKey);
        try {
            C16145l c16145l = new C16145l(4);
            c16145l.f31614l = signature;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c16145l, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
            this.c.f21865l.billing().tapsense(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        boolean z = publicKey instanceof C9556l;
        int i = 0;
        if (z && X509SignatureUtil.isCompositeAlgorithm(this.c.f21864l)) {
            List list = ((C9556l) publicKey).f19473l;
            Cclass cclassInmobi = Cclass.inmobi(this.c.f21864l.f20786l);
            Cclass cclassInmobi2 = Cclass.inmobi(this.c.f21867l.inmobi());
            boolean z2 = false;
            while (i != list.size()) {
                if (list.get(i) != null) {
                    C10198l c10198lVip = C10198l.vip(cclassInmobi.mo173throws(i));
                    try {
                        checkSignature((PublicKey) list.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(c10198lVip)), c10198lVip.f20786l, advert.appmetrica(cclassInmobi2.mo173throws(i)).inmobi());
                        e = null;
                        z2 = true;
                    } catch (SignatureException e) {
                        e = e;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (z2) {
                return;
            }
            C18073l.smaato("no matching key found");
            return;
        }
        if (!X509SignatureUtil.isCompositeAlgorithm(this.c.f21864l)) {
            Signature signatureCreateSignature = signatureCreator.createSignature(getSigAlgName());
            if (z) {
                C9556l c9556l = (C9556l) publicKey;
                if (InterfaceC4787l.license.ad(c9556l.f19472l.f20787l)) {
                    List list2 = c9556l.f19473l;
                    while (i != list2.size()) {
                        try {
                            checkSignature((PublicKey) list2.get(i), signatureCreateSignature, this.c.f21864l.f20786l, getSignature());
                            return;
                        } catch (InvalidKeyException unused) {
                            i++;
                        }
                    }
                    C18073l.smaato("no matching signature found");
                    return;
                }
            }
            checkSignature(publicKey, signatureCreateSignature, this.c.f21864l.f20786l, getSignature());
            return;
        }
        Cclass cclassInmobi3 = Cclass.inmobi(this.c.f21864l.f20786l);
        Cclass cclassInmobi4 = Cclass.inmobi(this.c.f21867l.inmobi());
        boolean z3 = false;
        while (i != cclassInmobi4.size()) {
            C10198l c10198lVip2 = C10198l.vip(cclassInmobi3.mo173throws(i));
            try {
                checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(c10198lVip2)), c10198lVip2.f20786l, advert.appmetrica(cclassInmobi4.mo173throws(i)).inmobi());
                e = null;
                z3 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                e = null;
            } catch (SignatureException e2) {
                e = e2;
            }
            if (e != null) {
                throw e;
            }
            i++;
        }
        if (z3) {
            return;
        }
        C18073l.smaato("no matching key found");
    }

    private static Collection getAlternativeNames(C10818l c10818l, Cfor cfor) throws CertificateParsingException {
        Object encoded;
        byte[] extensionOctets = getExtensionOctets(c10818l, cfor);
        if (extensionOctets == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationMo170package = Cclass.inmobi(extensionOctets).mo170package();
            while (enumerationMo170package.hasMoreElements()) {
                C12378l c12378lVip = C12378l.vip(enumerationMo170package.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(c12378lVip.f24469l));
                switch (c12378lVip.f24469l) {
                    case 0:
                    case 3:
                    case 5:
                        encoded = c12378lVip.getEncoded();
                        arrayList2.add(encoded);
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        break;
                    case 1:
                    case 2:
                    case 6:
                        encoded = ((Cdefault) c12378lVip.f24470l).mopub();
                        arrayList2.add(encoded);
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        C10915l c10915lVip = C10915l.vip(C5836l.f12290l, c12378lVip.f24470l);
                        encoded = c10915lVip.f22035l.yandex(c10915lVip);
                        arrayList2.add(encoded);
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            encoded = InetAddress.getByAddress(Cthrow.premium(c12378lVip.f24470l).f36593l).getHostAddress();
                            arrayList2.add(encoded);
                            arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                        break;
                    case 8:
                        encoded = Cfor.m192throws(c12378lVip.f24470l).inmobi();
                        arrayList2.add(encoded);
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException("Bad tag number: " + c12378lVip.f24469l);
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return DesugarCollections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    public static byte[] getExtensionOctets(C10818l c10818l, Cfor cfor) {
        Cthrow cthrowMetrica = C1074l.metrica(c10818l.f21865l.f34982l, cfor);
        if (cthrowMetrica == null) {
            return null;
        }
        return cthrowMetrica.f36593l;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.c.f21865l.f34981l.f7781l.ads()));
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.c.f21865l.f34981l.f7782l.ads()));
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        C11144l c11144l = this.basicConstraints;
        if (c11144l == null || !c11144l.metrica()) {
            return -1;
        }
        Cstrictfp cstrictfp = this.basicConstraints.f22395l;
        return cstrictfp == null ? Alert.DURATION_SHOW_INDEFINITELY : cstrictfp.m4584package();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        C1074l c1074l = this.c.f21865l.f34982l;
        if (c1074l == null) {
            return null;
        }
        Enumeration enumerationElements = c1074l.f2957l.elements();
        while (enumerationElements.hasMoreElements()) {
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            if (c1074l.vip(cfor).f35734l) {
                hashSet.add(cfor.inmobi());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] extensionOctets = getExtensionOctets(this.c, C18229l.f35720l);
        if (extensionOctets == null) {
            return null;
        }
        try {
            Cclass cclassInmobi = Cclass.inmobi(extensionOctets);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != cclassInmobi.size(); i++) {
                arrayList.add(((Cfor) cclassInmobi.mo173throws(i)).inmobi());
            }
            return DesugarCollections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return X509SignatureUtil.getExtensionValue(this.c.f21865l.f34982l, str);
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return getAlternativeNames(this.c, C18229l.f35728l);
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new C12541l(this.c.f21865l.f34978l);
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        advert advertVar = this.c.f21865l.f34980l;
        if (advertVar == null) {
            return null;
        }
        byte[] bArrApplovin = advertVar.applovin();
        int length = (bArrApplovin.length * 8) - advertVar.firebase();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrApplovin[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // defpackage.InterfaceC1179l
    public C10915l getIssuerX500Name() {
        return this.c.f21865l.f34978l;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.f21865l.f34978l.remoteconfig("DER"));
        } catch (IOException unused) {
            C8339l.smaato("can't encode issuer DN");
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        boolean[] zArr = this.keyUsage;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        C1074l c1074l = this.c.f21865l.f34982l;
        if (c1074l == null) {
            return null;
        }
        Enumeration enumerationElements = c1074l.f2957l.elements();
        while (enumerationElements.hasMoreElements()) {
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            if (!c1074l.vip(cfor).f35734l) {
                hashSet.add(cfor.inmobi());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.c.f21865l.f34981l.f7781l.vip();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.c.f21865l.f34981l.f7782l.vip();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.c.f21865l.f34974l);
        } catch (IOException e) {
            C4875l.remoteconfig(AbstractC5020l.adcel(e, new StringBuilder("failed to recover public key: ")), e);
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.c.f21865l.f34972l.appmetrica();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.c.f21864l.f20787l.inmobi();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return AbstractC14024l.crashlytics(this.sigAlgParams);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.c.f21867l.inmobi();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return getAlternativeNames(this.c, C18229l.f35724l);
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new C12541l(this.c.f21865l.f34973l);
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        advert advertVar = this.c.f21865l.f34977l;
        if (advertVar == null) {
            return null;
        }
        byte[] bArrApplovin = advertVar.applovin();
        int length = (bArrApplovin.length * 8) - advertVar.firebase();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrApplovin[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // defpackage.InterfaceC1179l
    public C10915l getSubjectX500Name() {
        return this.c.f21865l.f34973l;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.f21865l.f34973l.remoteconfig("DER"));
        } catch (IOException unused) {
            C8339l.smaato("can't encode subject DN");
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.c.f21865l.remoteconfig("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // defpackage.InterfaceC1179l
    public C17967l getTBSCertificateNative() {
        return this.c.f21865l;
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.c.f21865l.f34975l.m4585strictfp() + 1;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        C1074l c1074l;
        if (getVersion() != 3 || (c1074l = this.c.f21865l.f34982l) == null) {
            return false;
        }
        Enumeration enumerationElements = c1074l.f2957l.elements();
        while (enumerationElements.hasMoreElements()) {
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            if (!C18229l.f35725l.ad(cfor) && !C18229l.f35723l.ad(cfor) && !C18229l.f35718l.ad(cfor) && !C18229l.f35715l.ad(cfor) && !C18229l.f35730l.ad(cfor) && !C18229l.f35729l.ad(cfor) && !C18229l.f35722l.ad(cfor) && !C18229l.f35731l.ad(cfor) && !C18229l.f35714l.ad(cfor) && !C18229l.f35724l.ad(cfor) && !C18229l.f35713l.ad(cfor) && c1074l.vip(cfor).f35734l) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        Object c9187l;
        C10361l c10361l;
        StringBuilder sb = new StringBuilder();
        String str = AbstractC9008l.yandex;
        sb.append("  [0]         Version: ");
        sb.append(getVersion());
        sb.append(str);
        sb.append("         SerialNumber: ");
        sb.append(getSerialNumber());
        sb.append(str);
        sb.append("             IssuerDN: ");
        sb.append(getIssuerDN());
        sb.append(str);
        sb.append("           Start Date: ");
        sb.append(getNotBefore());
        sb.append(str);
        sb.append("           Final Date: ");
        sb.append(getNotAfter());
        sb.append(str);
        sb.append("            SubjectDN: ");
        sb.append(getSubjectDN());
        sb.append(str);
        sb.append("           Public Key: ");
        sb.append(getPublicKey());
        sb.append(str);
        sb.append("  Signature Algorithm: ");
        sb.append(getSigAlgName());
        sb.append(str);
        X509SignatureUtil.prettyPrintSignature(getSignature(), sb, str);
        C1074l c1074l = this.c.f21865l.f34982l;
        if (c1074l != null) {
            Enumeration enumerationElements = c1074l.f2957l.elements();
            if (enumerationElements.hasMoreElements()) {
                sb.append("       Extensions: \n");
            }
            while (enumerationElements.hasMoreElements()) {
                Cfor cfor = (Cfor) enumerationElements.nextElement();
                C18229l c18229lVip = c1074l.vip(cfor);
                Cthrow cthrow = c18229lVip.f35733l;
                if (cthrow != null) {
                    Csynchronized csynchronized = new Csynchronized(cthrow.f36593l);
                    sb.append("                       critical(");
                    sb.append(c18229lVip.f35734l);
                    sb.append(") ");
                    try {
                        if (cfor.ad(C18229l.f35714l)) {
                            c9187l = C11144l.vip(csynchronized.ads());
                        } else {
                            if (cfor.ad(C18229l.f35725l)) {
                                Ccase ccaseAds = csynchronized.ads();
                                if (ccaseAds != null) {
                                    advert advertVarAppmetrica = advert.appmetrica(ccaseAds);
                                    c10361l = new C10361l();
                                    c10361l.f21158l = advertVarAppmetrica;
                                } else {
                                    c10361l = null;
                                }
                                sb.append(c10361l);
                            } else if (cfor.ad(InterfaceC4787l.yandex)) {
                                c9187l = new C8021l(advert.appmetrica(csynchronized.ads()));
                            } else if (cfor.ad(InterfaceC4787l.loadAd)) {
                                c9187l = new C9187l(C10604l.premium(csynchronized.ads()), 0);
                            } else if (cfor.ad(InterfaceC4787l.crashlytics)) {
                                c9187l = new C9187l(C10604l.premium(csynchronized.ads()), 1);
                            } else {
                                sb.append(cfor.inmobi());
                                sb.append(" value = ");
                                sb.append(AbstractC5006l.crashlytics(csynchronized.ads()));
                            }
                            sb.append(str);
                        }
                        sb.append(c9187l);
                        sb.append(str);
                    } catch (Exception unused) {
                        sb.append(cfor.inmobi());
                        sb.append(" value = ");
                        sb.append("*****");
                        sb.append(str);
                    }
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    Provider provider2 = provider;
                    return provider2 != null ? Signature.getInstance(str, provider2) : Signature.getInstance(str);
                }
            });
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: " + e.getMessage());
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CertificateImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }
}
