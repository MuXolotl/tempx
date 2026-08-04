package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: lؘۛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5970l extends X509CertSelector implements InterfaceC0168l {
    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public final Object clone() {
        return (C5970l) super.clone();
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public final boolean match(Certificate certificate) {
        return mopub(certificate);
    }

    @Override // defpackage.InterfaceC0168l
    public final boolean mopub(Object obj) {
        if (obj instanceof X509Certificate) {
            return super.match((X509Certificate) obj);
        }
        return false;
    }
}
