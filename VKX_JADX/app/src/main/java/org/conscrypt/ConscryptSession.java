package org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
interface ConscryptSession extends SSLSession {
    String getApplicationProtocol();

    @Override // javax.net.ssl.SSLSession
    X509Certificate[] getPeerCertificates();

    byte[] getPeerSignedCertificateTimestamp();

    String getRequestedServerName();

    List<byte[]> getStatusResponses();
}
