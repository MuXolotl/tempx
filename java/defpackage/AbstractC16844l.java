package defpackage;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lٌٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16844l {
    public static final Logger loadAd;
    public static volatile AbstractC16844l yandex;

    static {
        try {
            for (Map.Entry entry : AbstractC18376l.loadAd.entrySet()) {
                AbstractC18376l.loadAd((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        AbstractC16844l c17600l = C17600l.purchase ? new C17600l() : null;
        if (c17600l == null) {
            c17600l = C7648l.purchase ? new C7648l() : null;
        }
        if (c17600l == null) {
            C8936l.admob(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            yandex = c17600l;
            loadAd = Logger.getLogger(C11610l.class.getName());
        }
    }

    public static X509TrustManager remoteconfig() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        C8936l.subs("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }

    public abstract boolean admob(String str);

    public abstract void amazon(SSLSocket sSLSocket, String str, List list);

    public abstract String billing(SSLSocket sSLSocket);

    public abstract AbstractC5711l crashlytics(X509TrustManager x509TrustManager);

    public abstract SSLContext firebase();

    public void isPro(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        subs(5, str, (Throwable) obj);
    }

    public Object mopub() {
        if (loadAd.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void purchase(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public final SSLSocketFactory smaato(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextFirebase = firebase();
            sSLContextFirebase.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextFirebase.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public abstract void subs(int i, String str, Throwable th);

    public final String toString() {
        return getClass().getSimpleName();
    }
}
