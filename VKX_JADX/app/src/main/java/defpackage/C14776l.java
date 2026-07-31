package defpackage;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRL;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14776l implements InterfaceC0168l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f28866l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f28867l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final CRLSelector f28868l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f28869l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BigInteger f28870l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f28871l;

    public C14776l(C3558l c3558l) {
        this.f28868l = (CRLSelector) c3558l.f7488l;
        this.f28867l = c3558l.f7483l;
        this.f28866l = c3558l.f7487l;
        this.f28870l = (BigInteger) c3558l.f7485l;
        this.f28869l = (byte[]) c3558l.f7484l;
        this.f28871l = c3558l.f7486l;
    }

    @Override // defpackage.InterfaceC0168l
    /* JADX INFO: renamed from: match, reason: merged with bridge method [inline-methods] */
    public final boolean mopub(CRL crl) {
        boolean z = crl instanceof X509CRL;
        CRLSelector cRLSelector = this.f28868l;
        if (!z) {
            return cRLSelector.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C18229l.f35722l.inmobi());
            Cstrictfp cstrictfpPremium = extensionValue != null ? Cstrictfp.premium(Cthrow.premium(extensionValue).f36593l) : null;
            if (cstrictfpPremium == null) {
                if (this.f28867l) {
                    return false;
                }
            } else {
                if (this.f28866l) {
                    return false;
                }
                BigInteger bigInteger = this.f28870l;
                if (bigInteger != null && cstrictfpPremium.applovin().compareTo(bigInteger) == 1) {
                    return false;
                }
            }
            if (this.f28871l) {
                byte[] extensionValue2 = x509crl.getExtensionValue(C18229l.f35729l.inmobi());
                byte[] bArr = this.f28869l;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!Arrays.equals(extensionValue2, bArr)) {
                    return false;
                }
            }
            return cRLSelector.match(crl);
        } catch (Exception unused) {
            return false;
        }
    }

    public final Object clone() {
        return this;
    }
}
