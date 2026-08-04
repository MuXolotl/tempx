package defpackage;

import org.bouncycastle.jce.provider.X509CertificateObject;

/* JADX INFO: renamed from: lؚّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7208l {
    public X509CertificateObject loadAd;
    public X509CertificateObject yandex;

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != null && (obj instanceof C7208l)) {
            C7208l c7208l = (C7208l) obj;
            X509CertificateObject x509CertificateObject = this.yandex;
            X509CertificateObject x509CertificateObject2 = c7208l.yandex;
            if (x509CertificateObject != null) {
                zEquals = x509CertificateObject.equals(x509CertificateObject2);
            } else {
                zEquals = x509CertificateObject2 == null;
            }
            X509CertificateObject x509CertificateObject3 = this.loadAd;
            X509CertificateObject x509CertificateObject4 = c7208l.loadAd;
            if (x509CertificateObject3 != null) {
                zEquals2 = x509CertificateObject3.equals(x509CertificateObject4);
            } else {
                zEquals2 = x509CertificateObject4 == null;
            }
            if (zEquals && zEquals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        X509CertificateObject x509CertificateObject = this.yandex;
        int iHashCode = x509CertificateObject != null ? (-1) ^ x509CertificateObject.hashCode() : -1;
        X509CertificateObject x509CertificateObject2 = this.loadAd;
        if (x509CertificateObject2 != null) {
            return x509CertificateObject2.hashCode() ^ (iHashCode * 17);
        }
        return iHashCode;
    }
}
