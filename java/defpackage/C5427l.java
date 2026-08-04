package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lؘؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5427l implements InterfaceC9124l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Date f11630l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Date f11631l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4640l f11632l;

    public C5427l(byte[] bArr) throws IOException {
        try {
            C4640l c4640lVip = C4640l.vip(new Csynchronized(new ByteArrayInputStream(bArr)).ads());
            this.f11632l = c4640lVip;
            try {
                this.f11630l = c4640lVip.f9442l.f19876l.f34141l.appmetrica();
                this.f11631l = c4640lVip.f9442l.f19876l.f34142l.appmetrica();
            } catch (ParseException unused) {
                C18262l.metrica("invalid data structure in certificate!");
                throw null;
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            C18262l.metrica(AbstractC5020l.ads(e2, new StringBuilder("exception decoding certificate structure: ")));
            throw null;
        }
    }

    public final C1442l amazon() {
        return new C1442l((Cclass) this.f11632l.f9442l.f19871l.billing());
    }

    public final HashSet crashlytics(boolean z) {
        C1074l c1074l = this.f11632l.f9442l.f19875l;
        if (c1074l == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationElements = c1074l.f2957l.elements();
        while (enumerationElements.hasMoreElements()) {
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            if (c1074l.vip(cfor).f35734l == z) {
                hashSet.add(cfor.inmobi());
            }
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC9124l)) {
            return false;
        }
        try {
            return Arrays.equals(this.f11632l.getEncoded(), ((C5427l) ((InterfaceC9124l) obj)).f11632l.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return crashlytics(true);
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        C18229l c18229lVip;
        C1074l c1074l = this.f11632l.f9442l.f19875l;
        if (c1074l != null && (c18229lVip = c1074l.vip(new Cfor(str))) != null) {
            try {
                return c18229lVip.f35733l.remoteconfig("DER");
            } catch (Exception e) {
                C18073l.license(AbstractC5020l.ads(e, new StringBuilder("error encoding ")));
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return crashlytics(false);
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        C1074l c1074l = this.f11632l.f9442l.f19875l;
        return c1074l != null && c1074l.tapsense();
    }

    public final int hashCode() {
        try {
            return AbstractC14024l.ads(this.f11632l.getEncoded());
        } catch (IOException unused) {
            return 0;
        }
    }

    public final C14901l[] loadAd(String str) {
        Cclass cclass = this.f11632l.f9442l.f19869l;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            C12978l c12978l = null;
            if (i == cclass.size()) {
                if (arrayList.size() == 0) {
                    return null;
                }
                return (C14901l[]) arrayList.toArray(new C14901l[arrayList.size()]);
            }
            applovin applovinVarMo173throws = cclass.mo173throws(i);
            C14901l c14901l = new C14901l();
            if (applovinVarMo173throws instanceof C12978l) {
                c12978l = (C12978l) applovinVarMo173throws;
            } else if (applovinVarMo173throws != null) {
                Cclass cclassInmobi = Cclass.inmobi(applovinVarMo173throws);
                C12978l c12978l2 = new C12978l();
                if (cclassInmobi.size() != 2) {
                    C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
                    return null;
                }
                c12978l2.f25436l = Cfor.m192throws(cclassInmobi.mo173throws(0));
                c12978l2.f25435l = Cinterface.applovin(cclassInmobi.mo173throws(1));
                c12978l = c12978l2;
            }
            c14901l.f29310l = c12978l;
            c12978l.getClass();
            if (new Cfor(c12978l.f25436l.inmobi()).inmobi().equals(str)) {
                arrayList.add(c14901l);
            }
            i++;
        }
    }

    public final C3079l purchase() {
        return new C3079l(this.f11632l.f9442l.f19868l);
    }

    public final void yandex(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        Date date2 = this.f11630l;
        if (date.after(date2)) {
            throw new CertificateExpiredException("certificate expired on " + date2);
        }
        Date date3 = this.f11631l;
        if (date.before(date3)) {
            throw new CertificateNotYetValidException("certificate not valid till " + date3);
        }
    }
}
