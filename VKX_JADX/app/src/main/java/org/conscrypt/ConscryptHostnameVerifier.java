package org.conscrypt;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public interface ConscryptHostnameVerifier {
    boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession);
}
