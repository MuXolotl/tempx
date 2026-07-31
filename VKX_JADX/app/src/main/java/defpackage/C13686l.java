package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lْۜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13686l extends AbstractC5711l {
    public final X509TrustManagerExtensions crashlytics;
    public final X509TrustManager loadAd;

    public C13686l(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.loadAd = x509TrustManager;
        this.crashlytics = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13686l) && ((C13686l) obj).loadAd == this.loadAd;
    }

    public final int hashCode() {
        return System.identityHashCode(this.loadAd);
    }

    @Override // defpackage.AbstractC5711l
    public final List yandex(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.crashlytics.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
