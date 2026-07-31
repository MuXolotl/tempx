package org.bouncycastle.jce.provider;

import androidx.car.app.model.Alert;
import defpackage.AbstractC5006l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C10361l;
import defpackage.C10604l;
import defpackage.C1074l;
import defpackage.C10754l;
import defpackage.C10818l;
import defpackage.C10915l;
import defpackage.C11144l;
import defpackage.C12378l;
import defpackage.C12541l;
import defpackage.C14998l;
import defpackage.C18229l;
import defpackage.C5836l;
import defpackage.C8021l;
import defpackage.C8339l;
import defpackage.C9187l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cdefault;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.Csynchronized;
import defpackage.Cthrow;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC4787l;
import defpackage.advert;
import defpackage.applovin;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
public class X509CertificateObject extends X509Certificate implements InterfaceC12233l {
    private InterfaceC12233l attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private C11144l basicConstraints;
    private C10818l c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(C10818l c10818l) throws CertificateParsingException {
        this.c = c10818l;
        try {
            byte[] extensionOctets = getExtensionOctets(c10818l, C18229l.f35714l);
            if (extensionOctets != null) {
                this.basicConstraints = C11144l.vip(Ccase.advert(extensionOctets));
            }
            try {
                byte[] extensionOctets2 = getExtensionOctets(c10818l, C18229l.f35725l);
                if (extensionOctets2 == null) {
                    this.keyUsage = null;
                    return;
                }
                advert advertVarAppmetrica = advert.appmetrica(Ccase.advert(extensionOctets2));
                byte[] bArrApplovin = advertVarAppmetrica.applovin();
                int length = (bArrApplovin.length * 8) - advertVarAppmetrica.firebase();
                int i = 9;
                if (length >= 9) {
                    i = length;
                }
                this.keyUsage = new boolean[i];
                for (int i2 = 0; i2 != length; i2++) {
                    this.keyUsage[i2] = (bArrApplovin[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                }
            } catch (Exception e) {
                C10754l.adcel(e, "cannot construct KeyUsage: ");
                throw null;
            }
        } catch (Exception e2) {
            C10754l.adcel(e2, "cannot construct BasicConstraints: ");
            throw null;
        }
    }

    private int calculateHashCode() {
        try {
            byte[] encoded = getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    private void checkSignature(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        C10818l c10818l = this.c;
        if (!isAlgIdEqual(c10818l.f21864l, c10818l.f21865l.f34979l)) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature, this.c.f21864l.f20786l);
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("certificate does not verify with supplied key");
        }
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

    private static byte[] getExtensionOctets(C10818l c10818l, Cfor cfor) {
        Cthrow cthrowMetrica = C1074l.metrica(c10818l.f21865l.f34982l, cfor);
        if (cthrowMetrica == null) {
            return null;
        }
        return cthrowMetrica.f36593l;
    }

    private boolean isAlgIdEqual(C10198l c10198l, C10198l c10198l2) {
        if (!c10198l.f20787l.ad(c10198l2.f20787l)) {
            return false;
        }
        applovin applovinVar = c10198l.f20786l;
        applovin applovinVar2 = c10198l2.f20786l;
        C14998l c14998l = C14998l.f29509l;
        if (applovinVar == null) {
            return applovinVar2 == null || applovinVar2.equals(c14998l);
        }
        if (applovinVar2 == null) {
            return applovinVar == null || applovinVar.equals(c14998l);
        }
        return applovinVar.equals(applovinVar2);
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

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC12233l
    public applovin getBagAttribute(Cfor cfor) {
        return this.attrCarrier.getBagAttribute(cfor);
    }

    @Override // defpackage.InterfaceC12233l
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
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

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.c.remoteconfig("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
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

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.f21865l.f34978l.getEncoded());
        } catch (IOException unused) {
            C8339l.smaato("can't encode issuer DN");
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.keyUsage;
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
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.c.f21865l.f34972l.appmetrica();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            String property2 = providers[i].getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.c.f21864l.f20787l.inmobi();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        applovin applovinVar = this.c.f21864l.f20786l;
        if (applovinVar != null) {
            try {
                return applovinVar.billing().remoteconfig("DER");
            } catch (IOException unused) {
            }
        }
        return null;
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

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.f21865l.f34973l.getEncoded());
        } catch (IOException unused) {
            C8339l.smaato("can't encode issuer DN");
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

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.c.f21865l.f34975l.m4585strictfp() + 1;
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
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
    public synchronized int hashCode() {
        try {
            if (!this.hashValueSet) {
                this.hashValue = calculateHashCode();
                this.hashValueSet = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hashValue;
    }

    @Override // defpackage.InterfaceC12233l
    public void setBagAttribute(Cfor cfor, applovin applovinVar) {
        this.attrCarrier.setBagAttribute(cfor, applovinVar);
    }

    @Override // defpackage.InterfaceC12233l
    public void setFriendlyName(String str) {
        this.attrCarrier.setFriendlyName(str);
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        Object c9187l;
        C10361l c10361l;
        StringBuilder sb = new StringBuilder("  [0]         Version: ");
        String str = AbstractC9008l.yandex;
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
        byte[] signature = getSignature();
        sb.append("            Signature: ");
        sb.append(new String(AbstractC8535l.amazon(0, 20, signature)));
        sb.append(str);
        int i = 20;
        while (i < signature.length) {
            int length = signature.length - 20;
            sb.append("                       ");
            sb.append(i < length ? new String(AbstractC8535l.amazon(i, 20, signature)) : new String(AbstractC8535l.amazon(i, signature.length - i, signature)));
            sb.append(str);
            i += 20;
        }
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
                                c9187l = new C8021l((advert) csynchronized.ads());
                            } else if (cfor.ad(InterfaceC4787l.loadAd)) {
                                c9187l = new C9187l((C10604l) csynchronized.ads(), 0);
                            } else if (cfor.ad(InterfaceC4787l.crashlytics)) {
                                c9187l = new C9187l((C10604l) csynchronized.ads(), 1);
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
                        sb.append(" value = *****");
                        sb.append(str);
                    }
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.c.f21864l);
        try {
            signature = Signature.getInstance(signatureName, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        String signatureName = X509SignatureUtil.getSignatureName(this.c.f21864l);
        checkSignature(publicKey, str != null ? Signature.getInstance(signatureName, str) : Signature.getInstance(signatureName));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        String signatureName = X509SignatureUtil.getSignatureName(this.c.f21864l);
        checkSignature(publicKey, provider != null ? Signature.getInstance(signatureName, provider) : Signature.getInstance(signatureName));
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }
}
