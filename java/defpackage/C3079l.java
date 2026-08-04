package defpackage;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: lؔۨؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3079l implements CertSelector, InterfaceC0168l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cnative f6614l;

    public C3079l(C11388l c11388l) {
        this.f6614l = c11388l.f22967l;
    }

    public static boolean loadAd(X500Principal x500Principal, C9018l c9018l) {
        C12378l[] c12378lArrMetrica = c9018l.metrica();
        for (int i = 0; i != c12378lArrMetrica.length; i++) {
            C12378l c12378l = c12378lArrMetrica[i];
            if (c12378l.f24469l == 4) {
                try {
                    if (new X500Principal(c12378l.f24470l.billing().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CertSelector
    public final Object clone() {
        return new C3079l(C11388l.vip(this.f6614l));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3079l) {
            return this.f6614l.equals(((C3079l) obj).f6614l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6614l.hashCode();
    }

    @Override // java.security.cert.CertSelector
    public final boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        Cnative cnative = this.f6614l;
        if (!(cnative instanceof C2927l)) {
            return loadAd(x509Certificate.getSubjectX500Principal(), (C9018l) cnative);
        }
        C2927l c2927l = (C2927l) cnative;
        C7823l c7823l = c2927l.f6379l;
        if (c7823l != null) {
            return c7823l.f16348l.m4586throws(x509Certificate.getSerialNumber()) && loadAd(x509Certificate.getIssuerX500Principal(), c7823l.f16349l);
        }
        return loadAd(x509Certificate.getSubjectX500Principal(), c2927l.f6380l);
    }

    @Override // defpackage.InterfaceC0168l
    public final boolean mopub(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    public final Principal[] yandex() {
        Cnative cnative = this.f6614l;
        C12378l[] c12378lArrMetrica = (cnative instanceof C2927l ? ((C2927l) cnative).f6380l : (C9018l) cnative).metrica();
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
}
