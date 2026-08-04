package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lؑٙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0403l implements InterfaceC11820l {
    public final Method loadAd;
    public final X509TrustManager yandex;

    public C0403l(X509TrustManager x509TrustManager, Method method) {
        this.yandex = x509TrustManager;
        this.loadAd = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0403l)) {
            return false;
        }
        C0403l c0403l = (C0403l) obj;
        return this.yandex.equals(c0403l.yandex) && this.loadAd.equals(c0403l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.yandex + ", findByIssuerAndSignatureMethod=" + this.loadAd + ')';
    }

    @Override // defpackage.InterfaceC11820l
    public final X509Certificate yandex(X509Certificate x509Certificate) {
        try {
            return ((TrustAnchor) this.loadAd.invoke(this.yandex, x509Certificate)).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }
}
