package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؕۚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3629l {
    public static final C8410l crashlytics = new C8410l();
    public static C11610l loadAd;
    public static C11610l yandex;

    public static C11610l yandex(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        C10094l c10094l = new C10094l();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c10094l.ad = AbstractC11432l.loadAd(15L, timeUnit);
        c10094l.isVip = AbstractC11432l.loadAd(45L, timeUnit);
        c10094l.advert = AbstractC11432l.loadAd(45L, timeUnit);
        c10094l.subs = false;
        c10094l.isPro = false;
        C8410l c8410l = crashlytics;
        C6121l c6121l = c8410l.billing;
        if (c6121l != c10094l.remoteconfig) {
            c10094l.applovin = null;
        }
        c10094l.remoteconfig = c6121l;
        C10685l c10685l = c8410l.mopub;
        if (c10685l != c10094l.vip) {
            c10094l.applovin = null;
        }
        c10094l.vip = c10685l;
        if (Build.VERSION.SDK_INT < 26) {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            X509Certificate[] acceptedIssuers = AbstractC13457l.yandex(null).getAcceptedIssuers();
            int length = acceptedIssuers.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                keyStore.setCertificateEntry("sys-" + i2, acceptedIssuers[i]);
                i++;
                i2++;
            }
            int[] iArr = {R.raw.isrg_root_x1, R.raw.isrg_root_x2, R.raw.isrg_root_ye, R.raw.isrg_root_yr, R.raw.ru_cacert_root};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 5) {
                int i5 = i4 + 1;
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(iArr[i3]);
                try {
                    keyStore.setCertificateEntry("bndl-" + i4, (X509Certificate) certificateFactory.generateCertificate(inputStreamOpenRawResource));
                    Unit unit = Unit.INSTANCE;
                    AbstractC7876l.loadAd(inputStreamOpenRawResource, null);
                    i3++;
                    i4 = i5;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC7876l.loadAd(inputStreamOpenRawResource, th);
                        throw th2;
                    }
                }
            }
            X509TrustManager x509TrustManagerYandex = AbstractC13457l.yandex(keyStore);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{x509TrustManagerYandex}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            if (!socketFactory.equals(c10094l.startapp) || !x509TrustManagerYandex.equals(c10094l.adcel)) {
                c10094l.applovin = null;
            }
            c10094l.startapp = socketFactory;
            AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
            c10094l.license = AbstractC16844l.yandex.crashlytics(x509TrustManagerYandex);
            c10094l.adcel = x509TrustManagerYandex;
            List listRemoteconfig = AbstractC14055l.remoteconfig(C4800l.purchase, C4800l.billing);
            if (!listRemoteconfig.equals(c10094l.ads)) {
                c10094l.applovin = null;
            }
            c10094l.ads = AbstractC11432l.isPro(listRemoteconfig);
        }
        c10094l.crashlytics.add(new C10108l(C6168l.f12985l));
        c10094l.crashlytics.add(new C11943l(4));
        c10094l.crashlytics.add(crashlytics.purchase);
        c10094l.crashlytics.add(new C6032l(new C6573l(24)));
        return new C11610l(c10094l);
    }
}
