package defpackage;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Date;

/* JADX INFO: renamed from: lؒۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1405l {
    public final int amazon;
    public final PublicKey billing;
    public final CertPath crashlytics;
    public final Date loadAd;
    public final X509Certificate purchase;
    public final C5384l yandex;

    public C1405l(C5384l c5384l, Date date, CertPath certPath, int i, X509Certificate x509Certificate, PublicKey publicKey) {
        this.yandex = c5384l;
        this.loadAd = date;
        this.crashlytics = certPath;
        this.amazon = i;
        this.purchase = x509Certificate;
        this.billing = publicKey;
    }

    public final Date yandex() {
        return new Date(this.loadAd.getTime());
    }
}
