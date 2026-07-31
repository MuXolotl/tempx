package defpackage;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lٌٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15564l implements X509TrustManager {
    public final X509TrustManager loadAd;
    public final C5834l yandex;

    public C15564l(C5834l c5834l) {
        this.yandex = c5834l;
        AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
        AbstractC16844l.yandex.getClass();
        this.loadAd = AbstractC16844l.remoteconfig();
        AbstractC16844l.yandex.smaato(this);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.loadAd.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        List list = (List) this.yandex.invoke();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC8576l.yandex(x509Certificate, (X509Certificate) it.next())) {
                    return;
                }
            }
        }
        this.loadAd.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        Object[] array = ((Collection) this.yandex.invoke()).toArray(new X509Certificate[0]);
        X509Certificate[] acceptedIssuers = this.loadAd.getAcceptedIssuers();
        int length = array.length;
        int length2 = acceptedIssuers.length;
        Object[] objArrCopyOf = Arrays.copyOf(array, length + length2);
        System.arraycopy(acceptedIssuers, 0, objArrCopyOf, length, length2);
        return (X509Certificate[]) objArrCopyOf;
    }
}
