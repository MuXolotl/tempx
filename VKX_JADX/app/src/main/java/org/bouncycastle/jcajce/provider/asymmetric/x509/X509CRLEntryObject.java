package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC5006l;
import defpackage.AbstractC9008l;
import defpackage.C1074l;
import defpackage.C10915l;
import defpackage.C12378l;
import defpackage.C16457l;
import defpackage.C18229l;
import defpackage.C2795l;
import defpackage.C8953l;
import defpackage.C9018l;
import defpackage.Cfor;
import defpackage.Csynchronized;
import defpackage.Cthrow;
import defpackage.inmobi;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
class X509CRLEntryObject extends X509CRLEntry {
    private C16457l c;
    private C10915l certificateIssuer;
    private volatile int hashValue;
    private volatile boolean hashValueSet;

    public X509CRLEntryObject(C16457l c16457l, boolean z, C10915l c10915l) {
        this.c = c16457l;
        this.certificateIssuer = loadCertificateIssuer(z, c10915l);
    }

    private Set getExtensionOIDs(boolean z) {
        C1074l c1074lVip = this.c.vip();
        if (c1074lVip == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationElements = c1074lVip.f2957l.elements();
        while (enumerationElements.hasMoreElements()) {
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            if (z == c1074lVip.vip(cfor).f35734l) {
                hashSet.add(cfor.inmobi());
            }
        }
        return hashSet;
    }

    private C10915l loadCertificateIssuer(boolean z, C10915l c10915l) {
        if (!z) {
            return null;
        }
        Cthrow cthrowMetrica = C1074l.metrica(this.c.vip(), C18229l.f35726l);
        if (cthrowMetrica == null) {
            return c10915l;
        }
        try {
            for (C12378l c12378l : C9018l.vip(cthrowMetrica.f36593l).metrica()) {
                if (c12378l.f24469l == 4) {
                    return C10915l.metrica(c12378l.f24470l);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CRLEntryObject)) {
            return super.equals(this);
        }
        X509CRLEntryObject x509CRLEntryObject = (X509CRLEntryObject) obj;
        if (this.hashValueSet && x509CRLEntryObject.hashValueSet && this.hashValue != x509CRLEntryObject.hashValue) {
            return false;
        }
        return this.c.equals(x509CRLEntryObject.c);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.certificateIssuer == null) {
            return null;
        }
        try {
            return new X500Principal(this.certificateIssuer.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.c.remoteconfig("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return X509SignatureUtil.getExtensionValue(this.c.vip(), str);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return C2795l.metrica(this.c.f32178l.mo173throws(1)).vip();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.c.ads().appmetrica();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.c.vip() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        C1074l c1074lVip = this.c.vip();
        return c1074lVip != null && c1074lVip.tapsense();
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = super.hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        Object objVip;
        StringBuilder sb = new StringBuilder("      userCertificate: ");
        String str = AbstractC9008l.yandex;
        sb.append(getSerialNumber());
        sb.append(str);
        sb.append("       revocationDate: ");
        sb.append(getRevocationDate());
        sb.append(str);
        sb.append("       certificateIssuer: ");
        sb.append(getCertificateIssuer());
        sb.append(str);
        C1074l c1074lVip = this.c.vip();
        if (c1074lVip != null) {
            Enumeration enumerationElements = c1074lVip.f2957l.elements();
            if (enumerationElements.hasMoreElements()) {
                String str2 = "   crlEntryExtensions:";
                loop0: while (true) {
                    sb.append(str2);
                    while (true) {
                        sb.append(str);
                        while (true) {
                            if (!enumerationElements.hasMoreElements()) {
                                break loop0;
                            }
                            Cfor cfor = (Cfor) enumerationElements.nextElement();
                            C18229l c18229lVip = c1074lVip.vip(cfor);
                            Cthrow cthrow = c18229lVip.f35733l;
                            if (cthrow != null) {
                                Csynchronized csynchronized = new Csynchronized(cthrow.f36593l);
                                sb.append("                       critical(");
                                sb.append(c18229lVip.f35734l);
                                sb.append(") ");
                                try {
                                    if (cfor.ad(C18229l.f35727l)) {
                                        objVip = C8953l.vip(inmobi.applovin(csynchronized.ads()));
                                    } else {
                                        if (cfor.ad(C18229l.f35726l)) {
                                            sb.append("Certificate issuer: ");
                                            objVip = C9018l.vip(csynchronized.ads());
                                        } else {
                                            sb.append(cfor.inmobi());
                                            sb.append(" value = ");
                                            sb.append(AbstractC5006l.crashlytics(csynchronized.ads()));
                                        }
                                        sb.append(str);
                                    }
                                    sb.append(objVip);
                                    sb.append(str);
                                } catch (Exception unused) {
                                    sb.append(cfor.inmobi());
                                    str2 = " value = *****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public X509CRLEntryObject(C16457l c16457l) {
        this.c = c16457l;
        this.certificateIssuer = null;
    }
}
